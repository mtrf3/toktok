package X;

import android.view.ViewGroup;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nuf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60865Nuf implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final ViewGroup LIZIZ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam != null && sparkPageSchemaParam.getHideNavBar()) {
            this.LIZIZ.setVisibility(8);
        } else {
            this.LIZIZ.setVisibility(0);
        }
    }

    public C60865Nuf(SparkPageSchemaParam sparkPageSchemaParam, ViewGroup titleBarContainer) {
        o.LJIIJ(titleBarContainer, "titleBarContainer");
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = titleBarContainer;
    }
}
