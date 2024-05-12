package X;

import com.ss.android.ugc.aweme.choosemusic.model.MusicPickResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.EoS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37548EoS extends F9E {
    public final C37619Epb LJLIL;
    public final MusicPickResponse LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C37548EoS(C37619Epb musicListRequestParam, MusicPickResponse musicPickResponse) {
        o.LJIIIZ(musicListRequestParam, "musicListRequestParam");
        this.LJLIL = musicListRequestParam;
        this.LJLILLLLZI = musicPickResponse;
    }
}
