package X;

import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;

/* renamed from: X.4GF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C4GF LJLIL = new C4GF();

    public C4GF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SuggestedReplyExperiment.LIZ().getEnabled());
    }
}
