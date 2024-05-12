package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.placediscovery.param.PoiDiscoveryLandingPageParams;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fns, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40060Fns extends AbstractC60815Ntr {
    public final PoiDiscoveryLandingPageParams LJLILLLLZI;

    public C40060Fns(PoiDiscoveryLandingPageParams pageParams) {
        o.LJIIIZ(pageParams, "pageParams");
        this.LJLILLLLZI = pageParams;
    }

    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        C60606NqU c60606NqU;
        String json = GsonProtectorUtils.toJson(C75792yF.LIZIZ(), this.LJLILLLLZI);
        if (C40061Fnt.LIZ[interfaceC60710NsA.getType().ordinal()] == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (C78685UuP.LJJJZ(json)) {
                    jSONObject.put("poiCategoryData", new JSONObject(json));
                    if ((interfaceC60710NsA instanceof C60606NqU) && (c60606NqU = (C60606NqU) interfaceC60710NsA) != null) {
                        c60606NqU.LJIIIIZZ = TemplateData.LJFF(jSONObject.toString());
                    }
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }
}
