package com.ss.android.ugc.aweme.utils;

import X.C0RN;
import X.C34710Djm;
import X.C36713Eaz;
import X.C36717Eb3;
import X.C36725EbB;
import X.C60903NvH;
import X.EE1;
import X.EFK;
import X.EUG;
import X.EWF;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F8X;
import X.X1D;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes7.dex */
public class DeadSystemExceptionTask implements EE1 {
    public static final DeadSystemExceptionTask LJLIL = new DeadSystemExceptionTask();

    @Override // X.EEY
    public final String key() {
        return "DeadSystemExceptionTask";
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

    @Override // X.EE1
    public final EFK type() {
        if (((Boolean) C34710Djm.LJFF.getValue()).booleanValue()) {
            return EFK.BACKGROUND;
        }
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (context != null && (context instanceof Application)) {
            C36717Eb3 c36717Eb3 = new C36717Eb3();
            try {
                Class<?> cls = Class.forName("android.hardware.display.DisplayManagerGlobal");
                Object obj = EWF.LIZ(cls, "sInstance").get(null);
                Field LIZ = EWF.LIZ(cls, "mDm");
                Object obj2 = LIZ.get(obj);
                c36717Eb3.LIZLLL = true;
                c36717Eb3.LIZIZ = obj2;
                LIZ.set(obj, C60903NvH.LJII(obj2, c36717Eb3));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("mDm is ");
                LIZ2.append(LIZ.get(obj).getClass().getName());
                X1D.LIZIZ(LIZ2);
                F8X.LIZ();
            } catch (Exception unused) {
            }
            if (Build.VERSION.SDK_INT >= 29) {
                new C36725EbB().LIZ((Application) context);
                new C36713Eaz().LJ();
            }
            Npth.setAttachUserData(new EUG(), CrashType.ALL);
        }
    }
}
