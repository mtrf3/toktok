package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import X.C0RN;
import X.C10K;
import X.C36922EeM;
import X.C79004UzY;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import X.NPQ;
import X.NPR;
import X.NW6;
import Y.ACallableS87S0200000_10;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class TopViewPreloadTask implements EE1, InterfaceC36076EDw {
    public final List<Aweme> LJLIL;

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "TopViewPreloadTask";
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
    public final int priority() {
        return 2;
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

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    public TopViewPreloadTask(List<Aweme> list) {
        this.LJLIL = list;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C36922EeM.LJ("AwesomeSplashPreloadTask");
        NPQ LIZIZ = NPQ.LIZIZ();
        List<Aweme> list = this.LJLIL;
        LIZIZ.getClass();
        NW6.LIZ().LJII();
        if (NPQ.LIZJ()) {
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                NPQ.LJ(it.next(), NPR.LOW_DEVICE);
            }
        } else {
            if (C79004UzY.LJJIFFI(list)) {
                return;
            }
            C10K.LIZJ(new ACallableS87S0200000_10(LIZIZ, list, context, 2));
        }
    }
}
