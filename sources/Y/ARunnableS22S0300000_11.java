package Y;

import X.AbstractC66121PxF;
import X.C0EH;
import X.C16880lQ;
import X.C1FL;
import X.C47261Igj;
import X.C48130Iuk;
import X.C53262KvK;
import X.C63915P6p;
import X.C63934P7i;
import X.C63936P7k;
import X.C64598PWw;
import X.C64862Pcw;
import X.C64863Pcx;
import X.C64869Pd3;
import X.C66120PxE;
import X.C66152Pxk;
import X.C66696QFo;
import X.C67550QfC;
import X.C67641Qgf;
import X.C67646Qgk;
import X.C67801QjF;
import X.C67887Qkd;
import X.C67947Qlb;
import X.C68410Qt4;
import X.C68413Qt7;
import X.C68416QtA;
import X.C68421QtF;
import X.C68430QtO;
import X.C68494QuQ;
import X.C68495QuR;
import X.C68496QuS;
import X.C68517Qun;
import X.C68518Quo;
import X.C68529Quz;
import X.EnumC84152X0y;
import X.InterfaceC63852P4e;
import X.InterfaceC66822QKk;
import X.InterfaceC68422QtG;
import X.InterfaceC68509Quf;
import X.InterfaceC68510Qug;
import X.InterfaceC87361YQj;
import X.ORZ;
import X.OSZ;
import X.P3H;
import X.PT6;
import X.PXW;
import X.QGR;
import X.QGS;
import X.QKT;
import X.QR0;
import X.QR8;
import X.QT4;
import X.QV9;
import X.W7U;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.push.settings.ISettings;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.Feature;
import com.google.gson.Gson;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ugc.aweme.account.login.loginmethods.EncryptedLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS22S0300000_11 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ((ISettings) PT6.LIZ((Context) this.l0, PaymentOnlineSettings.class)).updateSettings((Context) this.l0, (JSONObject) this.l1);
        ((PaymentLocalSettings) PT6.LIZ((Context) this.l0, PaymentLocalSettings.class)).LJIIZILJ(System.currentTimeMillis());
        ((QT4) this.l2).LJLILLLLZI.LIZ();
    }

    public final void LIZ$1() {
        InterfaceC68510Qug LJIJI = ((C68494QuQ) this.l0).LIZLLL().LJIJI();
        ArrayList arrayList = (ArrayList) this.l1;
        C68495QuR c68495QuR = (C68495QuR) LJIJI;
        c68495QuR.LIZ.LIZJ();
        try {
            c68495QuR.LIZIZ.LJ(arrayList);
            c68495QuR.LIZ.LJIILLIIL();
            c68495QuR.LIZ.LJIIJJI();
            InterfaceC68509Quf LJIJ = ((C68494QuQ) this.l0).LIZLLL().LJIJ();
            ArrayList LJII = C47261Igj.LJII((QV9) this.l2);
            C68496QuS c68496QuS = (C68496QuS) LJIJ;
            c68496QuS.LIZ.LIZJ();
            try {
                c68496QuS.LIZJ.LJ(LJII);
                c68496QuS.LIZ.LJIILLIIL();
            } finally {
                c68496QuS.LIZ.LJIIJJI();
            }
        } catch (Throwable th) {
            c68495QuR.LIZ.LJIIJJI();
            throw th;
        }
    }

    public final void LIZ$2() {
        OSZ osz;
        String str;
        String avatarUrl;
        List<? extends BaseLoginMethod> LLILLL = ORZ.LLILLL(ORZ.LLILII(new IDComparatorS39S0000000_11(21), (List) this.l0), 5);
        ((C68518Quo) this.l1).LIZIZ.LIZIZ(LLILLL);
        if (C53262KvK.LIZ() != 0) {
            ((C68518Quo) this.l1).getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<? extends BaseLoginMethod> it = LLILLL.iterator();
            while (true) {
                String str2 = "";
                if (it.hasNext()) {
                    BaseLoginMethod next = it.next();
                    if (o.LJ(next.isOneClickLogin(), Boolean.TRUE) && next.getOneClickLoginToken() != null) {
                        String uid = next.getUid();
                        LoginMethodName loginMethodName = next.getLoginMethodName();
                        CommonUserInfo commonUserInfo = next.getCommonUserInfo();
                        if (commonUserInfo == null || (str = commonUserInfo.getUserName()) == null) {
                            str = "";
                        }
                        CommonUserInfo commonUserInfo2 = next.getCommonUserInfo();
                        if (commonUserInfo2 != null && (avatarUrl = commonUserInfo2.getAvatarUrl()) != null) {
                            str2 = avatarUrl;
                        }
                        Long valueOf = Long.valueOf(C68517Qun.LJFF(next));
                        String oneClickLoginToken = next.getOneClickLoginToken();
                        if (oneClickLoginToken != null) {
                            arrayList.add(new EncryptedLoginMethod(uid, loginMethodName, str, str2, valueOf, oneClickLoginToken, next.findPlatform()));
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                } else {
                    InterfaceC68422QtG interfaceC68422QtG = (InterfaceC68422QtG) this.l2;
                    ((C68518Quo) this.l1).getClass();
                    Integer num = null;
                    if (C68518Quo.LIZ()) {
                        C68529Quz c68529Quz = ((C68518Quo) this.l1).LIZJ;
                        c68529Quz.getClass();
                        ((Keva) c68529Quz.LIZ.getValue()).storeString("OCL_DATA", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), arrayList));
                        if (interfaceC68422QtG != null) {
                            interfaceC68422QtG.onSave(true, null);
                        }
                        interfaceC68422QtG = null;
                    }
                    C68416QtA c68416QtA = ((C68518Quo) this.l1).LIZ;
                    c68416QtA.getClass();
                    if (!C67550QfC.LIZ()) {
                        if (interfaceC68422QtG != null) {
                            interfaceC68422QtG.onSave(false, -1);
                            return;
                        }
                        return;
                    }
                    if (arrayList.isEmpty()) {
                        osz = new OSZ("", null);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        Gson LIZ = GsonHolder.LIZLLL().LIZ();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            String json = GsonProtectorUtils.toJson(LIZ, it2.next());
                            if (C1FL.LIZ(json, sb.length(), 2) < 4096) {
                                if (sb.length() == 0) {
                                    sb.append("[");
                                } else {
                                    sb.append(",");
                                }
                                sb.append(json);
                            } else {
                                num = -2;
                            }
                        }
                        osz = new OSZ(C0EH.LIZJ(sb, "]", "sb.toString()"), num);
                    }
                    C68421QtF c68421QtF = new C68421QtF();
                    byte[] bytes = ((String) osz.getFirst()).getBytes(C68416QtA.LIZIZ);
                    o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                    c68421QtF.LIZ = bytes;
                    C67801QjF c67801QjF = c68416QtA.LIZ;
                    c67801QjF.getClass();
                    C67887Qkd c67887Qkd = new C67887Qkd();
                    c67887Qkd.LIZJ = new Feature[]{C67947Qlb.LIZIZ};
                    c67887Qkd.LIZ = new C68410Qt4(c67801QjF);
                    c67887Qkd.LIZIZ = false;
                    c67887Qkd.LIZLLL = 1651;
                    C67646Qgk LIZLLL = c67801QjF.LIZLLL(0, c67887Qkd.LIZ());
                    C68413Qt7 c68413Qt7 = new C68413Qt7(c68421QtF, c68416QtA, osz, interfaceC68422QtG);
                    LIZLLL.getClass();
                    LIZLLL.LJFF(C67641Qgf.LIZ, c68413Qt7);
                    LIZLLL.LJIILLIIL(new C68430QtO(interfaceC68422QtG));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$3() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l2
            X.P7c r0 = (X.C63928P7c) r0
            java.lang.Object r1 = r6.l0
            X.P7g r1 = (X.C63932P7g) r1
            java.lang.Object r5 = r6.l1
            X.P7f r5 = (X.InterfaceC63931P7f) r5
            r0.getClass()
            r0 = 5
            r4 = 0
            java.net.HttpURLConnection r3 = X.C63928P7c.LIZIZ(r1, r0)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L6f
            java.io.InputStream r4 = r3.getInputStream()     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L5c
            java.lang.String r1 = "Content-Length"
            r0 = -1
            int r0 = r3.getHeaderFieldInt(r1, r0)     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L5c
            long r1 = (long) r0     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L5c
            r0 = r5
            X.PTk r0 = (X.C64508PTk) r0     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L5c
            r0.LIZIZ(r4, r1)     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L5c
            if (r4 == 0) goto L56
            r4.close()     // Catch: java.io.IOException -> L52
            goto L56
        L2d:
            r2 = move-exception
            r0 = r4
            r4 = r3
            goto L33
        L31:
            r2 = move-exception
            r0 = r4
        L33:
            boolean r1 = r2 instanceof X.C63929P7d     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L42
            r1 = r2
            X.P7d r1 = (X.C63929P7d) r1     // Catch: java.lang.Throwable -> L5a
            int r1 = r1.LJLIL     // Catch: java.lang.Throwable -> L5a
        L3c:
            X.PTk r5 = (X.C64508PTk) r5     // Catch: java.lang.Throwable -> L5a
            r5.LIZ(r1, r2)     // Catch: java.lang.Throwable -> L5a
            goto L44
        L42:
            r1 = 0
            goto L3c
        L44:
            if (r0 == 0) goto L4e
            r0.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L4e:
            if (r4 == 0) goto L59
            r3 = r4
            goto L56
        L52:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L56:
            r3.disconnect()
        L59:
            return
        L5a:
            r1 = move-exception
            goto L5f
        L5c:
            r1 = move-exception
            r0 = r4
            r4 = r3
        L5f:
            if (r0 == 0) goto L69
            r0.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L69:
            if (r4 == 0) goto L70
            r4.disconnect()
            goto L70
        L6f:
            r1 = move-exception
        L70:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS22S0300000_11.LIZ$3():void");
    }

    public final void LIZ$4() {
        int i;
        Iterator it = ((List) this.l1).iterator();
        while (it.hasNext()) {
            ((Number) it.next()).intValue();
            Object thisOrClass = ((C66120PxE) this.l2).LLI.getThisOrClass();
            if (thisOrClass != null) {
                i = thisOrClass.hashCode();
            } else {
                i = 0;
            }
            C66120PxE c66120PxE = (C66120PxE) this.l2;
            c66120PxE.LJLJJLL = null;
            c66120PxE.LJLJL = "";
            ((AbstractC66121PxF) this.l0).LJIIJJI(i, (List) this.l1, c66120PxE);
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x004d: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:34:? (LINE:77), block:B:31:0x004d */
    public final void LIZ$5() {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        C66696QFo c66696QFo = (C66696QFo) this.l2;
        QGS qgs = (QGS) this.l0;
        QGR qgr = (QGR) this.l1;
        c66696QFo.getClass();
        InputStream inputStream = null;
        try {
            try {
                httpURLConnection = c66696QFo.LJI(qgs.LIZJ(), 5);
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    throw th;
                }
                throw th;
            }
        } catch (IOException e) {
            e = e;
            httpURLConnection = null;
        } catch (Throwable th2) {
            throw th2;
        }
        if (httpURLConnection != null) {
            try {
                inputStream = httpURLConnection.getInputStream();
                ((W7U) qgr).LIZIZ(inputStream, -1);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                if (httpURLConnection == null) {
                    return;
                }
            } catch (IOException e2) {
                e = e2;
                W7U w7u = (W7U) qgr;
                w7u.LIZIZ.LJFF(w7u.LIZ, e);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnection == null) {
                    return;
                }
                httpURLConnection.disconnect();
            }
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(3:35|36|(10:38|(2:(2:9|10)|6)|11|12|(1:14)(1:30)|15|(1:17)(4:(1:24)|25|(1:27)(1:29)|28)|18|19|20))|3|(0)|11|12|(0)(0)|15|(0)(0)|18|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        r4.toString();
        ((X.OCR) r10.l1).LIZLLL(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[Catch: Exception -> 0x00bf, all -> 0x00ca, TRY_ENTER, TryCatch #4 {Exception -> 0x00bf, all -> 0x00ca, blocks: (B:14:0x0063, B:15:0x006d, B:17:0x0087, B:18:0x0096, B:24:0x009e, B:25:0x00a2, B:27:0x00a8, B:28:0x00ac, B:30:0x0068), top: B:12:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[Catch: Exception -> 0x00bf, all -> 0x00ca, TryCatch #4 {Exception -> 0x00bf, all -> 0x00ca, blocks: (B:14:0x0063, B:15:0x006d, B:17:0x0087, B:18:0x0096, B:24:0x009e, B:25:0x00a2, B:27:0x00a8, B:28:0x00ac, B:30:0x0068), top: B:12:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[Catch: Exception -> 0x00bf, all -> 0x00ca, TryCatch #4 {Exception -> 0x00bf, all -> 0x00ca, blocks: (B:14:0x0063, B:15:0x006d, B:17:0x0087, B:18:0x0096, B:24:0x009e, B:25:0x00a2, B:27:0x00a8, B:28:0x00ac, B:30:0x0068), top: B:12:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$6() {
        /*
            r10 = this;
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.Object r1 = r10.l0
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r0 = "url"
            java.lang.String r5 = r1.optString(r0)
            java.lang.Object r1 = r10.l0
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r0 = "method"
            java.lang.String r7 = r1.optString(r0)
            java.lang.Object r1 = r10.l0
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r0 = "params"
            java.lang.String r3 = r1.optString(r0)
            java.lang.Object r1 = r10.l0
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r0 = "data"
            org.json.JSONObject r9 = r1.optJSONObject(r0)
            java.lang.Object r1 = r10.l0
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r0 = "needCommonParams"
            boolean r1 = r1.optBoolean(r0)
            r8 = 0
            if (r3 == 0) goto L46
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Exception -> L5f
            if (r0 != 0) goto L46
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5f
            r2.<init>(r3)     // Catch: java.lang.Exception -> L5f
            goto L47
        L46:
            r2 = r8
        L47:
            if (r1 == 0) goto L60
            if (r2 != 0) goto L51
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L60
            r0.<init>()     // Catch: java.lang.Exception -> L60
            r2 = r0
        L51:
            X.QNE r0 = X.OIP.LIZ     // Catch: java.lang.Exception -> L60
            X.QN4 r1 = r0.LIZ     // Catch: java.lang.Exception -> L60
            java.lang.Object r0 = r10.l2     // Catch: java.lang.Exception -> L60
            X.QNK r0 = (X.QNK) r0     // Catch: java.lang.Exception -> L60
            android.app.Activity r0 = r0.LIZ     // Catch: java.lang.Exception -> L60
            X.QNK.LIZJ(r2, r1, r0)     // Catch: java.lang.Exception -> L60
            goto L60
        L5f:
            r2 = r8
        L60:
            r3 = 1
            if (r2 == 0) goto L68
            java.lang.StringBuilder r6 = X.C78840Uwu.LIZLLL(r5, r2)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            goto L6d
        L68:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            r6.<init>(r5)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
        L6d:
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            r5.<init>()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "application/x-www-form-urlencoded"
            r5.put(r1, r0)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            X.QNE r0 = X.OIP.LIZ     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            X.QN4 r0 = r0.LIZ     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            X.Pir r2 = r0.LJIIZILJ     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            java.lang.String r0 = "get"
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            if (r0 == 0) goto L9c
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            byte[] r1 = r2.get(r0, r5)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            java.nio.charset.Charset r0 = X.PVC.LIZ     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
        L96:
            java.lang.String r0 = "response"
            r4.put(r0, r2)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            goto Lbf
        L9c:
            if (r9 == 0) goto La2
            java.lang.StringBuilder r8 = X.C78840Uwu.LJIIJ(r9)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
        La2:
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            if (r8 == 0) goto Lbc
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
        Lac:
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            byte[] r1 = r2.post(r1, r5, r0)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            java.nio.charset.Charset r0 = X.PVC.LIZ     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lca
            goto L96
        Lbc:
            java.lang.String r0 = ""
            goto Lac
        Lbf:
            r4.toString()
            java.lang.Object r0 = r10.l1
            X.OCR r0 = (X.OCR) r0
            r0.LIZLLL(r3, r4)
            return
        Lca:
            r1 = move-exception
            r4.toString()
            java.lang.Object r0 = r10.l1
            X.OCR r0 = (X.OCR) r0
            r0.LIZLLL(r3, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS22S0300000_11.LIZ$6():void");
    }

    public final void LIZ$7() {
        C64862Pcw c64862Pcw = ((C64863Pcx) this.l2).LJLIL;
        if (c64862Pcw.LJLLILLLL == ((PXW) this.l0)) {
            c64862Pcw.LJIIJ(4);
            C64862Pcw c64862Pcw2 = ((C64863Pcx) this.l2).LJLIL;
            C48130Iuk c48130Iuk = c64862Pcw2.LJLJI;
            if (c48130Iuk != null) {
                c48130Iuk.LIZLLL();
            }
            c64862Pcw2.LJLJLLL.removeMessages(1);
            ((C64863Pcx) this.l2).LJLIL.LJLLL.LIZJ((C64598PWw) this.l1);
            C64869Pd3 c64869Pd3 = ((C64863Pcx) this.l2).LJLIL.LJLLI;
            if (c64869Pd3 != null) {
                C64598PWw c64598PWw = (C64598PWw) this.l1;
                if (c64869Pd3.LIZ != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", 1);
                        jSONObject.put("state", 4);
                        jSONObject.put("url", c64598PWw.LJLIL.url().LJIIIIZZ);
                        jSONObject.put("channel_type", 2);
                        c64869Pd3.LIZ.onConnection(jSONObject);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
    }

    public static final void run$0(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            aRunnableS22S0300000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            int[] iSORange = ((EnumC84152X0y) aRunnableS22S0300000_11.l2).getISORange((TECameraCapture) aRunnableS22S0300000_11.l0, (InterfaceC63852P4e) aRunnableS22S0300000_11.l1);
            if (iSORange != null) {
                ((InterfaceC63852P4e) aRunnableS22S0300000_11.l1).getISORange(iSORange);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            aRunnableS22S0300000_11.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            ((QR0) aRunnableS22S0300000_11.l2).LIZ.LIZJ((Context) aRunnableS22S0300000_11.l0, (QR8) aRunnableS22S0300000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            aRunnableS22S0300000_11.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            aRunnableS22S0300000_11.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            int LIZLLL = ((C64862Pcw) aRunnableS22S0300000_11.l2).LIZLLL();
            if (LIZLLL == 4 || LIZLLL == 1 || LIZLLL == 5) {
                return;
            }
            C64862Pcw c64862Pcw = (C64862Pcw) aRunnableS22S0300000_11.l2;
            Map map = (Map) aRunnableS22S0300000_11.l0;
            c64862Pcw.getClass();
            if (map != null) {
                map.remove("channel_id");
                ((ConcurrentHashMap) c64862Pcw.LJLJLJ).putAll(map);
            }
            C64862Pcw c64862Pcw2 = (C64862Pcw) aRunnableS22S0300000_11.l2;
            c64862Pcw2.handleMsg(c64862Pcw2.LJLJLLL.obtainMessage(2, (List) aRunnableS22S0300000_11.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            C64862Pcw c64862Pcw = (C64862Pcw) aRunnableS22S0300000_11.l2;
            Map map = (Map) aRunnableS22S0300000_11.l0;
            c64862Pcw.getClass();
            if (map != null) {
                map.remove("channel_id");
                ((ConcurrentHashMap) c64862Pcw.LJLJLJ).putAll(map);
            }
            C64862Pcw c64862Pcw2 = (C64862Pcw) aRunnableS22S0300000_11.l2;
            c64862Pcw2.handleMsg(c64862Pcw2.LJLJLLL.obtainMessage(7, (List) aRunnableS22S0300000_11.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            aRunnableS22S0300000_11.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        Bitmap bitmap;
        boolean LIZ;
        try {
            bitmap = ((C63936P7k) aRunnableS22S0300000_11.l2).LJLIL.LIZ((C63934P7i) aRunnableS22S0300000_11.l0);
        } catch (Throwable unused) {
            bitmap = null;
        }
        try {
            ((C63936P7k) aRunnableS22S0300000_11.l2).LJLILLLLZI.post(new ARunnableS30S0200000_11(aRunnableS22S0300000_11, bitmap, 80));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            int iso = ((EnumC84152X0y) aRunnableS22S0300000_11.l2).getISO((TECameraCapture) aRunnableS22S0300000_11.l0, (P3H) aRunnableS22S0300000_11.l1);
            if (iso >= 0) {
                ((P3H) aRunnableS22S0300000_11.l1).getCurrentISO(iso);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS22S0300000_11.l2).stopZoom((TECameraCapture) aRunnableS22S0300000_11.l0, (InterfaceC87361YQj) aRunnableS22S0300000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS22S0300000_11.l2).setFeatureParameters((TECameraCapture) aRunnableS22S0300000_11.l0, (Bundle) aRunnableS22S0300000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS22S0300000_11.l2).addCameraProvider((TECameraCapture) aRunnableS22S0300000_11.l0, (C63915P6p) aRunnableS22S0300000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            aRunnableS22S0300000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            Iterator<InterfaceC66822QKk> it = ((QKT) aRunnableS22S0300000_11.l0).LIZIZ.keySet().iterator();
            while (it.hasNext()) {
                if (((InterfaceC66822QKk) aRunnableS22S0300000_11.l1) == it.next()) {
                    ((InterfaceC66822QKk) aRunnableS22S0300000_11.l1).LIZ(aRunnableS22S0300000_11.l2);
                    return;
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            aRunnableS22S0300000_11.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS22S0300000_11 aRunnableS22S0300000_11) {
        boolean LIZ;
        try {
            aRunnableS22S0300000_11.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS22S0300000_11(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
    }

    public ARunnableS22S0300000_11(AbstractC66121PxF abstractC66121PxF, List list, C66120PxE c66120PxE, C66152Pxk c66152Pxk, int i) {
        this.$t = i;
        this.l0 = abstractC66121PxF;
        this.l1 = list;
        this.l2 = c66120PxE;
    }
}
