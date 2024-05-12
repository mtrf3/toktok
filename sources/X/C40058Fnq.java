package X;

import com.lynx.tasm.TemplateData;
import org.json.JSONObject;

/* renamed from: X.Fnq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40058Fnq extends AbstractC60815Ntr {
    public final /* synthetic */ String LJLILLLLZI;

    public C40058Fnq(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        if (C40059Fnr.LIZ[interfaceC60710NsA.getType().ordinal()] == 1) {
            String str = this.LJLILLLLZI;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C78685UuP.LJJJZ(str)) {
                    jSONObject.put("poiCategoryData", new JSONObject(str));
                    ((C60606NqU) interfaceC60710NsA).LJIIIIZZ = TemplateData.LJFF(jSONObject.toString());
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }
}
