package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.typingindicator.TypingStatusConfig;

/* renamed from: X.3ni, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94743ni extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C94743ni LJLIL = new C94743ni();

    public C94743ni() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(((TypingStatusConfig) C94773nl.LIZIZ.getValue()).sendTypingIndicator);
    }
}
