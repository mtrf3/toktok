package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.BlL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29711BlL extends AbstractC29708BlI {
    public static final C29711BlL LIZIZ = new C29711BlL();

    @Override // X.AbstractC29708BlI
    public final String LIZ() {
        return "mask_bg_color";
    }

    public C29711BlL() {
        super("mask_alpha");
    }

    @Override // X.AbstractC29708BlI
    public final String LIZIZ(String str) {
        try {
            String LLLZ = C16880lQ.LLLZ("%02X", Arrays.copyOf(new Object[]{Integer.valueOf((int) (CastFloatProtector.parseFloat(str) * 255))}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("000000");
            LIZ.append(LLLZ);
            return X1D.LIZIZ(LIZ);
        } catch (Exception unused) {
            return "00000000";
        }
    }
}
