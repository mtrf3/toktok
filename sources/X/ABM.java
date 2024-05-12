package X;

import com.ss.android.ugc.aweme.translation.service.ITranslationKevaService;
import com.ss.android.ugc.aweme.translation.service.TranslationKevaServiceImpl;

/* loaded from: classes5.dex */
public final class ABM extends AbstractC65781Prl implements InterfaceC65784Pro<ITranslationKevaService> {
    public static final ABM LJLIL = new ABM();

    public ABM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ITranslationKevaService invoke() {
        return TranslationKevaServiceImpl.LJIIL();
    }
}
