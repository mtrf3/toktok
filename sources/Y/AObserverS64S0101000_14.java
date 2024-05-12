package Y;

import X.AbstractC82921WgX;
import X.AbstractC82929Wgf;
import X.AbstractViewOnTouchListenerC82865Wfd;
import X.C15070iV;
import X.C161416Vd;
import X.C16880lQ;
import X.C169776lR;
import X.C29S;
import X.C2MA;
import X.C2U8;
import X.C32151Nz;
import X.C42342Gja;
import X.C44529Hdl;
import X.C44689HgL;
import X.C45927I0t;
import X.C55339Lnj;
import X.C5MM;
import X.C5NP;
import X.C78598Ut0;
import X.C81224VuG;
import X.C82849WfN;
import X.C82866Wfe;
import X.C82868Wfg;
import X.C82870Wfi;
import X.C82891Wg3;
import X.C82926Wgc;
import X.C82927Wgd;
import X.C82930Wgg;
import X.C82931Wgh;
import X.EnumC39340FcG;
import X.EnumC81223VuF;
import X.HEL;
import X.I2B;
import X.I5B;
import X.InterfaceC153045zY;
import X.InterfaceC208778Hh;
import X.InterfaceC55338Lni;
import X.InterfaceC81219VuB;
import X.InterfaceC82923WgZ;
import X.LNH;
import X.LPQ;
import X.NT2;
import X.T45;
import X.T4A;
import X.V16;
import X.ViewOnTouchListenerC82857WfV;
import X.X1D;
import X.XWG;
import X.Z9N;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.MusCountryListActivity;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.Vector;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AObserverS64S0101000_14 implements Observer {
    public final int $t;
    public int i1;
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
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS64S0101000_14 aObserverS64S0101000_14, Object obj) {
        switch (aObserverS64S0101000_14.i1) {
            case 0:
                ((RoomStatusController) aObserverS64S0101000_14.l0).refreshRoomStats((Map) obj);
                return;
            case 1:
                AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd = (AbstractViewOnTouchListenerC82865Wfd) aObserverS64S0101000_14.l0;
                I5B i5b = abstractViewOnTouchListenerC82865Wfd.LLIIIILZ;
                if (i5b == null) {
                    return;
                }
                int i = i5b.LIZJ + 90;
                i5b.LIZJ = i;
                if (i >= 360) {
                    i5b.LIZJ = 0;
                }
                if (abstractViewOnTouchListenerC82865Wfd.LLII != 0) {
                    return;
                }
                abstractViewOnTouchListenerC82865Wfd.LJZL.rv0(i5b, 0);
                return;
            default:
                Object obj2 = aObserverS64S0101000_14.l0;
                C45927I0t c45927I0t = (C45927I0t) obj;
                obj2.getClass();
                if (c45927I0t != null) {
                    c45927I0t.LIZ(new AObjectS42S0101000_5(3, obj2, 42));
                    return;
                }
                return;
        }
    }

    public static final void onChanged$1(AObserverS64S0101000_14 aObserverS64S0101000_14, Object obj) {
        switch (aObserverS64S0101000_14.i1) {
            case 0:
                ((RoomStatusController) aObserverS64S0101000_14.l0).refreshRoomRecommendStats((Map) obj);
                return;
            case 1:
                ((DetailFragment) aObserverS64S0101000_14.l0).LJLIL.LLJLLL = ((Boolean) obj).booleanValue();
                return;
            default:
                C82866Wfe c82866Wfe = (C82866Wfe) aObserverS64S0101000_14.l0;
                VideoSegment videoSegment = (VideoSegment) obj;
                if (c82866Wfe.LJZL == null) {
                    return;
                }
                c82866Wfe.LJJIJ(videoSegment, false);
                c82866Wfe.LLII = 1;
                c82866Wfe.LJZL.uv0(1);
                c82866Wfe.LJZL.iv0(videoSegment.LJII(true));
                c82866Wfe.LJLLLLLL = C44529Hdl.LIZIZ();
                c82866Wfe.LLILLJJLI = C82868Wfg.LIZ(c82866Wfe.LJZL.kv0(), c82866Wfe.LJZL.nv0());
                long LJIIJJI = c82866Wfe.LJIIJJI(Math.min(c82866Wfe.LLILLJJLI, HEL.LIZ()), false);
                c82866Wfe.LLILZIL = LJIIJJI;
                C82868Wfg c82868Wfg = c82866Wfe.LLFF;
                c82868Wfg.LIZIZ = LJIIJJI;
                long j = c82866Wfe.LLILLJJLI;
                c82866Wfe.LJZL.nv0();
                c82868Wfg.LIZJ(j);
                c82866Wfe.LJJIJL();
                long j2 = c82866Wfe.LLILZIL;
                long j3 = c82866Wfe.LLILLJJLI;
                long j4 = j2 - 0;
                c82866Wfe.LLILZIL = j4;
                c82866Wfe.LLILZIL = Math.min(j3, j4);
                c82866Wfe.LLILLL = 0L;
                c82866Wfe.LLILZ = j2;
                c82866Wfe.LJLLI.LJLI(0);
                C42342Gja c42342Gja = c82866Wfe.LLFFF;
                float f = c82866Wfe.LLFF.LIZ;
                c42342Gja.getClass();
                if (!C32151Nz.LJJIIJZLJL(c42342Gja.LJLJJLL)) {
                    ((ArrayList) c42342Gja.LJLJJLL).remove(videoSegment);
                    c42342Gja.LJLLLLLL(f, 0.0f);
                }
                c82866Wfe.LJZL.LJLZ.setValue(videoSegment);
                I5B i5b = c82866Wfe.LLIIIILZ;
                if (i5b != null) {
                    i5b.LIZIZ();
                }
                c82866Wfe.LJIJI();
                return;
        }
    }

    public static final void onChanged$10(AObserverS64S0101000_14 aObserverS64S0101000_14, Object obj) {
        C82868Wfg c82868Wfg;
        List<Effect> list;
        List<Effect> list2;
        switch (aObserverS64S0101000_14.i1) {
            case 0:
                AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd = (AbstractViewOnTouchListenerC82865Wfd) aObserverS64S0101000_14.l0;
                long longValue = ((Long) obj).longValue();
                if (abstractViewOnTouchListenerC82865Wfd.LLJ || abstractViewOnTouchListenerC82865Wfd.LLJI || (c82868Wfg = abstractViewOnTouchListenerC82865Wfd.LLFF) == null || longValue == -1 || longValue == 1) {
                    return;
                }
                abstractViewOnTouchListenerC82865Wfd.LJIILLIIL(abstractViewOnTouchListenerC82865Wfd.LJLJLLL.getStartX() + C44689HgL.LIZJ + (((float) (longValue - abstractViewOnTouchListenerC82865Wfd.LLILLL)) / c82868Wfg.LIZ), false);
                return;
            default:
                T4A t4a = (T4A) aObserverS64S0101000_14.l0;
                I2B i2b = (I2B) obj;
                t4a.getClass();
                if (i2b != null) {
                    int i = i2b.LJLIL.LJLILLLLZI;
                    int i2 = i2b.LJLILLLLZI.LJLILLLLZI;
                    if (i >= 0 && (list2 = t4a.LJI) != null && i < list2.size()) {
                        if (i2 != i) {
                            T45 t45 = t4a.LIZIZ;
                            t45.LJLJJI = i2;
                            t45.notifyItemChanged(i, ListProtector.get(t4a.LJI, i));
                        }
                        list = t4a.LJI;
                        if (list == null && i2 < list.size()) {
                            t4a.LIZIZ.notifyItemChanged(i2, ListProtector.get(t4a.LJI, i2));
                            return;
                        }
                        return;
                    }
                    if (i2 < 0) {
                        return;
                    }
                    list = t4a.LJI;
                    if (list == null) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$11(Y.AObserverS64S0101000_14 r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS64S0101000_14.onChanged$11(Y.AObserverS64S0101000_14, java.lang.Object):void");
    }

    public static final void onChanged$12(AObserverS64S0101000_14 aObserverS64S0101000_14, Object obj) {
        switch (aObserverS64S0101000_14.i1) {
            case 0:
                MusCountryListActivity musCountryListActivity = (MusCountryListActivity) ((C29S) aObserverS64S0101000_14.l0);
                String str = (String) obj;
                InterfaceC81219VuB interfaceC81219VuB = MusCountryListActivity.LJLL;
                if (interfaceC81219VuB != null) {
                    musCountryListActivity.getClass();
                    interfaceC81219VuB.onError(str);
                }
                musCountryListActivity.finish();
                return;
            default:
                UniversalPopupActivity this$0 = (UniversalPopupActivity) ((C29S) aObserverS64S0101000_14.l0);
                AbstractC82929Wgf abstractC82929Wgf = (AbstractC82929Wgf) obj;
                o.LJIIIZ(this$0, "this$0");
                if (abstractC82929Wgf instanceof C82927Wgd) {
                    String str2 = ((C82927Wgd) abstractC82929Wgf).LIZ;
                    Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str2));
                    intent.addFlags(268435456);
                    intent.addCategory("android.intent.category.BROWSABLE");
                    try {
                        C78598Ut0.LJIJJ(intent, this$0);
                        this$0.startActivity(intent);
                        return;
                    } catch (Exception unused) {
                        InterfaceC82923WgZ interfaceC82923WgZ = UniversalPopupManager.LIZJ;
                        if (interfaceC82923WgZ != null) {
                            interfaceC82923WgZ.LIZLLL(Boolean.FALSE, str2);
                            return;
                        }
                        return;
                    }
                }
                if (abstractC82929Wgf instanceof C82926Wgc) {
                    C82926Wgc c82926Wgc = (C82926Wgc) abstractC82929Wgf;
                    String str3 = c82926Wgc.LIZ;
                    boolean z = c82926Wgc.LIZIZ;
                    InterfaceC82923WgZ interfaceC82923WgZ2 = UniversalPopupManager.LIZJ;
                    if (interfaceC82923WgZ2 == null) {
                        return;
                    }
                    interfaceC82923WgZ2.LIZLLL(Boolean.valueOf(z), str3);
                    return;
                }
                if (abstractC82929Wgf instanceof C82930Wgg) {
                    this$0.finish();
                    return;
                }
                if (!(abstractC82929Wgf instanceof C82931Wgh)) {
                    return;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW");
                try {
                    intent2.setData(UriProtector.parse(o.LJIILLIIL(this$0.getPackageName(), "market://details?id=")));
                    intent2.setPackage("com.android.vending");
                    if (intent2.resolveActivity(this$0.getPackageManager()) != null) {
                        C78598Ut0.LJIJJ(intent2, this$0);
                        this$0.startActivity(intent2);
                    } else {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(UriProtector.parse(o.LJIILLIIL(this$0.getPackageName(), "https://play.google.com/store/apps/details?id=")));
                        if (intent3.resolveActivity(this$0.getPackageManager()) != null) {
                            C78598Ut0.LJIJJ(intent3, this$0);
                            this$0.startActivity(intent3);
                        }
                    }
                    return;
                } catch (Exception unused2) {
                    Intent intent4 = new Intent("android.intent.action.VIEW");
                    intent4.setData(UriProtector.parse(o.LJIILLIIL(this$0.getPackageName(), "https://play.google.com/store/apps/details?id=")));
                    if (intent4.resolveActivity(this$0.getPackageManager()) == null) {
                        return;
                    }
                    C78598Ut0.LJIJJ(intent4, this$0);
                    this$0.startActivity(intent4);
                    return;
                }
        }
    }

    public static final void onChanged$2(AObserverS64S0101000_14 aObserverS64S0101000_14, Object obj) {
        switch (aObserverS64S0101000_14.i1) {
            case 0:
                AbstractC82921WgX abstractC82921WgX = (AbstractC82921WgX) aObserverS64S0101000_14.l0;
                List<BeautyComposerInfo> list = (List) obj;
                abstractC82921WgX.getClass();
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                            for (BeautyComposerInfo beautyComposerInfo : list) {
                                List<BeautyComposerInfo> list2 = abstractC82921WgX.LJII;
                                if (list2 != null && !list2.contains(beautyComposerInfo)) {
                                    abstractC82921WgX.LJII.add(beautyComposerInfo);
                                }
                            }
                            if (abstractC82921WgX.LIZJ.k9().equals("record") && abstractC82921WgX.LIZIZ.LLJILJILJ()) {
                                abstractC82921WgX.LIZ.LLLLIIL(list, 10000);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        if (!C82891Wg3.LIZIZ()) {
                            C5NP c5np = abstractC82921WgX.LJ;
                            if (c5np != null) {
                                c5np.LIZIZ(e);
                                return;
                            }
                            return;
                        }
                        throw new RuntimeException("thx to contact dengchong.999 ...", e);
                    }
                }
                return;
            case 1:
                C161416Vd c161416Vd = (C161416Vd) aObserverS64S0101000_14.l0;
                if (!c161416Vd.LLIIL) {
                    return;
                }
                if (c161416Vd.LLFFF) {
                    c161416Vd.LJIIJ();
                }
                c161416Vd.LJIILJJIL(0, c161416Vd.LJLZ.LLIZLLLIL());
                InterfaceC153045zY interfaceC153045zY = c161416Vd.LJLZ;
                Objects.requireNonNull(c161416Vd.LJLJL.getPlayBoundary().LIZIZ);
                c161416Vd.LJZ.DM().setValue(C5MM.LIZIZ(interfaceC153045zY.LLFZ(r0.intValue())));
                return;
            default:
                ((ViewOnTouchListenerC82857WfV) aObserverS64S0101000_14.l0).LJJIJIIJIL((VideoSegment) obj);
                return;
        }
    }

    public static final void onChanged$3(AObserverS64S0101000_14 aObserverS64S0101000_14, Object obj) {
        switch (aObserverS64S0101000_14.i1) {
            case 0:
                C169776lR c169776lR = (C169776lR) aObserverS64S0101000_14.l0;
                if (!c169776lR.LJJIL) {
                    return;
                }
                C15070iV<Long, Long> playBoundary = c169776lR.LJJII.getPlayBoundary();
                Long l = playBoundary.LIZ;
                Long l2 = playBoundary.LIZIZ;
                if (l == null || l2 == null) {
                    return;
                }
                c169776lR.LJJII(l.intValue(), l2.intValue(), true);
                return;
            case 1:
                PNSAgeGateBaseFragment fragment = (PNSAgeGateBaseFragment) aObserverS64S0101000_14.l0;
                Boolean it = (Boolean) obj;
                o.LJIIIZ(fragment, "$fragment");
                o.LJIIIIZZ(it, "it");
                fragment.Jl(it.booleanValue());
                return;
            default:
                PushSettingManagerFragment pushSettingManagerFragment = (PushSettingManagerFragment) aObserverS64S0101000_14.l0;
                pushSettingManagerFragment.getClass();
                if (C81224VuG.LIZ[((EnumC81223VuF) obj).ordinal()] != 1) {
                    pushSettingManagerFragment.LJLJJL.LJIIIZ(false);
                    pushSettingManagerFragment.LLFF.LJIIIZ(false);
                    pushSettingManagerFragment.LLFFF.LJIIIZ(true);
                } else {
                    pushSettingManagerFragment.LJLJJL.LJIIIZ(true);
                    pushSettingManagerFragment.LLFF.LJIIIZ(true);
                    pushSettingManagerFragment.LLFFF.LJIIIZ(false);
                }
                pushSettingManagerFragment.LJLJI.LIZLLL();
                return;
        }
    }

    public static final void onChanged$4(AObserverS64S0101000_14 aObserverS64S0101000_14, Object obj) {
        DetailFragmentPanel Wr;
        C2MA curFeedViewHolder;
        IAdSceneService iAdSceneService;
        String aid;
        float f;
        switch (aObserverS64S0101000_14.i1) {
            case 0:
                DetailFragment detailFragment = (DetailFragment) aObserverS64S0101000_14.l0;
                Integer num = (Integer) obj;
                String mv0 = detailFragment.LJLJI.mv0(num.intValue());
                if ("page_profile".equals(mv0)) {
                    HomePageDataViewModel homePageDataViewModel = detailFragment.LJLJJL;
                    String str = homePageDataViewModel.LJLJJI;
                    Aweme aweme = homePageDataViewModel.LJLJJL;
                    String str2 = "";
                    if (aweme == null) {
                        aid = "";
                    } else {
                        aid = aweme.getAid();
                    }
                    LPQ.LIZIZ = str;
                    if (aid != null) {
                        str2 = aid;
                    }
                    LPQ.LIZJ = str2;
                    LPQ.LIZ = SystemClock.uptimeMillis();
                }
                String mv02 = detailFragment.LJLJI.mv0(num.intValue());
                if ("page_feed".equals(mv02) || "page_profile".equals(mv02)) {
                    if (num.intValue() == 0) {
                        C2U8.LIZ(new IEvent() { // from class: X.9eN
                            @Override // com.ss.android.ugc.governance.eventbus.IEvent
                            public final /* synthetic */ IEvent post() {
                                C2U8.LIZ(this);
                                return this;
                            }

                            @Override // com.ss.android.ugc.governance.eventbus.IEvent
                            public final /* synthetic */ IEvent postSticky() {
                                C2U8.LIZIZ(this);
                                return this;
                            }
                        });
                        if (detailFragment.LJLLJ != null && detailFragment.Al()) {
                            detailFragment.LJLLJ.onResume();
                        }
                    } else if (num.intValue() == 1) {
                        if (detailFragment.LJLLJ != null && detailFragment.Al()) {
                            detailFragment.LJLLJ.onPause();
                        }
                        V16.LIZJ = String.valueOf(num);
                        IDetailPageAbility Hl = detailFragment.Hl();
                        if (Hl != null && (Wr = Hl.Wr()) != null && (curFeedViewHolder = Wr.getCurFeedViewHolder()) != null) {
                            curFeedViewHolder.LJJIII(6);
                        }
                    }
                }
                if (detailFragment.LJLJJL.LJLL || detailFragment.LJLIL == null || !TextUtils.equals(mv0, "page_profile") || detailFragment.LJLL == null || (iAdSceneService = detailFragment.LJLLL) == null) {
                    return;
                }
                iAdSceneService.LIZJ();
                NT2.LJJIZ(detailFragment.LJLL, detailFragment.getContext());
                return;
            case 1:
                C82866Wfe c82866Wfe = (C82866Wfe) aObserverS64S0101000_14.l0;
                VideoEditViewModel videoEditViewModel = c82866Wfe.LJZL;
                if (videoEditViewModel == null) {
                    return;
                }
                c82866Wfe.LLII = 1;
                videoEditViewModel.uv0(1);
                c82866Wfe.LJLLLLLL = C44529Hdl.LIZIZ();
                long LIZ = C82868Wfg.LIZ(c82866Wfe.LJZL.kv0(), c82866Wfe.LJZL.nv0());
                c82866Wfe.LLILLJJLI = LIZ;
                long j = c82866Wfe.LLILZLL;
                long j2 = c82866Wfe.LLIZ;
                long j3 = j2 - j;
                c82866Wfe.LLILZIL = j3;
                long min = Math.min(LIZ, j3);
                c82866Wfe.LLILZIL = min;
                c82866Wfe.LLILLL = j;
                c82866Wfe.LLILZ = j2;
                C82868Wfg c82868Wfg = c82866Wfe.LLFF;
                c82868Wfg.LIZIZ = min;
                long j4 = c82866Wfe.LLILLJJLI;
                c82866Wfe.LJZL.nv0();
                c82868Wfg.LIZJ(j4);
                c82866Wfe.LJJIJL();
                c82866Wfe.LJZL.LJLLLL.setValue(null);
                I5B i5b = c82866Wfe.LLIIIILZ;
                if (i5b != null) {
                    i5b.LIZIZ();
                }
                c82866Wfe.LJIJI();
                c82866Wfe.LLJJ.LIZLLL();
                return;
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObserverS64S0101000_14.l0;
                Boolean bool = (Boolean) obj;
                TextView textView = videoPublishContainerScene.LLJZ;
                if (textView != null) {
                    if (bool.booleanValue()) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    textView.setAlpha(f);
                    videoPublishContainerScene.LLJZ.setEnabled(bool.booleanValue());
                    return;
                }
                return;
        }
    }

    public static final void onChanged$5(AObserverS64S0101000_14 aObserverS64S0101000_14, Object obj) {
        DetailFragmentPanel Wr;
        switch (aObserverS64S0101000_14.i1) {
            case 0:
                DetailFragment detailFragment = (DetailFragment) aObserverS64S0101000_14.l0;
                InterfaceC208778Hh interfaceC208778Hh = (InterfaceC208778Hh) obj;
                if (detailFragment.mo49getActivity() != null) {
                    Aweme LIZIZ = LNH.LIZIZ(detailFragment.mo49getActivity());
                    if (Z9N.LIZIZ.LLL(detailFragment.LJLJL.getEventType()) && LIZIZ != null && LIZIZ.isLive()) {
                        IDetailPageAbility Hl = detailFragment.Hl();
                        if (Hl == null || (Wr = Hl.Wr()) == null) {
                            return;
                        }
                        C2MA curFeedViewHolder = Wr.getCurFeedViewHolder();
                        if (!(curFeedViewHolder instanceof InterfaceC55338Lni)) {
                            return;
                        }
                        detailFragment.LJLIL.LLLFF = new C55339Lnj((InterfaceC55338Lni) curFeedViewHolder);
                        return;
                    }
                }
                if (detailFragment.LJLJL.isPlaylistCleanMode()) {
                    detailFragment.LJLIL.LLLFF = new C82870Wfi();
                    return;
                } else {
                    detailFragment.LJLIL.LLLFF = interfaceC208778Hh;
                    return;
                }
            default:
                C82866Wfe c82866Wfe = (C82866Wfe) aObserverS64S0101000_14.l0;
                VideoEditViewModel videoEditViewModel = c82866Wfe.LJZL;
                if (videoEditViewModel == null) {
                    return;
                }
                c82866Wfe.LJJIJ((VideoSegment) ListProtector.get(videoEditViewModel.kv0(), c82866Wfe.LLIIII), true);
                c82866Wfe.LLII = 1;
                c82866Wfe.LJZL.uv0(1);
                I5B i5b = c82866Wfe.LLIIIILZ;
                float f = (float) c82866Wfe.LLILLL;
                float f2 = i5b.LIZLLL;
                i5b.LIZ = f * f2;
                i5b.LIZIZ = ((float) c82866Wfe.LLILZ) * f2;
                c82866Wfe.LJZL.rv0(i5b, c82866Wfe.LLIIII);
                c82866Wfe.LJLLLLLL = C44529Hdl.LIZIZ();
                c82866Wfe.LLILLJJLI = C82868Wfg.LIZ(c82866Wfe.LJZL.kv0(), c82866Wfe.LJZL.nv0());
                long LJIIJJI = c82866Wfe.LJIIJJI(Math.min(c82866Wfe.LLILLJJLI, HEL.LIZ()), false);
                c82866Wfe.LLILZIL = LJIIJJI;
                C82868Wfg c82868Wfg = c82866Wfe.LLFF;
                c82868Wfg.LIZIZ = LJIIJJI;
                c82866Wfe.LLILLL = 0L;
                c82866Wfe.LLILZ = LJIIJJI;
                long j = c82866Wfe.LLILLJJLI;
                c82866Wfe.LJZL.nv0();
                c82868Wfg.LIZJ(j);
                c82866Wfe.LJJIJL();
                c82866Wfe.LJLLI.LJLI(0);
                c82866Wfe.LLFFF.LJLLLLLL(c82866Wfe.LLFF.LIZ, 0.0f);
                c82866Wfe.LJZL.LJLLLLLL.setValue(null);
                I5B i5b2 = c82866Wfe.LLIIIILZ;
                if (i5b2 != null) {
                    i5b2.LIZIZ();
                }
                c82866Wfe.LJIJI();
                c82866Wfe.LLJJ.LIZLLL();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$6(Y.AObserverS64S0101000_14 r8, java.lang.Object r9) {
        /*
            int r0 = r8.i1
            r2 = 0
            r6 = 1
            switch(r0) {
                case 0: goto Ldb;
                default: goto L7;
            }
        L7:
            java.lang.Object r5 = r8.l0
            com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity2 r5 = (com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity2) r5
            java.util.Vector r9 = (java.util.Vector) r9
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "popupStack"
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r0)
            java.util.Stack<X.OSZ<com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup, com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI>> r0 = r5.LJLIL
            java.util.Iterator r8 = r0.iterator()
        L1d:
            boolean r0 = r8.hasNext()
            r7 = 0
            if (r0 == 0) goto L71
            java.lang.Object r4 = r8.next()
            int r3 = r2 + 1
            if (r2 < 0) goto L6d
            X.OSZ r4 = (X.OSZ) r4
            int r0 = r9.size()
            if (r2 >= r0) goto L42
            java.lang.Object r1 = r9.get(r2)
            java.lang.Object r0 = r4.getFirst()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L6b
        L42:
            java.util.Stack<X.OSZ<com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup, com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI>> r0 = r5.LJLIL
            int r0 = r0.size()
            if (r0 <= r2) goto L71
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()     // Catch: java.lang.Exception -> L42
            r0.getClass()     // Catch: java.lang.Exception -> L42
            X.1B3 r1 = new X.1B3     // Catch: java.lang.Exception -> L42
            r1.<init>(r0)     // Catch: java.lang.Exception -> L42
            java.util.Stack<X.OSZ<com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup, com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI>> r0 = r5.LJLIL     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r0.pop()     // Catch: java.lang.Exception -> L42
            X.OSZ r0 = (X.OSZ) r0     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r0.getSecond()     // Catch: java.lang.Exception -> L42
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Exception -> L42
            r1.LJJI(r0)     // Catch: java.lang.Exception -> L42
            r1.LJIILLIIL()     // Catch: java.lang.Exception -> L42
            goto L42
        L6b:
            r2 = r3
            goto L1d
        L6d:
            X.C47261Igj.LJJJJJ()
            throw r7
        L71:
            java.util.Stack<X.OSZ<com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup, com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI>> r0 = r5.LJLIL
            int r1 = r0.size()
            int r0 = r9.size()
            X.FvF r0 = X.C78842Uww.LJJ(r1, r0)
            X.4kV r4 = r0.iterator()
        L83:
            boolean r0 = r4.LJLJI
            if (r0 == 0) goto Lb1
            int r0 = r4.nextInt()
            java.lang.Object r3 = r9.get(r0)
            com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup r3 = (com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup) r3
            X.UCf r1 = com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager2.LIZJ
            java.lang.String r0 = "newPopup"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel r0 = r5.LLFII()
            com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI r2 = r1.LIZIZ(r3, r0)
            if (r2 != 0) goto Lb2
            java.util.Stack<X.OSZ<com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup, com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI>> r0 = r5.LJLIL
            int r0 = r0.size()
            if (r0 != 0) goto Lb1
            com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel r0 = r5.LLFII()
            r0.hv0()
        Lb1:
            return
        Lb2:
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            X.1B3 r1 = X.C1B6.LIZ(r0, r0)
            int r0 = r2.vl()
            r1.LJFF = r0
            r0 = 2131364850(0x7f0a0bf2, float:1.8349549E38)
            r1.LJIIIIZZ(r0, r6, r2, r7)
            r1.LJIILLIIL()
            com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel r0 = r5.LLFII()
            r0.iv0()
            java.util.Stack<X.OSZ<com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup, com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI>> r1 = r5.LJLIL
            X.OSZ r0 = new X.OSZ
            r0.<init>(r3, r2)
            r1.add(r0)
            goto L83
        Ldb:
            java.lang.Object r2 = r8.l0
            com.bytedance.android.livesdk.feed.repository.FeedRepository r2 = (com.bytedance.android.livesdk.feed.repository.FeedRepository) r2
            X.0Ow r9 = (X.C06900Ow) r9
            r2.getClass()
            if (r9 == 0) goto Lf3
            X.0Ov r1 = r9.LIZ
            X.0Ov r0 = X.EnumC06890Ov.SUCCESS
            if (r1 != r0) goto Lf3
            X.SzJ<java.lang.Object> r1 = r2.LJLLJ
            java.lang.Object r0 = X.BTJ.LIZJ
            r1.onNext(r0)
        Lf3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS64S0101000_14.onChanged$6(Y.AObserverS64S0101000_14, java.lang.Object):void");
    }

    public static final void onChanged$7(AObserverS64S0101000_14 aObserverS64S0101000_14, Object obj) {
        float LJIIIZ;
        float f;
        switch (aObserverS64S0101000_14.i1) {
            case 0:
                UniversalPopupViewModel this$0 = (UniversalPopupViewModel) aObserverS64S0101000_14.l0;
                Boolean it = (Boolean) obj;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIIZZ(it, "it");
                if (it.booleanValue()) {
                    this$0.gv0();
                    return;
                }
                return;
            default:
                ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = (ViewOnTouchListenerC82857WfV) aObserverS64S0101000_14.l0;
                Long l = (Long) obj;
                viewOnTouchListenerC82857WfV.getClass();
                if (l == null) {
                    return;
                }
                viewOnTouchListenerC82857WfV.LLILLIZIL = l.longValue();
                C82891Wg3.LIZLLL().d(C16880lQ.LLLZI(Locale.getDefault(), "VEEffectSeekLayout->getOriginVideoPlayProgress: duration: %d", new Object[]{Long.valueOf(viewOnTouchListenerC82857WfV.LLILLIZIL)}));
                int i = viewOnTouchListenerC82857WfV.LLILLJJLI;
                long j = viewOnTouchListenerC82857WfV.LLILLIZIL;
                if (viewOnTouchListenerC82857WfV.LLFF) {
                    return;
                }
                C82891Wg3.LIZLLL().d(C16880lQ.LLLZI(Locale.getDefault(), "VEEffectSeekLayout->updateCurPointerLocation: editState: %d, currentOriginProgress: %d", new Object[]{Integer.valueOf(i), Long.valueOf(j)}));
                if (j == -1 || j == 1) {
                    return;
                }
                float f2 = 0.0f;
                if (i == 1) {
                    C82849WfN c82849WfN = viewOnTouchListenerC82857WfV.LLIIII;
                    List<VideoSegment> kv0 = viewOnTouchListenerC82857WfV.LJLJLJ.kv0();
                    float nv0 = viewOnTouchListenerC82857WfV.LJLJLJ.nv0();
                    c82849WfN.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < kv0.size(); i2++) {
                        if (!((VideoSegment) ListProtector.get(kv0, i2)).isDeleted) {
                            arrayList.add(ListProtector.get(kv0, i2));
                        }
                    }
                    long j2 = j;
                    int i3 = 0;
                    while (true) {
                        if (i3 < arrayList.size()) {
                            VideoSegment videoSegment = (VideoSegment) ListProtector.get(arrayList, i3);
                            long LJ = ((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / (videoSegment.LJIIIIZZ() * nv0);
                            if (j2 > LJ) {
                                f2 += ((float) LJ) / c82849WfN.LJ;
                                j2 -= LJ;
                                i3++;
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (i3 == 0 && ((VideoSegment) ListProtector.get(arrayList, i3)).LJIIIZ() != 0) {
                            LJIIIZ = (float) j2;
                            f = c82849WfN.LJ;
                        } else {
                            LJIIIZ = (float) (j2 - ((VideoSegment) ListProtector.get(arrayList, i3)).LJIIIZ());
                            f = c82849WfN.LJ;
                        }
                        f2 += LJIIIZ / (nv0 * f);
                    }
                    f2 -= viewOnTouchListenerC82857WfV.LLILII;
                } else if (i == 2 || i == 0) {
                    f2 = ((((float) j) * 1.0f) / viewOnTouchListenerC82857WfV.LLIIII.LJ) - viewOnTouchListenerC82857WfV.LLILII;
                }
                C5NP LIZLLL = C82891Wg3.LIZLLL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("VEEffectSeekLayout->updateCurPointerLocation2: width = ");
                LIZ.append(f2);
                LIZ.append(";time = ");
                LIZ.append(j);
                LIZ.append(" startSlideX = ");
                LIZ.append(viewOnTouchListenerC82857WfV.LJLLI.getStartX());
                LIZ.append(" startToZero = ");
                LIZ.append(viewOnTouchListenerC82857WfV.LLILII);
                LIZLLL.d(X1D.LIZIZ(LIZ));
                viewOnTouchListenerC82857WfV.LJIILLIIL(viewOnTouchListenerC82857WfV.LJLLI.getStartX() + f2, false);
                return;
        }
    }

    public static final void onChanged$8(AObserverS64S0101000_14 aObserverS64S0101000_14, Object obj) {
        InterfaceC153045zY interfaceC153045zY;
        String style;
        switch (aObserverS64S0101000_14.i1) {
            case 0:
                ((XWG) aObserverS64S0101000_14.l0).Jn((MusicModel) obj);
                return;
            case 1:
                C161416Vd c161416Vd = (C161416Vd) aObserverS64S0101000_14.l0;
                Long l = (Long) obj;
                if (!c161416Vd.LLIIL || l == null || (interfaceC153045zY = c161416Vd.LJLZ) == null) {
                    return;
                }
                c161416Vd.LJZ.DM().setValue(C5MM.LIZIZ(interfaceC153045zY.LLFZ(l.intValue())));
                return;
            default:
                UniversalPopupViewModel universalPopupViewModel = (UniversalPopupViewModel) aObserverS64S0101000_14.l0;
                Vector vector = (Vector) obj;
                universalPopupViewModel.getClass();
                Stack<UniversalPopup> stack = new Stack<>();
                int size = vector.size();
                if (size > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        UniversalPopup universalPopup = (UniversalPopup) vector.get(i);
                        if (i == vector.size() - 1) {
                            stack.add(universalPopup);
                        } else {
                            if (universalPopup == null) {
                                style = null;
                            } else {
                                style = universalPopup.getStyle();
                            }
                            if (o.LJ(style, EnumC39340FcG.FULLSCREEN.getValue())) {
                                stack.add(universalPopup);
                            }
                        }
                        if (i2 < size) {
                            i = i2;
                        }
                    }
                }
                universalPopupViewModel.LJLJJLL.setValue(stack);
                return;
        }
    }

    public static final void onChanged$9(AObserverS64S0101000_14 aObserverS64S0101000_14, Object obj) {
        switch (aObserverS64S0101000_14.i1) {
            case 0:
                aObserverS64S0101000_14.l0.getClass();
                return;
            case 1:
                C161416Vd c161416Vd = (C161416Vd) aObserverS64S0101000_14.l0;
                Boolean bool = (Boolean) obj;
                c161416Vd.getClass();
                if (bool != null && bool.booleanValue() && c161416Vd.LLFFF) {
                    c161416Vd.LJIIJ();
                    return;
                }
                return;
            default:
                ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = (ViewOnTouchListenerC82857WfV) aObserverS64S0101000_14.l0;
                I5B i5b = viewOnTouchListenerC82857WfV.LLIZ;
                int i = i5b.LIZJ + 90;
                i5b.LIZJ = i;
                if (i >= 360) {
                    i5b.LIZJ = 0;
                }
                if (viewOnTouchListenerC82857WfV.LLILLJJLI == 0) {
                    viewOnTouchListenerC82857WfV.LJLJLJ.rv0(i5b, 0);
                    return;
                }
                return;
        }
    }

    public AObserverS64S0101000_14(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
