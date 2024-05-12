package com.ss.android.ugc.aweme.relation.follow.ui;

import X.C57430MgM;
import X.C57438MgU;
import X.C76800UCe;
import X.EnumC57435MgR;
import X.InterfaceC57447Mgd;
import X.InterfaceC57449Mgf;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.SY4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0101000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class RelationButton extends SY4 implements InterfaceC57449Mgf, InterfaceC57447Mgd {
    public final InterfaceC57447Mgd LLIIIILZ;
    public final InterfaceC57449Mgf LLIIIJ;
    public final Map<Integer, View> LLIIIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RelationButton(Context context) {
        this(context, null, 0, 14);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RelationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        o.LJIIIZ(context, "context");
    }

    @Override // X.SY4, com.bytedance.tux.input.TuxTextView
    public View LJJIJIL(int i) {
        Map<Integer, View> map = this.LLIIIL;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC57449Mgf
    public final void LJJLIIIJJIZ() {
    }

    @Override // X.InterfaceC57447Mgd
    public Context getCtx() {
        return this.LLIIIILZ.getCtx();
    }

    @Override // X.InterfaceC57447Mgd
    public InterfaceC88472Yns<EnumC57435MgR, C76800UCe> getDataChangeListener() {
        return this.LLIIIILZ.getDataChangeListener();
    }

    @Override // X.InterfaceC57447Mgd
    public InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> getFollowClickInterceptor() {
        return this.LLIIIILZ.getFollowClickInterceptor();
    }

    @Override // X.InterfaceC57447Mgd
    public InterfaceC88471Ynr<EnumC57435MgR, EnumC57435MgR, C76800UCe> getFollowClickListener() {
        return this.LLIIIILZ.getFollowClickListener();
    }

    @Override // X.InterfaceC57447Mgd
    public InterfaceC88471Ynr<EnumC57435MgR, Boolean, C76800UCe> getRequestListener() {
        return this.LLIIIILZ.getRequestListener();
    }

    @Override // X.InterfaceC57447Mgd
    public InterfaceC65784Pro<C57430MgM> getTracker() {
        return this.LLIIIILZ.getTracker();
    }

    @Override // X.InterfaceC57447Mgd
    public void setDataChangeListener(InterfaceC88472Yns<? super EnumC57435MgR, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LLIIIILZ.setDataChangeListener(listener);
    }

    @Override // X.InterfaceC57447Mgd
    public void setFollowClickInterceptor(InterfaceC88472Yns<? super InterfaceC67352kd<? super Boolean>, ? extends Object> interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        this.LLIIIILZ.setFollowClickInterceptor(interceptor);
    }

    @Override // X.InterfaceC57447Mgd
    public void setFollowClickListener(InterfaceC88471Ynr<? super EnumC57435MgR, ? super EnumC57435MgR, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LLIIIILZ.setFollowClickListener(listener);
    }

    @Override // X.InterfaceC57447Mgd
    public void setRequestListener(InterfaceC88471Ynr<? super EnumC57435MgR, ? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LLIIIILZ.setRequestListener(listener);
    }

    @Override // X.InterfaceC57447Mgd
    public void setTracker(InterfaceC65784Pro<C57430MgM> tracker) {
        o.LJIIIZ(tracker, "tracker");
        this.LLIIIILZ.setTracker(tracker);
    }

    @Override // X.InterfaceC57449Mgf
    public final void LIZIZ() {
        this.LLIIIJ.LIZIZ();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLIIIJ.LJJLIIIJJIZ();
    }

    public final InterfaceC57447Mgd getListener() {
        return this.LLIIIILZ;
    }

    @Override // X.InterfaceC57449Mgf
    public final void LJJJJJL(C57438MgU c57438MgU) {
        this.LLIIIJ.LJJJJJL(c57438MgU);
    }

    @Override // X.SY4
    public void setButtonVariant(int i) {
        if (this.LLIIIJ != null) {
            LJJIIJZLJL(i, new AqS108S0101000_9(this, i, 1));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        super.setButtonVariant(i);
    }

    @Override // X.InterfaceC57449Mgf
    public final void LJJIIJZLJL(int i, AqS108S0101000_9 aqS108S0101000_9) {
        this.LLIIIJ.LJJIIJZLJL(i, aqS108S0101000_9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RelationButton(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = r7 & 2
            r2 = 0
            if (r0 == 0) goto L6
            r5 = r2
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Ld
            r6 = 2130968868(0x7f040124, float:1.7546402E38)
        Ld:
            r0 = r7 & 8
            if (r0 == 0) goto L4f
            X.UUc r0 = X.C77266UUc.LIZIZ
            X.Mgb r0 = r0.LIZ()
            X.Mge r1 = r0.LIZ(r4)
        L1b:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.LLIIIL = r0
            r3.<init>(r4, r5, r6)
            r3.LLIIIILZ = r1
            r0 = 1
            r3.LJJJIL(r0)
            r0 = 12
            r3.setMinTextSizePx(r0)
            r0 = 0
            X.C78897Uxp.LJJJJJL(r3, r0)
            r3.setEllipsize(r2)
            X.UUc r0 = X.C77266UUc.LIZIZ
            X.Mgb r0 = r0.LIZ()
            X.MgN r0 = r0.LIZIZ(r3)
            r3.LLIIIJ = r0
            return
        L4f:
            r1 = r2
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.follow.ui.RelationButton.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
