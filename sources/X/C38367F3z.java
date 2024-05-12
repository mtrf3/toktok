package X;

import android.app.Activity;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.viewmodel.NPSSurveyJSBViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.F3z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38367F3z extends AbstractC38364F3w {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity activity;
        ActivityC45651qj activityC45651qj;
        InterfaceC38366F3y interfaceC38366F3y = (InterfaceC38366F3y) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            activity = interfaceC38263Ezz.LIZLLL();
        } else {
            activity = null;
        }
        if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null) {
            NPSSurveyJSBViewModel nPSSurveyJSBViewModel = (NPSSurveyJSBViewModel) ViewModelProviders.of(activityC45651qj).get(NPSSurveyJSBViewModel.class);
            F41 f41 = new F41();
            f41.LIZ = o.LJ(interfaceC38366F3y.getType(), "success");
            f41.LIZIZ = interfaceC38366F3y.getContent();
            f41.LIZJ = interfaceC38366F3y.getDuration().longValue();
            nPSSurveyJSBViewModel.LJLILLLLZI = f41;
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC38363F3v.class, null), "");
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "Activity is null!", 4);
    }
}
