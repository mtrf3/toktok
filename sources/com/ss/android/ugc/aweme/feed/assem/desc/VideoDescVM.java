package com.ss.android.ugc.aweme.feed.assem.desc;

import X.AnonymousClass629;
import X.AnonymousClass842;
import X.AnonymousClass848;
import X.AnonymousClass860;
import X.C05L;
import X.C0M6;
import X.C113554cx;
import X.C174826ta;
import X.C187677Yd;
import X.C187867Yw;
import X.C188727au;
import X.C198597qp;
import X.C1I1;
import X.C201487vU;
import X.C2054084i;
import X.C2058285y;
import X.C220488l2;
import X.C221108m2;
import X.C222578oP;
import X.C224888s8;
import X.C227768wm;
import X.C26227ARb;
import X.C2KM;
import X.C2NU;
import X.C2S6;
import X.C33Q;
import X.C36922EeM;
import X.C38987FRv;
import X.C42053Gev;
import X.C43I;
import X.C44847Hit;
import X.C52263KfD;
import X.C58704N2e;
import X.C61447O9r;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C73340SqO;
import X.C76V;
import X.C78685UuP;
import X.C83L;
import X.C83M;
import X.C83O;
import X.C83P;
import X.C83Q;
import X.C83R;
import X.C83S;
import X.C83T;
import X.C83X;
import X.C87O;
import X.C88545Yp3;
import X.C8P4;
import X.CK3;
import X.FMX;
import X.FRW;
import X.InterfaceC74236TBo;
import X.JHM;
import X.K02;
import X.LSC;
import X.NN1;
import X.OJY;
import X.ORZ;
import X.OSZ;
import X.Q7K;
import X.TBV;
import X.UC0;
import X.V0N;
import X.Y02;
import X.Y04;
import X.Y1Y;
import X.Z9N;
import X.ZJX;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl;
import com.ss.android.ugc.tiktok.addyours.service.IAddYoursService;
import com.zhiliaoapp.musically.R;
import defpackage.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes4.dex */
public final class VideoDescVM extends FeedBaseViewModel<C83X> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public int LJZI;
    public boolean LJZL;
    public int LL;
    public int LLD;
    public float LLFZ;
    public float LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public Y1Y LLIIII;
    public AnonymousClass860 LLIIIILZ;
    public C2054084i LLIIIJ;
    public final C87O LJLJLLL = new C87O(C83T.LJLIL);
    public final boolean LJLL = C61447O9r.LJIIIZ;
    public String LJLLLL = "click_hide";
    public String LJLLLLLL = "";
    public int LJLZ = C187867Yw.LIZ();
    public final C83O LJZ = C83O.SEE_MORE;
    public String LLF = "";
    public String LLFF = "";
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(C83S.LJLIL);
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(C83R.LJLIL);

    static {
        TBV tbv = new TBV(VideoDescVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIL = new InterfaceC74236TBo[]{tbv};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C83X(0);
    }

    public final Context getContext() {
        return (Context) this.LJLJLLL.LIZ(LLIIIL[0]);
    }

    public final boolean pv0() {
        String str;
        Aweme aweme;
        ClientText originalClientText;
        if (C83Q.LIZ != 1) {
            return false;
        }
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null && (originalClientText = aweme.getOriginalClientText()) != null) {
            str = originalClientText.getMarkupText();
        } else {
            str = null;
        }
        if (!C78685UuP.LJJJZ(str)) {
            return false;
        }
        return true;
    }

    public final boolean qv0() {
        VideoItemParams gv0;
        Aweme aweme;
        String contentDesc;
        if (!AnonymousClass842.LIZ() || (gv0 = gv0()) == null || (aweme = gv0.getAweme()) == null || (contentDesc = aweme.getContentDesc()) == null || contentDesc.length() == 0) {
            return false;
        }
        return true;
    }

    public final boolean rv0() {
        String desc;
        boolean z;
        boolean z2;
        String title;
        VideoItemParams gv0 = gv0();
        if (gv0 == null) {
            return false;
        }
        PhotoModeImageInfo photoModeImageInfo = gv0.getAweme().getPhotoModeImageInfo();
        if ((photoModeImageInfo == null || (title = photoModeImageInfo.getTitle()) == null || title.length() == 0) && ((desc = gv0.getAweme().getDesc()) == null || desc.length() == 0)) {
            z = true;
        } else {
            z = false;
        }
        if (((IMixFeedService) this.LLFFF.getValue()).LIZ(gv0.getAweme())) {
            Aweme aweme = gv0.getAweme();
            o.LJIIIIZZ(aweme, "item.aweme");
            if (C8P4.LIZ(aweme, gv0.baseFeedPageParams)) {
                z2 = true;
                if ((!z && !z2) || C63081OpJ.LJLJLLL(gv0.getAweme())) {
                    return false;
                }
                return true;
            }
        }
        z2 = false;
        if (!z) {
        }
        return true;
    }

    public final boolean sv0() {
        boolean z;
        boolean z2;
        Aweme aweme;
        Aweme aweme2;
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme2 = gv0.getAweme()) != null && aweme2.isAd()) {
            z = true;
        } else {
            z = false;
        }
        VideoItemParams gv02 = gv0();
        if (gv02 != null && (aweme = gv02.getAweme()) != null && aweme.isPhotoMode()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!((Boolean) C2058285y.LIZ.getValue()).booleanValue() || z || z2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uv0() {
        /*
            r6 = this;
            java.lang.Object r4 = r6.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r4 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r4
            r3 = 0
            r2 = 1
            if (r4 != 0) goto L3d
        La:
            java.lang.Object r0 = r6.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L36
            X.74R r5 = r0.mAdOpenCallBack
            if (r5 == 0) goto L36
            com.ss.android.ugc.aweme.ad.feed.IFeedAdService r1 = com.ss.android.ugc.aweme.ad.FeedAdServiceImpl.LJJIJLIJ()
            if (r1 != 0) goto L37
        L1c:
            X.V9W r4 = X.C73340SqO.LJIJI()
            android.content.Context r1 = r6.getContext()
            java.lang.Object r0 = r6.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L30
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.getAweme()
        L30:
            r4.getClass()
            X.NOE.LJJIIJ(r1, r3, r2, r5)
        L36:
            return
        L37:
            java.lang.String r0 = r6.LJLJI
            r1.setEnterFrom(r0)
            goto L1c
        L3d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            if (r0 == 0) goto L91
            boolean r0 = X.C63081OpJ.LJLJJL(r0)
            if (r0 != r2) goto L91
            r1 = 1
        L4a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            if (r0 == 0) goto L8e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L8e
        L5a:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.getAweme()
            r0 = 3
            boolean r0 = X.C59251NNf.LIZIZ(r0, r1)
            if (r0 == 0) goto La
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.getWebUrl()
        L73:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La
        L79:
            X.5S1 r1 = new X.5S1
            android.content.Context r0 = r6.getContext()
            r1.<init>(r0)
            r0 = 2131823164(0x7f110a3c, float:1.927912E38)
            r1.LIZJ(r0)
            r1.LJ()
            return
        L8c:
            r0 = r3
            goto L73
        L8e:
            if (r1 != 0) goto L79
            goto L5a
        L91:
            r1 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.uv0():void");
    }

    public final Map<String, String> nv0(VideoItemParams videoItemParams) {
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("group_id", videoItemParams.getAweme().getAid()), new OSZ("enter_from", videoItemParams.mEventType), new OSZ("is_feed_liked", String.valueOf(videoItemParams.getAweme().isLike())), new OSZ("is_feed_collected", String.valueOf(videoItemParams.getAweme().isCollected())), new OSZ("is_feed_comment_clicked", String.valueOf(videoItemParams.getAweme().isCommentClicked())), new OSZ("is_feed_forward_clicked", String.valueOf(videoItemParams.getAweme().isForwardClicked())));
        if (Z9N.LIZIZ.LJJIJLIJ(this.LJLJI)) {
            LJJLIIIIJ.put("is_from_video_fix", "1");
        }
        return LJJLIIIIJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C83X iv0(C83X c83x, VideoItemParams item) {
        String str;
        boolean z;
        Aweme aweme;
        C83X state = c83x;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        Context context = getContext();
        this.LJLZ = C187867Yw.LIZ();
        if (sv0()) {
            str = "        ";
        } else if (context == null || (str = context.getString(R.string.gdr)) == null) {
            str = "";
        }
        this.LJLLLLLL = str;
        boolean z2 = false;
        this.LJZI = 0;
        this.LJLLI = false;
        this.LLII = false;
        if (item.getAweme() != null && !TextUtils.isEmpty(item.getAweme().partN)) {
            z = true;
        } else {
            z = false;
        }
        if (rv0() || z || ((C52263KfD.LIZ() && (aweme = item.getAweme()) != null && Y04.LIZLLL(aweme) != null) || Y02.LJ(item.getAweme()))) {
            z2 = true;
        }
        return C83X.LIZ(state, new C43I(new SpannableStringBuilder()), new C43I(Boolean.valueOf(z2)), null, null, null, null, null, 402);
    }

    public final boolean ov0(TextExtraStruct textExtraStruct, String str) {
        int i;
        int i2;
        int i3;
        CharSequence foldedHashTagDesc;
        PhotoModeImageInfo photoModeImageInfo;
        String title;
        VideoItemParams gv0 = gv0();
        if (gv0 == null) {
            return false;
        }
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        Aweme aweme = gv0.getAweme();
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (title = photoModeImageInfo.getTitle()) != null) {
            i2 = title.length();
        } else {
            i2 = 0;
        }
        int max = Math.max(0, i + i2);
        if (gv0.getAweme() != null && ((IMixFeedService) this.LLFFF.getValue()).LIZ(gv0.getAweme())) {
            Aweme aweme2 = gv0.getAweme();
            o.LJIIIIZZ(aweme2, "item.aweme");
            if (C8P4.LIZ(aweme2, gv0.baseFeedPageParams)) {
                Aweme aweme3 = gv0.getAweme();
                if (aweme3 != null && (foldedHashTagDesc = aweme3.getFoldedHashTagDesc()) != null) {
                    i3 = foldedHashTagDesc.length();
                } else {
                    i3 = 0;
                }
                max = Math.max(max, i3);
            }
        }
        if (str == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > max || textExtraStruct.getStart() >= max || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    public final void tv0(TextExtraStruct textExtraStruct, Map<String, Object> map) {
        Context context;
        boolean z;
        String LJIILJJIL;
        C0M6<String, ZJX> c0m6;
        Object obj;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String aid;
        String LJIILL;
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (context = getContext()) != null && textExtraStruct != null) {
            String str5 = "";
            if (textExtraStruct.getType() == 1) {
                if (textExtraStruct.getSubtype() == 15) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("video_id", gv0.getAweme().getAid());
                    c188727au.LJIIIZ("challenge_id", textExtraStruct.getCid());
                    FMX.LJIIL("hashtag_removal_video_tag_click", c188727au.LIZ);
                    C26227ARb c26227ARb = new C26227ARb(context);
                    c26227ARb.LJ(R.string.h0m);
                    c26227ARb.LIZIZ(context.getString(R.string.h0l, textExtraStruct.getHashTagName()));
                    UC0.LIZJ(c26227ARb, new AqS107S0300000_3(gv0, textExtraStruct, context, 11));
                    c26227ARb.LJI().LIZLLL();
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LJIIIZ("video_id", gv0.getAweme().getAid());
                    c188727au2.LJIIIZ("challenge_id", textExtraStruct.getCid());
                    FMX.LJIIL("hashtag_removal_video_prompt_show", c188727au2.LIZ);
                    return;
                }
                ((ICommerceChallengeService) this.LLFII.getValue()).LJIIL(textExtraStruct);
                if (((ICommerceChallengeService) this.LLFII.getValue()).LJIJ(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false) != null) {
                    ((ICommerceChallengeService) this.LLFII.getValue()).LIZJ(gv0.mEventType, textExtraStruct.getHashTagName());
                }
                FMX.LJIIL("challenge_title_click", C113554cx.LJJLIIIIJ(new OSZ("enter_from", gv0.mEventType), new OSZ("author_id", gv0.getAweme().getAuthor().getUid()), new OSZ("group_id", gv0.getAweme().getAid()), new OSZ("impr_id", C227768wm.LJIILL(gv0.mPageType, gv0.getAweme())), new OSZ("tag_id", textExtraStruct.getCid()), new OSZ("is_from_video", "1")));
                if (!textExtraStruct.isCommerce()) {
                    Z9N z9n = Z9N.LIZIZ;
                    if (z9n.LLLLLLZ()) {
                        Map<String, String> LLJLLIL = z9n.LLJLLIL(gv0.mEventType, "");
                        if (C78685UuP.LJJJZ(LLJLLIL.get("search_id"))) {
                            LJIILL = LLJLLIL.get("search_id");
                        } else {
                            LJIILL = C227768wm.LJIILL(gv0.mPageType, gv0.getAweme());
                        }
                        z9n.LJLLLL(context, textExtraStruct.getHashTagName(), textExtraStruct.getCid(), true, nv0(gv0), mv0(LLJLLIL, gv0, LJIILL));
                        return;
                    }
                }
                String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
                if (MSAdaptionService.LJIIL().LIZIZ(context)) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(context, "//duo");
                    buildRoute.withParam("duo_type", "duo_challenge");
                    buildRoute.withParam("aweme_id", gv0.getAweme().getAid());
                    buildRoute.withParam("id", textExtraStruct.getCid());
                    buildRoute.withParam("extra_challenge_is_hashtag", true);
                    buildRoute.withParam("extra_challenge_from", gv0.mEventType);
                    buildRoute.open();
                } else {
                    FRW.LIZLLL("cd_start_activity_to_request_net_duration");
                    FRW.LIZLLL("cd_start_activity_to_show_header_duration");
                    FRW.LIZLLL("cd_start_activity_to_show_list_duration");
                    SmartRoute buildRoute2 = SmartRouter.buildRoute(context, "//challenge/detail");
                    buildRoute2.withParam("aweme_id", gv0.getAweme().getAid());
                    buildRoute2.withParam("id", textExtraStruct.getHashTagName());
                    buildRoute2.withParam("extra_challenge_is_hashtag", true);
                    buildRoute2.withParam("process_id", LIZ);
                    buildRoute2.withParam("extra_challenge_from", gv0.mEventType);
                    buildRoute2.open(10086);
                }
                MobClick obtain = MobClick.obtain();
                obtain.setEventName("challenge_click");
                obtain.setLabelName(gv0.mEventType);
                obtain.setValue(gv0.getAweme().getAid());
                obtain.setExtValueString(textExtraStruct.getCid());
                FMX.onEvent(obtain);
                OJY LJIL = C73340SqO.LJIL();
                Aweme aweme = gv0.getAweme();
                LJIL.getClass();
                NN1.LJJJJI(context, "challenge_click", aweme, NN1.LJIIIZ(context, aweme));
                C58704N2e.LIZLLL("draw_ad", "challenge_click", gv0.getAweme().getAwemeRawAd()).LJII();
                String searchResultId = C2S6.LIZ(context).getSearchResultId();
                if (TextUtils.isEmpty(searchResultId)) {
                    searchResultId = C227768wm.LIZIZ(gv0.getAweme());
                }
                if (gv0.getAweme().getBottomBarModel() != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                Map<String, String> LLJLLIL2 = Z9N.LIZIZ.LLJLLIL(gv0.mEventType, "");
                C220488l2 c220488l2 = C220488l2.LIZIZ;
                C201487vU c201487vU = new C201487vU();
                c201487vU.LIZLLL = gv0.mEventType;
                c201487vU.LJJIIZ(context);
                if (gv0.getAweme().getAuthor() != null) {
                    str5 = gv0.getAweme().getAuthor().getUid();
                }
                c201487vU.LJJLIIIJILLIZJL = str5;
                c201487vU.LJJLIIIJ = gv0.getAweme().getAid();
                c201487vU.LJJIIZI(gv0.getAweme());
                c201487vU.LJLIIIL = C2S6.LIZ(context).getPreviousPage();
                c201487vU.LJLIIL = C2S6.LIZ(context).getPreviousPagePosition();
                c201487vU.LJLIL = z7;
                c201487vU.LJJLIIIJLJLI = LIZ;
                c201487vU.LJIILLIIL = C227768wm.LJIIL(gv0.mPageType, gv0.getAweme());
                c201487vU.LJJLIIIJJI = textExtraStruct.getCid();
                c201487vU.LJJLI = "click_in_video_name";
                c201487vU.LJJIJ(C227768wm.LJIILL(gv0.mPageType, gv0.getAweme()));
                c201487vU.LJJIFFI = searchResultId;
                c201487vU.LJJIL = C2S6.LIZ(context).getSearchId();
                c201487vU.LJLJJI = C2S6.LIZ(context).getCategoryName();
                c201487vU.LJIJJLI(LLJLLIL2);
                c201487vU.LJJJZ = C2KM.LIZ(C2S6.LIZ(context).getPreviousPage(), C2S6.LIZ(context).getFromGroupId());
                if (C224888s8.LJ(gv0.mEventType)) {
                    c201487vU.LJJJJIZL = C224888s8.LIZJ();
                }
                if (!o.LJ(this.LJLJI, "from_music")) {
                    c201487vU.LJLJJLL = CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(context, gv0.getAweme());
                }
                c201487vU.LIZ(K02.LIZIZ("enter_tag_detail", gv0.getAweme(), gv0.mEventType));
                V0N.LJIIIZ(c201487vU, gv0.getAweme());
                Object LJII = c220488l2.LJII(gv0.getAweme(), c201487vU);
                C222578oP.LIZJ(LJII, gv0.getAweme(), null, null, 14);
                JHM jhm = (JHM) LJII;
                if (map != null) {
                    ((HashMap) jhm.LJIIL).putAll(map);
                }
                C198597qp LIZ2 = C76V.LIZ();
                Aweme aweme2 = gv0.getAweme();
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    LIZ2.getClass();
                } else {
                    C0M6<String, ZJX> c0m62 = LIZ2.LIZ;
                    if (c0m62 != null && c0m62.LIZIZ(aid) != null) {
                        jhm.LIZJ(0, "folded_tag_cnt");
                        jhm.LIZJ(0, "spammy_tag_cnt");
                        jhm.LIZJ(textExtraStruct.getEverFolded() ? 1 : 0, "is_folded_tag");
                    }
                }
                jhm.LJIILIIL();
                C38987FRv.LJI(LSC.CHALLENGE);
                return;
            }
            if (textExtraStruct.getType() == 0 && (!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype() || 7 == textExtraStruct.getSubtype() || textExtraStruct.getSubtype() == 5)) {
                Aweme aweme3 = gv0.getAweme();
                if (aweme3 != null) {
                    str = aweme3.getDesc();
                } else {
                    str = null;
                }
                if (ov0(textExtraStruct, str) && gv0.getAweme() != null && gv0.getAweme().getFoldedHashTagDesc().charAt(textExtraStruct.getStart()) == '@') {
                    if (2 == textExtraStruct.getSubtype() || 3 == textExtraStruct.getSubtype()) {
                        VideoReplyStruct videoReplyStruct = gv0.getAweme().getVideoReplyStruct();
                        if (videoReplyStruct == null) {
                            str2 = "";
                            str3 = "";
                            str4 = "";
                        } else {
                            if (videoReplyStruct.getAwemeId() == 0) {
                                str3 = "";
                            } else {
                                str3 = String.valueOf(videoReplyStruct.getAwemeId());
                            }
                            if (videoReplyStruct.getCommentId() == 0) {
                                str4 = "";
                            } else {
                                str4 = String.valueOf(videoReplyStruct.getCommentId());
                            }
                            str2 = videoReplyStruct.getAliasCommentId() != 0 ? String.valueOf(videoReplyStruct.getAliasCommentId()) : "";
                        }
                        if (2 == textExtraStruct.getSubtype()) {
                            C188727au c188727au3 = new C188727au();
                            c188727au3.LJI("enter_from", gv0.mEventType);
                            c188727au3.LJI("group_id", gv0.getAweme().getAid());
                            c188727au3.LJI("author_id", gv0.getAweme().getAuthorUid());
                            c188727au3.LJI("to_group_id", str3);
                            c188727au3.LJI("reply_comment_id", str4);
                            c188727au3.LJI("reply_user_id", textExtraStruct.getUserId());
                            FMX.LJIIL("click_comment_chain", c188727au3.LIZ);
                        }
                    } else {
                        if (gv0.getAweme().getAwemeType() == 51) {
                            C188727au c188727au4 = new C188727au();
                            c188727au4.LJI("enter_from", gv0.mEventType);
                            c188727au4.LJI("group_id", gv0.getAweme().getAid());
                            c188727au4.LJI("author_id", gv0.getAweme().getAuthorUid());
                            c188727au4.LJI("to_group_id", textExtraStruct.getAwemeId());
                            c188727au4.LJI("chain_type", "duet");
                            FMX.LJIIL("click_duet_icon", c188727au4.LIZ);
                        } else if (gv0.getAweme().getAwemeType() == 52) {
                            C188727au c188727au5 = new C188727au();
                            c188727au5.LJI("enter_from", gv0.mEventType);
                            c188727au5.LJI("group_id", gv0.getAweme().getAid());
                            c188727au5.LJI("author_id", gv0.getAweme().getAuthorUid());
                            c188727au5.LJI("to_group_id", textExtraStruct.getAwemeId());
                            FMX.LJIIL("click_react_icon", c188727au5.LIZ);
                        } else if (gv0.getAweme().getAwemeType() == 58) {
                            C188727au LIZ3 = CK3.LIZ("chain_type", "stitch");
                            LIZ3.LJI("enter_from", gv0.mEventType);
                            LIZ3.LJI("group_id", gv0.getAweme().getAid());
                            LIZ3.LJI("author_id", gv0.getAweme().getAuthorUid());
                            LIZ3.LJI("to_group_id", textExtraStruct.getAwemeId());
                            FMX.LJIIL("click_duet_icon", LIZ3.LIZ);
                        }
                        str2 = "";
                        str3 = "";
                        str4 = "";
                    }
                    try {
                        if (C2NU.LIZ.LIZIZ()) {
                            if (2 == textExtraStruct.getSubtype()) {
                                SmartRoute LIZ4 = m0.LIZ(context, "aweme://aweme/detail/", "id", str3, "refer", "click_comment_chain");
                                LIZ4.withParam("cid", str4 + ',' + str2);
                                LIZ4.withParam("video_from", gv0.mEventType);
                                LIZ4.open();
                                return;
                            }
                            if (4 == textExtraStruct.getSubtype()) {
                                C188727au c188727au6 = new C188727au();
                                c188727au6.LJI("enter_from", gv0.mEventType);
                                c188727au6.LJI("group_id", gv0.getAweme().getAid());
                                c188727au6.LJI("author_id", gv0.getAweme().getAuthorUid());
                                c188727au6.LJI("music_id", C227768wm.LJIIJJI(gv0.getAweme()));
                                c188727au6.LJI("anchor_type", "duet");
                                Map<String, String> map2 = c188727au6.LIZ;
                                o.LJIIIIZZ(map2, "newBuilder()\n           …               .builder()");
                                FMX.LJIIL("enter_anchor_detail", map2);
                                SmartRoute buildRoute3 = SmartRouter.buildRoute(context, "//duet/detail");
                                buildRoute3.withParam("id", gv0.getAweme().getAid());
                                buildRoute3.withParam("author_id", gv0.getAweme().getAuthorUid());
                                buildRoute3.withParam("origin_item_id", textExtraStruct.getAwemeId());
                                buildRoute3.withParam("anchor_event_map", new HashMap(map2));
                                buildRoute3.open();
                                return;
                            }
                            if (7 == textExtraStruct.getSubtype() || textExtraStruct.getSubtype() == 5) {
                                List<InteractStickerStruct> interactStickerStructs = gv0.getAweme().getInteractStickerStructs();
                                o.LJIIIIZZ(interactStickerStructs, "item.aweme.interactStickerStructs");
                                InteractStickerStruct interactStickerStruct = (InteractStickerStruct) ORZ.LJLLLL(interactStickerStructs);
                                if (interactStickerStruct == null || interactStickerStruct.getQaStruct() == null) {
                                    return;
                                }
                                IAddYoursService LJIJ = AddYoursServiceImpl.LJIJ();
                                Aweme aweme4 = gv0.getAweme();
                                o.LJIIIIZZ(aweme4, "item.aweme");
                                String str6 = gv0.mEventType;
                                o.LJIIIIZZ(str6, "item.eventType");
                                LJIJ.LJIIL(context, aweme4, textExtraStruct, str6);
                                return;
                            }
                            if (!C83M.LIZ()) {
                                SmartRoute buildRoute4 = SmartRouter.buildRoute(context, "//aweme/detail");
                                buildRoute4.withParam("id", textExtraStruct.getAwemeId());
                                if (!C83P.LIZ) {
                                    str5 = gv0.mEventType;
                                }
                                buildRoute4.withParam("refer", str5);
                                buildRoute4.withParam("isChain", true);
                                Aweme aweme5 = gv0.getAweme();
                                if (aweme5 != null && aweme5.getAwemeType() == 51) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                buildRoute4.withParam("is_from_duet_chain", z6);
                                buildRoute4.open();
                                return;
                            }
                            SmartRoute buildRoute5 = SmartRouter.buildRoute(context, "//aweme/detail");
                            buildRoute5.withParam("id", textExtraStruct.getAwemeId());
                            if (!C83P.LIZ) {
                                str5 = gv0.mEventType;
                            }
                            buildRoute5.withParam("refer", str5);
                            buildRoute5.withParam("isChain", true);
                            Aweme aweme6 = gv0.getAweme();
                            if (aweme6 != null && aweme6.getAwemeType() == 51) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            buildRoute5.withParam("is_from_duet_chain", z4);
                            Aweme aweme7 = gv0.getAweme();
                            if (aweme7 != null && aweme7.getAwemeType() == 58) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            buildRoute5.withParam("is_from_stitch_chain", z5);
                            buildRoute5.open();
                            C188727au c188727au7 = new C188727au();
                            c188727au7.LJI("enter_from", gv0.mEventType);
                            c188727au7.LJI("group_id", gv0.getAweme().getAid());
                            c188727au7.LJI("author_id", gv0.getAweme().getAuthorUid());
                            FMX.LJIIL("stitch_button_show", c188727au7.LIZ);
                            return;
                        }
                    } catch (Exception unused) {
                    }
                    C05L.LIZLLL(context, R.string.img);
                    return;
                }
            }
            if (textExtraStruct.getType() == 5) {
                C42053Gev c42053Gev = C42053Gev.LIZIZ;
                if (c42053Gev.LIZIZ(textExtraStruct.getSubtype()) && !TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                    if (C2NU.LIZ.LIZIZ()) {
                        C188727au c188727au8 = new C188727au();
                        c188727au8.LJIIIZ("enter_from", gv0.mEventType);
                        c188727au8.LJIIIZ("group_id", gv0.getAweme().getAid());
                        c188727au8.LJIIIZ("to_group_id", textExtraStruct.getAwemeId());
                        c188727au8.LJIIIZ("credit_item_category", c42053Gev.LJIIIZ(textExtraStruct.getSubtype()));
                        c188727au8.LJIIIZ("quote_type", "personal");
                        Map<String, String> map3 = C44847Hit.LIZIZ("click_quote_icon", c188727au8.LIZ, "is_from_add_video_chain", "1").LIZ;
                        SmartRoute buildRoute6 = SmartRouter.buildRoute(context, "//aweme/detail");
                        buildRoute6.withParam("id", textExtraStruct.getAwemeId());
                        buildRoute6.withParam("refer", gv0.mEventType);
                        buildRoute6.withParam("isChain", true);
                        if (gv0.getAweme().getAwemeType() == 51) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        buildRoute6.withParam("is_from_duet_chain", z2);
                        Aweme aweme8 = gv0.getAweme();
                        if (aweme8 != null && aweme8.getAwemeType() == 58) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        buildRoute6.withParam("is_from_stitch_chain", z3);
                        buildRoute6.withParam("feed_param_extra", new HashMap(map3));
                        buildRoute6.open();
                        return;
                    }
                    withState(new AqS169S0100000_3(this, 194));
                    return;
                }
            }
            int i = 101;
            if (textExtraStruct.getType() == 101) {
                C198597qp LIZ5 = C76V.LIZ();
                Aweme aweme9 = gv0.getAweme();
                String str7 = gv0.mEventType;
                LIZ5.getClass();
                if (Q7K.LIZIZ("fold_meaningless_hashtag_settings", 1) == 1 && C174826ta.LIZ() && aweme9 != null && aweme9.getAid() != null && (c0m6 = LIZ5.LIZ) != null && c0m6.LIZIZ(aweme9.getAid()) != null) {
                    C188727au c188727au9 = new C188727au();
                    c188727au9.LJIIIZ("enter_from", str7);
                    List<Integer> foldedTagsPos = textExtraStruct.getFoldedTagsPos();
                    if (foldedTagsPos != null) {
                        obj = Integer.valueOf(foldedTagsPos.size());
                    } else {
                        obj = null;
                    }
                    c188727au9.LJFF(obj, "tags_cnt");
                    c188727au9.LIZLLL(0, "folded_tag_cnt");
                    FMX.LJIIL("feed_caption_tag_unfold", c188727au9.LIZ);
                }
                AnonymousClass848 value = AnonymousClass848.LIZIZ.getValue();
                Aweme aweme10 = gv0.getAweme();
                value.getClass();
                if (aweme10 != null && aweme10.getFoldedTextExtra() != null && aweme10.getFoldedTextExtra().size() != 0 && textExtraStruct.getFoldedTagsPos() != null && textExtraStruct.getFoldedTagsPos().size() != 0) {
                    try {
                        int foldedTagIndex = textExtraStruct.getFoldedTagIndex();
                        if (foldedTagIndex >= 1 && foldedTagIndex <= aweme10.getFoldedTextExtra().size()) {
                            ArrayList arrayList = new ArrayList();
                            int size = aweme10.getFoldedTextExtra().size();
                            int i2 = 0;
                            int i3 = 0;
                            int i4 = 0;
                            while (i2 < size) {
                                Object obj2 = ListProtector.get(aweme10.getFoldedTextExtra(), i2);
                                o.LJIIIIZZ(obj2, "aweme.foldedTextExtra[i]");
                                TextExtraStruct textExtraStruct2 = (TextExtraStruct) obj2;
                                if (textExtraStruct2.getType() == i && textExtraStruct2.getFoldedTagIndex() == foldedTagIndex) {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    int size2 = textExtraStruct.getFoldedTagsPos().size();
                                    int i5 = 0;
                                    for (int i6 = 0; i6 < size2; i6++) {
                                        Integer originIndex = (Integer) ListProtector.get(textExtraStruct.getFoldedTagsPos(), i6);
                                        o.LJIIIIZZ(originIndex, "originIndex");
                                        if (originIndex.intValue() >= 0 && originIndex.intValue() < aweme10.getTextExtra().size()) {
                                            TextExtraStruct m142clone = ((TextExtraStruct) ListProtector.get(aweme10.getTextExtra(), originIndex.intValue())).m142clone();
                                            o.LJIIIIZZ(m142clone, "aweme.textExtra[originIndex].clone()");
                                            m142clone.setEverFolded(true);
                                            StringBuffer stringBuffer2 = new StringBuffer();
                                            if (i6 != 0) {
                                                if (i4 > 0) {
                                                    int start = m142clone.getStart() - i4;
                                                    int i7 = 1;
                                                    if (1 <= start) {
                                                        while (true) {
                                                            stringBuffer2.append(" ");
                                                            if (i7 == start) {
                                                                break;
                                                            } else {
                                                                i7++;
                                                            }
                                                        }
                                                    }
                                                    stringBuffer2.append("#");
                                                    stringBuffer2.append(m142clone.getHashTagName());
                                                    m142clone.setStart(textExtraStruct2.getStart() + i5 + start);
                                                }
                                            } else {
                                                stringBuffer2.append("#");
                                                stringBuffer2.append(m142clone.getHashTagName());
                                                m142clone.setStart(textExtraStruct2.getStart() + i5);
                                            }
                                            m142clone.setEnd(m142clone.getStart() + m142clone.getHashTagName().length() + 1);
                                            arrayList.add(m142clone);
                                            stringBuffer.append(stringBuffer2);
                                            i5 += stringBuffer2.length();
                                            if (i6 == textExtraStruct.getFoldedTagsPos().size() - 1) {
                                                i3 = stringBuffer.length() - 4;
                                                CharSequence foldedHashTagDesc = aweme10.getFoldedHashTagDesc();
                                                o.LJIIIIZZ(foldedHashTagDesc, "aweme.foldedHashTagDesc");
                                                aweme10.setFoldedHashTagDesc(s.LJLIL(foldedHashTagDesc, textExtraStruct2.getStart(), textExtraStruct2.getEnd(), stringBuffer));
                                            }
                                            i4 = m142clone.getEnd();
                                        }
                                    }
                                } else {
                                    textExtraStruct2.setStart(textExtraStruct2.getStart() + i3);
                                    textExtraStruct2.setEnd(textExtraStruct2.getEnd() + i3);
                                    arrayList.add(textExtraStruct2);
                                }
                                i2++;
                                i = 101;
                            }
                            aweme10.setFoldedTextExtra(arrayList);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        C36922EeM.LIZ(e);
                    }
                }
                gv0.setAweme(aweme10);
                setState(C83L.LJLIL);
                return;
            }
            FMX.LJIIIZ("name", "video_at", gv0.getAweme().getAid(), textExtraStruct.getUserId());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", "");
                jSONObject.put("request_id", gv0.mRequestId.get("request_id"));
                jSONObject.put("enter_from", gv0.mEventType);
                jSONObject.put("enter_method", "click_head");
            } catch (Exception unused2) {
            }
            if (gv0.getAweme().getAuthor() != null) {
                MobClick LIZLLL = C1I1.LIZLLL("enter_detail", "personal_homepage");
                LIZLLL.setValue(gv0.getAweme().getAuthor().getUid());
                LIZLLL.setJsonObject(jSONObject);
                FMX.onEvent(LIZLLL);
                String searchResultId2 = C2S6.LIZ(context).getSearchResultId();
                if (TextUtils.isEmpty(searchResultId2)) {
                    searchResultId2 = C227768wm.LIZIZ(gv0.getAweme());
                }
                C188727au c188727au10 = new C188727au();
                if (textExtraStruct.getSubtype() == 11) {
                    c188727au10.LJI("is_from_bc_video", "1");
                }
                C220488l2 c220488l22 = C220488l2.LIZIZ;
                c188727au10.LJI("enter_from", gv0.mEventType);
                c188727au10.LJI("to_user_id", textExtraStruct.getUserId());
                c188727au10.LJI("group_id", gv0.getAweme().getAid());
                c188727au10.LJI("author_id", gv0.getAweme().getAuthorUid());
                c188727au10.LJI("enter_method", "video_at");
                c188727au10.LJI("search_id", C2S6.LIZ(context).getSearchId());
                c188727au10.LJI("search_result_id", searchResultId2);
                c188727au10.LIZ("enter_personal_detail", gv0.getAweme(), gv0.mEventType);
                c188727au10.LIZLLL(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(context, gv0.getAweme()), "music_name");
                c188727au10.LIZLLL(gv0.getAweme().isPinnedByArtist() ? 1 : 0, "artist_label");
                Boolean isBehindTheSongVideoType = gv0.getAweme().getIsBehindTheSongVideoType();
                o.LJIIIIZZ(isBehindTheSongVideoType, "item.aweme.isBehindTheSongVideoType");
                c188727au10.LIZLLL(isBehindTheSongVideoType.booleanValue() ? 1 : 0, "bts_type");
                c188727au10.LJI("play_mode", C224888s8.LIZJ());
                C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
                if (c88545Yp3 != null) {
                    z = c88545Yp3.isConnected();
                } else {
                    z = false;
                }
                c188727au10.LJFF(Boolean.valueOf(z), "is_casting");
                if (c88545Yp3 != null && (LJIILJJIL = c88545Yp3.LJIILJJIL()) != null) {
                    str5 = LJIILJJIL;
                }
                c188727au10.LJI("casting_session_id", str5);
                Object LJII2 = c220488l22.LJII(gv0.getAweme(), c188727au10);
                C222578oP.LIZJ(LJII2, gv0.getAweme(), null, null, 14);
                FMX.LJIIL("enter_personal_detail", ((C188727au) LJII2).LIZ);
            }
            SmartRoute buildRoute7 = SmartRouter.buildRoute(context, "aweme://user/profile/");
            buildRoute7.withParam("uid", textExtraStruct.getUserId());
            buildRoute7.withParam("sec_user_id", textExtraStruct.getSecUid());
            buildRoute7.withParam("profile_from", "video_at");
            buildRoute7.withParam("enter_from", gv0.mEventType);
            buildRoute7.withParam("video_id", gv0.getAweme().getAid());
            buildRoute7.open();
        }
    }

    public static Map mv0(Map map, VideoItemParams videoItemParams, String str) {
        return C113554cx.LJJLIIIIJ(new OSZ("search_keyword", map.get("search_keyword")), new OSZ("search_id", map.get("search_id")), new OSZ("search_result_id", map.get("search_result_id")), new OSZ("rank", map.get("rank")), new OSZ("request_id", C227768wm.LJIILL(videoItemParams.mPageType, videoItemParams.getAweme())), new OSZ("group_id", videoItemParams.getAweme().getAid()), new OSZ("impr_id", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> lv0(java.lang.String r12, com.ss.android.ugc.aweme.ability.IPhotoModeAbility r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.lv0(java.lang.String, com.ss.android.ugc.aweme.ability.IPhotoModeAbility, java.lang.String):java.util.Map");
    }

    public static void kv0(VideoDescVM videoDescVM, C188727au c188727au, int i, Aweme aweme, int i2) {
        int i3;
        String str;
        PhotoModeImageInfo photoModeImageInfo;
        PhotoModeImageInfo photoModeImageInfo2;
        List<PhotoModeImageUrlModel> imageList;
        if ((i2 & 2) != 0) {
            i = -1;
        }
        String str2 = null;
        if ((i2 & 4) != 0) {
            VideoItemParams gv0 = videoDescVM.gv0();
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
        }
        videoDescVM.getClass();
        int i4 = 0;
        if (aweme != null && (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
            i3 = imageList.size();
        } else {
            i3 = 0;
        }
        c188727au.LIZLLL(i3, "pic_cnt");
        c188727au.LIZLLL(i + 1, "pic_location");
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && photoModeImageInfo.hasTitle()) {
            i4 = 1;
        }
        c188727au.LIZLLL(i4, "has_title");
        if (aweme != null) {
            str = C187677Yd.LIZ(aweme);
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            if (aweme != null) {
                str2 = C187677Yd.LIZ(aweme);
            }
            c188727au.LJI("photo_content_type", str2);
        }
    }
}
