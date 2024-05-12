package X;

import Y.ARunnableS0S0204000_3;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.ShowActionSheetListener;
import com.bytedance.ies.xbridge.base.runtime.depend.ToastBuilder;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.O5l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61337O5l implements C0K7, InterfaceC62323Od5, IHostStyleUIDepend, InterfaceC19580pm, InterfaceC45398Hrm {
    public static final C61337O5l LJLIL = new C61337O5l();
    public static final C61337O5l LJLILLLLZI = new C61337O5l();

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public Boolean hideLoading(C60991Nwh params, C31926Cfy c31926Cfy) {
        o.LJIIJ(params, "params");
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener) {
        o.LJIIJ(actionSheetBuilder, "actionSheetBuilder");
        o.LJIIJ(showActionSheetListener, "showActionSheetListener");
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public Boolean showDialog(DialogBuilder dialogBuilder) {
        o.LJIIJ(dialogBuilder, "dialogBuilder");
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public Boolean showLoading(C61338O5m params, C31926Cfy c31926Cfy) {
        o.LJIIJ(params, "params");
        return null;
    }

    @Override // X.InterfaceC45398Hrm
    public void LIZIZ() {
        AbstractC87761YcP abstractC87761YcP = C87762YcQ.LJII;
        if (abstractC87761YcP != null) {
            abstractC87761YcP.cancel();
        }
    }

    @Override // X.InterfaceC62323Od5
    public String LIZLLL() {
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("share_twitter_target_type", "com.twitter.composer.ComposerActivity");
            o.LJIIIIZZ(LJI, "{\n            SettingsMa…rm::class.java)\n        }");
            return LJI;
        } catch (Throwable unused) {
            return "com.twitter.composer.ComposerActivity";
        }
    }

    @Override // X.InterfaceC62323Od5
    public Activity LIZ() {
        return C84763XOl.LJIIIIZZ();
    }

    @Override // X.InterfaceC62323Od5
    public java.util.Map LJ() {
        return HME.LIZIZ;
    }

    @Override // X.InterfaceC62323Od5
    public List LJI() {
        return HME.LIZ;
    }

    @Override // X.InterfaceC62323Od5
    public boolean LIZJ(Activity activity) {
        return C217628gQ.LIZIZ.LIZJ(activity);
    }

    @Override // X.InterfaceC19580pm
    public String LJFF(Activity activity) {
        SparkContext sparkContext;
        String str;
        if (!(activity instanceof SparkActivity) || (sparkContext = ((SparkActivity) activity).LJLIL) == null || (str = sparkContext.url) == null) {
            return null;
        }
        return C73592uh.LIZ(str);
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static int LJII(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == i3) {
            return i3;
        }
        StringBuilder LJ = AnonymousClass028.LJ("overflow: ", "checkedAdd", "(", i, ", ");
        throw new ArithmeticException(C08380Uo.LIZ(LJ, i2, ")", LJ));
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend
    public Boolean showToast(ToastBuilder toastBuilder, C31926Cfy c31926Cfy) {
        o.LJIIJ(toastBuilder, "toastBuilder");
        C16880lQ.LLZILL(Toast.makeText(toastBuilder.getContext(), toastBuilder.getMessage(), 0));
        return Boolean.TRUE;
    }

    public static final void LJIIIIZZ(View view, int i, int i2) {
        View view2;
        if (view == null) {
            return;
        }
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            view2.post(new ARunnableS0S0204000_3(view, i, i2, view2, 0));
        }
    }
}
