package X;

import android.graphics.drawable.BitmapDrawable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils$fillOriginImage$1$1$1", f = "AnchorBizUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ALo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26084ALo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BitmapDrawable LJLIL;
    public final /* synthetic */ SHA LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26084ALo(BitmapDrawable bitmapDrawable, SHA sha, String str, InterfaceC67352kd<? super C26084ALo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = bitmapDrawable;
        this.LJLILLLLZI = sha;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26084ALo(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL != null) {
            this.LJLILLLLZI.getHierarchy().LJIILLIIL(0);
            this.LJLILLLLZI.getHierarchy().LJIJJ(this.LJLIL, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
        }
        SHA sha = this.LJLILLLLZI;
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C47261Igj.LJJIJIL(this.LJLJI));
        C78765Uvh.LJFF(sha, urlModel);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
