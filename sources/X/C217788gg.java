package X;

import com.bytedance.keva.Keva;

/* renamed from: X.8gg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217788gg extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C217788gg LJLIL = new C217788gg();

    public C217788gg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("repo_mention_cache");
    }
}
