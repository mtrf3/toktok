package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.OVq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62018OVq extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C62018OVq LJLIL = new C62018OVq();

    public C62018OVq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("keva_repo_live_wallpaper", 1);
    }
}
