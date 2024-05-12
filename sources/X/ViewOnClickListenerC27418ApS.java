package X;

import Y.ACListenerS30S0300000_4;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* renamed from: X.ApS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC27418ApS implements View.OnClickListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ Boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ View.OnClickListener LJLJJL;

    public ViewOnClickListenerC27418ApS(TuxTextView tuxTextView, Integer num, Boolean bool, boolean z, ACListenerS30S0300000_4 aCListenerS30S0300000_4) {
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = num;
        this.LJLJI = bool;
        this.LJLJJI = z;
        this.LJLJJL = aCListenerS30S0300000_4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r6 != null) goto L22;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            android.view.View r8 = r12.LJLIL
            java.lang.Integer r0 = r12.LJLILLLLZI
            if (r0 == 0) goto Lb2
            int r9 = r0.intValue()
        La:
            java.lang.Boolean r0 = r12.LJLJI
            if (r0 == 0) goto Laf
            boolean r2 = r0.booleanValue()
        L12:
            boolean r3 = r12.LJLJJI
            android.view.View$OnClickListener r7 = r12.LJLJJL
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r1 = 0
            if (r2 == 0) goto L3f
            android.content.Context r2 = r8.getContext()
        L27:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L3f
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto La7
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L3f
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L3f
            android.view.View r6 = r0.getDecorView()
            if (r6 != 0) goto L40
        L3f:
            r6 = r8
        L40:
            r5 = 2131365971(0x7f0a1053, float:1.8351822E38)
            java.lang.Object r2 = r6.getTag(r5)
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto La4
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto La4
            long r10 = r2.longValue()
        L53:
            if (r3 == 0) goto L84
            android.content.Context r2 = r8.getContext()
        L59:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L78
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L9d
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L78
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L78
            android.view.View r2 = r0.getDecorView()
            if (r2 == 0) goto L78
            r0 = 2131365970(0x7f0a1052, float:1.835182E38)
            java.lang.Object r1 = r2.getTag(r0)
        L78:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L84
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L84
            int r9 = r1.intValue()
        L84:
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r10
            long r1 = (long) r9
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L9c
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.setTag(r5, r0)
            r7.onClick(r8)
        L9c:
            return
        L9d:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L59
        La4:
            r10 = 0
            goto L53
        La7:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L27
        Laf:
            r2 = 1
            goto L12
        Lb2:
            r9 = 1000(0x3e8, float:1.401E-42)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC27418ApS.onClick(android.view.View):void");
    }
}
