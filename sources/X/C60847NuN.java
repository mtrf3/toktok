package X;

import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.NuN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60847NuN implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final SparkActivity LIZIZ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        String screenOrientation;
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam == null || (screenOrientation = sparkPageSchemaParam.getScreenOrientation()) == null) {
            return;
        }
        int hashCode = screenOrientation.hashCode();
        if (hashCode != 729267099) {
            if (hashCode != 1430647483 || !screenOrientation.equals("landscape")) {
                return;
            }
            this.LIZIZ.setRequestedOrientation(0);
            return;
        }
        if (!screenOrientation.equals("portrait")) {
            return;
        }
        this.LIZIZ.setRequestedOrientation(1);
    }

    public C60847NuN(SparkPageSchemaParam sparkPageSchemaParam, SparkActivity activity) {
        o.LJIIJ(activity, "activity");
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = activity;
    }
}
