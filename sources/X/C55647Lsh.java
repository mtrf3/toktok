package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Lsh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55647Lsh extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C55647Lsh LJLIL = new C55647Lsh();

    public C55647Lsh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("repo_story_cold_start");
    }
}
