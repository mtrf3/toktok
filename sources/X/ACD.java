package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ACD extends AbstractC65781Prl implements InterfaceC88472Yns<ContentLanguage, CharSequence> {
    public static final ACD LJLIL = new ACD();

    public ACD() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(ContentLanguage contentLanguage) {
        String localName = contentLanguage.getLocalName();
        o.LJIIIIZZ(localName, "it.localName");
        return localName;
    }
}
