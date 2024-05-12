package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.NuG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60840NuG implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final SparkActivity LIZIZ;
    public final InterfaceC60844NuK LIZJ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        C60908NvM navBarColor;
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        String str = null;
        if (sparkPageSchemaParam != null && (navBarColor = sparkPageSchemaParam.getNavBarColor()) != null) {
            SparkActivity sparkActivity = this.LIZIZ;
            SparkContext sparkContext = sparkActivity.LJLIL;
            if (sparkContext != null) {
                str = sparkContext.LJIJ();
            }
            Integer valueOf = Integer.valueOf(navBarColor.getColor(sparkActivity, str));
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                InterfaceC60844NuK interfaceC60844NuK = this.LIZJ;
                if (interfaceC60844NuK != null) {
                    interfaceC60844NuK.LJJIL(intValue);
                }
            }
        }
    }

    public C60840NuG(SparkPageSchemaParam sparkPageSchemaParam, SparkActivity context, InterfaceC60844NuK interfaceC60844NuK) {
        o.LJIIJ(context, "context");
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = context;
        this.LIZJ = interfaceC60844NuK;
    }
}
