package com.ss.android.ugc.aweme.music.highlight;

import X.C16880lQ;
import X.C184077Kh;
import X.C213688a4;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C240559cJ;
import X.C240569cK;
import X.C240589cM;
import X.C2K0;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.SY4;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightSelectBtnAssem extends Hilt_HighlightSelectBtnAssem implements HighlightSubmitBtnShowAbility, InterfaceC55102Lju {
    public SY4 LJLJI;
    public final C214298b3 LJLJJI;
    public final C214378bB LJLJJL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1056908010) {
            return null;
        }
        return this;
    }

    public HighlightSelectBtnAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 529);
        C65776Prg LIZ = C65352Pkq.LIZ(HighlightSelectListViewModel.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 530), C240559cJ.INSTANCE, aqS153S0100000_3);
        C240589cM c240589cM = C240589cM.LJLIL;
        C65776Prg LIZ2 = C65352Pkq.LIZ(HighlightSharedViewModel.class);
        C240569cK c240569cK = C240569cK.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 531);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJL = new C214378bB(LIZ2, c240589cM, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c240569cK, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    @Override // X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.music.highlight.HighlightSubmitBtnShowAbility
    public final void Tn0(boolean z) {
        int i;
        SY4 sy4 = this.LJLJI;
        if (sy4 == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        sy4.setVisibility(i);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SY4 sy4 = (SY4) view.findViewById(R.id.lu6);
        this.LJLJI = sy4;
        if (sy4 != null) {
            sy4.setEnabled(false);
        }
        SY4 sy42 = this.LJLJI;
        if (sy42 != null) {
            C16880lQ.LJJIZ(sy42, new ACListenerS24S0100000_4(this, 85));
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJJI.getValue(), new TBT() { // from class: X.9cL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240499cD) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, LiveTryModeCountDownThresholdSetting.DEFAULT), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLJJI.getValue(), new TBT() { // from class: X.9cI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240499cD) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 121), 4);
    }
}
