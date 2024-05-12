package X;

import com.bytedance.keva.Keva;

/* renamed from: X.8dL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215718dL extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C215718dL LJLIL = new C215718dL();

    public C215718dL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("danmaku_keva_repo");
    }
}
