package X;

import X.InterfaceC191727fk;
import Y.IDRunnableS91S0100000_34;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.RemoteException;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.aPu, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public class C93378aPu<T extends InterfaceC191727fk> implements InterfaceC93351aPT<T> {
    public static final int[] LJIIZILJ = {10, 20, 50, 100, 200, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, 1000};
    public static final TimeInterpolator LJIJ = new DecelerateInterpolator();
    public final C68824Qzk LIZ;
    public final C93363aPf LIZIZ;
    public final C93364aPg<T> LIZJ;
    public ShapeDrawable LJI;
    public java.util.Set<? extends InterfaceC199697sb<T>> LJIIJJI;
    public float LJIILIIL;
    public InterfaceC93346aPO<T> LJIILL;
    public InterfaceC93347aPP<T> LJIILLIIL;
    public final Executor LJFF = C16880lQ.LLLLZLLIL();
    public java.util.Set<C93353aPV> LJII = Collections.newSetFromMap(new ConcurrentHashMap());
    public final SparseArray<C68772Qyu> LJIIIIZZ = new SparseArray<>();
    public final C93352aPU<T> LJIIIZ = new C93352aPU<>();
    public final int LJIIJ = 4;
    public final C93352aPU<InterfaceC199697sb<T>> LJIIL = new C93352aPU<>();
    public final C93378aPu<T>.i LJIILJJIL = new i();
    public final boolean LIZLLL = true;
    public final long LJ = 300;

    /* renamed from: X.aPu$f */
    /* loaded from: classes32.dex */
    public class f extends Handler implements MessageQueue.IdleHandler {
        public final Lock LJLIL;
        public final Condition LJLILLLLZI;
        public final Queue<C93378aPu<T>.d> LJLJI;
        public final Queue<C93378aPu<T>.d> LJLJJI;
        public final Queue<R0A> LJLJJL;
        public final Queue<R0A> LJLJJLL;
        public final Queue<C93378aPu<T>.c> LJLJL;
        public boolean LJLJLJ;

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public final boolean LIZJ() {
            boolean z;
            try {
                ((ReentrantLock) this.LJLIL).lock();
                if (this.LJLJI.isEmpty() && this.LJLJJI.isEmpty() && this.LJLJJLL.isEmpty() && this.LJLJJL.isEmpty()) {
                    if (this.LJLJL.isEmpty()) {
                        z = false;
                        return z;
                    }
                }
                z = true;
                return z;
            } finally {
                ((ReentrantLock) this.LJLIL).unlock();
            }
        }

        public final void LIZLLL() {
            if (!this.LJLJJLL.isEmpty()) {
                LJFF((R0A) ((LinkedList) this.LJLJJLL).poll());
                return;
            }
            if (!this.LJLJL.isEmpty()) {
                c cVar = (c) ((LinkedList) this.LJLJL).poll();
                cVar.getClass();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(C93378aPu.LJIJ);
                ofFloat.setDuration(C93378aPu.this.LJ);
                ofFloat.addUpdateListener(cVar);
                ofFloat.addListener(cVar);
                ofFloat.start();
                return;
            }
            if (!this.LJLJJI.isEmpty()) {
                ((d) ((LinkedList) this.LJLJJI).poll()).LIZ(this);
            } else if (!this.LJLJI.isEmpty()) {
                ((d) ((LinkedList) this.LJLJI).poll()).LIZ(this);
            } else {
                if (this.LJLJJL.isEmpty()) {
                    return;
                }
                LJFF((R0A) ((LinkedList) this.LJLJJL).poll());
            }
        }

        public final void LJI() {
            while (LIZJ()) {
                sendEmptyMessage(0);
                ((ReentrantLock) this.LJLIL).lock();
                try {
                    try {
                        if (LIZJ()) {
                            this.LJLILLLLZI.await();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    ((ReentrantLock) this.LJLIL).unlock();
                }
            }
        }

        public f() {
            super(C16880lQ.LLJJJJ());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.LJLIL = reentrantLock;
            this.LJLILLLLZI = reentrantLock.newCondition();
            this.LJLJI = new LinkedList();
            this.LJLJJI = new LinkedList();
            this.LJLJJL = new LinkedList();
            this.LJLJJLL = new LinkedList();
            this.LJLJL = new LinkedList();
        }

        public final void LJFF(R0A r0a) {
            ((ArrayList) C93378aPu.this.LIZJ.LIZLLL).remove(r0a);
            C93378aPu.this.LJIIIZ.LIZ(r0a);
            C93378aPu.this.LJIIL.LIZ(r0a);
            C93378aPu.this.LIZJ.LIZ.LJIIIIZZ(r0a);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (!this.LJLJLJ) {
                C16880lQ.LJLI(Looper.myQueue(), this);
                this.LJLJLJ = true;
            }
            removeMessages(0);
            ((ReentrantLock) this.LJLIL).lock();
            int i = 0;
            do {
                try {
                    LIZLLL();
                    i++;
                } finally {
                    ((ReentrantLock) this.LJLIL).unlock();
                }
            } while (i < 10);
            if (!LIZJ()) {
                this.LJLJLJ = false;
                Looper.myQueue().removeIdleHandler(this);
                this.LJLILLLLZI.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10L);
            }
        }

        public final void LIZ(boolean z, C93378aPu<T>.d dVar) {
            ((ReentrantLock) this.LJLIL).lock();
            sendEmptyMessage(0);
            if (z) {
                ((LinkedList) this.LJLJJI).add(dVar);
            } else {
                ((LinkedList) this.LJLJI).add(dVar);
            }
            ((ReentrantLock) this.LJLIL).unlock();
        }

        public final void LJ(boolean z, R0A r0a) {
            ((ReentrantLock) this.LJLIL).lock();
            sendEmptyMessage(0);
            if (z) {
                ((LinkedList) this.LJLJJLL).add(r0a);
            } else {
                ((LinkedList) this.LJLJJL).add(r0a);
            }
            ((ReentrantLock) this.LJLIL).unlock();
        }

        public final void LIZIZ(C93353aPV c93353aPV, LatLng latLng, LatLng latLng2) {
            ((ReentrantLock) this.LJLIL).lock();
            ((LinkedList) this.LJLJL).add(new c(c93353aPV, latLng, latLng2));
            ((ReentrantLock) this.LJLIL).unlock();
        }
    }

    /* renamed from: X.aPu$h */
    /* loaded from: classes32.dex */
    public class h implements Runnable {
        public final java.util.Set<? extends InterfaceC199697sb<T>> LJLIL;
        public Runnable LJLILLLLZI;
        public C30941Ji LJLJI;
        public C93359aPb LJLJJI;
        public float LJLJJL;

        public final void LIZ() {
            java.util.Set emptySet;
            java.util.Set emptySet2;
            java.util.Set emptySet3;
            java.util.Set emptySet4;
            boolean z;
            LatLngBounds latLngBounds;
            ArrayList arrayList;
            LatLng latLng;
            java.util.Set<? extends InterfaceC199697sb<T>> set = C93378aPu.this.LJIIJJI;
            if (set != null) {
                emptySet = Collections.unmodifiableSet(set);
            } else {
                emptySet = Collections.emptySet();
            }
            C93378aPu c93378aPu = C93378aPu.this;
            java.util.Set<? extends InterfaceC199697sb<T>> set2 = this.LJLIL;
            c93378aPu.getClass();
            if (set2 != null) {
                emptySet2 = Collections.unmodifiableSet(set2);
            } else {
                emptySet2 = Collections.emptySet();
            }
            boolean z2 = true;
            if (!(!emptySet2.equals(emptySet))) {
                ((IDRunnableS91S0100000_34) this.LJLILLLLZI).run();
                return;
            }
            java.util.Set<? extends InterfaceC199697sb<T>> set3 = C93378aPu.this.LJIIJJI;
            if (set3 != null) {
                emptySet3 = Collections.unmodifiableSet(set3);
            } else {
                emptySet3 = Collections.emptySet();
            }
            C93378aPu c93378aPu2 = C93378aPu.this;
            java.util.Set<? extends InterfaceC199697sb<T>> set4 = this.LJLIL;
            c93378aPu2.getClass();
            if (set4 != null) {
                emptySet4 = Collections.unmodifiableSet(set4);
            } else {
                emptySet4 = Collections.emptySet();
            }
            boolean z3 = false;
            if (emptySet3.size() != emptySet4.size()) {
                z = true;
            } else {
                z = false;
            }
            f fVar = new f();
            float f = this.LJLJJL;
            C93378aPu c93378aPu3 = C93378aPu.this;
            float f2 = c93378aPu3.LJIILIIL;
            if (f > f2) {
                z3 = true;
            }
            float f3 = f - f2;
            java.util.Set<C93353aPV> set5 = c93378aPu3.LJII;
            try {
                C30941Ji c30941Ji = this.LJLJI;
                c30941Ji.getClass();
                try {
                    latLngBounds = ((InterfaceC68804QzQ) c30941Ji.LJLIL).LJJIJL().latLngBounds;
                } catch (RemoteException e) {
                    throw new C68463Qtv(e);
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
                C68785Qz7 c68785Qz7 = new C68785Qz7();
                LatLng latLng2 = new LatLng(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                c68785Qz7.LIZ = Math.min(c68785Qz7.LIZ, latLng2.latitude);
                c68785Qz7.LIZIZ = Math.max(c68785Qz7.LIZIZ, latLng2.latitude);
                double d = latLng2.longitude;
                if (Double.isNaN(c68785Qz7.LIZJ)) {
                    c68785Qz7.LIZJ = d;
                    c68785Qz7.LIZLLL = d;
                } else {
                    double d2 = c68785Qz7.LIZJ;
                    double d3 = c68785Qz7.LIZLLL;
                    if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                        if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                            c68785Qz7.LIZJ = d;
                        } else {
                            c68785Qz7.LIZLLL = d;
                        }
                    }
                }
                QH7.LJIIJ("no included points", !Double.isNaN(c68785Qz7.LIZJ));
                latLngBounds = new LatLngBounds(new LatLng(c68785Qz7.LIZ, c68785Qz7.LIZJ), new LatLng(c68785Qz7.LIZIZ, c68785Qz7.LIZLLL));
            }
            C93378aPu c93378aPu4 = C93378aPu.this;
            if (c93378aPu4.LJIIJJI != null && c93378aPu4.LIZLLL) {
                arrayList = new ArrayList();
                for (InterfaceC199697sb<T> interfaceC199697sb : C93378aPu.this.LJIIJJI) {
                    if (C93378aPu.this.LJIIZILJ(interfaceC199697sb) && latLngBounds.LJJJJL(C93345aPN.LIZ(interfaceC199697sb.getPosition()))) {
                        arrayList.add(this.LJLJJI.LIZIZ(C93345aPN.LIZ(interfaceC199697sb.getPosition())));
                    }
                }
            } else {
                arrayList = null;
            }
            java.util.Set<C93353aPV> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (InterfaceC199697sb<T> interfaceC199697sb2 : this.LJLIL) {
                boolean LJJJJL = latLngBounds.LJJJJL(C93345aPN.LIZ(interfaceC199697sb2.getPosition()));
                if (z3 && LJJJJL && C93378aPu.this.LIZLLL) {
                    C93358aPa LJIIIZ = C93378aPu.this.LJIIIZ(arrayList, this.LJLJJI.LIZIZ(C93345aPN.LIZ(interfaceC199697sb2.getPosition())));
                    if (LJIIIZ != null) {
                        if (z) {
                            latLng = this.LJLJJI.LIZ(LJIIIZ);
                        } else {
                            latLng = null;
                        }
                        fVar.LIZ(z2, new d(interfaceC199697sb2, newSetFromMap, latLng));
                    } else {
                        fVar.LIZ(z2, new d(interfaceC199697sb2, newSetFromMap, null));
                    }
                } else {
                    fVar.LIZ(LJJJJL, new d(interfaceC199697sb2, newSetFromMap, null));
                    z2 = true;
                }
            }
            ArrayList arrayList2 = null;
            fVar.LJI();
            set5.removeAll(newSetFromMap);
            if (C93378aPu.this.LIZLLL) {
                arrayList2 = new ArrayList();
                for (InterfaceC199697sb<T> interfaceC199697sb3 : this.LJLIL) {
                    if (C93378aPu.this.LJIIZILJ(interfaceC199697sb3) && latLngBounds.LJJJJL(C93345aPN.LIZ(interfaceC199697sb3.getPosition()))) {
                        arrayList2.add(this.LJLJJI.LIZIZ(C93345aPN.LIZ(interfaceC199697sb3.getPosition())));
                    }
                }
            }
            for (C93353aPV c93353aPV : set5) {
                boolean LJJJJL2 = latLngBounds.LJJJJL(c93353aPV.LIZIZ);
                if (!z3 && f3 > -3.0f && LJJJJL2 && C93378aPu.this.LIZLLL) {
                    C93358aPa LJIIIZ2 = C93378aPu.this.LJIIIZ(arrayList2, this.LJLJJI.LIZIZ(c93353aPV.LIZIZ));
                    if (LJIIIZ2 != null && z) {
                        LatLng LIZ = this.LJLJJI.LIZ(LJIIIZ2);
                        LatLng latLng3 = c93353aPV.LIZIZ;
                        ((ReentrantLock) fVar.LJLIL).lock();
                        c cVar = new c(c93353aPV, latLng3, LIZ);
                        cVar.LJLJJLL = C93378aPu.this.LIZJ.LIZ;
                        cVar.LJLJJL = true;
                        ((LinkedList) fVar.LJLJL).add(cVar);
                        ((ReentrantLock) fVar.LJLIL).unlock();
                    } else {
                        fVar.LJ(true, c93353aPV.LIZ);
                    }
                } else {
                    fVar.LJ(LJJJJL2, c93353aPV.LIZ);
                }
            }
            fVar.LJI();
            C93378aPu c93378aPu5 = C93378aPu.this;
            c93378aPu5.LJII = newSetFromMap;
            c93378aPu5.LJIIJJI = this.LJLIL;
            c93378aPu5.LJIILIIL = f;
            ((IDRunnableS91S0100000_34) this.LJLILLLLZI).run();
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

        public h(java.util.Set set) {
            this.LJLIL = set;
        }
    }

    @Override // X.InterfaceC93351aPT
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC93351aPT
    public final void LJFF() {
    }

    @Override // X.InterfaceC93351aPT
    public final void LJI() {
    }

    @Override // X.InterfaceC93351aPT
    public final void LJIIIIZZ() {
    }

    public void LJIILIIL(T t, R0A r0a) {
    }

    public void LJIILL(InterfaceC199697sb<T> interfaceC199697sb, R0A r0a) {
    }

    @Override // X.InterfaceC93351aPT
    public final void LIZ() {
        C93364aPg<T> c93364aPg = this.LIZJ;
        C93389aQ5 c93389aQ5 = c93364aPg.LIZIZ;
        c93389aQ5.LJ = new C93376aPs(this);
        c93389aQ5.LIZJ = new C93377aPt(this);
        c93389aQ5.LIZLLL = new R0F() { // from class: X.aPp
            @Override // X.R0F
            public final void LIZ(R0A r0a) {
                C93378aPu.this.getClass();
            }
        };
        C93389aQ5 c93389aQ52 = c93364aPg.LIZJ;
        c93389aQ52.LJ = new R0G() { // from class: X.aPq
            @Override // X.R0G
            public final boolean LIZIZ(R0A r0a) {
                C93378aPu c93378aPu = C93378aPu.this;
                InterfaceC93346aPO<T> interfaceC93346aPO = c93378aPu.LJIILL;
                if (interfaceC93346aPO != 0 && interfaceC93346aPO.LIZ((InterfaceC199697sb) ((HashMap) c93378aPu.LJIIL.LIZIZ).get(r0a))) {
                    return true;
                }
                return false;
            }
        };
        c93389aQ52.LIZJ = new R0E() { // from class: X.aPr
            @Override // X.R0E
            public final void LIZLLL(R0A r0a) {
                C93378aPu.this.getClass();
            }
        };
        c93389aQ52.LIZLLL = new R0F() { // from class: X.aPp
            @Override // X.R0F
            public final void LIZ(R0A r0a) {
                C93378aPu.this.getClass();
            }
        };
    }

    @Override // X.InterfaceC93351aPT
    public final void LIZIZ() {
        C93364aPg<T> c93364aPg = this.LIZJ;
        C93389aQ5 c93389aQ5 = c93364aPg.LIZIZ;
        c93389aQ5.LJ = null;
        c93389aQ5.LIZJ = null;
        c93389aQ5.LIZLLL = null;
        C93389aQ5 c93389aQ52 = c93364aPg.LIZJ;
        c93389aQ52.LJ = null;
        c93389aQ52.LIZJ = null;
        c93389aQ52.LIZLLL = null;
    }

    /* renamed from: X.aPu$c */
    /* loaded from: classes32.dex */
    public class c extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public final C93353aPV LJLIL;
        public final R0A LJLILLLLZI;
        public final LatLng LJLJI;
        public final LatLng LJLJJI;
        public boolean LJLJJL;
        public C93390aQ6 LJLJJLL;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.LJLJJL) {
                C93378aPu.this.LJIIIZ.LIZ(this.LJLILLLLZI);
                ((ArrayList) C93378aPu.this.LIZJ.LIZLLL).remove(this.LJLILLLLZI);
                C93378aPu.this.LJIIL.LIZ(this.LJLILLLLZI);
                this.LJLJJLL.LJIIIIZZ(this.LJLILLLLZI);
            }
            this.LJLIL.LIZIZ = this.LJLJJI;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.LJLJJI;
            double d = latLng.latitude;
            LatLng latLng2 = this.LJLJI;
            double d2 = latLng2.latitude;
            double d3 = animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double d5 = latLng.longitude - latLng2.longitude;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            LatLng latLng3 = new LatLng(d4, (d5 * d3) + this.LJLJI.longitude);
            R0A r0a = this.LJLILLLLZI;
            r0a.getClass();
            try {
                r0a.LIZ.LLIZLLLIL(latLng3);
            } catch (RemoteException e) {
                throw new C68463Qtv(e);
            }
        }

        public c(C93353aPV c93353aPV, LatLng latLng, LatLng latLng2) {
            this.LJLIL = c93353aPV;
            this.LJLILLLLZI = c93353aPV.LIZ;
            this.LJLJI = latLng;
            this.LJLJJI = latLng2;
        }
    }

    /* renamed from: X.aPu$d */
    /* loaded from: classes32.dex */
    public class d {
        public final InterfaceC199697sb<T> LIZ;
        public final java.util.Set<C93353aPV> LIZIZ;
        public final LatLng LIZJ;

        public final void LIZ(C93378aPu<T>.f fVar) {
            C93353aPV c93353aPV;
            C93353aPV c93353aPV2;
            R0A r0a = null;
            if (!C93378aPu.this.LJIIZILJ(this.LIZ)) {
                for (T t : this.LIZ.getItems()) {
                    R0A r0a2 = (R0A) ((HashMap) C93378aPu.this.LJIIIZ.LIZ).get(t);
                    if (r0a2 == null) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        LatLng latLng = this.LIZJ;
                        if (latLng != null) {
                            markerOptions.LJJJJL(latLng);
                        } else {
                            markerOptions.LJJJJL(C93345aPN.LIZ(t.getPosition()));
                            if (t.LIZJ() != null) {
                                markerOptions.zzn = t.LIZJ().floatValue();
                            }
                        }
                        C93378aPu.this.LJIIJJI(t, markerOptions);
                        C93389aQ5 c93389aQ5 = C93378aPu.this.LIZJ.LIZIZ;
                        C68824Qzk c68824Qzk = c93389aQ5.LJFF.LIZ;
                        c68824Qzk.getClass();
                        try {
                            R04 LJLJJI = c68824Qzk.LIZ.LJLJJI(markerOptions);
                            if (LJLJJI != null) {
                                r0a2 = new R0A(LJLJJI);
                            } else {
                                r0a2 = null;
                            }
                            c93389aQ5.LIZ.add(r0a2);
                            ((HashMap) c93389aQ5.LIZIZ.LIZIZ).put(r0a2, c93389aQ5);
                            ((ArrayList) C93378aPu.this.LIZJ.LIZLLL).add(r0a2);
                            c93353aPV2 = new C93353aPV(r0a2);
                            C93352aPU<T> c93352aPU = C93378aPu.this.LJIIIZ;
                            ((HashMap) c93352aPU.LIZ).put(t, r0a2);
                            ((HashMap) c93352aPU.LIZIZ).put(r0a2, t);
                            LatLng latLng2 = this.LIZJ;
                            if (latLng2 != null) {
                                fVar.LIZIZ(c93353aPV2, latLng2, C93345aPN.LIZ(t.getPosition()));
                            }
                        } catch (RemoteException e) {
                            throw new C68463Qtv(e);
                        }
                    } else {
                        c93353aPV2 = new C93353aPV(r0a2);
                        C93378aPu.this.LJIILJJIL(t, r0a2);
                    }
                    C93378aPu.this.LJIILIIL(t, r0a2);
                    this.LIZIZ.add(c93353aPV2);
                }
                return;
            }
            R0A r0a3 = (R0A) ((HashMap) C93378aPu.this.LJIIL.LIZ).get(this.LIZ);
            if (r0a3 == null) {
                MarkerOptions markerOptions2 = new MarkerOptions();
                LatLng latLng3 = this.LIZJ;
                if (latLng3 == null) {
                    latLng3 = C93345aPN.LIZ(this.LIZ.getPosition());
                }
                markerOptions2.LJJJJL(latLng3);
                C93378aPu.this.LJIIL(this.LIZ, markerOptions2);
                C93389aQ5 c93389aQ52 = C93378aPu.this.LIZJ.LIZJ;
                C68824Qzk c68824Qzk2 = c93389aQ52.LJFF.LIZ;
                c68824Qzk2.getClass();
                try {
                    R04 LJLJJI2 = c68824Qzk2.LIZ.LJLJJI(markerOptions2);
                    if (LJLJJI2 != null) {
                        r0a = new R0A(LJLJJI2);
                    }
                    c93389aQ52.LIZ.add(r0a);
                    ((HashMap) c93389aQ52.LIZIZ.LIZIZ).put(r0a, c93389aQ52);
                    ((ArrayList) C93378aPu.this.LIZJ.LIZLLL).add(r0a);
                    C93352aPU<InterfaceC199697sb<T>> c93352aPU2 = C93378aPu.this.LJIIL;
                    InterfaceC199697sb<T> interfaceC199697sb = this.LIZ;
                    ((HashMap) c93352aPU2.LIZ).put(interfaceC199697sb, r0a);
                    ((HashMap) c93352aPU2.LIZIZ).put(r0a, interfaceC199697sb);
                    c93353aPV = new C93353aPV(r0a);
                    LatLng latLng4 = this.LIZJ;
                    if (latLng4 != null) {
                        fVar.LIZIZ(c93353aPV, latLng4, C93345aPN.LIZ(this.LIZ.getPosition()));
                    }
                    r0a3 = r0a;
                } catch (RemoteException e2) {
                    throw new C68463Qtv(e2);
                }
            } else {
                c93353aPV = new C93353aPV(r0a3);
                C93378aPu.this.LJIILLIIL(this.LIZ, r0a3);
            }
            C93378aPu.this.LJIILL(this.LIZ, r0a3);
            this.LIZIZ.add(c93353aPV);
        }

        public d(InterfaceC199697sb<T> interfaceC199697sb, java.util.Set<C93353aPV> set, LatLng latLng) {
            this.LIZ = interfaceC199697sb;
            this.LIZIZ = set;
            this.LIZJ = latLng;
        }
    }

    /* renamed from: X.aPu$i */
    /* loaded from: classes32.dex */
    public class i extends Handler {
        public boolean LIZ;
        public C93378aPu<T>.h LIZIZ;

        public i() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C93378aPu<T>.h hVar;
            if (message.what == 1) {
                this.LIZ = false;
                if (this.LIZIZ != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.LIZ || this.LIZIZ == null) {
                return;
            }
            C30941Ji LIZLLL = C93378aPu.this.LIZ.LIZLLL();
            synchronized (this) {
                hVar = this.LIZIZ;
                this.LIZIZ = null;
                this.LIZ = true;
            }
            hVar.LJLILLLLZI = new IDRunnableS91S0100000_34(this, 0);
            hVar.LJLJI = LIZLLL;
            hVar.LJLJJL = C93378aPu.this.LIZ.LIZJ().zoom;
            hVar.LJLJJI = new C93359aPb(Math.pow(2.0d, Math.min(r1, C93378aPu.this.LJIILIIL)) * 256.0d);
            C93378aPu.this.LJFF.execute(hVar);
        }
    }

    @Override // X.InterfaceC93351aPT
    public final void LIZJ(java.util.Set<? extends InterfaceC199697sb<T>> set) {
        C93378aPu<T>.i iVar = this.LJIILJJIL;
        synchronized (iVar) {
            iVar.LIZIZ = new h(set);
        }
        iVar.sendEmptyMessage(0);
    }

    @Override // X.InterfaceC93351aPT
    public final void LJ(InterfaceC93346aPO<T> interfaceC93346aPO) {
        this.LJIILL = interfaceC93346aPO;
    }

    @Override // X.InterfaceC93351aPT
    public final void LJII(InterfaceC93347aPP<T> interfaceC93347aPP) {
        this.LJIILLIIL = interfaceC93347aPP;
    }

    public final C68772Qyu LJIIJ(InterfaceC199697sb<T> interfaceC199697sb) {
        String LIZIZ;
        int size = interfaceC199697sb.getSize();
        int[] iArr = LJIIZILJ;
        if (size > iArr[0]) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (size < iArr[i3]) {
                    size = iArr[i2];
                    break;
                }
                i2 = i3;
                if (i2 >= 6) {
                    size = iArr[6];
                    break;
                }
            }
        }
        C68772Qyu c68772Qyu = this.LJIIIIZZ.get(size);
        if (c68772Qyu == null) {
            Paint paint = this.LJI.getPaint();
            float min = 300.0f - Math.min(size, 300.0f);
            paint.setColor(Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f}));
            C93363aPf c93363aPf = this.LIZIZ;
            Context context = c93363aPf.LIZ;
            TextView textView = c93363aPf.LIZLLL;
            if (textView != null) {
                textView.setTextAppearance(context, R.style.adg);
            }
            C93363aPf c93363aPf2 = this.LIZIZ;
            if (size < iArr[0]) {
                LIZIZ = String.valueOf(size);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(size);
                LIZ.append("+");
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            TextView textView2 = c93363aPf2.LIZLLL;
            if (textView2 != null) {
                textView2.setText(LIZIZ);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            c93363aPf2.LIZIZ.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredWidth = c93363aPf2.LIZIZ.getMeasuredWidth();
            int measuredHeight = c93363aPf2.LIZIZ.getMeasuredHeight();
            c93363aPf2.LIZIZ.layout(0, 0, measuredWidth, measuredHeight);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            c93363aPf2.LIZIZ.draw(new Canvas(createBitmap));
            C68772Qyu LJIILJJIL = C78949Uyf.LJIILJJIL(createBitmap);
            this.LJIIIIZZ.put(size, LJIILJJIL);
            return LJIILJJIL;
        }
        return c68772Qyu;
    }

    public boolean LJIIZILJ(InterfaceC199697sb<T> interfaceC199697sb) {
        if (interfaceC199697sb.getSize() >= this.LJIIJ) {
            return true;
        }
        return false;
    }

    public final C93358aPa LJIIIZ(List list, C93394aQA c93394aQA) {
        C93358aPa c93358aPa = null;
        if (list != null && !list.isEmpty()) {
            int LIZJ = this.LIZJ.LJ.LIZJ();
            double d2 = LIZJ * LIZJ;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C93358aPa c93358aPa2 = (C93358aPa) it.next();
                double d3 = c93358aPa2.LIZ - c93394aQA.LIZ;
                double d4 = c93358aPa2.LIZIZ - c93394aQA.LIZIZ;
                double d5 = (d3 * d3) + (d4 * d4);
                if (d5 < d2) {
                    c93358aPa = c93358aPa2;
                    d2 = d5;
                }
            }
        }
        return c93358aPa;
    }

    public void LJIIJJI(T t, MarkerOptions markerOptions) {
        if (t.getTitle() != null) {
            t.LIZIZ();
        }
        if (t.getTitle() != null) {
            markerOptions.zzb = t.getTitle();
        } else {
            t.LIZIZ();
        }
    }

    public void LJIIL(InterfaceC199697sb<T> interfaceC199697sb, MarkerOptions markerOptions) {
        markerOptions.zzd = LJIIJ(interfaceC199697sb);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIILJJIL(T r4, X.R0A r5) {
        /*
            r3 = this;
            java.lang.String r0 = r4.getTitle()
            if (r0 == 0) goto L9
            r4.LIZIZ()
        L9:
            r4.LIZIZ()
            java.lang.String r0 = r4.getTitle()
            if (r0 == 0) goto L3b
            java.lang.String r1 = r4.getTitle()
            X.R04 r0 = r5.LIZ     // Catch: android.os.RemoteException -> L34
            java.lang.String r0 = r0.LJIIJ()     // Catch: android.os.RemoteException -> L34
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r1 = r4.getTitle()
            X.R04 r0 = r5.LIZ     // Catch: android.os.RemoteException -> L2d
            r0.LLJJJJJIL(r1)     // Catch: android.os.RemoteException -> L2d
            r2 = 1
            goto L3c
        L2d:
            r1 = move-exception
            X.Qtv r0 = new X.Qtv
            r0.<init>(r1)
            throw r0
        L34:
            r1 = move-exception
            X.Qtv r0 = new X.Qtv
            r0.<init>(r1)
            throw r0
        L3b:
            r2 = 0
        L3c:
            X.R04 r0 = r5.LIZ     // Catch: android.os.RemoteException -> L9a
            com.google.android.gms.maps.model.LatLng r1 = r0.LJII()     // Catch: android.os.RemoteException -> L9a
            X.7fj r0 = r4.getPosition()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            X.7fj r0 = r4.getPosition()
            com.google.android.gms.maps.model.LatLng r1 = X.C93345aPN.LIZ(r0)
            X.R04 r0 = r5.LIZ     // Catch: android.os.RemoteException -> L74
            r0.LLIZLLLIL(r1)     // Catch: android.os.RemoteException -> L74
            java.lang.Float r0 = r4.LIZJ()
            if (r0 == 0) goto L7d
            java.lang.Float r0 = r4.LIZJ()
            float r1 = r0.floatValue()
            X.R04 r0 = r5.LIZ     // Catch: android.os.RemoteException -> L6d
            r0.LLLIILIL(r1)     // Catch: android.os.RemoteException -> L6d
            goto L7d
        L6d:
            r1 = move-exception
            X.Qtv r0 = new X.Qtv
            r0.<init>(r1)
            throw r0
        L74:
            r1 = move-exception
            X.Qtv r0 = new X.Qtv
            r0.<init>(r1)
            throw r0
        L7b:
            if (r2 == 0) goto L99
        L7d:
            X.R04 r0 = r5.LIZ     // Catch: android.os.RemoteException -> L92
            boolean r0 = r0.LJJJJI()     // Catch: android.os.RemoteException -> L92
            if (r0 == 0) goto L99
            X.R04 r0 = r5.LIZ     // Catch: android.os.RemoteException -> L8b
            r0.LJJJ()     // Catch: android.os.RemoteException -> L8b
            goto L99
        L8b:
            r1 = move-exception
            X.Qtv r0 = new X.Qtv
            r0.<init>(r1)
            throw r0
        L92:
            r1 = move-exception
            X.Qtv r0 = new X.Qtv
            r0.<init>(r1)
            throw r0
        L99:
            return
        L9a:
            r1 = move-exception
            X.Qtv r0 = new X.Qtv
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93378aPu.LJIILJJIL(X.7fk, X.R0A):void");
    }

    public void LJIILLIIL(InterfaceC199697sb<T> interfaceC199697sb, R0A r0a) {
        try {
            r0a.LIZ.LLLILZLLLI(LJIIJ(interfaceC199697sb).LIZ);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public C93378aPu(Context context, C68824Qzk c68824Qzk, C93364aPg<T> c93364aPg) {
        TextView textView;
        this.LIZ = c68824Qzk;
        float f2 = context.getResources().getDisplayMetrics().density;
        C93363aPf c93363aPf = new C93363aPf(context);
        this.LIZIZ = c93363aPf;
        C93400aQG c93400aQG = new C93400aQG(context);
        c93400aQG.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c93400aQG.setId(R.id.nl7);
        int i2 = (int) (12.0f * f2);
        c93400aQG.setPadding(i2, i2, i2, i2);
        c93363aPf.LIZJ.removeAllViews();
        c93363aPf.LIZJ.addView(c93400aQG);
        View findViewById = c93363aPf.LIZJ.findViewById(R.id.nl7);
        if (findViewById instanceof TextView) {
            textView = (TextView) findViewById;
        } else {
            textView = null;
        }
        c93363aPf.LIZLLL = textView;
        if (textView != null) {
            textView.setTextAppearance(context, R.style.adg);
        }
        this.LJI = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.LJI});
        int i3 = (int) (f2 * 3.0f);
        layerDrawable.setLayerInset(1, i3, i3, i3, i3);
        c93363aPf.LIZ(layerDrawable);
        this.LIZJ = c93364aPg;
    }
}
