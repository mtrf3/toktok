package X;

import java.util.LinkedHashMap;

/* renamed from: X.Wh6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82956Wh6 implements InterfaceC79513VIn {
    public final /* synthetic */ AbstractC82964WhE LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    @Override // X.InterfaceC79513VIn
    public final void LJIILL(String str) {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, str, 8);
    }

    public C82956Wh6(AbstractC82964WhE abstractC82964WhE, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC82964WhE;
        this.LIZIZ = interfaceC31943CgF;
    }

    @Override // X.InterfaceC79513VIn
    public final void LIZ(C79510VIk c79510VIk, String str) {
        Integer num = c79510VIk.LIZ;
        if (num != null) {
            num.intValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Integer num2 = c79510VIk.LIZ;
            if (num2 != null) {
                C61845OOz.LIZLLL(num2, linkedHashMap, "statusCode");
            }
            AbstractC82964WhE abstractC82964WhE = this.LIZ;
            InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
            abstractC82964WhE.getClass();
            AbstractC37780EsC.LJI(interfaceC31943CgF, str, linkedHashMap);
            return;
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
