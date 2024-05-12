package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.model.LinkDefaultSharePackageV2;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OYB<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ LinkDefaultSharePackageV2 LJLIL;
    public final /* synthetic */ InterfaceC62225ObV LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public OYB(LinkDefaultSharePackageV2 linkDefaultSharePackageV2, InterfaceC62225ObV interfaceC62225ObV, String str) {
        this.LJLIL = linkDefaultSharePackageV2;
        this.LJLILLLLZI = interfaceC62225ObV;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String res = (String) obj;
        o.LJIIIZ(res, "res");
        Bundle bundle = this.LJLIL.extras.getBundle("short_link_params");
        C68322mC c68322mC = new C68322mC();
        T t = (T) OYF.LIZ(bundle, res);
        if (t == null) {
            t = (T) "";
        }
        c68322mC.element = t;
        if (o.LJ(this.LJLILLLLZI.key(), "email")) {
            return AbstractC73635Sv9.LJ(new OYC(c68322mC, this.LJLIL, this.LJLJI));
        }
        return AbstractC73635Sv9.LJ(new OYD(this.LJLJI, c68322mC));
    }
}
