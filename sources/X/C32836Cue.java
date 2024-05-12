package X;

import com.bytedance.android.livesdk.guide.LiveGiftGuideViewModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveRechargeGiftGuideShowTimes;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.guide.LiveGiftGuideViewModel$onMessage$1", f = "LiveGiftGuideViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Cue, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32836Cue extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LiveGiftGuideViewModel LJLIL;
    public final /* synthetic */ IMessage LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32836Cue(LiveGiftGuideViewModel liveGiftGuideViewModel, IMessage iMessage, InterfaceC67352kd<? super C32836Cue> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = liveGiftGuideViewModel;
        this.LJLILLLLZI = iMessage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32836Cue(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        C35558DxS c35558DxS = this.LJLIL.LJLJLJ;
        if (c35558DxS.LJLIL > 0 && c35558DxS.LJLILLLLZI < LiveRechargeGiftGuideShowTimes.INSTANCE.getValue()) {
            z = true;
            this.LJLIL.LJLJLJ.LJLILLLLZI++;
        } else {
            z = false;
        }
        this.LJLIL.LJLJLLL.setValue(new OSZ<>(this.LJLILLLLZI, Boolean.valueOf(z)));
        this.LJLIL.gv0((GiftGuideMessage) this.LJLILLLLZI, z);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
