package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C47766Ios;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.services.MainServiceForJsb;
import java.util.List;

/* loaded from: classes7.dex */
public class SetupMainServiceForJsb implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "SetupMainServiceForJsb";
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
        return 16777215;
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

    @Override // X.EE1
    public final EFK type() {
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        MainServiceForJsb mainServiceForJsb = new MainServiceForJsb();
        synchronized (C47766Ios.class) {
            C47766Ios c47766Ios = C47766Ios.LIZIZ;
            if (c47766Ios == null) {
                C47766Ios.LIZIZ = new C47766Ios(mainServiceForJsb);
            } else {
                c47766Ios.LIZ = mainServiceForJsb;
            }
        }
    }
}
