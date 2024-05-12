package X;

import android.view.View;
import com.bytedance.ies.bullet.service.popup.BulletPopUpFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NnQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60416NnQ implements InterfaceC60172NjU {
    public final /* synthetic */ BulletPopUpFragment LJLIL;

    @Override // X.InterfaceC60172NjU
    public final void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, android.net.Uri uri, InterfaceC40516FvE instance, boolean z) {
        o.LJIIJ(viewComponents, "viewComponents");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(instance, "instance");
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLLL(android.net.Uri uri) {
        o.LJIIJ(uri, "uri");
    }

    public C60416NnQ(BulletPopUpFragment bulletPopUpFragment) {
        this.LJLIL = bulletPopUpFragment;
    }

    @Override // X.InterfaceC60172NjU
    public final void LLL(android.net.Uri uri, Throwable e) {
        o.LJIIJ(uri, "uri");
        o.LJIIJ(e, "e");
        BulletPopUpFragment bulletPopUpFragment = this.LJLIL;
        InterfaceC60443Nnr interfaceC60443Nnr = bulletPopUpFragment.LJZI;
        if (interfaceC60443Nnr != null) {
            interfaceC60443Nnr.LIZIZ(bulletPopUpFragment, e);
        }
        BulletPopUpFragment bulletPopUpFragment2 = this.LJLIL;
        bulletPopUpFragment2.LJLL = true;
        if (!bulletPopUpFragment2.Dl().LLF) {
            this.LJLIL.dismiss();
        }
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        o.LJIIJ(view, "view");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(instance, "instance");
        BulletPopUpFragment bulletPopUpFragment = this.LJLIL;
        bulletPopUpFragment.LJLJJI = instance;
        bulletPopUpFragment.LJLL = true;
        ((ArrayList) BulletPopUpFragment.LLFFF).add(bulletPopUpFragment);
        BulletPopUpFragment bulletPopUpFragment2 = this.LJLIL;
        InterfaceC60443Nnr interfaceC60443Nnr = bulletPopUpFragment2.LJZI;
        if (interfaceC60443Nnr != null) {
            interfaceC60443Nnr.LIZJ(bulletPopUpFragment2);
        }
    }

    @Override // X.InterfaceC60172NjU
    public final void gk(InterfaceC40516FvE instance, android.net.Uri uri, AbstractC59475NVv param) {
        o.LJIIJ(instance, "instance");
        o.LJIIJ(uri, "uri");
        o.LJIIJ(param, "param");
        if (param instanceof C59896Nf2) {
            BulletPopUpFragment bulletPopUpFragment = this.LJLIL;
            ((C59896Nf2) param).LJJJJI.getValue();
            bulletPopUpFragment.getClass();
        }
    }
}
