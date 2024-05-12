package com.google.gson.internal;

import java.math.BigDecimal;

/* loaded from: classes7.dex */
public final class l extends Number {
    public final String LJLIL;

    private Object writeReplace() {
        return new BigDecimal(this.LJLIL);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.LJLIL);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.LJLIL);
    }

    public int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.LJLIL);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.LJLIL);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.LJLIL).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.LJLIL);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.LJLIL).longValue();
        }
    }

    public String toString() {
        return this.LJLIL;
    }

    public l(String str) {
        this.LJLIL = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        String str = this.LJLIL;
        String str2 = ((l) obj).LJLIL;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }
}
