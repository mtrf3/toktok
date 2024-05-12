package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.CreateMobileEffectRequest;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectUploader", f = "MobileEffectUploader.kt", l = {133}, m = "createEffectAPI")
/* renamed from: X.EPd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36369EPd extends C3CS {
    public CreateMobileEffectRequest LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C36370EPe LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36369EPd(C36370EPe c36370EPe, InterfaceC67352kd<? super C36369EPd> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c36370EPe;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, this);
    }
}
