package X;

import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* renamed from: X.1Ti, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33541Ti extends F9E {
    public final List<MusicSong> LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C33541Ti(List<MusicSong> songs, boolean z) {
        o.LJIIIZ(songs, "songs");
        this.LJLIL = songs;
        this.LJLILLLLZI = z;
    }
}
