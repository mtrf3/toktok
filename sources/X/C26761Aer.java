package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOnOrderStruct;

/* renamed from: X.Aer, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26761Aer {
    public static ChangeOnOrderStruct LIZ(String str) {
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LIZLLL(ChangeOnOrderStruct.class)));
            if (!(fromJson instanceof ChangeOnOrderStruct)) {
                fromJson = null;
            }
            ChangeOnOrderStruct changeOnOrderStruct = (ChangeOnOrderStruct) fromJson;
            if (changeOnOrderStruct != null) {
                return changeOnOrderStruct;
            }
        } catch (s unused) {
        }
        return new ChangeOnOrderStruct(null, null);
    }
}
