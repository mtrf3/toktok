package com.bytedance.android.livesdk.chatroom.ui;

import X.C0A7;
import X.C0AB;
import X.C0AC;
import X.C0K2;
import X.C74590TPe;
import X.CN1;
import X.CWZ;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* loaded from: classes6.dex */
public class SmoothLinearLayoutManager extends LinearLayoutManager {
    public float LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;

    public SmoothLinearLayoutManager() {
        super(1, false);
        this.LLIIIJ = 25.0f;
        this.LLIIIL = true;
    }

    public final boolean LLJJJJ() {
        if (this.LLIIIZ) {
            return true;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            this.LLIIIZ = iHostAppContext.isLocalTest();
        }
        return this.LLIIIZ;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (Exception e) {
            if (!LLJJJJ()) {
                C0K2.LIZ("Public screen RecyclerView NPE", e);
                return;
            }
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LJZI(i, c0a7, c0ac);
        } catch (Exception e) {
            if (!LLJJJJ()) {
                C0K2.LIZ("Public screen RecyclerView NPE", e);
                return 0;
            }
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LL(i, c0a7, c0ac);
        } catch (Exception e) {
            if (!LLJJJJ()) {
                C0K2.LIZ("Public screen RecyclerView NPE", e);
                return 0;
            }
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        C0AB cwz;
        if (i < 0) {
            i = 0;
        }
        if (this.LLIIIL) {
            cwz = new C74590TPe(this, recyclerView.getContext());
        } else {
            cwz = new CWZ(this, recyclerView.getContext());
        }
        cwz.LIZ = i;
        LLIIIILZ(cwz);
    }

    public SmoothLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LLIIIJ = 25.0f;
        this.LLIIIL = true;
    }
}
