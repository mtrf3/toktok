package X;

import com.ss.android.ugc.aweme.experiment.QuickCommentOptConfig;

/* renamed from: X.VHp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79489VHp extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C79489VHp INSTANCE = new C79489VHp();

    public C79489VHp() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((QuickCommentOptConfig) C79488VHo.LIZIZ.getValue()).group >= 3 && C16880lQ.LLLZLL()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
