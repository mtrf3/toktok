package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.0Zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09790Zz {
    public boolean LIZ;
    public final C73318Sq2 LIZIZ;
    public DataChannel LIZJ;
    public C09800a0 LIZLLL;

    public AbstractC09790Zz() {
        this(0);
    }

    public abstract void LIZIZ();

    public AbstractC09790Zz(int i) {
        this.LIZ = false;
        this.LIZIZ = new C73318Sq2();
    }

    public final void LIZ(boolean z) {
        if (this.LIZ != z) {
            this.LIZ = z;
            C09800a0 c09800a0 = this.LIZLLL;
            if (c09800a0 != null) {
                c09800a0.LIZJ(z);
            }
        }
    }
}
