package X;

import com.ss.android.ugc.aweme.experiment.QuickCommentOptConfig;

/* renamed from: X.VHn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79487VHn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C79487VHn LJLIL = new C79487VHn();

    public C79487VHn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((QuickCommentOptConfig) C79488VHo.LIZIZ.getValue()).group < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
