package X;

import Y.ARunnableS18S0400000_15;
import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.HzZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45881HzZ extends AbstractC86588Xya {
    public final IHostNetworkDepend LJIIIZ() {
        IHostNetworkDepend iHostNetworkDepend;
        IHostNetworkDepend iHostNetworkDepend2;
        C86291Xtn c86291Xtn = (C86291Xtn) LJII(C86291Xtn.class);
        if (c86291Xtn != null && (iHostNetworkDepend2 = c86291Xtn.LJIIIIZZ) != null) {
            return iHostNetworkDepend2;
        }
        C86291Xtn c86291Xtn2 = C86291Xtn.LJIIL;
        if (c86291Xtn2 != null && (iHostNetworkDepend = c86291Xtn2.LJIIIIZZ) != null) {
            return iHostNetworkDepend;
        }
        return new C65084PgW();
    }

    public final void LJIIJ(Context context, C86589Xyb c86589Xyb, InterfaceC45882Hza interfaceC45882Hza) {
        LinkedHashMap LJJJZ;
        C86291Xtn c86291Xtn;
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService executorService;
        List<C45883Hzb> list = c86589Xyb.LJ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (C45883Hzb c45883Hzb : list) {
                File LJIIIIZZ = LJIIIIZZ(context, c45883Hzb.LIZIZ, interfaceC45882Hza, c45883Hzb.LIZ);
                if (LJIIIIZZ != null) {
                    arrayList.add(new OSZ(c45883Hzb.LIZ, LJIIIIZZ));
                } else {
                    return;
                }
            }
            LJJJZ = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OSZ osz = (OSZ) it.next();
                LJJJZ.put(osz.getFirst(), osz.getSecond());
            }
        } else {
            String str = c86589Xyb.LIZIZ;
            if (str != null) {
                if (str.length() > 0) {
                    String str2 = c86589Xyb.LIZIZ;
                    if (str2 != null) {
                        File LJIIIIZZ2 = LJIIIIZZ(context, str2, interfaceC45882Hza, "filePath");
                        if (LJIIIIZZ2 == null || (LJJJZ = C113554cx.LJJJZ(new OSZ("file", LJIIIIZZ2))) == null) {
                            return;
                        }
                    } else {
                        o.LJIJI("filePath");
                        throw null;
                    }
                } else {
                    interfaceC45882Hza.LIZ(-3, "filePath or formDataBody can not be null.", null);
                    return;
                }
            } else {
                o.LJIJI("filePath");
                throw null;
            }
        }
        C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
        if (((c86291Xtn2 == null || (iHostThreadPoolExecutorDepend = c86291Xtn2.LJIIJ) == null) && ((c86291Xtn = C86291Xtn.LJIIL) == null || (iHostThreadPoolExecutorDepend = c86291Xtn.LJIIJ) == null)) || (executorService = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) == null) {
            executorService = C38016Ew0.LIZ;
            o.LJFF(executorService, "TTExecutors.getNormalExecutor()");
        }
        executorService.execute(new ARunnableS18S0400000_15(this, c86589Xyb, interfaceC45882Hza, LJJJZ, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x045b A[Catch: IOException -> 0x0468, TryCatch #11 {IOException -> 0x0468, blocks: (B:118:0x0456, B:109:0x045b, B:111:0x0460, B:113:0x0465), top: B:117:0x0456 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0460 A[Catch: IOException -> 0x0468, TryCatch #11 {IOException -> 0x0468, blocks: (B:118:0x0456, B:109:0x045b, B:111:0x0460, B:113:0x0465), top: B:117:0x0456 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0465 A[Catch: IOException -> 0x0468, TRY_LEAVE, TryCatch #11 {IOException -> 0x0468, blocks: (B:118:0x0456, B:109:0x045b, B:111:0x0460, B:113:0x0465), top: B:117:0x0456 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0456 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0333 A[Catch: IOException -> 0x0345, TRY_ENTER, TryCatch #13 {IOException -> 0x0345, blocks: (B:81:0x0333, B:83:0x0338, B:85:0x033d, B:87:0x0342, B:120:0x031b, B:121:0x031e, B:123:0x0323, B:125:0x0328), top: B:64:0x02ec }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0338 A[Catch: IOException -> 0x0345, TryCatch #13 {IOException -> 0x0345, blocks: (B:81:0x0333, B:83:0x0338, B:85:0x033d, B:87:0x0342, B:120:0x031b, B:121:0x031e, B:123:0x0323, B:125:0x0328), top: B:64:0x02ec }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033d A[Catch: IOException -> 0x0345, TryCatch #13 {IOException -> 0x0345, blocks: (B:81:0x0333, B:83:0x0338, B:85:0x033d, B:87:0x0342, B:120:0x031b, B:121:0x031e, B:123:0x0323, B:125:0x0328), top: B:64:0x02ec }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0342 A[Catch: IOException -> 0x0345, TRY_LEAVE, TryCatch #13 {IOException -> 0x0345, blocks: (B:81:0x0333, B:83:0x0338, B:85:0x033d, B:87:0x0342, B:120:0x031b, B:121:0x031e, B:123:0x0323, B:125:0x0328), top: B:64:0x02ec }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File LJIIIIZZ(android.content.Context r13, java.lang.String r14, X.InterfaceC45882Hza r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45881HzZ.LJIIIIZZ(android.content.Context, java.lang.String, X.Hza, java.lang.String):java.io.File");
    }
}
