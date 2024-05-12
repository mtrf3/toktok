package X;

import com.ss.android.ugc.aweme.ab.WebSocketInitExperiment;

/* renamed from: X.DqU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35126DqU extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35126DqU LJLIL = new C35126DqU();

    public C35126DqU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (WebSocketInitExperiment.LIZ() == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
