package X;

import com.bytedance.keva.Keva;

/* renamed from: X.LFi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53950LFi extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C53950LFi LJLIL = new C53950LFi();

    public C53950LFi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("repo_screen_size_cache_value");
    }
}
