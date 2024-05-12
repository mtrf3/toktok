package com.ss.android.ugc.aweme.port.in;

import X.ActivityC45651qj;
import X.C149835uN;
import X.C82622Wbi;
import X.HNP;
import X.HNW;
import X.InterfaceC149485to;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.ProgressDialogC173686rk;
import X.V1K;
import X.XZI;
import android.content.Context;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;

/* loaded from: classes8.dex */
public interface IAnotherMusicService extends HNW {
    boolean LIZ();

    String LIZIZ(String str);

    void LJ();

    Class<?> LJFF();

    void LJI(ActivityC45651qj activityC45651qj, NavigationScene navigationScene, V1K v1k, AqS138S0200000_7 aqS138S0200000_7, AqS157S0100000_7 aqS157S0100000_7, AqS157S0100000_7 aqS157S0100000_72);

    MusicWaveBean LJIIIZ(AVMusicWaveBean aVMusicWaveBean);

    void LJIIJ();

    AVMusicWaveBean LJIIL(Serializable serializable);

    boolean LJIILIIL();

    void LJIILJJIL();

    MusicModel LJIILLIIL(AVMusic aVMusic);

    void LJIIZILJ();

    AVChallenge LJIJ(Challenge challenge);

    void LJIJI();

    void LJIL();

    void LJJI();

    boolean LJJIFFI(String str);

    void LJJII(Integer num);

    C149835uN LJJIII(InterfaceC149485to interfaceC149485to);

    void LJJIIJ(ActivityC45651qj activityC45651qj, V1K v1k, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro);

    AVMusic LJJIIJZLJL(String str);

    VerticalMusicView LJJIIZ(C82622Wbi c82622Wbi, XZI xzi);

    List<AVMusic> LJJIIZI(int i, String str);

    void LJJIJ(Context context, String str, boolean z, ProgressDialogC173686rk progressDialogC173686rk, HNP hnp);

    int getMusicDuration(String str);

    UrlModel getMusicModelAudioTrack(Object obj);

    boolean isMusicTypeLocal(int i);

    AVMusic transformMusicModel(MusicModel musicModel);
}
