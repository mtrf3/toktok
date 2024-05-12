package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.panel;

import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C4ED;
import X.C4EO;
import X.C4EU;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoSpeechAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public C4EU LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C55749LuL LJLJJI;

    public TakoSpeechAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TakoSpeechViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 295), C4ED.INSTANCE, null);
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 294));
        this.LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, C4EO.class, null), checkSupervisorPrepared());
    }

    public final C4EO v3() {
        return (C4EO) this.LJLJJI.getValue();
    }

    public final TakoSpeechViewModel x3() {
        return (TakoSpeechViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C4EU c4eu = this.LJLILLLLZI;
        if (c4eu != null) {
            c4eu.LIZIZ();
        } else {
            o.LJIJI("speechView");
            throw null;
        }
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        x3().mv0(false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(view instanceof C4EU)) {
            return;
        }
        C4EU c4eu = (C4EU) view;
        this.LJLILLLLZI = c4eu;
        c4eu.setOnDismissCallback(new AqS167S0100000_1(this, 116));
        C8YN.LJII(this, x3(), new TBT() { // from class: X.4Dv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C105934Dt) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), new AqS183S0100000_1(this, 84), 4);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.4DD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C105934Dt) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS183S0100000_1(this, 85), 4);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.4DA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C105934Dt) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS183S0100000_1(this, 86), 4);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.4Du
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C105934Dt) obj).LJLJJL;
            }
        }, null, new AqS183S0100000_1(this, 87), 6);
    }
}
