package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import kotlin.jvm.internal.o;

/* renamed from: X.ABt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25829ABt extends AbstractC65781Prl implements InterfaceC88472Yns<ContentLanguage, CharSequence> {
    public static final C25829ABt LJLIL = new C25829ABt();

    public C25829ABt() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(ContentLanguage contentLanguage) {
        String languageCode = contentLanguage.getLanguageCode();
        o.LJIIIIZZ(languageCode, "it.languageCode");
        return languageCode;
    }
}
