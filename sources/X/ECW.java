package X;

import com.ss.android.ugc.aweme.qna.api.TiktokV1ForumProfileBannerResponse;

/* loaded from: classes7.dex */
public final class ECW implements ECH {
    public final /* synthetic */ ECX LJLIL;

    public ECW(ECX ecx) {
        this.LJLIL = ecx;
    }

    @Override // X.ECH
    public final AbstractC73672Svk<TiktokV1ForumProfileBannerResponse> LJJIII(Long l, String str) {
        return this.LJLIL.LIZ.getBannerData(l, str);
    }
}
