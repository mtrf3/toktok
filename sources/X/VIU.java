package X;

import com.ss.android.ugc.aweme.translation.service.ITranslationKevaService;
import com.ss.android.ugc.aweme.translation.service.TranslationKevaServiceImpl;

/* loaded from: classes15.dex */
public final class VIU extends AbstractC65781Prl implements InterfaceC65784Pro<ITranslationKevaService> {
    public static final VIU LJLIL = new VIU();

    public VIU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ITranslationKevaService invoke() {
        return TranslationKevaServiceImpl.LJIIL();
    }
}
