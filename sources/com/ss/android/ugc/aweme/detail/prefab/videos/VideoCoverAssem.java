package com.ss.android.ugc.aweme.detail.prefab.videos;

import X.C185927Rk;
import X.C8XO;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoCoverAssem extends ReusedUISlotAssem<VideoCoverAssem> implements C8XO<C185927Rk>, View.OnAttachStateChangeListener {
    public SmartImageView LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.akw;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public VideoCoverAssem() {
        new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b1, code lost:
    
        if (X.C48207Ivz.LIZ(r1) == false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    @Override // X.C8XO
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q4(X.C185927Rk r10) {
        /*
            r9 = this;
            X.7Rk r10 = (X.C185927Rk) r10
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.getAweme()
            android.view.View r0 = r9.Y3()
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "contentView.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = X.C16880lQ.LLLZLL()
            r5 = 0
            r3 = 1
            if (r0 == 0) goto La5
        L20:
            r0 = 0
        L21:
            r7 = 0
            java.lang.String r6 = "coverView"
            if (r0 == 0) goto L4d
        L27:
            com.bytedance.lighten.loader.SmartImageView r4 = r9.LLFF
            if (r4 == 0) goto Lcf
            com.ss.android.ugc.aweme.feed.model.Video r2 = r8.getVideo()
            java.lang.String r0 = "aweme.video"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.String r1 = "DetailVideoListCell"
            r0 = 120(0x78, float:1.68E-43)
            boolean r0 = X.C208458Gb.LIZJ(r4, r2, r1, r5, r0)
            if (r0 == 0) goto L4d
            com.bytedance.lighten.loader.SmartImageView r0 = r9.LLFF
            if (r0 == 0) goto Lcb
            r0.setAttached(r3)
            com.bytedance.lighten.loader.SmartImageView r0 = r9.LLFF
            if (r0 == 0) goto Lc7
            r0.LJ()
        L4c:
            return
        L4d:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r8.getVideo()
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getCover()
            if (r1 == 0) goto L73
            java.lang.String r0 = r1.getUri()
            if (r0 == 0) goto L65
            boolean r0 = ujb.o.LJJJJJL(r0)
            if (r0 == 0) goto L7e
        L65:
            if (r1 == 0) goto L73
            java.util.List r0 = r1.getUrlList()
            if (r0 == 0) goto L73
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7e
        L73:
            com.bytedance.lighten.loader.SmartImageView r1 = r9.LLFF
            if (r1 == 0) goto Ld3
            r0 = 2130968600(0x7f040018, float:1.7545858E38)
            r1.setActualImageResource(r0)
            goto L4c
        L7e:
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C78939UyV.LJ(r1)
            X.W5F r1 = X.W5U.LJII(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r9.LLFF
            if (r0 == 0) goto Ld7
            r1.LJJIIJ = r0
            r0 = 200(0xc8, float:2.8E-43)
            int[] r0 = X.J7H.LIZ(r0)
            if (r0 == 0) goto L97
            r1.LJIILIIL(r0)
        L97:
            boolean r0 = X.C248339or.LIZ()
            if (r0 == 0) goto La1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1.LJIJI = r0
        La1:
            X.C16880lQ.LLJJJ(r1)
            goto L4c
        La5:
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> Lb3
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> Lb3
            if (r0 == 0) goto Lb3
            boolean r0 = X.C48207Ivz.LIZ(r1)
            if (r0 == 0) goto L20
        Lb3:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto Lc5
            r1 = 1
        Lba:
            java.lang.String r0 = "use_dynamic_cover"
            boolean r0 = X.C84S.LIZIZ(r0, r1)
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        Lc5:
            r1 = 0
            goto Lba
        Lc7:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        Lcb:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        Lcf:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        Ld3:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        Ld7:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.prefab.videos.VideoCoverAssem.q4(java.lang.Object):void");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C185927Rk c185927Rk) {
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        SmartImageView smartImageView = this.LLFF;
        if (smartImageView != null) {
            smartImageView.setAttached(true);
            SmartImageView smartImageView2 = this.LLFF;
            if (smartImageView2 != null) {
                smartImageView2.LJ();
                return;
            } else {
                o.LJIJI("coverView");
                throw null;
            }
        }
        o.LJIJI("coverView");
        throw null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        SmartImageView smartImageView = (SmartImageView) Y3();
        this.LLFF = smartImageView;
        smartImageView.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        SmartImageView smartImageView = this.LLFF;
        if (smartImageView != null) {
            smartImageView.setAttached(false);
            SmartImageView smartImageView2 = this.LLFF;
            if (smartImageView2 != null) {
                smartImageView2.LJFF();
                return;
            } else {
                o.LJIJI("coverView");
                throw null;
            }
        }
        o.LJIJI("coverView");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C185927Rk c185927Rk) {
    }
}
