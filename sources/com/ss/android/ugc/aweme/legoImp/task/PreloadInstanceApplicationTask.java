package com.ss.android.ugc.aweme.legoImp.task;

import X.C16880lQ;
import X.C34597Dhx;
import X.C34710Djm;
import X.C45337Hqn;
import X.C47636Imm;
import X.C61017Nx7;
import X.C88034Ygo;
import X.FMP;
import X.LHM;
import android.content.Context;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.userservice.UserService;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class PreloadInstanceApplicationTask extends PreloadInstanceTask {
    @Override // X.EEY
    public final String key() {
        return "PreloadInstanceApplicationTask";
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        if (((Boolean) C88034Ygo.LIZJ.getValue()).booleanValue()) {
            FMP.LIZIZ.getValue();
        }
        if (((Boolean) C88034Ygo.LJ.getValue()).booleanValue()) {
        }
        if (((Boolean) C88034Ygo.LJIIIZ.getValue()).booleanValue()) {
            a.LJFF().LJIIIIZZ();
        }
        C47636Imm.LJII(2);
        try {
            C16880lQ.LLILL(context, "audio");
            C16880lQ.LLILL(context, "activity");
        } catch (Exception unused) {
        }
        C61017Nx7.LIZ();
        UgCommonServiceImpl.LJIJ().LJIILLIIL();
        if (!((Boolean) C34710Djm.LJIJI.getValue()).booleanValue()) {
            UserService.LIZ();
        }
        if (((Boolean) C34597Dhx.LIZIZ.getValue()).booleanValue()) {
            C45337Hqn.LIZIZ = LHM.LIZIZ.LIZ().shouldInitSocial2Tab();
            C45337Hqn.LIZ = true;
        }
    }
}
