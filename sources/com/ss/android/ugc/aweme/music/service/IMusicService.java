package com.ss.android.ugc.aweme.music.service;

import X.ActivityC45651qj;
import X.C10K;
import X.C56433MCv;
import X.C84917XUj;
import X.InterfaceC84870XSo;
import X.InterfaceC84903XTv;
import X.M5G;
import X.ProgressDialogC173686rk;
import X.WGG;
import X.XU2;
import X.XUG;
import X.XVD;
import X.XVG;
import X.XZ6;
import X.XZD;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.AIMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS124S0300000_7;
import kotlin.jvm.internal.AqS157S0100000_7;

/* loaded from: classes16.dex */
public interface IMusicService {
    boolean LIZ();

    int LIZIZ();

    String LIZJ(MusicModel musicModel);

    void LIZLLL();

    void LJ();

    Class<?> LJFF();

    XU2 LJI();

    void LJII(String str);

    void LJIIIIZZ(Integer num, Integer num2);

    boolean LJIIIZ();

    void LJIIJ();

    C10K LJIIJJI(int i, int i2);

    Music LJIIL(String str);

    C10K<SuggestMusicList> LJIILIIL(String str, String str2);

    C10K LJIILJJIL();

    C84917XUj LJIILL(int i, Context context, List list);

    void LJIILLIIL(Context context, C56433MCv c56433MCv, MusicModel musicModel);

    int LJIIZILJ();

    int LJIJ();

    int LJIJI();

    void LJIJJ();

    int LJIJJLI();

    void LJIL(ActivityC45651qj activityC45651qj, M5G m5g, String str);

    String LJJ(MusicModel musicModel);

    void LJJI();

    void LJJIFFI();

    List LJJII();

    C10K LJJIII(String str, String str2, int i, String str3, int i2, String str4, int i3);

    C10K LJJIIJ(int i, int i2, int i3, int i4, int i5, long j, String str, String str2, String str3, String str4);

    void LJJIIJZLJL();

    AIMusicDownloadPlayHelper LJJIIZ(XZD xzd);

    MusicModel LJJIIZI(String str);

    boolean LJJIJ(MusicModel musicModel, Context context, boolean z, boolean z2);

    void LJJIJIIJI();

    int LJJIJIIJIL();

    C10K LJJIJIL(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5);

    void LJJIJL(String str, int i, WGG wgg);

    String LJJIJLIJ(int i);

    boolean LJJIL(MusicModel musicModel, Context context, boolean z);

    C10K<String> LJJIZ(String str, String str2, int i, String str3, int i2, String str4, String str5, int i3);

    void LJJJ(Context context, MusicModel musicModel, boolean z, int i, InterfaceC84870XSo interfaceC84870XSo);

    void LJJJI();

    InterfaceC84903XTv LJJJIL();

    void LJJJJ(XVD xvd, Boolean bool, Boolean bool2);

    C10K LJJJJI(long j, int i, int i2, int i3, boolean z);

    boolean LJJJJIZL();

    CutMusicPanel LJJJJJ();

    C10K LJJJJJL(String str, int i, boolean z, int i2, int i3, String str2);

    void LJJJJL(XVD xvd, Float f, Boolean bool);

    int LJJJJLI();

    void LJJJJLL(ActivityC45651qj activityC45651qj, Object obj, Bundle bundle, AqS124S0300000_7 aqS124S0300000_7, AqS157S0100000_7 aqS157S0100000_7);

    MusicList LJJJJZ(int i, int i2, String str);

    String LJJJJZI(String str);

    void LJJJLIIL(Context context, String str, boolean z, ProgressDialogC173686rk progressDialogC173686rk, M5G m5g);

    boolean LJJJLL();

    void LJJJLZIJ(XZ6 xz6);

    void LJJJZ(String str);

    List<String> LJJL(String str);

    void LJJLI(Fragment fragment, MusicModel musicModel, XVG xvg);

    AVMusicDownloadPlayHelper LJJLIIIIJ(XUG xug);

    int LJJLIIIJ();

    Map<String, Class<?>> LJJLIIIJILLIZJL();

    C10K<BaseResponse> collectMusic(String str, int i);

    C10K<String> getAutoCutNLEModel(String str, String str2);

    long getMusicDuration(String str);

    void initService();
}
