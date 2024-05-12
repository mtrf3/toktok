package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* renamed from: X.7aG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188327aG extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C188327aG LJLIL = new C188327aG();

    public C188327aG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("watch_history", 0);
    }
}
