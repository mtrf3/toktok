package X;

import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.3tF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98173tF implements InterfaceC98153tD {
    public final java.util.Map<String, C98313tT> LIZIZ = new LinkedHashMap();

    public final void LIZ(View view, final String str, final InterfaceC98193tH interfaceC98193tH) {
        o.LJIIIZ(view, "view");
        C82243Kq.LIZ(view, new InterfaceC98193tH() { // from class: X.3tG
            @Override // X.InterfaceC98193tH
            public final void LIZ() {
                C98313tT c98313tT = (C98313tT) ((LinkedHashMap) this.LIZIZ).get(str);
                if (c98313tT == null) {
                    return;
                }
                c98313tT.stop();
                C98173tF c98173tF = this;
                String str2 = str;
                long j = c98313tT.LIZJ - c98313tT.LIZIZ;
                c98173tF.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("im_first_frame_");
                LIZ.append(str2);
                C09900aA.LJI(X1D.LIZIZ(LIZ), new JSONObject(), Q7K.LIZLLL("draw_time", j), null);
                InterfaceC98193tH interfaceC98193tH2 = InterfaceC98193tH.this;
                if (interfaceC98193tH2 != null) {
                    interfaceC98193tH2.LIZ();
                }
            }

            @Override // X.InterfaceC98193tH
            public final void LIZIZ() {
                InterfaceC98193tH interfaceC98193tH2 = InterfaceC98193tH.this;
                if (interfaceC98193tH2 != null) {
                    interfaceC98193tH2.LIZIZ();
                }
            }
        });
    }
}
