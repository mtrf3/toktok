package com.bytedance.android.livesdk.chatroom.ui;

import X.C0A7;
import X.C0AC;
import X.C0NB;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes6.dex */
public class SSLinearLayoutManager extends LinearLayoutManager {
    public SSLinearLayoutManager() {
    }

    public SSLinearLayoutManager(int i) {
        super(1, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (Exception e) {
            C0NB.LJI("SSLinearLayoutManager", e);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LJZI(i, c0a7, c0ac);
        } catch (Exception e) {
            C0NB.LJI("SSLinearLayoutManager", e);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LL(i, c0a7, c0ac);
        } catch (Exception e) {
            C0NB.LJI("SSLinearLayoutManager", e);
            return 0;
        }
    }

    public SSLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
