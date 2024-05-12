package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ENT implements InterfaceC65104Pgq {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(EN8.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(EN9.LJLIL);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OSZ LJIIJ(org.json.JSONObject r4) {
        /*
            java.lang.String r1 = "code"
            boolean r0 = r4.has(r1)
            r3 = -1
            if (r0 == 0) goto L1b
            int r3 = r4.optInt(r1, r3)
        Ld:
            if (r3 != 0) goto L28
            java.lang.String r2 = "success"
        L11:
            X.OSZ r1 = new X.OSZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.<init>(r0, r2)
            return r1
        L1b:
            java.lang.String r1 = "status_code"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L28
            int r3 = r4.optInt(r1, r3)
            goto Ld
        L28:
            java.lang.String r1 = "message"
            boolean r0 = r4.has(r1)
            java.lang.String r2 = "unknown"
            if (r0 == 0) goto L3c
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r0 = "jsonObject.optString(MESSAGE, errorMsg)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L11
        L3c:
            java.lang.String r1 = "msg"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L4e
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r0 = "jsonObject.optString(MSG, errorMsg)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L11
        L4e:
            java.lang.String r1 = "status_msg"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L11
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r0 = "jsonObject.optString(STATUS_MSG, errorMsg)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENT.LJIIJ(org.json.JSONObject):X.OSZ");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LIZJ(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJFF(C64797Pbt<?> response) {
        o.LJIIIZ(response, "response");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJII(Request request) {
        o.LJIIIZ(request, "request");
    }

    public final boolean LJIIJJI(Request request) {
        Object LIZ;
        try {
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!((java.util.Set) this.LIZ.getValue()).contains(request.getHost()) && !((java.util.Set) this.LIZIZ.getValue()).contains(request.getPath())) {
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65104Pgq
    public final void onException(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [T, java.lang.Object] */
    @Override // X.InterfaceC65104Pgq
    public final void LJIIIIZZ(Request request, C64797Pbt<?> c64797Pbt, Throwable th) {
        Object LIZ;
        Object obj;
        Object obj2;
        C36910EeA c36910EeA;
        o.LJIIIZ(request, "request");
        try {
            if (LJIIJJI(request)) {
                C76732zl c76732zl = new C76732zl();
                c76732zl.element = -1;
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = "unknown";
                if (c64797Pbt == null || (c36910EeA = c64797Pbt.LIZ) == null) {
                    obj = null;
                } else {
                    obj = c36910EeA.LJFF;
                }
                HashMap hashMap = (HashMap) request.tag(HashMap.class);
                if (hashMap == null || (obj2 = hashMap.get("biz_type")) == null) {
                    obj2 = "";
                }
                if (c64797Pbt == null) {
                    if (th != null) {
                        c76732zl.element = -2;
                        String message = th.getMessage();
                        T t = message;
                        if (message == null) {
                            t = (String) c68322mC.element;
                        }
                        c68322mC.element = t;
                    }
                } else if (c64797Pbt.LIZIZ()) {
                    TypedInput typedInput = c64797Pbt.LIZ.LJ;
                    if (typedInput instanceof TypedByteArray) {
                        String mimeType = typedInput.mimeType();
                        o.LJIIIIZZ(mimeType, "rawBody.mimeType()");
                        String lowerCase = mimeType.toLowerCase(Locale.ROOT);
                        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (o.LJ(lowerCase, "application/json; charset=utf-8")) {
                            byte[] bytes = ((TypedByteArray) typedInput).getBytes();
                            o.LJIIIIZZ(bytes, "rawBody.bytes");
                            OSZ LJIIJ = LJIIJ(new JSONObject(new String(bytes, PVC.LIZ)));
                            c76732zl.element = ((Number) LJIIJ.getFirst()).intValue();
                            c68322mC.element = LJIIJ.getSecond();
                            if (c76732zl.element != -1 || o.LJ(c68322mC.element, "unknown")) {
                                c76732zl.element = -3;
                                c68322mC.element = "not_adapted";
                                C76542zS.LIZIZ("rd_tiktokec_network_not_adapted", C113554cx.LJJJLIIL(), new AqS137S0200000_6(request, typedInput, 28));
                            }
                        }
                    }
                    if (request.isResponseStreaming()) {
                        c76732zl.element = 0;
                        c68322mC.element = "success";
                    }
                    if (c76732zl.element != -1) {
                    }
                    c76732zl.element = -3;
                    c68322mC.element = "not_adapted";
                    C76542zS.LIZIZ("rd_tiktokec_network_not_adapted", C113554cx.LJJJLIIL(), new AqS137S0200000_6(request, typedInput, 28));
                } else {
                    c76732zl.element = c64797Pbt.LIZ.LIZIZ;
                }
                C76542zS.LIZIZ("rd_tiktokec_network", C113554cx.LJJJLIIL(), new C36674EaM(c76732zl, c68322mC, request, c64797Pbt, obj2, obj));
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th2) {
            LIZ = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
    }
}
