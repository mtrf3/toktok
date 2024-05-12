package X;

/* renamed from: X.Qhb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67699Qhb {
    public int LIZ = 1;

    public final void LIZ(Object obj) {
        int hashCode;
        int i = this.LIZ * 31;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.LIZ = i + hashCode;
    }
}
