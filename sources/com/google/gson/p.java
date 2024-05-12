package com.google.gson;

import X.C77119UOl;
import java.math.BigInteger;

/* loaded from: classes7.dex */
public final class p extends j {
    public static final Class<?>[] LJLILLLLZI = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    public Object LJLIL;

    @Override // com.google.gson.j
    public final j LIZJ() {
        return this;
    }

    @Override // com.google.gson.j
    public final boolean LJFF() {
        Object obj = this.LJLIL;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(LJJIFFI());
    }

    @Override // com.google.gson.j
    public final byte LJII() {
        if (this.LJLIL instanceof Number) {
            return LJIL().byteValue();
        }
        return Byte.parseByte(LJJIFFI());
    }

    @Override // com.google.gson.j
    public final double LJIIIZ() {
        if (this.LJLIL instanceof Number) {
            return LJIL().doubleValue();
        }
        return Double.parseDouble(LJJIFFI());
    }

    @Override // com.google.gson.j
    public final float LJIIJ() {
        if (this.LJLIL instanceof Number) {
            return LJIL().floatValue();
        }
        return Float.parseFloat(LJJIFFI());
    }

    @Override // com.google.gson.j
    public final int LJIILJJIL() {
        if (this.LJLIL instanceof Number) {
            return LJIL().intValue();
        }
        return Integer.parseInt(LJJIFFI());
    }

    @Override // com.google.gson.j
    public final long LJIJJLI() {
        if (this.LJLIL instanceof Number) {
            return LJIL().longValue();
        }
        return Long.parseLong(LJJIFFI());
    }

    @Override // com.google.gson.j
    public final Number LJIL() {
        Object obj = this.LJLIL;
        if (obj instanceof String) {
            return new com.google.gson.internal.l((String) obj);
        }
        return (Number) obj;
    }

    @Override // com.google.gson.j
    public final short LJJI() {
        if (this.LJLIL instanceof Number) {
            return LJIL().shortValue();
        }
        return Short.parseShort(LJJIFFI());
    }

    @Override // com.google.gson.j
    public final String LJJIFFI() {
        Object obj = this.LJLIL;
        if (obj instanceof Number) {
            return LJIL().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.LJLIL == null) {
            return 31;
        }
        if (LJJII(this)) {
            doubleToLongBits = LJIL().longValue();
        } else {
            Object obj = this.LJLIL;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(LJIL().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // com.google.gson.j
    public final char LJIIIIZZ() {
        return LJJIFFI().charAt(0);
    }

    public p(Boolean bool) {
        LJJIII(bool);
    }

    public static boolean LJJII(p pVar) {
        Object obj = pVar.LJLIL;
        if (!(obj instanceof Number)) {
            return false;
        }
        if (!(obj instanceof BigInteger) && !(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            return false;
        }
        return true;
    }

    public final void LJJIII(Object obj) {
        if (obj instanceof Character) {
            this.LJLIL = String.valueOf(((Character) obj).charValue());
            return;
        }
        boolean z = true;
        if (!(obj instanceof Number) && !(obj instanceof String)) {
            Class<?> cls = obj.getClass();
            Class<?>[] clsArr = LJLILLLLZI;
            int i = 0;
            while (true) {
                if (!clsArr[i].isAssignableFrom(cls)) {
                    i++;
                    if (i >= 16) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        C77119UOl.LIZJ(z);
        this.LJLIL = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.LJLIL == null) {
            if (pVar.LJLIL == null) {
                return true;
            }
            return false;
        }
        if (LJJII(this) && LJJII(pVar)) {
            if (LJIL().longValue() == pVar.LJIL().longValue()) {
                return true;
            }
            return false;
        }
        Object obj2 = this.LJLIL;
        if ((obj2 instanceof Number) && (pVar.LJLIL instanceof Number)) {
            double doubleValue = LJIL().doubleValue();
            double doubleValue2 = pVar.LJIL().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        }
        return obj2.equals(pVar.LJLIL);
    }

    public p(Character ch) {
        LJJIII(ch);
    }

    public p(Number number) {
        LJJIII(number);
    }

    public p(Object obj) {
        LJJIII(obj);
    }

    public p(String str) {
        LJJIII(str);
    }
}
