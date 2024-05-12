package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.TemplateData;
import org.json.JSONObject;

/* renamed from: X.Nnw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60448Nnw extends AbstractC60815Ntr {
    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        android.net.Uri LIZIZ;
        String queryParameter;
        if (interfaceC60710NsA instanceof C60607NqV) {
            C60607NqV c60607NqV = (C60607NqV) interfaceC60710NsA;
            c60607NqV.LIZLLL = new C31948CgK();
            c60607NqV.LIZIZ = new C31246COc(interfaceC60710NsA);
        }
        if ((interfaceC60710NsA instanceof C60606NqU) && (LIZIZ = interfaceC60710NsA.LIZIZ()) != null && (queryParameter = UriProtector.getQueryParameter(LIZIZ, "initial_data")) != null) {
            C60439Nnn c60439Nnn = new C60439Nnn();
            c60439Nnn.LIZ = TemplateData.LJFF(queryParameter);
            c60439Nnn.LIZ("initial_data", new JSONObject(queryParameter));
            ((C60606NqU) interfaceC60710NsA).LJJII = c60439Nnn;
        }
    }
}
