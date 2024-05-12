package X;

import android.app.Dialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("reset_pwd_error_hint")
/* renamed from: X.GlA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42440GlA extends AbstractC56327M8t<Dialog> {
    public final ActivityC45651qj LJLIL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    @Override // X.M74
    public final boolean canShow() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj == null || !(activityC45651qj instanceof AbstractActivityC69131RBf) || activityC45651qj.isFinishing()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        C26227ARb c26227ARb = new C26227ARb(context.LIZ);
        c26227ARb.LJFF(context.LIZ.getString(R.string.t_w));
        c26227ARb.LIZIZ(context.LIZ.getString(R.string.t_u));
        UC0.LIZJ(c26227ARb, new AqS172S0100000_6(context, 116));
        c26227ARb.LJII = false;
        return c26227ARb.LJI().LJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42440GlA(InterfaceC56322M8o scene, ActivityC45651qj activityC45651qj) {
        super(scene);
        o.LJIIIZ(scene, "scene");
        this.LJLIL = activityC45651qj;
    }
}
