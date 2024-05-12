package X;

import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nug, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60866Nug implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final SparkActivity LIZIZ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        boolean z;
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam != null) {
            z = sparkPageSchemaParam.getDisableBackPress();
        } else {
            z = false;
        }
        this.LIZIZ.LJLJJI = z;
    }

    public C60866Nug(SparkPageSchemaParam sparkPageSchemaParam, SparkActivity activity) {
        o.LJIIJ(activity, "activity");
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = activity;
    }
}
