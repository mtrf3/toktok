package X;

import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import java.util.HashMap;

/* renamed from: X.UoH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78305UoH extends IO1 {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public final HashMap<String, ?> LJIIIIZZ;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
    
        if (r4 > 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r11, X.C78368UpI r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78305UoH.LIZ(int, X.UpI):void");
    }

    public C78305UoH(String str, String str2, boolean z, PayType payType, HashMap<String, ?> hashMap) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        if (payType != null) {
            this.LIZLLL = payType.ordinal();
        } else {
            this.LIZLLL = -1;
        }
        this.LJIIIIZZ = hashMap;
    }
}
