package com.ss.android.ugc.aweme;

import X.C3C8;
import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;

/* loaded from: classes4.dex */
public interface ILandscapeFeedService {
    boolean LIZJ(Activity activity);

    boolean LIZLLL(Aweme aweme);

    boolean LJ(Aweme aweme);

    boolean LJFF();

    boolean LJI(int i, Aweme aweme);

    void LJII(ReusedUIAssem<? extends C3C8> reusedUIAssem, int i, Aweme aweme);

    void LJIIIIZZ(Assembler assembler, InteractAreaComponent interactAreaComponent);

    boolean LJIIIZ(int i, Aweme aweme);

    boolean LJIIJ(Context context, Aweme aweme);
}
