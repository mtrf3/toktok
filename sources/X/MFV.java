package X;

import Y.ACListenerS44S0200000_9;
import Y.ARunnableS5S0201000_2;
import Y.IDCListenerS111S0200000_9;
import Y.IDCListenerS246S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.TCMInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class MFV extends AbstractC208468Gc {
    public static final Integer LLIIJI = -16777216;
    public static final Integer LLIIJLIL = 47;
    public final Context LJLJLJ;
    public final String LJLJLLL;
    public final TextView LJLL;
    public TextView LJLLI;
    public FrameLayout LJLLILLLL;
    public final ViewGroup LJLLJ;
    public TuxIconView LJLLL;
    public final TuxTextView LJLLLL;
    public TuxTextView LJLLLLLL;
    public TuxIconView LJLZ;
    public TuxIconView LJZ;
    public final ViewGroup LJZI;
    public final View LJZL;
    public final View LL;
    public View LLD;
    public final TextView LLF;
    public final InterfaceC207258Bl LLFF;
    public Drawable LLFFF;
    public final C07950Sx LLFII;
    public View LLFZ;
    public TuxTextView LLI;
    public TuxIconView LLIFFJFJJ;
    public String LLII;
    public boolean LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public Video LLIIIL;
    public final C8GV LLIIIZ;

    @Override // X.AbstractC208468Gc
    public final int[] P() {
        return J7H.LIZ(200);
    }

    @Override // X.AbstractC208468Gc
    public final void Q() {
        SmartImageView smartImageView;
        Activity LIZ = C27740Aue.LIZ(this.LJLJLJ);
        if (LIZ instanceof ActivityC45651qj) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) LIZ;
            if (C78897Uxp.LJJIIZ(activityC45651qj) && !LKR.LIZJ(activityC45651qj, "page_profile") && !LKR.LIZJ(activityC45651qj, "USER") && (smartImageView = this.LJLILLLLZI) != null) {
                smartImageView.LJFF();
            }
        }
    }

    public final void Y() {
        Bitmap.Config config;
        Aweme aweme = this.LJLIL;
        if (aweme == null) {
            C26335AVf.LJJIIZ("post_data_is_empty", null, null, null);
            return;
        }
        if (!aweme.isSharedStoryVisible()) {
            C111204Ya.LIZ(this.LJLILLLLZI);
            C26335AVf.LJJIIZ("is_shared_story_unvisible", null, null, null);
            return;
        }
        Video video = this.LJLIL.getVideo();
        if (video != null && video.isCallback()) {
            a0(video);
            return;
        }
        Aweme aweme2 = this.LJLIL;
        UrlModel LIZIZ = this.LLFII.LIZIZ(aweme2.getAid());
        if (LIZIZ == null || LIZIZ.getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) ListProtector.get(LIZIZ.getUrlList(), 0))) {
            a0(aweme2.getVideo());
            return;
        }
        if (C248339or.LIZ()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = null;
        }
        T(LIZIZ, "AwemeViewHolder", config, null);
    }

    public final Bitmap.Config c0() {
        Aweme aweme;
        if (C248339or.LIZ() || ((aweme = this.LJLIL) != null && aweme.getAwemeType() == 160)) {
            return Bitmap.Config.ARGB_8888;
        }
        return null;
    }

    @Override // X.MFR
    public final void LLZLLLL() {
        Y();
    }

    public final void a0(Video video) {
        boolean z;
        int i;
        if (video != null) {
            this.LLIIIL = video;
            if (!AbstractC208618Gr.M() && ((i = this.LLIIIJ) == 0 || i == 1 || i == 14)) {
                if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) ListProtector.get(video.getCover().getUrlList(), 0))) {
                    this.LJLILLLLZI.setImageResource(R.attr.cj);
                    C26335AVf.LJJIIZ("video_cover_data_is_null", video.getCover(), null, null);
                    return;
                } else {
                    T(video.getCover(), "AwemeViewHolder", c0(), this.LLIIIZ);
                    return;
                }
            }
            Bitmap.Config c0 = c0();
            if ((C33933DTl.LIZ & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (V(video, "AwemeViewHolder", c0, z)) {
                this.LJLJI = true;
                return;
            }
            if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) ListProtector.get(video.getCover().getUrlList(), 0))) {
                this.LJLILLLLZI.setImageResource(R.color.ao);
                C26335AVf.LJJIIZ("video_cover_data_is_null", video.getCover(), null, null);
                return;
            } else {
                T(video.getCover(), "AwemeViewHolder", c0(), this.LLIIIZ);
                return;
            }
        }
        C26335AVf.LJJIIZ("video_is_null", null, null, null);
    }

    public final void f0(int i) {
        if (i == 0) {
            TuxIconView tuxIconView = (TuxIconView) C0IF.LIZIZ(this.itemView, this.LJZ, R.id.n4d, R.id.ng5);
            this.LJZ = tuxIconView;
            tuxIconView.setIconRes(R.raw.icon_speaker_x_mark_ltr);
        }
        TuxIconView tuxIconView2 = this.LJZ;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(i);
        }
    }

    public final void g0(int i) {
        if (i == 0) {
            this.LJLLL = (TuxIconView) C0IF.LIZIZ(this.itemView, this.LJLLL, R.id.n6q, R.id.ng8);
        }
        TuxIconView tuxIconView = this.LJLLL;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(i);
        }
    }

    public final void h0(int i) {
        if (i == 0) {
            this.LJLLILLLL = (FrameLayout) C0IF.LIZIZ(this.itemView, this.LJLLILLLL, R.id.ddh, R.id.nf8);
        }
        FrameLayout frameLayout = this.LJLLILLLL;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
    }

    public final void i0(int i) {
        if (i == 0) {
            this.LJLLI = (TextView) C0IF.LIZIZ(this.itemView, this.LJLLI, R.id.m49, R.id.nfx);
        }
        TextView textView = this.LJLLI;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [X.8GV] */
    public MFV(View view, String str, MH9 mh9) {
        super(view);
        float f;
        this.LLFII = new C07950Sx(1);
        this.LLFZ = null;
        this.LLI = null;
        this.LLIFFJFJJ = null;
        this.LLII = "";
        this.LLIIII = false;
        this.LLIIIILZ = 0;
        this.LLIIIJ = 0;
        this.LLIIIL = null;
        W61 w61 = new W61() { // from class: X.8Gf
            @Override // X.W61
            public final void LIZ() {
                MFV.this.Q();
            }

            @Override // X.W61
            public final void LIZIZ() {
                MFV.this.getClass();
            }
        };
        this.LJLJLJ = view.getContext();
        view.addOnAttachStateChangeListener(new IDCListenerS246S0100000_9(this, 10));
        this.LJLJLLL = str;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bs8);
        this.LJLLJ = viewGroup;
        this.LJLILLLLZI = (SmartImageView) view.findViewById(R.id.cover);
        this.LJLLLL = (TuxTextView) view.findViewById(R.id.me4);
        TextView textView = (TextView) view.findViewById(R.id.moj);
        this.LJLL = textView;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.n66);
        this.LJZI = viewGroup2;
        this.LJZL = view.findViewById(R.id.geh);
        if (!((Boolean) C52317Kg5.LIZ.getValue()).booleanValue()) {
            this.LLF = (TextView) view.findViewById(R.id.l03);
            this.LJLLI = (TextView) view.findViewById(R.id.m49);
            this.LJLLILLLL = (FrameLayout) view.findViewById(R.id.ddh);
            this.LJLLL = (TuxIconView) view.findViewById(R.id.n6q);
            this.LJLZ = (TuxIconView) view.findViewById(R.id.n5r);
            this.LJZ = (TuxIconView) view.findViewById(R.id.n4d);
            this.LJLLLLLL = (TuxTextView) view.findViewById(R.id.ib_);
            this.LL = view.findViewById(R.id.kbx);
            view.findViewById(R.id.kbv);
            this.LLD = view.findViewById(R.id.n54);
            this.LLFZ = view.findViewById(R.id.fd0);
            this.LLI = (TuxTextView) view.findViewById(R.id.fd3);
            this.LLIFFJFJJ = (TuxIconView) view.findViewById(R.id.fd2);
        }
        InterfaceC207258Bl LJI = C8SG.LIZIZ.LJI(viewGroup);
        this.LLFF = LJI;
        LJI.LIZ(textView);
        C16880lQ.LJIIL(viewGroup, new ACListenerS44S0200000_9(this, mh9, 45));
        viewGroup.setOnLongClickListener(new IDCListenerS111S0200000_9(mh9, this, 1));
        this.LJLILLLLZI.setAnimationListener(w61);
        if (((Boolean) C26360AWe.LIZIZ.getValue()).booleanValue()) {
            int intValue = ((Number) C26360AWe.LIZ.getValue()).intValue();
            if (intValue != 2) {
                if (intValue != 3) {
                    f = 0.5f;
                } else {
                    f = 0.15f;
                }
            } else {
                f = 0.3f;
            }
            viewGroup2.setBackground(AnonymousClass949.LIZ(f, LLIIJI.intValue()));
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = C17N.LJIILL(LLIIJLIL.intValue());
            viewGroup2.setLayoutParams(layoutParams);
        }
        this.LJLJJLL = new C8GU(this);
        this.LLIIIZ = new SIR() { // from class: X.8GV
            @Override // X.SIR
            public final void LIZ(JSONObject jSONObject) {
            }

            @Override // X.SIR
            public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str2, boolean z) {
                UrlModel urlModel;
                if (!z) {
                    Video video = MFV.this.LLIIIL;
                    if (video != null) {
                        urlModel = video.getCover();
                    } else {
                        urlModel = null;
                    }
                    C26335AVf.LJJIIZ("video_cover_load_failed", urlModel, str2, jSONObject);
                }
            }
        };
    }

    public final void X(Aweme aweme, int i, boolean z, boolean z2, int i2, String str) {
        UserStory userStory;
        if (C54838Lfe.LJJ(aweme) && (userStory = aweme.getUserStory()) != null && !userStory.getStories().isEmpty()) {
            aweme = (Aweme) ListProtector.get(aweme.getUserStory().getStories(), 0);
        }
        if (aweme == null || this.LJLILLLLZI == null) {
            return;
        }
        this.LJLIL = aweme;
        this.LLII = str;
        this.LLIIII = z2;
        this.LLIIIILZ = i;
        this.LLIIIJ = i2;
        TextView textView = this.LLF;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TuxTextView tuxTextView = this.LJLLLLLL;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        this.LJZI.setVisibility(0);
        if (this.LJZL.getVisibility() == 0) {
            this.LJZL.setVisibility(8);
        }
        if (TextUtils.equals(aweme.getAid(), str) && !z2 && i2 == 0) {
            View LIZIZ = C0IF.LIZIZ(this.itemView, this.LLFZ, R.id.fd0, R.id.nfd);
            this.LLFZ = LIZIZ;
            if (this.LLI == null) {
                this.LLI = (TuxTextView) LIZIZ.findViewById(R.id.fd3);
            }
            if (this.LLIFFJFJJ == null) {
                this.LLIFFJFJJ = (TuxIconView) this.LLFZ.findViewById(R.id.fd2);
            }
            this.LLFZ.setVisibility(0);
            if (((Boolean) DWW.LIZIZ.getValue()).booleanValue()) {
                this.LLFZ.setBackgroundResource(R.color.c9);
                this.LLI.setTuxFont(62);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLIFFJFJJ.getLayoutParams();
                layoutParams.height = C17N.LJIILL(10.0d);
                layoutParams.width = C17N.LJIILL(8.0d);
                this.LLIFFJFJJ.setLayoutParams(layoutParams);
            }
            TuxTextView tuxTextView2 = this.LLI;
            tuxTextView2.post(new ARunnableS5S0201000_2(1, this, tuxTextView2, 5));
        } else {
            View view = this.LLFZ;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        if (this.LJLIL.isProhibited() && C227768wm.LJJIIJZLJL(this.LJLIL)) {
            TuxTextView tuxTextView3 = (TuxTextView) C0IF.LIZIZ(this.itemView, this.LJLLLLLL, R.id.ib_, R.id.nfn);
            this.LJLLLLLL = tuxTextView3;
            tuxTextView3.setVisibility(0);
            this.LJZI.setVisibility(8);
            this.LJZL.setVisibility(0);
            this.LJLLLLLL.setTuxFont(73);
            if (!TextUtils.isEmpty(this.LJLIL.getCoverNotice())) {
                this.LJLLLLLL.setText(this.LJLIL.getCoverNotice());
            } else {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("type", "cover_notice");
                c198517qh.LIZ.put("log_id", this.LJLIL.getRequestId());
                c198517qh.LIZ.put("item_id", this.LJLIL.getAid());
                C8HX.LIZIZ("notice_content_empty", "", c198517qh.LJ());
            }
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (aweme.getIsTop() == 1 && i2 == 0) {
            this.LJLL.setVisibility(0);
            this.LJLL.setText(this.LJLJLJ.getString(R.string.jm9));
            this.LJLL.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, this.LJLJLJ));
        } else {
            this.LJLL.setVisibility(8);
        }
        TCMInfo tcmInfo = aweme.getTcmInfo();
        if (tcmInfo != null && tcmInfo.getReviewStatus() != 0) {
            int LIZJ = TcmServiceImpl.LJIJI().LIZJ(Integer.valueOf(tcmInfo.getReviewStatus()));
            if (LIZJ != 0) {
                i0(0);
                this.LJLLI.setText(LIZJ);
                h0(0);
            }
        } else if (aweme.getCommerceVideoAuthInfo() != null && aweme.getCommerceVideoAuthInfo().getDarkPostStatus() == 1) {
            i0(0);
            this.LJLLI.setText(R.string.pev);
            h0(0);
        } else {
            i0(8);
            h0(8);
        }
        this.LLFF.LIZIZ(this.LJLIL);
        boolean booleanValue = SharePrefCache.inst().getIsPrivateAvailable().LIZ().booleanValue();
        if (aweme.isScheduleVideo()) {
            this.LJLLLL.setVisibility(0);
            Drawable LIZIZ2 = C04270Et.LIZIZ(this.LJLJLJ, R.drawable.aih);
            TuxTextView tuxTextView4 = this.LJLLLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setCompoundDrawablesRelativeWithIntrinsicBounds(LIZIZ2, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.LJLLLL.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(aweme.getScheduleTime() * 1000)));
            this.LJLLLL.setTuxFont(72);
        } else {
            long j = 0;
            if (z2 && i2 == 0) {
                this.LJLLLL.setVisibility(0);
                if (statistics != null) {
                    j = statistics.getPlayCount();
                }
                String LJJIIJ = C77123UOp.LJJIIJ(j);
                if (this.LLFFF == null) {
                    this.LLFFF = C04270Et.LIZIZ(this.LJLJLJ, R.drawable.byd);
                }
                TuxTextView tuxTextView5 = this.LJLLLL;
                Drawable drawable = this.LLFFF;
                if (tuxTextView5 != null) {
                    tuxTextView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                this.LJLLLL.setText(LJJIIJ);
                this.LJLLLL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, this.LJLJLJ));
                this.LJLLLL.setTuxFont(72);
            } else {
                if (statistics != null) {
                    j = statistics.getPlayCount();
                }
                String LJJIIJ2 = C77123UOp.LJJIIJ(j);
                this.LJLLLL.setVisibility(0);
                Drawable LIZIZ3 = C04270Et.LIZIZ(this.LJLJLJ, R.drawable.byd);
                TuxTextView tuxTextView6 = this.LJLLLL;
                if (tuxTextView6 != null) {
                    tuxTextView6.setCompoundDrawablesRelativeWithIntrinsicBounds(LIZIZ3, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                this.LJLLLL.setText(LJJIIJ2);
                this.LJLLLL.setTuxFont(72);
            }
        }
        if (aweme.isSubOnlyVideo()) {
            g0(0);
            this.LJLLL.setIconRes(R.raw.icon_star_ring);
        } else if (aweme.getStatus() == null) {
            g0(8);
        } else if (booleanValue && (((z2 && i2 == 0) || C78996UzQ.LJJIIZI(aweme)) && aweme.getStatus().getPrivateStatus() != 0)) {
            g0(0);
            if (aweme.getStatus().getPrivateStatus() == 1) {
                this.LJLLL.setIconRes(R.raw.icon_lock_small);
            } else if (aweme.getStatus().getPrivateStatus() == 2) {
                this.LJLLL.setIconRes(R.raw.icon_two_person);
            }
        } else {
            g0(8);
        }
        if (z2 && i2 == 0 && C78996UzQ.LJJIIZI(aweme)) {
            if (!C79004UzY.LJJIFFI(aweme.getGeofencingRegions())) {
                TuxIconView tuxIconView = (TuxIconView) C0IF.LIZIZ(this.itemView, this.LJLZ, R.id.n5r, R.id.ng7);
                this.LJLZ = tuxIconView;
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_scope);
                    this.LJLZ.setVisibility(0);
                }
            } else {
                TuxIconView tuxIconView2 = this.LJLZ;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(8);
                }
            }
        }
        if (this.LJZL.getVisibility() == 0) {
            f0(8);
        } else {
            TuxIconView tuxIconView3 = this.LJLLL;
            if (tuxIconView3 != null && tuxIconView3.getVisibility() == 0) {
                f0(8);
            } else {
                AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService().getClass();
                if (e1.LIZ(31744, "show_muted_tag_on_homepage_video_cover", true, false) && C220858ld.LJI(aweme) && this.LLIIII) {
                    this.LJLL.setVisibility(0);
                    this.LJLL.setText(this.LJLJLJ.getString(R.string.e09));
                    this.LJLL.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.d7, this.LJLJLJ));
                    f0(8);
                } else if (C220858ld.LJII(aweme)) {
                    f0(0);
                } else {
                    f0(8);
                }
                AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService().getClass();
                if (e1.LIZ(31744, "hide_muted_tag_on_profile_consumption", true, false) && !this.LLIIII) {
                    f0(8);
                }
            }
        }
        if (C63081OpJ.LJLJLLL(aweme)) {
            this.LJLLLL.setVisibility(4);
        }
        if (z) {
            Y();
            if (!((HashSet) MF1.LIZ().LIZ).contains(aweme.getAid())) {
                ((HashSet) MF1.LIZ().LIZ).add(aweme.getAid());
                MF1.LIZ();
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.LJLILLLLZI.setForeground(this.itemView.getContext().getDrawable(R.drawable.bx6));
            this.LJLILLLLZI.setForeground(this.itemView.getContext().getDrawable(R.drawable.bx6));
        } else {
            C7FA.LIZIZ(this.LJLILLLLZI);
            C7FA.LIZIZ(this.LJLILLLLZI);
        }
        if (C220858ld.LJIIIIZZ(this.LJLIL)) {
            View LIZIZ4 = C0IF.LIZIZ(this.itemView, this.LLD, R.id.n54, R.id.ng6);
            this.LLD = LIZIZ4;
            LIZIZ4.setVisibility(0);
        } else {
            View view2 = this.LLD;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        if (e1.LIZ(31744, "tcm_anchor_gecko_feed", true, false)) {
            TcmServiceImpl.LJIJI().LJIILL(aweme, "video");
        }
        C9AE.LIZ(this.LJLLJ, C9AC.STRONG_MASK, 0.0f);
    }
}
