package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel", f = "LiquefyViewModel.kt", l = {86, 91}, m = "waitEffectHandleReady")
/* renamed from: X.aiM, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94522aiM extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ LiquefyViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94522aiM(LiquefyViewModel liquefyViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = liquefyViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.mv0(this);
    }
}
