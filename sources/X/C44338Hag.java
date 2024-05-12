package X;

/* renamed from: X.Hag, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44338Hag extends AbstractC65781Prl implements InterfaceC65784Pro<com.ss.android.ugc.aweme.sharedar.network.API> {
    public static final C44338Hag LJLIL = new C44338Hag();

    public C44338Hag() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.sharedar.network.API, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final com.ss.android.ugc.aweme.sharedar.network.API invoke() {
        return C60903NvH.LJIIJJI().getNetworkService().createDefaultRetrofit(com.ss.android.ugc.aweme.sharedar.network.API.class);
    }
}
