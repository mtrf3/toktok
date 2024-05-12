package X;

import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget;

/* renamed from: X.4OC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OC extends AbstractC65781Prl implements InterfaceC88472Yns<C63120Opw, C76800UCe> {
    public final /* synthetic */ SharePanelWidget LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4OC(SharePanelWidget sharePanelWidget) {
        super(1);
        this.LJLIL = sharePanelWidget;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C63120Opw c63120Opw) {
        C63120Opw c63120Opw2 = c63120Opw;
        this.LJLIL.LJI(false);
        if (c63120Opw2 != null) {
            this.LJLIL.LJLILLLLZI.LIZIZ.extras.putBoolean("is_new_group", true);
            this.LJLIL.LIZIZ(C47261Igj.LJJIJIL(C3K0.LIZIZ(c63120Opw2)));
        }
        return C76800UCe.LIZ;
    }
}
