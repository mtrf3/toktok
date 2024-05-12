package Y;

import X.A2F;
import X.A2G;
import X.A2H;
import X.A2I;
import X.A2V;
import X.AbstractC186347Ta;
import X.AbstractC226768vA;
import X.AnonymousClass395;
import X.AnonymousClass739;
import X.AnonymousClass843;
import X.AnonymousClass852;
import X.AnonymousClass860;
import X.C10K;
import X.C1806377b;
import X.C181677Bb;
import X.C187917Zb;
import X.C191937g5;
import X.C1FJ;
import X.C2054084i;
import X.C2055584x;
import X.C2055684y;
import X.C215038cF;
import X.C215498cz;
import X.C215528d2;
import X.C221018lt;
import X.C226708v4;
import X.C226718v5;
import X.C226738v7;
import X.C226758v9;
import X.C227508wM;
import X.C227528wO;
import X.C228648yC;
import X.C2305192x;
import X.C243119gR;
import X.C25620zW;
import X.C2K0;
import X.C2P8;
import X.C2U8;
import X.C32I;
import X.C34K;
import X.C36922EeM;
import X.C38333F2r;
import X.C39326Fc2;
import X.C3C5;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55230Lly;
import X.C61878OQg;
import X.C64920Pds;
import X.C72808Sho;
import X.C73318Sq2;
import X.C73A;
import X.C74Z;
import X.C76732zl;
import X.C77K;
import X.C77L;
import X.C77M;
import X.C78983UzD;
import X.C7ZT;
import X.C85M;
import X.C86V;
import X.C8ZC;
import X.C90193gN;
import X.EF7;
import X.EV9;
import X.EnumC228698yH;
import X.FMX;
import X.HG3;
import X.InterfaceC215558d5;
import X.InterfaceC55235Lm3;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC73573Su9;
import X.InterfaceC88473Ynt;
import X.L61;
import X.L6F;
import X.MBB;
import X.ORZ;
import X.OSZ;
import X.XKX;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.ss.android.ugc.aweme.favorites.business.FavoriteCountResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.AddVideosFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.mix.api.response.MixCandidateVideosResponse;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel;
import com.ss.android.ugc.aweme.music.v2.assem.MusicHeaderBackgroundAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewer.api.ProfileViewerInfo;
import com.ss.android.ugc.aweme.profile.viewer.api.ProfileViewerResponse;
import com.ss.android.ugc.aweme.profile.viewer.viewmodel.ProfileViewerViewModel;
import com.ss.android.ugc.aweme.repo.CreateDanmakuResponse;
import com.ss.android.ugc.now.interaction.assem.CommentItem;
import com.ss.android.ugc.now.interaction.assem.CommentListVM;
import com.ss.android.ugc.now.interaction.model.CommentCursor;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS29S0301000_3;
import kotlin.jvm.internal.AqS46S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AfS52S0200000_3 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            case 24:
                accept$24(this, obj);
                return;
            case 25:
                accept$25(this, obj);
                return;
            case 26:
                accept$26(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        String str;
        Aweme aweme;
        OSZ osz = (OSZ) obj;
        String aid = ((Aweme) afS52S0200000_3.l0).getAid();
        VideoItemParams gv0 = ((C2054084i) afS52S0200000_3.l1).LJLILLLLZI.gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(aid, str)) {
            C2055684y c2055684y = ((C2054084i) afS52S0200000_3.l1).LJLZ;
            Iterable<? extends AnonymousClass852<C85M>> iterable = (Iterable) osz.getFirst();
            c2055684y.LJFF = null;
            c2055684y.LJI = false;
            c2055684y.LIZLLL = null;
            c2055684y.LJ = iterable;
            AnonymousClass860 anonymousClass860 = c2055684y.LIZ.LLIIIILZ;
            if (anonymousClass860 != null) {
                if (anonymousClass860.LIZIZ) {
                    c2055684y.LIZIZ.invoke(anonymousClass860);
                } else {
                    c2055684y.LIZJ.invoke();
                }
            }
            ((C2054084i) afS52S0200000_3.l1).LJLLLL = (C2055584x) osz.getSecond();
            boolean LIZJ = AnonymousClass843.LIZJ((Aweme) afS52S0200000_3.l0);
            if (C2305192x.LIZIZ()) {
                C2054084i c2054084i = (C2054084i) afS52S0200000_3.l1;
                AnonymousClass860 anonymousClass8602 = c2054084i.LJLILLLLZI.LLIIIILZ;
                if (anonymousClass8602 != null && anonymousClass8602.LIZIZ) {
                    c2054084i.LJIIIIZZ(c2054084i.LJLLLLLL, (Aweme) afS52S0200000_3.l0, true, LIZJ);
                    return;
                }
            }
            C2054084i c2054084i2 = (C2054084i) afS52S0200000_3.l1;
            c2054084i2.LJIIIIZZ(c2054084i2.LJLLLL, (Aweme) afS52S0200000_3.l0, false, LIZJ);
        }
    }

    public static final void accept$1(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        ((VideoDiggVM) afS52S0200000_3.l0).qv0(new Exception((Throwable) obj));
        ((C73318Sq2) afS52S0200000_3.l1).dispose();
    }

    public static final void accept$10(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        MixCandidateVideosResponse mixCandidateVideosResponse = (MixCandidateVideosResponse) obj;
        List<Aweme> mixVideos = mixCandidateVideosResponse.getMixVideos();
        if (mixVideos != null) {
            MultiVideoViewModel multiVideoViewModel = (MultiVideoViewModel) afS52S0200000_3.l0;
            Iterator<Aweme> it = mixVideos.iterator();
            while (it.hasNext()) {
                ((ArrayList) multiVideoViewModel.LJLIL).add(it.next());
            }
        }
        List<C228648yC> gv0 = ((MultiVideoViewModel) afS52S0200000_3.l0).gv0(mixCandidateVideosResponse.getMixVideos());
        ((ArrayList) ((MultiVideoViewModel) afS52S0200000_3.l0).LJLILLLLZI).addAll(gv0);
        MultiVideoViewModel multiVideoViewModel2 = (MultiVideoViewModel) afS52S0200000_3.l0;
        mixCandidateVideosResponse.getHasMore();
        multiVideoViewModel2.getClass();
        if (mixCandidateVideosResponse.getHasMore()) {
            ((MultiVideoViewModel) afS52S0200000_3.l0).LJLJJL.postValue(Integer.valueOf(EnumC228698yH.SUCCESS.getStatus()));
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS52S0200000_3.l1;
            A2G.LIZ.getClass();
            A2V LIZLLL = A2F.LIZLLL(null, mixCandidateVideosResponse, gv0);
            C3C5.m7constructorimpl(LIZLLL);
            interfaceC67352kd.resumeWith(LIZLLL);
            return;
        }
        if (mixCandidateVideosResponse.getMixVideos() != null) {
            o.LJI(mixCandidateVideosResponse.getMixVideos());
            if (!r0.isEmpty()) {
                ((MultiVideoViewModel) afS52S0200000_3.l0).LJLJJL.postValue(Integer.valueOf(EnumC228698yH.SUCCESS.getStatus()));
                InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) afS52S0200000_3.l1;
                A2G.LIZ.getClass();
                A2H LIZ = A2F.LIZ(gv0);
                C3C5.m7constructorimpl(LIZ);
                interfaceC67352kd2.resumeWith(LIZ);
            }
        }
        ((MultiVideoViewModel) afS52S0200000_3.l0).LJLJJL.postValue(Integer.valueOf(EnumC228698yH.EMPTY.getStatus()));
        InterfaceC67352kd interfaceC67352kd22 = (InterfaceC67352kd) afS52S0200000_3.l1;
        A2G.LIZ.getClass();
        A2H LIZ2 = A2F.LIZ(gv0);
        C3C5.m7constructorimpl(LIZ2);
        interfaceC67352kd22.resumeWith(LIZ2);
    }

    public static final void accept$11(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS52S0200000_3.l0;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
        ((MultiVideoViewModel) afS52S0200000_3.l1).LJLJJL.postValue(Integer.valueOf(EnumC228698yH.ERROR.getStatus()));
    }

    public static final void accept$12(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        C187917Zb c187917Zb;
        ProfileViewerResponse profileViewerResponse = (ProfileViewerResponse) obj;
        List<ProfileViewerInfo> viewerList = profileViewerResponse.getViewerList();
        ArrayList arrayList = new ArrayList(C32I.LJJL(viewerList, 10));
        Iterator<ProfileViewerInfo> it = viewerList.iterator();
        while (true) {
            List list = null;
            if (!it.hasNext()) {
                break;
            }
            ProfileViewerInfo next = it.next();
            next.user.setRequestId(profileViewerResponse.extra.logid);
            int i = 14;
            if (C7ZT.LIZJ()) {
                List LIZ = C2P8.LIZ(next.user);
                if (LIZ == null || LIZ.isEmpty()) {
                    c187917Zb = new C187917Zb(next, list, Integer.valueOf(next.user.getFollowStatus()), i);
                } else {
                    c187917Zb = new C187917Zb(next, LIZ, Integer.valueOf(next.user.getFollowStatus()), 12);
                }
            } else {
                c187917Zb = new C187917Zb(next, list, Integer.valueOf(next.user.getFollowStatus()), i);
            }
            arrayList.add(c187917Zb);
        }
        ((ProfileViewerViewModel) afS52S0200000_3.l0).lv0(profileViewerResponse, arrayList.isEmpty());
        String nextCursor = profileViewerResponse.getNextCursor();
        boolean hasMore = profileViewerResponse.getHasMore();
        if (!profileViewerResponse.isAuthorized()) {
            ProfileViewerViewModel profileViewerViewModel = (ProfileViewerViewModel) afS52S0200000_3.l0;
            profileViewerViewModel.LJLJLLL = false;
            profileViewerViewModel.LJLL = false;
            profileViewerViewModel.hv0().postValue(new C226718v5(profileViewerResponse.getUnreadCount(), 1));
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS52S0200000_3.l1;
            A2H LIZIZ = A2F.LIZIZ(A2G.LIZ);
            C3C5.m7constructorimpl(LIZIZ);
            interfaceC67352kd.resumeWith(LIZIZ);
            return;
        }
        if (!hasMore) {
            ProfileViewerViewModel profileViewerViewModel2 = (ProfileViewerViewModel) afS52S0200000_3.l0;
            profileViewerViewModel2.LJLJLLL = true;
            profileViewerViewModel2.LJLL = true;
            profileViewerViewModel2.hv0().postValue(new C226738v7(0));
            InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) afS52S0200000_3.l1;
            A2G.LIZ.getClass();
            A2H LIZ2 = A2F.LIZ(arrayList);
            C3C5.m7constructorimpl(LIZ2);
            interfaceC67352kd2.resumeWith(LIZ2);
            return;
        }
        ProfileViewerViewModel profileViewerViewModel3 = (ProfileViewerViewModel) afS52S0200000_3.l0;
        profileViewerViewModel3.LJLJLLL = true;
        profileViewerViewModel3.LJLL = true;
        profileViewerViewModel3.hv0().postValue(new C226738v7(0));
        InterfaceC67352kd interfaceC67352kd3 = (InterfaceC67352kd) afS52S0200000_3.l1;
        A2V LJ = A2F.LJ(A2G.LIZ, null, nextCursor, arrayList, 1);
        C3C5.m7constructorimpl(LJ);
        interfaceC67352kd3.resumeWith(LJ);
    }

    public static final void accept$13(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        String notSupportMessage;
        Throwable it = (Throwable) obj;
        if (it instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) it;
            if (C78983UzD.LJJJJ(c38333F2r.getErrorMsg())) {
                notSupportMessage = c38333F2r.getErrorMsg();
            } else {
                notSupportMessage = C86V.LJFF(R.string.pgn);
            }
            MutableLiveData<AbstractC226768vA> hv0 = ((ProfileViewerViewModel) afS52S0200000_3.l0).hv0();
            o.LJIIIIZZ(notSupportMessage, "notSupportMessage");
            hv0.postValue(new C226708v4(notSupportMessage, 1));
        }
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS52S0200000_3.l1;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception(it);
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
        ProfileViewerViewModel profileViewerViewModel = (ProfileViewerViewModel) afS52S0200000_3.l0;
        o.LJIIIIZZ(it, "it");
        profileViewerViewModel.LJLLJ.LJI(C64920Pds.LIZ(EF7.LIZIZ(), it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static final void accept$14(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        String str;
        String str2;
        C187917Zb c187917Zb;
        ProfileViewerResponse profileViewerResponse = (ProfileViewerResponse) obj;
        C243119gR.LIZ(C227508wM.LJLIL);
        List<ProfileViewerInfo> viewerList = profileViewerResponse.getViewerList();
        ArrayList arrayList = new ArrayList(C32I.LJJL(viewerList, 10));
        Iterator<ProfileViewerInfo> it = viewerList.iterator();
        while (it.hasNext()) {
            User user = it.next().user;
            user.setRequestId(profileViewerResponse.extra.logid);
            arrayList.add(user);
        }
        String str3 = 0;
        str3 = 0;
        XKX.LJ(MBB.INSTANCE, new AnonymousClass395(arrayList, (ProfileViewerViewModel) afS52S0200000_3.l0, null));
        List<ProfileViewerInfo> viewerList2 = profileViewerResponse.getViewerList();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(viewerList2, 10));
        for (ProfileViewerInfo profileViewerInfo : viewerList2) {
            profileViewerInfo.user.setRequestId(profileViewerResponse.extra.logid);
            int i = 14;
            if (C7ZT.LIZJ()) {
                List LIZ = C2P8.LIZ(profileViewerInfo.user);
                if (LIZ == null || LIZ.isEmpty()) {
                    c187917Zb = new C187917Zb(profileViewerInfo, str3, Integer.valueOf(profileViewerInfo.user.getFollowStatus()), i);
                } else {
                    c187917Zb = new C187917Zb(profileViewerInfo, LIZ, Integer.valueOf(profileViewerInfo.user.getFollowStatus()), 12);
                }
            } else {
                c187917Zb = new C187917Zb(profileViewerInfo, str3, Integer.valueOf(profileViewerInfo.user.getFollowStatus()), i);
            }
            arrayList2.add(c187917Zb);
        }
        ((ProfileViewerViewModel) afS52S0200000_3.l0).lv0(profileViewerResponse, arrayList2.isEmpty());
        String nextCursor = profileViewerResponse.getNextCursor();
        if (!arrayList2.isEmpty()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("The items array's size is ", String.valueOf(arrayList2.size()), ". LogId: ");
            BaseResponse.ServerTimeExtra serverTimeExtra = profileViewerResponse.extra;
            if (serverTimeExtra == null || (str2 = serverTimeExtra.logid) == null) {
                str2 = null;
            }
            LIZIZ.append(str2);
            LIZIZ.append(" enter_from: ");
            C1FJ.LJFF(LIZIZ, ((ProfileViewerViewModel) afS52S0200000_3.l0).LJLLI, LIZIZ, 4, "PVViewModel");
        }
        if (!profileViewerResponse.isAuthorized()) {
            ProfileViewerViewModel profileViewerViewModel = (ProfileViewerViewModel) afS52S0200000_3.l0;
            profileViewerViewModel.LJLJLLL = false;
            profileViewerViewModel.LJLL = false;
            profileViewerViewModel.hv0().postValue(new C226718v5(profileViewerResponse.getUnreadCount(), 1));
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS52S0200000_3.l1;
            A2H LIZIZ2 = A2F.LIZIZ(A2G.LIZ);
            C3C5.m7constructorimpl(LIZIZ2);
            interfaceC67352kd.resumeWith(LIZIZ2);
            return;
        }
        if (arrayList2.isEmpty() && profileViewerResponse.getHasMore()) {
            C221018lt.LJFF("PVViewModel", "refresh empty and has more data");
            ((ProfileViewerViewModel) afS52S0200000_3.l0).getClass();
            ProfileViewerViewModel.jv0(true);
            ProfileViewerViewModel profileViewerViewModel2 = (ProfileViewerViewModel) afS52S0200000_3.l0;
            profileViewerViewModel2.LJLJLLL = true;
            profileViewerViewModel2.LJLL = true;
            profileViewerViewModel2.hv0().postValue(new C226738v7(0));
            InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) afS52S0200000_3.l1;
            A2V LJ = A2F.LJ(A2G.LIZ, null, nextCursor, arrayList2, 1);
            C3C5.m7constructorimpl(LJ);
            interfaceC67352kd2.resumeWith(LJ);
            return;
        }
        if (arrayList2.isEmpty()) {
            ((ProfileViewerViewModel) afS52S0200000_3.l0).getClass();
            ProfileViewerViewModel.jv0(true);
            ProfileViewerViewModel profileViewerViewModel3 = (ProfileViewerViewModel) afS52S0200000_3.l0;
            profileViewerViewModel3.LJLJLLL = true;
            profileViewerViewModel3.LJLL = true;
            C243119gR.LIZ(C227528wO.LJLIL);
            StringBuilder sb = new StringBuilder("The items array is empty. logId: ");
            BaseResponse.ServerTimeExtra serverTimeExtra2 = profileViewerResponse.extra;
            if (serverTimeExtra2 != null && (str = serverTimeExtra2.logid) != null) {
                str3 = str;
            }
            sb.append(str3);
            sb.append(" enter_from: ");
            sb.append(((ProfileViewerViewModel) afS52S0200000_3.l0).LJLLI);
            C36922EeM.LIZLLL(6, "PVViewModel", sb.toString());
            ((ProfileViewerViewModel) afS52S0200000_3.l0).hv0().postValue(new C226758v9(0));
            InterfaceC67352kd interfaceC67352kd3 = (InterfaceC67352kd) afS52S0200000_3.l1;
            A2H LIZIZ3 = A2F.LIZIZ(A2G.LIZ);
            C3C5.m7constructorimpl(LIZIZ3);
            interfaceC67352kd3.resumeWith(LIZIZ3);
            return;
        }
        ((ProfileViewerViewModel) afS52S0200000_3.l0).getClass();
        ProfileViewerViewModel.jv0(false);
        ProfileViewerViewModel profileViewerViewModel4 = (ProfileViewerViewModel) afS52S0200000_3.l0;
        if (!profileViewerViewModel4.LJLJL) {
            ((LiveData) profileViewerViewModel4.LJLJJI.getValue()).postValue(Boolean.TRUE);
        }
        ProfileViewerViewModel profileViewerViewModel5 = (ProfileViewerViewModel) afS52S0200000_3.l0;
        profileViewerViewModel5.LJLJLLL = true;
        profileViewerViewModel5.LJLL = true;
        profileViewerViewModel5.hv0().postValue(new C226738v7(0));
        if (profileViewerResponse.getHasMore()) {
            InterfaceC67352kd interfaceC67352kd4 = (InterfaceC67352kd) afS52S0200000_3.l1;
            A2V LJ2 = A2F.LJ(A2G.LIZ, null, nextCursor, arrayList2, 1);
            C3C5.m7constructorimpl(LJ2);
            interfaceC67352kd4.resumeWith(LJ2);
            return;
        }
        InterfaceC67352kd interfaceC67352kd5 = (InterfaceC67352kd) afS52S0200000_3.l1;
        A2G.LIZ.getClass();
        A2H LIZ2 = A2F.LIZ(arrayList2);
        C3C5.m7constructorimpl(LIZ2);
        interfaceC67352kd5.resumeWith(LIZ2);
    }

    public static final void accept$15(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        Throwable it = (Throwable) obj;
        ProfileViewerViewModel profileViewerViewModel = (ProfileViewerViewModel) afS52S0200000_3.l0;
        profileViewerViewModel.LJLJLLL = false;
        profileViewerViewModel.LJLL = false;
        C243119gR.LIZ(C227528wO.LJLIL);
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS52S0200000_3.l1;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception(it);
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
        if (it != null) {
            ((ProfileViewerViewModel) afS52S0200000_3.l0).iv0(it);
        }
        ProfileViewerViewModel profileViewerViewModel2 = (ProfileViewerViewModel) afS52S0200000_3.l0;
        o.LJIIIIZZ(it, "it");
        profileViewerViewModel2.LJLLJ.LJI(C64920Pds.LIZ(EF7.LIZIZ(), it));
    }

    public static final void accept$16(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        Integer num;
        HashMap<String, Integer> hashMap;
        FavoriteCountResponse favoriteCountResponse = (FavoriteCountResponse) obj;
        List list = (List) afS52S0200000_3.l0;
        C8ZC c8zc = (C8ZC) afS52S0200000_3.l1;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC186347Ta abstractC186347Ta = (AbstractC186347Ta) obj2;
                if (favoriteCountResponse == null || (hashMap = favoriteCountResponse.count) == null || (num = hashMap.get(abstractC186347Ta.LIZ().tabCountKey)) == null) {
                    num = 0;
                }
                int intValue = num.intValue();
                c8zc.LIZLLL.put(abstractC186347Ta.LIZ().mobKey, Integer.valueOf(intValue));
                MutableLiveData<Integer> mutableLiveData = abstractC186347Ta.LJLIL;
                mutableLiveData.setValue(Integer.valueOf(intValue));
                mutableLiveData.observe(c8zc.LIZIZ, new AObserverS47S0201000_3(i, c8zc, abstractC186347Ta, 0));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public static final void accept$17(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        ((ArrayList) ((C215498cz) afS52S0200000_3.l0).LJII).remove((C215528d2) afS52S0200000_3.l1);
    }

    public static final void accept$18(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        ((C215498cz) afS52S0200000_3.l0).LIZLLL.put((InterfaceC215558d5) afS52S0200000_3.l1, new C215038cF());
    }

    public static final void accept$19(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        InterfaceC73573Su9<String> interfaceC73573Su9;
        C215038cF remove = ((C215498cz) afS52S0200000_3.l0).LIZLLL.remove((InterfaceC215558d5) afS52S0200000_3.l1);
        if (remove == null || (interfaceC73573Su9 = remove.LJLIL) == null || interfaceC73573Su9.isDisposed()) {
            return;
        }
        interfaceC73573Su9.onComplete();
    }

    public static final void accept$2(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        ViewerListResponse viewerListResponse = (ViewerListResponse) obj;
        ArrayList arrayList = new ArrayList();
        List<User> viewerList = viewerListResponse.getViewerList();
        List list = null;
        if (viewerList != null) {
            VideoViewerListVM videoViewerListVM = (VideoViewerListVM) afS52S0200000_3.l0;
            for (User user : viewerList) {
                int i = 12;
                if (C7ZT.LIZIZ()) {
                    List LIZ = C2P8.LIZ(user);
                    if (LIZ == null || LIZ.isEmpty()) {
                        arrayList.add(new C181677Bb(user, new C1806377b(videoViewerListVM.gv0(), videoViewerListVM.LJLJI, videoViewerListVM.LJLJJI), list, i));
                    } else {
                        arrayList.add(new C181677Bb(user, new C1806377b(videoViewerListVM.gv0(), videoViewerListVM.LJLJI, videoViewerListVM.LJLJJI), LIZ, 4));
                    }
                } else {
                    arrayList.add(new C181677Bb(user, new C1806377b(videoViewerListVM.gv0(), videoViewerListVM.LJLJI, videoViewerListVM.LJLJJI), list, i));
                }
            }
        }
        long totalCount = viewerListResponse.getTotalCount();
        Long l = (Long) ((Map) ((VideoViewerListVM) afS52S0200000_3.l0).LJLJLJ.getValue()).get(((VideoViewerListVM) afS52S0200000_3.l0).gv0());
        if (l == null || totalCount != l.longValue()) {
            ((Map) ((VideoViewerListVM) afS52S0200000_3.l0).LJLJLJ.getValue()).put(((VideoViewerListVM) afS52S0200000_3.l0).gv0(), Long.valueOf(totalCount));
            ((LiveData) ((VideoViewerListVM) afS52S0200000_3.l0).LJLJLLL.getValue()).setValue(new OSZ(((VideoViewerListVM) afS52S0200000_3.l0).gv0(), Long.valueOf(totalCount)));
        }
        if (viewerListResponse.getHasMore()) {
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS52S0200000_3.l1;
            A2V LJ = A2F.LJ(A2G.LIZ, null, new PaginationCursor(viewerListResponse.getCursor(), viewerListResponse.getOffset()), arrayList, 1);
            C3C5.m7constructorimpl(LJ);
            interfaceC67352kd.resumeWith(LJ);
        } else {
            if (!arrayList.isEmpty()) {
                arrayList.add(new C77K());
            }
            InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) afS52S0200000_3.l1;
            A2G.LIZ.getClass();
            A2H LIZ2 = A2F.LIZ(arrayList);
            C3C5.m7constructorimpl(LIZ2);
            interfaceC67352kd2.resumeWith(LIZ2);
        }
        L6F.LIZIZ.LIZLLL(L61.STORY, null, viewerListResponse.getViewerList(), C77M.LJLIL);
        C74Z.LJFF((Set) ((VideoViewerListVM) afS52S0200000_3.l0).LJLL.getValue(), viewerListResponse.getViewerList(), "normal_video", "viewer_list");
    }

    public static final void accept$20(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        InterfaceC73573Su9<String> interfaceC73573Su9;
        CreateDanmakuResponse createDanmakuResponse = (CreateDanmakuResponse) obj;
        ((ArrayList) ((C215498cz) afS52S0200000_3.l0).LJ).remove((InterfaceC215558d5) afS52S0200000_3.l1);
        if (createDanmakuResponse != null && createDanmakuResponse.getRethinkToast() == null && createDanmakuResponse.getDanmakuId().length() > 0 && !o.LJ(createDanmakuResponse.getDanmakuId(), CardStruct.IStatusCode.DEFAULT)) {
            C215498cz c215498cz = (C215498cz) afS52S0200000_3.l0;
            InterfaceC215558d5 interfaceC215558d5 = (InterfaceC215558d5) afS52S0200000_3.l1;
            String danmakuId = createDanmakuResponse.getDanmakuId();
            C215038cF remove = c215498cz.LIZLLL.remove(interfaceC215558d5);
            interfaceC215558d5.LJ(danmakuId);
            InterfaceC215558d5 LIZIZ = interfaceC215558d5.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.LJ(danmakuId);
            }
            if (remove != null) {
                o.LJIIIZ(danmakuId, "danmakuId");
                InterfaceC73573Su9<String> interfaceC73573Su92 = remove.LJLIL;
                if (interfaceC73573Su92 == null || interfaceC73573Su92.isDisposed()) {
                    return;
                }
                interfaceC73573Su92.onNext(danmakuId);
                return;
            }
            return;
        }
        C215038cF remove2 = ((C215498cz) afS52S0200000_3.l0).LIZLLL.remove((InterfaceC215558d5) afS52S0200000_3.l1);
        if (remove2 == null || (interfaceC73573Su9 = remove2.LJLIL) == null || interfaceC73573Su9.isDisposed()) {
            return;
        }
        interfaceC73573Su9.onComplete();
    }

    public static final void accept$21(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        int i;
        BaseCommentResponse baseCommentResponse = (BaseCommentResponse) obj;
        if (baseCommentResponse != null && baseCommentResponse.status_code == 0) {
            C72808Sho<ITEM> c72808Sho = ((CommentListVM) afS52S0200000_3.l0).state;
            if (c72808Sho != 0) {
                c72808Sho.LJIIL((CommentItem) afS52S0200000_3.l1);
            }
            C73A c73a = ((CommentListVM) afS52S0200000_3.l0).LJLJLLL;
            List<CommentItem> LJJIJ = C47261Igj.LJJIJ((CommentItem) afS52S0200000_3.l1);
            c73a.getClass();
            Iterator it = LJJIJ.iterator();
            while (it.hasNext()) {
                String cid = ((CommentItem) it.next()).getComment().getCid();
                if (cid != null) {
                    c73a.LIZIZ(cid);
                    c73a.LIZJ.remove(cid);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (CommentItem commentItem : LJJIJ) {
                String cid2 = commentItem.getComment().getCid();
                if (cid2 != null) {
                    AqS169S0100000_3 aqS169S0100000_3 = c73a.LJIIIIZZ;
                    if (aqS169S0100000_3 != null) {
                        i = ((Number) aqS169S0100000_3.invoke(commentItem)).intValue();
                    } else {
                        i = 0;
                    }
                    linkedHashMap.put(cid2, Integer.valueOf(i));
                }
            }
            C10K.LIZJ(new AnonymousClass739(c73a, linkedHashMap));
            CommentCursor commentCursor = ((CommentListVM) afS52S0200000_3.l0).LJLJJL;
            if (commentCursor != null) {
                long data = commentCursor.getData();
                CommentCursor commentCursor2 = ((CommentListVM) afS52S0200000_3.l0).LJLJJL;
                if (commentCursor2 != null) {
                    commentCursor2.setData(data - 1);
                }
            }
            ((CommentListVM) afS52S0200000_3.l0).setState(new AqS169S0100000_3((CommentItem) afS52S0200000_3.l1, 738));
            return;
        }
        ((CommentListVM) afS52S0200000_3.l0).setState(new AqS169S0100000_3(baseCommentResponse, 739));
    }

    public static final void accept$22(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        float f;
        Integer it = (Integer) obj;
        o.LJIIIIZZ(it, "it");
        Color.colorToHSV(it.intValue(), new float[3]);
        float f2 = 0.9f;
        int HSVToColor = Color.HSVToColor(new float[]{(((int) r7[0]) + 345) % 360, 0.45f, 0.9f});
        int HSVToColor2 = Color.HSVToColor(new float[]{(((int) r7[0]) + 375) % 360, 0.45f, 0.9f});
        boolean LIZ = C90193gN.LIZ();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{HSVToColor, 0});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(1);
        gradientDrawable.setAlpha(128);
        if (LIZ) {
            f = 0.74f;
        } else {
            f = 0.26f;
        }
        gradientDrawable.setGradientCenter(f, -0.25f);
        gradientDrawable.setGradientRadius(((View) afS52S0200000_3.l0).getMeasuredWidth() * 0.68f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColors(new int[]{HSVToColor2, 0});
        gradientDrawable2.setShape(0);
        gradientDrawable2.setAlpha(60);
        gradientDrawable2.setGradientType(1);
        if (LIZ) {
            f2 = 0.100000024f;
        }
        gradientDrawable2.setGradientCenter(f2, 0.0f);
        gradientDrawable2.setGradientRadius(((View) afS52S0200000_3.l0).getMeasuredWidth() * 0.53f);
        ((View) afS52S0200000_3.l0).setBackgroundDrawable(new LayerDrawable(new GradientDrawable[]{gradientDrawable2, gradientDrawable}));
        Fragment LJIIIZ = C55096Ljo.LJIIIZ((MusicHeaderBackgroundAssem) afS52S0200000_3.l1);
        if (LJIIIZ != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LJIIIZ, null);
            MusicHeaderBackgroundAssem musicHeaderBackgroundAssem = (MusicHeaderBackgroundAssem) afS52S0200000_3.l1;
            C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ, PageHeaderScrollAbility.class, null);
            if (LIZ2 == null) {
                C55096Ljo.LJIIJJI(LIZJ, musicHeaderBackgroundAssem, PageHeaderScrollAbility.class, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ2);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(musicHeaderBackgroundAssem);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(musicHeaderBackgroundAssem);
                ev9.LIZ.add(LIZ2);
                Object newProxyInstance = Proxy.newProxyInstance(PageHeaderScrollAbility.class.getClassLoader(), new Class[]{PageHeaderScrollAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, PageHeaderScrollAbility.class, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility");
            }
        }
    }

    public static final void accept$23(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        C39326Fc2.LIZ("like_sync_result", (Bundle) afS52S0200000_3.l0, 0);
        ((C73318Sq2) afS52S0200000_3.l1).dispose();
    }

    public static final void accept$24(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS52S0200000_3.l0;
        mixVideosViewModel.withState(new AqS29S0301000_3(2, (MixVideosResponse) obj, mixVideosViewModel, (InterfaceC67352kd) afS52S0200000_3.l1, 4));
    }

    public static final void accept$25(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS52S0200000_3.l0;
        mixVideosViewModel.withState(new AqS29S0301000_3(3, (MixVideosResponse) obj, mixVideosViewModel, (InterfaceC67352kd) afS52S0200000_3.l1, 5));
    }

    public static final void accept$26(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse = (PoiReviewsApi.PoiReviewEligibleResponse) obj;
        if (poiReviewEligibleResponse != null && poiReviewEligibleResponse.status_code == 0) {
            InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) afS52S0200000_3.l1;
            if (interfaceC88473Ynt != null) {
                interfaceC88473Ynt.invoke(poiReviewEligibleResponse.eligible, poiReviewEligibleResponse.poiName, poiReviewEligibleResponse.collectInfo);
                return;
            }
            return;
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS52S0200000_3.l0;
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public static final void accept$3(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        List arrayList;
        C181677Bb c181677Bb;
        ViewerListResponse viewerListResponse = (ViewerListResponse) obj;
        List<User> viewerList = viewerListResponse.getViewerList();
        List list = null;
        if (viewerList != null) {
            VideoViewerListVM videoViewerListVM = (VideoViewerListVM) afS52S0200000_3.l1;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(viewerList, 10));
            for (User user : viewerList) {
                int i = 12;
                if (C7ZT.LIZIZ()) {
                    List LIZ = C2P8.LIZ(user);
                    if (LIZ == null || LIZ.isEmpty()) {
                        c181677Bb = new C181677Bb(user, new C1806377b(videoViewerListVM.gv0(), videoViewerListVM.LJLJI, videoViewerListVM.LJLJJI), list, i);
                    } else {
                        c181677Bb = new C181677Bb(user, new C1806377b(videoViewerListVM.gv0(), videoViewerListVM.LJLJI, videoViewerListVM.LJLJJI), LIZ, 4);
                    }
                } else {
                    c181677Bb = new C181677Bb(user, new C1806377b(videoViewerListVM.gv0(), videoViewerListVM.LJLJI, videoViewerListVM.LJLJJI), list, i);
                }
                arrayList2.add(c181677Bb);
            }
            arrayList = ORZ.LLJILJILJ(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        if (viewerListResponse.getHasMore()) {
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS52S0200000_3.l0;
            A2V LJ = A2F.LJ(A2G.LIZ, null, new PaginationCursor(viewerListResponse.getCursor(), viewerListResponse.getOffset()), arrayList, 1);
            C3C5.m7constructorimpl(LJ);
            interfaceC67352kd.resumeWith(LJ);
        } else if (!viewerListResponse.getHasMore()) {
            arrayList.add(new C77K());
            InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) afS52S0200000_3.l0;
            A2G.LIZ.getClass();
            A2H LIZ2 = A2F.LIZ(arrayList);
            C3C5.m7constructorimpl(LIZ2);
            interfaceC67352kd2.resumeWith(LIZ2);
        } else if (arrayList.isEmpty()) {
            InterfaceC67352kd interfaceC67352kd3 = (InterfaceC67352kd) afS52S0200000_3.l0;
            A2F a2f = A2G.LIZ;
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            a2f.getClass();
            A2H LIZ3 = A2F.LIZ(c61878OQg);
            C3C5.m7constructorimpl(LIZ3);
            interfaceC67352kd3.resumeWith(LIZ3);
        }
        L6F.LIZIZ.LIZLLL(L61.STORY, null, viewerListResponse.getViewerList(), C77L.LJLIL);
        C74Z.LJFF((Set) ((VideoViewerListVM) afS52S0200000_3.l1).LJLL.getValue(), viewerListResponse.getViewerList(), "normal_video", "viewer_list");
    }

    public static final void accept$4(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        C2U8.LIZ(new C191937g5((CollectionManageRequest) afS52S0200000_3.l0, null));
        ((CollectionContentFragment) afS52S0200000_3.l1).xl();
    }

    public static final void accept$5(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        FMX.LJIILL("collection_add_videos", new OSZ("collection_video", "enter_from"), new OSZ(((AddVideosFragment) afS52S0200000_3.l0).LJLJJI, "collection_id"));
        CollectionManageRequest collectionManageRequest = (CollectionManageRequest) afS52S0200000_3.l1;
        C2U8.LIZ(new C191937g5(new CollectionManageRequest(collectionManageRequest.operation, collectionManageRequest.collectionId, ((AddVideosFragment) afS52S0200000_3.l0).LJLJJL, collectionManageRequest.moveFromCollectionId, collectionManageRequest.moveToCollectionId, collectionManageRequest.addIds, collectionManageRequest.removeIds, collectionManageRequest.moveIds, collectionManageRequest.status), ((AddVideosFragment) afS52S0200000_3.l0).LJLJJLL));
        ((AddVideosFragment) afS52S0200000_3.l0).xl();
    }

    public static final void accept$6(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        boolean z;
        CollectionListResponse collectionListResponse = (CollectionListResponse) obj;
        C34K c34k = (C34K) afS52S0200000_3.l0;
        List<CollectionDetail> list = collectionListResponse.items;
        int i = 0;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        c34k.element = !z;
        if (((C34K) afS52S0200000_3.l0).element) {
            C76732zl c76732zl = (C76732zl) afS52S0200000_3.l1;
            List<CollectionDetail> list2 = collectionListResponse.items;
            if (list2 != null) {
                i = list2.size();
            }
            c76732zl.element = i;
        }
    }

    public static final void accept$7(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        long j;
        CollectionDetail.Statistic statistic;
        Long l;
        HG3.LJIIL();
        FMX.LJIILL("cancel_favourite_video", new OSZ("collection_video", "enter_from"), new OSZ("unavailable_popup", "enter_method"), new OSZ(((Aweme) afS52S0200000_3.l0).getAuthorUid(), "author_id"), new OSZ(((Aweme) afS52S0200000_3.l0).getAid(), "aweme_id"), new OSZ(HG3.LJLJL.LJFF().getCurUserId(), "user_id"));
        CollectionDetail Ml = ((CollectionContentFragment) afS52S0200000_3.l1).Ml();
        if (Ml != null && (statistic = Ml.statistic) != null && (l = statistic.total) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        CollectionDetail.Statistic statistic2 = ((CollectionContentFragment) afS52S0200000_3.l1).Ml().statistic;
        if (statistic2 != null) {
            statistic2.total = Long.valueOf(j - 1);
        }
        ((CollectionContentFragment) afS52S0200000_3.l1).Ll().gv0(true);
        C2U8.LIZ(new C191937g5(new CollectionManageRequest(3, null, null, null, null, null, null, null, null, 510, null), null));
    }

    public static final void accept$8(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        AllFavoriteFragment allFavoriteFragment = (AllFavoriteFragment) afS52S0200000_3.l0;
        Long l = allFavoriteFragment.LJLJJI;
        if (l != null) {
            allFavoriteFragment.LJLJJI = Long.valueOf(l.longValue() - 1);
            allFavoriteFragment.Il();
        }
        HG3.LJIIL();
        FMX.LJIILL("cancel_favourite_video", new OSZ("collection_video", "enter_from"), new OSZ("unavailable_popup", "enter_method"), new OSZ(((Aweme) afS52S0200000_3.l1).getAuthorUid(), "author_id"), new OSZ(((Aweme) afS52S0200000_3.l1).getAid(), "aweme_id"), new OSZ(HG3.LJLJL.LJFF().getCurUserId(), "user_id"));
        VideoCollectionContentViewModel Ll = ((AllFavoriteFragment) afS52S0200000_3.l0).Ll();
        Ll.getClass();
        Ll.withState(new AqS46S0110000_3(Ll, true, 18));
        C2U8.LIZ(new C191937g5(new CollectionManageRequest(3, null, null, null, null, null, null, null, null, 510, null), null));
    }

    public static final void accept$9(AfS52S0200000_3 afS52S0200000_3, Object obj) {
        MixCandidateVideosResponse mixCandidateVideosResponse = (MixCandidateVideosResponse) obj;
        List<Aweme> mixVideos = mixCandidateVideosResponse.getMixVideos();
        if (mixVideos != null) {
            MultiVideoViewModel multiVideoViewModel = (MultiVideoViewModel) afS52S0200000_3.l0;
            Iterator<Aweme> it = mixVideos.iterator();
            while (it.hasNext()) {
                ((ArrayList) multiVideoViewModel.LJLIL).add(it.next());
            }
        }
        ((ArrayList) ((MultiVideoViewModel) afS52S0200000_3.l0).LJLILLLLZI).addAll(((MultiVideoViewModel) afS52S0200000_3.l0).gv0(mixCandidateVideosResponse.getMixVideos()));
        MultiVideoViewModel multiVideoViewModel2 = (MultiVideoViewModel) afS52S0200000_3.l0;
        mixCandidateVideosResponse.getHasMore();
        multiVideoViewModel2.getClass();
        if (mixCandidateVideosResponse.getHasMore()) {
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS52S0200000_3.l1;
            A2F a2f = A2G.LIZ;
            List<C228648yC> gv0 = ((MultiVideoViewModel) afS52S0200000_3.l0).gv0(mixCandidateVideosResponse.getMixVideos());
            a2f.getClass();
            A2V LIZLLL = A2F.LIZLLL(null, mixCandidateVideosResponse, gv0);
            C3C5.m7constructorimpl(LIZLLL);
            interfaceC67352kd.resumeWith(LIZLLL);
            return;
        }
        InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) afS52S0200000_3.l1;
        A2F a2f2 = A2G.LIZ;
        List<C228648yC> gv02 = ((MultiVideoViewModel) afS52S0200000_3.l0).gv0(mixCandidateVideosResponse.getMixVideos());
        a2f2.getClass();
        A2H LIZ = A2F.LIZ(gv02);
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd2.resumeWith(LIZ);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS52S0200000_3(com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel r2, com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel r3, X.InterfaceC67352kd<? super X.A2G<com.ss.android.ugc.aweme.mix.api.response.MixCandidateVideosResponse>> r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 9: goto Le;
                case 10: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS52S0200000_3.<init>(com.ss.android.ugc.aweme.mix.pickcandidate.MultiVideoViewModel, X.2kd, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS52S0200000_3(com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM r2, com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM r3, X.InterfaceC67352kd<? super X.A2G<com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor>> r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS52S0200000_3.<init>(com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM, X.2kd, int):void");
    }

    public AfS52S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
