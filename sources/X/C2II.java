package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2II, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2II {
    public final IDP LIZ;
    public final IDR LIZIZ;

    public final String LIZ() {
        C2MA curViewHolder = this.LIZIZ.getCurViewHolder();
        if (curViewHolder == null) {
            return "no story list viewholder";
        }
        if (C59542Vi.LIZ()) {
            return this.LIZ.LLIIJI(curViewHolder.getCurrentAweme(), false, curViewHolder, 0);
        }
        if (curViewHolder.Y6() == null) {
            return "no story viewholder";
        }
        return this.LIZ.LLIIJI(curViewHolder.Y6().getAweme(), false, curViewHolder.Y6(), 0);
    }

    public C2II(IDP playerController, IDR basePanel) {
        o.LJIIIZ(playerController, "playerController");
        o.LJIIIZ(basePanel, "basePanel");
        this.LIZ = playerController;
        this.LIZIZ = basePanel;
    }
}
