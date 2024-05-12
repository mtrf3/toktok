package com.ss.android.ugc.aweme.commerce.tools.sticker.service;

import X.C29S;
import X.C42484Gls;
import X.C43284Gym;
import X.C72856Sia;
import X.GF4;
import X.HCA;
import X.I9V;
import X.InterfaceC153045zY;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEStickerHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;

/* loaded from: classes8.dex */
public interface ICommerceToolsStickerService {
    C42484Gls LIZ(GF4 gf4);

    boolean LIZIZ(VideoPublishEditModel videoPublishEditModel);

    boolean LIZJ(HCA hca);

    void LIZLLL(InterfaceC153045zY interfaceC153045zY, VideoPublishEditModel videoPublishEditModel);

    void LJ(ShortVideoContext shortVideoContext);

    void LJFF(String str);

    void LJI(ShortVideoContext shortVideoContext, boolean z, String str, String str2, Boolean bool);

    C72856Sia LJII(ShortVideoContext shortVideoContext, C43284Gym c43284Gym, List list);

    IBEStickerHandler LJIIIIZZ(C29S c29s, ShortVideoContext shortVideoContext);

    void LJIIIZ(String str);

    I9V LJIIJ(C29S c29s, AqS157S0100000_7 aqS157S0100000_7, ShortVideoContext shortVideoContext);

    void LJIIJJI(ShortVideoContext shortVideoContext, Effect effect, boolean z, boolean z2);
}
