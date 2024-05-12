package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import defpackage.k;
import kotlin.jvm.internal.o;

/* renamed from: X.KGy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51444KGy extends k {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        SearchResultParam searchResultParam;
        o.LJIIIZ(type, "type");
        String enterMethod = ((k.b) xBaseParamModel).getEnterMethod();
        if (TextUtils.isEmpty(enterMethod)) {
            C31626Cb8.LIZ(c37356ElM, 0, "enterMethod null", 4);
            return;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        if ((context instanceof SearchResultActivity) && (searchResultParam = ((SearchStartViewModel) ViewModelProviders.of((ActivityC45651qj) context).get(SearchStartViewModel.class)).LLD) != null) {
            searchResultParam.setEnterMethod(enterMethod);
            Z9N.LIZIZ.LIZ.LJLLI(context, searchResultParam);
            C2U8.LIZ(new C50221JnN(searchResultParam));
        }
        XBaseModel LIZJ = ED5.LIZJ(k.c.class, null);
        ((k.c) LIZJ).setCode(1);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
