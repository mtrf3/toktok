package X;

import com.ss.android.ugc.aweme.experiment.SupportedLanguage;

/* loaded from: classes5.dex */
public final class ACY extends AbstractC65781Prl implements InterfaceC65784Pro<SupportedLanguage[]> {
    public static final ACY LJLIL = new ACY();

    public ACY() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.experiment.SupportedLanguage[]] */
    @Override // X.InterfaceC65784Pro
    public final SupportedLanguage[] invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SupportedLanguage[] supportedLanguageArr = ACX.LIZIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "caption_transcript_panel_language_allowlist", 31744, SupportedLanguage[].class, supportedLanguageArr);
        if (LJIJ == 0) {
            return supportedLanguageArr;
        }
        return LJIJ;
    }
}
