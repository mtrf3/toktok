package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class HZS extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final HZS LJLIL = new HZS();

    public HZS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("creative_tools_record_task_repo");
    }
}
