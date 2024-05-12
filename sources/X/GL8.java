package X;

import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;

/* loaded from: classes8.dex */
public final class GL8 implements IPageToFinish {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public GL8(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IPageToFinish
    public final void onFinish(boolean z) {
        this.LJLIL.invoke(Boolean.valueOf(z));
    }
}
