package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import kotlin.jvm.internal.o;

/* renamed from: X.Ael, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26755Ael {
    public static AddressPageStarter.AddressEvent LIZ(String jsonString) {
        o.LJIIIZ(jsonString, "jsonString");
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), jsonString, C65330PkU.LIZJ(C65352Pkq.LIZLLL(AddressPageStarter.AddressEvent.class)));
            if (!(fromJson instanceof AddressPageStarter.AddressEvent)) {
                fromJson = null;
            }
            AddressPageStarter.AddressEvent addressEvent = (AddressPageStarter.AddressEvent) fromJson;
            if (addressEvent != null) {
                return addressEvent;
            }
        } catch (s unused) {
        }
        return new AddressPageStarter.AddressEvent("", -1, null);
    }
}
