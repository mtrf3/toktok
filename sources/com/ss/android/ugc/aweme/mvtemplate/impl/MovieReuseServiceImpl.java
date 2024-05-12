package com.ss.android.ugc.aweme.mvtemplate.impl;

import X.AbstractC50421Jqb;
import X.AbstractC51036K1g;
import X.ActivityC86117Xqz;
import X.C1YZ;
import X.C44032HPw;
import X.C51031K1b;
import X.C58096Mr6;
import X.C62119OZn;
import X.C8BL;
import X.C8BP;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MovieReuseServiceImpl implements IMovieReuseService {
    public static IMovieReuseService LJ() {
        Object LIZ = C58096Mr6.LIZ(IMovieReuseService.class, false);
        if (LIZ != null) {
            return (IMovieReuseService) LIZ;
        }
        if (C58096Mr6.i3 == null) {
            synchronized (IMovieReuseService.class) {
                if (C58096Mr6.i3 == null) {
                    C58096Mr6.i3 = new MovieReuseServiceImpl();
                }
            }
        }
        return C58096Mr6.i3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8BP] */
    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final C8BP LIZJ(AbstractC51036K1g abstractC51036K1g) {
        return new AbstractC50421Jqb<C8BL, C51031K1b<C8BL>>(abstractC51036K1g) { // from class: X.8BP
            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final int getPageType(int i) {
                return i + 11000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
            {
                this.mModel = (!(abstractC51036K1g instanceof C8BL) || abstractC51036K1g == null) ? new C8BL() : abstractC51036K1g;
                this.mPresenter = new C51031K1b();
            }

            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final void request(int i, M89 feedParam, int i2, boolean z) {
                o.LJIIIZ(feedParam, "feedParam");
                this.mPresenter.LJIILL(Integer.valueOf(i), feedParam.getMvId(), Integer.valueOf(feedParam.getVideoType()));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final void LIZ(String objectId, ActivityC86117Xqz activity, C1YZ c1yz) {
        o.LJIIIZ(objectId, "objectId");
        o.LJIIIZ(activity, "activity");
        C44032HPw c44032HPw = new C44032HPw(activity, 3);
        c44032HPw.LJ = false;
        c44032HPw.LJII = new C62119OZn(c1yz);
        c44032HPw.LIZ(1, 1, objectId, "scan", "scan", false);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final void LIZIZ(Fragment fragment, String str, int i, int i2, boolean z) {
        o.LJIIIZ(fragment, "fragment");
        if (str == null || !AVExternalServiceImpl.LIZ().publishService().checkIsAlreadyPublished(fragment.getContext())) {
            return;
        }
        new C44032HPw(fragment.getContext()).LIZ(i2, Integer.valueOf(i), str, "mv_page", "mv_page", z);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final void LIZLLL(Context context, Integer num, String str, Integer num2, String str2, String str3, int i, boolean z) {
        o.LJIIIZ(context, "context");
        new C44032HPw(context, num).LIZ(i, num2, str, str2, str3, z);
    }
}
