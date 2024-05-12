package com.ss.android.ugc.aweme.homepage.business;

import X.C0RN;
import X.C36922EeM;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.bytedance.hox.Hox;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PreloadMainTask implements EE1 {
    public final WeakReference<Hox> LJLIL;

    @Override // X.EEY
    public final String key() {
        return "PreloadMainTask";
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

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    public PreloadMainTask(Hox hox) {
        this.LJLIL = new WeakReference<>(hox);
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        Hox hox = this.LJLIL.get();
        if (hox != null) {
            try {
                hox.pv0("page_feed");
                hox.pv0("page_profile");
            } catch (Exception e) {
                C36922EeM.LJFF(e);
            }
        }
    }
}
