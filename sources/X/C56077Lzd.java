package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Lzd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56077Lzd extends O6R {
    public final /* synthetic */ C56075Lzb LJLJJI;

    public C56077Lzd(C56075Lzb c56075Lzb) {
        this.LJLJJI = c56075Lzb;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        Object LIZ;
        int i;
        o.LJIIIZ(bridgeName, "bridgeName");
        if (str.length() > 0) {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("show", false);
            String optString = jSONObject.optString("list_name");
            String listNum = jSONObject.optString("list_num");
            try {
                o.LJIIIIZZ(listNum, "listNum");
                LIZ = Integer.valueOf(CastIntegerProtector.parseInt(listNum) + 1);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            Integer num = (Integer) LIZ;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            InterfaceC56083Lzj shopContentAction = this.LJLJJI.getShopContentAction();
            if (shopContentAction != null) {
                shopContentAction.LJIJ(C113554cx.LJJL(new OSZ("list_name", optString), new OSZ("list_num", String.valueOf(i))), optBoolean);
            }
        }
    }
}
