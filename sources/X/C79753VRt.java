package X;

/* renamed from: X.VRt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79753VRt {
    public CharSequence LIZ;
    public final C79743VRj LIZIZ;

    public final int hashCode() {
        int hashCode;
        CharSequence charSequence = this.LIZ;
        int i = 0;
        if (charSequence == null) {
            hashCode = 0;
        } else {
            hashCode = charSequence.hashCode();
        }
        int i2 = hashCode * 31;
        C79743VRj c79743VRj = this.LIZIZ;
        if (c79743VRj != null) {
            i = c79743VRj.hashCode();
        }
        return i2 + i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C79753VRt)) {
            return false;
        }
        C79753VRt c79753VRt = (C79753VRt) obj;
        CharSequence charSequence = this.LIZ;
        if (charSequence == null) {
            if (c79753VRt.LIZ != null) {
                return false;
            }
        } else if (!charSequence.equals(c79753VRt.LIZ)) {
            return false;
        }
        C79743VRj c79743VRj = this.LIZIZ;
        if (c79743VRj == null) {
            if (c79753VRt.LIZIZ != null) {
                return false;
            }
        } else if (!c79743VRj.equals(c79753VRt.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C79753VRt(CharSequence charSequence, C79743VRj c79743VRj) {
        this.LIZ = charSequence;
        this.LIZIZ = c79743VRj;
    }
}
