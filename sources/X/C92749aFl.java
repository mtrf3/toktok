package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.aFl, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92749aFl extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public static final C92749aFl LJLIL = new C92749aFl();

    public C92749aFl() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN arn) {
        ARN args = arn;
        o.LJIIIZ(args, "args");
        args.LIZJ = true;
        C91826a0s.LJ.set(false);
        C2U8.LIZ(new C92217a7B());
        Iterator it = ((ArrayList) C91657Zy9.LIZIZ).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            SparkContext.Companion.getClass();
            InterfaceC40159FpT LIZ = C39359FcZ.LIZ(str);
            if (LIZ != null) {
                LIZ.close();
            }
        }
        return C76800UCe.LIZ;
    }
}
