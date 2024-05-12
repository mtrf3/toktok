package com.bytedance.bae;

import X.V0N;

/* loaded from: classes17.dex */
public class ByteAudioModeStrategyTable {
    public final Option btHeadset;
    public final Option buildIn;
    public final Option wiredHeadset;

    /* loaded from: classes17.dex */
    public static class Option {
        public Mode micOff;
        public Mode micOn;

        public int hashCode() {
            return this.micOff.hashCode() + (this.micOn.hashCode() * 31);
        }

        public Option() {
            Mode mode = Mode.Media;
            this.micOn = mode;
            this.micOff = mode;
        }

        public Option(Option option) {
            this.micOn = option.micOn;
            this.micOff = option.micOff;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Option option = (Option) obj;
            if (this.micOn == option.micOn && this.micOff == option.micOff) {
                return true;
            }
            return false;
        }

        public Option(Mode mode) {
            this.micOn = mode;
            this.micOff = mode;
        }

        public Option(Mode mode, Mode mode2) {
            this.micOn = mode;
            this.micOff = mode2;
        }
    }

    public int hashCode() {
        return this.btHeadset.hashCode() + ((this.wiredHeadset.hashCode() + (this.buildIn.hashCode() * 31)) * 31);
    }

    public ByteAudioModeStrategyTable() {
        Mode mode = Mode.Communication;
        Mode mode2 = Mode.Media;
        this.buildIn = new Option(mode, mode2);
        this.wiredHeadset = new Option(mode2, mode2);
        this.btHeadset = new Option(mode2, mode2);
    }

    /* loaded from: classes17.dex */
    public enum Mode {
        Media(0),
        Communication(1);

        public final int value;

        public static Mode valueOf(String str) {
            return (Mode) V0N.LJJJ(Mode.class, str);
        }

        Mode(int i) {
            this.value = i;
        }
    }

    public ByteAudioModeStrategyTable(ByteAudioModeStrategyTable byteAudioModeStrategyTable) {
        this.buildIn = new Option(byteAudioModeStrategyTable.buildIn);
        this.wiredHeadset = new Option(byteAudioModeStrategyTable.wiredHeadset);
        this.btHeadset = new Option(byteAudioModeStrategyTable.btHeadset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteAudioModeStrategyTable byteAudioModeStrategyTable = (ByteAudioModeStrategyTable) obj;
        if (!this.buildIn.equals(byteAudioModeStrategyTable.buildIn) || !this.wiredHeadset.equals(byteAudioModeStrategyTable.wiredHeadset)) {
            return false;
        }
        return this.btHeadset.equals(byteAudioModeStrategyTable.btHeadset);
    }

    public ByteAudioModeStrategyTable(Option option, Option option2, Option option3) {
        this.buildIn = option;
        this.wiredHeadset = option2;
        this.btHeadset = option3;
    }
}
