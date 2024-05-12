package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import kotlin.jvm.internal.o;

/* renamed from: X.AeO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26732AeO {
    public static ZipcodeLocateAddress LIZ(String jsonString) {
        o.LJIIIZ(jsonString, "jsonString");
        ZipcodeLocateAddress zipcodeLocateAddress = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), jsonString, C65330PkU.LIZJ(C65352Pkq.LIZLLL(ZipcodeLocateAddress.class)));
            if (!(fromJson instanceof ZipcodeLocateAddress)) {
                fromJson = null;
            }
            zipcodeLocateAddress = (ZipcodeLocateAddress) fromJson;
        } catch (s unused) {
        }
        if (zipcodeLocateAddress == null) {
            return new ZipcodeLocateAddress(-1, null, null, null, null);
        }
        return zipcodeLocateAddress;
    }
}
