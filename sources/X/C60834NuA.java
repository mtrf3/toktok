package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.NuA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60834NuA implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final SparkActivity LIZIZ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        Integer num;
        C60908NvM statusBarBgColor;
        C60836NuC LJFF;
        C60809Ntl.LIZIZ.getClass();
        InterfaceC60799Ntb interfaceC60799Ntb = C60809Ntl.LIZ;
        String str = null;
        if (interfaceC60799Ntb != null && (LJFF = interfaceC60799Ntb.LJFF()) != null) {
            num = Integer.valueOf(LJFF.LIZ);
        } else {
            num = null;
        }
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam != null && (statusBarBgColor = sparkPageSchemaParam.getStatusBarBgColor()) != null) {
            SparkActivity sparkActivity = this.LIZIZ;
            SparkContext sparkContext = sparkActivity.LJLIL;
            if (sparkContext != null) {
                str = sparkContext.LJIJ();
            }
            num = Integer.valueOf(statusBarBgColor.getColor(sparkActivity, str));
        }
        this.LIZIZ.LJLJJLL = num;
    }

    public C60834NuA(SparkPageSchemaParam sparkPageSchemaParam, SparkActivity activity) {
        o.LJIIJ(activity, "activity");
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = activity;
    }
}
