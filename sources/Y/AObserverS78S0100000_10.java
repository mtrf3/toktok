package Y;

import X.AbstractC029409q;
import X.AnonymousClass636;
import X.AnonymousClass898;
import X.C113914dX;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C188727au;
import X.C26045AKb;
import X.C26227ARb;
import X.C26231ARf;
import X.C29306Beo;
import X.C2NO;
import X.C30581Hy;
import X.C32151Nz;
import X.C38354F3m;
import X.C44938HkM;
import X.C45382HrW;
import X.C47623ImZ;
import X.C53200KuK;
import X.C53254KvC;
import X.C55016LiW;
import X.C56619MJz;
import X.C57392Nb;
import X.C59316NPs;
import X.C59406NTe;
import X.C59423NTv;
import X.C60116Nia;
import X.C60119Nid;
import X.C60126Nik;
import X.C60652Zp;
import X.C60983NwZ;
import X.C60996Nwm;
import X.C61447O9r;
import X.C61798ONe;
import X.C61878OQg;
import X.C61931OSh;
import X.C61938OSo;
import X.C61948OSy;
import X.C61951OTb;
import X.C62826OlC;
import X.C62828OlE;
import X.C63030OoU;
import X.C63035OoZ;
import X.C63081OpJ;
import X.C72062SPy;
import X.C73207SoF;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C77119UOl;
import X.C78685UuP;
import X.C79081V1x;
import X.C7XD;
import X.C84763XOl;
import X.C86343Xud;
import X.CFX;
import X.DialogC25756A8y;
import X.EnumC61773OMf;
import X.InterfaceC37276Ek4;
import X.InterfaceC59337NQn;
import X.InterfaceC59736NcS;
import X.N0D;
import X.NG2;
import X.NGL;
import X.NGR;
import X.NHO;
import X.NLW;
import X.OBM;
import X.OBQ;
import X.ONY;
import X.OO3;
import X.OO7;
import X.ORZ;
import X.OT1;
import X.OT6;
import X.OTL;
import X.OTN;
import X.OTR;
import X.OTS;
import X.OU0;
import X.RunnableC78794UwA;
import X.UC0;
import X.V1B;
import X.ViewOnClickListenerC59350NRa;
import X.X1D;
import X.Z89;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggSetting;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.ui.AppealDialogActivity;
import com.ss.android.ugc.aweme.feed.adapter.widget.BgWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.InteractionAnimationWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.InteractionContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ReportWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdDescLabelWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdProductBannerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.pause.LivePreviewPausedWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.live.FypRecommendInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedFragment;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.KidsFeedViewModel;
import com.ss.android.ugc.aweme.kids.discovery.list.DiscoveryFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthCodeResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponseData;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPageDetail;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.ss.android.ugc.aweme.openauthorize.entity.ScanCommonResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.ScanCommonResponseData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.fragment.ShareInviteContentFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public class AObserverS78S0100000_10 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onChanged$16(this, obj);
                return;
            case 17:
                onChanged$17(this, obj);
                return;
            case 18:
                onChanged$18(this, obj);
                return;
            case 19:
                onChanged$19(this, obj);
                return;
            case 20:
                onChanged$20(this, obj);
                return;
            case 21:
                onChanged$21(this, obj);
                return;
            case 22:
                onChanged$22(this, obj);
                return;
            case 23:
                onChanged$23(this, obj);
                return;
            case 24:
                onChanged$24(this, obj);
                return;
            case 25:
                onChanged$25(this, obj);
                return;
            case 26:
                onChanged$26(this, obj);
                return;
            case 27:
                onChanged$27(this, obj);
                return;
            case 28:
                onChanged$28(this, obj);
                return;
            case 29:
                onChanged$29(this, obj);
                return;
            case 30:
                onChanged$30(this, obj);
                return;
            case 31:
                onChanged$31(this, obj);
                return;
            case 32:
                onChanged$32(this, obj);
                return;
            case 33:
                onChanged$33(this, obj);
                return;
            case 34:
                onChanged$34(this, obj);
                return;
            case 35:
                onChanged$35(this, obj);
                return;
            case 36:
                onChanged$36(this, obj);
                return;
            case 37:
                onChanged$37(this, obj);
                return;
            case 38:
                onChanged$38(this, obj);
                return;
            case 39:
                onChanged$39(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onChanged$40(this, obj);
                return;
            case 41:
                onChanged$41(this, obj);
                return;
            case 42:
                onChanged$42(this, obj);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onChanged$43(this, obj);
                return;
            case 44:
                onChanged$44(this, obj);
                return;
            case 45:
                onChanged$45(this, obj);
                return;
            case 46:
                onChanged$46(this, obj);
                return;
            case 47:
                onChanged$47(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                onChanged$48(this, obj);
                return;
            case C61447O9r.LJIIJ:
                onChanged$49(this, obj);
                return;
            case 50:
                onChanged$50(this, obj);
                return;
            case 51:
                onChanged$51(this, obj);
                return;
            case 52:
                onChanged$52(this, obj);
                return;
            case 53:
                onChanged$53(this, obj);
                return;
            case 54:
                onChanged$54(this, obj);
                return;
            case 55:
                onChanged$55(this, obj);
                return;
            case 56:
                onChanged$56(this, obj);
                return;
            case 57:
                onChanged$57(this, obj);
                return;
            case 58:
                onChanged$58(this, obj);
                return;
            case 59:
                onChanged$59(this, obj);
                return;
            case 60:
                onChanged$60(this, obj);
                return;
            case 61:
                onChanged$61(this, obj);
                return;
            case BaseNotice.CREATOR /* 62 */:
                onChanged$62(this, obj);
                return;
            default:
                return;
        }
    }

    public AObserverS78S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Collection collection = (Collection) obj;
        AbstractC029409q adapter = ((RecyclerView) ((DiscoveryFragment) aObserverS78S0100000_10.l0)._$_findCachedViewById(R.id.fuc)).getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.base.LoadMoreAdapterWrapper");
        AbstractC029409q<RecyclerView.ViewHolder> abstractC029409q = ((C73207SoF) adapter).LJLIL;
        o.LJII(abstractC029409q, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.list.CategoryListAdapter");
        C56619MJz c56619MJz = (C56619MJz) abstractC029409q;
        if (collection == null) {
            return;
        }
        ((ArrayList) c56619MJz.LJLIL).clear();
        ((ArrayList) c56619MJz.LJLIL).addAll(collection);
        c56619MJz.notifyDataSetChanged();
    }

    public static final void onChanged$1(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Boolean it = (Boolean) obj;
        DiscoveryFragment discoveryFragment = (DiscoveryFragment) aObserverS78S0100000_10.l0;
        o.LJIIIIZZ(it, "it");
        boolean booleanValue = it.booleanValue();
        AbstractC029409q adapter = ((RecyclerView) discoveryFragment._$_findCachedViewById(R.id.fuc)).getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.base.LoadMoreAdapterWrapper");
        C61938OSo c61938OSo = (C61938OSo) adapter;
        if (booleanValue) {
            c61938OSo.LJZ(1);
        } else {
            c61938OSo.LJZ(2);
        }
    }

    public static final void onChanged$10(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Boolean clean = (Boolean) obj;
        o.LJIIIIZZ(clean, "clean");
        if (clean.booleanValue()) {
            ((BgWidget) aObserverS78S0100000_10.l0).LJZI().animate().alpha(0.0f).setDuration(200L).start();
        } else {
            ((BgWidget) aObserverS78S0100000_10.l0).LJZI().animate().alpha(1.0f).setDuration(200L).start();
        }
    }

    public static final void onChanged$11(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme aweme;
        Aweme aweme2 = null;
        if (!C53254KvC.LIZ()) {
            ((BgWidget) aObserverS78S0100000_10.l0).LJZL().setVisibility(8);
            ((BgWidget) aObserverS78S0100000_10.l0).LJZ().setVisibility(8);
            ((BgWidget) aObserverS78S0100000_10.l0).LL().setVisibility(8);
            if (C53200KuK.LIZ()) {
                ((BgWidget) aObserverS78S0100000_10.l0).LJZL().setBackground(null);
                ((BgWidget) aObserverS78S0100000_10.l0).LJZ().setBackground(null);
                ((BgWidget) aObserverS78S0100000_10.l0).LL().setBackground(null);
            }
        }
        BgWidget bgWidget = (BgWidget) aObserverS78S0100000_10.l0;
        if (bgWidget.LLF().isShowing()) {
            C86343Xud LJLZ = bgWidget.LJLZ();
            if (LJLZ != null) {
                aweme = LJLZ.LIZ;
            } else {
                aweme = null;
            }
            if (C79081V1x.LJIJJ(aweme)) {
                ONY LLF = bgWidget.LLF();
                EnumC61773OMf enumC61773OMf = EnumC61773OMf.SWIPE;
                C86343Xud LJLZ2 = bgWidget.LJLZ();
                if (LJLZ2 != null) {
                    aweme2 = LJLZ2.LIZ;
                }
                LLF.LJI(enumC61773OMf, aweme2);
            }
            OO3 oo3 = bgWidget.LJLLL;
            if (oo3 != null) {
                oo3.LJIIJJI();
            }
        }
    }

    public static final void onChanged$12(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme aweme;
        ONY LLF = ((BgWidget) aObserverS78S0100000_10.l0).LLF();
        C86343Xud LJLZ = ((BgWidget) aObserverS78S0100000_10.l0).LJLZ();
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        LLF.LIZLLL(aweme, false);
    }

    public static final void onChanged$13(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme aweme;
        ONY LLF = ((BgWidget) aObserverS78S0100000_10.l0).LLF();
        C86343Xud LJLZ = ((BgWidget) aObserverS78S0100000_10.l0).LJLZ();
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        LLF.LIZLLL(aweme, true);
    }

    public static final void onChanged$14(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        ((BgWidget) aObserverS78S0100000_10.l0).LLF().LIZJ();
        OO3 oo3 = ((BgWidget) aObserverS78S0100000_10.l0).LJLLL;
        if (oo3 != null) {
            oo3.LJFF(null, null);
        }
        OO3 oo32 = ((BgWidget) aObserverS78S0100000_10.l0).LJLLL;
        if (oo32 != null) {
            oo32.LJIIL();
        }
    }

    public static final void onChanged$15(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        LiveRoomStruct liveRoomStruct;
        String str;
        String str2;
        OU0 ou0 = (OU0) obj;
        int i = ou0.LIZIZ;
        UrlModel urlModel = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                BgWidget bgWidget = (BgWidget) aObserverS78S0100000_10.l0;
                FilterInfoData filterInfoData = ou0.LIZ;
                bgWidget.getClass();
                if (filterInfoData != null) {
                    str = filterInfoData.reason;
                } else {
                    str = null;
                }
                if (C38354F3m.LIZJ(str, "pause")) {
                    bgWidget.LL().setVisibility(8);
                    return;
                }
                if (filterInfoData != null) {
                    str2 = filterInfoData.reason;
                } else {
                    str2 = null;
                }
                if (C38354F3m.LIZJ(str2, "nostream")) {
                    bgWidget.LJZL().setVisibility(8);
                    return;
                }
                bgWidget.LJZL().setVisibility(8);
                bgWidget.LJZ().setVisibility(8);
                bgWidget.LL().setVisibility(8);
                if (!C53200KuK.LIZ()) {
                    return;
                }
                bgWidget.LJZL().setBackground(null);
                bgWidget.LJZ().setBackground(null);
                bgWidget.LL().setBackground(null);
                return;
            }
            BgWidget bgWidget2 = (BgWidget) aObserverS78S0100000_10.l0;
            C86343Xud LJLZ = bgWidget2.LJLZ();
            if (LJLZ != null && (liveRoomStruct = LJLZ.LIZIZ) != null) {
                bgWidget2.LJZ().setVisibility(0);
                UrlModel urlModel2 = liveRoomStruct.roomCover;
                if (urlModel2 == null) {
                    User user = liveRoomStruct.owner;
                    if (user != null) {
                        urlModel = user.getAvatarLarger();
                    }
                } else {
                    urlModel = urlModel2;
                }
                bgWidget2.LJZ().post(new RunnableC78794UwA(C60996Nwm.LJIIIIZZ(bgWidget2.context), C60996Nwm.LJ(bgWidget2.context), liveRoomStruct.blurredCover, bgWidget2, urlModel));
            }
            Object value = bgWidget2.LJLJLJ.getValue();
            o.LJIIIIZZ(value, "<get-mPauseAnimView>(...)");
            C15490jB.LJ((View) value, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_pause_live_anim.webp");
            bgWidget2.LJZL().setVisibility(0);
            LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) bgWidget2.LJZ.getValue();
            if (livePreviewGuideEnterVM == null) {
                return;
            }
            livePreviewGuideEnterVM.LJLLL = true;
            livePreviewGuideEnterVM.mv0();
            return;
        }
        BgWidget bgWidget3 = (BgWidget) aObserverS78S0100000_10.l0;
        bgWidget3.LJZ().setVisibility(0);
        bgWidget3.LL().setVisibility(0);
        bgWidget3.LJZ().setImageDrawable(null);
        bgWidget3.LJZ().setBackground(C15380j0.LJI(R.drawable.bpl));
        LivePreviewGuideEnterVM livePreviewGuideEnterVM2 = (LivePreviewGuideEnterVM) bgWidget3.LJZ.getValue();
        if (livePreviewGuideEnterVM2 == null) {
            return;
        }
        livePreviewGuideEnterVM2.LJLLL = true;
        livePreviewGuideEnterVM2.mv0();
    }

    public static final void onChanged$16(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Boolean it = (Boolean) obj;
        BgWidget bgWidget = (BgWidget) aObserverS78S0100000_10.l0;
        o.LJIIIIZZ(it, "it");
        bgWidget.LLFFF(it.booleanValue());
    }

    public static final void onChanged$17(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        FrameLayout frameLayout;
        OO7 oo7;
        OO3 oo3 = ((BgWidget) aObserverS78S0100000_10.l0).LJLLL;
        if (oo3 == null || (frameLayout = oo3.LJIL) == null || (oo7 = oo3.LJIJ) == null) {
            return;
        }
        frameLayout.post(new ARunnableS7S0310000_10(frameLayout, oo7, false, oo3, 0));
    }

    public static final void onChanged$18(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        LiveRoomStruct liveRoomStruct;
        FypRecommendInfo ecommerceFypRecommendInfo;
        Integer it = (Integer) obj;
        C86343Xud LJLZ = ((InteractionAnimationWidget) aObserverS78S0100000_10.l0).LJLZ();
        boolean z = true;
        if (LJLZ != null && (liveRoomStruct = LJLZ.LIZIZ) != null && (ecommerceFypRecommendInfo = liveRoomStruct.getEcommerceFypRecommendInfo()) != null && 1 == ecommerceFypRecommendInfo.getDisplayStyle()) {
            o.LJIIIIZZ(it, "it");
            if (it.intValue() > 0) {
                InteractionAnimationWidget interactionAnimationWidget = (InteractionAnimationWidget) aObserverS78S0100000_10.l0;
                if (!interactionAnimationWidget.LJLJLJ) {
                    return;
                }
                interactionAnimationWidget.LJLJLJ = false;
                interactionAnimationWidget.LJZL().animate().cancel();
                interactionAnimationWidget.LJZL().setTranslationY(0.0f);
                interactionAnimationWidget.LJLJL.post(new ARunnableS46S0100000_10(interactionAnimationWidget, 232));
                return;
            }
            InteractionAnimationWidget interactionAnimationWidget2 = (InteractionAnimationWidget) aObserverS78S0100000_10.l0;
            if (it.intValue() != -1) {
                z = false;
            }
            interactionAnimationWidget2.LJZ(z);
        }
    }

    public static final void onChanged$19(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) ((InteractionAnimationWidget) aObserverS78S0100000_10.l0).LJLJJL.getValue();
        if (livePreviewGuideEnterVM == null) {
            return;
        }
        livePreviewGuideEnterVM.LJLJL = ((InteractionAnimationWidget) aObserverS78S0100000_10.l0).LJZL().getHeight();
    }

    public static final void onChanged$2(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Boolean it = (Boolean) obj;
        DiscoveryFragment discoveryFragment = (DiscoveryFragment) aObserverS78S0100000_10.l0;
        o.LJIIIIZZ(it, "it");
        boolean booleanValue = it.booleanValue();
        if (discoveryFragment._$_findCachedViewById(R.id.at7).isEnabled()) {
            ((SwipeRefreshLayout) discoveryFragment._$_findCachedViewById(R.id.at7)).setRefreshing(false);
            discoveryFragment._$_findCachedViewById(R.id.at7).setSelected(false);
        }
        if (discoveryFragment._$_findCachedViewById(R.id.kf_) != null) {
            if (booleanValue) {
                discoveryFragment.LJLILLLLZI = true;
                ((C73305Spp) discoveryFragment._$_findCachedViewById(R.id.kf_)).setVisibility(8);
                return;
            }
            C26045AKb c26045AKb = new C26045AKb(discoveryFragment);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            if (discoveryFragment.LJLILLLLZI) {
                ((C73305Spp) discoveryFragment._$_findCachedViewById(R.id.kf_)).setVisibility(8);
                return;
            }
            ((C73305Spp) discoveryFragment._$_findCachedViewById(R.id.kf_)).setVisibility(0);
            C73305Spp c73305Spp = (C73305Spp) discoveryFragment._$_findCachedViewById(R.id.kf_);
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new C61931OSh(discoveryFragment));
            c73305Spp.setStatus(c73306Spq);
        }
    }

    public static final void onChanged$20(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        MutableLiveData<Boolean> mutableLiveData;
        ((InteractionContainerWidget) aObserverS78S0100000_10.l0).show();
        C86343Xud LJLZ = ((InteractionContainerWidget) aObserverS78S0100000_10.l0).LJLZ();
        if (LJLZ != null && LJLZ.LIZIZ != null) {
            InteractionContainerWidget interactionContainerWidget = (InteractionContainerWidget) aObserverS78S0100000_10.l0;
            LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) interactionContainerWidget.LJLJJI.getValue();
            if (livePreviewGuideEnterVM == null || (mutableLiveData = livePreviewGuideEnterVM.LJLJJL) == null || !o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
                interactionContainerWidget.LJZ().setVisibility(0);
            }
        }
        ((InteractionContainerWidget) aObserverS78S0100000_10.l0).LJZI();
    }

    public static final void onChanged$21(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Boolean clean = (Boolean) obj;
        o.LJIIIIZZ(clean, "clean");
        if (clean.booleanValue()) {
            ((InteractionContainerWidget) aObserverS78S0100000_10.l0).LJZ().animate().alpha(0.0f).setDuration(200L).start();
        } else {
            ((InteractionContainerWidget) aObserverS78S0100000_10.l0).LJZ().animate().alpha(1.0f).setDuration(200L).start();
        }
    }

    public static final void onChanged$22(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        ((InteractionContainerWidget) aObserverS78S0100000_10.l0).LJZI();
    }

    public static final void onChanged$23(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String str;
        Aweme aweme;
        MutableLiveData<Boolean> mutableLiveData;
        ((InteractionContainerWidget) aObserverS78S0100000_10.l0).show();
        LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) ((InteractionContainerWidget) aObserverS78S0100000_10.l0).LJLJJI.getValue();
        if (livePreviewGuideEnterVM != null && (mutableLiveData = livePreviewGuideEnterVM.LJLJJL) != null && o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
            return;
        }
        C61798ONe LIZ = C55016LiW.LIZ();
        C86343Xud LJLZ = ((InteractionContainerWidget) aObserverS78S0100000_10.l0).LJLZ();
        if (LJLZ != null && (aweme = LJLZ.LIZ) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (LIZ.LIZJ(OBQ.BACKGROUND.getType(), str)) {
            ((InteractionContainerWidget) aObserverS78S0100000_10.l0).LJZ().setVisibility(8);
        } else {
            ((InteractionContainerWidget) aObserverS78S0100000_10.l0).LJZ().setVisibility(0);
        }
    }

    public static final void onChanged$24(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Boolean clean = (Boolean) obj;
        o.LJIIIIZZ(clean, "clean");
        if (clean.booleanValue()) {
            ((InteractionContainerWidget) aObserverS78S0100000_10.l0).hide();
        } else {
            ((InteractionContainerWidget) aObserverS78S0100000_10.l0).show();
        }
    }

    public static final void onChanged$25(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        C29306Beo.LJJLIIIJJI(((InteractionContainerWidget) aObserverS78S0100000_10.l0).LJZ(), !((Boolean) obj).booleanValue());
    }

    public static final void onChanged$26(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String str;
        C86343Xud LJLZ = ((ReportWidget) aObserverS78S0100000_10.l0).LJLZ();
        if (LJLZ != null) {
            str = LJLZ.LIZLLL;
        } else {
            str = null;
        }
        if (C30581Hy.LJIL(str) && C59423NTv.LIZ()) {
            Object value = ((ReportWidget) aObserverS78S0100000_10.l0).LJLILLLLZI.getValue();
            o.LJIIIIZZ(value, "<get-mLiveReport>(...)");
            C16880lQ.LJIILJJIL((FrameLayout) value, new ACListenerS30S0100000_10((ReportWidget) aObserverS78S0100000_10.l0, 48));
            Object value2 = ((ReportWidget) aObserverS78S0100000_10.l0).LJLILLLLZI.getValue();
            o.LJIIIIZZ(value2, "<get-mLiveReport>(...)");
            ((View) value2).setVisibility(0);
            return;
        }
        Object value3 = ((ReportWidget) aObserverS78S0100000_10.l0).LJLILLLLZI.getValue();
        o.LJIIIIZZ(value3, "<get-mLiveReport>(...)");
        ((View) value3).setVisibility(8);
    }

    public static final void onChanged$27(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme aweme;
        C86343Xud LJLZ = ((AdCardWidget) aObserverS78S0100000_10.l0).LJLZ();
        Aweme aweme2 = null;
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        if (C59406NTe.LJIILIIL(aweme)) {
            InterfaceC59337NQn LJZ = ((AdCardWidget) aObserverS78S0100000_10.l0).LJZ();
            C86343Xud LJLZ2 = ((AdCardWidget) aObserverS78S0100000_10.l0).LJLZ();
            if (LJLZ2 != null) {
                aweme2 = LJLZ2.LIZ;
            }
            LJZ.LIZLLL(aweme2);
            ((AdCardWidget) aObserverS78S0100000_10.l0).LJZ().LJII((C47623ImZ) ((AdCardWidget) aObserverS78S0100000_10.l0).LJLJJLL.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r9 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$28(Y.AObserverS78S0100000_10 r12, java.lang.Object r13) {
        /*
            java.lang.Object r12 = r12.l0
            com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget r12 = (com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget) r12
            X.Xud r0 = r12.LJLZ()
            r9 = 0
            if (r0 == 0) goto Ld
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r0.LIZ
        Ld:
            X.Xud r0 = r12.LJLZ()
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r13 = r0.LIZIZ
            if (r13 == 0) goto L7f
            boolean r0 = X.C59406NTe.LJIILIIL(r9)
            if (r0 == 0) goto L7f
            X.Xud r0 = r12.LJLZ()
            if (r0 == 0) goto L7f
            boolean r1 = r0.LJ
            r0 = 1
            if (r1 != r0) goto L7f
            X.NQn r0 = r12.LJZ()
            r0.LIZ()
            com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService r2 = com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl.LJJIIJZLJL()
            long r0 = r13.id
            java.lang.String r4 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = r13.owner
            java.lang.String r5 = r0.getUid()
            java.lang.String r0 = "owner.uid"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = r13.owner
            java.lang.String r8 = r0.getSecUid()
            java.lang.String r0 = "owner.secUid"
            kotlin.jvm.internal.o.LJIIIIZZ(r8, r0)
            if (r9 == 0) goto L85
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.getAwemeRawAd()
            if (r0 == 0) goto L85
            int r3 = r0.getComponentType()
        L5b:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.getAwemeRawAd()
            if (r0 == 0) goto L67
            java.lang.Long r0 = r0.getCreativeId()
            if (r0 != 0) goto L80
        L67:
            r6 = 0
        L69:
            X.Ek4 r0 = r2.LJII(r3, r4, r5, r6, r8)
            r12.LJLJL = r0
            long r10 = java.lang.System.currentTimeMillis()
            X.Ek4<com.ss.android.ugc.aweme.feed.model.LiveAdCardModel> r0 = r12.LJLJL
            if (r0 == 0) goto L7f
            X.NPu r8 = new X.NPu
            r8.<init>(r9, r10, r12, r13)
            r0.enqueue(r8)
        L7f:
            return
        L80:
            long r6 = r0.longValue()
            goto L69
        L85:
            r3 = 0
            if (r9 == 0) goto L67
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS78S0100000_10.onChanged$28(Y.AObserverS78S0100000_10, java.lang.Object):void");
    }

    public static final void onChanged$29(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme aweme;
        AdCardWidget adCardWidget = (AdCardWidget) aObserverS78S0100000_10.l0;
        C86343Xud LJLZ = adCardWidget.LJLZ();
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        if (C59406NTe.LJIILIIL(aweme)) {
            InterfaceC37276Ek4<LiveAdCardModel> interfaceC37276Ek4 = adCardWidget.LJLJL;
            if (interfaceC37276Ek4 != null) {
                interfaceC37276Ek4.cancel();
            }
            adCardWidget.LJLJL = null;
            adCardWidget.LJZ().LJI();
            adCardWidget.LJZL();
        }
    }

    public static final void onChanged$3(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            AbstractC029409q adapter = ((RecyclerView) ((DiscoveryFragment) aObserverS78S0100000_10.l0)._$_findCachedViewById(R.id.fuc)).getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.base.LoadMoreAdapterWrapper");
            ((C61938OSo) adapter).LJZ(3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$30(Y.AObserverS78S0100000_10 r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS78S0100000_10.onChanged$30(Y.AObserverS78S0100000_10, java.lang.Object):void");
    }

    public static final void onChanged$31(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        Aweme aweme2;
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        num.intValue();
        C86343Xud LJLZ = ((AdDescLabelWidget) aObserverS78S0100000_10.l0).LJLZ();
        int i = 0;
        if (LJLZ == null || (aweme = LJLZ.LIZ) == null || !C63081OpJ.LJJZ(aweme)) {
            return;
        }
        if (((AdDescLabelWidget) aObserverS78S0100000_10.l0).LJZ().getVisibility() == 0) {
            i = ((AdDescLabelWidget) aObserverS78S0100000_10.l0).LJZ().getShowTagNum();
        }
        C86343Xud LJLZ2 = ((AdDescLabelWidget) aObserverS78S0100000_10.l0).LJLZ();
        if (LJLZ2 != null && (aweme2 = LJLZ2.LIZ) != null) {
            awemeRawAd = aweme2.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        N0D.LIZ(awemeRawAd, 1, i);
    }

    public static final void onChanged$32(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme aweme;
        C86343Xud LJLZ = ((AdProductBannerWidget) aObserverS78S0100000_10.l0).LJLZ();
        Aweme aweme2 = null;
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        if (AdProductBannerWidget.LJZ(aweme)) {
            InterfaceC59736NcS LJZI = ((AdProductBannerWidget) aObserverS78S0100000_10.l0).LJZI();
            C86343Xud LJLZ2 = ((AdProductBannerWidget) aObserverS78S0100000_10.l0).LJLZ();
            if (LJLZ2 != null) {
                aweme2 = LJLZ2.LIZ;
            }
            LJZI.LIZIZ(aweme2);
        }
    }

    public static final void onChanged$33(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme aweme;
        C86343Xud LJLZ = ((AdProductBannerWidget) aObserverS78S0100000_10.l0).LJLZ();
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        if (AdProductBannerWidget.LJZ(aweme)) {
            ((AdProductBannerWidget) aObserverS78S0100000_10.l0).LJZI().LIZ();
        }
    }

    public static final void onChanged$34(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme aweme;
        C86343Xud LJLZ = ((AdProductBannerWidget) aObserverS78S0100000_10.l0).LJLZ();
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        if (AdProductBannerWidget.LJZ(aweme)) {
            ((AdProductBannerWidget) aObserverS78S0100000_10.l0).LJZI().LIZJ();
        }
    }

    public static final void onChanged$35(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme aweme;
        C86343Xud LJLZ = ((AdProductBannerWidget) aObserverS78S0100000_10.l0).LJLZ();
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        if (AdProductBannerWidget.LJZ(aweme)) {
            ((AdProductBannerWidget) aObserverS78S0100000_10.l0).LJZI().LIZLLL();
        }
    }

    public static final void onChanged$36(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        ((LivePreviewPausedWidget) aObserverS78S0100000_10.l0).LJZI().setVisibility(8);
        ((LivePreviewPausedWidget) aObserverS78S0100000_10.l0).LJZ().setVisibility(8);
        ((LivePreviewPausedWidget) aObserverS78S0100000_10.l0).LJZL().setVisibility(8);
        if (C53200KuK.LIZ()) {
            ((LivePreviewPausedWidget) aObserverS78S0100000_10.l0).LJZI().setBackground(null);
            ((LivePreviewPausedWidget) aObserverS78S0100000_10.l0).LJZ().setBackground(null);
            ((LivePreviewPausedWidget) aObserverS78S0100000_10.l0).LJZL().setBackground(null);
        }
    }

    public static final void onChanged$37(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        LiveRoomStruct liveRoomStruct;
        String str;
        String str2;
        OU0 ou0 = (OU0) obj;
        int i = ou0.LIZIZ;
        UrlModel urlModel = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LivePreviewPausedWidget livePreviewPausedWidget = (LivePreviewPausedWidget) aObserverS78S0100000_10.l0;
                FilterInfoData filterInfoData = ou0.LIZ;
                livePreviewPausedWidget.getClass();
                if (filterInfoData != null) {
                    str = filterInfoData.reason;
                } else {
                    str = null;
                }
                if (C38354F3m.LIZJ(str, "pause")) {
                    livePreviewPausedWidget.LJZL().setVisibility(8);
                    return;
                }
                if (filterInfoData != null) {
                    str2 = filterInfoData.reason;
                } else {
                    str2 = null;
                }
                if (C38354F3m.LIZJ(str2, "nostream")) {
                    livePreviewPausedWidget.LJZI().setVisibility(8);
                    return;
                }
                livePreviewPausedWidget.LJZI().setVisibility(8);
                livePreviewPausedWidget.LJZ().setVisibility(8);
                livePreviewPausedWidget.LJZL().setVisibility(8);
                if (!C53200KuK.LIZ()) {
                    return;
                }
                livePreviewPausedWidget.LJZI().setBackground(null);
                livePreviewPausedWidget.LJZ().setBackground(null);
                livePreviewPausedWidget.LJZL().setBackground(null);
                return;
            }
            LivePreviewPausedWidget livePreviewPausedWidget2 = (LivePreviewPausedWidget) aObserverS78S0100000_10.l0;
            C86343Xud LJLZ = livePreviewPausedWidget2.LJLZ();
            if (LJLZ != null && (liveRoomStruct = LJLZ.LIZIZ) != null) {
                livePreviewPausedWidget2.LJZ().setVisibility(0);
                UrlModel urlModel2 = liveRoomStruct.roomCover;
                if (urlModel2 == null) {
                    User user = liveRoomStruct.owner;
                    if (user != null) {
                        urlModel = user.getAvatarLarger();
                    }
                } else {
                    urlModel = urlModel2;
                }
                livePreviewPausedWidget2.LJZ().post(new ARunnableS4S0202000_13(C60996Nwm.LJIIIIZZ(livePreviewPausedWidget2.context), C60996Nwm.LJ(livePreviewPausedWidget2.context), urlModel, livePreviewPausedWidget2, 2));
            }
            Object value = livePreviewPausedWidget2.LJLJJL.getValue();
            o.LJIIIIZZ(value, "<get-pauseAnimView>(...)");
            C15490jB.LJ((View) value, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_pause_live_anim.webp");
            livePreviewPausedWidget2.LJZI().setVisibility(0);
            LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) livePreviewPausedWidget2.LJLJL.getValue();
            if (livePreviewGuideEnterVM == null) {
                return;
            }
            livePreviewGuideEnterVM.LJLLL = true;
            livePreviewGuideEnterVM.mv0();
            return;
        }
        LivePreviewPausedWidget livePreviewPausedWidget3 = (LivePreviewPausedWidget) aObserverS78S0100000_10.l0;
        livePreviewPausedWidget3.LJZ().setVisibility(0);
        livePreviewPausedWidget3.LJZL().setVisibility(0);
        livePreviewPausedWidget3.LJZ().setImageDrawable(null);
        livePreviewPausedWidget3.LJZ().setBackground(C15380j0.LJI(R.drawable.bpl));
        LivePreviewGuideEnterVM livePreviewGuideEnterVM2 = (LivePreviewGuideEnterVM) livePreviewPausedWidget3.LJLJL.getValue();
        if (livePreviewGuideEnterVM2 == null) {
            return;
        }
        livePreviewGuideEnterVM2.LJLLL = true;
        livePreviewGuideEnterVM2.mv0();
    }

    public static final void onChanged$38(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String aid = (String) obj;
        o.LJIIIZ(aid, "aid");
        if (((C59316NPs) aObserverS78S0100000_10.l0).LLLLZIL(aid)) {
            ((C59316NPs) aObserverS78S0100000_10.l0).G();
        }
    }

    public static final void onChanged$39(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String aid = (String) obj;
        o.LJIIIZ(aid, "aid");
        if (((C59316NPs) aObserverS78S0100000_10.l0).LLLLZIL(aid)) {
            ((C59316NPs) aObserverS78S0100000_10.l0).H();
        }
    }

    public static final void onChanged$4(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        boolean z;
        AuthInfoResponseData authInfoResponseData = (AuthInfoResponseData) obj;
        if (authInfoResponseData != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS78S0100000_10.l0;
            if (authInfoResponseData.errorCode == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                baseI18nAuthorizedFragment.LJLLJ = Boolean.valueOf(authInfoResponseData.canSkipConfirm);
                baseI18nAuthorizedFragment.LJLLILLLL = authInfoResponseData.clientName;
                OTN.LIZJ(baseI18nAuthorizedFragment.vl(), "/passport/open/auth_info/v2/");
                baseI18nAuthorizedFragment.Ml(authInfoResponseData.canSkipConfirm);
                return;
            }
            C188727au vl = baseI18nAuthorizedFragment.vl();
            Integer valueOf = Integer.valueOf(authInfoResponseData.errorCode);
            String str = authInfoResponseData.LIZ;
            if (str == null) {
                str = authInfoResponseData.description;
            }
            Context requireContext = baseI18nAuthorizedFragment.requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            OTN.LIZIZ(vl, valueOf, str, "/passport/open/auth_info/v2/", requireContext);
            int i = authInfoResponseData.errorCode;
            if (i == -1) {
                baseI18nAuthorizedFragment.Ml(false);
            } else {
                BaseI18nAuthorizedFragment.Gl(baseI18nAuthorizedFragment, OT1.LIZ(i, OTS.SERVER_ERROR, authInfoResponseData.description));
            }
        }
    }

    public static final void onChanged$40(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String aid = (String) obj;
        o.LJIIIZ(aid, "aid");
        if (((C59316NPs) aObserverS78S0100000_10.l0).LLLLZIL(aid)) {
            ((C59316NPs) aObserverS78S0100000_10.l0).LLLLZ("shake_web_block");
        }
    }

    public static final void onChanged$41(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String aid = (String) obj;
        o.LJIIIZ(aid, "aid");
        if (((C59316NPs) aObserverS78S0100000_10.l0).LLLLZIL(aid)) {
            ((C59316NPs) aObserverS78S0100000_10.l0).o("shake_web_block");
        }
    }

    public static final void onChanged$42(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String it = (String) obj;
        C60116Nia c60116Nia = (C60116Nia) aObserverS78S0100000_10.l0;
        o.LJIIIIZZ(it, "it");
        c60116Nia.LJLJI = it;
        C60116Nia c60116Nia2 = (C60116Nia) aObserverS78S0100000_10.l0;
        c60116Nia2.LJJIII(c60116Nia2.LIZJ());
        if (o.LJ(((C60116Nia) aObserverS78S0100000_10.l0).LJLJI, "loading")) {
            ((C60116Nia) aObserverS78S0100000_10.l0).LJIILJJIL("");
            ((C60116Nia) aObserverS78S0100000_10.l0).LJLJI = "safe";
        }
    }

    public static final void onChanged$43(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String it = (String) obj;
        if (o.LJ(C60119Nid.LIZ, "not_secure") || o.LJ(C60119Nid.LIZ, "protection")) {
            C60116Nia c60116Nia = (C60116Nia) aObserverS78S0100000_10.l0;
            o.LJIIIIZZ(it, "it");
            c60116Nia.LJIILJJIL(it);
        }
    }

    public static final void onChanged$44(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Boolean it = (Boolean) obj;
        NGR ngr = ((ViewOnClickListenerC59350NRa) aObserverS78S0100000_10.l0).LJLLILLLL;
        o.LJIIIIZZ(it, "it");
        ngr.LJI = it.booleanValue();
    }

    public static final void onChanged$45(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Boolean it = (Boolean) obj;
        NGR ngr = ((ViewOnClickListenerC59350NRa) aObserverS78S0100000_10.l0).LJLLILLLL;
        o.LJIIIIZZ(it, "it");
        ngr.LJII = it.booleanValue();
    }

    public static final void onChanged$46(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String it = (String) obj;
        C60126Nik c60126Nik = (C60126Nik) aObserverS78S0100000_10.l0;
        o.LJIIIIZZ(it, "it");
        c60126Nik.LJLJI = it;
        C60126Nik c60126Nik2 = (C60126Nik) aObserverS78S0100000_10.l0;
        c60126Nik2.LJJIII(c60126Nik2.LIZJ());
        if (o.LJ(((C60126Nik) aObserverS78S0100000_10.l0).LJLJI, "loading")) {
            ((C60126Nik) aObserverS78S0100000_10.l0).LJIILJJIL("");
            ((C60126Nik) aObserverS78S0100000_10.l0).LJLJI = "safe";
        }
    }

    public static final void onChanged$47(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String it = (String) obj;
        if (C60983NwZ.LIZ()) {
            C60126Nik c60126Nik = (C60126Nik) aObserverS78S0100000_10.l0;
            o.LJIIIIZZ(it, "it");
            c60126Nik.LJIILJJIL(it);
        }
    }

    public static final void onChanged$48(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        ShareInviteContentFragment shareInviteContentFragment = (ShareInviteContentFragment) aObserverS78S0100000_10.l0;
        shareInviteContentFragment.getClass();
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(shareInviteContentFragment, 164);
        C113914dX c113914dX = shareInviteContentFragment.LJLIL;
        if (c113914dX != null) {
            c113914dX.animate().translationX(C32151Nz.LJIIZILJ(-10)).setDuration(200L).withEndAction(aRunnableS46S0100000_10).start();
        } else {
            o.LJIJI("shareChannelBar");
            throw null;
        }
    }

    public static final void onChanged$49(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        List it = (List) obj;
        KidsFeedFragment kidsFeedFragment = (KidsFeedFragment) aObserverS78S0100000_10.l0;
        o.LJIIIIZZ(it, "it");
        kidsFeedFragment.LJLJJI.setDatas(ORZ.LLJILJILJ(it));
        int i = 0;
        if (it.isEmpty()) {
            kidsFeedFragment.LJLJJI.handlePagePause(false);
            return;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            String localClassName = LJIIIIZZ.getLocalClassName();
            o.LJIIIIZZ(localClassName, "topActivity.localClassName");
            if (s.LJJJLZIJ(localClassName, "UniversalPopupActivity", false)) {
                kidsFeedFragment.LJLJJI.handlePagePause(false);
                return;
            }
        }
        if (kidsFeedFragment.LJLJLJ && kidsFeedFragment.isActive()) {
            kidsFeedFragment.LJLJLJ = false;
            kidsFeedFragment.LJLJJI.startPlay();
            return;
        }
        if (!C78685UuP.LJJJZ(kidsFeedFragment.LJLJL)) {
            return;
        }
        KidsFeedViewModel kidsFeedViewModel = kidsFeedFragment.LJLLLLLL;
        if (kidsFeedViewModel != null) {
            String str = kidsFeedFragment.LJLJL;
            if (str == null) {
                str = "";
            }
            List<Aweme> value = kidsFeedViewModel.LJLILLLLZI.getValue();
            if (value == null) {
                value = C61878OQg.INSTANCE;
            }
            Iterator<Aweme> it2 = value.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int i3 = i2 + 1;
                if (TextUtils.equals(it2.next().getAid(), str)) {
                    i = i2;
                    break;
                }
                i2 = i3;
            }
            if (i < it.size()) {
                kidsFeedFragment.LJLJJI.setCurItem(i);
            }
            kidsFeedFragment.LJLJL = null;
            return;
        }
        o.LJIJI("feedViewModel");
        throw null;
    }

    public static final void onChanged$5(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        List<AuthorizedScope> scopeList;
        OTR otr;
        AuthorizedPage authorizedPage = (AuthorizedPage) obj;
        if (authorizedPage != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS78S0100000_10.l0;
            Integer statusCode = authorizedPage.getStatusCode();
            if (statusCode == null || statusCode.intValue() != 0) {
                Integer statusCode2 = authorizedPage.getStatusCode();
                if (statusCode2 == null || statusCode2.intValue() == -1) {
                    otr = new OTR(-1, OTS.TEMPORARILY_UNAVAILABLE);
                } else if (statusCode2.intValue() == 1 || statusCode2.intValue() == 4) {
                    otr = new OTR(statusCode2.intValue(), OTS.SERVER_ERROR);
                } else if (statusCode2.intValue() == 3004051) {
                    otr = new OTR(statusCode2.intValue(), OTS.INVALID_SCOPE);
                } else if (statusCode2.intValue() == 3004049) {
                    otr = new OTR(statusCode2.intValue(), OTS.UNAUTHORIZED_CLIENT);
                } else if (statusCode2.intValue() == 5 || statusCode2.intValue() == 3004048 || statusCode2.intValue() == 3004050 || statusCode2.intValue() == 3004052 || statusCode2.intValue() == 3004056) {
                    otr = new OTR(statusCode2.intValue(), OTS.INVALID_REQUEST);
                } else {
                    otr = new OTR(-2, OTS.ACCESS_DENIED);
                }
                C61948OSy LIZIZ = OT1.LIZIZ(otr.LIZ, otr.LIZIZ.getValue(), authorizedPage.getStatusMsg(), null);
                C188727au vl = baseI18nAuthorizedFragment.vl();
                Integer statusCode3 = authorizedPage.getStatusCode();
                String statusMsg = authorizedPage.getStatusMsg();
                Context requireContext = baseI18nAuthorizedFragment.requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                OTN.LIZIZ(vl, statusCode3, statusMsg, "/aweme/v1/openapi/authorized/page/detail/", requireContext);
                BaseI18nAuthorizedFragment.Gl(baseI18nAuthorizedFragment, LIZIZ);
                return;
            }
            OTN.LIZJ(baseI18nAuthorizedFragment.vl(), "/aweme/v1/openapi/authorized/page/detail/");
            Boolean isLite = authorizedPage.isLite();
            if (isLite != null && isLite.booleanValue()) {
                baseI18nAuthorizedFragment.Kl(authorizedPage);
                baseI18nAuthorizedFragment.Jl(authorizedPage);
                return;
            }
            AuthorizedPageDetail pageDetail = authorizedPage.getPageDetail();
            if (pageDetail != null && (scopeList = pageDetail.getScopeList()) != null) {
                int size = scopeList.size();
                String str = null;
                for (int i = 0; i < size; i++) {
                    str = C60652Zp.LIZ(i, str, scopeList);
                }
                AuthCommonViewModel authCommonViewModel = baseI18nAuthorizedFragment.LJLJI;
                if (authCommonViewModel != null) {
                    authCommonViewModel.LJLL.postValue(ORZ.LLILII(new IDComparatorS29S0000000_1(12), scopeList));
                    OT6 ot6 = baseI18nAuthorizedFragment.LJLJJI;
                    if (ot6 != null) {
                        ot6.LJII = str;
                        Bundle arguments = baseI18nAuthorizedFragment.getArguments();
                        o.LJI(arguments);
                        arguments.putString("_bytedance_params_scope", str);
                        baseI18nAuthorizedFragment.Kl(authorizedPage);
                        baseI18nAuthorizedFragment.Jl(authorizedPage);
                        return;
                    }
                    o.LJIJI("request");
                    throw null;
                }
                o.LJIJI("viewModel");
                throw null;
            }
            BaseI18nAuthorizedFragment.Gl(baseI18nAuthorizedFragment, OT1.LIZ(-1, OTS.INVALID_SCOPE, null));
        }
    }

    public static final void onChanged$50(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Integer it = (Integer) obj;
        KidsFeedFragment kidsFeedFragment = (KidsFeedFragment) aObserverS78S0100000_10.l0;
        o.LJIIIIZZ(it, "it");
        kidsFeedFragment.vl(it.intValue());
    }

    public static final void onChanged$51(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Integer it = (Integer) obj;
        KidsFeedFragment kidsFeedFragment = (KidsFeedFragment) aObserverS78S0100000_10.l0;
        o.LJIIIIZZ(it, "it");
        kidsFeedFragment.vl(it.intValue());
    }

    public static final void onChanged$52(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        C63030OoU viewState = (C63030OoU) obj;
        AppealDialogActivity appealDialogActivity = (AppealDialogActivity) aObserverS78S0100000_10.l0;
        o.LJIIIIZZ(viewState, "viewState");
        appealDialogActivity.getClass();
        C26227ARb c26227ARb = new C26227ARb(appealDialogActivity);
        c26227ARb.LJFF(viewState.LIZ);
        c26227ARb.LIZIZ(viewState.LIZIZ);
        UC0.LIZJ(c26227ARb, new AqS141S0200000_10(viewState, appealDialogActivity, 68));
        C63035OoZ c63035OoZ = viewState.LJFF;
        if (c63035OoZ != null) {
            TuxTextView tuxTextView = new TuxTextView(appealDialogActivity, null, 6, 0);
            tuxTextView.setMovementMethod(AnonymousClass898.LIZ);
            tuxTextView.setGravity(17);
            C72062SPy c72062SPy = new C72062SPy();
            c72062SPy.LIZLLL(c63035OoZ.LJLIL);
            c72062SPy.LIZ = true;
            c72062SPy.LIZIZ(42);
            c72062SPy.LJ(1);
            c72062SPy.LJFF = new AqS160S0100000_10(c63035OoZ, 596);
            tuxTextView.setText(c72062SPy.LIZ(appealDialogActivity));
            C77119UOl.LJFF(c26227ARb, tuxTextView);
        }
        c26227ARb.LIZLLL(new AqS176S0100000_10(viewState, LiveCoverMinSizeSetting.DEFAULT));
        C26231ARf LJI = c26227ARb.LJI();
        LJI.LJIIIIZZ();
        LJI.LIZLLL();
        appealDialogActivity.LJLJI = LJI;
    }

    public static final void onChanged$53(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        int i;
        C45382HrW c45382HrW = (C45382HrW) obj;
        if (c45382HrW != null) {
            C62826OlC c62826OlC = (C62826OlC) aObserverS78S0100000_10.l0;
            c62826OlC.getClass();
            if (C45382HrW.LIZLLL == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateDownloadView stats.currentDownloadAweme[");
                LIZ.append(C45382HrW.LIZLLL);
                LIZ.append("] is null");
                C7XD.LIZ("NowDownloadBottomView", X1D.LIZIZ(LIZ));
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateDownloadView stats[");
            LIZ2.append(C45382HrW.LIZIZ);
            LIZ2.append(']');
            C7XD.LIZ("NowDownloadBottomView", X1D.LIZIZ(LIZ2));
            int i2 = C45382HrW.LIZIZ;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                if (i2 != 7) {
                                    return;
                                }
                                c62826OlC.LIZJ(false);
                                if (c62826OlC.LIZ() == null) {
                                    return;
                                }
                                C62828OlE.LJI();
                                return;
                            }
                            if ((c62826OlC.LIZIZ == 1 && Z89.LIZIZ.LJII()) || ((c62826OlC.LIZIZ == 1 && Z89.LIZIZ.LIZ()) || (c62826OlC.LIZIZ == 1 && Z89.LIZIZ.LJIILIIL()))) {
                                C57392Nb LIZ3 = c62826OlC.LIZ();
                                if (LIZ3 != null) {
                                    LIZ3.setVideoDownloadClickListener((C2NO) c62826OlC.LJI.getValue());
                                }
                                C57392Nb LIZ4 = c62826OlC.LIZ();
                                if (LIZ4 != null) {
                                    C62828OlE.LIZIZ(LIZ4, C45382HrW.LJ, c45382HrW, 12);
                                }
                                C44938HkM.LJIIZILJ = false;
                                c62826OlC.LIZJ(true);
                                c62826OlC.LIZJ.sendEmptyMessageDelayed(1, 20000L);
                                return;
                            }
                            c62826OlC.LIZJ(false);
                            return;
                        }
                        C57392Nb LIZ5 = c62826OlC.LIZ();
                        if (LIZ5 != null) {
                            LIZ5.setType(c62826OlC.LIZIZ);
                        }
                        if ((c62826OlC.LIZIZ == 1 && Z89.LIZIZ.LJII()) || ((c62826OlC.LIZIZ == 1 && Z89.LIZIZ.LIZ()) || (c62826OlC.LIZIZ == 1 && Z89.LIZIZ.LJIILIIL()))) {
                            C57392Nb LIZ6 = c62826OlC.LIZ();
                            if (LIZ6 != null) {
                                boolean z = C45382HrW.LJ;
                                C57392Nb LIZ7 = c62826OlC.LIZ();
                                if (LIZ7 != null) {
                                    i = LIZ7.getSuccessDownloadMediaNumber();
                                } else {
                                    i = 1;
                                }
                                C62828OlE.LIZLLL(LIZ6, z, i, c45382HrW, 8);
                            }
                            c62826OlC.LIZJ(true);
                            c62826OlC.LIZJ.sendEmptyMessageDelayed(1, 3000L);
                            return;
                        }
                        c62826OlC.LIZJ(false);
                        return;
                    }
                    c62826OlC.LIZJ(false);
                    return;
                }
                C57392Nb LIZ8 = c62826OlC.LIZ();
                if (LIZ8 == null) {
                    return;
                }
                LIZ8.LJIIJ(C45382HrW.LIZJ);
                return;
            }
            C57392Nb LIZ9 = c62826OlC.LIZ();
            if (LIZ9 != null) {
                LIZ9.LJII();
            }
            c62826OlC.LIZJ(true);
            C44938HkM.LJIIZILJ = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r6, "retry") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$54(Y.AObserverS78S0100000_10 r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS78S0100000_10.onChanged$54(Y.AObserverS78S0100000_10, java.lang.Object):void");
    }

    public static final void onChanged$55(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String str;
        NativeSiteConfig nativeSiteConfig;
        String lynxScheme;
        Aweme it = (Aweme) obj;
        ShakeEgg shakeEgg = (ShakeEgg) aObserverS78S0100000_10.l0;
        o.LJIIIIZZ(it, "it");
        shakeEgg.getClass();
        Bundle bundle = new Bundle();
        NLW LIZ = NGL.LIZ();
        if (LIZ != null) {
            LIZ.LJIIIIZZ(shakeEgg.LJLIL, bundle, it);
        }
        AwemeRawAd awemeRawAd = it.getAwemeRawAd();
        if (awemeRawAd != null) {
            str = awemeRawAd.getNativeSiteCustomData();
        } else {
            str = null;
        }
        bundle.putString("bundle_native_site_custom_data", str);
        ShakeEggVM shakeEggVM = shakeEgg.LJLILLLLZI;
        if (shakeEggVM != null) {
            shakeEggVM.LJLJJI = bundle;
            m LIZ2 = NG2.LIZ(shakeEgg.LJLIL, it);
            NHO nho = NHO.LIZIZ;
            LIZ2.LJJIIZ("shake_data", nho.LJ(nho.LIZIZ(it), shakeEgg.LJLIL));
            AwemeRawAd awemeRawAd2 = it.getAwemeRawAd();
            if (awemeRawAd2 != null && (nativeSiteConfig = awemeRawAd2.getNativeSiteConfig()) != null && (lynxScheme = nativeSiteConfig.getLynxScheme()) != null) {
                LIZ2.LJJIIZ("lynxSchema", lynxScheme);
            }
            ShakeEggVM shakeEggVM2 = shakeEgg.LJLILLLLZI;
            if (shakeEggVM2 != null) {
                shakeEggVM2.LJLJJL = LIZ2.toString();
                ((ShakeEgg) aObserverS78S0100000_10.l0).LIZIZ().setAweme(it);
                ((ShakeEgg) aObserverS78S0100000_10.l0).LJIIIIZZ(it, true);
                return;
            }
            o.LJIJI("shakeEggVM");
            throw null;
        }
        o.LJIJI("shakeEggVM");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$56(Y.AObserverS78S0100000_10 r8, java.lang.Object r9) {
        /*
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.ss.android.ugc.aweme.feed.model.Aweme) r9
            X.NHO r0 = X.NHO.LIZIZ
            com.ss.android.ugc.aweme.commercialize.model.ShakeModel r7 = r0.LIZIZ(r9)
            if (r7 != 0) goto Lb
        La:
            return
        Lb:
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg r2 = (com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg) r2
            r6 = 0
            r2.LJLL = r6
            com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM r1 = r2.LJLILLLLZI
            r5 = 0
            java.lang.String r4 = "shakeEggVM"
            if (r1 == 0) goto L8c
            r0 = 1
            r1.LJLILLLLZI = r0
            r2.LJLJLJ = r0
            r2.LJLJLLL = r0
            androidx.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r1.LJLIL
            java.lang.Object r3 = r0.getValue()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            if (r3 == 0) goto L49
            java.lang.Object r2 = r8.l0
            com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg r2 = (com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg) r2
            java.lang.String r1 = r3.getAid()
            java.lang.String r0 = r9.getAid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L60
            com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM r0 = r2.LJLILLLLZI
            if (r0 == 0) goto L84
            androidx.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.LJLIL
            r0.setValue(r9)
        L45:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L56
        L49:
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg r0 = (com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg) r0
            com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L80
            androidx.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.LJLIL
            r0.setValue(r9)
        L56:
            java.lang.Object r1 = r8.l0
            com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg r1 = (com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg) r1
            X.NLL r0 = X.NLL.SELECT
            r1.LJIIJJI(r0)
            goto La
        L60:
            boolean r0 = r2.LJLJJL
            if (r0 == 0) goto L68
            boolean r0 = r2.LJLJJLL
            if (r0 != 0) goto L6c
        L68:
            r2.LJIIIIZZ(r3, r6)
            goto L45
        L6c:
            boolean r0 = r7.getShaken()
            if (r0 != 0) goto L45
            boolean r0 = r2.LJLJL
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM r0 = r2.LJLILLLLZI
            if (r0 == 0) goto L88
            androidx.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.LJLIL
            r0.setValue(r9)
            goto L45
        L80:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L84:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L88:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        L8c:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS78S0100000_10.onChanged$56(Y.AObserverS78S0100000_10, java.lang.Object):void");
    }

    public static final void onChanged$57(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        ((ShakeEgg) aObserverS78S0100000_10.l0).LJIILJJIL();
    }

    public static final void onChanged$58(AObserverS78S0100000_10 aObserverS78S0100000_10, Object it) {
        if (!((ArrayList) ((ShakeEgg) aObserverS78S0100000_10.l0).LJLJJI).contains(it)) {
            List<String> list = ((ShakeEgg) aObserverS78S0100000_10.l0).LJLJJI;
            o.LJIIIIZZ(it, "it");
            ((ArrayList) list).add(it);
            ((ShakeEgg) aObserverS78S0100000_10.l0).LJ();
        }
    }

    public static final void onChanged$59(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        if (((ArrayList) ((ShakeEgg) aObserverS78S0100000_10.l0).LJLJJI).contains(obj)) {
            ((ArrayList) ((ShakeEgg) aObserverS78S0100000_10.l0).LJLJJI).remove(obj);
            if (((ArrayList) ((ShakeEgg) aObserverS78S0100000_10.l0).LJLJJI).isEmpty()) {
                if (o.LJ(obj, "ad_mask_block")) {
                    NHO nho = NHO.LIZIZ;
                    ShakeEggVM shakeEggVM = ((ShakeEgg) aObserverS78S0100000_10.l0).LJLILLLLZI;
                    if (shakeEggVM != null) {
                        ShakeModel LIZIZ = nho.LIZIZ(shakeEggVM.LJLIL.getValue());
                        if (LIZIZ == null || LIZIZ.getShowTime() != 0) {
                            return;
                        }
                    } else {
                        o.LJIJI("shakeEggVM");
                        throw null;
                    }
                }
                ((ShakeEgg) aObserverS78S0100000_10.l0).LJIILIIL();
            }
        }
    }

    public static final void onChanged$6(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        String str;
        ScanCommonResponse scanCommonResponse = (ScanCommonResponse) obj;
        if (scanCommonResponse != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS78S0100000_10.l0;
            if (TextUtils.equals("success", scanCommonResponse.message)) {
                AuthCommonViewModel authCommonViewModel = baseI18nAuthorizedFragment.LJLJI;
                if (authCommonViewModel != null) {
                    String Al = baseI18nAuthorizedFragment.Al();
                    if (Al == null) {
                        Al = "";
                    }
                    int i = baseI18nAuthorizedFragment.LJLJL;
                    OT6 ot6 = baseI18nAuthorizedFragment.LJLJJI;
                    if (ot6 != null) {
                        String LIZ = OTL.LIZ(ot6);
                        o.LJIIIIZZ(LIZ, "getScope(request)");
                        authCommonViewModel.hv0(i, Al, LIZ, null, null, baseI18nAuthorizedFragment.xl(), baseI18nAuthorizedFragment.wl(), false);
                        return;
                    }
                    o.LJIJI("request");
                    throw null;
                }
                o.LJIJI("viewModel");
                throw null;
            }
            ScanCommonResponseData scanCommonResponseData = scanCommonResponse.scanCommonResponseData;
            if (scanCommonResponseData != null) {
                str = scanCommonResponseData.description;
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            DialogC25756A8y dialogC25756A8y = baseI18nAuthorizedFragment.LJLJJLL;
            if (dialogC25756A8y != null) {
                dialogC25756A8y.hide();
                Context context = baseI18nAuthorizedFragment.getContext();
                if (context == null) {
                    return;
                }
                C26227ARb c26227ARb = new C26227ARb(context);
                c26227ARb.LJ(R.string.hx6);
                c26227ARb.LIZIZ(valueOf);
                c26227ARb.LJII = false;
                UC0.LIZJ(c26227ARb, new AqS172S0100000_6(baseI18nAuthorizedFragment, 1));
                c26227ARb.LJI().LIZLLL();
                return;
            }
            o.LJIJI("authLoading");
            throw null;
        }
    }

    public static final void onChanged$60(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        ((ShakeEgg) aObserverS78S0100000_10.l0).LJIILIIL();
    }

    public static final void onChanged$61(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme value;
        String aid;
        ShakeEggVM shakeEggVM = ((ShakeEgg) aObserverS78S0100000_10.l0).LJLILLLLZI;
        if (shakeEggVM != null) {
            if (shakeEggVM.LJLJI && (value = shakeEggVM.LJLIL.getValue()) != null && (aid = value.getAid()) != null) {
                shakeEggVM.LJLLL.setValue(aid);
                return;
            }
            return;
        }
        o.LJIJI("shakeEggVM");
        throw null;
    }

    public static final void onChanged$62(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        ShakeEgg shakeEgg = (ShakeEgg) aObserverS78S0100000_10.l0;
        ShakeEggVM shakeEggVM = shakeEgg.LJLILLLLZI;
        if (shakeEggVM != null) {
            if (shakeEggVM.LJLILLLLZI) {
                shakeEgg.LJIILJJIL();
            }
            ShakeEgg shakeEgg2 = (ShakeEgg) aObserverS78S0100000_10.l0;
            int i = shakeEgg2.LJLL + 1;
            shakeEgg2.LJLL = i;
            if (i >= ShakeEggSetting.LIZ().destroyCount) {
                ((ShakeEgg) aObserverS78S0100000_10.l0).LJIIJ(true);
                ((ShakeEgg) aObserverS78S0100000_10.l0).LJLL = 0;
                return;
            }
            return;
        }
        o.LJIJI("shakeEggVM");
        throw null;
    }

    public static final void onChanged$7(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        boolean z;
        String string;
        AuthCodeResponse authCodeResponse = (AuthCodeResponse) obj;
        if (authCodeResponse != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS78S0100000_10.l0;
            String str = authCodeResponse.redirectUrl;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            String str2 = "";
            int i = -1;
            if (!z) {
                Bundle arguments = baseI18nAuthorizedFragment.getArguments();
                if (arguments == null || (string = arguments.getString("_bytedance_params_redirect_uri")) == null || string.length() == 0) {
                    String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(authCodeResponse.redirectUrl), "code");
                    if (queryParameter != null) {
                        str2 = queryParameter;
                    }
                    if (str2.length() > 0) {
                        OT6 ot6 = baseI18nAuthorizedFragment.LJLJJI;
                        if (ot6 != null) {
                            baseI18nAuthorizedFragment.Il(OT1.LIZJ(str2, ot6.LJII, ot6.LIZ, null, 8));
                            return;
                        } else {
                            o.LJIJI("request");
                            throw null;
                        }
                    }
                    Integer num = authCodeResponse.errorCode;
                    if (num != null) {
                        i = num.intValue();
                    }
                    BaseI18nAuthorizedFragment.Gl(baseI18nAuthorizedFragment, OT1.LIZIZ(i, authCodeResponse.error, authCodeResponse.errorDescription, authCodeResponse.errorMessage));
                    return;
                }
                baseI18nAuthorizedFragment.Il(OT1.LIZJ(null, null, null, authCodeResponse.redirectUrl, 7));
                return;
            }
            String str3 = authCodeResponse.code;
            if (str3 == null || str3.length() == 0) {
                Integer num2 = authCodeResponse.errorCode;
                if (num2 != null) {
                    i = num2.intValue();
                }
                BaseI18nAuthorizedFragment.Gl(baseI18nAuthorizedFragment, OT1.LIZIZ(i, authCodeResponse.error, authCodeResponse.errorDescription, authCodeResponse.errorMessage));
                return;
            }
            String str4 = authCodeResponse.code;
            if (str4 != null) {
                str2 = str4;
            }
            OT6 ot62 = baseI18nAuthorizedFragment.LJLJJI;
            if (ot62 != null) {
                baseI18nAuthorizedFragment.Il(OT1.LIZJ(str2, ot62.LJII, ot62.LIZ, null, 8));
            } else {
                o.LJIJI("request");
                throw null;
            }
        }
    }

    public static final void onChanged$8(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        C61951OTb c61951OTb = (C61951OTb) obj;
        if (c61951OTb != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS78S0100000_10.l0;
            if (c61951OTb.LJLIL) {
                DialogC25756A8y dialogC25756A8y = baseI18nAuthorizedFragment.LJLJJLL;
                if (dialogC25756A8y != null) {
                    V1B.LJLJJL(dialogC25756A8y);
                } else {
                    o.LJIJI("authLoading");
                    throw null;
                }
            }
            if (c61951OTb.LJLILLLLZI) {
                baseI18nAuthorizedFragment.Dl(OT1.LIZ(-2, OTS.ACCESS_DENIED, null));
            }
        }
    }

    public static final void onChanged$9(AObserverS78S0100000_10 aObserverS78S0100000_10, Object obj) {
        Aweme aweme;
        C86343Xud LJLZ;
        String str;
        C86343Xud LJLZ2;
        Aweme aweme2;
        Object value = ((BgWidget) aObserverS78S0100000_10.l0).LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-mRootView>(...)");
        Context context = ((BgWidget) aObserverS78S0100000_10.l0).context;
        o.LJIIIIZZ(context, "context");
        ((View) value).setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.d4, context));
        BgWidget bgWidget = (BgWidget) aObserverS78S0100000_10.l0;
        C86343Xud LJLZ3 = bgWidget.LJLZ();
        if (LJLZ3 == null || (aweme = LJLZ3.LIZ) == null || (LJLZ = bgWidget.LJLZ()) == null || (str = LJLZ.LIZLLL) == null) {
            return;
        }
        OO3 oo3 = bgWidget.LJLLL;
        if (oo3 != null) {
            oo3.LJFF(aweme, str);
        }
        C86343Xud LJLZ4 = bgWidget.LJLZ();
        if (LJLZ4 == null || !LJLZ4.LJ || (LJLZ2 = bgWidget.LJLZ()) == null || LJLZ2.LJIIJ || !OBM.LIZ(aweme, str)) {
            return;
        }
        if (bgWidget.LJLLL == null) {
            OO3 oo32 = new OO3();
            bgWidget.LJLLL = oo32;
            C86343Xud LJLZ5 = bgWidget.LJLZ();
            String str2 = null;
            if (LJLZ5 != null) {
                aweme2 = LJLZ5.LIZ;
            } else {
                aweme2 = null;
            }
            C86343Xud LJLZ6 = bgWidget.LJLZ();
            if (LJLZ6 != null) {
                str2 = LJLZ6.LIZLLL;
            }
            oo32.LJFF(aweme2, str2);
        }
        OO3 oo33 = bgWidget.LJLLL;
        if (oo33 == null) {
            return;
        }
        Context context2 = bgWidget.context;
        o.LJIIIIZZ(context2, "context");
        ONY LLF = bgWidget.LLF();
        Object value2 = bgWidget.LJLLILLLL.getValue();
        o.LJIIIIZZ(value2, "<get-surveyBackground>(...)");
        oo33.LJII(context2, LLF, (OO7) value2, (FrameLayout) bgWidget.LJLL.getValue(), null, (View) bgWidget.LJLLI.getValue(), null, null, null, null, null, null, null);
        LongPressLayout longPressLayout = (LongPressLayout) bgWidget.LJLJLLL.getValue();
        if (longPressLayout != null) {
            longPressLayout.setVideoScalingListener(oo33);
        }
        bgWidget.LLFFF(true);
        LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) bgWidget.LJZ.getValue();
        if (livePreviewGuideEnterVM == null) {
            return;
        }
        livePreviewGuideEnterVM.LJLLLL = true;
    }
}
