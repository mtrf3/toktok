package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.TGi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74360TGi implements W4C, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final InterfaceC88472Yns<TGD, C76800UCe> LJLJI;

    @Override // X.W4C
    public final C74365TGn create() {
        I9W i9w = (I9W) this.LJLIL.LJ(I9W.class, null);
        C82622Wbi c82622Wbi = this.LJLIL;
        TGB tgb = new TGB(i9w.LLLLL(), i9w.LLZL(), IAT.LIZ, C74340TFo.LJLIL, C74337TFl.LIZ);
        InterfaceC88472Yns<TGD, C76800UCe> interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            tgb.LJLJLLL = interfaceC88472Yns;
        }
        return new C74365TGn(c82622Wbi, tgb, new C74363TGl(this.LJLILLLLZI), C74362TGk.LIZ, new TCM());
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C74360TGi(C82622Wbi diContainer, LifecycleOwner pageLifecycleOwner) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(pageLifecycleOwner, "pageLifecycleOwner");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = pageLifecycleOwner;
        this.LJLJI = null;
    }
}
