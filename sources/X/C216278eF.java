package X;

import kotlin.jvm.internal.AqS1S0000001_3;

/* renamed from: X.8eF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216278eF {
    public int LIZ;
    public int LIZIZ;
    public float LIZJ = 1.0f;
    public final /* synthetic */ C216288eG LIZLLL;

    public C216278eF(C216288eG c216288eG) {
        this.LIZLLL = c216288eG;
    }

    public final void LIZ(float f) {
        if (this.LIZJ == f || f == 0.0f) {
            return;
        }
        this.LIZJ = f;
        this.LIZLLL.LIZIZ(new AqS1S0000001_3(f, 5));
        this.LIZLLL.LIZLLL();
    }
}
