package X;

import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4Q3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Q3 extends RecyclerView.ViewHolder implements C4QS {
    public static final /* synthetic */ int LJLJJI = 0;
    public SharePanelViewModel LJLIL;
    public IMContact LJLILLLLZI;
    public int LJLJI;

    @Override // X.C4QS
    public final void onDetachedFromWindow() {
    }

    @Override // X.C4QS
    public final void onAttachedToWindow() {
        IMContact iMContact = this.LJLILLLLZI;
        if (iMContact != null) {
            C107234It.LJIIIIZZ(iMContact, this.LJLJI, "row", this.LJLIL.LJLIL, false);
        }
    }

    public C4Q3(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        this.LJLIL = sharePanelViewModel;
        this.LJLJI = -1;
        C16880lQ.LJIILJJIL((FrameLayout) view.findViewById(R.id.acg), new ACListenerS36S0200000_1(view, this, 90));
    }
}
