package X;

import com.lynx.tasm.TemplateData;
import org.json.JSONObject;

/* renamed from: X.Nnx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60449Nnx extends AbstractC60815Ntr {
    public final /* synthetic */ String LJLILLLLZI;

    public C60449Nnx(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        if (C60450Nny.LIZ[interfaceC60710NsA.getType().ordinal()] == 1 && (interfaceC60710NsA instanceof C60606NqU)) {
            String str = this.LJLILLLLZI;
            C60439Nnn c60439Nnn = new C60439Nnn();
            c60439Nnn.LIZ = TemplateData.LJFF("");
            c60439Nnn.LIZ("initial_data", new JSONObject(str));
            ((C60606NqU) interfaceC60710NsA).LJJII = c60439Nnn;
        }
    }
}
