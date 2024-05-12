package X;

import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.imagecard.ImageCardSimpleReceiveViewHolder$bindIcon$1$2", f = "ImageCardSimpleReceiveViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85043Vk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC69952op LJLIL;
    public final /* synthetic */ C1048749r LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;
    public final /* synthetic */ ImageCardTemplate LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85043Vk(AbstractC69952op abstractC69952op, C1048749r c1048749r, C109544Rq c109544Rq, ImageCardTemplate imageCardTemplate, InterfaceC67352kd<? super C85043Vk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC69952op;
        this.LJLILLLLZI = c1048749r;
        this.LJLJI = c109544Rq;
        this.LJLJJI = imageCardTemplate;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85043Vk(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            X.C141335gf.LIZJ(r5)
            X.2op r1 = r4.LJLIL
            r0 = r1
            X.2oq r0 = (X.C69962oq) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LIZIZ
            if (r0 != 0) goto L29
            java.lang.String r1 = "ImageCardSimpleReceiveViewHolder"
            java.lang.String r0 = "queryNowAweme success"
            X.C34B.LJII(r1, r0)
            X.49r r2 = r4.LJLILLLLZI
            X.4Rq r0 = r4.LJLJI
            java.lang.String r1 = r0.getScene()
            com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate r0 = r4.LJLJJI
            com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar r0 = r0.titleBar
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r0.leftImage
            java.util.List<java.lang.String> r0 = r0.urls
            r2.n0(r1, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L29:
            X.49r r0 = r4.LJLILLLLZI
            X.2oq r1 = (X.C69962oq) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.LIZIZ
            r0.getClass()
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            boolean r0 = X.C90193gN.LIZ()
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.now.NowPostInfo r0 = r1.nowPostInfo
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getImageForDmShareRtl()
        L45:
            if (r1 == 0) goto L5b
            X.49r r3 = r4.LJLILLLLZI
            X.4Rq r0 = r4.LJLJI
            java.lang.String r2 = r0.getScene()
            java.util.List r1 = r1.getUrlList()
            java.lang.String r0 = "it.urlList"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.n0(r2, r1)
        L5b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5e:
            com.ss.android.ugc.aweme.now.NowPostInfo r0 = r1.nowPostInfo
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getImageForDmShareLtr()
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85043Vk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
