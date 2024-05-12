package X;

import Y.ACListenerS23S0100000_3;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8Gw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208668Gw extends AbstractC208678Gx {
    public final View LJLJLJ;
    public final String LJLJLLL;
    public final MH9 LJLL;
    public final TuxTextView LJLLI;
    public final TuxTextView LJLLILLLL;
    public final SmartAvatarImageView LJLLJ;
    public final TuxTextView LJLLL;
    public final FrameLayout LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    @Override // X.MFR
    public final void LLZLLLL() {
        Video video;
        Aweme aweme = this.LJLIL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            UrlModel cover = video.getCover();
            if (cover != null) {
                W5U.LJII(C78939UyV.LJ(cover)).LJIIIZ((C208698Gz) this.LJLLLLLL.getValue());
            }
            if (U(video, "DetailAwemeViewHolder")) {
                this.LJLJI = true;
                this.LJLILLLLZI.setAttached(true);
                this.LJLILLLLZI.LJ();
                return;
            }
            T(video.getCover(), "DetailAwemeViewHolder", null, null);
        }
    }

    @Override // X.AbstractC208678Gx
    public final void Y() {
        Video video;
        Aweme aweme = this.LJLIL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            UrlModel cover = video.getCover();
            if (cover != null) {
                W5U.LJII(C78939UyV.LJ(cover)).LJIIIZ((C208698Gz) this.LJLLLLLL.getValue());
            }
            if (C248339or.LIZ()) {
                if (V(video, "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888, false)) {
                    this.LJLJI = true;
                    this.LJLILLLLZI.setAttached(true);
                    this.LJLILLLLZI.LJ();
                    return;
                }
                T(video.getCover(), "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888, null);
                return;
            }
            if (U(video, "DetailAwemeViewHolder")) {
                this.LJLJI = true;
                this.LJLILLLLZI.setAttached(true);
                this.LJLILLLLZI.LJ();
                return;
            }
            T(video.getCover(), "DetailAwemeViewHolder", null, null);
        }
    }

    public C208668Gw(View view, String str, MH9 mh9) {
        super(view);
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.LJLJLJ = view;
        this.LJLJLLL = str;
        this.LJLL = mh9;
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1569));
        this.LJLILLLLZI = (SmartImageView) this.itemView.findViewById(R.id.cover);
        this.LJLLI = (TuxTextView) this.itemView.findViewById(R.id.gs6);
        this.LJLLILLLL = (TuxTextView) this.itemView.findViewById(R.id.gs7);
        this.LJLLJ = (SmartAvatarImageView) this.itemView.findViewById(R.id.grp);
        this.LJLLL = (TuxTextView) this.itemView.findViewById(R.id.grq);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.grr);
        this.LJLLLL = frameLayout;
        View findViewById = this.itemView.findViewById(R.id.gs5);
        int LJIILJJIL = C77119UOl.LJIILJJIL(view.getContext());
        int LJJIZ = LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(3, 0);
        int i = (((LJIILJJIL - LJJIZ) + 1) / LJJIZ) * 2;
        if (frameLayout != null && (layoutParams2 = frameLayout.getLayoutParams()) != null) {
            float f = i * 0.356f;
            layoutParams2.width = (int) f;
            layoutParams2.height = (int) (f / 0.75d);
        }
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            int i2 = (int) (i * 1.068f);
            layoutParams.width = i2;
            layoutParams.height = i2;
        }
        if (C90193gN.LIZ()) {
            double d = i;
            int i3 = -((int) (0.216d * d));
            int i4 = -((int) (d * 0.234d));
            if (findViewById != null) {
                C26338AVi.LJI(findViewById, Integer.valueOf(i3), Integer.valueOf(i4), 0, 0, false, 16);
            }
        } else {
            double d2 = i;
            int i5 = -((int) (0.16d * d2));
            int i6 = -((int) (d2 * 0.24d));
            if (findViewById != null) {
                C26338AVi.LJI(findViewById, Integer.valueOf(i5), Integer.valueOf(i6), 0, 0, false, 16);
            }
        }
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 265), this.itemView);
        this.LJLILLLLZI.setAnimationListener(this.LJLJL);
    }

    @Override // X.AbstractC208678Gx
    public final void X(Aweme aweme, int i, boolean z, Bundle bundle) {
        bind(aweme, i);
        this.LJLIL = aweme;
        if (aweme == null) {
            return;
        }
        if (z) {
            Y();
        }
        TuxTextView tuxTextView = this.LJLLILLLL;
        if (tuxTextView != null) {
            tuxTextView.setText(aweme.getDesc());
        }
        TuxTextView tuxTextView2 = this.LJLLL;
        if (tuxTextView2 != null) {
            User author = aweme.getAuthor();
            o.LJIIIIZZ(author, "data.author");
            tuxTextView2.setText(C56331M8x.LIZIZ(author, false, false));
        }
        SmartAvatarImageView smartAvatarImageView = this.LJLLJ;
        if (smartAvatarImageView != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(aweme.getAuthor().getAvatarThumb()));
            LJII.LJJIJIIJIL = true;
            LJII.LJJIIJ = smartAvatarImageView;
            C16880lQ.LLJJJ(LJII);
        }
    }
}
