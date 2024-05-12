package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.trill.setting.PreferredLanguageSettingFragment;
import com.ss.android.ugc.trill.setting.PreferredLanguageSettingPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.AEn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25901AEn extends ViewModelProvider.NewInstanceFactory {
    public final InterfaceC25906AEs LIZ;
    public final ContentLanguage[] LIZIZ;
    public final String[] LIZJ;
    public final String[] LIZLLL;
    public final EnumC25904AEq LJ;

    @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new PreferredLanguageSettingPageViewModel(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public C25901AEn(PreferredLanguageSettingFragment delegate, ContentLanguage[] contentLanguageArr, String[] strArr, String[] strArr2, EnumC25904AEq settingPageType) {
        o.LJIIIZ(delegate, "delegate");
        o.LJIIIZ(settingPageType, "settingPageType");
        this.LIZ = delegate;
        this.LIZIZ = contentLanguageArr;
        this.LIZJ = strArr;
        this.LIZLLL = strArr2;
        this.LJ = settingPageType;
    }
}
