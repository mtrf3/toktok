package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import kotlin.jvm.internal.o;
import yq4.a;

@InterfaceC55642Lsc("global_personalized_ad")
/* renamed from: X.FuQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40466FuQ extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLILLLLZI;
    }

    public C40466FuQ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = UserLevelGeckoUpdateSetting.DEFAULT;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ != null) {
            a.LJIIJ().LJIIIIZZ(LIZJ, wrapper);
        }
    }
}
