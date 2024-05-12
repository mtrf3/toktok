package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4O4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4O4 extends C78842Uww {
    public SharePanelWidget LJLILLLLZI;

    @Override // X.C78842Uww, X.C4RF
    public final void LJ() {
        SharePanelWidget sharePanelWidget = this.LJLILLLLZI;
        if (sharePanelWidget != null) {
            sharePanelWidget.LJIIJJI();
        }
    }

    @Override // X.C78842Uww, X.C4RF
    public final List<IMContact> LJFF() {
        SharePanelWidget sharePanelWidget = this.LJLILLLLZI;
        if (sharePanelWidget == null) {
            return null;
        }
        SharePanelViewModel sharePanelViewModel = sharePanelWidget.LJLJJL;
        if (sharePanelViewModel != null) {
            return ORZ.LLJILJILJ(sharePanelViewModel.LJIIIIZZ());
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // X.C78842Uww, X.C4RF
    public final View LJII() {
        SharePanelWidget sharePanelWidget = this.LJLILLLLZI;
        if (sharePanelWidget == null) {
            return null;
        }
        View view = sharePanelWidget.LJLJLLL;
        if (view != null) {
            return view;
        }
        o.LJIJI("editLayout");
        throw null;
    }

    @Override // X.C78842Uww, X.C4RF
    public final void LJIIIIZZ() {
        SharePanelWidget sharePanelWidget = this.LJLILLLLZI;
        if (sharePanelWidget != null) {
            sharePanelWidget.LJIIIZ();
        }
    }

    @Override // X.C78842Uww, X.C4RF
    public final void LJIIIZ() {
        SharePanelWidget sharePanelWidget = this.LJLILLLLZI;
        if (sharePanelWidget != null) {
            SharePanelViewModel sharePanelViewModel = sharePanelWidget.LJLJJL;
            if (sharePanelViewModel != null) {
                sharePanelViewModel.LJIIIIZZ().clear();
                C108484No c108484No = sharePanelWidget.LJZ;
                if (c108484No != null) {
                    C4O5 LIZIZ = c108484No.LIZIZ();
                    LIZIZ.LIZIZ().clear();
                    LIZIZ.LIZ().clear();
                    LIZIZ.LIZJ().clear();
                    c108484No.LIZJ();
                    return;
                }
                return;
            }
            o.LJIJI("viewModel");
            throw null;
        }
    }

    @Override // X.C78842Uww, X.C4RF
    public final void p6(boolean z) {
        SharePanelWidget sharePanelWidget = this.LJLILLLLZI;
        if (sharePanelWidget != null) {
            if (!z) {
                View view = sharePanelWidget.LJLJLLL;
                if (view != null) {
                    view.setVisibility(0);
                    sharePanelWidget.LJLILLLLZI.LJ.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("editLayout");
                    throw null;
                }
            }
            sharePanelWidget.LJLILLLLZI.LJ.setVisibility(8);
        }
    }

    public C4O4(C4OO c4oo, C4RD c4rd) {
        super(c4oo);
    }
}
