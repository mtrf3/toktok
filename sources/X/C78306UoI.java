package X;

import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import java.util.HashMap;

/* renamed from: X.UoI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78306UoI extends IO1 {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final HashMap<String, ?> LJIIIZ;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0117, code lost:
    
        if (r4 > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r11, java.lang.String r12, X.C78368UpI r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78306UoI.LIZ(int, java.lang.String, X.UpI):void");
    }

    public C78306UoI(String str, String str2, String str3, boolean z, PayType payType, HashMap<String, ?> hashMap) {
        this.LJ = str;
        this.LJFF = str2;
        this.LJII = z;
        if (str3 != null) {
            this.LJI = str3;
        }
        if (payType != null) {
            this.LJIIIIZZ = payType.ordinal();
        } else {
            this.LJIIIIZZ = -1;
        }
        this.LJIIIZ = hashMap;
    }
}
