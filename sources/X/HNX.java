package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HNX extends AbstractC65781Prl implements InterfaceC88472Yns<String, String> {
    public static final HNX LJLIL = new HNX();

    public HNX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(String str) {
        String musicPath = str;
        o.LJIIIZ(musicPath, "musicPath");
        String rhythmMusicFilePath = C60903NvH.LJIIJJI().LJJIJ().getRhythmMusicFilePath(musicPath);
        if (C1B6.LIZIZ(rhythmMusicFilePath)) {
            return rhythmMusicFilePath;
        }
        return "";
    }
}
