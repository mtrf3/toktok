package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hud, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45575Hud extends F9E {
    public final List<MyMediaModel> LJLIL;
    public final long LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI)};
    }

    public C45575Hud(List<MyMediaModel> mediaList, long j) {
        o.LJIIIZ(mediaList, "mediaList");
        this.LJLIL = mediaList;
        this.LJLILLLLZI = j;
    }
}
