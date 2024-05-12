package X;

import java.io.FileOutputStream;

/* renamed from: X.2vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74252vl extends AbstractC65781Prl implements InterfaceC65784Pro<FileOutputStream> {
    public static final C74252vl LJLIL = new C74252vl();

    public C74252vl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final FileOutputStream invoke() {
        C62822Ol8 c62822Ol8 = C74242vk.LIZIZ;
        C39579Fg7.LJ((String) c62822Ol8.getValue(), true);
        return new FileOutputStream((String) c62822Ol8.getValue(), true);
    }
}
