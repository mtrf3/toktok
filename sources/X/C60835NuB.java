package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.NuB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60835NuB implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final SparkActivity LIZIZ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        L7N l7n;
        String statusFontMode;
        EnumC60795NtX enumC60795NtX;
        C60836NuC LJFF;
        C60809Ntl.LIZIZ.getClass();
        InterfaceC60799Ntb interfaceC60799Ntb = C60809Ntl.LIZ;
        if (interfaceC60799Ntb != null && (LJFF = interfaceC60799Ntb.LJFF()) != null) {
            l7n = LJFF.LIZIZ;
        } else {
            l7n = null;
        }
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam != null) {
            String statusFontMode2 = sparkPageSchemaParam.getStatusFontMode();
            if (statusFontMode2 == null) {
                if (C60806Nti.LIZ) {
                    SparkContext sparkContext = this.LIZIZ.LJLIL;
                    if (sparkContext != null) {
                        enumC60795NtX = sparkContext.LJ(null);
                    } else {
                        enumC60795NtX = null;
                    }
                    if (enumC60795NtX == EnumC60795NtX.DARK) {
                        statusFontMode2 = "light";
                    }
                }
                statusFontMode2 = null;
            }
            sparkPageSchemaParam.setStatusFontMode(statusFontMode2);
        }
        SparkPageSchemaParam sparkPageSchemaParam2 = this.LIZ;
        if (sparkPageSchemaParam2 != null && (statusFontMode = sparkPageSchemaParam2.getStatusFontMode()) != null) {
            int hashCode = statusFontMode.hashCode();
            if (hashCode != 3075958) {
                if (hashCode == 102970646 && statusFontMode.equals("light")) {
                    l7n = L7N.Light;
                }
            } else if (statusFontMode.equals("dark")) {
                l7n = L7N.DARK;
            }
        }
        this.LIZIZ.LJLJL = l7n;
    }

    public C60835NuB(SparkPageSchemaParam sparkPageSchemaParam, SparkActivity activity) {
        o.LJIIJ(activity, "activity");
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = activity;
    }
}
