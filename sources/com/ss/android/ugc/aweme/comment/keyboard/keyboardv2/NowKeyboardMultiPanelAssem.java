package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2;

import X.AnonymousClass717;
import X.AnonymousClass718;
import X.C213688a4;
import X.C214298b3;
import X.C2K0;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78886Uxe;
import X.C78926UyI;
import X.C7EP;
import X.C8YN;
import X.C9BD;
import X.InterfaceC55102Lju;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowKeyboardMultiPanelAssem extends UISlotAssem implements INowKeyboardMultiPanelAssemAbility, InterfaceC55102Lju {
    public final C214298b3 LJLJLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 795746295) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.qs;
    }

    public NowKeyboardMultiPanelAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NowKeyboardVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 99), AnonymousClass718.INSTANCE, null);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C78886Uxe.LJJLIIIJ(C7EP.LIZ(), getContainerView());
        C8YN.LJII(this, this.LJLJLLL.getValue(), new TBT() { // from class: X.715
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C178336zF) obj).LJLJLJ);
            }
        }, C213688a4.LIZLLL(), AnonymousClass717.LJLIL, 4);
    }
}
