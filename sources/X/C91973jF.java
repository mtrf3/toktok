package X;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.navi.NaviViewLogic$showNaviNotice$1$1", f = "NaviViewLogic.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3jF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91973jF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TextView LJLIL;
    public final /* synthetic */ T5R LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91973jF(TextView textView, T5R t5r, InterfaceC67352kd<? super C91973jF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = textView;
        this.LJLILLLLZI = t5r;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C91973jF(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.setText(this.LJLILLLLZI);
        this.LJLIL.setMovementMethod(LinkMovementMethod.getInstance());
        this.LJLIL.setHighlightColor(0);
        this.LJLIL.setVisibility(0);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
