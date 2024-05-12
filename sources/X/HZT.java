package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class HZT extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final HZT LJLIL = new HZT();

    public HZT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("creative_tools_record_task_repo");
    }
}
