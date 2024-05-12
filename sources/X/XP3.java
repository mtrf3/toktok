package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes16.dex */
public final class XP3 extends XP1 implements Serializable, XS2 {
    public static final long serialVersionUID = 7249069246863182397L;

    @Override // X.XS2
    public final void LIZ() {
        add(1L);
    }

    public final long LJ() {
        long j = this.LJLILLLLZI;
        XP6[] xp6Arr = this.LJLIL;
        if (xp6Arr != null) {
            for (XP6 xp6 : xp6Arr) {
                if (xp6 != null) {
                    j += xp6.LIZ;
                }
            }
        }
        return j;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return LJ();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) LJ();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) LJ();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return LJ();
    }

    public final String toString() {
        return Long.toString(LJ());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.LJLJI = 0;
        this.LJLIL = null;
        this.LJLILLLLZI = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(LJ());
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x009e, code lost:
    
        if (r12.LJLIL != r6) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00a0, code lost:
    
        r2 = new X.XP6[r7 << 1];
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00a5, code lost:
    
        r2[r1] = r6[r1];
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00ab, code lost:
    
        if (r1 >= r7) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00ae, code lost:
    
        r12.LJLIL = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0034 A[SYNTHETIC] */
    @Override // X.XS2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(long r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XP3.add(long):void");
    }
}
