package X;

import com.bytedance.bpea.basics.Cert;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.OHj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61647OHj {
    public final InterfaceC61649OHl LIZ;
    public final InterfaceC61649OHl LIZIZ;
    public final InterfaceC61645OHh LIZJ;

    public final C61648OHk LIZ(Cert cert) {
        C61648OHk c61648OHk;
        try {
            String LIZIZ = this.LIZ.LIZIZ(cert);
            if (((LIZIZ == null || LIZIZ.length() == 0) && (LIZIZ = this.LIZIZ.LIZIZ(cert)) == null) || LIZIZ.length() == 0) {
                c61648OHk = new C61648OHk(-2101, null, null, 6);
            } else if (o.LJ("-1", LIZIZ)) {
                c61648OHk = new C61648OHk(0, null, C47261Igj.LJJIJ(new C61644OHg()), 3);
            } else {
                JSONArray LIZ = this.LIZ.LIZ(LIZIZ);
                if (LIZ == null && (LIZ = this.LIZIZ.LIZ(LIZIZ)) == null) {
                    c61648OHk = new C61648OHk(-2102, null, null, 6);
                } else {
                    ArrayList arrayList = new ArrayList();
                    int length = LIZ.length();
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            String conditionName = LIZ.optString(i);
                            InterfaceC61649OHl interfaceC61649OHl = this.LIZ;
                            o.LJFF(conditionName, "conditionName");
                            String LIZJ = interfaceC61649OHl.LIZJ(conditionName);
                            if (((LIZJ != null && LIZJ.length() != 0) || (LIZJ = this.LIZIZ.LIZJ(conditionName)) != null) && LIZJ.length() != 0) {
                                InterfaceC61646OHi LIZ2 = this.LIZJ.LIZ(LIZJ);
                                if (LIZ2 != null) {
                                    arrayList.add(LIZ2);
                                    i++;
                                } else {
                                    c61648OHk = new C61648OHk(-2104, null, null, 6);
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            c61648OHk = new C61648OHk(0, null, arrayList, 3);
                            break;
                        }
                    }
                    c61648OHk = new C61648OHk(-2103, null, null, 6);
                }
            }
        } catch (Throwable th) {
            c61648OHk = new C61648OHk(-1, th.getLocalizedMessage(), null, 4);
        }
        if (c61648OHk.LJLIL != 0) {
            try {
                String LIZIZ2 = this.LIZIZ.LIZIZ(cert);
                if (LIZIZ2 == null || LIZIZ2.length() == 0) {
                    return new C61648OHk(-2101, null, null, 6);
                }
                if (o.LJ("-1", LIZIZ2)) {
                    return new C61648OHk(0, null, C47261Igj.LJJIJ(new C61644OHg()), 3);
                }
                JSONArray LIZ3 = this.LIZIZ.LIZ(LIZIZ2);
                if (LIZ3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = LIZ3.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        String conditionName2 = LIZ3.optString(i2);
                        InterfaceC61649OHl interfaceC61649OHl2 = this.LIZIZ;
                        o.LJFF(conditionName2, "conditionName");
                        String LIZJ2 = interfaceC61649OHl2.LIZJ(conditionName2);
                        if (LIZJ2 == null || LIZJ2.length() == 0) {
                            return new C61648OHk(-2103, null, null, 6);
                        }
                        InterfaceC61646OHi LIZ4 = this.LIZJ.LIZ(LIZJ2);
                        if (LIZ4 != null) {
                            arrayList2.add(LIZ4);
                        } else {
                            return new C61648OHk(-2104, null, null, 6);
                        }
                    }
                    return new C61648OHk(0, null, arrayList2, 3);
                }
                return new C61648OHk(-2102, null, null, 6);
            } catch (Throwable th2) {
                return new C61648OHk(-1, th2.getLocalizedMessage(), null, 4);
            }
        }
        return c61648OHk;
    }

    public C61647OHj(Q0G q0g, Q0D q0d) {
        C61641OHd c61641OHd = C61641OHd.LIZJ;
        this.LIZ = q0g;
        this.LIZIZ = q0d;
        this.LIZJ = c61641OHd;
    }
}
