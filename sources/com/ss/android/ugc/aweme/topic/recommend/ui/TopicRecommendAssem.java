package com.ss.android.ugc.aweme.topic.recommend.ui;

import X.C16880lQ;
import X.C184897Nl;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C78897Uxp;
import X.OSZ;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicRecommendAssem extends DynamicAssem {
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C184897Nl.class, null), checkSupervisorPrepared());
    public final Map<String, Integer> LJLL = C51029K0z.LJJIIZI(new OSZ("content", Integer.valueOf(R.id.bst)));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLI;
        Integer valueOf = Integer.valueOf(R.id.gmo);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.gmo)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.csp;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> K3() {
        return this.LJLL;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        assembleChildren();
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.gmo), new ACListenerS23S0100000_3(this, 162));
        View more_ll = _$_findCachedViewById(R.id.gmo);
        o.LJIIIIZZ(more_ll, "more_ll");
        C78897Uxp.LJJJJLI(more_ll, null);
    }
}
