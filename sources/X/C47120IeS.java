package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.strategy.IPreloadTaskCallbackListener;
import com.ss.ttvideoengine.DataLoaderHelper;

/* renamed from: X.IeS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47120IeS implements IPreloadTaskCallbackListener {
    public final InterfaceC47122IeU LIZ;

    public C47120IeS(DataLoaderHelper dataLoaderHelper, InterfaceC47122IeU interfaceC47122IeU) {
        this.LIZ = interfaceC47122IeU;
    }

    @Override // com.bytedance.vcloud.strategy.IPreloadTaskCallbackListener
    public final void preloadItemInfo(int i, String str, String str2) {
        int i2;
        String str3;
        if (this.LIZ != null) {
            if (i == 4) {
                i2 = 3;
            } else {
                i2 = 5;
                if (i != 5) {
                    if (i == 2) {
                        i2 = 8;
                    } else if (i == 1) {
                        i2 = 7;
                    } else if (i == 6) {
                        i2 = 9;
                    } else {
                        i2 = 2;
                    }
                }
            }
            C47121IeT c47121IeT = new C47121IeT(i2);
            if (!TextUtils.isEmpty(str) && str.contains(",")) {
                String[] split = str.split(",");
                if (split.length >= 3) {
                    long longValue = CastLongProtector.valueOf(split[0]).longValue();
                    long longValue2 = CastLongProtector.valueOf(split[1]).longValue();
                    String str4 = split[2];
                    if (split.length >= 4) {
                        str3 = split[3];
                    } else {
                        str3 = "";
                    }
                    C47106IeE c47106IeE = new C47106IeE();
                    c47121IeT.LIZIZ = c47106IeE;
                    c47106IeE.LIZ = str4;
                    c47106IeE.LJ = longValue;
                    c47106IeE.LIZLLL = longValue2;
                    c47106IeE.LIZJ = str3;
                }
            }
            c47121IeT.LIZLLL = str2;
            this.LIZ.LIZ(c47121IeT);
        }
    }
}
