package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ntm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60810Ntm implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final SparkActivity LIZIZ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        SparkPageSchemaParam sparkPageSchemaParam;
        int i;
        InterfaceC60837NuD LJ;
        Integer LIZLLL;
        if (C60806Nti.LIZ) {
            SparkContext sparkContext = this.LIZIZ.LJLIL;
            EnumC60795NtX enumC60795NtX = null;
            if (sparkContext != null) {
                enumC60795NtX = sparkContext.LJ(null);
            }
            if (enumC60795NtX == EnumC60795NtX.DARK && (sparkPageSchemaParam = this.LIZ) != null) {
                C60908NvM navigationBarBgColor = sparkPageSchemaParam.getNavigationBarBgColor();
                if (navigationBarBgColor == null) {
                    C60809Ntl.LIZIZ.getClass();
                    InterfaceC60799Ntb interfaceC60799Ntb = C60809Ntl.LIZ;
                    if (interfaceC60799Ntb != null && (LJ = interfaceC60799Ntb.LJ()) != null && (LIZLLL = LJ.LIZLLL(this.LIZIZ)) != null) {
                        i = LIZLLL.intValue();
                    } else {
                        try {
                            C39836FkG.LJII.getClass();
                            i = C04330Ez.LIZIZ(C38262Ezy.LIZ().LIZIZ(), R.color.cg);
                        } catch (Exception unused) {
                            i = 0;
                        }
                    }
                    navigationBarBgColor = new C60908NvM(i);
                }
                sparkPageSchemaParam.setNavigationBarBgColor(navigationBarBgColor);
            }
        }
    }

    public C60810Ntm(SparkPageSchemaParam sparkPageSchemaParam, SparkActivity activity) {
        o.LJIIJ(activity, "activity");
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = activity;
    }
}
