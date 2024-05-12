package X;

import android.view.View;
import com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment;

/* renamed from: X.AGu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC25960AGu implements View.OnTouchListener {
    public float LJLIL;
    public float LJLILLLLZI;
    public final /* synthetic */ CreatorCenterFragment LJLJI;

    public ViewOnTouchListenerC25960AGu(CreatorCenterFragment creatorCenterFragment) {
        this.LJLJI = creatorCenterFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r1 != 3) goto L9;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            int r1 = r9.getAction()
            r4 = 1
            r6 = 0
            java.lang.String r5 = "viewPager"
            r2 = 0
            if (r1 == 0) goto L58
            if (r1 == r4) goto L4e
            r0 = 2
            if (r1 == r0) goto L1e
            r0 = 3
            if (r1 == r0) goto L4e
        L1d:
            return r2
        L1e:
            float r1 = r9.getX()
            float r0 = r7.LJLIL
            float r1 = r1 - r0
            float r3 = r9.getY()
            float r0 = r7.LJLILLLLZI
            float r3 = r3 - r0
            float r1 = java.lang.Math.abs(r1)
            float r0 = java.lang.Math.abs(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1d
            com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment r1 = r7.LJLJI
            boolean r0 = r1.LJLJLLL
            if (r0 == 0) goto L46
            androidx.viewpager.widget.ViewPager r0 = r1.LJLJJL
            if (r0 == 0) goto L72
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L1d
        L46:
            androidx.viewpager.widget.ViewPager r0 = r1.LJLJJL
            if (r0 == 0) goto L76
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L1d
        L4e:
            com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment r0 = r7.LJLJI
            androidx.viewpager.widget.ViewPager r0 = r0.LJLJJL
            if (r0 == 0) goto L7a
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L1d
        L58:
            float r0 = r9.getX()
            r7.LJLIL = r0
            float r0 = r9.getY()
            r7.LJLILLLLZI = r0
            com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment r0 = r7.LJLJI
            androidx.viewpager.widget.ViewPager r0 = r0.LJLJJL
            if (r0 == 0) goto L7e
            r0.requestDisallowInterceptTouchEvent(r4)
            com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment r0 = r7.LJLJI
            r0.LJLJLLL = r2
            goto L1d
        L72:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        L76:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        L7a:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        L7e:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC25960AGu.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
