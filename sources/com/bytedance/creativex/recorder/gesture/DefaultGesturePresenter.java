package com.bytedance.creativex.recorder.gesture;

import X.C1I1;
import X.C47959Irz;
import X.C82536WaK;
import X.C82537WaL;
import X.WXA;
import X.WXB;
import X.WXD;
import X.WXE;
import X.WXF;
import X.WXG;
import Y.ARunnableS18S0101000_14;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes15.dex */
public class DefaultGesturePresenter implements GenericLifecycleObserver, WXG, WXE {
    public WXF LJLJJLL;
    public final WXD LJLJL;
    public final int LJLJLLL;
    public boolean LJLIL = true;
    public final List<WXE> LJLILLLLZI = new ArrayList();
    public final TreeMap<Integer, HashSet<Integer>> LJLJI = new TreeMap<>();
    public final Map<Integer, WXA> LJLJJI = new ConcurrentHashMap();
    public final List<WXA> LJLJJL = new CopyOnWriteArrayList();
    public float LJLJLJ = 0.0f;
    public boolean LJLL = true;
    public boolean LJLLI = false;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            disAttachView();
        }
    }

    @Override // X.WXG
    public final void LIZ() {
        if (!this.LJLIL) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void LIZJ() {
        ((CopyOnWriteArrayList) this.LJLJJL).clear();
        ArrayList arrayList = new ArrayList();
        Iterator<HashSet<Integer>> it = this.LJLJI.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            ((CopyOnWriteArrayList) this.LJLJJL).add(((ConcurrentHashMap) this.LJLJJI).get(next));
        }
    }

    @Override // X.WXG
    public final void LJJJI() {
        if (!this.LJLIL) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // X.WXG
    public final void LJJJIL() {
        if (!this.LJLIL) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void disAttachView() {
        this.LJLJJLL.setOnGestureListener(null);
        this.LJLJJLL.setOnInterceptListener(null);
    }

    @Override // X.WXG
    public final void LJIIIIZZ(MotionEvent motionEvent) {
        if (!this.LJLIL) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXA wxa = (WXA) it.next();
            if (wxa != null) {
                wxa.LJ(motionEvent, 0);
            }
        }
    }

    @Override // X.WXG
    public final boolean LJJIIZI(MotionEvent motionEvent) {
        if (!this.LJLIL) {
            return false;
        }
        if (this.LJLLI && this.LJLJL != null) {
            this.LJLJJLL.postDelayed(new IDRunnableS6S0101000(3, this, 35), 100L);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.LJJIIZI(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.WXG
    public final boolean LJJIZ(float f) {
        if (!this.LJLIL) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.LJJIZ(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.WXG
    public final boolean LJJJ(MotionEvent motionEvent) {
        if ((!this.LJLIL) || !this.LJLL) {
            return false;
        }
        this.LJLL = false;
        new Handler().postDelayed(new ARunnableS18S0101000_14(1, this, 16), 300L);
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.LJJJ(motionEvent)) {
                return true;
            }
        }
        WXD wxd = this.LJLJL;
        if (wxd != null && wxd.i7()) {
            return true;
        }
        return false;
    }

    @Override // X.WXG
    public final boolean LJLI(C82537WaL c82537WaL) {
        if (!this.LJLIL) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.LJLI(c82537WaL)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.WXG
    public final boolean LJLJI(float f) {
        if (!this.LJLIL) {
            return false;
        }
        WXD wxd = this.LJLJL;
        if (wxd != null) {
            wxd.onScaleEnd();
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.LJLJI(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.WXG
    public final void LJLJJI(C82537WaL c82537WaL) {
        if (!this.LJLIL) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null) {
                wxb.LJLJJI(c82537WaL);
            }
        }
    }

    @Override // X.WXG
    public final boolean LLLLLLLZIL(C82536WaK c82536WaK) {
        if (!this.LJLIL) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.LLLLLLLZIL(c82536WaK)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.WXG
    public final boolean LLLLLLZ(float f) {
        if (!this.LJLIL) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.LLLLLLZ(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.WXG
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.LJLIL) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.onDown(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.WXG
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LJLIL) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.onScale(scaleGestureDetector)) {
                return true;
            }
        }
        WXD wxd = this.LJLJL;
        if (wxd != null) {
            scaleGestureDetector.getScaleFactor();
            if (wxd.j7()) {
                return true;
            }
        }
        WXD wxd2 = this.LJLJL;
        if (wxd2 == null) {
            return false;
        }
        return wxd2.onScale(scaleGestureDetector);
    }

    @Override // X.WXG
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LJLIL) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.onScaleBegin(scaleGestureDetector)) {
                return true;
            }
        }
        WXD wxd = this.LJLJL;
        if (wxd == null) {
            return false;
        }
        return wxd.onScaleBegin();
    }

    @Override // X.WXG
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!this.LJLIL) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.onSingleTapConfirmed(motionEvent)) {
                return true;
            }
        }
        WXD wxd = this.LJLJL;
        if (wxd != null && wxd.LIZ(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.WXG
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!this.LJLIL) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.onSingleTapUp(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.WXG
    public final void LLLLLLZZ(MotionEvent motionEvent, int[] iArr) {
        if (!this.LJLIL) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXA wxa = (WXA) it.next();
            if (wxa != null) {
                wxa.LIZLLL(motionEvent, iArr);
            }
        }
    }

    @Override // X.WXG
    public final void LLLLLZ(MotionEvent motionEvent, int[] iArr) {
        if (!this.LJLIL) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXA wxa = (WXA) it.next();
            if (wxa != null) {
                wxa.LLLLLZ(motionEvent, iArr);
            }
        }
    }

    @Override // X.WXG
    public final void LLLLLZL(MotionEvent motionEvent, int[] iArr) {
        if (!this.LJLIL) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXA wxa = (WXA) it.next();
            if (wxa != null) {
                wxa.LLLLLZL(motionEvent, iArr);
            }
        }
    }

    @Override // X.WXG
    public final void LLLLZ(MotionEvent motionEvent, int[] iArr) {
        if (!this.LJLIL) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXA wxa = (WXA) it.next();
            if (wxa != null) {
                wxa.LLLLZ(motionEvent, iArr);
            }
        }
    }

    @Override // X.WXG
    public final void LLLLZI(MotionEvent motionEvent, int[] iArr) {
        if (!this.LJLIL) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXA wxa = (WXA) it.next();
            if (wxa != null) {
                wxa.LLLLZI(motionEvent, iArr);
            }
        }
    }

    @Override // X.WXE
    public final boolean LIZIZ(MotionEvent motionEvent, float f, float f2) {
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            if (((WXE) it.next()).LIZIZ(motionEvent, f, f2)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL(WXA wxa, int i, int i2) {
        ((ConcurrentHashMap) this.LJLJJI).put(Integer.valueOf(i), wxa);
        HashSet<Integer> hashSet = this.LJLJI.get(Integer.valueOf(i2));
        if (hashSet != null) {
            hashSet.add(Integer.valueOf(i));
        } else {
            HashSet<Integer> hashSet2 = new HashSet<>(1);
            hashSet2.add(Integer.valueOf(i));
            this.LJLJI.put(Integer.valueOf(i2), hashSet2);
        }
        LIZJ();
    }

    @Override // X.WXG
    public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
        if (!this.LJLIL) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.LJJLIL(c82537WaL, f, f2)) {
                return true;
            }
        }
        return false;
    }

    public DefaultGesturePresenter(Context context, LifecycleOwner lifecycleOwner, WXD wxd, View view) {
        this.LJLJL = wxd;
        if (view instanceof WXF) {
            WXF wxf = (WXF) view;
            this.LJLJJLL = wxf;
            wxf.setOnGestureListener(this);
            this.LJLJJLL.setOnInterceptListener(this);
        }
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LJLJLLL = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    @Override // X.WXG
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WXB wxb;
        boolean z = false;
        this.LJLLI = false;
        if (!this.LJLIL) {
            return false;
        }
        if (((ConcurrentHashMap) this.LJLJJI).containsKey(13)) {
            wxb = (WXB) ((ConcurrentHashMap) this.LJLJJI).get(13);
            if (wxb != null && wxb.onFling(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        } else {
            wxb = null;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb2 = (WXB) it.next();
            if (wxb == null || wxb2 != wxb) {
                if (wxb2 != null && wxb2.onFling(motionEvent, motionEvent2, f, f2)) {
                    return true;
                }
            }
        }
        if (motionEvent != null && motionEvent2 != null && C47959Irz.LIZ(motionEvent2, motionEvent.getX()) > C1I1.LIZIZ(motionEvent2, motionEvent.getY())) {
            WXD wxd = this.LJLJL;
            if (wxd != null && wxd.h7(f, this.LJLJLJ)) {
                z = true;
            }
            this.LJLJLJ = 0.0f;
        }
        return z;
    }

    @Override // X.WXG
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        WXD wxd;
        if (!this.LJLIL) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            WXB wxb = (WXB) it.next();
            if (wxb != null && wxb.onScroll(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        int LIZ = (int) C47959Irz.LIZ(motionEvent2, motionEvent.getX());
        int LIZIZ = (int) C1I1.LIZIZ(motionEvent2, motionEvent.getY());
        int i = this.LJLJLLL;
        if (LIZ > i && LIZ > LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLI = z;
        if (LIZ > i && LIZ > LIZIZ) {
            float width = this.LJLJLJ + (f / this.LJLJJLL.getWidth());
            this.LJLJLJ = width;
            float min = Math.min(width, 1.0f);
            this.LJLJLJ = min;
            float max = Math.max(min, -1.0f);
            this.LJLJLJ = max;
            WXD wxd2 = this.LJLJL;
            if (wxd2 != null && wxd2.k7(max)) {
                return true;
            }
            return false;
        }
        if (LIZ < LIZIZ && (wxd = this.LJLJL) != null && wxd.setExposureSeekBarProgress(f2)) {
            return true;
        }
        return false;
    }
}
