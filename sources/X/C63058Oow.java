package X;

import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Oow, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63058Oow extends F9E implements InterfaceC57784Mm4 {
    public final ExternalMusicInfo LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C63058Oow(ExternalMusicInfo musicInfo, boolean z) {
        o.LJIIIZ(musicInfo, "musicInfo");
        this.LJLIL = musicInfo;
        this.LJLILLLLZI = z;
    }
}
