package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G64 extends AbstractC42152GgW<C76800UCe> {
    public final AbstractC42651GoZ LJLJJI;
    public final Activity LJLJJL;

    @Override // X.AbstractC42152GgW
    public final void LIZIZ() {
    }

    @Override // X.AbstractC42152GgW
    public final String LIZJ() {
        return "Login Check";
    }

    @Override // X.AbstractC42152GgW
    public final void LIZLLL() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ G64(X.AbstractC42651GoZ r3) {
        /*
            r2 = this;
            android.app.Activity r1 = r3.requireActivity()
            java.lang.String r0 = "rootScene.requireActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G64.<init>(X.GoZ):void");
    }

    @Override // X.AbstractC42152GgW
    public final void LIZ(C42150GgU nextStep) {
        o.LJIIIZ(nextStep, "nextStep");
        if (!C60903NvH.LJIIJJI().getAccountService().isLogin()) {
            C43150Gwc.LJIIIIZZ("-1", BehaviorType.FAILED, "CK", "LG", 16);
            Bundle bundle = this.LJLJJI.mArguments;
            if (bundle != null && bundle.getBoolean("is_from_sys_share", false)) {
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("enter_from", "video_edit_page");
                FMX.LJIIL("login_notify", c145995oB.LIZ);
            }
            C60903NvH.LJIIJJI().getPublishService().LJI();
            GUT.LIZ(this.LJLJJL, "jump_to_login_page");
            C60903NvH.LJIIJJI().getAccountService().LIZ(this.LJLJJL, "video_edit_page", "click_shoot", null, new G7U(nextStep, this));
            return;
        }
        nextStep.LIZIZ(this);
    }

    public G64(Activity activity, AbstractC42651GoZ rootScene) {
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(activity, "activity");
        this.LJLJJI = rootScene;
        this.LJLJJL = activity;
    }
}
