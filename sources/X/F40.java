package X;

import android.app.Activity;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.viewmodel.NPSSurveyJSBViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F40 extends AbstractC38360F3s {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity LIZLLL;
        InterfaceC38361F3t interfaceC38361F3t = (InterfaceC38361F3t) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (LIZLLL = interfaceC38263Ezz.LIZLLL()) != null && (LIZLLL instanceof SearchResultActivity)) {
            ((NPSSurveyJSBViewModel) ViewModelProviders.of((ActivityC45651qj) LIZLLL).get(NPSSurveyJSBViewModel.class)).LJLIL.setValue(new F42(interfaceC38361F3t.getSearchType(), true));
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC38359F3r.class, null), "");
        } else {
            C31626Cb8.LIZ(c37356ElM, 0, "Activity is null or not SearchResultActivity!", 4);
        }
    }
}
