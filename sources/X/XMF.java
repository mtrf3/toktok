package X;

import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.jvm.internal.AqS181S0100000_15;

/* loaded from: classes16.dex */
public final class XMF implements InterfaceC64672gJ<String> {
    public final /* synthetic */ TranslationStatusViewModel LJLIL;

    public XMF(TranslationStatusViewModel translationStatusViewModel) {
        this.LJLIL = translationStatusViewModel;
    }

    @Override // X.InterfaceC64672gJ
    public final Object emit(String str, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        TranslationStatusViewModel translationStatusViewModel = this.LJLIL;
        translationStatusViewModel.getClass();
        translationStatusViewModel.withState(new AqS181S0100000_15(translationStatusViewModel, 163));
        return C76800UCe.LIZ;
    }
}
