package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.KvL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53263KvL extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C53263KvL LJLIL = new C53263KvL();

    public C53263KvL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepoSync("repo_gecko_channel_list", 0);
    }
}
