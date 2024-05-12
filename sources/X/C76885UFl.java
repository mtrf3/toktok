package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.OpenCameraForSubParamModel;
import com.bytedance.android.livesdkapi.subscribe.emote.OpenCameraForSubResultModel;
import com.bytedance.hybrid.spark.SparkContext;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.UFl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76885UFl extends AbstractC32054Ci2<OpenCameraForSubParamModel, OpenCameraForSubResultModel> {
    public final int LJLJI;
    public final int LJLJJI;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76885UFl(SparkContext sparkContext) {
        super(sparkContext);
        o.LJIIIZ(sparkContext, "sparkContext");
        this.LJLJI = 1001;
        this.LJLJJI = 1002;
    }

    public C76885UFl(BaseFragment baseFragment) {
        super(baseFragment);
        this.LJLJI = 1001;
        this.LJLJJI = 1002;
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(Object obj, C38131Exr context) {
        ActivityC45651qj mo49getActivity;
        OpenCameraForSubParamModel params = (OpenCameraForSubParamModel) obj;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        IHostSubscription iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
        Fragment fragment = this.LJLILLLLZI;
        if (fragment != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            iHostSubscription.W30(new C45456Hsi(fragment, mo49getActivity, this.LJLJI, this.LJLJJI, new C76878UFe(params.minWidth, params.minHeight, params.maxWidth, params.maxHeight, params.maxSize), params.emotesShowStyle, params.logInfo));
        }
    }

    @Override // X.InterfaceC31231CNn
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.LJLJJI == i2 && this.LJLJI == i) {
            Serializable serializable = null;
            if (intent != null) {
                serializable = intent.getSerializableExtra("sub_result_model");
            }
            boolean z = serializable instanceof OpenCameraForSubResultModel;
            Serializable serializable2 = serializable;
            if (!z || serializable == null) {
                OpenCameraForSubResultModel openCameraForSubResultModel = new OpenCameraForSubResultModel();
                openCameraForSubResultModel.setStatus(1);
                serializable2 = openCameraForSubResultModel;
            }
            try {
                finishWithResult(serializable2);
            } catch (Exception unused) {
                finishWithFailure();
            }
        }
    }
}
