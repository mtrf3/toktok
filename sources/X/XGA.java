package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes16.dex */
public final class XGA extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final XGA LJLIL = new XGA();

    public XGA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepoSync("repo_parental_platform", 0);
    }
}
