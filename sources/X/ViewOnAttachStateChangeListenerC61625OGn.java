package X;

import android.view.View;

/* renamed from: X.OGn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class ViewOnAttachStateChangeListenerC61625OGn implements View.OnAttachStateChangeListener, Runnable {
    public boolean LJLIL;
    public final /* synthetic */ C61624OGm LJLILLLLZI;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r5.isEmpty() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            X.OGm r0 = r6.LJLILLLLZI
            com.ss.android.ugc.aweme.discover.model.Banner r4 = r0.LJLJJL
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            X.OGm r0 = r6.LJLILLLLZI
            android.view.View r1 = r0.itemView
            r3 = 1
            if (r1 == 0) goto L27
            boolean r0 = X.C16330kX.LIZIZ(r1)
            if (r0 == 0) goto L27
        L16:
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L27
            float r2 = r1.getAlpha()
            r0 = 897988541(0x358637bd, float:1.0E-6)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L69
        L27:
            r3 = 0
        L28:
            if (r4 == 0) goto L5f
            if (r3 == 0) goto L5d
            boolean r0 = r6.LJLIL
            if (r0 != 0) goto L5d
            X.OGm r0 = r6.LJLILLLLZI
            com.ss.android.ugc.aweme.discover.model.Banner r0 = r0.LJLJJL
            java.lang.String r5 = r0.getBid()
            X.OGm r0 = r6.LJLILLLLZI
            int r4 = r0.LJLILLLLZI
            X.7au r2 = new X.7au
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "change_music_page"
            r2.LJIIIZ(r1, r0)
            java.lang.String r0 = "banner_id"
            r2.LJIIIZ(r0, r5)
            java.lang.String r1 = java.lang.Integer.toString(r4)
            java.lang.String r0 = "client_order"
            r2.LJIIIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "banner_show"
            X.FMX.LJIIL(r0, r1)
        L5d:
            r6.LJLIL = r3
        L5f:
            X.OGm r0 = r6.LJLILLLLZI
            android.view.View r2 = r0.itemView
            r0 = 250(0xfa, double:1.235E-321)
            r2.postDelayed(r6, r0)
            return
        L69:
            int r2 = r1.getId()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            if (r2 != r0) goto L83
        L72:
            X.OGm r0 = r6.LJLILLLLZI
            android.view.View r0 = r0.itemView
            boolean r0 = r0.getGlobalVisibleRect(r5)
            if (r0 == 0) goto L27
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L27
            goto L28
        L83:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L72
            android.view.View r1 = (android.view.View) r1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnAttachStateChangeListenerC61625OGn.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ViewOnAttachStateChangeListenerC61625OGn(C61624OGm c61624OGm) {
        this.LJLILLLLZI = c61624OGm;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LJLIL = false;
        this.LJLILLLLZI.itemView.removeCallbacks(this);
        run();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.LJLIL = false;
        this.LJLILLLLZI.itemView.removeCallbacks(this);
    }
}
