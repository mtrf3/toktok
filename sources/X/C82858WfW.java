package X;

import Y.AObserverS82S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WfW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82858WfW extends ViewOnTouchListenerC82857WfV {
    public final float LLLI;
    public InterfaceC65784Pro<Boolean> LLLII;
    public InterfaceC65784Pro<Boolean> LLLIIII;

    @Override // X.ViewOnTouchListenerC82857WfV, X.InterfaceC46045I5h
    public final void LJ() {
        this.LLIIII.LIZIZ(this.LJLJLJ.kv0(), this.LJLJLJ.nv0());
        this.LLIIL.LJZL(this.LLIIII.LIZIZ);
    }

    @Override // X.ViewOnTouchListenerC82857WfV
    public final void LJIJ() {
        View view;
        float f;
        float f2;
        float f3;
        float f4;
        if (this.LJZI == null) {
            return;
        }
        boolean z = true;
        RecyclerView.ViewHolder LJJIZ = this.LLIIIL.LJJIZ(this.LLIILII.getItemCount() - 1);
        if (this.LLILLJJLI == 1) {
            LJJIZ = this.LLIIIJ.LJJIZ(this.LLIIL.getItemCount() - 1);
        }
        if (LJJIZ != null) {
            view = LJJIZ.itemView;
        } else {
            view = null;
        }
        if (view == null) {
            float startX = (this.LJLILLLLZI - this.LJLL.getStartX()) - C82848WfM.LIZJ;
            if (this.LLIFFJFJJ) {
                f4 = this.LLLI;
            } else {
                f4 = 0.0f;
            }
            f = startX + f4;
            if (this.LLIIII.LIZLLL <= getMaxVideoLength()) {
                f -= this.LLJZ;
            }
            f3 = 0.0f;
        } else {
            LJJIZ.itemView.getLocationOnScreen(r2);
            int width = LJJIZ.itemView.getWidth() + r2[0];
            int[] iArr = {width};
            float startX2 = width - this.LJLL.getStartX();
            int i = C82848WfM.LIZJ;
            f = startX2 - i;
            if (f < 0.0f) {
                f = 0.0f;
            }
            float startX3 = ((this.LJLILLLLZI - this.LJLL.getStartX()) - f) - i;
            if (this.LLIFFJFJJ) {
                f2 = this.LLLI;
            } else {
                f2 = 0.0f;
            }
            f3 = startX3 + f2;
        }
        if (f != 0.0f) {
            z = false;
        }
        int i2 = (int) f;
        if (!z) {
            i2 += 20;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, this.LLJJJJLIIL);
        layoutParams.topMargin = this.LLJLILLLLZIIL;
        layoutParams.gravity = 5;
        int i3 = (int) f3;
        layoutParams.rightMargin = i3;
        layoutParams.setMarginEnd(i3);
        layoutParams.gravity = 8388613;
        this.LJZI.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    @Override // X.ViewOnTouchListenerC82857WfV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI() {
        /*
            r6 = this;
            android.view.View r0 = r6.LJZ
            if (r0 != 0) goto L5
            return
        L5:
            X.Vda r0 = r6.LLIIIL
            r3 = 0
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r0.LJJIZ(r3)
            int r1 = r6.LLILLJJLI
            r0 = 1
            if (r1 != r0) goto L17
            X.Vda r0 = r6.LLIIIJ
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r0.LJJIZ(r3)
        L17:
            if (r4 == 0) goto L81
            android.view.View r0 = r4.itemView
        L1b:
            r5 = 0
            if (r0 != 0) goto L4d
            X.WFS r0 = r6.LJLLI
            float r1 = r0.getStartX()
            boolean r0 = r6.LLIFFJFJJ
            if (r0 == 0) goto L66
            float r0 = r6.LLLI
        L2a:
            float r1 = r1 + r0
            r4 = 0
        L2c:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L33
            r3 = 1
        L33:
            int r1 = (int) r1
            if (r3 == 0) goto L4a
        L36:
            int r0 = r6.LLJJJJLIIL
            r2.<init>(r1, r0)
            int r0 = r6.LLJLILLLLZIIL
            r2.topMargin = r0
            r2.leftMargin = r4
            r2.setMarginStart(r4)
            android.view.View r0 = r6.LJZ
            r0.setLayoutParams(r2)
            return
        L4a:
            int r1 = r1 + 20
            goto L36
        L4d:
            r0 = 2
            int[] r2 = new int[r0]
            android.view.View r0 = r4.itemView
            r0.getLocationOnScreen(r2)
            r0 = r2[r3]
            if (r0 >= 0) goto L68
            X.WFS r0 = r6.LJLLI
            float r1 = r0.getStartX()
            boolean r0 = r6.LLIFFJFJJ
            if (r0 == 0) goto L66
            float r0 = r6.LLLI
            goto L2a
        L66:
            r0 = 0
            goto L2a
        L68:
            X.WFS r0 = r6.LJLLI
            float r1 = r0.getStartX()
            r4 = r2[r3]
            float r0 = (float) r4
            float r1 = r1 - r0
            boolean r0 = r6.LLIFFJFJJ
            if (r0 == 0) goto L7f
            float r0 = r6.LLLI
        L78:
            float r1 = r1 + r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2c
            r1 = 0
            goto L2c
        L7f:
            r0 = 0
            goto L78
        L81:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82858WfW.LJIJJLI():void");
    }

    @Override // X.ViewOnTouchListenerC82857WfV
    public final void LJJIFFI() {
        this.LJLJLJ.rv0(this.LLIZ, this.LLILLL);
        C82849WfN c82849WfN = this.LLIIII;
        c82849WfN.LIZ.put(((VideoSegment) ListProtector.get(this.LJLJLJ.kv0(), this.LLILLL)).LJII(true), Float.valueOf(this.LLIZ.LIZLLL));
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LJLJLJ.kv0(), this.LLILLL);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLJLLL;
        cutMultiVideoViewModel.LJLILLLLZI.put(videoSegment.LJII(true), 1);
        if (this.LLIFFJFJJ) {
            VideoEditViewModel videoEditViewModel = this.LJLJLJ;
            int i = this.LLILLL;
            int overXScroll = getOverXScroll();
            videoEditViewModel.LLFF.put(((VideoSegment) ListProtector.get(videoEditViewModel.LLD.getValue().getVideoSegmentList(), i)).LJII(true), Integer.valueOf(overXScroll));
            return;
        }
        this.LJLJLJ.sv0(this.LLILLL, getOverXScroll());
    }

    @Override // X.ViewOnTouchListenerC82857WfV
    public final void LJJIIJ() {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LLLIIII;
        if (interfaceC65784Pro == null || interfaceC65784Pro.invoke().booleanValue()) {
            super.LJJIIJ();
        }
    }

    @Override // X.ViewOnTouchListenerC82857WfV, X.I50, X.InterfaceC46045I5h
    public long getLeftSeekingValue() {
        return (this.LLILII + C82848WfM.LIZJ) * this.LLIIII.LJ;
    }

    @Override // X.ViewOnTouchListenerC82857WfV
    public C15070iV<Long, Long> getMultiVideoPlayBoundary() {
        float f = this.LLILII;
        int i = C82848WfM.LIZJ;
        float f2 = this.LLIIII.LJ;
        return new C15070iV<>(Long.valueOf(LJJJ(this.LJLJLJ.nv0(), (i + f) * f2)), Long.valueOf(LJJJ(this.LJLJLJ.nv0(), (f + i + this.LLILIL) * f2)));
    }

    @Override // X.ViewOnTouchListenerC82857WfV, X.I50
    public long getPlayingPosition() {
        return ((this.LL.getStartX() + this.LLILII) - this.LJLLI.getStartX()) * this.LLIIII.LJ;
    }

    @Override // X.ViewOnTouchListenerC82857WfV, X.I50, X.InterfaceC46045I5h
    public long getRightSeekingValue() {
        return ((this.LJLL.getStartX() + this.LLILII) - this.LJLLI.getStartX()) * this.LLIIII.LJ;
    }

    @Override // X.ViewOnTouchListenerC82857WfV
    public final void LJIIJ() {
        super.LJIIJ();
        this.LJLJLLL.LJLJJI.observe(this.LJLJL, new AObserverS82S0100000_14(this, 22));
    }

    @Override // X.ViewOnTouchListenerC82857WfV
    public final void LJJII() {
        super.LJJII();
        if (this.LLILZIL || !this.LLIFFJFJJ) {
            return;
        }
        WFS wfs = this.LJLLI;
        if (wfs != null) {
            wfs.setImageDrawable(LJJIZ(true));
        }
        WFS wfs2 = this.LJLL;
        if (wfs2 == null) {
            return;
        }
        wfs2.setImageDrawable(LJJIZ(false));
    }

    @Override // X.ViewOnTouchListenerC82857WfV
    public final void LJJIJ() {
        super.LJJIJ();
        post(new ARunnableS50S0100000_14(this, 217));
    }

    @Override // X.ViewOnTouchListenerC82857WfV
    public final void LJJIJIIJI() {
        super.LJJIJIIJI();
        post(new ARunnableS50S0100000_14(this, 217));
    }

    @Override // X.ViewOnTouchListenerC82857WfV, X.I50
    public long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    @Override // X.ViewOnTouchListenerC82857WfV, X.I50, X.InterfaceC46045I5h
    public long getMultiSeekTime() {
        return getSingleSeekTime();
    }

    @Override // X.ViewOnTouchListenerC82857WfV, X.I50
    public long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    @Override // X.ViewOnTouchListenerC82857WfV, X.InterfaceC46045I5h
    public final boolean LIZIZ() {
        return this.LLIFFJFJJ;
    }

    public final InterfaceC65784Pro<Boolean> getOnSelectMaxTime() {
        return this.LLLII;
    }

    public final InterfaceC65784Pro<Boolean> getOnSelectMinTime() {
        return this.LLLIIII;
    }

    @Override // X.ViewOnTouchListenerC82857WfV, X.InterfaceC46045I5h
    public final void LIZLLL(List<? extends VideoSegment> videoSegmentList) {
        o.LJIIIZ(videoSegmentList, "videoSegmentList");
        this.LLILLJJLI = 1;
        this.LJLJLJ.uv0(1);
        I5B i5b = this.LLIZ;
        if (i5b != null) {
            i5b.LIZIZ();
        }
        C82864Wfc c82864Wfc = this.LLILZLL;
        if (c82864Wfc != null) {
            c82864Wfc.LIZ = 0.0f;
            c82864Wfc.LIZIZ = 0.0f;
            c82864Wfc.LIZJ = 0;
        }
        for (VideoSegment videoSegment : videoSegmentList) {
            this.LLIIII.LIZ.put(videoSegment.LJII(true), Float.valueOf(videoSegment.LJIIIIZZ()));
        }
        this.LJLJLJ.gv0(videoSegmentList);
        this.LLIIII.LIZIZ(this.LJLJLJ.kv0(), this.LJLJLJ.nv0());
        LJIJJ(0, this.LLJZ, (this.LJLILLLLZI - r0) - C82848WfM.LIZJ, true);
        this.LLIIIL.setVisibility(8);
        this.LLIILII.LJZI();
        this.LLIIIJ.setVisibility(0);
        this.LLIIIJ.LJLI(0);
        WF7 wf7 = this.LLIIL;
        HashMap<String, Float> hashMap = this.LLIIII.LIZIZ;
        ((ArrayList) wf7.LJLJJLL).addAll(videoSegmentList);
        wf7.LJZL(hashMap);
    }

    @Override // X.ViewOnTouchListenerC82857WfV, X.InterfaceC46045I5h
    public final void LJIIIZ(boolean z) {
        this.LLIFFJFJJ = z;
        LJJII();
        if (z) {
            this.LJLLI.setOnTouchListener(null);
            this.LJLL.setOnTouchListener(null);
            this.LL.setOnTouchListener(null);
            this.LLF = false;
            this.LLIIIJ.setVisibility(8);
            return;
        }
        this.LJLLI.setOnTouchListener(this);
        this.LJLLI.setTag("startSlide");
        this.LJLL.setOnTouchListener(this);
        this.LJLL.setTag("endSlide");
        this.LL.setOnTouchListener(this);
        this.LLF = true;
        this.LLIIIJ.setVisibility(0);
        post(new ARunnableS50S0100000_14(this, 217));
    }

    @Override // X.ViewOnTouchListenerC82857WfV
    public final boolean LJIILJJIL(String str) {
        if (this.LLIFFJFJJ) {
            return true;
        }
        return super.LJIILJJIL(str);
    }

    @Override // X.ViewOnTouchListenerC82857WfV
    public final void LJJIJIIJIL(VideoSegment videoSegment) {
        o.LJIIIZ(videoSegment, "videoSegment");
        super.LJJIJIIJIL(videoSegment);
        post(new ARunnableS50S0100000_14(this, 217));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x016d, code lost:
    
        if (r6.LLFF.containsKey(((com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) com.bytedance.mt.protector.impl.collections.ListProtector.get(r0.getVideoSegmentList(), r1)).LJII(true)) == false) goto L17;
     */
    @Override // X.ViewOnTouchListenerC82857WfV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(X.C15070iV<java.lang.Integer, java.lang.Integer> r12) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82858WfW.LJJIJIL(X.0iV):void");
    }

    public final Drawable LJJIZ(boolean z) {
        Context context = this.LJLJJLL;
        o.LJIIIIZZ(context, "context");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
        int parseColor = ColorProtector.parseColor("#FFFFFF");
        float LIZ = C170576mj.LIZ(this.LJLJJLL, 2.0f);
        int i = 1;
        if (C173636rf.LIZIZ(this.LJLJJLL)) {
            if (!z) {
                z = true;
            } else {
                z = false;
            }
        }
        float[] fArr = new float[8];
        if (z) {
            fArr[0] = LIZ;
            fArr[1] = LIZ;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = LIZ;
            fArr[7] = LIZ;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = LIZ;
            fArr[3] = LIZ;
            fArr[4] = LIZ;
            fArr[5] = LIZ;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        Drawable LIZLLL = C78127UlP.LIZLLL(LJIIIIZZ, LJIIIIZZ, fArr);
        if (this.LLIFFJFJJ) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{LIZLLL});
            if (z) {
                layerDrawable.setLayerInset(0, (int) this.LLLI, 0, 0, 0);
            } else {
                layerDrawable.setLayerInset(0, 0, 0, (int) this.LLLI, 0);
            }
            return layerDrawable;
        }
        Drawable[] drawableArr = new Drawable[4];
        int i2 = 0;
        loop0: while (true) {
            Drawable drawable = LIZLLL;
            while (true) {
                drawableArr[i2] = drawable;
                i2++;
                if (i2 >= 4) {
                    break loop0;
                }
                if (i2 == 0) {
                    break;
                }
                drawable = C78127UlP.LIZJ(parseColor, parseColor, 0, 0);
            }
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        int i3 = (int) (this.LLJL / 3.0f);
        while (true) {
            float f = C82848WfM.LIZJ / 3.0f;
            float f2 = i * 2.0f;
            float f3 = 3 * 2.0f;
            float f4 = f3 - 1.0f;
            layerDrawable2.setLayerInset(i, (int) ((((f2 - 2.0f) / f4) + 1.0f) * f), i3, (int) ((((f3 - f2) / f4) + 1.0f) * f), i3);
            if (i != 3) {
                i++;
            } else {
                return layerDrawable2;
            }
        }
    }

    public final void setOnSelectMaxTime(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LLLII = interfaceC65784Pro;
    }

    public final void setOnSelectMinTime(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LLLIIII = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82858WfW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLI = C170576mj.LIZ(context, 6.0f);
        setLoadThumbnailDirectly(true);
    }

    @Override // X.ViewOnTouchListenerC82857WfV
    public final void LJJIIZI(int i, VideoSegment videoSegment) {
        if (!this.LLIFFJFJJ) {
            setEditViewHeight(false);
            this.LLIIIJ.setVisibility(0);
        }
        this.LLIIIL.setVisibility(8);
        this.LLIILII.LJZI();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LLIIIJ.LJLI(0);
                WF7 wf7 = this.LLIIL;
                HashMap<String, Float> hashMap = this.LLIIII.LIZIZ;
                if (!C78886Uxe.LJJIJ(wf7.LJLJJLL)) {
                    ((ArrayList) wf7.LJLJJLL).remove(videoSegment);
                    wf7.LJZL(hashMap);
                }
                this.LJLJLJ.LJLZ.setValue(videoSegment);
                return;
            }
            this.LLIIIJ.LJLI(0);
            this.LLIIL.LJZL(this.LLIIII.LIZIZ);
            this.LJLJLJ.LJLLLLLL.setValue(null);
            return;
        }
        this.LJLJLJ.LJLLLL.setValue(null);
    }

    public final long LJJJ(float f, long j) {
        if (this.LJLJLJ.kv0() != null && !this.LJLJLJ.kv0().isEmpty()) {
            List<VideoSegment> kv0 = this.LJLJLJ.kv0();
            o.LJIIIIZZ(kv0, "videoEditViewModel.originVideoList");
            long j2 = 0;
            for (VideoSegment videoSegment : kv0) {
                if (!videoSegment.isDeleted) {
                    float LJ = ((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / (videoSegment.LJIIIIZZ() * f);
                    float f2 = (float) j;
                    if (f2 <= LJ) {
                        return ((videoSegment.LJIIIIZZ() * f2) + ((float) j2)) * f;
                    }
                    j2 += videoSegment.LJ() - videoSegment.LJIIIZ();
                    j = f2 - LJ;
                }
            }
        }
        return 0L;
    }

    @Override // X.ViewOnTouchListenerC82857WfV, android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        if (this.LLIFFJFJJ) {
            setEnabled(true);
        }
        return super.onTouch(v, event);
    }
}
