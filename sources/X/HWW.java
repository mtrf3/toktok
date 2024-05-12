package X;

import com.ss.android.ugc.aweme.sticker.AddYoursAvatarHelper;

/* loaded from: classes8.dex */
public final class HWW extends AbstractC65781Prl implements InterfaceC65784Pro<AddYoursAvatarHelper.Api> {
    public static final HWW LJLIL = new HWW();

    public HWW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.sticker.AddYoursAvatarHelper$Api] */
    @Override // X.InterfaceC65784Pro
    public final AddYoursAvatarHelper.Api invoke() {
        return C60903NvH.LJIIJJI().getNetworkService().createDefaultRetrofit(AddYoursAvatarHelper.Api.class);
    }
}
