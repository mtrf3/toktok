package com.bytedance.android.livesdk.chatroom.ui;

import X.C0A7;
import X.C0AC;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes9.dex */
public class SSGridLayoutManager extends GridLayoutManager {
    public SSGridLayoutManager(int i) {
        super(i);
    }

    public SSGridLayoutManager(int i, int i2) {
        super(i, i2, false);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LJZI(i, c0a7, c0ac);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LL(i, c0a7, c0ac);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public SSGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
