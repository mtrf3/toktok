package X;

import com.bytedance.keva.Keva;

/* loaded from: classes12.dex */
public final class R5W extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final R5W LJLIL = new R5W();

    public R5W() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("smartlock_repo");
    }
}
