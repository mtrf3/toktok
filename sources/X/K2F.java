package X;

import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K2F implements InterfaceC57784Mm4 {
    public final MusicSearchHistory LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public K2F(MusicSearchHistory history) {
        o.LJIIIZ(history, "history");
        this.LJLIL = history;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof K2F) {
            return o.LJ(this.LJLIL.keyword, ((K2F) interfaceC57784Mm4).LJLIL.keyword);
        }
        return false;
    }
}
