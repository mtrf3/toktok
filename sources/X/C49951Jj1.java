package X;

import defpackage.q;
import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Jj1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49951Jj1 extends C49952Jj2 {
    public String LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL = -2;
    public Integer LJ;
    public Integer LJFF;
    public Integer LJI;
    public String LJII;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchChainStatus(status=");
        LIZ.append(this.LJFF);
        LIZ.append(", errorCode=");
        LIZ.append(this.LJI);
        LIZ.append(", errorDesc=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public final void LIZLLL(Throwable th) {
        Class<?> cls;
        String message;
        C49950Jj0.LJFF.LIZJ();
        if (th instanceof C64698PaI) {
            LJI(2);
            LJ(1);
            LJFF(th.getMessage());
        } else {
            int i = 100;
            if (th instanceof C64799Pbv) {
                C64799Pbv c64799Pbv = (C64799Pbv) th;
                int statusCode = c64799Pbv.getStatusCode();
                if (statusCode > 0) {
                    LJI(3);
                    LJ(statusCode);
                } else {
                    LJI(2);
                    LJ(100);
                }
                String message2 = c64799Pbv.getMessage();
                if (message2 != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('(');
                    LIZ.append(statusCode);
                    LIZ.append(')');
                    int length = message2.length();
                    if (length <= 100) {
                        i = length;
                    }
                    String substring = message2.substring(0, i);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    LIZ.append(substring);
                    LJFF(X1D.LIZIZ(LIZ));
                    if (s.LJJJLZIJ(message2, "PROXY_CONNECTION_FAILED", false)) {
                        LJ(2);
                    } else if (s.LJJJLZIJ(message2, "HTTP2_PROTOCOL_ERROR", false)) {
                        LJ(3);
                    } else if (s.LJJJLZIJ(message2, "TTNET_APP_TIMED_OUT", false)) {
                        LJ(4);
                    }
                }
            } else {
                if (th != null) {
                    cls = th.getClass();
                } else {
                    cls = null;
                }
                if (o.LJ(cls, IOException.class)) {
                    String message3 = th.getMessage();
                    if (message3 != null) {
                        if (s.LJJJLZIJ(message3, "missing CR", false)) {
                            LJI(4);
                            LJ(3);
                        } else if (s.LJJJLZIJ(message3, "Premature EOF", false)) {
                            LJI(4);
                            LJ(2);
                        } else {
                            LJI(2);
                            LJ(101);
                        }
                    }
                    LJFF(th.getMessage());
                } else if (th instanceof C38302F1m) {
                    LJI(4);
                    LJ(1);
                    LJFF(th.getMessage());
                } else if (th instanceof C38333F2r) {
                    LJI(5);
                    C38333F2r c38333F2r = (C38333F2r) th;
                    LJ(c38333F2r.getErrorCode());
                    LJFF(c38333F2r.getMessage());
                } else {
                    LJI(2);
                    if (th != null && (message = th.getMessage()) != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(th.getClass().getName());
                        LIZ2.append('(');
                        int length2 = message.length();
                        if (length2 <= 100) {
                            i = length2;
                        }
                        String substring2 = message.substring(0, i);
                        o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        LIZ2.append(substring2);
                        LIZ2.append(')');
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        LJFF(LIZIZ);
                        if (s.LJJJLZIJ(LIZIZ, "TTNET_APP_TIMED_OUT", false)) {
                            LJI(4);
                        }
                    }
                }
            }
        }
        Integer num = this.LJFF;
        if (num == null || num.intValue() != 0) {
            C15280iq.LIZIZ("SearchChainEventTrackerV2", "markThrowableStatus");
            C49950Jj0.LJFF();
        }
    }

    public final void LJ(int i) {
        int i2;
        Integer valueOf = Integer.valueOf(i);
        this.LJI = valueOf;
        HashMap<String, Object> hashMap = this.LIZ;
        if (valueOf != null) {
            i2 = valueOf.intValue();
        } else {
            i2 = -1;
        }
        hashMap.put("error_code", Integer.valueOf(i2));
    }

    public final void LJFF(String str) {
        this.LJII = str;
        HashMap<String, Object> hashMap = this.LIZ;
        if (str == null) {
            str = "";
        }
        hashMap.put("error_desc", str);
    }

    public final void LJI(int i) {
        Integer valueOf = Integer.valueOf(i);
        this.LJFF = valueOf;
        HashMap<String, Object> hashMap = this.LIZ;
        Object obj = valueOf;
        if (valueOf == null) {
            obj = "";
        }
        hashMap.put("status", obj);
    }

    public final void LIZJ(int i, String str) {
        C49949Jiz c49949Jiz = C49950Jj0.LJFF;
        if (c49949Jiz.LIZLLL != -1 || c49949Jiz.LJFF) {
            C15280iq.LIZIZ("SearchChainEventTrackerV2", "markCanceled: isFinishNetwork");
            C49950Jj0.LJFF();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cancel, from: ");
            LIZ.append(str);
            LIZIZ(1, i, X1D.LIZIZ(LIZ));
        }
        C49950Jj0.LIZJ = true;
    }

    public final void LIZIZ(int i, int i2, String str) {
        StringBuilder LIZJ = C06460Ne.LIZJ("mark: status = ", i, ", errorCode = ", i2, ", errorDesc: ");
        LIZJ.append(str);
        C15280iq.LIZIZ("SearchChainEventTrackerV2", X1D.LIZIZ(LIZJ));
        LJI(i);
        LJ(i2);
        if (str == null) {
            str = "not define";
        }
        LJFF(str);
        if (i != 0) {
            C49950Jj0.LJFF();
        }
    }
}
