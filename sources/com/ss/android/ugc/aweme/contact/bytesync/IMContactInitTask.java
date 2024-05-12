package com.ss.android.ugc.aweme.contact.bytesync;

import X.AbstractC73672Svk;
import X.C0RN;
import X.C3GQ;
import X.C3GR;
import X.C73411SrX;
import X.C73969T1h;
import X.C85913Yt;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC64592gB;
import X.InterfaceC67072QUa;
import X.InterfaceC86003Zc;
import X.LHU;
import X.T16;
import Y.ARunnableS20S0200000_1;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.contact.experiment.IMContactSetting;
import com.ss.android.ugc.aweme.contact.model.IMContactEvent;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMContactInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "IMContactInitTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        C85913Yt.LIZ.getClass();
        C85913Yt.LJFF = 0L;
        C85913Yt.LJI = 0;
        C85913Yt.LJIIIIZZ = (C73411SrX) AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.3ZF
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<Object> interfaceC73573Su9) {
                C85913Yt.LJII = interfaceC73573Su9;
            }
        }).LJIIJJI(((Number) C85913Yt.LIZLLL.getValue()).longValue(), TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.3GO
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                if (C85913Yt.LJFF > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - C85913Yt.LJFF;
                    C85913Yt.LIZ.getClass();
                    C3GS.LIZ(currentTimeMillis - (((Number) C85913Yt.LIZLLL.getValue()).longValue() * 1000), 0, C85913Yt.LJI);
                    C85913Yt.LJFF = 0L;
                }
            }
        }, new InterfaceC64592gB() { // from class: X.3GP
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C85913Yt.LJFF = 0L;
                C85913Yt.LJI = 0;
            }
        });
        LHU lhu = LHU.LIZIZ;
        C3GQ.LIZ().getClass();
        lhu.LIZ(C3GR.IM_CONTACT_SYNC_UID, new InterfaceC67072QUa() { // from class: X.2vu
            @Override // X.InterfaceC67072QUa
            public final void LIZ(C67074QUc c67074QUc) {
                byte[] bArr;
                Activity topActivity;
                if (c67074QUc != null && (bArr = c67074QUc.LIZ) != null) {
                    try {
                        IMContactEvent iMContactEvent = (IMContactEvent) C75792yF.LIZ(new String(bArr, PVC.LIZ), IMContactEvent.class);
                        C85913Yt.LIZ.getClass();
                        XKX.LIZLLL(C85913Yt.LIZIZ, null, null, new C85923Yu(iMContactEvent, null), 3);
                        if (IMContactSetting.LIZ().debugTool && o.LJ(EF7.LJIILIIL, "local_test") && (topActivity = ActivityStack.getTopActivity()) != null) {
                            topActivity.runOnUiThread(new ARunnableS20S0200000_1(topActivity, bArr, 7));
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        });
    }
}
