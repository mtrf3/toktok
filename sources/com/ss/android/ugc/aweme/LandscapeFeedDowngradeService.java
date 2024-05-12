package com.ss.android.ugc.aweme;

import X.C3C8;
import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeFeedDowngradeService implements ILandscapeFeedService {
    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZLLL(Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJ(Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJFF() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJI(int i, Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJII(ReusedUIAssem<? extends C3C8> reusedUIAssem, int i, Aweme aweme) {
        o.LJIIIZ(reusedUIAssem, "reusedUIAssem");
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJIIIIZZ(Assembler assembler, InteractAreaComponent reusedUIAssem) {
        o.LJIIIZ(assembler, "assembler");
        o.LJIIIZ(reusedUIAssem, "reusedUIAssem");
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIIIZ(int i, Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIIJ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        return false;
    }
}
