package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.voiceeffect.VoiceEffectDataSource", f = "VoiceEffectDataSource.kt", l = {SubscriptionExpireRemindHourSetting.DEFAULT}, m = "fetchLocalDataNew")
/* renamed from: X.1yY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50501yY extends C3CS {
    public C1O0 LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C1O0 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50501yY(C1O0 c1o0, InterfaceC67352kd<? super C50501yY> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c1o0;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(this);
    }
}
