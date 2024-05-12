package X;

import Y.ARunnableS11S0101000_7;
import Y.ARunnableS43S0100000_7;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;

/* renamed from: X.HbG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C44374HbG implements InterfaceC30078BrG, IAVTransformService.ITransformProgress {
    public final /* synthetic */ Object LJLIL;

    public /* synthetic */ C44374HbG(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC30078BrG
    public final void LIZJ(InterfaceC29879Bo3 interfaceC29879Bo3) {
        ((AbsAudienceInteractionFragment) this.LJLIL).messageManager.addMessageListener(EnumC31509CYf.DRAW_GUESS_START_MESSAGE.getIntType(), new C30062Br0(interfaceC29879Bo3));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformProgress
    public final void update(int i) {
        ARunnableS43S0100000_7 aRunnableS43S0100000_7 = (ARunnableS43S0100000_7) this.LJLIL;
        aRunnableS43S0100000_7.getClass();
        C38816FLg.LIZJ(new ARunnableS11S0101000_7(i, aRunnableS43S0100000_7, 0));
    }
}
