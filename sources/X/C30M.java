package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi;

/* renamed from: X.30M, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30M extends AbstractC65781Prl implements InterfaceC65784Pro<StickerStoreApi> {
    public static final C30M LJLIL = new C30M();

    public C30M() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi] */
    @Override // X.InterfaceC65784Pro
    public final StickerStoreApi invoke() {
        return RetrofitFactory.LIZLLL().LIZ(C74722wW.LIZIZ).LJFF().LIZ.LIZ(StickerStoreApi.class);
    }
}
