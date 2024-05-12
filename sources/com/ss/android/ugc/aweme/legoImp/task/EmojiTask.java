package com.ss.android.ugc.aweme.legoImp.task;

import X.AnonymousClass085;
import X.C0RN;
import X.C28721Au;
import X.C35478DwA;
import X.C88024Yge;
import X.DPI;
import X.DS1;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import androidx.emoji2.text.f;
import java.util.List;

/* loaded from: classes2.dex */
public final class EmojiTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "EmojiTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
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
        if (!DPI.LIZ() ? ((Boolean) C88024Yge.LIZIZ.getValue()).booleanValue() : !(!C35478DwA.LIZIZ() || !DS1.LIZ())) {
            return EFK.BOOT_FINISH;
        }
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C28721Au LIZ;
        if (context != null && (LIZ = AnonymousClass085.LIZ(context)) != null && f.LJIIIZ == null) {
            synchronized (f.LJIIIIZZ) {
                if (f.LJIIIZ == null) {
                    f.LJIIIZ = new f(LIZ);
                }
            }
        }
    }
}
