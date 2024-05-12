package X;

import com.bytedance.keva.Keva;

/* renamed from: X.31T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31T extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C31T LJLIL = new C31T();

    public C31T() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("keva_repo_im_notification");
    }
}
