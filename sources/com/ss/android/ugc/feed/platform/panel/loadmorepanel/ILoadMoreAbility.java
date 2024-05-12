package com.ss.android.ugc.feed.platform.panel.loadmorepanel;

import X.AbstractC55113Lk5;
import X.C2K0;
import X.InterfaceC55109Lk1;
import X.InterfaceC55110Lk2;
import X.InterfaceC55112Lk4;
import X.JCR;
import X.KR0;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes10.dex */
public interface ILoadMoreAbility extends C2K0 {
    void Ci0(KR0 kr0);

    void DA(InterfaceC55112Lk4 interfaceC55112Lk4);

    void Kv(String str);

    void LJZI(View view);

    void NT(InterfaceC55110Lk2 interfaceC55110Lk2);

    void Rg0(String str);

    void Up0(InterfaceC55109Lk1 interfaceC55109Lk1);

    boolean aY();

    void addView(View view, ViewGroup.LayoutParams layoutParams);

    void ep0(JCR jcr);

    void fy();

    int getMeasuredHeight();

    void q1();

    void qW(boolean z);

    void qt0(AbstractC55113Lk5 abstractC55113Lk5);

    void removeView(View view);

    void resetLoadMoreState();

    void showLoadMoreEmpty();

    void showLoadMoreError();

    void ug0();

    void vR();
}
