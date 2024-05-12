package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JjO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49974JjO implements InterfaceC49992Jjg {
    public final InterfaceC49985JjZ LIZ;

    @Override // X.InterfaceC49991Jjf
    public final boolean LIZIZ(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(videoEvent, "videoEvent");
        return true;
    }

    public C49974JjO(JVP jvp) {
        this.LIZ = jvp;
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

    @Override // X.InterfaceC49992Jjg
    public final int LIZJ(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(videoEvent, "videoEvent");
        C40511Fv9 LJIJJ = C78842Uww.LJIJJ(C78842Uww.LJJ(0, C49995Jjj.LIZJ.size()));
        int i = LJIJJ.LJLIL;
        int i2 = LJIJJ.LJLILLLLZI;
        int i3 = LJIJJ.LJLJI;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (true) {
                DynamicPatch dynamicPatch = C49995Jjj.LIZJ.valueAt(i).LIZ;
                UC7.LIZLLL("find with index ", i);
                List<Aweme> awemeList = dynamicPatch.getAwemeList();
                if (awemeList != null) {
                    Iterator<Aweme> it = awemeList.iterator();
                    while (it.hasNext()) {
                        if (o.LJ(it.next().getAid(), aweme.getAid())) {
                            int adapterPlayAbleIndex = dynamicPatch.getAdapterPlayAbleIndex();
                            if (adapterPlayAbleIndex < 0) {
                                return adapterPlayAbleIndex;
                            }
                            return this.LIZ.LJJIJIIJI() + adapterPlayAbleIndex;
                        }
                    }
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC49991Jjf
    public final AbstractC49294JWg LIZLLL(C50420Jqa c50420Jqa, Aweme aweme) {
        return C49989Jjd.LIZIZ(c50420Jqa, aweme, this);
    }
}
