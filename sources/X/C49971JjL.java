package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JjL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49971JjL implements InterfaceC49992Jjg {
    public final JVO LIZ;

    public C49971JjL(JVS jvs) {
        this.LIZ = jvs;
    }

    @Override // X.InterfaceC49295JWh
    public final AbstractC49294JWg LJ(C50420Jqa videoEvent) {
        o.LJIIIZ(videoEvent, "videoEvent");
        return C49990Jje.LIZ(this, videoEvent);
    }

    @Override // X.InterfaceC49992Jjg
    public final AbstractC49294JWg LIZ(int i, Aweme aweme) {
        return C49989Jjd.LIZ(i, aweme);
    }

    @Override // X.InterfaceC49991Jjf
    public final boolean LIZIZ(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(videoEvent, "videoEvent");
        return true;
    }

    @Override // X.InterfaceC49992Jjg
    public final int LIZJ(C50420Jqa videoEvent, Aweme aweme) {
        List<T> list;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(videoEvent, "videoEvent");
        if (videoEvent.LJLJLJ == 74 && (list = this.LIZ.mmItems) != 0) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                String str = ((SearchMixFeed) it.next()).LJI().schema;
                o.LJIIIIZZ(str, "it.dynamicPatch.schema");
                if (JWA.LJI(str, "activity-video")) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC49991Jjf
    public final AbstractC49294JWg LIZLLL(C50420Jqa c50420Jqa, Aweme aweme) {
        return C49989Jjd.LIZIZ(c50420Jqa, aweme, this);
    }
}
