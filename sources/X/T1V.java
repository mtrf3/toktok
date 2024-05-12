package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.TrendingTopicList;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T1V implements InterfaceC48038ItG, C0K7, InterfaceC74399THv, KEA, InterfaceC84511XEt {
    public static boolean LJLILLLLZI;
    public static final T1V LJLIL = new T1V();
    public static final T1V LJLJI = new T1V();

    @Override // X.InterfaceC84511XEt
    public boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC84511XEt
    public void LIZIZ(Queue queue) {
    }

    @Override // X.InterfaceC84511XEt
    public void LJFF() {
    }

    @Override // X.KEA
    public NextLiveData LJI() {
        return null;
    }

    @Override // X.KEA
    public int LJII() {
        return -1;
    }

    @Override // X.KEA
    public String LIZJ(int i) {
        return C51214K8c.LJ(i);
    }

    @Override // X.KEA
    public String LJ(int i) {
        if (i >= 0) {
            if (i == C51214K8c.LJI()) {
                return "shop";
            }
            if (i == C51214K8c.LJII()) {
                return "store";
            }
            if (i == C51214K8c.LIZLLL()) {
                return "ecom_live";
            }
            if (i == ((ArrayList) C51214K8c.LIZIZ).indexOf(KAK.ORDER)) {
                return "order";
            }
        }
        return "";
    }

    @Override // X.KEA
    public int LJIIIIZZ(KAK kak) {
        return C51214K8c.LIZJ(kak);
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        TrendingTopicList it = (TrendingTopicList) obj;
        o.LJIIIZ(it, "it");
        return AbstractC73672Svk.LJJIIZ(it.items);
    }

    @Override // X.InterfaceC74399THv
    public void LJIIIZ(Effect effect, int i, long j) {
        String str;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("resource_type", "effect");
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LIZ(0, "status");
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        c145995oB.LJI("resource_id", str);
        c145995oB.LIZ(i, "hit_cache");
        GXR.LIZ("tool_performance_resource_download_user_view", c145995oB.LIZ);
    }

    @Override // X.InterfaceC74399THv
    public void LIZLLL(Effect effect, long j, int i, ExceptionResult exceptionResult) {
        String str;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("resource_type", "effect");
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LIZ(1, "status");
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        c145995oB.LJI("resource_id", str);
        c145995oB.LIZJ(ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0), "error_domain");
        c145995oB.LIZJ(Integer.valueOf(exceptionResult.getErrorCode()), "error_code");
        c145995oB.LIZ(i, "hit_cache");
        GXR.LIZ("tool_performance_resource_download_user_view", c145995oB.LIZ);
    }
}
