package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import kotlin.jvm.internal.o;

/* renamed from: X.AAp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25799AAp extends AbstractC65781Prl implements InterfaceC88472Yns<ContentLanguage, CharSequence> {
    public static final C25799AAp LJLIL = new C25799AAp();

    public C25799AAp() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(ContentLanguage contentLanguage) {
        String languageCode = contentLanguage.getLanguageCode();
        o.LJIIIIZZ(languageCode, "it.languageCode");
        return languageCode;
    }
}
