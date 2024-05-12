package X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Luz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55789Luz extends RecyclerView.ViewHolder implements MFR {
    public final MH9 LJLIL;
    public final SmartImageView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final SmartAvatarImageView LJLJJI;
    public final TuxTextView LJLJJL;
    public final TuxTextView LJLJJLL;
    public final RelativeLayout LJLJL;
    public Aweme LJLJLJ;

    @Override // X.MFR
    public final void LJJII(boolean z) {
    }

    @Override // X.MFR
    public final void LLLILZ() {
    }

    @Override // X.MFR
    public final void LLLLIILL() {
    }

    @Override // X.MFR
    public final boolean LLZZZZ() {
        return false;
    }

    @Override // X.MFR
    public final void d() {
    }

    @Override // X.MFR
    public final void setUserVisibleHint(boolean z) {
    }

    @Override // X.MFR
    public final void LLZLLLL() {
        UrlModel urlModel;
        Video video;
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            urlModel = video.getCover();
        } else {
            urlModel = null;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        int[] LIZ = J7H.LIZ(201);
        if (LIZ != null) {
            LJII.LJIILIIL(LIZ);
        }
        LJII.LJJIIJ = this.LJLILLLLZI;
        C16880lQ.LLJJJ(LJII);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55789Luz(View view, MH9 listener) {
        super(view);
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
        View findViewById = view.findViewById(R.id.d3w);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.fake_user_aweme_cover)");
        this.LJLILLLLZI = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.d3t);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…e_user_aweme_bottom_desc)");
        this.LJLJI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.d3y);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…fake_user_bottom_avartar)");
        this.LJLJJI = (SmartAvatarImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.d40);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.…ake_user_bottom_nickname)");
        this.LJLJJL = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.d3z);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…e_user_bottom_like_count)");
        this.LJLJJLL = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.d42);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…e_user_just_watched_mask)");
        this.LJLJL = (RelativeLayout) findViewById6;
    }
}
