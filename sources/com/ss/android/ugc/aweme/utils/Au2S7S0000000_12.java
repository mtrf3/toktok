package com.ss.android.ugc.aweme.utils;

import X.C31811Ce7;
import X.C79234V7u;
import X.TAT;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public class Au2S7S0000000_12 extends TAT {
    public final int $t;

    public static final void LIZ$0(Au2S7S0000000_12 au2S7S0000000_12, View view) {
    }

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S7S0000000_12(int i) {
        super(700L);
        this.$t = i;
    }

    public static final void LIZ$1(Au2S7S0000000_12 au2S7S0000000_12, View view) {
        Fragment LJIIIZ;
        if (view != null && (LJIIIZ = C79234V7u.LJIIIZ(view)) != null) {
            C31811Ce7.LIZJ(LJIIIZ, R.string.qfy);
        }
    }
}
