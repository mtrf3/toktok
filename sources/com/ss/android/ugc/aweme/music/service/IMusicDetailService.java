package com.ss.android.ugc.aweme.music.service;

import X.AKT;
import X.ActivityC45651qj;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.MusicInfo;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Map;

/* loaded from: classes10.dex */
public interface IMusicDetailService {
    void LIZ();

    void LIZIZ(Fragment fragment, InterfaceC88472Yns<? super AKT, C76800UCe> interfaceC88472Yns);

    void LIZJ(String str);

    void LIZLLL(String str, String str2);

    void LJ(String str, String str2);

    void LJFF(LifecycleOwner lifecycleOwner, Activity activity, MusicModel musicModel, String str, String str2, int i, boolean z, String str3, String str4, boolean z2, String str5, String str6);

    void LJI(Aweme aweme);

    void LJII();

    MusicDetailFragment LJIIIIZZ(Intent intent);

    void LJIIIZ();

    boolean LJIIJ(Aweme aweme);

    void LJIIJJI();

    int LJIIL();

    void LJIILIIL(LifecycleOwner lifecycleOwner, ActivityC45651qj activityC45651qj, MusicModel musicModel, String str, String str2);

    void LJIILJJIL(String str, String str2, String str3, String str4, Map map, boolean z);

    void LJIILL(String str);

    void LJIILLIIL(String str, String str2, String str3, String str4, Map map, boolean z);

    void LJIIZILJ();

    void LJIJ(FragmentManager fragmentManager, MusicInfo musicInfo, String str, String str2, String str3);

    MusicInfo LJIJI(Aweme aweme);
}
