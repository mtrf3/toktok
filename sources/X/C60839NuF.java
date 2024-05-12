package X;

import android.text.TextUtils;
import com.bytedance.hybrid.spark.page.SparkActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.NuF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60839NuF implements InterfaceC60718NsI {
    public final /* synthetic */ SparkActivity LIZ;
    public final /* synthetic */ C68322mC LIZIZ;

    @Override // X.InterfaceC60718NsI
    public final void LIZ(String subTitle) {
        InterfaceC60844NuK interfaceC60844NuK;
        o.LJIIJ(subTitle, "subTitle");
        StringBuilder LIZIZ = C25620zW.LIZIZ("onReceivedSubTitle ", subTitle, " showWebUrl = ");
        LIZIZ.append(SparkActivity.LLFII(this.LIZ).getShowWebUrl());
        C37682Eqc.LIZIZ(this.LIZ.LJLIL, "SparkActivity", X1D.LIZIZ(LIZIZ));
        if (SparkActivity.LLFII(this.LIZ).getShowWebUrl() && !TextUtils.isEmpty(subTitle) && (interfaceC60844NuK = (InterfaceC60844NuK) this.LIZIZ.element) != null) {
            interfaceC60844NuK.LJIILJJIL(subTitle);
        }
    }

    @Override // X.InterfaceC60718NsI
    public final void LIZIZ(String str) {
        InterfaceC60844NuK interfaceC60844NuK;
        StringBuilder LIZIZ = C25620zW.LIZIZ("onReceivedTitle ", str, " useWebTitle = ");
        LIZIZ.append(SparkActivity.LLFII(this.LIZ).getUseWebviewTitle());
        C37682Eqc.LIZIZ(this.LIZ.LJLIL, "SparkActivity", X1D.LIZIZ(LIZIZ));
        if (SparkActivity.LLFII(this.LIZ).getUseWebviewTitle() && !TextUtils.isEmpty(str) && TextUtils.isEmpty(SparkActivity.LLFII(this.LIZ).getTitle()) && (interfaceC60844NuK = (InterfaceC60844NuK) this.LIZIZ.element) != null) {
            if (str == null) {
                str = "";
            }
            interfaceC60844NuK.LJJIII(str);
        }
    }

    public C60839NuF(SparkActivity sparkActivity, C68322mC c68322mC) {
        this.LIZ = sparkActivity;
        this.LIZIZ = c68322mC;
    }
}
