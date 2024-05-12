package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.journey.step.applanguage.ChooseAppLanguageComponent;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0H extends AbstractC40836G0y<C35656Dz2> {
    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_APP_LANGUAGE_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
        Locale ROOT = Locale.ROOT;
        o.LJIIIIZZ(ROOT, "ROOT");
        String upperCase = appLanguage.toUpperCase(ROOT);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (!TextUtils.equals("EN", upperCase) || !TextUtils.equals("MY", C85990Xow.LIZIZ()) || !((InterfaceC40755Fz5) this.LIZ.LJLILLLLZI).LJFF().LIZLLL || E5H.LIZIZ(EnumC40761FzB.JOURNEY_APP_LANGUAGE_ID) || G0G.LIZ().skipLanguage) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC40836G0y
    public final NUJComponentFragment LJ(C35656Dz2 c35656Dz2) {
        return new ChooseAppLanguageComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0H(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }
}
