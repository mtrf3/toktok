package X;

import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OXr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62071OXr<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ WebSharePackage LJLILLLLZI;
    public final /* synthetic */ InterfaceC62225ObV LJLJI;
    public final /* synthetic */ String LJLJJI;

    public C62071OXr(boolean z, WebSharePackage webSharePackage, InterfaceC62225ObV interfaceC62225ObV, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = webSharePackage;
        this.LJLJI = interfaceC62225ObV;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        C62224ObU c62079OXz;
        String res = (String) obj;
        o.LJIIIZ(res, "res");
        if (this.LJLIL) {
            res = this.LJLILLLLZI.url;
        }
        if (o.LJ(this.LJLJI.key(), "email")) {
            c62079OXz = new OYP(res, this.LJLILLLLZI.title, this.LJLJJI);
        } else {
            c62079OXz = new C62079OXz(res, this.LJLJJI, this.LJLILLLLZI.LJIILL());
        }
        return AbstractC73635Sv9.LJ(new C62072OXs(c62079OXz, this.LJLILLLLZI));
    }
}
