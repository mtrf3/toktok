package X;

import Y.ARunnableS51S0100000_15;
import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.google.android.play.core.appupdate.u;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Xyq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86604Xyq extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PROTECT;
    public final String LIZJ = "x.downloadFile";

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C86620Xz6> LIZ() {
        return C86620Xz6.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C86622Xz8> LIZLLL() {
        return C86622Xz8.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        boolean z;
        String str;
        String absolutePath;
        C86291Xtn c86291Xtn;
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService executorService;
        C86291Xtn c86291Xtn2;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "url", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String LJJIJIL2 = u.LJJIJIL(params, "extension", "");
            if (LJJIJIL2.length() != 0) {
                InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(params, "params");
                InterfaceC78280Uns LJJIJIIJIL2 = u.LJJIJIIJIL(params, "header");
                String LJJIJIL3 = u.LJJIJIL(params, "saveToAlbum", "");
                C86620Xz6 c86620Xz6 = new C86620Xz6();
                c86620Xz6.LIZ = LJJIJIL;
                c86620Xz6.LIZIZ = LJJIJIL2;
                c86620Xz6.LJFF = u.LJJIIZI(params, "needCommonParams", true);
                if (LJJIJIIJIL != null) {
                    c86620Xz6.LIZJ = LJJIJIIJIL;
                }
                if (LJJIJIIJIL2 != null) {
                    c86620Xz6.LIZLLL = LJJIJIIJIL2;
                }
                if (LJJIJIL3.length() > 0) {
                    c86620Xz6.LJ = EnumC86625XzB.valueOf(LJJIJIL3);
                }
                C86613Xyz c86613Xyz = new C86613Xyz(this, interfaceC31943CgF);
                C86618Xz4 c86618Xz4 = (C86618Xz4) this;
                Context context = (Context) c86618Xz4.LJII(Context.class);
                if (context != null) {
                    String str2 = c86620Xz6.LIZ;
                    if (str2 != null) {
                        try {
                            byte[] bytes = str2.getBytes(PVC.LIZ);
                            o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                            str = C37071Egl.LIZ(bytes);
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                            str = null;
                        }
                        String LJIILLIIL = o.LJIILLIIL(Long.valueOf(System.currentTimeMillis()), str);
                        String str3 = c86620Xz6.LIZIZ;
                        if (str3 != null) {
                            String LIZIZ = C00F.LIZIZ(LJIILLIIL, '.', str3);
                            File LLIIIZ = C16880lQ.LLIIIZ(context);
                            if ((LLIIIZ != null || (LLIIIZ = C16880lQ.LLIIIL(context)) != null) && (absolutePath = LLIIIZ.getAbsolutePath()) != null) {
                                String LIZIZ2 = C00F.LIZIZ(absolutePath, '/', LIZIZ);
                                if (C1B6.LIZIZ(LIZIZ2)) {
                                    VFS.LIZ().post(new ARunnableS51S0100000_15(c86613Xyz, 93));
                                    return;
                                }
                                C31926Cfy c31926Cfy = c86618Xz4.LIZ;
                                if (((c31926Cfy == null || (c86291Xtn2 = (C86291Xtn) c31926Cfy.LIZ(C86291Xtn.class)) == null || (iHostThreadPoolExecutorDepend = c86291Xtn2.LJIIJ) == null) && ((c86291Xtn = C86291Xtn.LJIIL) == null || (iHostThreadPoolExecutorDepend = c86291Xtn.LJIIJ) == null)) || (executorService = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) == null) {
                                    executorService = C38016Ew0.LIZ;
                                    o.LJFF(executorService, "TTExecutors.getNormalExecutor()");
                                }
                                executorService.execute(new RunnableC86607Xyt(c86618Xz4, c86620Xz6, type, c86613Xyz, LIZIZ2, context));
                                return;
                            }
                            c86613Xyz.onFailure(0, "cacheDir is null");
                            return;
                        }
                        o.LJIJI("extension");
                        throw null;
                    }
                    o.LJIJI("url");
                    throw null;
                }
                c86613Xyz.onFailure(0, "Context not provided in host");
                return;
            }
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
    }
}
