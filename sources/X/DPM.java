package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class DPM extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final DPM LJLIL = new DPM();

    public DPM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("ab_repo_cold_boot_muti", 1);
    }
}
