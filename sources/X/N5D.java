package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N5D {
    public final MusicDetail LIZ;
    public final CommerceMusicLogger LIZIZ;
    public final InterfaceC88472Yns<MusicModel, C76800UCe> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public N5D(MusicDetail musicDetail, CommerceMusicLogger logger, InterfaceC88472Yns<? super MusicModel, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(logger, "logger");
        this.LIZ = musicDetail;
        this.LIZIZ = logger;
        this.LIZJ = interfaceC88472Yns;
    }
}
