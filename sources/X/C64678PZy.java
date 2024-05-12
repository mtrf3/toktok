package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import ee1.m;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.PZy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64678PZy extends AbstractC64674PZu {
    public AbstractC64682Pa2 LJIILL;

    static {
        C16880lQ.LJLLJ(C64678PZy.class);
    }

    @Override // X.AbstractC64674PZu
    public final int LJII() {
        return this.LJIILL.LIZ.ordinal();
    }

    @Override // X.AbstractC64674PZu
    public final boolean LJIIIIZZ(List list, JSONObject jSONObject) {
        AbstractC64682Pa2 c64680Pa0;
        LJ(jSONObject);
        String optString = jSONObject.optString("service_name");
        if (!TextUtils.isEmpty(optString)) {
            this.LJIIJJI = optString;
        }
        int optInt = jSONObject.optInt("dispatch_strategy", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("strategy_info");
        if (optInt < 0 || optInt > 6) {
            this.LJIILL = null;
            return false;
        }
        int i = C64684Pa4.LIZ[EnumC64681Pa1.values()[optInt].ordinal()];
        if (i != 1) {
            if (i != 2) {
                Logger.debug();
                c64680Pa0 = new C64685Pa5();
            } else {
                c64680Pa0 = new C64679PZz(optJSONObject);
            }
        } else {
            c64680Pa0 = new C64680Pa0(optJSONObject);
        }
        this.LJIILL = c64680Pa0;
        c64680Pa0.LIZJ();
        ListProtector.set(list, 0, Boolean.FALSE);
        return true;
    }

    @Override // X.AbstractC64674PZu
    public final EnumC64675PZv LJI(m mVar, String str, List<String> list) {
        AbstractC64682Pa2 abstractC64682Pa2;
        Logger.debug();
        EnumC64675PZv enumC64675PZv = EnumC64675PZv.DISPATCH_NONE;
        android.net.Uri parse = UriProtector.parse(str);
        if (parse.getHost() != null && LIZLLL(parse) && (abstractC64682Pa2 = this.LJIILL) != null) {
            enumC64675PZv = EnumC64675PZv.DISPATCH_HIT;
            if (abstractC64682Pa2.LIZ == EnumC64681Pa1.REQUEST_HEADER_DISPATCH_STRATEGY) {
                abstractC64682Pa2.LIZ(mVar);
                ListProtector.set(list, 0, str);
                return enumC64675PZv;
            }
            String LIZIZ = abstractC64682Pa2.LIZIZ(parse);
            if (!str.equals(LIZIZ)) {
                ListProtector.set(list, 0, LIZIZ);
            } else {
                ListProtector.set(list, 0, str);
            }
        }
        return enumC64675PZv;
    }
}
