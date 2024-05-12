package com.ss.android.ugc.aweme.story;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.GZP;
import X.InterfaceC182707Fa;
import X.InterfaceC184277Lb;
import X.InterfaceC222068na;
import X.InterfaceC54392LWi;
import X.InterfaceC54401LWr;
import X.InterfaceC54795Lex;
import X.InterfaceC54804Lf6;
import X.InterfaceC55036Liq;
import X.L24;
import X.MFL;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.model.SwitchToStoryResponse;

/* loaded from: classes10.dex */
public interface IStoryService {
    IStoryInboxService LIZ();

    Video LIZIZ(String str);

    void LIZJ();

    void LIZLLL(Context context, EnterStoryParam enterStoryParam);

    L24 LJ();

    void LJFF(int i);

    boolean LJI(Fragment fragment, Aweme aweme);

    GZP LJII();

    InterfaceC184277Lb LJIIIIZZ();

    InterfaceC54804Lf6 LJIIIZ(Context context);

    boolean LJIIJ();

    boolean LJIIJJI();

    void LJIIL(ActivityC45651qj activityC45651qj, String str, Aweme aweme);

    InterfaceC55036Liq LJIILIIL();

    InterfaceC54401LWr LJIILJJIL();

    MFL LJIILL();

    void LJIILLIIL(Video video, String str);

    InterfaceC182707Fa LJIIZILJ();

    InterfaceC222068na LJIJ();

    boolean LJIJI();

    InterfaceC54392LWi LJIJJ();

    void LJIJJLI(Aweme aweme, String str);

    InterfaceC54795Lex LJIL();

    void LJJ(String str);

    void clear();

    int getTag();

    AbstractC73672Svk<SwitchToStoryResponse> switchStoryToNormal(String str);
}
