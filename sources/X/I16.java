package X;

import android.os.BaseBundle;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import ujb.o;

/* loaded from: classes8.dex */
public final class I16 implements InterfaceC74398THu {
    public final /* synthetic */ I1C LJLIL;
    public final /* synthetic */ I15 LJLILLLLZI;

    @Override // X.InterfaceC74398THu
    public final void LLILLIZIL(Effect effect) {
    }

    @Override // X.InterfaceC74398THu
    public final void onSuccess(Effect effect) {
        if (effect != null) {
            this.LJLIL.LJIIIIZZ(effect);
        } else {
            this.LJLIL.LJI();
        }
    }

    public I16(I1C i1c, I15 i15) {
        this.LJLIL = i1c;
        this.LJLILLLLZI = i15;
    }

    @Override // X.InterfaceC74398THu
    public final void LJFF(int i, Effect effect) {
        this.LJLILLLLZI.LJIILLIIL(i, "effect");
    }

    @Override // X.InterfaceC74398THu
    public final void LJLIIL(Effect effect, ExceptionResult exceptionResult) {
        String str;
        String str2;
        this.LJLIL.LJI();
        I15 i15 = this.LJLILLLLZI;
        BaseBundle baseBundle = (BaseBundle) i15.LJIILIIL.getValue();
        long j = 0;
        if (baseBundle != null) {
            j = baseBundle.getLong("extra_start_record_time", 0L);
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(System.currentTimeMillis() - j, "duration");
        c145995oB.LIZ(1, "status");
        String str3 = null;
        if (effect != null) {
            str = effect.getEffect_id();
        } else {
            str = null;
        }
        c145995oB.LJI("prop_id", str);
        c145995oB.LJI("shoot_way", i15.LIZIZ.shootWay);
        BaseBundle baseBundle2 = (BaseBundle) i15.LJIILIIL.getValue();
        if (baseBundle2 != null) {
            str2 = baseBundle2.getString("enter_from");
        } else {
            str2 = null;
        }
        c145995oB.LJI("enter_from", str2);
        BaseBundle baseBundle3 = (BaseBundle) i15.LJIILIIL.getValue();
        if (baseBundle3 != null) {
            str3 = baseBundle3.getString("enter_method");
        }
        c145995oB.LJI("enter_method", str3);
        if (o.LJJJJIZL(i15.LIZIZ.shootWay, "direct_shoot", false)) {
            c145995oB.LIZLLL("type", "plus");
        }
        GXR.LIZ("tool_performance_prop_reuse_apply_time", c145995oB.LIZ);
    }
}
