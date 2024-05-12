package X;

import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import kotlin.jvm.internal.AqS180S0100000_14;

/* renamed from: X.WZi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82498WZi implements FetchResourcesListener {
    public final /* synthetic */ C82497WZh LIZ;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZIZ;
    public final /* synthetic */ C68322mC<String> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onSuccess() {
        try {
            C68322mC<String> c68322mC = this.LIZJ;
            XBE.LJIIIIZZ.getClass();
            String findResourceUri = C84419XBf.LIZ().LIZLLL().findResourceUri(this.LIZ.LJLJL);
            T t = findResourceUri;
            if (findResourceUri == null) {
                t = "";
            }
            c68322mC.element = t;
            C82497WZh c82497WZh = this.LIZ;
            String path = java.net.URI.create(this.LIZJ.element).getPath();
            if (path == null) {
                path = "";
            }
            c82497WZh.LJLJLJ = path;
            this.LIZIZ.invoke(this.LIZJ.element);
        } catch (Throwable unused) {
            this.LIZ.LJLJLJ = "";
            this.LIZIZ.invoke("");
        }
    }

    @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
    public final void onFailed(Exception exc) {
        this.LIZ.LJLJLJ = "";
        this.LIZIZ.invoke("");
    }

    public C82498WZi(C82497WZh c82497WZh, AqS180S0100000_14 aqS180S0100000_14, C68322mC c68322mC) {
        this.LIZ = c82497WZh;
        this.LIZIZ = aqS180S0100000_14;
        this.LIZJ = c68322mC;
    }
}
