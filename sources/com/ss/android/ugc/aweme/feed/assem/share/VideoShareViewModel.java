package com.ss.android.ugc.aweme.feed.assem.share;

import X.ActivityC45651qj;
import X.AnonymousClass800;
import X.AnonymousClass801;
import X.AnonymousClass803;
import X.AnonymousClass804;
import X.AnonymousClass807;
import X.C00F;
import X.C04270Et;
import X.C16880lQ;
import X.C188587ag;
import X.C19N;
import X.C1A7;
import X.C200757uJ;
import X.C202677xP;
import X.C204237zv;
import X.C204277zz;
import X.C2068389v;
import X.C208088Eq;
import X.C209418Jt;
import X.C222578oP;
import X.C224878s7;
import X.C227768wm;
import X.C2304092m;
import X.C278817o;
import X.C32151Nz;
import X.C33Q;
import X.C3EL;
import X.C3EN;
import X.C43I;
import X.C44384HbQ;
import X.C45804HyK;
import X.C4LD;
import X.C51556KLg;
import X.C54838Lfe;
import X.C62066OXm;
import X.C62285OcT;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C77123UOp;
import X.C78840Uwu;
import X.C78996UzQ;
import X.C79004UzY;
import X.C80B;
import X.C80C;
import X.C80D;
import X.C80E;
import X.C80G;
import X.C80J;
import X.C80K;
import X.C80L;
import X.C80M;
import X.C80S;
import X.C80X;
import X.C84763XOl;
import X.C87O;
import X.C8D3;
import X.EF7;
import X.HG3;
import X.InterfaceC70422pa;
import X.InterfaceC74236TBo;
import X.KL2;
import X.KUN;
import X.LNH;
import X.LQA;
import X.O6R;
import X.ORY;
import X.OSZ;
import X.RBX;
import X.TBV;
import X.XKX;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS46S1200000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes4.dex */
public final class VideoShareViewModel extends FeedBaseViewModel<C204237zv> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public float LJLJLLL;
    public final C87O LJLL;
    public String LJLLI;
    public boolean LJLLILLLL;
    public OSZ<Boolean, String> LJLLJ;
    public volatile boolean LJLLL;
    public volatile boolean LJLLLL;
    public volatile boolean LJLLLLLL;
    public volatile boolean LJLZ;
    public long LJZ;

    static {
        TBV tbv = new TBV(VideoShareViewModel.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LJZI = new InterfaceC74236TBo[]{tbv};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C204237zv(null, 127);
    }

    public final Context getContext() {
        return (Context) this.LJLL.LIZ(LJZI[0]);
    }

    public final void mv0() {
        if (this.LJLLL) {
            this.LJLLL = false;
            setState(new AqS169S0100000_3(this, 674));
        }
        if (this.LJLLLL) {
            this.LJLLLL = false;
            setState(new AqS169S0100000_3(this, 674));
        }
        if (this.LJLLLLLL) {
            this.LJLLLLLL = false;
            setState(new AqS169S0100000_3(this, 674));
        }
        if (this.LJLZ) {
            this.LJLZ = false;
            setState(new AqS169S0100000_3(this, 674));
        }
    }

    public final void pv0() {
        VideoItemParams gv0;
        Aweme aweme;
        Activity activity;
        boolean z;
        User author;
        long[] typeLabels;
        if (C4LD.LIZIZ.LJJJJLL() || (gv0 = gv0()) == null || (aweme = gv0.getAweme()) == null) {
            return;
        }
        try {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            Context context = getContext();
            String str = null;
            if (context != null) {
                activity = C45804HyK.LJIJJ(context);
            } else {
                activity = null;
            }
            if (LJIIIIZZ != activity) {
                return;
            }
            Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
            o.LJII(LJIIIIZZ2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            Aweme LIZIZ = LNH.LIZIZ((ActivityC45651qj) LJIIIIZZ2);
            if (LIZIZ != null) {
                str = LIZIZ.getAid();
            }
            if (!TextUtils.equals(str, aweme.getAid()) || !C62066OXm.LIZ(getContext())) {
                return;
            }
            if (C2304092m.LIZ() && C54838Lfe.LJJI(aweme)) {
                z = true;
            } else {
                z = false;
            }
            if (C80S.LJFF(aweme) || C80S.LIZJ(aweme) || C80S.LJII(aweme) || z || !C4LD.LIZIZ.LJJJJ(aweme)) {
                return;
            }
            if (aweme.getAwemeType() != 56 && ((author = aweme.getAuthor()) == null || (typeLabels = author.getTypeLabels()) == null || !ORY.LJJIJIIJI(6737595547571456005L, typeLabels))) {
                List<TextExtraStruct> textExtra = aweme.getTextExtra();
                if (textExtra == null || textExtra.isEmpty()) {
                    return;
                }
                for (TextExtraStruct textExtraStruct : textExtra) {
                    String hashTagName = textExtraStruct.getHashTagName();
                    if (hashTagName != null && !ujb.o.LJJJJJL(hashTagName)) {
                        String hashTagName2 = textExtraStruct.getHashTagName();
                        o.LJIIIIZZ(hashTagName2, "textExtraStruct.hashTagName");
                        if (!s.LJJJLZIJ(hashTagName2, "status", false)) {
                            String hashTagName3 = textExtraStruct.getHashTagName();
                            o.LJIIIIZZ(hashTagName3, "textExtraStruct.hashTagName");
                            if (s.LJJJLZIJ(hashTagName3, "Status", false)) {
                            }
                        }
                    }
                }
                return;
            }
            C80M c80m = C80L.LIZ;
            if (c80m.LIZ.contains(aweme.getAid())) {
                return;
            }
            c80m.LIZ(aweme.getAid());
            AnonymousClass804.LIZ = "br_whatsapp";
            this.LJLLLL = true;
            int LIZ = C00F.LIZ(31744, 0, "interction_share_button_whatsapp_style", true);
            Context context2 = getContext();
            if (context2 != null) {
                C45804HyK.LJIJJ(context2);
            }
            if (C62066OXm.LIZIZ()) {
                if (LIZ != 1) {
                    if (LIZ != 2 || this.LJLLL) {
                        return;
                    }
                    this.LJLLL = true;
                    setState(C80G.LJLIL);
                    return;
                }
                wv0(1.02f, 0.95f);
                return;
            }
            setState(new AqS169S0100000_3(this, 675));
            if (LIZ != 1) {
                if (LIZ != 2) {
                    return;
                }
                wv0(1.05f, 0.9f);
                return;
            }
            wv0(1.02f, 0.95f);
        } catch (Exception unused) {
        }
    }

    public final void yv0() {
        Aweme aweme;
        boolean z;
        SharingOperationConfig LIZ;
        Integer num;
        if (this.LJLLL || C00F.LIZ(31744, 0, "interction_share_button_style", true) != 0) {
            return;
        }
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        if (!C4LD.LIZIZ.LJJJJ(aweme)) {
            return;
        }
        if (C2304092m.LIZ() && C54838Lfe.LJJI(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (C80S.LJFF(aweme) || C80S.LIZJ(aweme) || C80S.LJII(aweme) || z || C62066OXm.LIZ(getContext()) || C80S.LIZLLL(aweme) || C188587ag.LJ(aweme) || this.LJLLLL) {
            return;
        }
        if (AnonymousClass803.LIZ()) {
            int i = Integer.MAX_VALUE;
            if (C80X.LIZIZ(AnonymousClass804.LIZ, aweme, this) && (LIZ = C62285OcT.LIZ()) != null && (num = LIZ.operationIconMaxSwapTimes) != null) {
                int intValue = num.intValue();
                if (intValue < 0) {
                    intValue = Integer.MAX_VALUE;
                }
                C44384HbQ.LJIILLIIL();
                if (Keva.getRepo("share_campaign_guide_keva").getInt("share_campaign_guide_show_times", 0) < intValue) {
                    C44384HbQ.LJIILLIIL();
                    C19N.LIZJ(Keva.getRepo("share_campaign_guide_keva"), "share_campaign_guide_show_times", 0, 1, "share_campaign_guide_show_times");
                    Av0(aweme);
                    runOnUIThread(new AqS169S0100000_3(this, 670));
                    return;
                }
            }
            int i2 = 7;
            try {
                SettingsManager.LIZLLL().getClass();
                i2 = SettingsManager.LJ("new_share_guide_daily_flip_limit", 7);
            } catch (Throwable unused) {
            }
            if (i2 >= 0) {
                i = i2;
            }
            C44384HbQ.LJIILL();
            if (C1A7.LJIILIIL().LIZ(0, "share_guide_show_times") >= i || o.LJ(AnonymousClass804.LIZ, "play_3s")) {
                return;
            }
            C44384HbQ.LJIILL();
            KUN LJIILIIL = C1A7.LJIILIIL();
            LJIILIIL.LJ("share_guide_show_times", LJIILIIL.LIZ(0, "share_guide_show_times") + 1);
            if (TextUtils.equals(AnonymousClass804.LIZ, "promote")) {
                Av0(aweme);
                runOnUIThread(new AqS46S1200000_3(this, (Drawable) null, (String) null, 7));
                return;
            }
            Av0(aweme);
            C3EN c3en = new C3EN() { // from class: X.80F
                @Override // X.C3EN
                public final void LIZ() {
                    if (!C4LD.LIZIZ.LJJJJLL()) {
                        VideoShareViewModel videoShareViewModel = VideoShareViewModel.this;
                        videoShareViewModel.getClass();
                        videoShareViewModel.runOnUIThread(new AqS169S0100000_3(videoShareViewModel, 668));
                    }
                }

                @Override // X.C3EN
                public final void LIZIZ(String str, UrlModel urlModel) {
                    VideoShareViewModel videoShareViewModel = VideoShareViewModel.this;
                    videoShareViewModel.getClass();
                    videoShareViewModel.runOnUIThread(new AqS46S1200000_3(videoShareViewModel, urlModel, str, 5));
                }
            };
            InterfaceC70422pa scope = getAssemVMScope();
            o.LJIIIZ(scope, "scope");
            XKX.LIZLLL(scope, null, null, new C3EL(c3en, null), 3);
            return;
        }
        if (C4LD.LIZIZ.LJJJJLL()) {
            return;
        }
        Av0(aweme);
        runOnUIThread(new AqS169S0100000_3(this, 668));
    }

    public VideoShareViewModel() {
        int i;
        if (C202677xP.LIZIZ()) {
            i = 32;
        } else {
            i = 40;
        }
        this.LJLJLLL = i;
        this.LJLL = new C87O(C80K.LJLIL);
    }

    public final void qv0() {
        Aweme aweme;
        if (C2304092m.LIZ()) {
            VideoItemParams gv0 = gv0();
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
            if (C54838Lfe.LJJI(aweme)) {
                return;
            }
        }
        setState(C80D.LJLIL);
    }

    public final void zv0() {
        Aweme aweme;
        if (C2304092m.LIZ()) {
            VideoItemParams gv0 = gv0();
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
            if (C54838Lfe.LJJI(aweme)) {
                return;
            }
        }
        setState(C80E.LJLIL);
        this.LJLLLLLL = true;
    }

    public static AnonymousClass800 ov0(C204237zv c204237zv) {
        AnonymousClass800 anonymousClass800 = c204237zv.LJLJI;
        if (anonymousClass800 == null) {
            return new AnonymousClass800(null, null);
        }
        return anonymousClass800;
    }

    public final void Av0(Aweme aweme) {
        C80L.LIZ.LIZ(C227768wm.LIZIZ(aweme));
        this.LJLLLL = true;
        if (aweme != null) {
            aweme.setHighlighted(true);
        }
        if (C78996UzQ.LJJIIZI(aweme)) {
            setState(C80B.LJLIL);
        } else {
            setState(AnonymousClass807.LJLIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject nv0(Aweme aweme) {
        HashMap hashMap = new HashMap();
        C51556KLg.LIZ.getClass();
        Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(aweme, C51556KLg.LIZ().LJJIJIIJI(aweme.getAid()));
        if (!LJIIJJI.isEmpty()) {
            for (Map.Entry entry : LJIIJJI.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (o.LJ(this.LJLJI, "homepage_nearby")) {
            LQA.LIZIZ.LJII(this.LJLJI, hashMap, aweme, true);
            hashMap.put("follow_status", String.valueOf(aweme.getFollowStatus()));
            hashMap.put("enter_from", "homepage_nearby");
            String authorUid = aweme.getAuthorUid();
            o.LJIIIIZZ(authorUid, "aweme.authorUid");
            hashMap.put("author_id", authorUid);
            String groupId = aweme.getGroupId();
            o.LJIIIIZZ(groupId, "aweme.groupId");
            hashMap.put("group_id", groupId);
        }
        hashMap.put("aigc_theme_status", String.valueOf(aweme.aigcInfo.getAIGCLabelType()));
        return new JSONObject(hashMap);
    }

    public final C204237zv rv0(C204237zv c204237zv) {
        Aweme aweme;
        VideoItemParams gv0;
        Aweme aweme2;
        User author;
        String str;
        Aweme aweme3;
        User author2;
        Aweme aweme4;
        C204237zv c204237zv2 = c204237zv;
        if (C2304092m.LIZ()) {
            VideoItemParams gv02 = gv0();
            if (gv02 != null) {
                aweme4 = gv02.getAweme();
            } else {
                aweme4 = null;
            }
            if (C54838Lfe.LJJI(aweme4)) {
                return vv0(c204237zv2);
            }
        }
        VideoItemParams gv03 = gv0();
        if (gv03 != null && (aweme = gv03.getAweme()) != null && aweme.getAuthor() != null && (gv0 = gv0()) != null && (aweme2 = gv0.getAweme()) != null && (author = aweme2.getAuthor()) != null && author.getUid() != null) {
            IAccountUserService LJIILL = HG3.LJIILL();
            VideoItemParams gv04 = gv0();
            if (gv04 == null || (aweme3 = gv04.getAweme()) == null || (author2 = aweme3.getAuthor()) == null || (str = author2.getUid()) == null) {
                str = "";
            }
            if (((RBX) LJIILL).isMe(str)) {
                if (C80J.LIZ()) {
                    return tv0(c204237zv2);
                }
                Drawable LIZIZ = C04270Et.LIZIZ(EF7.LIZIZ(), R.drawable.bol);
                Context context = getContext();
                if (context != null && C202677xP.LIZIZ()) {
                    int LIZ = C278817o.LIZ(this.LJLJLLL);
                    int LIZ2 = C278817o.LIZ(this.LJLJLLL);
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_color_ellipsis_shadow_alt_1;
                    c2068389v.LIZIZ = LIZ;
                    c2068389v.LIZJ = LIZ2;
                    LIZIZ = c2068389v.LIZ(context);
                }
                return C204237zv.LIZ(c204237zv2, null, AnonymousClass800.LIZ(ov0(c204237zv2), LIZIZ, null, 2), null, null, null, null, 123);
            }
        }
        if (C62066OXm.LIZ(getContext())) {
            return sv0(c204237zv2);
        }
        if (C00F.LIZ(31744, 0, "interction_share_button_style", true) != 0 && !C4LD.LIZIZ.LJJJJLL()) {
            return xv0(c204237zv2);
        }
        try {
            c204237zv2 = tv0(c204237zv2);
            return c204237zv2;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return c204237zv2;
        }
    }

    public final C204237zv sv0(C204237zv c204237zv) {
        Context context = getContext();
        if (context != null && C45804HyK.LJIJJ(context) != null && C62066OXm.LIZIZ()) {
            return C204237zv.LIZ(c204237zv, null, AnonymousClass800.LIZ(ov0(c204237zv), C04270Et.LIZIZ(EF7.LIZIZ(), R.drawable.ain), null, 2), new C43I(Boolean.FALSE), null, null, null, 115);
        }
        return tv0(c204237zv);
    }

    public final C204237zv tv0(C204237zv c204237zv) {
        int LIZ = C278817o.LIZ(this.LJLJLLL);
        int LIZ2 = C278817o.LIZ(this.LJLJLLL);
        AnonymousClass801 anonymousClass801 = c204237zv.LJLJJLL;
        if (anonymousClass801 == null) {
            anonymousClass801 = new AnonymousClass801(0);
        }
        AnonymousClass801 anonymousClass8012 = new AnonymousClass801(anonymousClass801.LIZ, Float.valueOf(1.0f), anonymousClass801.LIZJ);
        ov0(c204237zv);
        return C204237zv.LIZ(c204237zv, null, new AnonymousClass800(C78840Uwu.LJIJI(LIZ, LIZ, EF7.LIZIZ()), new ViewGroup.LayoutParams(LIZ, LIZ2)), new C43I(Boolean.FALSE), null, anonymousClass8012, null, 83);
    }

    public final C204237zv uv0(C204237zv c204237zv) {
        User user;
        AwemeStatistics awemeStatistics;
        C204277zz c204277zz;
        Aweme aweme;
        float f;
        String charSequence;
        Resources resources;
        Aweme aweme2;
        Aweme aweme3;
        VideoItemParams gv0 = gv0();
        Aweme aweme4 = null;
        if (gv0 != null && (aweme3 = gv0.getAweme()) != null) {
            user = aweme3.getAuthor();
        } else {
            user = null;
        }
        VideoItemParams gv02 = gv0();
        if (gv02 != null && (aweme2 = gv02.getAweme()) != null) {
            awemeStatistics = aweme2.getStatistics();
        } else {
            awemeStatistics = null;
        }
        if (awemeStatistics != null && user != null) {
            if (!TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), user.getUid()) || C80J.LIZ() || (C79004UzY.LJJIJIIJI(getContext()) && C208088Eq.LIZ())) {
                if (C8D3.LIZJ()) {
                    f = 11.0f;
                } else {
                    f = 13.0f;
                }
                Float valueOf = Float.valueOf(f);
                CharSequence LJJIIJ = C77123UOp.LJJIIJ(awemeStatistics.getShareCount());
                if (TextUtils.equals(CardStruct.IStatusCode.DEFAULT, LJJIIJ) && getContext() != null) {
                    Context context = getContext();
                    if (context != null && (resources = context.getResources()) != null) {
                        LJJIIJ = resources.getText(R.string.tnq);
                    }
                    charSequence = null;
                    c204277zz = new C204277zz(valueOf, charSequence, true);
                }
                if (LJJIIJ != null) {
                    charSequence = LJJIIJ.toString();
                    c204277zz = new C204277zz(valueOf, charSequence, true);
                }
                charSequence = null;
                c204277zz = new C204277zz(valueOf, charSequence, true);
            } else {
                c204277zz = new C204277zz(null, 6);
            }
        } else {
            c204277zz = new C204277zz(Float.valueOf(10.0f), EF7.LIZIZ().getString(R.string.tnq), true);
        }
        if (C2304092m.LIZ()) {
            VideoItemParams gv03 = gv0();
            if (gv03 != null) {
                aweme = gv03.getAweme();
            } else {
                aweme = null;
            }
            if (C54838Lfe.LJJI(aweme)) {
                return C204237zv.LIZ(c204237zv, new C204277zz(null, 6), null, null, null, null, null, 125);
            }
        }
        VideoItemParams gv04 = gv0();
        if (gv04 != null) {
            aweme4 = gv04.getAweme();
        }
        if (C63081OpJ.LJLJLLL(aweme4)) {
            return C204237zv.LIZ(c204237zv, new C204277zz(c204277zz.LIZIZ, CardStruct.IStatusCode.DEFAULT, c204277zz.LIZ), null, null, null, null, null, 125);
        }
        return C204237zv.LIZ(c204237zv, c204277zz, null, null, null, null, null, 125);
    }

    public final C204237zv vv0(C204237zv c204237zv) {
        return C204237zv.LIZ(c204237zv, null, AnonymousClass800.LIZ(ov0(c204237zv), C78840Uwu.LJIJI(C278817o.LIZ(this.LJLJLLL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(this.LJLJLLL))), EF7.LIZIZ()), null, 2), null, null, null, null, 123);
    }

    public final C204237zv xv0(C204237zv c204237zv) {
        boolean z;
        Activity LJIJJ;
        Drawable LJIILJJIL;
        this.LJLLI = C4LD.LIZIZ.LJIJ();
        Context context = getContext();
        if (context != null) {
            z = C224878s7.LIZ(context, "com.whatsapp");
        } else {
            z = false;
        }
        if (this.LJLLI == null && z) {
            int LIZJ = (int) KL2.LIZJ(EF7.LIZIZ(), 36.0f);
            int LIZJ2 = (int) KL2.LIZJ(EF7.LIZIZ(), 36.0f);
            ov0(c204237zv);
            return C204237zv.LIZ(c204237zv, null, new AnonymousClass800(C04270Et.LIZIZ(EF7.LIZIZ(), R.drawable.ain), new ViewGroup.LayoutParams(LIZJ, LIZJ2)), null, null, null, null, 123);
        }
        int LIZ = C00F.LIZ(31744, 0, "interction_share_button_style", true);
        if (this.LJLLI != null && LIZ != 1) {
            Context context2 = getContext();
            if (context2 == null || (LJIJJ = C45804HyK.LJIJJ(context2)) == null || (LJIILJJIL = C4LD.LIZIZ.LJIILJJIL(LJIJJ, this.LJLLI)) == null) {
                return c204237zv;
            }
            int LIZJ3 = (int) KL2.LIZJ(getContext(), 36.0f);
            int LIZJ4 = (int) KL2.LIZJ(getContext(), 36.0f);
            ov0(c204237zv);
            return C204237zv.LIZ(c204237zv, null, new AnonymousClass800(LJIILJJIL, new ViewGroup.LayoutParams(LIZJ3, LIZJ4)), null, null, null, null, 123);
        }
        return tv0(c204237zv);
    }

    public static void kv0(Aweme aweme, C200757uJ c200757uJ) {
        List<PhotoModeImageUrlModel> imageList;
        if (aweme.getAwemeType() == 150) {
            c200757uJ.LIZJ(150, "aweme_type");
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                c200757uJ.LIZJ(imageList.size(), "pic_cnt");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C204237zv iv0(C204237zv state, VideoItemParams item) {
        VideoItemParams gv0;
        float f;
        VideoItemParams gv02;
        Aweme aweme;
        User author;
        float f2;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        Aweme aweme2 = item.getAweme();
        o.LJIIIIZZ(aweme2, "item.aweme");
        Context context = getContext();
        boolean z = false;
        if (context != null && C79004UzY.LJJIJIIJI(context)) {
            if (C209418Jt.LIZ(item.getAweme()).LIZ()) {
                f2 = 24.0f;
            } else {
                f2 = 32.0f;
            }
            this.LJLJLLL = f2;
        }
        int i = this.LJLILLLLZI;
        if ((aweme2.isCollected() && i == 2004) || !C80S.LJFF(aweme2) || ((gv0 = gv0()) != null && gv0.getAweme() != null && (gv02 = gv0()) != null && (aweme = gv02.getAweme()) != null && (author = aweme.getAuthor()) != null && TextUtils.equals(author.getUid(), ((RBX) HG3.LJIILL()).getCurUser().getUid()))) {
            f = 1.0f;
            z = true;
        } else {
            f = 0.5f;
        }
        return uv0(rv0(new C204237zv(new AnonymousClass801(true, Float.valueOf(f), z), 95)));
    }

    public final void wv0(float f, float f2) {
        if (this.LJLLL) {
            return;
        }
        this.LJLLL = true;
        setState(new C80C(this, f2, f));
    }

    public static void lv0(C200757uJ c200757uJ, Aweme aweme, String str, String str2) {
        C222578oP.LIZJ(c200757uJ, aweme, str, str2, 8);
        if (C54838Lfe.LJJI(aweme) && str != null) {
            c200757uJ.LIZLLL = str;
        }
    }
}
