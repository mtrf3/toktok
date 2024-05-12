package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import X.C145995oB;
import X.C16880lQ;
import X.C41986Gdq;
import X.C48841JEv;
import X.C78613UtF;
import X.GXR;
import X.InterfaceC45640Hvg;
import X.InterpolatorC61446O9q;
import X.OSZ;
import X.W5G;
import X.WGQ;
import X.WGR;
import X.WGS;
import X.WGT;
import X.WGW;
import X.XKQ;
import X.XKX;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class PreviewImageScene extends UserVisibleHintGroupScene implements InterfaceC45640Hvg {
    public final boolean LJLIL;
    public long LJLJI;
    public WGT LJLJJI;
    public MyMediaModel LJLJJL;
    public W5G LJLJJLL;
    public View LJLJL;
    public ImageView LJLJLJ;
    public XKQ LJLJLLL;
    public int LJLILLLLZI = -1;
    public long LJLL = -1;

    @Override // X.InterfaceC45640Hvg
    public final void LJIIJ() {
        LLJILJILJ(true);
    }

    @Override // X.InterfaceC45640Hvg
    public final void LJJIJL() {
    }

    @Override // X.InterfaceC45640Hvg
    public final void LJJIJLIJ() {
    }

    @Override // X.InterfaceC45640Hvg
    public final boolean LJLLI() {
        return true;
    }

    @Override // X.InterfaceC45640Hvg
    public final void LLIIJI() {
    }

    public final WGQ LLJILJIL() {
        WGQ wgq = new WGQ();
        wgq.LJ = 220L;
        wgq.LJFF = 220L;
        wgq.LJI = 220L;
        wgq.LJII = 220L;
        OSZ<PointF, PointF> osz = WGW.LIZ;
        wgq.LIZ = new InterpolatorC61446O9q(osz.getFirst(), osz.getSecond());
        wgq.LIZIZ = new InterpolatorC61446O9q(osz.getFirst(), osz.getSecond());
        wgq.LIZJ = new InterpolatorC61446O9q(osz.getFirst(), osz.getSecond());
        wgq.LIZLLL = new InterpolatorC61446O9q(osz.getFirst(), osz.getSecond());
        return wgq;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        XKQ xkq = this.LJLJLLL;
        if (xkq != null && (!xkq.isCompleted())) {
            xkq.LIZIZ(null);
        }
    }

    public PreviewImageScene(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.InterfaceC45640Hvg
    public final void LLJIJIL(MyMediaModel myMediaModel) {
        this.LJLJJL = myMediaModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJILJILJ(boolean r14) {
        /*
            r13 = this;
            X.WGT r0 = r13.LJLJJI
            if (r0 == 0) goto L7
            r0.LJJJJZI()
        L7:
            X.WGT r0 = r13.LJLJJI
            r6 = 0
            if (r0 == 0) goto L3e
            android.view.View r0 = r0.LJJLJLI()
            if (r0 == 0) goto L3e
            X.WGU r1 = new X.WGU
            r1.<init>(r0)
            android.view.View r0 = r13.LJLJL
            X.WGR r7 = X.WGW.LIZ(r0)
            if (r7 == 0) goto L3e
            android.graphics.Rect r8 = r1.LIZIZ()
            android.graphics.Rect r9 = r1.LIZJ()
            X.UXp r10 = new X.UXp
            r10.<init>()
            X.WGQ r11 = r13.LLJILJIL()
            kotlin.jvm.internal.AqS164S0100000_14 r12 = new kotlin.jvm.internal.AqS164S0100000_14
            r0 = 144(0x90, float:2.02E-43)
            r12.<init>(r13, r0)
            r7.LIZ(r8, r9, r10, r11, r12)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L45
        L3e:
            X.WGT r0 = r13.LJLJJI
            if (r0 == 0) goto L45
            r0.onExit()
        L45:
            X.5oB r4 = new X.5oB
            r4.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r13.LJLJI
            long r2 = r2 - r0
            java.lang.String r0 = "duration"
            r4.LIZIZ(r2, r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel r0 = r13.LJLJJL
            r3 = -1
            if (r0 == 0) goto Lcf
            int r1 = r0.type
        L5d:
            java.lang.String r0 = "content_type"
            r4.LIZ(r1, r0)
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            X.W5G r0 = r13.LJLJJLL
            java.lang.String r1 = "draweeView"
            if (r0 == 0) goto Ld5
            int r0 = r0.getWidth()
            r2.append(r0)
            r5 = 42
            r2.append(r5)
            X.W5G r0 = r13.LJLJJLL
            if (r0 == 0) goto Ld1
            int r0 = r0.getHeight()
            r2.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "resolution"
            r4.LJI(r0, r1)
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel r0 = r13.LJLJJL
            r1 = 0
            if (r0 == 0) goto Lcd
            int r0 = r0.width
        L97:
            r2.append(r0)
            r2.append(r5)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel r0 = r13.LJLJJL
            if (r0 == 0) goto La3
            int r1 = r0.width
        La3:
            r2.append(r1)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "original_resolution"
            r4.LJI(r0, r1)
            java.lang.String r1 = "content_cnt"
            int r0 = r13.LJLILLLLZI
            r4.LIZ(r0, r1)
            java.lang.String r0 = "fps"
            r4.LIZ(r3, r0)
            java.lang.String r0 = "lag_count"
            r4.LIZ(r3, r0)
            java.lang.String r0 = "lag_total_duration"
            r4.LIZ(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "tool_performance_content_preview"
            X.GXR.LIZ(r0, r1)
            return
        Lcd:
            r0 = 0
            goto L97
        Lcf:
            r1 = -1
            goto L5d
        Ld1:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r6
        Ld5:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene.LLJILJILJ(boolean):void");
    }

    public final void LLJJ(boolean z) {
        Integer num;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.LJLJI;
        long j2 = currentTimeMillis - j;
        long j3 = this.LJLL - j;
        if (j3 < 0) {
            j3 = 0;
        }
        C145995oB c145995oB = new C145995oB();
        MyMediaModel myMediaModel = this.LJLJJL;
        if (myMediaModel != null) {
            num = Integer.valueOf(myMediaModel.type);
        } else {
            num = null;
        }
        c145995oB.LJI("content_type", String.valueOf(num));
        c145995oB.LIZIZ(j2, "first_frame_duration");
        if (j3 != 0) {
            j2 = j3;
        }
        c145995oB.LIZIZ(j2, "black_frame_duration");
        c145995oB.LIZ(this.LJLILLLLZI, "content_cnt");
        c145995oB.LIZ(isVisible() ? 1 : 0, "is_visible");
        c145995oB.LIZ(z ? 1 : 0, "is_success");
        GXR.LIZ("tool_performance_album_preview_first_frame", c145995oB.LIZ);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.ej_);
        o.LJIIIIZZ(requireViewById, "requireViewById<ImageView>(R.id.img_delete)");
        this.LJLJLJ = (ImageView) requireViewById;
        View requireViewById2 = requireViewById(R.id.chd);
        o.LJIIIIZZ(requireViewById2, "requireViewById<SimpleDr…eeView>(R.id.drawee_view)");
        this.LJLJJLL = (W5G) requireViewById2;
        this.LJLJI = System.currentTimeMillis();
        View requireViewById3 = requireViewById(R.id.drn);
        this.LJLJL = requireViewById3;
        WGS wgs = new WGS(this);
        WGR LIZ = WGW.LIZ(requireViewById3);
        if (LIZ != null) {
            LIZ.setGestureListener(wgs);
        }
        getUserVisibleHintLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene$onActivityCreated$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                WGT wgt;
                ImageView imageView = PreviewImageScene.this.LJLJLJ;
                if (imageView != null) {
                    if (imageView.getVisibility() == 0 && (wgt = PreviewImageScene.this.LJLJJI) != null) {
                        wgt.LLILZ(R.string.jl9);
                        return;
                    }
                    return;
                }
                o.LJIJI("deleteImg");
                throw null;
            }
        });
        this.LJLJLLL = XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C41986Gdq(this, null), 3);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void setUserVisibleHint(boolean z) {
        WGR LIZ;
        super.setUserVisibleHint(z);
        if (!z && (LIZ = WGW.LIZ(this.LJLJL)) != null) {
            LIZ.reset();
        }
    }

    @Override // X.InterfaceC45640Hvg
    public final void LLIIIJ(int i, WGT controller) {
        o.LJIIIZ(controller, "controller");
        this.LJLILLLLZI = i;
        this.LJLJJI = controller;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (this.LJLIL) {
            i = R.layout.ce0;
        } else {
            i = R.layout.cdz;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) LLLLIILL;
    }
}
