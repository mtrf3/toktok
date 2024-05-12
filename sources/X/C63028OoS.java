package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model.AppealStatusResponse;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.ui.AppealDialogActivity;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.viewmodel.AppealDialogViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.OoS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63028OoS implements ViewModelProvider.Factory {
    public final /* synthetic */ AppealDialogActivity LIZ;
    public final /* synthetic */ AppealStatusResponse LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new AppealDialogViewModel(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public C63028OoS(AppealDialogActivity appealDialogActivity, AppealStatusResponse appealStatusResponse, String str, String str2, String str3) {
        this.LIZ = appealDialogActivity;
        this.LIZIZ = appealStatusResponse;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
