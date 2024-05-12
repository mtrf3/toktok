package X;

import android.content.Context;
import android.graphics.Typeface;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", f = "AndroidFontLoader.android.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2EC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Typeface>, Object> {
    public final /* synthetic */ C32961Rc LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2EC(C32961Rc c32961Rc, Context context, InterfaceC67352kd<? super C2EC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c32961Rc;
        this.LJLILLLLZI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2EC(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C73040SlY.LJFF(this.LJLILLLLZI, this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Typeface> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
