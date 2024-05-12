package com.ss.android.ugc.aweme.live.livehostimpl.livereply.spriteimage;

import X.C0AC;
import X.C72877Siv;
import X.C72977SkX;
import X.C72985Skf;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SpriteImageScrollLinearLayoutManager extends LinearLayoutManager {
    public final Context LLIIIJ;
    public final int LLIIIL;
    public final float LLIIIZ;
    public final C72977SkX<C72877Siv> LLIIJI;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LJJIIJZLJL(C0AC state) {
        o.LJIIIZ(state, "state");
        int LLILL = LLILL();
        int i = 0;
        if (C72985Skf.LIZIZ(this.LLIIIJ)) {
            View LJJIJIL = LJJIJIL(LLILL);
            if (LJJIJIL != null) {
                i = Math.abs(LJJIJIL.getLeft());
            }
        } else {
            View LJJIJIL2 = LJJIJIL(LLILL);
            if (LJJIJIL2 != null) {
                i = Math.abs(LJJIJIL2.getRight());
            }
            i -= this.LLIIJI.LIZIZ.LJLIL;
        }
        if (LLILL != 0) {
            if (LLILL != 1) {
                return i + this.LLIIIL + ((int) ((LLILL - 1) * this.LLIIIZ));
            }
            return i + this.LLIIIL;
        }
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpriteImageScrollLinearLayoutManager(Context context, int i, float f, C72977SkX<C72877Siv> handleConfig) {
        super(0, false);
        o.LJIIIZ(handleConfig, "handleConfig");
        this.LLIIIJ = context;
        this.LLIIIL = i;
        this.LLIIIZ = f;
        this.LLIIJI = handleConfig;
    }
}
