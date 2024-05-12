package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.No1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60453No1 extends AbstractC60815Ntr {
    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        if (!TextUtils.isEmpty(CY4.LIZIZ)) {
            if (C60454No2.LIZ[interfaceC60710NsA.getType().ordinal()] == 1) {
                C60439Nnn c60439Nnn = new C60439Nnn();
                c60439Nnn.LIZ("initial_data", new JSONObject(CY4.LIZIZ));
                ((C60606NqU) interfaceC60710NsA).LJJII = c60439Nnn;
            }
        }
    }
}
