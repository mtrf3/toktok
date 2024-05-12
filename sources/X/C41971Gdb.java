package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Gdb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41971Gdb extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C41971Gdb LJLIL = new C41971Gdb();

    public C41971Gdb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("app_exit_repo");
    }
}
