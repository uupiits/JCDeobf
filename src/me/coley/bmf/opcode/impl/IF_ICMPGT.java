package me.coley.bmf.opcode.impl;

import me.coley.bmf.opcode.AbstractJump;
import me.coley.bmf.opcode.Opcode;
import me.coley.bmf.opcode.OpcodeType;

public class IF_ICMPGT extends AbstractJump {
    public IF_ICMPGT(int jumpIndex) {
        super(OpcodeType.ARRAY, Opcode.IF_ICMPGT, jumpIndex);
    }
}
