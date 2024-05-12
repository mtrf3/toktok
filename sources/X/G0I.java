package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.applanguage.ChooseAppLanguageComponent;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0I extends G0N<ChooseAppLanguageComponent, InterfaceC40793Fzh> {
    public ChooseAppLanguageComponent LIZ;

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        InterfaceC88472Yns<Fragment, C76800UCe> LJIIZILJ = dependencies.LJIIZILJ();
        ChooseAppLanguageComponent chooseAppLanguageComponent = this.LIZ;
        o.LJI(chooseAppLanguageComponent);
        LJIIZILJ.invoke(chooseAppLanguageComponent);
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        ChooseAppLanguageComponent chooseAppLanguageComponent = new ChooseAppLanguageComponent();
        this.LIZ = chooseAppLanguageComponent;
        return chooseAppLanguageComponent;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
        Locale ROOT = Locale.ROOT;
        o.LJIIIIZZ(ROOT, "ROOT");
        String upperCase = appLanguage.toUpperCase(ROOT);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (!TextUtils.equals("EN", upperCase) || !TextUtils.equals("MY", C85990Xow.LIZIZ()) || !componentDependencies.Ma() || E5H.LIZIZ(EnumC40761FzB.JOURNEY_APP_LANGUAGE_ID)) {
            return false;
        }
        return true;
    }
}
