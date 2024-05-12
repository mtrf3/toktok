package X;

import Y.IDObserverS227S0100000_42;
import com.bytedance.effectcreatormobile.objectselect.EffectSelectFragment;

/* renamed from: X.ale, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94726ale extends AbstractC65781Prl implements InterfaceC88471Ynr<String[], int[], C76800UCe> {
    public final /* synthetic */ EffectSelectFragment LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94726ale(EffectSelectFragment effectSelectFragment, String str, String str2, String str3) {
        super(2);
        this.LJLIL = effectSelectFragment;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String[] strArr, int[] iArr) {
        EffectSelectFragment effectSelectFragment = this.LJLIL;
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        String str3 = this.LJLJJI;
        effectSelectFragment.getClass();
        C93819aX1.LIZ().previewTemplateEvent().setValue(new C94273aeL(str, str2, str3));
        C93939aYx.LIZ().getRenderModeData().observe(this.LJLIL.getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 43));
        return C76800UCe.LIZ;
    }
}
