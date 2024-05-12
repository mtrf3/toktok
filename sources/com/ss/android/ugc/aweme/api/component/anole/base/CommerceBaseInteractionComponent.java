package com.ss.android.ugc.aweme.api.component.anole.base;

import X.C221108m2;
import X.C242549fW;
import X.C62822Ol8;
import X.C78688UuS;
import X.C8T7;
import X.X1D;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class CommerceBaseInteractionComponent extends BaseCellTriggerComponent<CommerceBaseInteractionComponent> implements ComponentPriorityProtocol {
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    public abstract String getLogTag();

    public abstract String l4();

    public abstract void m4();

    public abstract InteractAreaAttachAbility n4();

    public CommerceBaseInteractionComponent() {
        new LinkedHashMap();
        this.LLF = C221108m2.LIZIZ(new AqS154S0100000_4(this, 50));
        this.LLFF = C221108m2.LIZIZ(new AqS154S0100000_4(this, 51));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        m4();
        return "left_container_anole_slot";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        super.F0(item);
        getLogTag();
        C242549fW.LIZ(" onBind  before");
        getContainerView().setVisibility(8);
        if (k4(item)) {
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFF.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.U00(this, null, null);
            }
            InteractAreaAttachAbility interactAreaAttachAbility = (InteractAreaAttachAbility) this.LLF.getValue();
            if (interactAreaAttachAbility != null) {
                interactAreaAttachAbility.Sn(this, new AqS154S0100000_4(this, 52));
            }
            getLogTag();
            C242549fW.LIZ(" onBind  trigger");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        boolean contains;
        o.LJIIIZ(item, "item");
        getLogTag();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trigger = ");
        Aweme aweme = item.getAweme();
        if (ujb.o.LJJJJJL(l4())) {
            contains = false;
        } else {
            contains = ((ArrayList) C78688UuS.LJIJJLI(aweme)).contains(l4());
        }
        LIZ.append(contains);
        LIZ.append(",slotId = ");
        LIZ.append(l4());
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        Aweme aweme2 = item.getAweme();
        if (ujb.o.LJJJJJL(l4())) {
            return false;
        }
        return ((ArrayList) C78688UuS.LJIJJLI(aweme2)).contains(l4());
    }
}
