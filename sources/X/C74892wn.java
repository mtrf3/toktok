package X;

import android.widget.TextView;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.translate.AutoTranslateTextView$setText$1$1", f = "AutoTranslateTextView.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74892wn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C74902wo LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ TextView.BufferType LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74892wn(C74902wo c74902wo, String str, TextView.BufferType bufferType, InterfaceC67352kd<? super C74892wn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c74902wo;
        this.LJLILLLLZI = str;
        this.LJLJI = bufferType;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74892wn(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        super/*com.bytedance.tux.input.TuxTextView*/.setText(this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
