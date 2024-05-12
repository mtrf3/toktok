package X;

import com.bytedance.keva.Keva;

/* renamed from: X.GvF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43065GvF extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C43065GvF LJLIL = new C43065GvF();

    public C43065GvF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("repo_creative_file");
    }
}
