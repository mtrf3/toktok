package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.Eg3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37027Eg3 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C37027Eg3 LJLIL = new C37027Eg3();

    public C37027Eg3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepoSync("repo_hybrid_abtests", 0);
    }
}
