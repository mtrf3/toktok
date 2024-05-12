package X;

import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;

/* renamed from: X.6Se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160646Se extends AbstractC65781Prl implements InterfaceC65784Pro<AddYoursStickerTopicRepo.Api> {
    public static final C160646Se LJLIL = new C160646Se();

    public C160646Se() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo$Api, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AddYoursStickerTopicRepo.Api invoke() {
        return C60903NvH.LJIIJJI().getNetworkService().createDefaultRetrofit(AddYoursStickerTopicRepo.Api.class);
    }
}
