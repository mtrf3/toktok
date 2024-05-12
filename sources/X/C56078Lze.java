package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Lze, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56078Lze extends O6R {
    public final /* synthetic */ C56075Lzb LJLJJI;

    public C56078Lze(C56075Lzb c56075Lzb) {
        this.LJLJJI = c56075Lzb;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        o.LJIIIZ(bridgeName, "bridgeName");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bridgeName = ");
        LIZ.append(bridgeName);
        LIZ.append(", params = ");
        LIZ.append(str);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        if (str.length() > 0) {
            String optString = new JSONObject(str).optString("skin_id");
            if (optString == null) {
                optString = CardStruct.IStatusCode.DEFAULT;
            }
            InterfaceC56083Lzj shopContentAction = this.LJLJJI.getShopContentAction();
            if (shopContentAction != null) {
                shopContentAction.LJIJJ(optString);
            }
        }
    }
}
