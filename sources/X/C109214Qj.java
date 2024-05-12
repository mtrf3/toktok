package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import kotlin.jvm.internal.AqS167S0100000_1;

/* renamed from: X.4Qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109214Qj extends RecyclerView.ViewHolder implements C4QS {
    public static final /* synthetic */ int LJLJI = 0;
    public final SharePanelViewModel LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.C4QS
    public final void onDetachedFromWindow() {
    }

    @Override // X.C4QS
    public final void onAttachedToWindow() {
        if (this.LJLILLLLZI) {
            return;
        }
        Aweme LJJJLL = C4LD.LIZ.LJJJLL(this.LJLIL.LJLIL);
        if (LJJJLL == null) {
            return;
        }
        C55723Ltv.LIZIZ.LJII().LJIIJ("share_to_story_show", LJJJLL, new AqS167S0100000_1(this, 499));
        this.LJLILLLLZI = true;
    }

    public C109214Qj(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        this.LJLIL = sharePanelViewModel;
    }
}
