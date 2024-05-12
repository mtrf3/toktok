package X;

import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;

/* renamed from: X.4GG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GG extends AbstractC65781Prl implements InterfaceC65784Pro<SuggestedReplyExperiment.SuggestedReplyConfig> {
    public static final C4GG LJLIL = new C4GG();

    public C4GG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SuggestedReplyExperiment.SuggestedReplyConfig invoke() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            SuggestedReplyExperiment.SuggestedReplyConfig suggestedReplyConfig = SuggestedReplyExperiment.LIZ;
            LJIIIZ.getClass();
            SuggestedReplyExperiment.SuggestedReplyConfig suggestedReplyConfig2 = (SuggestedReplyExperiment.SuggestedReplyConfig) FFL.LJIJ(true, "dm_suggested_reply", 31744, SuggestedReplyExperiment.SuggestedReplyConfig.class, suggestedReplyConfig);
            if (suggestedReplyConfig2 != null) {
                return suggestedReplyConfig2;
            }
            return suggestedReplyConfig;
        } catch (Throwable unused) {
            return SuggestedReplyExperiment.LIZ;
        }
    }
}
