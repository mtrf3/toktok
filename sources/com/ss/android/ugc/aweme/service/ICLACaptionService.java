package com.ss.android.ugc.aweme.service;

import X.ActivityC45651qj;
import X.C224048qm;
import X.C245649kW;
import X.C65776Prg;
import X.C86775Y3v;
import X.EnumC86777Y3x;
import X.InterfaceC46330IGg;
import X.InterfaceC55235Lm3;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ProgressDragHintViewModel;
import com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;

/* loaded from: classes16.dex */
public interface ICLACaptionService {
    FeedCaptionView LIZ(Context context, C245649kW c245649kW, InteractStickerStruct interactStickerStruct, C224048qm c224048qm, Aweme aweme, InterfaceC55235Lm3 interfaceC55235Lm3);

    boolean LIZIZ(Aweme aweme);

    boolean LIZJ(Aweme aweme);

    ProgressDragHintViewModel LIZLLL(ActivityC45651qj activityC45651qj);

    C65776Prg LJ();

    boolean LJFF(Aweme aweme);

    void LJI(ActivityC45651qj activityC45651qj, View view, InterfaceC46330IGg interfaceC46330IGg);

    void LJII(Context context, String str, EnumC86777Y3x enumC86777Y3x, Aweme aweme, boolean z, Long l);

    boolean LJIIIIZZ(Aweme aweme);

    C65776Prg LJIIIZ();

    ProgressDragHintViewModel LJIIJ(ActivityC45651qj activityC45651qj);

    void LJIIJJI(ActivityC45651qj activityC45651qj);

    void LJIIL(C86775Y3v c86775Y3v, boolean z);
}
