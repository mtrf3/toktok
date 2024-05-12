package com.ss.android.ugc.aweme.feed.assem.report;

import X.C16880lQ;
import X.C221108m2;
import X.C30581Hy;
import X.C59423NTv;
import X.C62822Ol8;
import X.C8T7;
import Y.ACListenerS38S0200000_3;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ReportViewAssem extends BaseCellSlotComponent<ReportVideoMaskAssem> implements ComponentPriorityProtocol {
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 361));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.acs;
    }

    public final View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this.LLFZ;
        Integer valueOf = Integer.valueOf(R.id.iwt);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(R.id.iwt);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "right_container_report";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        if (C30581Hy.LJIL(item.mEventType) && C59423NTv.LIZ()) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.iwt);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.iwt);
            if (frameLayout != null) {
                C16880lQ.LJIILJJIL(frameLayout, new ACListenerS38S0200000_3(item, this, 52));
            }
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.U00(this, null, null);
                return;
            }
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.iwt);
        if (_$_findCachedViewById2 == null) {
            return;
        }
        _$_findCachedViewById2.setVisibility(4);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
    }
}
