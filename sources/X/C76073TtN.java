package X;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TtN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76073TtN extends AbstractC76221Tvl<C76068TtI> {
    public final /* synthetic */ C76072TtM LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76073TtN(C76072TtM c76072TtM, View view) {
        super(view);
        this.LJLJL = c76072TtM;
    }

    @Override // X.AbstractC76213Tvd
    public final void L(int i, Object obj) {
        C76069TtJ data = (C76069TtJ) obj;
        o.LJIIIZ(data, "data");
        C2A7 LLLLLLLZIL = LLLLLLLZIL();
        if (LLLLLLLZIL != null) {
            C76072TtM c76072TtM = this.LJLJL;
            C75770ToU.LIZJ(LLLLLLLZIL, c76072TtM.LIZJ, c76072TtM.LIZLLL);
        }
        C76070TtK.LJJ(this, data);
    }

    @Override // X.AbstractC76213Tvd
    public final void M(int i, Object obj, List payloads) {
        C76069TtJ data = (C76069TtJ) obj;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        C2A7 LLLLLLLZIL = LLLLLLLZIL();
        if (LLLLLLLZIL != null) {
            C76072TtM c76072TtM = this.LJLJL;
            C75770ToU.LIZJ(LLLLLLLZIL, c76072TtM.LIZJ, c76072TtM.LIZLLL);
        }
        C76070TtK.LJJI(this, data, i, payloads);
    }
}
