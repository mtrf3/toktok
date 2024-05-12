package com.bytedance.forest.chain.fetchers;

import X.C141335gf;
import X.C3C5;
import X.C61023NxD;
import X.C61287O3n;
import X.C61293O3t;
import X.C61295O3v;
import X.C61301O4b;
import X.C61316O4q;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.O4O;
import X.ORY;
import X.X1D;
import android.app.Application;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.Request;
import defpackage.i0;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class BuiltinFetcher extends ResourceFetcher {
    public static final C61316O4q Companion = new C61316O4q();
    public static String[] dirList;

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltinFetcher(Forest forest) {
        super(forest);
        o.LJIIJ(forest, "forest");
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(Request request, C61295O3v response) {
        o.LJIIJ(request, "request");
        o.LJIIJ(response, "response");
        fetchAsync(request, response, C61301O4b.LJLIL);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(Request request, C61295O3v response, InterfaceC88472Yns<? super C61295O3v, C76800UCe> callback) {
        String LJFF;
        Object LIZ;
        Object LIZ2;
        o.LJIIJ(request, "request");
        o.LJIIJ(response, "response");
        o.LJIIJ(callback, "callback");
        response.W(null, "builtin_start");
        if (request.getGeckoModel().L()) {
            C61287O3n c61287O3n = response.LL;
            c61287O3n.LIZIZ += 1000;
            c61287O3n.LJIIIZ = "Could not get Channel Or Bundle";
            response.W(null, "builtin_finish");
            callback.invoke(response);
            return;
        }
        C61316O4q c61316O4q = Companion;
        C61023NxD geckoModel = request.getGeckoModel();
        c61316O4q.getClass();
        geckoModel.getClass();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(geckoModel.LJLILLLLZI);
        LIZ3.append('/');
        LIZ3.append(s.LJJLL("/", geckoModel.LJLJI));
        String LIZIZ = X1D.LIZIZ(LIZ3);
        if (ujb.o.LJJJLIIL(LIZIZ, "/", false)) {
            LJFF = i0.LJFF("offline", LIZIZ);
        } else {
            LJFF = i0.LJFF("offline/", LIZIZ);
        }
        Application application = getForest().getApplication();
        String str = request.getGeckoModel().LJLILLLLZI;
        if (dirList == null) {
            synchronized ("offline") {
                if (dirList == null) {
                    try {
                        LIZ2 = application.getAssets().list("offline");
                        C3C5.m7constructorimpl(LIZ2);
                    } catch (Throwable th) {
                        LIZ2 = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ2);
                    }
                    String[] strArr = new String[0];
                    if (C3C5.m12isFailureimpl(LIZ2)) {
                        LIZ2 = strArr;
                    }
                    dirList = (String[]) LIZ2;
                }
            }
        }
        String[] strArr2 = dirList;
        if (strArr2 != null && ORY.LJJIJIIJIL(str, strArr2)) {
            C61316O4q c61316O4q2 = Companion;
            Application application2 = getForest().getApplication();
            c61316O4q2.getClass();
            int LJJLIIIJLLLLLLLZ = s.LJJLIIIJLLLLLLLZ(LJFF, '/', 0, 6);
            if (LJJLIIIJLLLLLLLZ != -1) {
                String substring = LJFF.substring(0, LJJLIIIJLLLLLLLZ);
                o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = LJFF.substring(LJJLIIIJLLLLLLLZ + 1);
                o.LJFF(substring2, "(this as java.lang.String).substring(startIndex)");
                try {
                    LIZ = application2.getAssets().list(substring);
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th2) {
                    LIZ = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = null;
                }
                Object[] objArr = (Object[]) LIZ;
                if (objArr != null && ORY.LJJIJIIJIL(substring2, objArr)) {
                    response.LJZL = true;
                    response.LJLIL = LJFF;
                    response.LLD = "builtin";
                    response.LLFF = true;
                    response.X(new O4O(new C61293O3t(LJFF), null));
                    response.W(null, "builtin_finish");
                    callback.invoke(response);
                }
            }
        }
        C61287O3n c61287O3n2 = response.LL;
        c61287O3n2.LIZIZ += 3000;
        c61287O3n2.LJIIIZ = "builtin resource not exists";
        response.W(null, "builtin_finish");
        callback.invoke(response);
    }
}
