package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lho, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54972Lho {
    public final C51031K1b<C55017LiX> LIZ;
    public int LIZIZ;

    public final boolean LIZ() {
        if (C00F.LIZ(31744, 1, "opt_use_unreached_data_for_feed_refresh", false) > 0 && ((AbstractC51036K1g) this.LIZ.LJLIL).getItems() != null && this.LIZIZ < ((AbstractC51036K1g) this.LIZ.LJLIL).getItems().size() - 1) {
            return true;
        }
        return false;
    }

    public C54972Lho(C54980Lhw mPresenter) {
        o.LJIIIZ(mPresenter, "mPresenter");
        this.LIZ = mPresenter;
        ((C55017LiX) mPresenter.LJLIL).LJLJLJ = this;
    }
}
