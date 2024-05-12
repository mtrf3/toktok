package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4Q5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Q5 extends RecyclerView.ViewHolder implements C4QS {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public SharePanelViewModel LJLIL;

    @Override // X.C4QS
    public final void onDetachedFromWindow() {
    }

    @Override // X.C4QS
    public final void onAttachedToWindow() {
        C116484hg.LIZ("action_type", "show", "invite_on_share_panel");
    }

    public final void L(boolean z) {
        if (z) {
            this.itemView.findViewById(R.id.f51).setAlpha(1.0f);
            this.itemView.findViewById(R.id.mo6).setAlpha(1.0f);
        } else {
            this.itemView.findViewById(R.id.f51).setAlpha(0.34f);
            this.itemView.findViewById(R.id.mo6).setAlpha(0.34f);
        }
    }

    public C4Q5(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        this.LJLIL = sharePanelViewModel;
    }
}
