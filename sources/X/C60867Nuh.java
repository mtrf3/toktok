package X;

import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nuh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60867Nuh implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final SparkActivity LIZIZ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        boolean hideStatusBar;
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam != null && (hideStatusBar = sparkPageSchemaParam.getHideStatusBar())) {
            this.LIZIZ.LJLJJL = hideStatusBar;
        }
    }

    public C60867Nuh(SparkPageSchemaParam sparkPageSchemaParam, SparkActivity activity) {
        o.LJIIJ(activity, "activity");
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = activity;
    }
}
