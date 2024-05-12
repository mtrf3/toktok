package X;

import android.content.Context;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ugc.effectcreator.main.model.AutoChangeModel;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aio, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94550aio extends AbstractC65781Prl implements InterfaceC88472Yns<EnumC93944aZ2, C76800UCe> {
    public final /* synthetic */ AutoChangeModel LJLIL;
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;
    public final /* synthetic */ Feature LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94550aio(AutoChangeModel autoChangeModel, InterfaceC88472Yns interfaceC88472Yns, Feature feature, String str, long j) {
        super(1);
        this.LJLIL = autoChangeModel;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = feature;
        this.LJLJJI = str;
        this.LJLJJL = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EnumC93944aZ2 it) {
        Context context;
        boolean z;
        String str;
        String str2;
        Feature LJFF;
        o.LJIIIZ(it, "it");
        if (it == EnumC93944aZ2.SKIP) {
            C93744aVo.LIZIZ(new IDqS423S0100000_42(this, 59), 0L);
        } else {
            IEditorContext LIZ = C93940aYy.LIZ();
            if (LIZ != null && (context = LIZ.getContext()) != null) {
                if (it == EnumC93944aZ2.SUCCESS) {
                    z = true;
                    if (this.LJLIL.shouldShowChangeModelTipDialog(this.LJLJI)) {
                        this.LJLIL.showChangeModelDialog();
                    }
                } else {
                    z = false;
                    ToastService toastService = ToastService.INSTANCE;
                    String string = context.getString(R.string.fyb);
                    o.LJIIIIZZ(string, "context.getString(\n     …ail\n                    )");
                    toastService.showToast(context, string);
                }
                StatisticReporter LIZ2 = C93670aUc.LIZ();
                if (LIZ2 != null) {
                    OSZ[] oszArr = new OSZ[3];
                    oszArr[0] = new OSZ("switch_reason", this.LJLJJI);
                    C93829aXB LJI = CKEffectEditorContext.LJI();
                    if (LJI != null && (LJFF = LJI.LJFF(this.LJLJJL)) != null) {
                        str = C93825aX7.LJFF(LJFF);
                    } else {
                        str = "";
                    }
                    oszArr[1] = new OSZ("feature_id", str);
                    if (z) {
                        str2 = "success";
                    } else {
                        str2 = "fail";
                    }
                    oszArr[2] = new OSZ("result", str2);
                    LIZ2.onEvent("modelphoto_autoswitch_result", C113554cx.LJJL(oszArr));
                }
                C93744aVo.LIZIZ(new C94552aiq(this, z), 0L);
            }
        }
        return C76800UCe.LIZ;
    }
}
