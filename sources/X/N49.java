package X;

import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N49 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Long> {
    public static final N49 LJLIL = new N49();

    public N49() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Long invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        MusicDetail musicDetail = (MusicDetail) $receiver.LIZ(MusicDetail.class);
        if (musicDetail != null) {
            return musicDetail.suggestionId;
        }
        return null;
    }
}
