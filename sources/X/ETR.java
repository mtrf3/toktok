package X;

import X.C16880lQ;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class ETR extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final ETR LJLIL = new ETR();

    public ETR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Gson invoke() {
        e eVar = new e();
        eVar.LIZIZ(new i<Boolean>() { // from class: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod$parser$2$1
            @Override // com.google.gson.i
            public final Boolean deserialize(j jVar, Type type, h hVar) {
                boolean z;
                boolean z2 = false;
                try {
                    if (jVar.LJIILJJIL() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    try {
                        if (jVar.LJFF()) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                        return Boolean.FALSE;
                    }
                }
            }
        }, Boolean.TYPE);
        return eVar.LIZ();
    }
}
