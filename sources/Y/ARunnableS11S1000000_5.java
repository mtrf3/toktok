package Y;

import X.C19870qF;
import X.C30770C5u;
import X.C30775C5z;
import X.C30868C9o;
import X.C31811Ce7;
import X.C48459J0d;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.other.LiveTooltipDebugSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Map;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ARunnableS11S1000000_5 implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        String str = this.s0;
        Queue<C30775C5z> queue = C30770C5u.LJFF.get(str);
        if (queue == null || queue.peek() == null) {
            return;
        }
        if (!C30770C5u.LJII) {
            C30770C5u.LJI("unable", str);
            return;
        }
        LiveTooltipDebugSetting liveTooltipDebugSetting = LiveTooltipDebugSetting.INSTANCE;
        if (liveTooltipDebugSetting.getValue().getDailyLimit() > 0) {
            i = liveTooltipDebugSetting.getValue().getDailyLimit();
        } else {
            i = 2;
        }
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.U;
        Long last = c48459J0d.LIZJ();
        long currentTimeMillis = System.currentTimeMillis();
        o.LJIIIIZZ(last, "last");
        if (((int) (last.longValue() / 86400000)) != ((int) (currentTimeMillis / 86400000))) {
            InterfaceC30442Bx8.V.LIZ(0);
            c48459J0d.LIZ(Long.valueOf(currentTimeMillis));
        }
        C48459J0d<Integer> c48459J0d2 = InterfaceC30442Bx8.V;
        Integer LIZJ = c48459J0d2.LIZJ();
        o.LJIIIIZZ(LIZJ, "TOOL_TIPS_SHOW_MANAGEMENT_COUNT.value");
        if (LIZJ.intValue() >= i) {
            C30770C5u.LJI("frequency_limit", str);
        } else {
            C30775C5z poll = queue.poll();
            C19870qF c19870qF = poll.LIZ;
            o.LJIIIIZZ(c19870qF, "param.params");
            poll.LJI = C30770C5u.LJIIIIZZ(c19870qF);
            C30770C5u.LJI = poll;
            C30770C5u.LJII(poll, str);
            c48459J0d2.LIZ(Integer.valueOf(c48459J0d2.LIZJ().intValue() + 1));
            int shortVersionCode = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getShortVersionCode();
            C48459J0d<Map<String, Double>> c48459J0d3 = InterfaceC30442Bx8.W;
            if (!c48459J0d3.LIZJ().containsKey(poll.LJFF)) {
                Map<String, Double> LIZJ2 = c48459J0d3.LIZJ();
                o.LJIIIIZZ(LIZJ2, "TOOL_TIPS_SHOW_VERSION_CODE_MAP.value");
                LIZJ2.put(poll.LJFF, Double.valueOf(shortVersionCode));
                c48459J0d3.LIZLLL();
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            C48459J0d<Map<String, Double>> c48459J0d4 = InterfaceC30442Bx8.f65X;
            Map<String, Double> LIZJ3 = c48459J0d4.LIZJ();
            o.LJIIIIZZ(LIZJ3, "TOOL_TIPS_SHOW_POSITION_TIME_MAP.value");
            LIZJ3.put(poll.LIZJ, Double.valueOf(currentTimeMillis2));
            c48459J0d4.LIZLLL();
            if (C30770C5u.LJIIIIZZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("triggerTooltip: ");
                String str2 = poll.LJFF;
                if (str2 == null) {
                    str2 = "";
                }
                C31811Ce7.LJ(LIZ, str2, LIZ, "LiveTooltip");
            }
            C30770C5u.LJI("priority", str);
        }
        C30770C5u.LIZ = false;
        C30770C5u.LIZ(str);
    }

    public static final void run$0(ARunnableS11S1000000_5 aRunnableS11S1000000_5) {
        boolean LIZ;
        try {
            C30868C9o.LJI(aRunnableS11S1000000_5.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS11S1000000_5 aRunnableS11S1000000_5) {
        boolean LIZ;
        try {
            aRunnableS11S1000000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS11S1000000_5 aRunnableS11S1000000_5) {
        boolean LIZ;
        try {
            C30868C9o.LJI(aRunnableS11S1000000_5.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS11S1000000_5(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
