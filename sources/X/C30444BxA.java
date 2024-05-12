package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.uikit.reddot.RedDotStatusChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS51S0400000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BxA */
/* loaded from: classes6.dex */
public final class C30444BxA {
    public static final void LIZ(EnumC30410Bwc enumC30410Bwc) {
        boolean z;
        EnumC30414Bwg enumC30414Bwg;
        String str;
        o.LJIIIZ(enumC30410Bwc, "<this>");
        if (enumC30410Bwc.getCurrentId().length() == 0) {
            return;
        }
        C30446BxC c30446BxC = C30446BxC.LIZ;
        c30446BxC.getClass();
        C48459J0d<java.util.Set<String>> c48459J0d = InterfaceC30442Bx8.I1;
        c48459J0d.LIZJ().add(enumC30410Bwc.getCurrentId());
        c48459J0d.LIZ(c48459J0d.LIZJ());
        ConcurrentHashMap LIZIZ = C30446BxC.LIZIZ(c30446BxC);
        String str2 = null;
        if (LIZIZ != null && LIZIZ.remove(enumC30410Bwc.getCurrentId()) != null) {
            C48459J0d<java.util.Map<String, String>> c48459J0d2 = InterfaceC30442Bx8.J1;
            java.util.Map<String, String> LIZJ = c48459J0d2.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_RED_DOT_LAST_COMPLETE_TIME.value");
            java.util.Map<String, String> map = LIZJ;
            EnumC30414Bwg enumC30414Bwg2 = C30446BxC.LJFF;
            if (enumC30414Bwg2 != null) {
                str2 = enumC30414Bwg2.page;
            }
            map.put(str2, String.valueOf(System.currentTimeMillis()));
            c48459J0d2.LIZ(c48459J0d2.LIZJ());
            z = true;
        } else {
            z = false;
        }
        HashSet LIZ = C30446BxC.LIZ(c30446BxC);
        if (LIZ != null && LIZ.remove(enumC30410Bwc.getCurrentId())) {
            z = true;
        }
        C48459J0d<java.util.Map<String, String>> c48459J0d3 = InterfaceC30442Bx8.H1;
        c48459J0d3.LIZJ().remove(enumC30410Bwc.getCurrentId());
        c48459J0d3.LIZ(c48459J0d3.LIZJ());
        DataChannel LIZJ2 = C30446BxC.LIZJ(c30446BxC);
        if (LIZJ2 != null) {
            LIZJ2.qv0(RedDotStatusChangeEvent.class, new C30450BxG(enumC30410Bwc, false));
        }
        if (!z || (enumC30414Bwg = C30446BxC.LJFF) == null) {
            return;
        }
        int i = C30413Bwf.LIZ[enumC30414Bwg.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                return;
            }
            DataChannel LIZJ3 = C30446BxC.LIZJ(c30446BxC);
            String str3 = C30446BxC.LIZIZ;
            String str4 = C30446BxC.LIZJ;
            String str5 = C30446BxC.LIZLLL;
            String valueOf = String.valueOf(enumC30410Bwc.getPageLevel().getLevel());
            String currentId = enumC30410Bwc.getCurrentId();
            if (C30446BxC.LJFF == EnumC30414Bwg.EVENT_PAGE_BROADCAST_PREVIEW) {
                str = "live_take_page";
            } else {
                str = "live_detail";
            }
            C78688UuS.LJJJZ(LIZJ3, "livesdk_anchor_red_dot_disappear", str4, str3, str5, str, valueOf, currentId);
            return;
        }
        C78688UuS.LJJL(C30446BxC.LIZJ(c30446BxC), "livesdk_audience_red_dot_disappear", C30446BxC.LIZJ, C30446BxC.LIZIZ, C30446BxC.LIZLLL, String.valueOf(enumC30410Bwc.getPageLevel().getLevel()), enumC30410Bwc.getCurrentId());
    }

    public static final boolean LJFF(EnumC30410Bwc redDot) {
        boolean z;
        C30446BxC c30446BxC = C30446BxC.LIZ;
        ConcurrentHashMap LIZIZ = C30446BxC.LIZIZ(c30446BxC);
        if (LIZIZ != null) {
            z = LIZIZ.containsValue(redDot);
        } else {
            z = false;
        }
        if (!z) {
            o.LJIIIZ(redDot, "redDot");
            HashSet LIZ = C30446BxC.LIZ(c30446BxC);
            if (LIZ == null || !LIZ.contains(redDot.getCurrentId())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LIZLLL(EnumC30410Bwc enumC30410Bwc, String version) {
        o.LJIIIZ(enumC30410Bwc, "<this>");
        o.LJIIIZ(version, "version");
        String currentId = enumC30410Bwc.getCurrentId();
        o.LJIIIZ(currentId, "currentId");
        if (enumC30410Bwc.isDynamic()) {
            C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.T1;
            java.util.Map<String, String> LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_RED_DOT_FUNCTION_VERSION.value");
            if (!LIZJ.containsKey(currentId) || !o.LJ(c48459J0d.LIZJ().get(currentId), version)) {
                java.util.Map<String, String> LIZJ2 = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ2, "LIVE_RED_DOT_FUNCTION_VERSION.value");
                LIZJ2.put(currentId, version);
                c48459J0d.LIZ(c48459J0d.LIZJ());
                C48459J0d<java.util.Set<String>> c48459J0d2 = InterfaceC30442Bx8.I1;
                c48459J0d2.LIZJ().remove(currentId);
                c48459J0d2.LIZ(c48459J0d2.LIZJ());
                C48459J0d<java.util.Map<String, String>> c48459J0d3 = InterfaceC30442Bx8.H1;
                c48459J0d3.LIZJ().remove(currentId);
                c48459J0d3.LIZ(c48459J0d3.LIZJ());
                return true;
            }
        }
        return false;
    }

    public static final void LIZIZ(EnumC30410Bwc enumC30410Bwc, LifecycleOwner lifecycleOwner, View view, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(enumC30410Bwc, "<this>");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        LJ(enumC30410Bwc, view, interfaceC88472Yns, LJFF(enumC30410Bwc));
        DataChannel LIZJ = C30446BxC.LIZJ(C30446BxC.LIZ);
        if (LIZJ != null) {
            LIZJ.lv0(lifecycleOwner, RedDotStatusChangeEvent.class, new AqS51S0400000_5(enumC30410Bwc, (EnumC30410Bwc) lifecycleOwner, (LifecycleOwner) view, (View) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 2));
        }
    }

    public static final void LJ(EnumC30410Bwc enumC30410Bwc, View view, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, boolean z) {
        String str;
        o.LJIIIZ(enumC30410Bwc, "<this>");
        if (enumC30410Bwc.getCurrentId().length() == 0) {
            return;
        }
        C30446BxC c30446BxC = C30446BxC.LIZ;
        c30446BxC.getClass();
        if (C30446BxC.LJIIJ) {
            StringBuilder LJI = JBR.LJI("state: ", z, "  id:");
            LJI.append(enumC30410Bwc.getCurrentId());
            LJI.append('}');
            C0NB.LIZIZ("function_red_dot_state_change", X1D.LIZIZ(LJI));
        }
        if (z) {
            C29306Beo.LJJLJLI(view);
            C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.H1;
            java.util.Map<String, String> LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_RED_DOT_SHOWN_VERSION_RECORD.value");
            LIZJ.put(enumC30410Bwc.getCurrentId(), String.valueOf(C30446BxC.LJIIIZ));
            c48459J0d.LIZ(c48459J0d.LIZJ());
            EnumC30414Bwg enumC30414Bwg = C30446BxC.LJFF;
            if (enumC30414Bwg != null) {
                int i = C30413Bwf.LIZ[enumC30414Bwg.ordinal()];
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        DataChannel LIZJ2 = C30446BxC.LIZJ(c30446BxC);
                        String str2 = C30446BxC.LIZJ;
                        String str3 = C30446BxC.LIZIZ;
                        String str4 = C30446BxC.LIZLLL;
                        String valueOf = String.valueOf(enumC30410Bwc.getPageLevel().getLevel());
                        String currentId = enumC30410Bwc.getCurrentId();
                        if (C30446BxC.LJFF == EnumC30414Bwg.EVENT_PAGE_BROADCAST_PREVIEW) {
                            str = "live_take_page";
                        } else {
                            str = "live_detail";
                        }
                        C78688UuS.LJJJZ(LIZJ2, "livesdk_anchor_red_dot_show", str2, str3, str4, str, valueOf, currentId);
                    }
                } else {
                    C78688UuS.LJJL(C30446BxC.LIZJ(c30446BxC), "livesdk_audience_red_dot_show", C30446BxC.LIZJ, C30446BxC.LIZIZ, "", String.valueOf(enumC30410Bwc.getPageLevel().getLevel()), enumC30410Bwc.getCurrentId());
                }
            }
        } else {
            C29306Beo.LJI(view);
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
    }

    public static /* synthetic */ void LIZJ(EnumC30410Bwc enumC30410Bwc, LifecycleOwner lifecycleOwner, View view, AqS136S0200000_5 aqS136S0200000_5, int i) {
        if ((i & 2) != 0) {
            view = null;
        }
        if ((i & 4) != 0) {
            aqS136S0200000_5 = null;
        }
        LIZIZ(enumC30410Bwc, lifecycleOwner, view, aqS136S0200000_5);
    }
}
