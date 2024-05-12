package X;

import com.bytedance.keva.Keva;

/* renamed from: X.FYq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39164FYq extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C39164FYq LJLIL = new C39164FYq();

    public C39164FYq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("checkpoint_exit_info");
    }
}
