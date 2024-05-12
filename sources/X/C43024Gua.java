package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Gua, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43024Gua extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C43024Gua LJLIL = new C43024Gua();

    public C43024Gua() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C43025Gub.LIZ);
        LIZ.append("_ai_music_list_response");
        return Keva.getRepo(X1D.LIZIZ(LIZ));
    }
}
