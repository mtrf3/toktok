package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.ErT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37735ErT {
    public final InterfaceC37736ErU LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public android.net.Uri LIZLLL;
    public C37733ErR LJ;
    public C37733ErR LJFF;

    public C37735ErT(C60624Nqm c60624Nqm) {
        this.LIZ = c60624Nqm;
    }

    public final void LIZ(int i, String str) {
        AbstractC60629Nqr abstractC60629Nqr;
        String str2;
        String str3;
        Boolean bool;
        if (str == null || !str.startsWith("http") || str.equals(this.LIZJ)) {
            return;
        }
        this.LIZJ = str;
        try {
            android.net.Uri parse = UriProtector.parse(str);
            this.LIZLLL = parse;
            HashSet<C37731ErP> hashSet = ((C60624Nqm) this.LIZ).LIZ.LJFF;
            if (hashSet != null) {
                try {
                    Iterator<C37731ErP> it = hashSet.iterator();
                    while (it.hasNext()) {
                        it.next().LIZ(parse);
                    }
                } catch (Exception unused) {
                    C78949Uyf.LJIJJ("AddressParam");
                }
            }
            String queryParameter = UriProtector.getQueryParameter(this.LIZLLL, "bdwk_extension");
            if (i == 0) {
                List<C37734ErS> LIZ = C37733ErR.LIZ(0, queryParameter);
                if (this.LJ == null) {
                    this.LJ = new C37733ErR();
                }
                Iterator it2 = ((ArrayList) LIZ).iterator();
                while (it2.hasNext()) {
                    C37734ErS c37734ErS = (C37734ErS) it2.next();
                    ((HashMap) this.LJ.LIZ).put(c37734ErS.LIZ, c37734ErS);
                }
            }
            if (this.LJ == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("h2 url = ");
                LIZ2.append(str);
                X1D.LIZIZ(LIZ2);
                C78949Uyf.LJIJJ("AddressProcessor");
                return;
            }
            List<C37734ErS> LIZ3 = C37733ErR.LIZ(1, queryParameter);
            C37733ErR c37733ErR = this.LJFF;
            if (c37733ErR == null) {
                this.LJFF = new C37733ErR();
            } else {
                ((HashMap) c37733ErR.LIZ).clear();
            }
            Iterator it3 = ((ArrayList) LIZ3).iterator();
            while (it3.hasNext()) {
                C37734ErS c37734ErS2 = (C37734ErS) it3.next();
                ((HashMap) this.LJFF.LIZ).put(c37734ErS2.LIZ, c37734ErS2);
            }
            C37733ErR c37733ErR2 = this.LJFF;
            C37733ErR c37733ErR3 = this.LJ;
            c37733ErR2.getClass();
            for (Map.Entry entry : ((HashMap) c37733ErR3.LIZ).entrySet()) {
                if (!((HashMap) c37733ErR2.LIZ).containsKey(entry.getKey())) {
                    ((HashMap) c37733ErR2.LIZ).put(entry.getKey(), entry.getValue());
                }
            }
            C37733ErR c37733ErR4 = this.LJFF;
            if (c37733ErR4 == null || ((HashMap) c37733ErR4.LIZ).isEmpty()) {
                if (this.LIZIZ) {
                    Iterator<InterfaceC37737ErV> it4 = ((C60624Nqm) this.LIZ).LIZJ.iterator();
                    while (it4.hasNext()) {
                        InterfaceC37737ErV next = it4.next();
                        if (next instanceof AbstractC60629Nqr) {
                            AbstractC60629Nqr abstractC60629Nqr2 = (AbstractC60629Nqr) next;
                            if (abstractC60629Nqr2.LJLJI != null) {
                                abstractC60629Nqr2.LJLJJI = abstractC60629Nqr2.LJLJJL;
                            }
                        }
                    }
                    this.LIZIZ = false;
                    return;
                }
                return;
            }
            Iterator<InterfaceC37737ErV> it5 = ((C60624Nqm) this.LIZ).LIZJ.iterator();
            while (it5.hasNext()) {
                InterfaceC37737ErV next2 = it5.next();
                if ((next2 instanceof AbstractC60629Nqr) && (str2 = (abstractC60629Nqr = (AbstractC60629Nqr) next2).LJLJI) != null) {
                    C37734ErS c37734ErS3 = (C37734ErS) ((HashMap) c37733ErR4.LIZ).get(str2);
                    if (c37734ErS3 != null && (str3 = c37734ErS3.LIZIZ) != null) {
                        if (!str3.equals(CardStruct.IStatusCode.DEFAULT)) {
                            if (!str3.equals("1")) {
                                bool = Boolean.FALSE;
                            } else {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                        if (bool != null) {
                            abstractC60629Nqr.LJLJJI = bool.booleanValue();
                            this.LIZIZ = true;
                        }
                    }
                    abstractC60629Nqr.LJLJJI = abstractC60629Nqr.LJLJJL;
                }
            }
        } catch (Exception unused2) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("h1 event = ");
            LIZ4.append(i);
            LIZ4.append(", url = ");
            LIZ4.append(str);
            X1D.LIZIZ(LIZ4);
            C78949Uyf.LJIJJ("AddressProcessor");
        }
    }
}
