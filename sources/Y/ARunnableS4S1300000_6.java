package Y;

import X.C141335gf;
import X.C16880lQ;
import X.C24020ww;
import X.C31889CfN;
import X.C31942CgE;
import X.C36615EYp;
import X.C37848EtI;
import X.C37903EuB;
import X.C37904EuC;
import X.C37952Euy;
import X.C37954Ev0;
import X.C37955Ev1;
import X.C38696FGq;
import X.C38805FKv;
import X.C39048FUe;
import X.C39868Fkm;
import X.C39870Fko;
import X.C39872Fkq;
import X.C39873Fkr;
import X.C39879Fkx;
import X.C39927Flj;
import X.C3C5;
import X.C44847Hit;
import X.C48153Iv7;
import X.C64698PaI;
import X.C64797Pbt;
import X.C64799Pbv;
import X.C64802Pby;
import X.C76800UCe;
import X.C79850VVm;
import X.EJ6;
import X.EnumC37907EuF;
import X.EnumC39866Fkk;
import X.EnumC39871Fkp;
import X.F18;
import X.FL5;
import X.InterfaceC37276Ek4;
import X.InterfaceC39875Fkt;
import X.InterfaceC39876Fku;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.PVC;
import X.X1D;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.lynx.hybrid.ssp.base.net.DefaultNetAdapter;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.Gson;
import com.google.gson.m;
import com.lynx.react.bridge.ReadableMap;
import defpackage.i0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS39S1300000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS4S1300000_6 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$3() {
        /*
            r8 = this;
            r4 = 6
            r5 = 41
            r3 = 0
            java.lang.String r0 = r8.s0     // Catch: java.lang.Throwable -> Lbc
            r2 = 0
            if (r0 == 0) goto Lbb
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto L11
            goto Lbb
        L11:
            java.lang.Object r0 = r8.l1     // Catch: java.lang.Throwable -> Lbc
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r7 = X.C85693Xx.LIZJ(r0, r3)     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto Lba
            java.lang.Object r6 = r8.l2     // Catch: java.lang.Throwable -> Lbc
            com.google.gson.m r6 = (com.google.gson.m) r6     // Catch: java.lang.Throwable -> Lbc
            if (r6 == 0) goto Lb0
        L21:
            java.lang.String r0 = "version"
            com.google.gson.j r1 = r6.LJJIJ(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = "realManifest.get(\"version\")"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r1 = r1.LJJIFFI()     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto Lba
            com.bytedance.keva.Keva r0 = X.C37376Elg.LIZJ(r7)     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L83
            X.Elh r0 = X.C37376Elg.LJIIJ(r0, r7)     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L79
        L3e:
            com.bytedance.pia.core.cache.IPiaCacheProvider$CacheConfig r0 = r0.LIZIZ()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L83
            java.lang.String r0 = r0.version     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L83
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L80
            java.lang.Object r1 = r8.l1     // Catch: java.lang.Throwable -> Lbc
            android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r0 = r8.l3     // Catch: java.lang.Throwable -> Lbc
            com.bytedance.pia.core.cache.IPiaCacheProvider r0 = (com.bytedance.pia.core.cache.IPiaCacheProvider) r0     // Catch: java.lang.Throwable -> Lbc
            X.C37376Elg.LJ(r1, r0, r2)     // Catch: java.lang.Throwable -> Lbc
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = "[PIACacheManager] No Need to validate Cache Finish. (URL: "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r0 = r8.l1     // Catch: java.lang.Throwable -> Lbc
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.Throwable -> Lbc
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbc
            r1.append(r5)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lbc
            X.C37238EjS.LJI(r4, r0, r3)     // Catch: java.lang.Throwable -> Lbc
        L73:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Lbc
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> Lbc
            goto Lc4
        L79:
            java.lang.Object r0 = r8.l3     // Catch: java.lang.Throwable -> Lbc
            com.bytedance.pia.core.cache.IPiaCacheProvider r0 = (com.bytedance.pia.core.cache.IPiaCacheProvider) r0     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L83
            goto L3e
        L80:
            X.C37376Elg.LJIIJJI(r7)     // Catch: java.lang.Throwable -> Lbc
        L83:
            java.lang.Object r1 = r8.l1     // Catch: java.lang.Throwable -> Lbc
            android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r8.s0     // Catch: java.lang.Throwable -> Lbc
            boolean r2 = X.C37376Elg.LJIILIIL(r1, r0, r6, r3)     // Catch: java.lang.Throwable -> Lbc
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = "[PIACacheManager] Validate Cache Finish. (URL: "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r0 = r8.l1     // Catch: java.lang.Throwable -> Lbc
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.Throwable -> Lbc
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = " , isUpdate: "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbc
            r1.append(r2)     // Catch: java.lang.Throwable -> Lbc
            r1.append(r5)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lbc
            X.C37238EjS.LJI(r4, r0, r3)     // Catch: java.lang.Throwable -> Lbc
            goto L73
        Lb0:
            java.lang.String r0 = r8.s0     // Catch: java.lang.Throwable -> Lbc
            com.google.gson.m r6 = X.C37653Eq9.LIZ(r0)     // Catch: java.lang.Throwable -> Lbc
            if (r6 == 0) goto Lba
            goto L21
        Lba:
            return
        Lbb:
            return
        Lbc:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        Lc4:
            java.lang.Throwable r2 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r2 == 0) goto Lec
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "[PIACacheManager] Validate Cache Exception. (URL: "
            r1.append(r0)
            java.lang.Object r0 = r8.l1
            android.net.Uri r0 = (android.net.Uri) r0
            r1.append(r0)
            java.lang.String r0 = " , Error: "
            r1.append(r0)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C37238EjS.LIZLLL(r4, r0, r3)
        Lec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS4S1300000_6.LIZ$3():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        try {
            C31942CgE c31942CgE = (C31942CgE) C37848EtI.LIZJ(C31942CgE.class);
            if (c31942CgE != null) {
                String name = this.s0;
                C79850VVm c79850VVm = new C79850VVm((ReadableMap) this.l1);
                F18 f18 = new F18(this);
                C31889CfN xBridgeRegister = (C31889CfN) this.l3;
                o.LJIIJ(name, "name");
                o.LJIIJ(xBridgeRegister, "xBridgeRegister");
                c31942CgE.LIZIZ(name, c79850VVm, f18, xBridgeRegister);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZ$2() {
        C37952Euy c37952Euy = (C37952Euy) this.l1;
        C37904EuC c37904EuC = c37952Euy.LIZ.LIZ.LIZ;
        C37903EuB c37903EuB = c37904EuC.LIZ;
        if (c37903EuB != null) {
            JSONObject jSONObject = (JSONObject) this.l2;
            String str = this.s0;
            c37952Euy.getClass();
            C37955Ev1 c37955Ev1 = new C37955Ev1(c37904EuC);
            String optString = jSONObject.optString("__callback_id");
            o.LJFF(optString, "msg.optString(\"__callback_id\")");
            c37955Ev1.LIZJ = optString;
            String optString2 = jSONObject.optString("func");
            o.LJFF(optString2, "msg.optString(\"func\")");
            c37955Ev1.LIZLLL = optString2;
            o.LJIIJ(str, "<set-?>");
            c37955Ev1.LJ = str;
            String optString3 = jSONObject.optString("__msg_type");
            o.LJFF(optString3, "msg.optString(\"__msg_type\")");
            c37955Ev1.LJFF = optString3;
            c37955Ev1.LJI = jSONObject.opt("params");
            String optString4 = jSONObject.optString("JSSDK");
            o.LJFF(optString4, "msg.optString(\"JSSDK\")");
            c37955Ev1.LJII = optString4;
            String optString5 = jSONObject.optString("namespace", "DEFAULT");
            o.LJFF(optString5, "msg.optString(\"namespace…geCall.DEFAULT_NAMESPACE)");
            c37955Ev1.LJIIIIZZ = optString5;
            String optString6 = jSONObject.optString("__iframe_url");
            o.LJFF(optString6, "msg.optString(\"__iframe_url\")");
            c37955Ev1.LJIIIZ = optString6;
            c37955Ev1.LJIIJ = jSONObject.optLong("__timestamp", System.currentTimeMillis());
            c37955Ev1.LIZIZ(EnumC37907EuF.Web);
            String jSONObject2 = jSONObject.toString();
            o.LJFF(jSONObject2, "msg.toString()");
            c37955Ev1.LJIIJJI = jSONObject2;
            c37903EuB.LIZ(c37955Ev1, new C37954Ev0(this), c37904EuC, null);
        }
    }

    public final void LIZ$1() {
        Object LIZ;
        SSPResponse.Data data;
        Object LIZ2;
        String str;
        C64797Pbt<TypedInput> c64797Pbt;
        String str2;
        InputStream inputStream;
        InputStream inputStream2;
        long currentTimeMillis = System.currentTimeMillis();
        C24020ww c24020ww = C39868Fkm.LIZIZ;
        String originUrl = this.s0;
        c24020ww.getClass();
        o.LJIIJ(originUrl, "originUrl");
        Uri uri = UriProtector.parse(originUrl);
        String string = ((Keva) c24020ww.LIZIZ).getString(originUrl, "");
        if (TextUtils.isEmpty(string)) {
            o.LJFF(uri, "uri");
            if (uri.getQuery() != null) {
                string = ((Keva) c24020ww.LIZIZ).getString(C39927Flj.LIZJ(uri), "");
            }
        }
        if (TextUtils.isEmpty(string)) {
            data = null;
        } else {
            try {
                C39870Fko.LIZJ.getClass();
                LIZ = (SSPResponse.Data) GsonProtectorUtils.fromJson((Gson) C39870Fko.LIZIZ.getValue(), string, SSPResponse.Data.class);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            data = (SSPResponse.Data) LIZ;
        }
        ((C39879Fkx) this.l1).LJIIJJI = C44847Hit.LIZ(currentTimeMillis);
        if (data != null) {
            C39868Fkm.LIZIZ.getClass();
            if (data.expire > System.currentTimeMillis()) {
                C39048FUe c39048FUe = C39048FUe.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("hit ssp cache response, url:");
                LIZ3.append(this.s0);
                LIZ3.append(", response:");
                LIZ3.append(data);
                C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ3), null, "SspLifeCycle", 2);
                ((C39879Fkx) this.l1).LIZLLL = EnumC39871Fkp.HIT;
                ((InterfaceC39875Fkt) this.l2).LIZ(this.s0, data);
                return;
            }
            ((C39879Fkx) this.l1).LIZLLL = EnumC39871Fkp.INVALID;
        } else {
            ((C39879Fkx) this.l1).LIZLLL = EnumC39871Fkp.NONE;
        }
        C39868Fkm c39868Fkm = C39868Fkm.LJFF;
        C39868Fkm.LJ.put(this.s0, new OSZ<>((InterfaceC39875Fkt) this.l2, (C39879Fkx) this.l1));
        DefaultNetAdapter defaultNetAdapter = C39868Fkm.LIZLLL;
        String url = this.s0;
        C39873Fkr config = (C39873Fkr) this.l3;
        defaultNetAdapter.getClass();
        o.LJIIJ(url, "url");
        o.LJIIJ(config, "config");
        HashMap hashMap = new HashMap();
        hashMap.put("ssp_sdk_version", String.valueOf(1));
        m mVar = new m();
        mVar.LJJIIZ("url", url);
        mVar.LJJIIZ("bid", config.LJLIL);
        mVar.LJJIII(Boolean.FALSE, "need_all_page");
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, i0.LJFF("start fetch ssp single page response. https://scc.tiktokv.com/ssp_sdk/url_resource, url:", url), null, "SspLifeCycle", 2);
        ArrayList<EJ6> arrayList = defaultNetAdapter.LIZ;
        InterfaceC39876Fku interfaceC39876Fku = C39868Fkm.LIZJ;
        if (interfaceC39876Fku != null) {
            C39872Fkq c39872Fkq = new C39872Fkq();
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                DefaultNetAdapter.TTNetAdapterApi tTNetAdapterApi = (DefaultNetAdapter.TTNetAdapterApi) interfaceC39876Fku.create(DefaultNetAdapter.TTNetAdapterApi.class);
                C48153Iv7 c48153Iv7 = new C48153Iv7();
                c48153Iv7.LJIIIIZZ = 5000L;
                byte[] bytes = String.valueOf(mVar).getBytes(PVC.LIZ);
                o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
                InterfaceC37276Ek4<TypedInput> send = tTNetAdapterApi.send("https://scc.tiktokv.com/ssp_sdk/url_resource", hashMap, true, c48153Iv7, new TypedByteArray("application/x-www-form-urlencoded; charset=UTF-8", bytes, new String[0]), arrayList);
                if (send != null) {
                    c64797Pbt = send.execute();
                } else {
                    c64797Pbt = null;
                }
                c39872Fkq.LIZLLL = Long.valueOf(System.currentTimeMillis() - currentTimeMillis2);
                if (c64797Pbt == null) {
                    str2 = null;
                } else {
                    str2 = C36615EYp.LIZ(c64797Pbt);
                }
                c39872Fkq.LJ = str2;
                if (c64797Pbt != null) {
                    int i = c64797Pbt.LIZ.LIZIZ;
                    if (200 > i || 299 < i) {
                        c39872Fkq.LIZ = false;
                        TypedInput typedInput = c64797Pbt.LIZIZ;
                        if (typedInput != null) {
                            inputStream2 = typedInput.in();
                        } else {
                            inputStream2 = null;
                        }
                        c39872Fkq.LIZJ = DefaultNetAdapter.LIZ(inputStream2);
                    } else {
                        c39872Fkq.LIZ = true;
                        TypedInput typedInput2 = c64797Pbt.LIZIZ;
                        if (typedInput2 != null) {
                            inputStream = typedInput2.in();
                        } else {
                            inputStream = null;
                        }
                        c39872Fkq.LIZIZ = DefaultNetAdapter.LIZ(inputStream);
                    }
                    c39868Fkm.LIZIZ(url, c39872Fkq);
                }
            } catch (C64698PaI e) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(C64698PaI.class.toString());
                LIZ4.append(":");
                LIZ4.append(e.getMessage());
                LIZ4.append(',');
                LIZ4.append(-12002);
                c39872Fkq.LIZJ = X1D.LIZIZ(LIZ4);
                c39872Fkq.LIZ = false;
                c39868Fkm.LIZIZ(url, c39872Fkq);
            } catch (C64799Pbv e2) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(C64799Pbv.class.toString());
                LIZ5.append(":");
                LIZ5.append(e2.getMessage());
                LIZ5.append(",");
                LIZ5.append(e2.getStatusCode());
                c39872Fkq.LIZJ = X1D.LIZIZ(LIZ5);
                e2.getStatusCode();
                try {
                    LIZ2 = new JSONObject(e2.getRequestInfo().LJJII);
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th2) {
                    LIZ2 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m12isFailureimpl(LIZ2)) {
                    LIZ2 = null;
                }
                JSONObject jSONObject = (JSONObject) LIZ2;
                if (jSONObject != null) {
                    if (jSONObject.has("x-tt-logid")) {
                        str = jSONObject.optString("x-tt-logid");
                    } else if (jSONObject.has("X-Tt-Logid")) {
                        str = jSONObject.optString("X-Tt-Logid");
                    }
                    c39872Fkq.LJ = str;
                    c39872Fkq.LIZ = false;
                    c39868Fkm.LIZIZ(url, c39872Fkq);
                }
                str = null;
                c39872Fkq.LJ = str;
                c39872Fkq.LIZ = false;
                c39868Fkm.LIZIZ(url, c39872Fkq);
            } catch (C64802Pby e3) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(C64802Pby.class.toString());
                LIZ6.append(":");
                LIZ6.append(e3.getMessage());
                LIZ6.append(",");
                LIZ6.append(e3.getStatusCode());
                c39872Fkq.LIZJ = X1D.LIZIZ(LIZ6);
                e3.getStatusCode();
                c39872Fkq.LIZ = false;
                c39868Fkm.LIZIZ(url, c39872Fkq);
            } catch (Throwable th3) {
                C39048FUe c39048FUe2 = C39048FUe.LIZIZ;
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("ssp send request unknown error: ");
                LIZ7.append(th3);
                LIZ7.append(", url:");
                LIZ7.append(url);
                c39048FUe2.LIZ(X1D.LIZIZ(LIZ7), EnumC39866Fkk.E, "SspLifeCycle");
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append(th3.getClass().toString());
                LIZ8.append(":");
                LIZ8.append(th3.getMessage());
                c39872Fkq.LIZJ = X1D.LIZIZ(LIZ8);
                c39872Fkq.LIZ = false;
                c39868Fkm.LIZIZ(url, c39872Fkq);
            }
        }
    }

    public static final void run$0(ARunnableS4S1300000_6 aRunnableS4S1300000_6) {
        boolean LIZ;
        try {
            aRunnableS4S1300000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S1300000_6 aRunnableS4S1300000_6) {
        boolean LIZ;
        try {
            C38696FGq.LIZ(new ARunnableS42S0100000_6(aRunnableS4S1300000_6, 110));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS4S1300000_6 aRunnableS4S1300000_6) {
        boolean LIZ;
        try {
            aRunnableS4S1300000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS4S1300000_6 aRunnableS4S1300000_6) {
        boolean LIZ;
        try {
            aRunnableS4S1300000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS4S1300000_6 aRunnableS4S1300000_6) {
        Object LIZ;
        String str = aRunnableS4S1300000_6.s0;
        AqS39S1300000_6 aqS39S1300000_6 = new AqS39S1300000_6((Integer) aRunnableS4S1300000_6.l1, str, (InterfaceC65784Pro) aRunnableS4S1300000_6.l2, (InterfaceC65784Pro) aRunnableS4S1300000_6.l3, 0);
        C38805FKv.LIZ.getClass();
        FL5 fl5 = (FL5) ((LinkedHashMap) C38805FKv.LJI).get(str);
        if (fl5 != null) {
            try {
                LIZ = (C76800UCe) aqS39S1300000_6.invoke();
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                o.LJI(str);
                fl5.LIZ();
                return;
            }
            return;
        }
        aqS39S1300000_6.invoke();
    }

    public static final void run$5(ARunnableS4S1300000_6 aRunnableS4S1300000_6) {
        boolean LIZ;
        try {
            aRunnableS4S1300000_6.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS4S1300000_6(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj3;
        this.l3 = obj2;
    }
}
