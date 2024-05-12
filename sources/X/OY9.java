package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OY9<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ AwemeSharePackage LJLIL;
    public final /* synthetic */ InterfaceC62225ObV LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public OY9(AwemeSharePackage awemeSharePackage, InterfaceC62225ObV interfaceC62225ObV, String str) {
        this.LJLIL = awemeSharePackage;
        this.LJLILLLLZI = interfaceC62225ObV;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String res = (String) obj;
        o.LJIIIZ(res, "res");
        Bundle bundle = this.LJLIL.extras.getBundle("short_link_params");
        C68322mC c68322mC = new C68322mC();
        Object obj2 = (T) OYF.LIZ(bundle, res);
        if (obj2 == null) {
            obj2 = (T) "";
        }
        c68322mC.element = (T) obj2;
        this.LJLIL.extras.putString("share_url", (String) obj2);
        if (o.LJ(this.LJLILLLLZI.key(), "email")) {
            return AbstractC73635Sv9.LJ(new OY4(this.LJLJI, c68322mC));
        }
        return AbstractC73635Sv9.LJ(new OYA(this.LJLJI, c68322mC));
    }
}
