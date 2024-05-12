package X;

import android.widget.PopupWindow;

/* loaded from: classes16.dex */
public final class Y1G implements PopupWindow.OnDismissListener {
    public final /* synthetic */ AbstractC224038ql LJLIL;

    public Y1G(AbstractC224038ql abstractC224038ql) {
        this.LJLIL = abstractC224038ql;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        Y1Q y1q;
        AbstractC224038ql abstractC224038ql = this.LJLIL;
        C245649kW c245649kW = abstractC224038ql.LJLJJI;
        if (c245649kW != null && (y1q = c245649kW.LJIILJJIL) != null) {
            y1q.LIZIZ(abstractC224038ql.getStickerType(), false);
        }
    }
}
