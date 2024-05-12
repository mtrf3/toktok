package X;

import com.bytedance.services.apm.api.IHttpService;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes12.dex */
public final class PBT {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static boolean LIZIZ = true;
    public static String LIZJ;

    public static C44N LIZ(String str, byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        HashMap hashMap = new HashMap();
        if (bArr.length > 128) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr);
                        C78685UuP.LJIIIIZZ(gZIPOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        hashMap.put("Content-Encoding", "gzip");
                        bArr = byteArray;
                    } catch (Throwable th) {
                        th = th;
                        C78685UuP.LJIIIIZZ(gZIPOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = null;
                }
            } catch (IOException unused) {
            }
        }
        return new C44N(EZT.LIZ(str, PC5.LJJIIJ()), hashMap, bArr);
    }

    public static void LIZJ(String str, byte[] bArr) {
        boolean z;
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            if (C78248UnM.LJIIJ()) {
                C64028PAy.LIZ("APM-CustomException", "network unreachable");
                return;
            }
            return;
        }
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            C44N LIZ2 = LIZ(str, bArr);
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("http request:url:");
                LIZ3.append((String) LIZ2.LIZ);
                LIZ3.append(" headers:");
                LIZ3.append((java.util.Map) LIZ2.LIZIZ);
                C64028PAy.LIZ("APM-CustomException", X1D.LIZIZ(LIZ3));
            }
            String str2 = (String) LIZ2.LIZ;
            java.util.Map<String, String> map = (java.util.Map) LIZ2.LIZIZ;
            ((IHttpService) PGH.LIZ(IHttpService.class)).doPost(str2, (byte[]) LIZ2.LIZJ, map);
        } catch (Throwable unused2) {
        }
    }

    public static void LIZIZ(String str, String str2, Throwable th) {
        InterfaceC64046PBq interfaceC64046PBq;
        if (C80036Vb6.LJLIL && (interfaceC64046PBq = C80036Vb6.LJLILLLLZI) != null) {
            interfaceC64046PBq.e(str, str2);
        }
        if (LIZIZ) {
            AtomicInteger atomicInteger = LIZ;
            if (atomicInteger.get() >= 3) {
                return;
            }
            atomicInteger.incrementAndGet();
            C64071PCp.LIZ(PD6.IO).LIZJ(new C64054PBy(str, str2, th));
        }
    }
}
