package X;

import java.util.HashMap;

/* renamed from: X.Ihi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47322Ihi {
    public String LIZ;
    public String LIZIZ;
    public java.util.Map<String, Object> LIZJ;
    public java.util.Map<String, Object> LIZLLL;
    public float[] LJ;
    public byte[] LJFF;
    public Object LJI;
    public final int LJII;

    public C47322Ihi() {
        this(0);
    }

    public final java.util.Map<String, Object> LIZ() {
        java.util.Map<String, Object> map = this.LIZJ;
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(this.LJII);
        this.LIZJ = hashMap;
        return hashMap;
    }

    public final String toString() {
        int i;
        Integer num;
        Integer num2;
        StringBuilder sb = new StringBuilder("{");
        if (this.LIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("runKey:");
            LIZ.append(this.LIZ);
            sb.append(X1D.LIZIZ(LIZ));
        }
        if (this.LIZIZ != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(", enterType:");
            LIZ2.append(this.LIZIZ);
            LIZ2.append('}');
            sb.append(X1D.LIZIZ(LIZ2));
        }
        String str = null;
        if (this.LJ != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(", inputFloatArray.size:");
            float[] fArr = this.LJ;
            if (fArr != null) {
                num2 = Integer.valueOf(fArr.length);
            } else {
                num2 = null;
            }
            LIZ3.append(num2);
            sb.append(X1D.LIZIZ(LIZ3));
        }
        if (this.LJFF != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(", inputByteArray.size:");
            byte[] bArr = this.LJFF;
            if (bArr != null) {
                num = Integer.valueOf(bArr.length);
            } else {
                num = null;
            }
            LIZ4.append(num);
            sb.append(X1D.LIZIZ(LIZ4));
        }
        if (this.LJI != null) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(", inputExtObj:");
            Object obj = this.LJI;
            if (obj != null) {
                str = C16880lQ.LJLLJ(obj.getClass());
            }
            LIZ5.append(str);
            sb.append(X1D.LIZIZ(LIZ5));
        }
        int i2 = 0;
        if (this.LIZLLL != null) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append(", importantExtFeaturesMap:");
            java.util.Map<String, Object> map = this.LIZLLL;
            if (map != null) {
                i = map.size();
            } else {
                i = 0;
            }
            LIZ6.append(i);
            LIZ6.append('-');
            LIZ6.append(this.LIZLLL);
            sb.append(X1D.LIZIZ(LIZ6));
        }
        if (this.LIZJ != null) {
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append(", inputFeaturesMap:");
            java.util.Map<String, Object> map2 = this.LIZJ;
            if (map2 != null) {
                i2 = map2.size();
            }
            LIZ7.append(i2);
            LIZ7.append('-');
            LIZ7.append(this.LIZJ);
            sb.append(X1D.LIZIZ(LIZ7));
        }
        return C0EH.LIZJ(sb, "}", "sb.toString()");
    }

    public C47322Ihi(int i) {
        this.LJII = 128;
    }
}
