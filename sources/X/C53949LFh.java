package X;

import com.bytedance.keva.Keva;

/* renamed from: X.LFh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53949LFh extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C53949LFh LJLIL = new C53949LFh();

    public C53949LFh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("repo_screen_size_cache_keys");
    }
}
