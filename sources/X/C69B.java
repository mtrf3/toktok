package X;

import android.app.Application;
import com.bytedance.keva.Keva;
import com.ss.android.socialbase.downloader.exception.BaseException;
import kotlin.jvm.internal.o;

/* renamed from: X.69B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69B {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C69I.LJLIL);
    public static final InterfaceC84498XEg LIZIZ;
    public static final C69F LIZJ;
    public static final C64962gm LIZLLL;
    public static final Keva LJ;
    public static boolean LJFF;

    static {
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        LIZIZ = C84488XDw.LIZ(application, null);
        LIZJ = new C69F();
        LIZLLL = C48841JEv.LIZ(C78613UtF.LIZJ);
        LJ = Keva.getRepo("publish_cover_effect_keva");
    }

    public static C69A LIZ() {
        return (C69A) LIZ.getValue();
    }

    public static final void LIZJ() {
        if (LJFF) {
            return;
        }
        C69A LIZ2 = LIZ();
        C69D c69d = new C69D();
        InterfaceC84498XEg effectPlatform = LIZIZ;
        C69N c69n = new InterfaceC83307Wml() { // from class: X.69N
            @Override // X.InterfaceC83307Wml
            public final void LIZIZ() {
                C60903NvH.LJIIJJI().LJJIIZI().LJIIL(0, "effect_text_res_download_suc_rate", new C6BK().LJ());
            }

            @Override // X.InterfaceC83307Wml
            public final void LIZJ() {
                C60903NvH.LJIIJJI().LJJIIZI().LJIIL(0, "effect_text_font_download_suc_rate", new C6BK().LJ());
            }

            @Override // X.InterfaceC83307Wml
            public final void LIZ(String effectId, Throwable th) {
                String str;
                int i;
                o.LJIIIZ(effectId, "effectId");
                if (th != null) {
                    str = C36747EbX.LIZIZ(th);
                } else {
                    str = "";
                }
                if (th instanceof BaseException) {
                    i = ((BaseException) th).getErrorCode();
                } else {
                    i = -1;
                }
                InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
                C6BK c6bk = new C6BK();
                c6bk.LIZ.put("effectId", effectId);
                c6bk.LIZ.put("exception", str);
                c6bk.LIZ.put("errorCode", Integer.valueOf(i));
                LJJIIZI.LJIIL(1, "effect_text_res_download_suc_rate", c6bk.LJ());
            }

            @Override // X.InterfaceC83307Wml
            public final void LIZLLL(String effectId, Throwable th) {
                String str;
                int i;
                o.LJIIIZ(effectId, "effectId");
                if (th != null) {
                    str = C36747EbX.LIZIZ(th);
                } else {
                    str = "";
                }
                if (th instanceof BaseException) {
                    i = ((BaseException) th).getErrorCode();
                } else {
                    i = -1;
                }
                InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
                C6BK c6bk = new C6BK();
                c6bk.LIZ.put("effectId", effectId);
                c6bk.LIZ.put("exception", str);
                c6bk.LIZ.put("errorCode", Integer.valueOf(i));
                LJJIIZI.LJIIL(1, "effect_text_font_download_suc_rate", c6bk.LJ());
            }
        };
        C60903NvH.LJIIJJI().getUiService().getClass();
        LIZ2.getClass();
        o.LJIIIZ(effectPlatform, "effectPlatform");
        AnonymousClass634 LIZIZ2 = AnonymousClass699.LIZIZ();
        InterfaceC84497XEf LIZ3 = AnonymousClass699.LIZ();
        C6FB c6fb = AnonymousClass699.LIZJ;
        C68P c68p = AnonymousClass699.LIZLLL;
        if (!C69E.LIZLLL) {
            if (!AnonymousClass699.LJ) {
                AnonymousClass699.LIZ = LIZIZ2;
                AnonymousClass699.LIZIZ = LIZ3;
                AnonymousClass699.LIZJ = c6fb;
                AnonymousClass699.LIZLLL = c68p;
                AnonymousClass699.LJ = true;
            }
            C69E.LIZ = c69d;
            C69E.LIZIZ = effectPlatform;
            C69E.LIZJ = c69n;
            C69E.LIZLLL = true;
        }
        LJFF = true;
    }

    public static final void LJ(C68D c68d) {
        LIZ().getClass();
        AnonymousClass699.LIZIZ().LIZJ = c68d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:2|3)|(8:7|8|9|10|(2:12|(3:14|15|16))|19|15|16)|22|8|9|10|(0)|19|15|16) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:10:0x001d, B:12:0x0023), top: B:9:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(boolean r6, boolean r7, boolean r8) {
        /*
            X.69A r5 = LIZ()
            r1 = 1
            org.json.JSONObject r2 = X.C69C.LIZ()     // Catch: java.lang.Exception -> L18
            if (r2 == 0) goto L18
            java.lang.String r0 = "v1"
            int r0 = r2.optInt(r0)     // Catch: java.lang.Exception -> L18
            if (r0 != r1) goto L18
            boolean r3 = X.C138515c7.LIZ()     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r3 = 0
        L19:
            boolean r2 = X.C69C.LIZJ()
            org.json.JSONObject r4 = X.C69C.LIZ()     // Catch: java.lang.Exception -> L2c
            if (r4 == 0) goto L2c
            java.lang.String r0 = "v3"
            int r0 = r4.optInt(r0)     // Catch: java.lang.Exception -> L2c
            if (r0 != r1) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            r5.getClass()
            X.634 r0 = X.AnonymousClass699.LIZIZ()
            X.631 r0 = r0.LIZIZ
            r0.LJLILLLLZI = r6
            X.634 r0 = X.AnonymousClass699.LIZIZ()
            X.631 r0 = r0.LIZIZ
            r0.LJLJI = r7
            X.634 r0 = X.AnonymousClass699.LIZIZ()
            X.631 r0 = r0.LIZIZ
            r0.LJLJJI = r8
            X.634 r0 = X.AnonymousClass699.LIZIZ()
            X.631 r0 = r0.LIZIZ
            r0.LJLJJL = r3
            X.634 r0 = X.AnonymousClass699.LIZIZ()
            X.631 r0 = r0.LIZIZ
            r0.LJLJJLL = r2
            X.634 r0 = X.AnonymousClass699.LIZIZ()
            X.631 r0 = r0.LIZIZ
            r0.LJLJL = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69B.LIZLLL(boolean, boolean, boolean):void");
    }
}
