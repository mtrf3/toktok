package X;

import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.MJe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56598MJe implements MJ9 {
    public final /* synthetic */ TrendsTabFragment LIZ;

    public C56598MJe(TrendsTabFragment trendsTabFragment) {
        this.LIZ = trendsTabFragment;
    }

    @Override // X.MJ9
    public final void LIZ(int i, String tagId, String tagLine) {
        o.LJIIIZ(tagId, "tagId");
        o.LJIIIZ(tagLine, "tagLine");
        if (tagId.length() > 0 && !this.LIZ.LJLJLJ.contains(tagId)) {
            this.LIZ.LJLJLJ.add(tagId);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "discovery");
            c188727au.LJIIIZ("tag_id", tagId);
            c188727au.LJIIIZ("tag_line", tagLine);
            c188727au.LIZLLL(i + 1, "order");
            FMX.LJIIL("show_hashtag", c188727au.LIZ);
        }
    }
}
