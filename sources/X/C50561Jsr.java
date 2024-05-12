package X;

import Y.ARunnableS19S0300000_8;
import android.content.Context;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchTranslationVM;
import com.ss.android.ugc.aweme.translation.service.TranslationLangKevaServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Jsr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50561Jsr implements InterfaceC50639Ju7<Object> {
    public final int LIZ = 4;

    @Override // X.InterfaceC50639Ju7
    public final /* bridge */ /* synthetic */ Object getData() {
        return null;
    }

    @Override // X.InterfaceC50639Ju7
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LIZ);
    }

    @Override // X.InterfaceC50639Ju7
    public final void LIZ(Context context, SearchResultParam searchResultParam, Long l) {
        KAK kak;
        String str;
        KAK targetTab;
        o.LJIIIZ(context, "context");
        C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam == null || (kak = searchEnterParam.getTargetTab()) == null) {
            kak = KAK.TOP;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Target tab: ");
        C51298KBi c51298KBi = KAK.Companion;
        C50948Jz6 searchEnterParam2 = searchResultParam.getSearchEnterParam();
        if (searchEnterParam2 == null || (targetTab = searchEnterParam2.getTargetTab()) == null || (str = targetTab.getTabName()) == null) {
            str = "";
        }
        c51298KBi.getClass();
        LIZ.append(C51298KBi.LIZ(str));
        X1D.LIZIZ(LIZ);
        if (kak == KAK.TOP && C00F.LIZ(31744, 0, "bellagio_disabled_general_tab", true) != 1) {
            SearchSecurityControlConfig.LIZ.getClass();
            if (SearchSecurityControlConfig.LIZ().disableGeneralTab) {
                return;
            }
            if (!SearchTranslationVM.LJLJI || TranslationLangKevaServiceImpl.LJIIZILJ().LJ() == null) {
                SearchTranslationVM.LJLJI = true;
                if (C34265Dcb.LIZ() != 0) {
                    ContentLanguageServiceImpl.LJIIJJI().LJFF(new C25790AAg());
                }
            }
            EnumC50363Jpf.INSTANCE.async(new ARunnableS19S0300000_8(context, searchResultParam, l, 13));
        }
    }
}
