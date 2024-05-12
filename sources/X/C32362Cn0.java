package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Cn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32362Cn0 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C32364Cn2 LIZ;
    public final C32364Cn2 LIZIZ;
    public float LIZJ;

    public final android.net.Uri LIZ() {
        if (this.LIZJ != 0.0f) {
            this.LIZ.LIZ((int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * this.LIZJ)), "height");
        }
        android.net.Uri containerUri = UriProtector.parse(this.LIZ.LIZLLL());
        String queryParameter = UriProtector.getQueryParameter(containerUri, "url");
        if (C29306Beo.LJIJJLI(queryParameter)) {
            this.LIZIZ.LIZIZ = queryParameter;
            o.LJIIIIZZ(containerUri, "containerUri");
            String LIZLLL2 = this.LIZIZ.LIZLLL();
            o.LJIIIIZZ(LIZLLL2, "webRechargeUrlBuilder.build()");
            return C29306Beo.LJJIJL(containerUri, "url", LIZLLL2);
        }
        return containerUri;
    }

    public C32362Cn0(String url) {
        o.LJIIIZ(url, "url");
        this.LIZ = new C32364Cn2(url);
        this.LIZIZ = new C32364Cn2();
    }
}
