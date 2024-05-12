package X;

import com.bytedance.bpea.basics.Cert;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q0V implements InterfaceC66311Q0t {
    public final String LIZ = "ConditionChecker";

    @Override // X.InterfaceC66311Q0t
    public final String name() {
        return "ConditionChecker";
    }

    @Override // X.InterfaceC66311Q0t
    public final C66300Q0i LIZ(OHW context) {
        C61648OHk LIZ;
        o.LJIIJ(context, "context");
        Cert cert = context.LIZIZ;
        if (cert != null) {
            String certToken = cert.certToken();
            boolean z = true;
            if (certToken != null && certToken.length() != 0) {
                C66300Q0i c66300Q0i = new C66300Q0i(0, null, 7);
                if (cert != null) {
                    long nanoTime = System.nanoTime();
                    String authKey = cert.authKey();
                    if (authKey == null || authKey.length() == 0) {
                        LIZ = Q0E.LJ.LIZ(cert);
                    } else {
                        LIZ = Q0E.LIZLLL.LIZ(cert);
                    }
                    C78923UyF.LIZLLL(c66300Q0i, "parseConditionCostTime", Long.valueOf(System.nanoTime() - nanoTime));
                    int i = LIZ.LJLIL;
                    if (i < 0) {
                        c66300Q0i.LIZLLL = i;
                        String str = LIZ.LJLILLLLZI;
                        if (str == null) {
                            str = "limit parse failed";
                        }
                        c66300Q0i.LJ = str;
                        if (i != -2101) {
                            z = false;
                        }
                        c66300Q0i.LIZ = z;
                        return c66300Q0i;
                    }
                    List<InterfaceC61646OHi> list = (List) LIZ.LJLJI;
                    if (list == null || list.isEmpty()) {
                        if (Q0O.LIZ) {
                            Q0L.LIZ(this.LIZ, "conditions is empty");
                        }
                    } else {
                        for (InterfaceC61646OHi interfaceC61646OHi : list) {
                            if (Q0O.LIZ) {
                                String str2 = this.LIZ;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("start check condition:");
                                LIZ2.append(interfaceC61646OHi);
                                Q0L.LIZ(str2, X1D.LIZIZ(LIZ2));
                            }
                            try {
                                C66300Q0i LIZ3 = interfaceC61646OHi.LIZ(context);
                                if (Q0O.LIZ) {
                                    String str3 = this.LIZ;
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("check condition result:");
                                    LIZ4.append(LIZ3);
                                    Q0L.LIZ(str3, X1D.LIZIZ(LIZ4));
                                }
                                JSONObject LJIIIIZZ = C78923UyF.LJIIIIZZ(LIZ3);
                                if (LJIIIIZZ != null) {
                                    C78923UyF.LIZIZ(c66300Q0i, LJIIIIZZ);
                                }
                            } catch (Q0C e) {
                                if (e.getErrorCode() == -2001) {
                                    EnumC66308Q0q LIZIZ = C66295Q0d.LIZIZ(e.getErrorCode(), context, "ConditionChecker");
                                    if (LIZIZ != null) {
                                        int i2 = C66309Q0r.LIZ[LIZIZ.ordinal()];
                                        if (i2 != 1) {
                                            if (i2 == 2) {
                                                throw e;
                                            }
                                        } else {
                                            c66300Q0i.LIZLLL = 0;
                                            c66300Q0i.LJ = "Ignore entryToken verify fail";
                                        }
                                    }
                                    c66300Q0i.LIZLLL = e.getErrorCode();
                                    String errorMsg = e.getErrorMsg();
                                    o.LJIIJ(errorMsg, "<set-?>");
                                    c66300Q0i.LJ = errorMsg;
                                    c66300Q0i.LIZ = false;
                                } else {
                                    throw e;
                                }
                            }
                        }
                    }
                }
                JSONObject LJIIIIZZ2 = C78923UyF.LJIIIIZZ(c66300Q0i);
                if (LJIIIIZZ2 != null) {
                    context.LIZ.put("certConfig", LJIIIIZZ2);
                }
                return c66300Q0i;
            }
        }
        if (Q0O.LIZ) {
            Q0L.LIZ(this.LIZ, "certToken is empty,skip condition check");
        }
        return new C66300Q0i(-2002, "cert is empty", 4);
    }
}
