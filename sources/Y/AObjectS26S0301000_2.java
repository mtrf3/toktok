package Y;

import X.C164246cW;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AObjectS26S0301000_2 implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS26S0301000_2 aObjectS26S0301000_2, Object eventArgs) {
        o.LJIIIZ(eventArgs, "eventArgs");
        C164246cW c164246cW = (C164246cW) aObjectS26S0301000_2.l0;
        SceneExtensionsKt.LIZJ(c164246cW, new ARunnableS3S0301000_2(aObjectS26S0301000_2.i3, c164246cW, (Effect) aObjectS26S0301000_2.l1, (OSZ) aObjectS26S0301000_2.l2, 3), 200L);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS26S0301000_2 aObjectS26S0301000_2, Object eventArgs) {
        o.LJIIIZ(eventArgs, "eventArgs");
        C164246cW c164246cW = (C164246cW) aObjectS26S0301000_2.l0;
        SceneExtensionsKt.LIZJ(c164246cW, new ARunnableS3S0301000_2(aObjectS26S0301000_2.i3, c164246cW, (Effect) aObjectS26S0301000_2.l1, (OSZ) aObjectS26S0301000_2.l2, 4), 200L);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObjectS26S0301000_2(C164246cW c164246cW, C164246cW c164246cW2, int i, Effect effect, OSZ<? extends Effect, String> osz) {
        this.$t = osz;
        this.l0 = c164246cW;
        this.i3 = c164246cW2;
        this.l1 = i;
        this.l2 = effect;
    }
}
