package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C47555IlT;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import X.X1D;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class IoPreloadTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "IoPreloadTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.IO;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                String absolutePath = context.createDeviceProtectedStorageContext().getCodeCacheDir().getAbsolutePath();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(absolutePath);
                String str = File.separator;
                LIZ.append(str);
                LIZ.append("com.android.opengl.shaders_cache");
                String LIZIZ = X1D.LIZIZ(LIZ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(absolutePath);
                LIZ2.append(str);
                LIZ2.append("com.android.skia.shaders_cache");
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                C47555IlT.LIZ(LIZIZ);
                C47555IlT.LIZ(LIZIZ2);
            }
        } catch (Exception unused) {
        }
    }
}
