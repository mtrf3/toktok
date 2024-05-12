package net.jpountz.lz4;

import X.KMP;
import X.V0N;

/* loaded from: classes15.dex */
public enum LZ4Utils {
    ;

    /* loaded from: classes15.dex */
    public static class Match {
        public int len;
        public int ref;
        public int start;

        public int end() {
            return this.start + this.len;
        }

        public void fix(int i) {
            this.start += i;
            this.ref += i;
            this.len -= i;
        }
    }

    public static int hash(int i) {
        return (i * (-1640531535)) >>> 20;
    }

    public static int hash64k(int i) {
        return (i * (-1640531535)) >>> 19;
    }

    public static int hashHC(int i) {
        return (i * (-1640531535)) >>> 17;
    }

    public static int maxCompressedLength(int i) {
        if (i >= 0) {
            if (i < 2113929216) {
                return (i / 255) + i + 16;
            }
            throw new IllegalArgumentException("length must be < 2113929216");
        }
        throw new IllegalArgumentException(KMP.LJ("length must be >= 0, got ", i));
    }

    public static LZ4Utils valueOf(String str) {
        return (LZ4Utils) V0N.LJJJ(LZ4Utils.class, str);
    }

    public static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }
}
