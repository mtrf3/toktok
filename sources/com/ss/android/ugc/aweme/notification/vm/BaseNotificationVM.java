package com.ss.android.ugc.aweme.notification.vm;

import X.C221108m2;
import X.C56702MNe;
import X.C56732MOi;
import X.C56776MQa;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C76800UCe;
import X.EnumC56648MLc;
import X.InterfaceC56771MPv;
import X.InterfaceC65784Pro;
import X.MDT;
import X.MPB;
import X.MQB;
import X.MQY;
import X.MQZ;
import X.MR1;
import X.MR2;
import X.MWH;
import X.OSZ;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class BaseNotificationVM extends ViewModel implements InterfaceC56771MPv {
    public boolean LJLJLJ;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(MR1.LJLIL);
    public final String LJLILLLLZI = "notification_page";
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(MQY.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(MQB.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C56776MQa.LJLIL);
    public int LJLJJLL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(MQZ.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(MR2.LJLIL);

    @Override // X.InterfaceC56771MPv
    public final MWH Kg0() {
        return null;
    }

    @Override // X.InterfaceC56771MPv
    public final void vl() {
        this.LJLJLJ = true;
    }

    @Override // X.InterfaceC56771MPv
    public final C56732MOi FR() {
        return (C56732MOi) ((LiveData) this.LJLJI.getValue()).getValue();
    }

    @Override // X.InterfaceC56771MPv
    public final int az() {
        C56732MOi c56732MOi = (C56732MOi) ((LiveData) this.LJLJI.getValue()).getValue();
        if (c56732MOi != null) {
            return c56732MOi.LJLIL;
        }
        return C56702MNe.LIZ;
    }

    @Override // X.InterfaceC56771MPv
    public final CopyOnWriteArraySet<String> cJ() {
        return (CopyOnWriteArraySet) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC56771MPv
    public final C73318Sq2 qz() {
        return (C73318Sq2) this.LJLJLLL.getValue();
    }

    @Override // X.InterfaceC56771MPv
    public final String iN() {
        return MDT.LIZIZ(Integer.valueOf(az()));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        ((C73318Sq2) this.LJLIL.getValue()).LIZLLL();
    }

    @Override // X.InterfaceC56771MPv
    public EnumC56648MLc Aw() {
        return EnumC56648MLc.GONE;
    }

    @Override // X.InterfaceC56771MPv
    public final boolean eo0() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC56771MPv
    public final String getEnterFrom() {
        return this.LJLILLLLZI;
    }

    public final void gv0(C56732MOi filter) {
        o.LJIIIZ(filter, "filter");
        int az = az();
        ((LiveData) this.LJLJI.getValue()).setValue(filter);
        if (az != az()) {
            ((LiveData) this.LJLJJI.getValue()).setValue(new OSZ(Integer.valueOf(az), Integer.valueOf(az())));
        }
    }

    @Override // X.InterfaceC56771MPv
    public final void vP(BaseNotice baseNotice, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        MPB.LIZIZ(this, baseNotice, interfaceC65784Pro);
    }
}
