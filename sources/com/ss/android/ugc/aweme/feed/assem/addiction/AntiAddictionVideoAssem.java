package com.ss.android.ugc.aweme.feed.assem.addiction;

import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C8QI;
import X.C8T7;
import X.SY4;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public final class AntiAddictionVideoAssem extends BaseCellSlotComponent<AntiAddictionVideoAssem> implements ComponentPriorityProtocol {
    public final C62822Ol8 LLFII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aa3;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_digital_wellbeing";
    }

    public AntiAddictionVideoAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 281));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue();
        if (interactAreaCommonAbility != null && interactAreaCommonAbility.vp()) {
            InteractAreaCommonAbility interactAreaCommonAbility2 = (InteractAreaCommonAbility) this.LLFII.getValue();
            if (interactAreaCommonAbility2 != null) {
                interactAreaCommonAbility2.zn("left_container_digital_wellbeing", this, true);
                return;
            }
            return;
        }
        InteractAreaCommonAbility interactAreaCommonAbility3 = (InteractAreaCommonAbility) this.LLFII.getValue();
        if (interactAreaCommonAbility3 == null) {
            return;
        }
        interactAreaCommonAbility3.U00(this, null, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        view.setTag(C8QI.LJI, "no_click");
        C16880lQ.LJJIZ((SY4) view.findViewById(R.id.kcp), new View.OnClickListener() { // from class: X.8PU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IFamilyPairingService LJIIIZ = a.LJIIIZ();
                Context context = view2.getContext();
                o.LJIIIIZZ(context, "it.context");
                LJIIIZ.LJFF(C45804HyK.LJIJJ(context), "tab_pop_up_enter_wellbeing");
            }
        });
    }
}
