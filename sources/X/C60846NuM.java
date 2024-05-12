package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import ql1.IDbS498S0100000_10;

/* renamed from: X.NuM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60846NuM implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC60844NuK LIZIZ;
    public final SparkContext LIZJ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        String str;
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam != null) {
            str = sparkPageSchemaParam.getShowCloseAll();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 0) {
                if (hashCode == 49 && str.equals("1")) {
                    InterfaceC60844NuK interfaceC60844NuK = this.LIZIZ;
                    if (interfaceC60844NuK == null) {
                        return;
                    }
                    interfaceC60844NuK.LJJJ(true);
                    return;
                }
            } else if (str.equals("")) {
                InterfaceC60844NuK interfaceC60844NuK2 = this.LIZIZ;
                if (interfaceC60844NuK2 != null) {
                    interfaceC60844NuK2.LJJJ(false);
                }
                SparkContext sparkContext = this.LIZJ;
                if (sparkContext == null) {
                    return;
                }
                sparkContext.LJJI(new IDbS498S0100000_10(this, 5));
                return;
            }
        }
        InterfaceC60844NuK interfaceC60844NuK3 = this.LIZIZ;
        if (interfaceC60844NuK3 != null) {
            interfaceC60844NuK3.LJJJ(false);
        }
    }

    public C60846NuM(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC60844NuK interfaceC60844NuK, SparkContext sparkContext) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC60844NuK;
        this.LIZJ = sparkContext;
    }
}
