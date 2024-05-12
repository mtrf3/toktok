package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class EFF extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final EFF LJLIL = new EFF();

    public EFF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepoSync("main_process_runstate", 1);
    }
}
