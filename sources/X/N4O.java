package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N4O extends F9E {
    public final List<N4N> LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public N4O(List<N4N> videoStates, String str) {
        o.LJIIIZ(videoStates, "videoStates");
        this.LJLIL = videoStates;
        this.LJLILLLLZI = str;
    }

    public static N4O L(N4O n4o, List list) {
        String bannedMusicTitle = n4o.LJLILLLLZI;
        n4o.getClass();
        o.LJIIIZ(bannedMusicTitle, "bannedMusicTitle");
        return new N4O(list, bannedMusicTitle);
    }
}
