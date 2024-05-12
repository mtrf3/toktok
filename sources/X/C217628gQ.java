package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.ILandscapeFeedService;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.8gQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217628gQ implements ILandscapeFeedService {
    public static final C217628gQ LIZIZ = new C217628gQ();
    public final /* synthetic */ ILandscapeFeedService LIZ;

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.LIZJ(activity);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZLLL(Aweme aweme) {
        return this.LIZ.LIZLLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJ(Aweme aweme) {
        return this.LIZ.LJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJI(int i, Aweme aweme) {
        return this.LIZ.LJI(i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJII(ReusedUIAssem<? extends C3C8> reusedUIAssem, int i, Aweme aweme) {
        o.LJIIIZ(reusedUIAssem, "reusedUIAssem");
        this.LIZ.LJII(reusedUIAssem, i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJIIIIZZ(Assembler assembler, InteractAreaComponent reusedUIAssem) {
        o.LJIIIZ(assembler, "assembler");
        o.LJIIIZ(reusedUIAssem, "reusedUIAssem");
        this.LIZ.LJIIIIZZ(assembler, reusedUIAssem);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIIIZ(int i, Aweme aweme) {
        return this.LIZ.LJIIIZ(i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIIJ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LJIIJ(context, aweme);
    }

    public C217628gQ() {
        ILandscapeFeedService iLandscapeFeedService;
        Object LIZ = C58096Mr6.LIZ(ILandscapeFeedService.class, false);
        if (LIZ != null) {
            iLandscapeFeedService = (ILandscapeFeedService) LIZ;
        } else {
            if (C58096Mr6.I0 == null) {
                synchronized (ILandscapeFeedService.class) {
                    if (C58096Mr6.I0 == null) {
                        C58096Mr6.I0 = new LandscapeFeedServiceImpl();
                    }
                }
            }
            iLandscapeFeedService = C58096Mr6.I0;
        }
        this.LIZ = iLandscapeFeedService;
    }
}
