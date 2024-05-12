package com.ss.android.legoimpl;

import X.C0RN;
import X.C16950lX;
import X.C16970lZ;
import X.C16980la;
import X.C16990lb;
import X.C1VC;
import X.C35183DrP;
import X.C39057FUn;
import X.C62822Ol8;
import X.C78598Ut0;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FEV;
import X.FOP;
import X.FOR;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class InitAndInflaterTask implements EE1 {
    public static final Random LJLIL = new Random();

    @Override // X.EEY
    public final String key() {
        return "InitAndInflaterTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    public static boolean LIZLLL() {
        if (C16970lZ.LIZ.LJI || LJLIL.nextFloat() < 0.005f) {
            return true;
        }
        return false;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        System.currentTimeMillis();
        C16980la c16980la = new C16980la();
        c16980la.LJ = true;
        c16980la.LIZJ = true;
        C16950lX.LIZIZ = true;
        c16980la.LIZLLL = false;
        int i = FEV.LIZJ;
        c16980la.LIZ = i;
        if (i < 1 || i > 8) {
            c16980la.LIZ = 1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24 && i2 <= 27) {
            c16980la.LIZ = 1;
        }
        C62822Ol8 c62822Ol8 = C35183DrP.LIZIZ;
        c16980la.LJFF = ((Boolean) c62822Ol8.getValue()).booleanValue();
        c16980la.LJI = false;
        c16980la.LIZIZ = R.style.ul;
        FOP fop = new FOP();
        C16950lX.LIZ = new C1VC(fop);
        C39057FUn.LIZIZ = fop;
        C16990lb c16990lb = new C16990lb(c16980la);
        if (context instanceof Application) {
            C16970lZ.LIZ = c16990lb;
            o.LJIIJ(context, "context");
            C39057FUn.LIZ = context;
            C78598Ut0.LJLJI = c16990lb.LJI;
            if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
                FOR.LJFF.LIZ();
                return;
            }
            return;
        }
        throw new IllegalStateException("context must be application");
    }
}
