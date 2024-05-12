package X;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32021Nm implements C0WT {
    public static C08810Wf LIZIZ;
    public static C08810Wf LIZJ;
    public static boolean LJ;
    public static Boolean LJFF;
    public static boolean LJIIIZ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static String LJIILIIL;
    public static final C32021Nm LIZ = new C32021Nm();
    public static final C5H3 LIZLLL = C78996UzQ.LJJIJIIJI(C50321yG.LJLIL);
    public static final boolean LJI = LiveComposerFilterSetting.INSTANCE.isComposerSupported();
    public static final Handler LJII = new Handler(C16880lQ.LLJJJJ());
    public static String LJIIIIZZ = "normal_video_live";
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C50331yH.LJLIL);
    public static String LJIILJJIL = InterfaceC30442Bx8.LJIJJLI.LIZJ();

    static {
        C31014CFe.LJIL = C50301yE.LJLIL;
        C31014CFe.LJJ = C50311yF.LJLIL;
    }

    public static RunnableC08820Wg LIZIZ() {
        return (RunnableC08820Wg) LIZLLL.getValue();
    }

    public static void LJIIIZ() {
        if (!o.LJ(LIZJ, LIZIZ) && LJI && C29306Beo.LJIILL() && C29306Beo.LJIILLIIL(Boolean.valueOf(LJIIIZ))) {
            if (LIZJ != null || LIZIZ != null) {
                LJIIIZ = true;
            }
            C32101Nu.LIZ(3L);
            C32101Nu.LJ(LIZJ, false);
            C32101Nu.LJ(LIZIZ, true);
            C32101Nu.LJIIL(3L);
        }
    }

    public static final void LIZ(String str) {
        String str2;
        String str3;
        C279017q.LJ("finishLog: enter from ", str, "LiveFilterLogManager");
        C08810Wf c08810Wf = LIZJ;
        if (c08810Wf != null) {
            str2 = c08810Wf.LIZ;
        } else {
            str2 = null;
        }
        BU2.LJFF = str2;
        C08810Wf c08810Wf2 = LIZJ;
        if (c08810Wf2 != null) {
            str3 = c08810Wf2.LIZIZ;
        } else {
            str3 = null;
        }
        BU2.LJI = str3;
        LIZIZ = LIZJ;
        LJIIIZ = false;
        LJIIL = LJIIJJI;
        LIZJ = null;
    }

    public static final void LIZLLL(boolean z) {
        C0NB.LIZIZ("LiveFilterLogManager", "release: remove filterEffectUseRunnable");
        LJII.removeCallbacks(LIZIZ());
        C32101Nu.LIZ(3L);
        LIZIZ = null;
        LIZJ = null;
        LJ = false;
        RunnableC08820Wg LIZIZ2 = LIZIZ();
        LIZIZ2.LJLIL = null;
        LIZIZ2.LJLILLLLZI = false;
        LIZIZ2.LJLJI = false;
        LIZIZ2.LJLJJI = null;
        if (z) {
            LJFF = null;
            LJIIIZ = false;
            LJIILJJIL = InterfaceC30442Bx8.LJIJJLI.LIZJ();
        }
    }

    public static void LJ(DataChannel dataChannel) {
        String str;
        C08810Wf c08810Wf;
        C08810Wf c08810Wf2 = LIZIZ;
        if (c08810Wf2 != null) {
            if (LIZJ != null && (c08810Wf2.LIZJ == 0.0f || (c08810Wf = LIZJ) == null || c08810Wf.LIZJ != 0.0f)) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("live_take_filter_close");
            LIZ2.LJIILLIIL(dataChannel);
            C08810Wf c08810Wf3 = LIZJ;
            String str2 = null;
            if (c08810Wf3 != null) {
                str = c08810Wf3.LIZIZ;
            } else {
                str = null;
            }
            LIZ2.LJIJJ(str, "resource_id");
            C08810Wf c08810Wf4 = LIZJ;
            if (c08810Wf4 != null) {
                str2 = c08810Wf4.LIZ;
            }
            LIZ2.LJIJJ(str2, "filter_id");
            LIZ2.LJJIIJZLJL();
        }
    }

    public static final void LJII(DataChannel dataChannel) {
        String str;
        BZI LIZ2 = C28787BRn.LIZ("pm_live_filter_use");
        LIZ2.LJIILLIIL(dataChannel);
        if (LJ) {
            str = "use";
        } else {
            str = "unused";
        }
        LIZ2.LJIJJ(str, "use_status");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIIIIZZ(DataChannel dataChannel, String str) {
        String str2;
        String str3;
        Float f;
        String str4;
        Integer num;
        long j;
        Integer num2;
        if (C29306Beo.LJJI() || C29306Beo.LJIILLIIL(InterfaceC30442Bx8.LLZZLLIL.LIZJ()) || LIZIZ == null) {
            return;
        }
        C279017q.LJ("reportFilterUseTime: enter from ", str, "LiveFilterLogManager");
        if (o.LJ(LIZIZ, LIZJ)) {
            C0NB.LIZIZ("LiveFilterLogManager", "reportFilterUseTime: current filter is the same as previous");
            return;
        }
        long LIZ2 = C30725C4b.LIZ();
        BZI LIZ3 = C28787BRn.LIZ("livesdk_live_filter_use_time");
        LIZ3.LJIILLIIL(dataChannel);
        C08810Wf c08810Wf = LIZIZ;
        if (c08810Wf == null || (str2 = c08810Wf.LJIIJ) == null) {
            str2 = "";
        }
        LIZ3.LIZJ(str2);
        C08810Wf c08810Wf2 = LIZIZ;
        Integer num3 = null;
        if (c08810Wf2 != null) {
            str3 = c08810Wf2.LIZ;
        } else {
            str3 = null;
        }
        LIZ3.LJIJJ(str3, "filter_id");
        C08810Wf c08810Wf3 = LIZIZ;
        if (c08810Wf3 != null) {
            f = Float.valueOf(c08810Wf3.LIZJ);
        } else {
            f = null;
        }
        LIZ3.LJIL("filter_value", f);
        C08810Wf c08810Wf4 = LIZIZ;
        if (c08810Wf4 != null) {
            str4 = c08810Wf4.LIZIZ;
        } else {
            str4 = null;
        }
        LIZ3.LJIJJ(str4, "resource_id");
        C08810Wf c08810Wf5 = LIZIZ;
        if (c08810Wf5 != null) {
            num = Integer.valueOf(c08810Wf5.LJFF);
        } else {
            num = null;
        }
        LIZ3.LJIJJ(num, "impr_position");
        C08810Wf c08810Wf6 = LIZIZ;
        if (c08810Wf6 != null) {
            j = c08810Wf6.LJII;
        } else {
            j = LIZ2;
        }
        I9A.LIZ(LIZ2, j, LIZ3, "use_time");
        LIZ3.LJIJJ(Integer.valueOf(LJIIL ? 1 : 0), "is_live_take_default");
        C08810Wf c08810Wf7 = LIZIZ;
        if (c08810Wf7 != null) {
            num2 = Integer.valueOf(c08810Wf7.LIZLLL);
        } else {
            num2 = null;
        }
        C08810Wf c08810Wf8 = LIZIZ;
        if (c08810Wf8 != null) {
            num3 = Integer.valueOf(c08810Wf8.LJ);
        }
        LIZ3.LJIJJ(Integer.valueOf(o.LJ(num2, num3) ? 1 : 0), "is_default_value");
        LIZ3.LJJIIJZLJL();
        if (LJI && C29306Beo.LJIILLIIL(Boolean.valueOf(LJIIIZ))) {
            C32101Nu.LIZ(3L);
            C32101Nu.LJ(LIZIZ, true);
            C32101Nu.LJIIL(3L);
        }
    }

    public final void LIZJ(String str, boolean z) {
        int i;
        int i2;
        int i3;
        C08810Wf c08810Wf = null;
        if (z) {
            LIZJ = null;
            return;
        }
        Integer index = InterfaceC30442Bx8.LJIJI.LIZJ();
        C62822Ol8 c62822Ol8 = LJIIJ;
        Object value = c62822Ol8.getValue();
        o.LJIIIIZZ(value, "<get-liveFilterManager>(...)");
        List LIZ2 = ((InterfaceC08070Tj) value).LIZ();
        o.LJIIIIZZ(index, "index");
        LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLLLL(index.intValue(), LIZ2);
        String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
        o.LJIIIIZZ(broadcastScene, "getService(IBroadcastSer…lass.java).broadcastScene");
        LJIIIIZZ = broadcastScene;
        C279017q.LJ("prepareLogData: enter from ", str, "LiveFilterLogManager");
        if (liveEffect != null && !TextUtils.isEmpty(liveEffect.getFilterId()) && !o.LJ(liveEffect.getFilterId(), CardStruct.IStatusCode.DEFAULT)) {
            Object value2 = c62822Ol8.getValue();
            o.LJIIIIZZ(value2, "<get-liveFilterManager>(...)");
            float LJI2 = ((InterfaceC08070Tj) value2).LJI(index.intValue());
            String filterId = liveEffect.getFilterId();
            if (filterId == null) {
                filterId = "";
            }
            if (liveEffect instanceof FilterModel) {
                i = ((FilterModel) liveEffect).filterConfig.LIZ;
                i2 = ((FilterModel) liveEffect).filterConfig.LIZIZ;
                i3 = ((FilterModel) liveEffect).filterConfig.LIZJ;
            } else {
                LiveEffect.ComposerConfig smallItemConfig = liveEffect.getSmallItemConfig();
                if (smallItemConfig != null) {
                    i = smallItemConfig.maxValue;
                } else {
                    i = 0;
                }
                LiveEffect.ComposerConfig smallItemConfig2 = liveEffect.getSmallItemConfig();
                if (smallItemConfig2 != null) {
                    i2 = smallItemConfig2.LIZLLL;
                } else {
                    i2 = 0;
                }
                LiveEffect.ComposerConfig smallItemConfig3 = liveEffect.getSmallItemConfig();
                if (smallItemConfig3 != null) {
                    i3 = smallItemConfig3.defaultValue;
                } else {
                    i3 = 0;
                }
            }
            int LJ2 = C12920f2.LJ(LJI2, i, i2);
            String resourceId = liveEffect.getResourceId();
            int intValue = index.intValue() + 1;
            boolean z2 = LJIIJJI;
            String str2 = LJIIIIZZ;
            String previousActionType = LJIILJJIL;
            o.LJIIIIZZ(previousActionType, "previousActionType");
            c08810Wf = new C08810Wf(filterId, resourceId, LJI2, LJ2, i3, intValue, liveEffect, C30725C4b.LIZ(), z2, str2, previousActionType, liveEffect.realId);
        }
        LIZJ = c08810Wf;
        if (o.LJ(c08810Wf, LIZIZ)) {
            LIZJ = LIZIZ;
        }
    }

    public static void LJFF(DataChannel dataChannel, String str, boolean z, boolean z2) {
        Boolean bool;
        if (C29306Beo.LJJI() || C29306Beo.LJIILLIIL(InterfaceC30442Bx8.LLZZLLIL.LIZJ())) {
            return;
        }
        C279017q.LJ("reportFilterEffectUse: enter from ", str, "LiveFilterLogManager");
        C08810Wf c08810Wf = LIZJ;
        if (c08810Wf == null) {
            LJII.removeCallbacks(LIZIZ());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("reportFilterEffectUse: previous runnable canceled ");
            LIZ2.append(str);
            C0NB.LIZIZ("LiveFilterLogManager", X1D.LIZIZ(LIZ2));
            return;
        }
        if (o.LJ(LIZIZ, c08810Wf)) {
            C0NB.LIZIZ("LiveFilterLogManager", "reportFilterEffectUse: current filter is the same as previous");
            return;
        }
        String str2 = null;
        if (z && (bool = LJFF) != null) {
            z2 = bool.booleanValue();
            LJFF = null;
        }
        C08810Wf c08810Wf2 = LIZJ;
        if (c08810Wf2 != null && c08810Wf2.LJIIJ != null) {
            if (c08810Wf2 != null) {
                str2 = c08810Wf2.LJIIJ;
            }
            z2 = o.LJ(str2, "click");
        }
        Handler handler = LJII;
        handler.removeCallbacks(LIZIZ());
        RunnableC08820Wg LIZIZ2 = LIZIZ();
        C08810Wf c08810Wf3 = LIZJ;
        LIZIZ2.LJLIL = dataChannel;
        LIZIZ2.LJLILLLLZI = z;
        LIZIZ2.LJLJI = z2;
        LIZIZ2.LJLJJI = c08810Wf3;
        handler.postDelayed(LIZIZ(), 30000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        if (X.C29306Beo.LJJIFFI(java.lang.Boolean.valueOf(r35)) == false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.ies.sdk.datachannel.DataChannel r33, java.lang.String r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32021Nm.LJI(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, boolean, boolean):void");
    }
}
