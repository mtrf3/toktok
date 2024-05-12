package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes8.dex */
public interface HNW {
    String LIZJ(MusicModel musicModel);

    void LIZLLL();

    void LJII(String str);

    MusicModel LJIIIIZZ(AVMusic aVMusic);

    String LJIIJJI(AVMusic aVMusic);

    void LJIILL(Context context, AVMusic aVMusic, int i, boolean z, InterfaceC84897XTp interfaceC84897XTp);

    boolean LJIJJ(AVMusic aVMusic, Context context);

    void LJIJJLI();

    String LJJ(AVMusic aVMusic);

    String getCacheDir();

    String getDownloadDir();

    String getRhythmMusicFilePath(String str);

    void requestMusic(String str, InterfaceC84907XTz interfaceC84907XTz);

    AVMusic transformNewAVMusic(String str);
}
