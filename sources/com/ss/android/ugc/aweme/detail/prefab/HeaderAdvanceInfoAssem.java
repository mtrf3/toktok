package com.ss.android.ugc.aweme.detail.prefab;

import X.AnonymousClass391;
import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C7MY;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.prefab.LinearLayoutAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class HeaderAdvanceInfoAssem extends LinearLayoutAssem {
    public final int LJLL;
    public final C62822Ol8 LJLLI;

    public HeaderAdvanceInfoAssem() {
        new LinkedHashMap();
        this.LJLL = R.id.c8v;
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 190));
    }

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void H3() {
        super.H3();
        if (!getConfig().LJIIIZ.isEmpty()) {
            View x3 = x3();
            o.LJII(x3, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) x3;
            C16880lQ.LJLLL((View) this.LJLLI.getValue(), viewGroup);
            View view = (View) this.LJLLI.getValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, AnonymousClass391.LIZ(0.5d));
            marginLayoutParams.topMargin = C7MY.LIZIZ(8);
            marginLayoutParams.bottomMargin = C7MY.LIZIZ(8);
            marginLayoutParams.leftMargin = C7MY.LIZIZ(16);
            marginLayoutParams.rightMargin = C7MY.LIZIZ(16);
            viewGroup.addView(view, 0, marginLayoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem
    public final int L3() {
        return this.LJLL;
    }
}
