package com.ss.android.ugc.aweme.services;

import X.C0I;
import X.C0T;
import X.C188727au;
import X.C221108m2;
import X.C30597Bzd;
import X.C44172HVg;
import X.C44256HYm;
import X.C44296Ha0;
import X.C45989I3d;
import X.C45990I3e;
import X.C45991I3f;
import X.C45993I3h;
import X.C5H3;
import X.C60903NvH;
import X.C62046OWs;
import X.C65429Pm5;
import X.C82622Wbi;
import X.FMX;
import X.GXR;
import X.H78;
import X.I36;
import X.IAX;
import X.InterfaceC30508ByC;
import X.InterfaceC45979I2t;
import X.InterfaceC88472Yns;
import X.WSH;
import X.WUF;
import X.X1D;
import com.ss.android.ugc.aweme.LivePermissionApply;
import com.ss.android.ugc.aweme.LiveScenario;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DMTBottomTabIntegrationServiceImplDiff {
    public static final DMTBottomTabIntegrationServiceImplDiff INSTANCE = new DMTBottomTabIntegrationServiceImplDiff();
    public static final C5H3 liveTabPopUpKeva$delegate = C221108m2.LIZIZ(DMTBottomTabIntegrationServiceImplDiff$liveTabPopUpKeva$2.INSTANCE);
    public static long startToShowLiveTabTimeStamp;

    public final C45989I3d getLiveTabPopUpKeva() {
        return (C45989I3d) liveTabPopUpKeva$delegate.getValue();
    }

    private final boolean enableSkipCreateInfoRequest(C45989I3d c45989I3d) {
        return c45989I3d.LIZJ();
    }

    private final void logLiveTabNotShow(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("no_live_tab_reason", str);
        FMX.LJIIL("livesdk_shoot_no_live_tab_reason", c188727au.LIZ);
    }

    private final void logLiveTabNotShowInNonTT(ShortVideoContext shortVideoContext) {
        C44172HVg.LJIIZILJ.getClass();
        if (!IAX.LIZIZ()) {
            logLiveTabNotShow("bridge_no_need_live_in_record");
            return;
        }
        if (shortVideoContext.LJJJI()) {
            logLiveTabNotShow("support_duet_module");
            return;
        }
        if (!o.LJ("direct_shoot", shortVideoContext.shootWay) && !o.LJ("story", shortVideoContext.shootWay) && C44256HYm.LIZLLL(shortVideoContext)) {
            logLiveTabNotShow("live_params_not_meet");
        } else {
            if (!C44256HYm.LJFF(shortVideoContext)) {
                return;
            }
            logLiveTabNotShow("is_comment_video_mode");
        }
    }

    private final void logLiveTabNotShowInTT(ShortVideoContext shortVideoContext) {
        if (!o.LJ("direct_shoot", shortVideoContext.shootWay) && !o.LJ("story", shortVideoContext.shootWay) && C44256HYm.LIZLLL(shortVideoContext)) {
            logLiveTabNotShow("live_params_not_meet_in_tt");
        } else {
            if (!C44256HYm.LJFF(shortVideoContext)) {
                return;
            }
            logLiveTabNotShow("is_comment_video_mode_in_tt");
        }
    }

    public final void reportLiveTabNotShow(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.LJJIJIIJI()) {
            logLiveTabNotShow("is_stitch_mode");
            return;
        }
        if (C44256HYm.LJI(shortVideoContext)) {
            logLiveTabNotShow("is_from_draft_lightening");
            return;
        }
        if (C44256HYm.LJIIJ(shortVideoContext)) {
            logLiveTabNotShow("is_from_new_photo_draft");
            return;
        }
        int i = shortVideoContext.tabs;
        if (i != 0 && (i & 8) != 8) {
            logLiveTabNotShow("no_live_mask");
            return;
        }
        C60903NvH.LJIIJJI().getRegionService();
        Boolean LIZIZ = C44296Ha0.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getAPI().regionService.isInTikTokRegion");
        if (LIZIZ.booleanValue()) {
            logLiveTabNotShowInTT(shortVideoContext);
        } else {
            logLiveTabNotShowInNonTT(shortVideoContext);
        }
    }

    public final void tryShowPopupForLiveWhenFirstTime(final C82622Wbi c82622Wbi) {
        final C45989I3d c45989I3d = new C45989I3d();
        if (!c45989I3d.LIZ() && C45991I3f.LIZJ()) {
            C30597Bzd.LIZIZ(new InterfaceC30508ByC() { // from class: com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff$tryShowPopupForLiveWhenFirstTime$1
                @Override // X.InterfaceC30508ByC
                public void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC30508ByC
                public void onSuccess(Integer num) {
                    if (num == null || num.intValue() != 1) {
                        C45989I3d.this.LIZLLL(false);
                        ((C30597Bzd) C44172HVg.LJIILLIIL).LIZJ();
                        if (num == null || num.intValue() != 0) {
                            return;
                        }
                        C45989I3d c45989I3d2 = C45989I3d.this;
                        c45989I3d2.getClass();
                        C65429Pm5.LJ("never_go_live_flag_value_as_zero", C44172HVg.LJIJ.getCurrentUserID(), c45989I3d2.LIZ, true);
                        return;
                    }
                    ((C30597Bzd) C44172HVg.LJIILLIIL).LIZJ();
                    C45989I3d.this.LIZLLL(true);
                    ((InterfaceC45979I2t) c82622Wbi.LJ(InterfaceC45979I2t.class, null)).tryShowPopupForLiveTab();
                }
            });
        }
    }

    public final boolean addLiveTabInternal(final C82622Wbi c82622Wbi, final InterfaceC88472Yns<? super Integer, Integer> interfaceC88472Yns) {
        final InterfaceC45979I2t interfaceC45979I2t = (InterfaceC45979I2t) c82622Wbi.LJ(InterfaceC45979I2t.class, null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addLiveTabInternal:");
        LIZ.append(interfaceC45979I2t.isValid());
        H78.LIZ(X1D.LIZIZ(LIZ));
        if (!interfaceC45979I2t.isValid()) {
            return false;
        }
        if (C45991I3f.LIZIZ()) {
            final C45989I3d c45989I3d = new C45989I3d();
            if (c45989I3d.LIZ() && c45989I3d.LIZIZ()) {
                String currentBottomTag = interfaceC45979I2t.getCurrentBottomTag();
                INSTANCE.logGoLiveTabShowMetric(System.currentTimeMillis() - startToShowLiveTabTimeStamp, 1);
                interfaceC45979I2t.addBottomTab(interfaceC88472Yns.invoke(Integer.valueOf(interfaceC45979I2t.bottomTabSize())).intValue() - 1, new I36(c82622Wbi), 0);
                interfaceC45979I2t.resetToCurTab(currentBottomTag);
            } else {
                if (!c45989I3d.LIZ()) {
                    final boolean enableSkipCreateInfoRequest = enableSkipCreateInfoRequest(c45989I3d);
                    if (enableSkipCreateInfoRequest) {
                        INSTANCE.logGoLiveTabShowMetric(System.currentTimeMillis() - startToShowLiveTabTimeStamp, 1);
                        interfaceC45979I2t.addBottomTab(interfaceC88472Yns.invoke(Integer.valueOf(interfaceC45979I2t.bottomTabSize())).intValue(), new I36(c82622Wbi), 0);
                    }
                    C30597Bzd.LIZIZ(new InterfaceC30508ByC() { // from class: com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff$addLiveTabInternal$3
                        @Override // X.InterfaceC30508ByC
                        public void onFailed(Throwable th) {
                            if (enableSkipCreateInfoRequest) {
                                return;
                            }
                            DMTBottomTabIntegrationServiceImplDiff.INSTANCE.logGoLiveTabShowMetric(System.currentTimeMillis() - DMTBottomTabIntegrationServiceImplDiff.startToShowLiveTabTimeStamp, -3);
                        }

                        @Override // X.InterfaceC30508ByC
                        public void onSuccess(Integer num) {
                            boolean z;
                            WUF wuf = C44172HVg.LJIILLIIL;
                            if (num != null) {
                                num.intValue();
                            }
                            ((C30597Bzd) wuf).LIZJ();
                            C45989I3d c45989I3d2 = c45989I3d;
                            if (num == null || num.intValue() != 1) {
                                z = false;
                            } else {
                                z = true;
                            }
                            c45989I3d2.LIZLLL(z);
                            if (num != null && num.intValue() == 0) {
                                C45989I3d c45989I3d3 = c45989I3d;
                                c45989I3d3.getClass();
                                C65429Pm5.LJ("never_go_live_flag_value_as_zero", C44172HVg.LJIJ.getCurrentUserID(), c45989I3d3.LIZ, true);
                            }
                            if (enableSkipCreateInfoRequest) {
                                return;
                            }
                            if (c45989I3d.LIZIZ()) {
                                InterfaceC45979I2t interfaceC45979I2t2 = interfaceC45979I2t;
                                InterfaceC88472Yns<Integer, Integer> interfaceC88472Yns2 = interfaceC88472Yns;
                                C82622Wbi c82622Wbi2 = c82622Wbi;
                                String currentBottomTag2 = interfaceC45979I2t2.getCurrentBottomTag();
                                interfaceC45979I2t2.addBottomTab(interfaceC88472Yns2.invoke(Integer.valueOf(interfaceC45979I2t2.bottomTabSize())).intValue() - 1, new I36(c82622Wbi2), 0);
                                interfaceC45979I2t2.resetToCurTab(currentBottomTag2);
                                interfaceC45979I2t2.tryShowPopupForLiveTab();
                            } else {
                                InterfaceC45979I2t interfaceC45979I2t3 = interfaceC45979I2t;
                                interfaceC45979I2t3.addBottomTab(interfaceC88472Yns.invoke(Integer.valueOf(interfaceC45979I2t3.bottomTabSize())).intValue(), new I36(c82622Wbi), 0);
                            }
                            DMTBottomTabIntegrationServiceImplDiff.INSTANCE.logGoLiveTabShowMetric(System.currentTimeMillis() - DMTBottomTabIntegrationServiceImplDiff.startToShowLiveTabTimeStamp, 1);
                        }
                    });
                    return true;
                }
                INSTANCE.logGoLiveTabShowMetric(System.currentTimeMillis() - startToShowLiveTabTimeStamp, 1);
                interfaceC45979I2t.addBottomTab(interfaceC88472Yns.invoke(Integer.valueOf(interfaceC45979I2t.bottomTabSize())).intValue(), new I36(c82622Wbi), 0);
            }
        } else {
            INSTANCE.logGoLiveTabShowMetric(System.currentTimeMillis() - startToShowLiveTabTimeStamp, 1);
            interfaceC45979I2t.addBottomTab(interfaceC88472Yns.invoke(Integer.valueOf(interfaceC45979I2t.bottomTabSize())).intValue(), new I36(c82622Wbi), 0);
        }
        return false;
    }

    public final void logGoLiveTabShowMetric(long j, int i) {
        LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL();
        if (!C62046OWs.LJFF("livesdk_go_live_tab_show_performance", 0.1d)) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJ(j, "duration");
        c188727au.LIZLLL(i, "show_status_code");
        FMX.LJIIL("livesdk_go_live_tab_show_performance", c188727au.LIZ);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$1] */
    public final List<WSH> addLiveModule(final C82622Wbi diContainer, List<WSH> list, final C45990I3e context) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(list, "list");
        o.LJIIIZ(context, "context");
        startToShowLiveTabTimeStamp = System.currentTimeMillis();
        if (C44172HVg.LJIJ.isChildrenMode()) {
            DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff = INSTANCE;
            dMTBottomTabIntegrationServiceImplDiff.logGoLiveTabShowMetric(System.currentTimeMillis() - startToShowLiveTabTimeStamp, -5);
            dMTBottomTabIntegrationServiceImplDiff.logLiveTabNotShow("child_model_not_show");
        } else if (context.LJLILLLLZI.mShoutOutsData != null) {
            DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff2 = INSTANCE;
            dMTBottomTabIntegrationServiceImplDiff2.logGoLiveTabShowMetric(System.currentTimeMillis() - startToShowLiveTabTimeStamp, -6);
            dMTBottomTabIntegrationServiceImplDiff2.logLiveTabNotShow("short_video_shout_entrance");
        } else if (!C45991I3f.LIZIZ() && context.LJLILLLLZI.onlyShowLiveTab) {
            C45993I3h.LIZ = 0;
            if (context.LJLIL.invoke().booleanValue() && !context.LJLILLLLZI.onlyShowLiveTab) {
                C45993I3h.LIZ = 1;
            }
            if (!context.LJLIL.invoke().booleanValue() && context.LJLILLLLZI.onlyShowLiveTab) {
                C45993I3h.LIZ = 2;
            }
            DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff3 = INSTANCE;
            dMTBottomTabIntegrationServiceImplDiff3.logGoLiveTabShowMetric(System.currentTimeMillis() - startToShowLiveTabTimeStamp, 1);
            list.add(new I36(diContainer));
            if (!C45991I3f.LIZIZ()) {
                dMTBottomTabIntegrationServiceImplDiff3.tryShowPopupForLiveWhenFirstTime(diContainer);
            }
        } else {
            context.LJLJI.invoke();
            WUF wuf = C44172HVg.LJIILLIIL;
            ?? r3 = new C0T() { // from class: com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$1
                @Override // X.C0T
                public void onFailed(Throwable th) {
                    C45990I3e.this.LJLJJI.invoke(Boolean.FALSE);
                    DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff4 = DMTBottomTabIntegrationServiceImplDiff.INSTANCE;
                    if (dMTBottomTabIntegrationServiceImplDiff4.getLiveTabPopUpKeva().LIZJ()) {
                        dMTBottomTabIntegrationServiceImplDiff4.logGoLiveTabShowMetric(System.currentTimeMillis() - DMTBottomTabIntegrationServiceImplDiff.startToShowLiveTabTimeStamp, -2);
                    }
                }

                public void onSuccess(boolean z, LiveScenario liveScenario, LivePermissionApply livePermissionApply) {
                    if (!z) {
                        DMTBottomTabIntegrationServiceImplDiff.INSTANCE.logGoLiveTabShowMetric(System.currentTimeMillis() - DMTBottomTabIntegrationServiceImplDiff.startToShowLiveTabTimeStamp, -1);
                    }
                    if (C45990I3e.this.LJLIL.invoke().booleanValue()) {
                        C45993I3h.LIZ = 3;
                        DMTBottomTabIntegrationServiceImplDiff.INSTANCE.addLiveTabInternal(diContainer, C45990I3e.this.LJLJJL);
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", "camera");
                        GXR.LIZ("livesdk_live_entrance_show", c188727au.LIZ);
                    } else if (z) {
                        DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff4 = DMTBottomTabIntegrationServiceImplDiff.INSTANCE;
                        dMTBottomTabIntegrationServiceImplDiff4.reportLiveTabNotShow(C45990I3e.this.LJLILLLLZI);
                        dMTBottomTabIntegrationServiceImplDiff4.logGoLiveTabShowMetric(System.currentTimeMillis() - DMTBottomTabIntegrationServiceImplDiff.startToShowLiveTabTimeStamp, -4);
                    }
                    if (!C45991I3f.LIZIZ()) {
                        DMTBottomTabIntegrationServiceImplDiff.INSTANCE.tryShowPopupForLiveWhenFirstTime(diContainer);
                    }
                }

                @Override // X.C0T
                public /* bridge */ /* synthetic */ void onSuccess(Boolean bool, LiveScenario liveScenario, LivePermissionApply livePermissionApply) {
                    onSuccess(bool.booleanValue(), liveScenario, livePermissionApply);
                }
            };
            wuf.getClass();
            LiveOuterService.LJJJLL().LJJI().LIZJ(new C0I(r3), "shoot");
        }
        return list;
    }
}
