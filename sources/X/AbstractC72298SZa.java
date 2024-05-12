package X;

import com.bytedance.ies.powerlist.page.PowerPageState;

/* renamed from: X.SZa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC72298SZa {
    public final SZP LIZ;
    public final SZP LIZIZ;
    public final PowerPageState LIZJ;

    public final boolean LIZ(SZP szp) {
        if (this.LIZ == szp || szp == SZP.Refresh) {
            return true;
        }
        return false;
    }

    public AbstractC72298SZa(SZP szp, SZP szp2, PowerPageState powerPageState) {
        this.LIZ = szp;
        this.LIZIZ = szp2;
        this.LIZJ = powerPageState;
    }
}
