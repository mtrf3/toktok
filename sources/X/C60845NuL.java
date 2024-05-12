package X;

import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* renamed from: X.NuL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60845NuL implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC60844NuK LIZIZ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        String str;
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam == null || (str = sparkPageSchemaParam.getTitle()) == null) {
            str = "";
        }
        SparkPageSchemaParam sparkPageSchemaParam2 = this.LIZ;
        if (sparkPageSchemaParam2 != null && sparkPageSchemaParam2.getOptTitle()) {
            if (str.length() > 0) {
                InterfaceC60844NuK interfaceC60844NuK = this.LIZIZ;
                if (interfaceC60844NuK != null) {
                    interfaceC60844NuK.LJJIII(str);
                }
                C37682Eqc.LIZIZ(null, "time_consuming_optimization", "setTitle");
                return;
            }
            return;
        }
        InterfaceC60844NuK interfaceC60844NuK2 = this.LIZIZ;
        if (interfaceC60844NuK2 != null) {
            interfaceC60844NuK2.LJJIII(str);
        }
        C37682Eqc.LIZIZ(null, "time_consuming_optimization", "setTitle");
    }

    public C60845NuL(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC60844NuK interfaceC60844NuK) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC60844NuK;
    }
}
