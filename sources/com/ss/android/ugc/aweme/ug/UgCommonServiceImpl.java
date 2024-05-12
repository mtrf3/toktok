package com.ss.android.ugc.aweme.ug;

import X.ActivityC45651qj;
import X.C10K;
import X.C19N;
import X.C38984FRs;
import X.C39333Fc9;
import X.C40365Fsn;
import X.C40367Fsp;
import X.C40370Fss;
import X.C40371Fst;
import X.C40410FtW;
import X.C40412FtY;
import X.C40413FtZ;
import X.C40415Ftb;
import X.C40425Ftl;
import X.C58096Mr6;
import X.C65352Pkq;
import X.C65776Prg;
import X.C82802Wec;
import X.CallableC39029FTl;
import X.EnumC40416Ftc;
import X.InterfaceC40375Fsx;
import X.LFH;
import X.X1D;
import Y.AgS123S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.ug.appstart.MainActivityHelperAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UgCommonServiceImpl implements IUgCommonService {
    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final C65776Prg LJ() {
        return C65352Pkq.LIZ(MainActivityHelperAssem.class);
    }

    public static IUgCommonService LJIJ() {
        Object LIZ = C58096Mr6.LIZ(IUgCommonService.class, false);
        if (LIZ != null) {
            return (IUgCommonService) LIZ;
        }
        if (C58096Mr6.N7 == null) {
            synchronized (IUgCommonService.class) {
                if (C58096Mr6.N7 == null) {
                    C58096Mr6.N7 = new UgCommonServiceImpl();
                }
            }
        }
        return C58096Mr6.N7;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LIZLLL() {
        C10K.LJII(500L).LJ(C40412FtY.LIZ, C10K.LJI, null).LJ(C40425Ftl.LIZ, C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final SQLiteDatabase LJFF() {
        if (C40370Fss.LJLJI == null) {
            synchronized (C40370Fss.class) {
                if (C40370Fss.LJLJI == null) {
                    C40370Fss.LJLJI = new C40370Fss();
                }
            }
        }
        SQLiteDatabase sQLiteDatabase = C40370Fss.LJLJI.LJLILLLLZI;
        o.LJIIIIZZ(sQLiteDatabase, "getInstance().readDB()");
        return sQLiteDatabase;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final boolean LJIIIIZZ() {
        return C19N.LJ("in_app_updates_switch", true);
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final long LJIIIZ() {
        return new C40413FtZ(EnumC40416Ftc.LIKE).LJI;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final boolean LJIIL() {
        C40365Fsn.LIZ.getClass();
        return ((Boolean) C40365Fsn.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final InterfaceC40375Fsx LJIILL() {
        if (LJIIL()) {
            return C40371Fst.LJI;
        }
        return C40367Fsp.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final C82802Wec LIZIZ() {
        return C82802Wec.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJIIJJI() {
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJIILIIL() {
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final boolean LJIILLIIL() {
        return C38984FRs.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LIZ(Context context) {
        C82802Wec.LIZ.getClass();
        C10K.LIZJ(CallableC39029FTl.LJLIL);
        LFH.LIZIZ.LIZ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LIZJ(long j) {
        C40415Ftb.LIZ += j;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJIIJ(boolean z) {
        if (z) {
            C40410FtW.LIZ = true;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(EnumC40416Ftc.LIKE);
            LIZ.append(" :into the 「thumbs-up」list,Condition is met");
            C39333Fc9.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(EnumC40416Ftc.LIKE);
        LIZ2.append(" :into the 「thumbs-up」list,But conditions not met");
        C39333Fc9.LIZ(X1D.LIZIZ(LIZ2));
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJIILJJIL(Activity activity) {
        C10K.LJII(300L).LJ(new AgS123S0100000_6(activity, 7), C10K.LJI, null).LJ(new AgS123S0100000_6(activity, 8), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void LJIIZILJ(ActivityC45651qj activityC45651qj) {
        if (C40410FtW.LIZ) {
            C40410FtW.LIZ = false;
            C10K.LJII(300L).LJ(new AgS123S0100000_6(activityC45651qj, 9), C10K.LJI, null).LJ(new AgS123S0100000_6(activityC45651qj, 10), C10K.LJIIIIZZ, null);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EnumC40416Ftc.LIKE);
        LIZ.append(" :conditions not met or not return from 「thumbs-up」list");
        C39333Fc9.LIZ(X1D.LIZIZ(LIZ));
        if (activityC45651qj == null) {
            return;
        }
        NoticeServiceImpl.LJJJJJ().LJJ(activityC45651qj);
    }
}
