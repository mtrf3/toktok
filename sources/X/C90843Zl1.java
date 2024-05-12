package X;

/* renamed from: X.Zl1, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90843Zl1 implements InterfaceC90536Zg4 {
    @Override // X.InterfaceC90536Zg4
    public final boolean LIZ(float[] fArr) {
        float f = fArr[2];
        if (f >= 0.95f || f <= 0.05f) {
            return false;
        }
        float f2 = fArr[0];
        if (f2 >= 10.0f && f2 <= 37.0f && fArr[1] <= 0.82f) {
            return false;
        }
        return true;
    }
}
