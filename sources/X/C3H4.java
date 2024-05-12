package X;

import android.text.TextUtils;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3H4, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3H4 extends TBS implements InterfaceC88473Ynt<String, String, String, C76800UCe> {
    public C3H4(C82983Nm c82983Nm) {
        super(3, c82983Nm, C82983Nm.class, "updateLocalExt", "updateLocalExt(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, String str2, String str3) {
        String str4 = str;
        String p1 = str2;
        String p2 = str3;
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        this.receiver.getClass();
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(p1) && !TextUtils.isEmpty(p2)) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LIZ = C4WC.LIZIZ.LIZ(str4);
            if (LIZ != null) {
                java.util.Map<String, String> localExt = LIZ.getLocalExt();
                if (localExt == null) {
                    localExt = new HashMap<>();
                }
                localExt.put(p1, p2);
                LIZ.setLocalExt(localExt);
                o.LJI(str4);
                C81273Gx.LIZ(str4).LJIJJLI(localExt);
            }
        }
        return C76800UCe.LIZ;
    }
}
