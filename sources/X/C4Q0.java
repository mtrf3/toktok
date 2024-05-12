package X;

import Y.ACListenerS21S0100000_1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Q0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Q0 extends RecyclerView.ViewHolder implements C4QS {
    public static final /* synthetic */ int LJLJJL = 0;
    public SharePanelViewModel LJLIL;
    public final TuxIconView LJLILLLLZI;
    public IMContact LJLJI;
    public int LJLJJI;

    @Override // X.C4QS
    public final void onDetachedFromWindow() {
    }

    @Override // X.C4QS
    public final void onAttachedToWindow() {
        IMContact iMContact = this.LJLJI;
        if (iMContact != null) {
            C107234It.LJIIIIZZ(iMContact, this.LJLJJI, "row", this.LJLIL.LJLIL, false);
        }
    }

    public C4Q0(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        this.LJLIL = sharePanelViewModel;
        View findViewById = view.findViewById(R.id.bbv);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.civ)");
        TuxIconView tuxIconView = (TuxIconView) findViewById;
        this.LJLILLLLZI = tuxIconView;
        this.LJLJJI = -1;
        C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(this, 270));
        tuxIconView.setImportantForAccessibility(2);
    }
}
