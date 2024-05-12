package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GoX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42649GoX extends AbstractC65781Prl implements InterfaceC88472Yns<MusicModel, MusicBuzModel> {
    public static final C42649GoX LJLIL = new C42649GoX();

    public C42649GoX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final MusicBuzModel invoke(MusicModel musicModel) {
        MusicModel musicModel2 = musicModel;
        o.LJIIIZ(musicModel2, "musicModel");
        MusicBuzModel musicBuzModel = new MusicBuzModel(false, null, null, 0.0f, false, null, null, null, false, null, 0.0f, null, null, false, null, null, 0, 0, false, false, 0L, 0, null, null, null, 0, 0, 0, 0, null, null, null, false, null, null, false, false, null, false, false, null, 0, null, 0, 0, 0, null, false, 0, 0, 0, null, 0, 0, null, null, null, false, null, null, -1, 268435455, null);
        MusicBeanUtilKt.updateAVMusic(musicBuzModel, C78934UyQ.LJLIL.getMusicService().transformMusicModel(musicModel2));
        return musicBuzModel;
    }
}
