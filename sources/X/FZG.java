package X;

import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FZG extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final FZG LJLIL = new FZG();

    public FZG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        try {
            String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
            Locale locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
            String lowerCase = appLanguage.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        } catch (Exception unused) {
            return "en";
        }
    }
}
