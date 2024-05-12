package com.ss.android.ugc.aweme;

import X.ActivityC45651qj;
import X.EE1;
import X.InterfaceC57784Mm4;
import X.OSZ;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.core.viewmodel.task.SearchWidgetTask;
import com.ss.android.ugc.aweme.story.SocialWidgetLegoTask;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes10.dex */
public interface IAppWidgetService {
    boolean LIZ();

    void LIZIZ(Context context);

    OSZ<InterfaceC57784Mm4, Boolean> LIZJ();

    List<EE1> LIZLLL();

    boolean LJ(ActivityC45651qj activityC45651qj);

    boolean LJFF(Context context);

    boolean LJI(Context context);

    OSZ<List<InterfaceC57784Mm4>, Boolean> LJII(List<InterfaceC57784Mm4> list);

    SocialWidgetLegoTask LJIIIIZZ();

    Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] LJIIIZ();

    Intent LJIIJ(Context context, String str);

    OSZ<List<InterfaceC57784Mm4>, Boolean> LJIIJJI(List<? extends InterfaceC57784Mm4> list);

    boolean LJIIL(Context context);

    boolean LJIILIIL(Context context);

    SearchWidgetTask LJIILJJIL();

    boolean LJIILL(Context context);

    void LJIILLIIL(Context context);

    void LJIIZILJ(Bitmap bitmap, int[] iArr, boolean z, float f, AqS169S0100000_3 aqS169S0100000_3);

    Map<String, String> LJIJ();

    void getLauncherIconRes();
}
