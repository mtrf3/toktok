package com.ss.android.ugc.aweme.legoImp.task;

import X.C0NB;
import X.C0RN;
import X.C221108m2;
import X.C33758DMs;
import X.C35154Dqw;
import X.C52642KlK;
import X.C52643KlL;
import X.C55902Lwo;
import X.C62822Ol8;
import X.C66930QOo;
import X.C67128QWe;
import X.C86393XvR;
import X.C86550Xxy;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC66933QOr;
import X.InterfaceC36076EDw;
import X.InterfaceC66944QPc;
import X.InterfaceC67145QWv;
import X.LQM;
import X.LZI;
import X.LZJ;
import X.LZK;
import X.QWY;
import android.content.Context;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class LiveBootFinishSettingTask implements EE1, InterfaceC36076EDw, InterfaceC67145QWv, InterfaceC66944QPc {
    public boolean LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C52643KlL.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C52642KlK.LJLIL);

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "LiveBootFinishSettingTask";
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
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.InterfaceC66944QPc
    public final void LIZLLL(LZK lzk) {
        C66930QOo c66930QOo = lzk.LIZ;
        if (c66930QOo != null) {
            LJII(c66930QOo, lzk.LIZIZ);
        }
    }

    public final void LJ(boolean z) {
        EnumC66933QOr enumC66933QOr;
        if (!((Boolean) this.LJLILLLLZI.getValue()).booleanValue() || !this.LJLIL || !BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin()) {
            return;
        }
        if (C35154Dqw.LIZ()) {
            enumC66933QOr = C67128QWe.LIZIZ.getState();
        } else {
            enumC66933QOr = QWY.LJIIIZ.LIZ().LIZLLL;
        }
        if (EnumC66933QOr.CONNECTED == enumC66933QOr) {
            this.LJLIL = false;
            LiveOuterService.LJJJLL().LJJIJIL();
            C86393XvR.LLF("cold_start", new LZJ());
        } else if (z) {
            if (C35154Dqw.LIZ()) {
                C67128QWe.LIZIZ.LJIIIIZZ(this);
            } else {
                QWY.LJIIIZ.LIZ().LIZJ(this);
            }
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        LiveOuterService.LJJJLL().LJJJJLL(!((Boolean) C33758DMs.LIZ.getValue()).booleanValue()).getClass();
        try {
            LQM.LJII();
            C55902Lwo.LJIIIIZZ();
        } catch (Exception e) {
            C0NB.LJI("TopLiveService", e);
        }
        if (((Boolean) this.LJLILLLLZI.getValue()).booleanValue()) {
            C86550Xxy.LIZIZ.LJIIIIZZ(new LZI(this), null);
        }
    }

    @Override // X.InterfaceC67145QWv
    public final void LJII(C66930QOo connectEvent, JSONObject jSONObject) {
        o.LJIIIZ(connectEvent, "connectEvent");
        if (EnumC66933QOr.CONNECTED == connectEvent.LIZIZ) {
            LJ(false);
        }
    }
}
