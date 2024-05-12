package X;

import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Coi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32468Coi<T> implements InterfaceC73705SwH {
    public final /* synthetic */ UW7 LIZ;

    public C32468Coi(UW7 uw7) {
        this.LIZ = uw7;
    }

    @Override // X.InterfaceC73705SwH
    public final void LIZ(AbstractC73754Sx4 abstractC73754Sx4) {
        java.util.Set<String> LIZJ = InterfaceC30442Bx8.LJ.LIZJ();
        HashMap hashMap = new HashMap(4);
        Iterator<String> it = LIZJ.iterator();
        while (it.hasNext()) {
            Integer type = CastIntegerProtector.valueOf(it.next());
            UW7 uw7 = this.LIZ;
            o.LJIIIIZZ(type, "type");
            int intValue = type.intValue();
            uw7.getClass();
            Object LIZJ2 = new C48459J0d(KMP.LJ("gift_list_response_", intValue), "").LIZJ();
            o.LJIIIIZZ(LIZJ2, "getPropertyByLiveType(type).getValue()");
            String str = (String) LIZJ2;
            if (!C38354F3m.LJ(str)) {
                Object value = this.LIZ.LIZIZ.getValue();
                o.LJIIIIZZ(value, "<get-gson>(...)");
                GiftListResult giftListResult = (GiftListResult) GsonProtectorUtils.fromJson((Gson) value, str, GiftListResult.class);
                o.LJIIIIZZ(giftListResult, "giftListResult");
                C78857UxB.LJJIJL(giftListResult);
                hashMap.put(type, giftListResult);
            }
        }
        abstractC73754Sx4.onNext(hashMap);
        abstractC73754Sx4.onComplete();
    }
}
