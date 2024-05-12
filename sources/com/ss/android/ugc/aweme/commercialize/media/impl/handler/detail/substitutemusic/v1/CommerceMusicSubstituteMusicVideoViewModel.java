package com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1;

import X.C221108m2;
import X.C32I;
import X.C47261Igj;
import X.C61878OQg;
import X.C62822Ol8;
import X.N4K;
import X.N4L;
import X.N4N;
import X.N4O;
import X.ORZ;
import X.V1M;
import X.V8H;
import X.XLM;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceMusicSubstituteMusicVideoViewModel extends ViewModel {
    public MusicDetail LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 88));
    public final XLM LJLJI = V8H.LIZ(new N4O(C61878OQg.INSTANCE, ""));

    public final void gv0(int i) {
        N4L n4l;
        N4O n4o = (N4O) V1M.LIZLLL(this.LJLJI).getValue();
        if (i > C47261Igj.LJJI(n4o.LJLIL) || i < 0) {
            return;
        }
        String aid = ((N4N) ListProtector.get(n4o.LJLIL, i)).LJLIL.getAid();
        int i2 = N4K.LIZ[((N4N) ListProtector.get(n4o.LJLIL, i)).LJLILLLLZI.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                return;
            }
            XLM xlm = this.LJLJI;
            List<N4N> list = n4o.LJLIL;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (N4N n4n : list) {
                if (o.LJ(n4n.LJLIL.getAid(), aid)) {
                    n4l = N4L.PLAYING;
                } else {
                    n4l = n4n.LJLILLLLZI;
                    if (n4l == N4L.PLAYING) {
                        n4l = N4L.PAUSED;
                    }
                }
                arrayList.add(N4N.L(n4n, n4l));
            }
            xlm.setValue(N4O.L(n4o, arrayList));
            return;
        }
        XLM xlm2 = this.LJLJI;
        List<N4N> list2 = n4o.LJLIL;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
        for (N4N n4n2 : list2) {
            if (o.LJ(n4n2.LJLIL.getAid(), aid)) {
                n4n2 = N4N.L(n4n2, N4L.PAUSED);
            }
            arrayList2.add(n4n2);
        }
        xlm2.setValue(N4O.L(n4o, arrayList2));
    }

    public final MusicModel hv0(int i) {
        return (MusicModel) ORZ.LJLLLLLL(i, (List) this.LJLILLLLZI.getValue());
    }
}
