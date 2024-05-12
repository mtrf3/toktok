package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MF0 implements MF9 {
    public static final MF0 LIZIZ = new MF0();
    public final /* synthetic */ MF9 LIZ = C87030YDq.LIZIZ.favoritesMobUtilsService();

    @Override // X.MF9
    public final boolean isDataSetChangedOnStart() {
        return this.LIZ.isDataSetChangedOnStart();
    }

    @Override // X.MF9
    public final void onVideoItemActionShow(Aweme data) {
        o.LJIIIZ(data, "data");
        this.LIZ.onVideoItemActionShow(data);
    }

    @Override // X.MF9
    public final void setDataSetChangedOnStart(boolean z) {
        this.LIZ.setDataSetChangedOnStart(z);
    }
}
