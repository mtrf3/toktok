package com.ss.android.ugc.aweme;

import X.ActivityC45651qj;
import X.C10K;
import X.C16880lQ;
import X.C40322Fs6;
import X.C40406FtS;
import X.C54254LRa;
import X.C58096Mr6;
import X.LV0;
import Y.ACallableS41S0000000_6;
import Y.ARunnableS15S0101000_11;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes7.dex */
public class UgAllServiceImpl implements IUgAllService {
    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LJIIJ() {
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LJIIL() {
    }

    public static IUgAllService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IUgAllService.class, false);
        if (LIZ != null) {
            return (IUgAllService) LIZ;
        }
        if (C58096Mr6.LJJLJ == null) {
            synchronized (IUgAllService.class) {
                if (C58096Mr6.LJJLJ == null) {
                    C58096Mr6.LJJLJ = new UgAllServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJLJ;
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LJ() {
        C10K.LIZIZ(new ACallableS41S0000000_6(10), C10K.LJI, null);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LJIIJJI() {
        C40406FtS.LIZ.LIZIZ = false;
        ContentLanguageGuideServiceImpl.LIZIZ().onFeedStop();
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LIZIZ(Context context) {
        C40322Fs6.LIZLLL(context);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final boolean LIZJ(Context context) {
        return C40322Fs6.LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LJI(Context context) {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS15S0101000_11(context, 0, 13));
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LJIIIZ(Context context) {
        ContentLanguageGuideServiceImpl.LIZIZ().LJI(context);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LIZLLL(ActivityC45651qj activityC45651qj, Aweme aweme) {
        ContentLanguageGuideServiceImpl.LIZIZ().LJIIIZ(activityC45651qj, aweme);
    }

    @Override // com.ss.android.ugc.aweme.IUgAllService
    public final void LJIIIIZZ(Context context, String str) {
        C54254LRa.LIZLLL = true;
        LV0.LJII.getClass();
        LV0.LIZLLL(context, str);
    }
}
