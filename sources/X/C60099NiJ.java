package X;

import com.lynx.tasm.TemplateData;
import java.util.HashMap;

/* renamed from: X.NiJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60099NiJ extends AbstractC60815Ntr {
    public final /* synthetic */ C60098NiI LJLILLLLZI;

    public C60099NiJ(C60098NiI c60098NiI) {
        this.LJLILLLLZI = c60098NiI;
    }

    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        if (interfaceC60710NsA instanceof C60606NqU) {
            C60606NqU c60606NqU = (C60606NqU) interfaceC60710NsA;
            HashMap hashMap = new HashMap();
            String str = this.LJLILLLLZI.LIZIZ;
            if (str == null) {
                str = "";
            }
            hashMap.put("fe_preload_data", str);
            C60439Nnn c60439Nnn = new C60439Nnn();
            Object LIZ = C75302xS.LIZ(hashMap);
            if (!(LIZ instanceof java.util.Map)) {
                LIZ = null;
            }
            c60439Nnn.LIZ = TemplateData.LJ((java.util.Map) LIZ);
            c60606NqU.LJJII = c60439Nnn;
        }
    }
}
