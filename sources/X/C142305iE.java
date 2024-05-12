package X;

import android.graphics.drawable.GradientDrawable;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.view.RenderThumbnailView$renderBackground$1$1$1", f = "RenderThumbnailView.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5iE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142305iE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C164066cE LJLIL;
    public final /* synthetic */ GradientDrawable LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C142305iE(C164066cE c164066cE, GradientDrawable gradientDrawable, InterfaceC67352kd<? super C142305iE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c164066cE;
        this.LJLILLLLZI = gradientDrawable;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C142305iE(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C164066cE c164066cE = this.LJLIL;
        c164066cE.LJLJLJ = true;
        c164066cE.setBackground(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
