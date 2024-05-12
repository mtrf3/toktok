package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.O4c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61302O4c implements InterfaceC88472Yns<C61295O3v, C76800UCe> {
    public C61295O3v LJLIL;
    public boolean LJLILLLLZI;
    public final List<InterfaceC88472Yns<C61295O3v, C76800UCe>> LJLJI;
    public volatile SoftReference<W4W<C81392Vwy<W5A>>> LJLJJI;
    public final String LJLJJL;
    public final EnumC61028NxI LJLJJLL;
    public final C61283O3j LJLJL;

    public final void LIZ(C61295O3v c61295O3v) {
        synchronized (this) {
            this.LJLIL = c61295O3v;
            if (!this.LJLJI.isEmpty()) {
                this.LJLJL.getClass();
                C61283O3j.LIZJ.remove(this.LJLJJL);
                Iterator<InterfaceC88472Yns<C61295O3v, C76800UCe>> it = this.LJLJI.iterator();
                while (it.hasNext()) {
                    it.next().invoke(c61295O3v);
                }
            }
        }
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C61295O3v c61295O3v) {
        android.net.Uri parse;
        C61295O3v result = c61295O3v;
        o.LJIIJ(result, "result");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preload result:");
        LIZ.append(result.LJZL);
        C39930Flm.LJ("PreLoader", X1D.LIZIZ(LIZ), 4);
        result.X(null);
        if (this.LJLJJLL == EnumC61028NxI.LYNX_IMAGE) {
            AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10(this, 473);
            if (result.LJZL) {
                parse = new Uri.Builder().scheme("file").authority("").path(result.getFilePath()).build();
            } else {
                parse = UriProtector.parse(result.LJZI.getUrl());
            }
            W5O LIZ2 = W5P.LIZLLL(parse).LIZ();
            W6J LIZ3 = W5I.LIZ();
            W50 w50 = W50.FULL_FETCH;
            LIZ3.getClass();
            W4W<C81392Vwy<W5A>> w4w = new C81257Vun(LIZ3, LIZ2, w50).get();
            this.LJLJJI = new SoftReference<>(w4w);
            w4w.LJ(new C61303O4d(this, parse, result, aqS160S0100000_10), ExecutorC61314O4o.LJLIL);
            LIZ(result);
        } else {
            LIZ(result);
        }
        return C76800UCe.LIZ;
    }

    public C61302O4c(String url, EnumC61028NxI scene, C61283O3j preLoader) {
        o.LJIIJ(url, "url");
        o.LJIIJ(scene, "scene");
        o.LJIIJ(preLoader, "preLoader");
        this.LJLJJL = url;
        this.LJLJJLL = scene;
        this.LJLJL = preLoader;
        this.LJLJI = new ArrayList();
    }
}
