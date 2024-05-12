package com.ss.android.ugc.aweme.dsp.playpage.v2;

import X.AV1;
import X.ActivityC45651qj;
import X.C212428Vi;
import X.C2K0;
import X.C32151Nz;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C60996Nwm;
import X.C8W0;
import X.C91280Zs4;
import X.C91309ZsX;
import X.C91444Zui;
import X.C91473ZvB;
import X.InterfaceC55102Lju;
import X.InterfaceC91281Zs5;
import X.O6R;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class FragmentServiceAssem extends C8W0 implements IContainerUtilityAbility, InterfaceC55102Lju {
    public Boolean LJLIL;
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C91444Zui.class, "AudioPlayerHierarchyData"), checkSupervisorPrepared());

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -48221874) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final boolean SC() {
        if (this.LJLIL == null) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            boolean z = false;
            if (LIZ != null && C60996Nwm.LJ(LIZ) <= O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT)))) {
                z = true;
            }
            this.LJLIL = Boolean.valueOf(z);
        }
        return o.LJ(this.LJLIL, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final boolean jG() {
        C91309ZsX c91309ZsX;
        C91280Zs4 c91280Zs4 = InterfaceC91281Zs5.LJJLIIIJLLLLLLLZ;
        InterfaceC91281Zs5 v3 = v3();
        c91280Zs4.getClass();
        if (v3 != null) {
            c91309ZsX = v3.bf();
        } else {
            c91309ZsX = null;
        }
        return o.LJ(c91309ZsX, C91309ZsX.LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final InterfaceC91281Zs5 kt() {
        return ((C91444Zui) this.LJLILLLLZI.getValue()).LJLIL;
    }

    public final InterfaceC91281Zs5 v3() {
        return ((C91444Zui) this.LJLILLLLZI.getValue()).LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final boolean D9() {
        return v3().D9();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final String getEnterMethod() {
        return v3().getEnterMethod();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final void iH() {
        v3().Ok();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final int v4() {
        return v3().v4();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final boolean w7() {
        return v3().w7();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final C91473ZvB x5() {
        return v3().x5();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final boolean z3() {
        return AV1.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final int z9() {
        return v3().z9();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility
    public final boolean Ds0(ActivityC45651qj activityC45651qj) {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(activityC45651qj);
    }
}
