package X;

import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.Pda, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64902Pda implements InterfaceC65108Pgu, InterfaceC64900PdY, InterfaceC64924Pdw {
    public static final C64902Pda LIZ = new C64902Pda();

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC64900PdY
    public final void LIZ(C64901PdZ<?> c64901PdZ, C37826Esw c37826Esw) {
        C64738Paw c64738Paw;
        Object LIZ2 = C64904Pdc.LIZ(this, c37826Esw);
        if (!(LIZ2 instanceof String) || LIZ2 == null || (c64738Paw = c37826Esw.LIZIZ) == null) {
            return;
        }
        C34821Yg c34821Yg = c64901PdZ.LIZLLL;
        String LJI = c34821Yg.LJI("x-tt-logid");
        String LJI2 = c34821Yg.LJI("ttzip-version");
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("path", c64901PdZ.LIZ.LJFF.LIZ());
        c198517qh.LIZ.put("logid", LJI);
        c198517qh.LIZ.put("request_ttzip_version", LIZ2);
        c198517qh.LIZ.put("response_ttzip_version", LJI2);
        c198517qh.LIZ.put("stream_read_size", ((HashMap) c64738Paw.LJJJI).get("streamReadByteCount"));
        c198517qh.LIZ.put("received_size", ((HashMap) c64738Paw.LJJJI).get("receivedByteCount"));
        c198517qh.LIZ.put("stream_read_time", ((HashMap) c64738Paw.LJJJI).get("streamReadTime"));
        c198517qh.LIZ.put("err_code", ((HashMap) c64738Paw.LJJJI).get("zstd_err_code"));
        FUA.LIZJ("zstd_api_all", c198517qh.LJ());
    }

    @Override // X.InterfaceC65108Pgu
    public final void LJIIIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        String str;
        String LIZ2 = c64907Pdf.LIZIZ.LJFF.LIZ();
        synchronized (C37348ElE.LIZ) {
            java.util.Map<String, String> map = C37348ElE.LIZLLL;
            if (map != null && (str = map.get(LIZ2)) != null) {
                Integer LJJIL = C38350F3i.LJJIL(str);
                if (LJJIL != null) {
                    LJJIL.intValue();
                    String string = C37348ElE.LIZIZ.getString(str, null);
                    if (string != null) {
                        if (new File(string).exists()) {
                        }
                    }
                    str = "";
                } else {
                    str = "";
                }
                C64904Pdc.LIZJ(this, c37826Esw, str);
                c64907Pdf.LIZJ.LIZLLL("accept-encoding", "gzip, deflate, br, ttzip");
                if (!TextUtils.isEmpty(str)) {
                    c64907Pdf.LIZJ.LIZLLL("ttzip-version", str);
                }
            }
        }
    }

    @Override // X.InterfaceC64924Pdw
    public final boolean LJI(C64907Pdf c64907Pdf, C37826Esw c37826Esw, Throwable th, int i, boolean z) {
        C64738Paw c64738Paw;
        Object LIZ2 = C64904Pdc.LIZ(this, c37826Esw);
        if (!(LIZ2 instanceof String)) {
            LIZ2 = null;
        }
        if (LIZ2 == null || (c64738Paw = c37826Esw.LIZIZ) == null) {
            return false;
        }
        C34821Yg c34821Yg = c64907Pdf.LIZJ;
        String LJI = c34821Yg.LJI("x-tt-logid");
        String LJI2 = c34821Yg.LJI("ttzip-version");
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("path", c64907Pdf.LIZIZ.LJFF.LIZ());
        c198517qh.LIZ.put("logid", LJI);
        c198517qh.LIZ.put("request_ttzip_version", LIZ2);
        c198517qh.LIZ.put("response_ttzip_version", LJI2);
        c198517qh.LIZ.put("stream_read_size", ((HashMap) c64738Paw.LJJJI).get("streamReadByteCount"));
        c198517qh.LIZ.put("received_size", ((HashMap) c64738Paw.LJJJI).get("receivedByteCount"));
        c198517qh.LIZ.put("stream_read_time", ((HashMap) c64738Paw.LJJJI).get("streamReadTime"));
        c198517qh.LIZ.put("err_code", ((HashMap) c64738Paw.LJJJI).get("zstd_err_code"));
        c198517qh.LIZ.put("err_msg", th.getMessage());
        FUA.LIZJ("zstd_api_all", c198517qh.LJ());
        return false;
    }
}
