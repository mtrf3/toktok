package com.bytedance.bae;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes2.dex */
public class ByteAudioStreamOption {
    public int key;
    public Object value;

    public void setValue(int i, Float f) {
    }

    public void setValue(int i, Long l) {
    }

    public static ByteAudioStreamOption create() {
        return new ByteAudioStreamOption();
    }

    public int getType() {
        return this.key;
    }

    public boolean boolValue(int i) {
        return Boolean.parseBoolean(this.value.toString());
    }

    public Float floatValue(int i) {
        return Float.valueOf(Float.NaN);
    }

    public int intValue(int i) {
        return CastIntegerProtector.parseInt(this.value.toString());
    }

    public Long longValue(int i) {
        return Long.MIN_VALUE;
    }

    public void nativeSetValue(int i, int i2) {
        boolean z;
        if (i == 20000 || i == 20003 || i == 20004 || i == 20005 || i == 20006 || i == 20008 || i == 20009 || i == 2) {
            setValue(i, new Integer(i2));
            return;
        }
        if (i != 10001 && i != 10002 && i != 20001 && i != 20002 && i != 20007 && i != 14) {
            return;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        setValue(i, Boolean.valueOf(z));
    }

    public void setValue(int i, Boolean bool) {
        this.value = bool;
        this.key = i;
    }

    public void setValue(int i, Integer num) {
        this.value = num;
        this.key = i;
    }
}
