package X;

import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.imagecard.ImageCardSimpleReceiveViewHolder$bindIcon$1$1", f = "ImageCardSimpleReceiveViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85023Vi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC69952op LJLIL;
    public final /* synthetic */ C1048749r LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;
    public final /* synthetic */ ImageCardTemplate LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85023Vi(AbstractC69952op abstractC69952op, C1048749r c1048749r, C109544Rq c109544Rq, ImageCardTemplate imageCardTemplate, InterfaceC67352kd<? super C85023Vi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC69952op;
        this.LJLILLLLZI = c1048749r;
        this.LJLJI = c109544Rq;
        this.LJLJJI = imageCardTemplate;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85023Vi(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "query failed ");
        LIZIZ.append(this.LJLIL.LIZ);
        LIZIZ.append("  Exception ");
        LIZIZ.append(((C69942oo) this.LJLIL).LIZIZ);
        C34B.LIZJ("ImageCardSimpleReceiveViewHolder", X1D.LIZIZ(LIZIZ));
        this.LJLILLLLZI.n0(this.LJLJI.getScene(), this.LJLJJI.titleBar.leftImage.urls);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
