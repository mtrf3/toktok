package X;

import com.ss.android.ugc.aweme.experiment.QuickCommentOptConfig;

/* renamed from: X.VHq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79490VHq extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C79490VHq INSTANCE = new C79490VHq();

    public C79490VHq() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((QuickCommentOptConfig) C79488VHo.LIZIZ.getValue()).group < 2 || !C16880lQ.LLLZLL()) && (C7DU.LIZ() & 16) != 16) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
