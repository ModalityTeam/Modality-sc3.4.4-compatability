+ SequenceableCollection {
	flopWith { |func|
		var maxsize = this.maxValue { |sublist|
			if(sublist.isSequenceableCollection) { sublist.size } { 1 }
		};

		^this.species.fill(maxsize, { |i|
			func.value( *this.collect { |sublist|
				if(sublist.isSequenceableCollection) {
					sublist.wrapAt(i)
				} {
					sublist
				}
			})
		})
	}
}
