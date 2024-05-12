package X;

import com.bytedance.android.live.effect.api.LiveGameEffectFetchedChannel;
import com.bytedance.android.live.effect.model.LiveGoalInfo;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1XG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XG implements InterfaceC08080Tk {
    public static final C1XG LIZ = new C1XG();
    public static LiveEffect LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static final void LIZ() {
        C42681lw LIZ2 = C12890ez.LIZ();
        String str = C0TY.LIZIZ;
        List<LiveEffect> LIZ3 = LIZ2.LIZ(str);
        o.LJIIIIZZ(LIZ3, "LiveComposerManagerProvi…cker(EffectPanel.STICKER)");
        LIZIZ = (LiveEffect) ORZ.LJLLLL(LIZ3);
        C12890ez.LIZ().LIZLLL(str);
        if (LIZIZ == null) {
            List<LiveEffect> LIZ4 = C12890ez.LIZ().LIZ("livebackground");
            o.LJIIIIZZ(LIZ4, "LiveComposerManagerProvi…el.LIVE_BACKGROUND_PANEL)");
            LIZIZ = (LiveEffect) ORZ.LJLLLL(LIZ4);
            C12890ez.LIZ().LIZLLL("livebackground");
            if (C79081V1x.LJJI()) {
                LIZJ = true;
                LJ(true);
            } else {
                LIZLLL = true;
            }
        }
    }

    public static final void LIZJ() {
        C12890ez.LIZ().LIZLLL("livegame");
        if (LIZIZ != null) {
            if (LIZJ) {
                LIZJ = false;
                LJ(false);
                C12890ez.LIZ().LIZIZ(LIZIZ, "livebackground");
            } else if (LIZLLL) {
                LIZLLL = false;
                C12890ez.LIZ().LIZIZ(LIZIZ, "livebackground");
            } else {
                C12890ez.LIZ().LIZIZ(LIZIZ, C0TY.LIZIZ);
            }
            LIZIZ = null;
        }
    }

    public static final void LIZLLL() {
        LiveGoalInfo LJIIZILJ = C31691Mf.LJIIZILJ();
        Integer LIZJ2 = InterfaceC30442Bx8.i2.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_GOAL_EFFECT_POSITION.value");
        LJIIZILJ.effectPosition = LIZJ2.intValue();
        InterfaceC30442Bx8.g2.LIZ(OUP.LJJJLL(OUP.LJIILLIIL(LJIIZILJ)));
    }

    public static LiveEffect LIZIZ(DataChannel dataChannel) {
        List list;
        Object obj;
        List<Object> list2;
        String str;
        Object obj2 = null;
        if (dataChannel == null || (list = (List) dataChannel.kv0(LiveGameEffectFetchedChannel.class)) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((C1QC) obj).LJLIL, "livegame")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1QC c1qc = (C1QC) obj;
        if (c1qc == null || (list2 = c1qc.LJLILLLLZI) == null) {
            return null;
        }
        Iterator<Object> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Effect effect = ((LiveEffect) next).getEffect();
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            if (o.LJ(str, "draw_guess")) {
                obj2 = next;
                break;
            }
        }
        return (LiveEffect) obj2;
    }

    public static void LJ(boolean z) {
        String LJIILLIIL;
        LiveGoalInfo LJIIZILJ = C31691Mf.LJIIZILJ();
        if (z) {
            LJIIZILJ.effectPosition = 0;
        } else {
            Integer LIZJ2 = InterfaceC30442Bx8.i2.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_GOAL_EFFECT_POSITION.value");
            LJIIZILJ.effectPosition = LIZJ2.intValue();
        }
        InterfaceC30442Bx8.g2.LIZ(OUP.LJJJLL(OUP.LJIILLIIL(LJIIZILJ)));
        C42681lw LIZ2 = C12890ez.LIZ();
        if (z || (LJIILLIIL = OUP.LJIILLIIL(C31691Mf.LJIIZILJ())) == null) {
            LJIILLIIL = "";
        }
        LIZ2.setRenderCacheString("LiveGoal", LJIILLIIL);
    }
}
