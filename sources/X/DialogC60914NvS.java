package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;

/* renamed from: X.NvS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogC60914NvS extends DialogC60912NvQ {
    public final /* synthetic */ SparkPopup LJLJJLL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        String str;
        InterfaceC60761Nsz interfaceC60761Nsz;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        C37682Eqc.LIZIZ(this.LJLJJLL.LJLLI, "SparkPopupLoadingProcess", "SparkPopup onBackPressed");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("disableBackPress:");
        LIZ.append(SparkPopup.xl(this.LJLJJLL));
        LIZ.append(".disableBackPress");
        C37682Eqc.LIZIZ(this.LJLJJLL.LJLLI, "SparkActivity", X1D.LIZIZ(LIZ));
        SparkContext sparkContext = this.LJLJJLL.LJLLI;
        if (sparkContext == null || (str = sparkContext.containerId) == null) {
            str = "";
        }
        boolean LIZIZ = F1T.LIZIZ(str);
        SparkFragment sparkFragment = this.LJLJJLL.LJLLJ;
        if (sparkFragment != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI) != null) {
            interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
        } else {
            interfaceC60761Nsz = null;
        }
        if (F1T.LIZ(interfaceC60761Nsz, LIZIZ, SparkPopup.xl(this.LJLJJLL).getBlockBackPress())) {
            return;
        }
        SparkPopup sparkPopup = this.LJLJJLL;
        C60937Nvp c60937Nvp = sparkPopup.LJZL;
        c60937Nvp.getClass();
        if (!c60937Nvp.LIZIZ(sparkPopup, C60929Nvh.LJLIL) && !SparkPopup.xl(this.LJLJJLL).getDisableBackPress()) {
            this.LJLJJLL.Nl(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC60914NvS(SparkPopup sparkPopup, Context context) {
        super(context);
        this.LJLJJLL = sparkPopup;
    }
}
