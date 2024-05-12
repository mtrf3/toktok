package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.jvm.internal.o;

/* renamed from: X.FpD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40143FpD implements InterfaceC40162FpW {
    public final /* synthetic */ C68322mC<String> LIZ;

    public C40143FpD(C68322mC<String> c68322mC) {
        this.LIZ = c68322mC;
    }

    @Override // X.InterfaceC40162FpW
    public final void LIZ(SparkPopup popup) {
        String str;
        o.LJIIIZ(popup, "popup");
        String str2 = this.LIZ.element;
        SparkContext sparkContext = popup.LJLLI;
        if (sparkContext == null || (str = sparkContext.containerId) == null) {
            str = "";
        }
        C40101FoX.LIZJ(str2, str);
    }
}
