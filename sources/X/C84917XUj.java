package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XUj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84917XUj implements C5L2 {
    public final List<MusicModel> LIZ;
    public final int LIZIZ;
    public final ExecutorService LIZJ;
    public int LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;

    public final void LIZ() {
        int size = this.LIZ.size();
        int i = this.LIZLLL;
        if (size <= i || i >= this.LIZIZ) {
            return;
        }
        C43045Guv.LIZ(this.LIZJ, new AqS165S0100000_15(this, 893));
    }

    public C84917XUj(int i, Context context, List musicList) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(musicList, "musicList");
        this.LIZ = musicList;
        this.LIZIZ = i;
        this.LIZJ = C16880lQ.LLLLZLLIL();
        this.LJ = C221108m2.LIZIZ(new AqS165S0100000_15(context, 894));
        this.LJFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 892));
    }
}
