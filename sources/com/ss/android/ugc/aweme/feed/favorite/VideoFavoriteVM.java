package com.ss.android.ugc.aweme.feed.favorite;

import X.AKT;
import X.ActivityC45651qj;
import X.AnonymousClass114;
import X.AnonymousClass636;
import X.C113554cx;
import X.C176276vv;
import X.C187677Yd;
import X.C188727au;
import X.C200647u8;
import X.C203577yr;
import X.C2061087a;
import X.C2062387n;
import X.C2063087u;
import X.C2063187v;
import X.C220488l2;
import X.C221108m2;
import X.C222578oP;
import X.C224888s8;
import X.C227768wm;
import X.C2S6;
import X.C30581Hy;
import X.C33Q;
import X.C3A5;
import X.C40883G2t;
import X.C45804HyK;
import X.C48203Ivv;
import X.C51556KLg;
import X.C52535Kjb;
import X.C55511LqV;
import X.C57258Mda;
import X.C58704N2e;
import X.C5S1;
import X.C62822Ol8;
import X.C62992db;
import X.C63081OpJ;
import X.C64512g3;
import X.C65352Pkq;
import X.C77123UOp;
import X.C78609UtB;
import X.C78685UuP;
import X.C79004UzY;
import X.C87O;
import X.C87P;
import X.C87Q;
import X.C87R;
import X.C87S;
import X.C87T;
import X.C87V;
import X.E52;
import X.FMX;
import X.HG3;
import X.InterfaceC213128Ya;
import X.InterfaceC74236TBo;
import X.J9P;
import X.LQA;
import X.OSZ;
import X.RBX;
import X.TBV;
import X.V0N;
import X.XKX;
import X.Z9N;
import Y.ACListenerS25S1200000_3;
import Y.IDgS347S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS46S0110000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class VideoFavoriteVM extends FeedBaseViewModel<C203577yr> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public long LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final C87O LJLLILLLL = new C87O(C87S.LJLIL);
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(C87T.LJLIL);
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(C2061087a.LJLIL);
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(C87R.LJLIL);
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(C87V.LJLIL);

    static {
        TBV tbv = new TBV(VideoFavoriteVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbv};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C203577yr(null, 7);
    }

    public final Context getContext() {
        return (Context) this.LJLLILLLL.LIZ(LJLZ[0]);
    }

    public final void nv0() {
        Aweme aweme;
        String aid;
        Aweme aweme2;
        String aid2;
        Aweme aweme3;
        Context context;
        Context context2;
        Aweme aweme4;
        Aweme aweme5;
        String str;
        String str2;
        String str3;
        String str4;
        VideoItemParams gv0;
        String str5;
        String str6;
        Aweme aweme6;
        VideoItemParams gv02 = gv0();
        if (gv02 == null || gv02.getAweme() == null) {
            return;
        }
        VideoItemParams gv03 = gv0();
        String str7 = null;
        String str8 = "";
        if (gv03 != null && (aweme5 = gv03.getAweme()) != null) {
            VideoItemParams gv04 = gv0();
            if (gv04 == null || (str = gv04.mEventType) == null) {
                str = "";
            }
            C188727au c188727au = new C188727au();
            VideoItemParams gv05 = gv0();
            if (gv05 != null) {
                str2 = gv05.mEventType;
            } else {
                str2 = null;
            }
            if (!o.LJ(str2, "from_music")) {
                FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
                Context context3 = getContext();
                VideoItemParams gv06 = gv0();
                if (gv06 != null) {
                    aweme6 = gv06.getAweme();
                } else {
                    aweme6 = null;
                }
                c188727au.LIZLLL(LJJIJLIJ.LJIIZILJ(context3, aweme6), "music_name");
            }
            Context context4 = getContext();
            String str9 = "favourite_video";
            if (context4 != null) {
                C57258Mda.LIZIZ(c188727au, "favourite_video", C2S6.LIZ(context4).getInboxLogExtra());
            }
            C222578oP.LIZJ(c188727au, aweme5, null, null, 14);
            C220488l2 c220488l2 = C220488l2.LIZIZ;
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("group_id", aweme5.getAid());
            c188727au.LJIIIZ("author_id", aweme5.getAuthorUid());
            c188727au.LJIIIZ("follow_status", C227768wm.LJIJ(aweme5.getAuthor()));
            c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(aweme5)));
            c188727au.LJIIIZ("enter_method", "click_fav_button");
            c188727au.LIZLLL(aweme5.getAwemeType(), "aweme_type");
            c188727au.LIZLLL(C227768wm.LJIJJ(aweme5), "text_post_content");
            c188727au.LIZLLL(C227768wm.LJIILIIL(aweme5), "pic_cnt");
            c188727au.LJFF(Boolean.valueOf(aweme5.isHighlighted()), "is_highlighted");
            c188727au.LJFF(Integer.valueOf(aweme5.getOriginalPos()), "rank_index");
            c188727au.LIZLLL(C79004UzY.LJJJIL(getContext(), aweme5), "is_landscape_screen");
            c188727au.LIZLLL(aweme5.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
            AnonymousClass636.LIZIZ(c188727au, aweme5.getAid());
            if (!ov0()) {
                V0N.LJI(c188727au, aweme5);
            }
            Z9N z9n = Z9N.LIZIZ;
            Map<String, String> LLJLLIL = z9n.LLJLLIL(str, z9n.LJLJJLL(str));
            if (!LLJLLIL.isEmpty()) {
                c188727au.LJIIIIZZ(C176276vv.LIZ(aweme5, LLJLLIL));
            }
            VideoItemParams gv07 = gv0();
            if (gv07 != null) {
                str3 = gv07.mEventType;
            } else {
                str3 = null;
            }
            if (o.LJ(str3, "homepage_nearby")) {
                LQA lqa = LQA.LIZIZ;
                Map<String, String> map = c188727au.LIZ;
                o.LJII(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
                lqa.LJII("homepage_nearby", (HashMap) map, aweme5, true);
            }
            C51556KLg.LIZ.getClass();
            Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(aweme5, null);
            if (!LJIIJJI.isEmpty()) {
                c188727au.LJIIIIZZ(LJIIJJI);
            }
            z9n.LJJIFFI().LIZ(c188727au, aweme5);
            if (C224888s8.LJ(str)) {
                c188727au.LJI("play_mode", C224888s8.LIZJ());
            }
            if (o.LJ(str, "creation_inspiration")) {
                try {
                    gv0 = gv0();
                } catch (Exception unused) {
                }
                if (gv0 != null && (str5 = gv0.trackerData) != null) {
                    str4 = JSONObjectProtectorUtils.getString(new JSONObject(str5), "inspiration_tab");
                    c188727au.LJI("creation_inspiration_category", str4);
                }
                str4 = null;
                c188727au.LJI("creation_inspiration_category", str4);
            }
            if (C78685UuP.LJJJZ(C187677Yd.LIZ(aweme5))) {
                c188727au.LJI("photo_content_type", C187677Yd.LIZ(aweme5));
            }
            String str10 = C2S6.LIZ(getContext()).getExtra().get("enter_position");
            if (C78685UuP.LJJJZ(str10)) {
                c188727au.LJI("enter_position", str10);
            }
            Object LJII = c220488l2.LJII(aweme5, c188727au);
            C222578oP.LIZJ(LJII, aweme5, null, null, 14);
            C188727au c188727au2 = (C188727au) LJII;
            c188727au2.LIZLLL(aweme5.aigcInfo.getAIGCLabelType(), "aigc_theme_status");
            Map<String, String> map2 = c188727au2.LIZ;
            if (ov0()) {
                str9 = "cancel_favourite_video";
            }
            FMX.LJIIL(str9, map2);
            if (aweme5.isAd()) {
                if (ov0()) {
                    str6 = "favorite_cancel";
                } else {
                    str6 = "favorite";
                }
                C58704N2e.LIZLLL("draw_ad", str6, aweme5.getAwemeRawAd()).LJI();
            }
        }
        Context context5 = getContext();
        if (context5 != null) {
            boolean LJ = C48203Ivv.LJ(context5);
            Activity LJIJJ = C45804HyK.LJIJJ(context5);
            if (!LJ) {
                if (LJIJJ != null) {
                    AnonymousClass114.LIZ(LJIJJ, R.string.dtf);
                    return;
                }
                return;
            }
        }
        VideoItemParams gv08 = gv0();
        if (gv08 == null || (aweme3 = gv08.getAweme()) == null || aweme3.isCollected() || !(!((RBX) HG3.LJIILL()).getCurSecUserId().equals(aweme3.getAuthorUid())) || C55511LqV.LJIIIIZZ(aweme3) || !com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl.LJIJJLI().LJIIL() || Keva.getRepo("keva_favorite_notify_optimize_repo").getBoolean("keva_has_shown_favorite_notify_optimize_sheet", false) || !com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl.LJIJJLI().LJIILL() || (context = getContext()) == null || C79004UzY.LJJIJIIJI(context) || (context2 = getContext()) == null) {
            if (C52535Kjb.LIZ()) {
                if (!ov0()) {
                    C87Q c87q = (C87Q) this.LJLLJ.getValue();
                    VideoItemParams gv09 = gv0();
                    if (gv09 != null && (aweme2 = gv09.getAweme()) != null && (aid2 = aweme2.getAid()) != null) {
                        str8 = aid2;
                    }
                    C87P.LIZ(c87q, str8, C113554cx.LJJLIIIIJ(new OSZ("privacy_setting", 0)), null, new AqS183S0100000_1(this, 5), 4);
                    return;
                }
                C87Q c87q2 = (C87Q) this.LJLLJ.getValue();
                VideoItemParams gv010 = gv0();
                if (gv010 != null && (aweme = gv010.getAweme()) != null && (aid = aweme.getAid()) != null) {
                    str8 = aid;
                }
                C87P.LIZIZ(c87q2, str8, C113554cx.LJJLIIIIJ(new OSZ("privacy_setting", 0)), null, new AqS185S0100000_3(this, 50), 4);
                return;
            }
            XKX.LIZLLL(getAssemVMScope(), null, null, new C64512g3(this, XKX.LIZLLL(getAssemVMScope(), null, null, new C62992db(null), 3), null), 3);
            return;
        }
        if (context2 instanceof ActivityC45651qj) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) context2;
            VideoItemParams gv011 = gv0();
            if (gv011 != null) {
                aweme4 = gv011.getAweme();
            } else {
                aweme4 = null;
            }
            VideoItemParams gv012 = gv0();
            if (gv012 != null) {
                str7 = gv012.mEventType;
            }
            C2062387n.LIZ(activityC45651qj, str7, aweme4);
        }
    }

    public final long lv0() {
        String str;
        Aweme aweme;
        if (C52535Kjb.LIZ()) {
            InterfaceC213128Ya interfaceC213128Ya = (InterfaceC213128Ya) this.LJLLL.getValue();
            VideoItemParams gv0 = gv0();
            if (gv0 == null || (aweme = gv0.getAweme()) == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            return ((Number) interfaceC213128Ya.LJ(str)).longValue();
        }
        return this.LJLJLLL;
    }

    public final void mv0() {
        String str;
        String str2;
        String str3;
        Aweme aweme;
        Integer num;
        BottomToastVM bottomToastVM;
        AKT hv0;
        Aweme aweme2;
        DataCenter dataCenter;
        Aweme aweme3;
        PublishPreviewInfo previewData;
        Activity LJIJJ;
        Aweme aweme4;
        VideoItemParams gv0 = gv0();
        if (gv0 == null || gv0.getAweme() == null) {
            return;
        }
        VideoItemParams gv02 = gv0();
        if (gv02 != null && (aweme4 = gv02.getAweme()) != null && aweme4.isScheduleVideo()) {
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.gaa);
            c5s1.LJ();
            return;
        }
        VideoItemParams gv03 = gv0();
        if (gv03 != null && (aweme3 = gv03.getAweme()) != null && (previewData = aweme3.getPreviewData()) != null && previewData.getInPublishing()) {
            Context context = getContext();
            if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                AnonymousClass114.LIZ(LJIJJ, R.string.tfy);
                return;
            }
            return;
        }
        VideoItemParams gv04 = gv0();
        String str4 = null;
        if (gv04 != null && (dataCenter = gv04.dataCenter) != null) {
            dataCenter.jv0(null, "video_favorite_click");
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            VideoItemParams gv05 = gv0();
            if (gv05 != null && (aweme2 = gv05.getAweme()) != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            VideoItemParams gv06 = gv0();
            if (gv06 != null) {
                str2 = gv06.mEventType;
            } else {
                str2 = null;
            }
            if (!C30581Hy.LJIL(str2) || ((Keva) E52.LIZ.getValue()).getInt("reinstall_check_result", 0) != 2 || (num = (Integer) E52.LIZJ.getValue()) == null || num.intValue() != 3) {
                Context context2 = getContext();
                if (context2 != null) {
                    Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context2);
                    VideoItemParams gv07 = gv0();
                    if (gv07 == null || (str3 = gv07.mEventType) == null) {
                        str3 = "";
                    }
                    C40883G2t c40883G2t = new C40883G2t();
                    c40883G2t.LIZLLL("group_id", str);
                    VideoItemParams gv08 = gv0();
                    if (gv08 != null && (aweme = gv08.getAweme()) != null) {
                        str4 = aweme.getAuthorUid();
                    }
                    c40883G2t.LIZLLL("author_id", str4);
                    c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(str));
                    J9P.LIZIZ(LJJLIIIJ, str3, "click_favorite_video", (Bundle) c40883G2t.LIZ, new IDgS347S0100000_3(this, 0));
                    return;
                }
                return;
            }
            Context context3 = getContext();
            Fragment fragment = this.LJLJJLL;
            if (fragment != null && (bottomToastVM = (BottomToastVM) ViewModelProviders.of(fragment).get(BottomToastVM.class)) != null && (hv0 = bottomToastVM.hv0()) != null) {
                hv0.LJ(R.style.ux);
                hv0.LIZ.LJLJJI = 0;
                hv0.LJFF(R.string.hwk);
                hv0.LIZ.LJLJLJ = new ACListenerS25S1200000_3(context3, this, str, 9);
                hv0.LJII();
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "bottom_toast");
            c188727au.LJIIIZ("enter_method", "click_favorite_video");
            FMX.LJIIL("login_bottom_toast", c188727au.LIZ);
            return;
        }
        nv0();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (C52535Kjb.LIZ()) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2063087u(this, null), 3);
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2063187v(this, null), 3);
        }
    }

    public final boolean ov0() {
        String str;
        Aweme aweme;
        if (C52535Kjb.LIZ()) {
            InterfaceC213128Ya interfaceC213128Ya = (InterfaceC213128Ya) this.LJLLLLLL.getValue();
            VideoItemParams gv0 = gv0();
            if (gv0 == null || (aweme = gv0.getAweme()) == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            return ((Boolean) interfaceC213128Ya.LJ(str)).booleanValue();
        }
        return this.LJLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C203577yr iv0(X.C203577yr r9, com.ss.android.ugc.aweme.feed.model.VideoItemParams r10) {
        /*
            r8 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            X.7yr r4 = new X.7yr
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r10.getAweme()
            boolean r0 = X.C52535Kjb.LIZ()
            if (r0 != 0) goto L4c
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r1 = com.ss.android.ugc.aweme.awemeservice.AwemeService.LIZ()
            if (r7 == 0) goto L22
            java.lang.String r0 = r7.getAid()
            if (r0 != 0) goto L24
        L22:
            java.lang.String r0 = ""
        L24:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r1.i6(r0)
            r5 = 0
            if (r3 != 0) goto L6e
            if (r7 == 0) goto L79
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r7.getStatistics()
            if (r0 == 0) goto L79
            long r0 = r0.getCollectCount()
        L38:
            r8.LJLJLLL = r0
            long r1 = r8.lv0()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L44
            r8.LJLJLLL = r5
        L44:
            if (r3 == 0) goto L65
            boolean r0 = r3.isCollected()
        L4a:
            r8.LJLL = r0
        L4c:
            boolean r0 = X.C203857zJ.LIZLLL(r7)
            r8.LJLLI = r0
            long r2 = r8.lv0()
            boolean r1 = r8.ov0()
            boolean r0 = r8.LJLLI
            X.7u8 r1 = r8.kv0(r2, r1, r0)
            r0 = 6
            r4.<init>(r1, r0)
            return r4
        L65:
            if (r7 == 0) goto L6c
            boolean r0 = r7.isCollected()
            goto L4a
        L6c:
            r0 = 0
            goto L4a
        L6e:
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r3.getStatistics()
            if (r0 == 0) goto L79
            long r0 = r0.getCollectCount()
            goto L38
        L79:
            r0 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM.iv0(X.33Q, com.ss.android.ugc.aweme.feed.model.VideoItemParams):X.33Q");
    }

    public final C200647u8 kv0(long j, boolean z, boolean z2) {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        boolean LJLJLLL = C63081OpJ.LJLJLLL(aweme);
        String str = CardStruct.IStatusCode.DEFAULT;
        if (!LJLJLLL && j > 0) {
            str = C77123UOp.LJJIIJ(j);
        }
        return new C200647u8(str, z, z2);
    }

    public final void pv0(String aid, boolean z, boolean z2) {
        String str;
        Aweme aweme;
        AwemeStatistics statistics;
        long j;
        Aweme aweme2;
        o.LJIIIZ(aid, "aid");
        VideoItemParams gv0 = gv0();
        if (gv0 == null || gv0.getAweme() == null) {
            return;
        }
        VideoItemParams gv02 = gv0();
        if (gv02 != null && (aweme2 = gv02.getAweme()) != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (!o.LJ(aid, str)) {
            return;
        }
        if (z) {
            if (ov0()) {
                this.LJLJLLL = lv0() - 1;
            } else {
                this.LJLJLLL = lv0() + 1;
            }
            this.LJLL = true ^ ov0();
            setState(new AqS46S0110000_3(this, z2, 21));
            return;
        }
        VideoItemParams gv03 = gv0();
        if (gv03 == null || (aweme = gv03.getAweme()) == null) {
            return;
        }
        Aweme i6 = AwemeService.LIZ().i6(aweme.getAid());
        Context context = getContext();
        if (context != null && C79004UzY.LJJIJIIJI(context) && (i6 == null || aweme.isCollected() != i6.isCollected())) {
            return;
        }
        if ((i6 != null && (statistics = i6.getStatistics()) != null) || (statistics = aweme.getStatistics()) != null) {
            j = statistics.getCollectCount();
        } else {
            j = 0;
        }
        this.LJLJLLL = j;
        if (lv0() < 0) {
            this.LJLJLLL = 0L;
        }
        this.LJLL = aweme.isCollected();
        if (z2) {
            setState(new AqS46S0110000_3(this, z2, 22));
        } else {
            setState(new AqS169S0100000_3(this, 886));
        }
    }
}
