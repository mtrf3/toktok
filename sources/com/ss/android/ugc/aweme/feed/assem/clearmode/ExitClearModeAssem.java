package com.ss.android.ugc.aweme.feed.assem.clearmode;

import X.C221108m2;
import X.C62822Ol8;
import X.C7MY;
import X.C8QI;
import X.C8T7;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExitClearModeAssem extends BaseCellPlaceHolderComponent implements ComponentPriorityProtocol {
    public final C62822Ol8 LLD;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "right_container_clear_mode";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitClearModeAssem() {
        super("exit_clearmode");
        new LinkedHashMap();
        this.LLD = C221108m2.LIZIZ(new AqS153S0100000_3(this, 301));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void F0(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent
    /* renamed from: c4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLD.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        getContainerView().setTag(C8QI.LJII, Boolean.TRUE);
        if (getContainerView() instanceof ViewGroup) {
            View containerView = getContainerView();
            ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int LIZIZ = C7MY.LIZIZ(8);
                int LIZIZ2 = C7MY.LIZIZ(12);
                int marginStart = marginLayoutParams.getMarginStart();
                int i = marginLayoutParams.topMargin;
                marginLayoutParams.setMarginStart(marginStart);
                marginLayoutParams.topMargin = i;
                marginLayoutParams.setMarginEnd(LIZIZ);
                marginLayoutParams.bottomMargin = LIZIZ2;
                containerView.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
