package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ETv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36491ETv implements InterfaceC31943CgF {
    public final /* synthetic */ InterfaceC36488ETs LIZ;
    public final /* synthetic */ InterfaceC37146Ehy LIZIZ;

    @Override // X.InterfaceC31943CgF
    public final void LIZ(java.util.Map<String, Object> data) {
        C76800UCe c76800UCe;
        o.LJIIIZ(data, "data");
        InterfaceC36488ETs interfaceC36488ETs = this.LIZ;
        InterfaceC37146Ehy interfaceC37146Ehy = this.LIZIZ;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ocr: wakeTheOcrActivity ");
            LIZ.append(data.size());
            C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZIZ(new JSONObject(data));
            }
            if (interfaceC37146Ehy == null) {
                c76800UCe = null;
            } else {
                interfaceC37146Ehy.LIZIZ(new JSONObject(data));
                c76800UCe = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public C36491ETv(InterfaceC36488ETs interfaceC36488ETs, InterfaceC37146Ehy interfaceC37146Ehy) {
        this.LIZ = interfaceC36488ETs;
        this.LIZIZ = interfaceC37146Ehy;
    }
}
