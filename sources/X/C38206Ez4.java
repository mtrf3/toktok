package X;

import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ez4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38206Ez4 implements InterfaceC37120EhY {
    public final /* synthetic */ C38205Ez3 LIZ;
    public final /* synthetic */ C38048EwW LIZIZ;

    @Override // X.InterfaceC37120EhY
    public final void LIZ(JSONObject data) {
        o.LJIIJ(data, "data");
        C38205Ez3 c38205Ez3 = this.LIZ;
        InterfaceC38217EzF interfaceC38217EzF = c38205Ez3.LJLILLLLZI;
        if (interfaceC38217EzF != null) {
            C38182Eyg c38182Eyg = ((C60238NkY) c38205Ez3.LJLIL.l0).LLILII;
            if (c38182Eyg != null) {
                c38182Eyg.LIZJ(interfaceC38217EzF, this.LIZIZ.LIZIZ, data);
            }
            C60238NkY c60238NkY = (C60238NkY) this.LIZ.LJLIL.l0;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("complete web bridge named ");
            LIZ.append(this.LIZIZ.LIZJ);
            LIZ.append(" success with result ");
            LIZ.append(data);
            c60238NkY.printLog(X1D.LIZIZ(LIZ), EnumC39958FmE.D, "BridgeRegistry");
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.bridge.IBridgeMethod");
    }

    public C38206Ez4(C38205Ez3 c38205Ez3, C38048EwW c38048EwW) {
        this.LIZ = c38205Ez3;
        this.LIZIZ = c38048EwW;
    }

    @Override // X.InterfaceC37120EhY
    public final void onError(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("msg", str);
            C38205Ez3 c38205Ez3 = this.LIZ;
            InterfaceC38217EzF interfaceC38217EzF = c38205Ez3.LJLILLLLZI;
            if (interfaceC38217EzF != null) {
                C38182Eyg c38182Eyg = ((C60238NkY) c38205Ez3.LJLIL.l0).LLILII;
                if (c38182Eyg != null) {
                    c38182Eyg.LIZJ(interfaceC38217EzF, this.LIZIZ.LIZIZ, jSONObject);
                }
                C60238NkY c60238NkY = (C60238NkY) this.LIZ.LJLIL.l0;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("complete web bridge named ");
                LIZ.append(this.LIZIZ.LIZJ);
                LIZ.append(" failure with status[");
                LIZ.append(i);
                LIZ.append(", ");
                LIZ.append(str);
                LIZ.append(']');
                c60238NkY.printLog(X1D.LIZIZ(LIZ), EnumC39958FmE.D, "BridgeRegistry");
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.bridge.IBridgeMethod");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.3C4, java.lang.Object] */
    @Override // X.InterfaceC37120EhY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r6, java.lang.String r7, org.json.JSONObject r8) {
        /*
            r5 = this;
            java.lang.String r4 = "complete web bridge named "
            java.lang.String r1 = "data"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> La8
            r3.<init>()     // Catch: org.json.JSONException -> La8
            java.lang.String r0 = "code"
            r3.put(r0, r6)     // Catch: org.json.JSONException -> La8
            java.lang.String r0 = "msg"
            r3.put(r0, r7)     // Catch: org.json.JSONException -> La8
            r3.put(r1, r8)     // Catch: org.json.JSONException -> La8
            X.Ez3 r0 = r5.LIZ     // Catch: org.json.JSONException -> La8
            X.EzF r2 = r0.LJLILLLLZI     // Catch: org.json.JSONException -> La8
            if (r2 == 0) goto La0
            kotlin.jvm.internal.AqS188S0100000_6 r0 = r0.LJLIL     // Catch: org.json.JSONException -> La8
            java.lang.Object r0 = r0.l0     // Catch: org.json.JSONException -> La8
            X.NkY r0 = (X.C60238NkY) r0     // Catch: org.json.JSONException -> La8
            X.Eyg r1 = r0.LLILII     // Catch: org.json.JSONException -> La8
            if (r1 == 0) goto L2d
            X.EwW r0 = r5.LIZIZ     // Catch: org.json.JSONException -> La8
            java.lang.String r0 = r0.LIZIZ     // Catch: org.json.JSONException -> La8
            r1.LIZJ(r2, r0, r3)     // Catch: org.json.JSONException -> La8
        L2d:
            r2 = 93
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L5b
            if (r0 <= 0) goto L51
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L5b
            r1.append(r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = " with ["
            r1.append(r0)     // Catch: java.lang.Throwable -> L5b
            r1.append(r8)     // Catch: java.lang.Throwable -> L5b
            r1.append(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L51
        L4d:
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L5b
            goto L63
        L51:
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = "data.toString()"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L5b
            goto L4d
        L5b:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)     // Catch: org.json.JSONException -> La8
            X.C3C5.m7constructorimpl(r1)     // Catch: org.json.JSONException -> La8
        L63:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)     // Catch: org.json.JSONException -> La8
            if (r0 == 0) goto L9e
        L69:
            java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> La8
            X.Ez3 r0 = r5.LIZ     // Catch: org.json.JSONException -> La8
            kotlin.jvm.internal.AqS188S0100000_6 r0 = r0.LJLIL     // Catch: org.json.JSONException -> La8
            java.lang.Object r3 = r0.l0     // Catch: org.json.JSONException -> La8
            X.NkY r3 = (X.C60238NkY) r3     // Catch: org.json.JSONException -> La8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> La8
            r1.<init>(r4)     // Catch: org.json.JSONException -> La8
            X.EwW r0 = r5.LIZIZ     // Catch: org.json.JSONException -> La8
            java.lang.String r0 = r0.LIZJ     // Catch: org.json.JSONException -> La8
            r1.append(r0)     // Catch: org.json.JSONException -> La8
            java.lang.String r0 = " failure with status["
            r1.append(r0)     // Catch: org.json.JSONException -> La8
            r1.append(r6)     // Catch: org.json.JSONException -> La8
            java.lang.String r0 = ", "
            r1.append(r0)     // Catch: org.json.JSONException -> La8
            r1.append(r7)     // Catch: org.json.JSONException -> La8
            r1.append(r2)     // Catch: org.json.JSONException -> La8
            java.lang.String r2 = r1.toString()     // Catch: org.json.JSONException -> La8
            X.FmE r1 = X.EnumC39958FmE.D     // Catch: org.json.JSONException -> La8
            java.lang.String r0 = "BridgeRegistry"
            r3.printLog(r2, r1, r0)     // Catch: org.json.JSONException -> La8
            goto Lac
        L9e:
            r7 = r1
            goto L69
        La0:
            X.Eqm r1 = new X.Eqm     // Catch: org.json.JSONException -> La8
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.bridge.IBridgeMethod"
            r1.<init>(r0)     // Catch: org.json.JSONException -> La8
            throw r1     // Catch: org.json.JSONException -> La8
        La8:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38206Ez4.LIZIZ(int, java.lang.String, org.json.JSONObject):void");
    }
}
