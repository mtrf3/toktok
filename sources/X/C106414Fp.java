package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.GiphyGifApi;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model.GiphyGifsResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.4Fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106414Fp implements InterfaceC106444Fs {
    public final GiphyGifApi LIZ;

    public C106414Fp(GiphyGifApi api) {
        o.LJIIIZ(api, "api");
        this.LIZ = api;
    }

    @Override // X.InterfaceC106444Fs
    public final AbstractC73638SvC<GiphyGifsResponse> LIZ(int i) {
        return this.LIZ.getTrendingGiphy(i);
    }
}
