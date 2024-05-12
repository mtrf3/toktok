package com.ss.android.ugc.aweme.im.sdk.chat.ui.view;

import X.C0AC;
import X.C117294iz;
import X.C1C9;
import Y.ARunnableS20S0200000_1;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.reflect.Reflect;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ChatLinearLayoutManager extends WrapLinearLayoutManager {
    public boolean LLIIJI;
    public boolean LLIIJLIL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final boolean LJIL() {
        if (this.LLIIJI && super.LJIL()) {
            return true;
        }
        return false;
    }

    public final int LLJJJJLIIL() {
        if (this.LL) {
            return LLILLJJLI();
        }
        return LLILL();
    }

    public final int LLJJL() {
        if (this.LL) {
            return LLILL();
        }
        return LLILLJJLI();
    }

    public final void LLJJLIIIJLLLLLLLZ() {
        int i;
        if (this.LL) {
            LJFF(0, 0);
            return;
        }
        if (LJJJJZ() - 1 >= 0) {
            i = LJJJJZ() - 1;
        } else {
            i = 0;
        }
        LJFF(i, 0);
        if (!this.LLF) {
            return;
        }
        Reflect.on(this).set("mStackFromEnd", Boolean.FALSE);
    }

    public ChatLinearLayoutManager(Context context) {
        o.LJIIIZ(context, "context");
        this.LLIIJI = true;
    }

    public final void LLJL(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        int i = 0;
        if (this.LL) {
            if (C117294iz.LIZ()) {
                if (LLJJL() > 20) {
                    LJZL(20);
                }
                recyclerView.post(new ARunnableS20S0200000_1(recyclerView, this, 15));
                return;
            }
            LLIIII(recyclerView, null, 0);
            return;
        }
        if (LJJJJZ() - 1 >= 0) {
            i = LJJJJZ() - 1;
        }
        LLIIII(recyclerView, null, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        final Context context = recyclerView.getContext();
        C1C9 c1c9 = new C1C9(context) { // from class: X.4ix
            @Override // X.C1C9
            public final int LJIILJJIL() {
                return 1;
            }

            @Override // X.C1C9
            public final float LJIIJ(DisplayMetrics displayMetrics) {
                float f;
                float f2;
                o.LJIIIZ(displayMetrics, "displayMetrics");
                ChatLinearLayoutManager chatLinearLayoutManager = ChatLinearLayoutManager.this;
                if (chatLinearLayoutManager.LLIIJLIL) {
                    chatLinearLayoutManager.LLIIJLIL = false;
                    f = displayMetrics.densityDpi;
                    f2 = 50.0f;
                } else {
                    f = displayMetrics.densityDpi;
                    f2 = 25.0f;
                }
                return f2 / f;
            }

            @Override // X.C1C9
            public final int LJIIL(int i2) {
                if (!C81253Gv.LIZ() && !C117294iz.LIZ()) {
                    if (i2 >= 3000) {
                        i2 = 3000;
                    }
                    return super.LJIIL(i2);
                }
                return super.LJIIL(i2);
            }
        };
        c1c9.LIZ = i;
        LLIIIILZ(c1c9);
    }
}
