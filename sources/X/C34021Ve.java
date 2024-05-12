package X;

import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* renamed from: X.1Ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34021Ve extends AbstractC17350mB {
    public final List<MusicSong> LIZ;
    public final List<MusicSong> LIZIZ;
    public final boolean LIZJ;

    public C34021Ve() {
        throw null;
    }

    public C34021Ve(List newList, List list, boolean z, int i) {
        list = (i & 2) != 0 ? null : list;
        z = (i & 4) != 0 ? false : z;
        o.LJIIIZ(newList, "newList");
        this.LIZ = newList;
        this.LIZIZ = list;
        this.LIZJ = z;
    }
}
