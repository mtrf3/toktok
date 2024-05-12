package X;

import android.view.ViewGroup;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.NuP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60849NuP implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final SparkActivity LIZIZ;
    public final ViewGroup LIZJ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        boolean z;
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        boolean z2 = false;
        if (sparkPageSchemaParam != null) {
            z = sparkPageSchemaParam.getTransStatusBar();
        } else {
            z = false;
        }
        SparkPageSchemaParam sparkPageSchemaParam2 = this.LIZ;
        if (sparkPageSchemaParam2 != null) {
            z2 = sparkPageSchemaParam2.getShowNavBarInTransStatusBar();
        }
        this.LIZIZ.LJLJLJ = z;
        if (z && !z2) {
            this.LIZJ.setVisibility(8);
        }
    }

    public C60849NuP(SparkPageSchemaParam sparkPageSchemaParam, SparkActivity activity, ViewGroup titleBarContainer) {
        o.LJIIJ(activity, "activity");
        o.LJIIJ(titleBarContainer, "titleBarContainer");
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = activity;
        this.LIZJ = titleBarContainer;
    }
}
