package com.ss.android.ugc.aweme.dsp.playerservice.v2;

import X.AbstractC91590Zx4;
import X.C2K0;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C8W0;
import X.C91437Zub;
import X.C91444Zui;
import X.C91502Zve;
import X.InterfaceC55102Lju;
import X.InterfaceC91459Zux;

/* loaded from: classes22.dex */
public final class AudioPlayerAssem extends C8W0 implements IAudioPlayerAbility, InterfaceC55102Lju {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C91444Zui.class, "AudioPlayerHierarchyData"), checkSupervisorPrepared());

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 668511829) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility
    public final AbstractC91590Zx4 HS() {
        return ((C91444Zui) this.LJLIL.getValue()).LJLIL.getPlayerController();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility
    public final C91437Zub FP() {
        InterfaceC91459Zux interfaceC91459Zux = HS().LJLILLLLZI.LJLJJI.LJLILLLLZI.get(C91502Zve.class);
        if (!(interfaceC91459Zux instanceof C91502Zve)) {
            interfaceC91459Zux = null;
        }
        C91502Zve c91502Zve = (C91502Zve) interfaceC91459Zux;
        if (c91502Zve == null) {
            return null;
        }
        return c91502Zve.LJLJJLL;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }
}
