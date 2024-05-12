package X;

import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.OcrStatus;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class SCR implements InterfaceC38541fG {
    public final /* synthetic */ SCQ LIZ;

    public SCR(SCQ scq) {
        this.LIZ = scq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC269513z
    public final void LIZ(int i, int i2, String str, PipoOcrResult pipoOcrResult, String str2) {
        SC7 sc7;
        Object LIZ;
        Object LIZ2;
        SCQ scq = this.LIZ;
        if (i == scq.LIZ) {
            String str3 = pipoOcrResult.expirationDate;
            String str4 = null;
            if (str3 != null) {
                char[] charArray = str3.toCharArray();
                o.LJIIIIZZ(charArray, "this as java.lang.String).toCharArray()");
                ArrayList arrayList = new ArrayList();
                for (char c : charArray) {
                    if ('0' <= c && c < ':') {
                        arrayList.add(Character.valueOf(c));
                    }
                }
                char[] cArr = new char[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    cArr[i3] = ((Character) it.next()).charValue();
                    i3++;
                }
                String str5 = new String(cArr);
                try {
                    LIZ = s.LJLL(str5, new C40517FvF(0, 1));
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = null;
                }
                String str6 = (String) LIZ;
                try {
                    LIZ2 = str5.substring(2, Math.min(str5.length(), 4));
                    o.LJIIIIZZ(LIZ2, "this as java.lang.String…ing(startIndex, endIndex)");
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th2) {
                    LIZ2 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m12isFailureimpl(LIZ2)) {
                    LIZ2 = null;
                }
                sc7 = new SC7((String) LIZ2, str6);
            } else {
                sc7 = new SC7(null, null);
            }
            InterfaceC88471Ynr<? super SC6, ? super Integer, C76800UCe> interfaceC88471Ynr = this.LIZ.LIZJ;
            String str7 = pipoOcrResult.cardNumber;
            if (str7 != null) {
                str4 = ujb.o.LJJJJZ(str7, " ", "", false);
            }
            interfaceC88471Ynr.invoke(new SC6(str4, sc7), Integer.valueOf(C52899KpT.LIZ().ocrMode));
        } else {
            InterfaceC88471Ynr<? super String, ? super Integer, C76800UCe> interfaceC88471Ynr2 = scq.LIZLLL;
            if (str == null) {
                str = "";
            }
            interfaceC88471Ynr2.invoke(str, Integer.valueOf(C52899KpT.LIZ().ocrMode));
        }
        SCQ scq2 = this.LIZ;
        if (!scq2.LJ) {
            scq2.LJFF = new OcrStatus(CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, null, 4, 0 == true ? 1 : 0);
        }
        this.LIZ.LJ = true;
        SCQ.LJIIIIZZ = false;
    }
}
