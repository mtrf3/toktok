package X;

import com.ss.android.ugc.aweme.settings.NearbyTabConfig;

/* renamed from: X.LbD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54563LbD extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C54563LbD LJLIL = new C54563LbD();

    public C54563LbD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Integer num = NearbyTabConfig.LIZIZ().abMode;
        boolean z = false;
        if (num != null && num.intValue() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
