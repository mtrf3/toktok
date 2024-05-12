package X;

import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import defpackage.t1;
import kotlin.jvm.internal.AqS73S0400000_13;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_email_auth_dialog")
/* renamed from: X.AIw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26014AIw extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final int LJLJI = LiveEffectMusicFadeDurationSetting.DEFAULT;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.M74
    public final boolean canShow() {
        return t1.LJI();
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    public C26014AIw(ActivityC45651qj activityC45651qj, AqS73S0400000_13 aqS73S0400000_13) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = aqS73S0400000_13;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLILLLLZI.invoke();
    }
}
