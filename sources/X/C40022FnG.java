package X;

import android.graphics.Typeface;
import com.lynx.tasm.base.LLog;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.FnG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40022FnG extends AbstractC65781Prl implements InterfaceC88472Yns<O1I, C76800UCe> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40022FnG(String str) {
        super(1);
        this.LJLIL = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(O1I it) {
        o.LJIIJ(it, "it");
        String str = it.LJI;
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            String str2 = it.LJI;
            if (str2 != null) {
                Typeface LJJLIIIJLJLI = C16880lQ.LJJLIIIJLJLI(new File(str2));
                if (LJJLIIIJLJLI != null) {
                    C40020FnE.LIZJ.put(this.LJLIL, LJJLIIIJLJLI);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cache font for ");
                    LIZ.append(this.LJLIL);
                    LLog.LIZLLL(2, "LynxKit", X1D.LIZIZ(LIZ));
                    return;
                }
                return;
            }
            o.LJIIZILJ();
            throw null;
        } catch (Exception e) {
            LLog.LIZLLL(4, "LynxKit", e.getMessage());
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(O1I o1i) {
        invoke2(o1i);
        return C76800UCe.LIZ;
    }
}
