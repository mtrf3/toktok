package com.ss.android.ugc.aweme.music.assem.list.cell.assem;

import X.C16880lQ;
import X.C2U4;
import X.C47704Ins;
import X.C55749LuL;
import X.C8XO;
import X.C99W;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightAssem extends ReusedUISlotAssem<HighlightAssem> implements C8XO<C2U4> {
    public final Map<Integer, View> LLFFF = new LinkedHashMap();
    public final C55749LuL LLFF = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c3e;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    @Override // X.C8XO
    public final void F0(C2U4 item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C2U4 c2u4) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (C99W.LIZ) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFFF;
            View view2 = (View) linkedHashMap.get(Integer.valueOf(R.id.e5f));
            if (view2 == null) {
                view2 = getContainerView().findViewById(R.id.e5f);
                if (view2 != null) {
                    linkedHashMap.put(Integer.valueOf(R.id.e5f), view2);
                } else {
                    view2 = null;
                }
            }
            view2.setBackgroundResource(R.drawable.bwh);
        }
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 71), view);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C2U4 c2u4) {
    }
}
