package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.ability.OpenPhotoNextServiceImpl$gotoNextPage$1$1$1", f = "OpenPhotoNextServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GMu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41404GMu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C68322mC<List<String>> LJLIL;
    public final /* synthetic */ C43617H9x LJLILLLLZI;
    public final /* synthetic */ ShortVideoContext LJLJI;
    public final /* synthetic */ Bundle LJLJJI;
    public final /* synthetic */ IPageToFinish LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41404GMu(C68322mC<List<String>> c68322mC, C43617H9x c43617H9x, ShortVideoContext shortVideoContext, Bundle bundle, IPageToFinish iPageToFinish, InterfaceC67352kd<? super C41404GMu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c43617H9x;
        this.LJLJI = shortVideoContext;
        this.LJLJJI = bundle;
        this.LJLJJL = iPageToFinish;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41404GMu(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<String> list = this.LJLIL.element;
        if (list == null || list.isEmpty()) {
            this.LJLJJL.onFinish(false);
        } else {
            C43617H9x.LJ(this.LJLILLLLZI, this.LJLJI, this.LJLIL.element, new C41405GMv(this.LJLJJL), true, new Long(System.currentTimeMillis()), true, null, this.LJLJJI.getString("id"), 256);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
