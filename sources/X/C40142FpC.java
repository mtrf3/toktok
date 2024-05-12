package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.jvm.internal.o;

/* renamed from: X.FpC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40142FpC implements InterfaceC40162FpW {
    public final /* synthetic */ C68322mC<String> LIZ;

    public C40142FpC(C68322mC<String> c68322mC) {
        this.LIZ = c68322mC;
    }

    @Override // X.InterfaceC40162FpW
    public final void LIZ(SparkPopup popup) {
        String str;
        o.LJIIIZ(popup, "popup");
        String str2 = this.LIZ.element;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        SparkContext sparkContext = popup.LJLLI;
        if (sparkContext != null && (str = sparkContext.containerId) != null) {
            str3 = str;
        }
        C40101FoX.LIZJ(str2, str3);
    }
}
