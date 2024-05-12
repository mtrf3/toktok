package X;

import Y.ARunnableS11S1000000_5;
import Y.IDCListenerS241S0100000;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveMessagePlatformCommonControlBubble;
import com.bytedance.android.livesdk.livesetting.other.LiveMessagePlatformCommonPreferenceBubbleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveTooltipDebugSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveTooltip;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveTooltipAlogSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* renamed from: X.C5u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30770C5u {
    public static boolean LIZ;
    public static Handler LIZIZ;
    public static long LIZJ;
    public static EnumC30414Bwg LIZLLL;
    public static boolean LJ;
    public static C30775C5z LJI;
    public static final boolean LJIIIIZZ;
    public static final boolean LJIIIZ;
    public static final HashMap<String, Queue<C30775C5z>> LJFF = new HashMap<>();
    public static boolean LJII = true;

    static {
        boolean z;
        boolean z2 = true;
        LiveTooltipAlogSetting liveTooltipAlogSetting = LiveTooltipAlogSetting.INSTANCE;
        LiveTooltip value = liveTooltipAlogSetting.getValue();
        if (value != null && value.tooltipAlogControl == 1) {
            z = true;
        } else {
            z = false;
        }
        LJIIIIZZ = z;
        LiveTooltip value2 = liveTooltipAlogSetting.getValue();
        if (value2 == null || value2.tooltipActivityCheck != 1) {
            z2 = false;
        }
        LJIIIZ = z2;
    }

    public static void LIZ(String str) {
        Queue<C30775C5z> queue = LJFF.get(str);
        if (LJIIIIZZ) {
            if (queue != null) {
                for (C30775C5z c30775C5z : queue) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("discardedTooltip : ");
                    String str2 = c30775C5z.LJFF;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C31811Ce7.LJ(LIZ2, str2, LIZ2, "LiveTooltip");
                }
            } else {
                return;
            }
        } else if (queue == null) {
            return;
        }
        queue.clear();
    }

    public static void LIZIZ(C09 tooltipType) {
        String str;
        long j;
        o.LJIIIZ(tooltipType, "tooltipType");
        String str2 = tooltipType.key;
        C30775C5z c30775C5z = LJI;
        if (c30775C5z != null) {
            str = c30775C5z.LJFF;
        } else {
            str = null;
        }
        if (o.LJ(str2, str)) {
            C30775C5z c30775C5z2 = LJI;
            if (c30775C5z2 != null) {
                j = c30775C5z2.LJI;
            } else {
                j = 0;
            }
            C19980qQ.LIZ(j);
        }
    }

    public static void LJFF(EnumC30414Bwg eventPage) {
        o.LJIIIZ(eventPage, "eventPage");
        String str = eventPage.page;
        o.LJIIIIZZ(str, "eventPage.page");
        LJI("leave_page", str);
        String str2 = eventPage.page;
        o.LJIIIIZZ(str2, "eventPage.page");
        LIZ(str2);
    }

    public static long LJIIIIZZ(final C19870qF c19870qF) {
        if (c19870qF.LIZ == null || c19870qF.LIZIZ == null || c19870qF.LIZJ == null) {
            return 0L;
        }
        final C19940qM c19940qM = C19930qL.LIZ;
        c19940qM.getClass();
        C19920qK c19920qK = new C19920qK();
        c19920qK.LIZ = SystemClock.uptimeMillis();
        c19920qK.LIZLLL = c19870qF;
        c19920qK.LIZIZ = new InterfaceC19880qG() { // from class: X.1YJ
            @Override // X.InterfaceC19880qG
            public final void LIZ(int i) {
                C19940qM c19940qM2 = C19940qM.this;
                C19870qF c19870qF2 = c19870qF;
                c19940qM2.getClass();
                InterfaceC19880qG interfaceC19880qG = c19870qF2.LJIILIIL;
                if (interfaceC19880qG != null) {
                    interfaceC19880qG.LIZ(i);
                }
                c19940qM2.LIZJ = null;
                c19940qM2.LIZ();
            }
        };
        C19910qJ c19910qJ = (C19910qJ) ((HashMap) c19940qM.LIZIZ).get(c19870qF.LIZIZ);
        if (c19910qJ == null) {
            c19910qJ = new C19910qJ();
            ((HashMap) c19940qM.LIZIZ).put(c19920qK.LIZLLL.LIZIZ, c19910qJ);
            IDCListenerS241S0100000 iDCListenerS241S0100000 = new IDCListenerS241S0100000(c19940qM, 5);
            c19910qJ.LIZIZ = iDCListenerS241S0100000;
            c19920qK.LIZLLL.LIZIZ.addOnAttachStateChangeListener(iDCListenerS241S0100000);
        }
        ((LinkedList) c19910qJ.LIZ).add(c19920qK);
        ((LinkedList) c19940qM.LIZ).offer(c19920qK);
        c19940qM.LIZ();
        return c19920qK.LIZ;
    }

    public static void LIZLLL(C19870qF c19870qF, C09 tooltipType) {
        int i;
        boolean z;
        String str;
        BZI LIZ2;
        String str2;
        double d;
        Context context;
        ActivityC45651qj LIZIZ2;
        o.LJIIIZ(tooltipType, "tooltipType");
        if (LJIIIZ && (context = c19870qF.LIZ) != null && (LIZIZ2 = C29306Beo.LIZIZ(context)) != null && LIZIZ2.isFinishing()) {
            return;
        }
        int i2 = tooltipType.priority;
        String position = tooltipType.position;
        if (LiveMessagePlatformCommonControlBubble.INSTANCE.getValue() && !LiveTooltipDebugSetting.INSTANCE.getValue().getAllClose()) {
            LiveMessagePlatformCommonPreferenceBubbleSetting liveMessagePlatformCommonPreferenceBubbleSetting = LiveMessagePlatformCommonPreferenceBubbleSetting.INSTANCE;
            String str3 = tooltipType.key;
            o.LJIIIIZZ(str3, "tooltipType.key");
            LiveMessagePlatformBubbleConfig value = liveMessagePlatformCommonPreferenceBubbleSetting.getValue(str3);
            if (value == null) {
                return;
            }
            i2 = value.getPriority();
            i = value.getLifetime();
            if (C29306Beo.LJIJJLI(value.getPosition())) {
                position = value.getPosition();
            }
        } else {
            i = 3;
        }
        String key = tooltipType.key;
        boolean z2 = false;
        if (i2 <= 0) {
            z = true;
        } else {
            z = false;
        }
        EnumC30414Bwg enumC30414Bwg = LIZLLL;
        if (enumC30414Bwg != null) {
            str = enumC30414Bwg.page;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        o.LJIIIIZZ(position, "position");
        o.LJIIIIZZ(key, "key");
        if (LJ) {
            LIZ2 = C28787BRn.LIZ("livesdk_anchor_bubble_call");
        } else {
            LIZ2 = C28787BRn.LIZ("livesdk_bubble_call");
        }
        CharSequence LIZ3 = c19870qF.LIZ();
        if (LIZ3 == null || (str2 = LIZ3.toString()) == null) {
            str2 = "";
        }
        LIZ2.LJIJJ(str2, "content");
        if (str.length() > 0) {
            LIZ2.LJIJJ(str, "event_page");
        }
        LIZ2.LJIJJ(position, "position");
        LIZ2.LJIJJ(key, "content_id");
        C28289B8j.LIZJ(System.currentTimeMillis(), LIZJ, LIZ2, "duration");
        Queue<C30775C5z> queue = LJFF.get(str);
        C30775C5z c30775C5z = new C30775C5z(c19870qF, i2, position, System.currentTimeMillis(), key, z);
        String str4 = str;
        String str5 = position;
        c19870qF.LIZLLL(new C30771C5v(c30775C5z, str, position, key, c19870qF.LIZIZ()));
        c19870qF.LJ();
        c19870qF.LJFF();
        c19870qF.LIZJ();
        LiveTooltipDebugSetting liveTooltipDebugSetting = LiveTooltipDebugSetting.INSTANCE;
        if (liveTooltipDebugSetting.getValue().getChangeColor()) {
            c19870qF.LJIILJJIL = C15380j0.LIZIZ(R.color.a92);
        }
        if (z || liveTooltipDebugSetting.getValue().getAllClose()) {
            c30775C5z.LJI = LJIIIIZZ(c19870qF);
            LJI = c30775C5z;
            LJII(c30775C5z, str);
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.V;
            c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
            AnonymousClass030.LJFF(InterfaceC30442Bx8.U);
            C48459J0d<java.util.Map<String, Double>> c48459J0d2 = InterfaceC30442Bx8.f65X;
            java.util.Map<String, Double> LIZJ2 = c48459J0d2.LIZJ();
            o.LJIIIIZZ(LIZJ2, "TOOL_TIPS_SHOW_POSITION_TIME_MAP.value");
            LIZJ2.put(position, Double.valueOf(System.currentTimeMillis()));
            c48459J0d2.LIZLLL();
            return;
        }
        if (liveTooltipDebugSetting.getValue().getOutdateVersion() > 0) {
            i = liveTooltipDebugSetting.getValue().getOutdateVersion();
        }
        Double d2 = InterfaceC30442Bx8.W.LIZJ().get(key);
        double d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        int shortVersionCode = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getShortVersionCode();
        if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && shortVersionCode - d >= i * 100 && i > 0) {
            return;
        }
        if (liveTooltipDebugSetting.getValue().getPositionCheck() && str5.length() != 0) {
            Double d4 = InterfaceC30442Bx8.f65X.LIZJ().get(str5);
            if (d4 != null) {
                d3 = d4.doubleValue();
            }
            if (((int) (System.currentTimeMillis() / 86400000)) == ((int) (((long) d3) / 86400000))) {
                return;
            }
        }
        if (queue != null && queue.size() == 0) {
            z2 = true;
        }
        if (z2) {
            Handler handler = LIZIZ;
            if (handler != null) {
                handler.postDelayed(new ARunnableS11S1000000_5(str4, 1), 1000L);
            }
            if (LJIIIIZZ) {
                C0NB.LIZIZ("LiveTooltip", "startTooltipDelay");
            }
        }
        if (LJIIIIZZ) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("enqueue: tooltipType.key:");
            String str6 = tooltipType.key;
            if (str6 == null) {
                str6 = "";
            }
            C31811Ce7.LJ(LIZ4, str6, LIZ4, "LiveTooltip");
        }
        if (queue != null) {
            queue.add(c30775C5z);
        }
        if (!LIZ) {
            LJI("priority_limit", str4);
            LIZ(str4);
        }
    }

    public static void LJ(Handler handler, EnumC30414Bwg eventPage) {
        o.LJIIIZ(handler, "handler");
        o.LJIIIZ(eventPage, "eventPage");
        LIZ = true;
        LIZIZ = handler;
        LIZJ = System.currentTimeMillis();
        LIZLLL = eventPage;
        LJ = eventPage.isAnchor;
        HashMap<String, Queue<C30775C5z>> hashMap = LJFF;
        String str = eventPage.page;
        o.LJIIIIZZ(str, "eventPage.page");
        hashMap.put(str, new PriorityQueue(5, C30773C5x.LJLIL));
    }

    public static void LJI(String str, String str2) {
        BZI LIZ2;
        String str3;
        Queue<C30775C5z> queue = LJFF.get(str2);
        if (queue != null) {
            for (C30775C5z c30775C5z : queue) {
                if (LJ) {
                    LIZ2 = C28787BRn.LIZ("livesdk_anchor_bubble_abortion");
                } else {
                    LIZ2 = C28787BRn.LIZ("livesdk_bubble_abortion");
                }
                CharSequence LIZ3 = c30775C5z.LIZ.LIZ();
                if (LIZ3 == null || (str3 = LIZ3.toString()) == null) {
                    str3 = "";
                }
                LIZ2.LJIJJ(str3, "content");
                LIZ2.LJIJJ(str2, "event_page");
                LIZ2.LJIJJ(c30775C5z.LIZJ, "position");
                LIZ2.LJIJJ(str, "reason");
                I9A.LIZ(System.currentTimeMillis(), c30775C5z.LIZLLL, LIZ2, "duration");
                LIZ2.LJIJJ(c30775C5z.LJFF, "content_id");
                LIZ2.LJJIIJZLJL();
            }
        }
    }

    public static void LJII(C30775C5z c30775C5z, String str) {
        BZI LIZ2;
        String str2;
        if (LJ) {
            LIZ2 = C28787BRn.LIZ("livesdk_anchor_bubble_show");
        } else {
            LIZ2 = C28787BRn.LIZ("livesdk_audience_bubble_show");
        }
        CharSequence LIZ3 = c30775C5z.LIZ.LIZ();
        if (LIZ3 == null || (str2 = LIZ3.toString()) == null) {
            str2 = "";
        }
        LIZ2.LJIJJ(str2, "content");
        LIZ2.LJIJJ(str, "event_page");
        LIZ2.LJIJJ(c30775C5z.LIZJ, "position");
        LIZ2.LJIJJ(c30775C5z.LJFF, "content_id");
        LIZ2.LJJIIJZLJL();
        c30775C5z.LJ = System.currentTimeMillis();
    }

    public static void LIZJ(View view, CharSequence charSequence, C09 tooltipType, InterfaceC65784Pro onShow) {
        o.LJIIIZ(tooltipType, "tooltipType");
        o.LJIIIZ(onShow, "onShow");
        C1YG c1yg = new C1YG(view);
        c1yg.LJIILLIIL = charSequence;
        c1yg.LJIIL = new C30774C5y(onShow);
        LIZLLL(new C1YH(c1yg), tooltipType);
    }
}
