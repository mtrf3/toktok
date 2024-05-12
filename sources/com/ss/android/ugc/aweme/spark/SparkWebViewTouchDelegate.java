package com.ss.android.ugc.aweme.spark;

import X.C07670Rv;
import X.C16880lQ;
import X.C17N;
import X.C1JX;
import X.C221108m2;
import X.C35730E0o;
import X.C59231NMl;
import X.C59240NMu;
import X.C62822Ol8;
import X.C78983UzD;
import X.InterfaceC60615Nqd;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SparkWebViewTouchDelegate implements InterfaceC60615Nqd {
    public final WebKitView LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public View.OnTouchListener LIZLLL;
    public final boolean LJ;
    public DisableInterceptRegion[] LJFF;
    public boolean LJI;
    public long LJII;
    public final C62822Ol8 LJIIIIZZ;

    /* loaded from: classes11.dex */
    public static final class DisableInterceptRegion {

        @InterfaceC65349Pkn("height")
        public final double height;

        @InterfaceC65349Pkn("width")
        public final double width;

        @InterfaceC65349Pkn("x")
        public final double x;

        @InterfaceC65349Pkn("y")
        public final double y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public DisableInterceptRegion() {
            /*
                r11 = this;
                r1 = 0
                r9 = 15
                r10 = 0
                r0 = r11
                r3 = r1
                r5 = r1
                r7 = r1
                r0.<init>(r1, r3, r5, r7, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.spark.SparkWebViewTouchDelegate.DisableInterceptRegion.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisableInterceptRegion)) {
                return false;
            }
            DisableInterceptRegion disableInterceptRegion = (DisableInterceptRegion) obj;
            return Double.compare(this.x, disableInterceptRegion.x) == 0 && Double.compare(this.y, disableInterceptRegion.y) == 0 && Double.compare(this.width, disableInterceptRegion.width) == 0 && Double.compare(this.height, disableInterceptRegion.height) == 0;
        }

        public final int hashCode() {
            return C16880lQ.LLJI(this.height) + C1JX.LIZIZ(this.width, C1JX.LIZIZ(this.y, C16880lQ.LLJI(this.x) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DisableInterceptRegion(x=");
            LIZ.append(this.x);
            LIZ.append(", y=");
            LIZ.append(this.y);
            LIZ.append(", width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            return C07670Rv.LIZ(LIZ, this.height, ')', LIZ);
        }

        public DisableInterceptRegion(double d, double d2, double d3, double d4) {
            this.x = d;
            this.y = d2;
            this.width = d3;
            this.height = d4;
        }

        public /* synthetic */ DisableInterceptRegion(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Double.MIN_VALUE : d, (i & 2) == 0 ? d2 : Double.MIN_VALUE, (i & 4) != 0 ? Double.MAX_VALUE : d3, (i & 8) == 0 ? d4 : Double.MAX_VALUE);
        }
    }

    @Override // X.InterfaceC60615Nqd
    public final boolean LIZIZ() {
        if (System.currentTimeMillis() - this.LJII < this.LIZ.getTimeInterval()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60615Nqd
    public final boolean LIZ(boolean z) {
        if (this.LIZJ) {
            if (this.LIZIZ && z) {
                return true;
            }
            return false;
        }
        throw new C59240NMu("An operation is not implemented");
    }

    public final void LIZJ(C59231NMl event) {
        String str;
        o.LJIIIZ(event, "event");
        m LJIIZILJ = GsonProtectorUtils.parse(new com.google.gson.o(), event.LJLIL.toString()).LJIIZILJ();
        j LJJIJ = LJIIZILJ.LJJIJ("eventName");
        DisableInterceptRegion[] disableInterceptRegionArr = null;
        if (LJJIJ != null) {
            str = LJJIJ.LJJIFFI();
        } else {
            str = null;
        }
        if (o.LJ(str, "disableIntercept")) {
            j LJJIJ2 = LJIIZILJ.LJJIJ("data");
            if (LJJIJ2 != null) {
                try {
                    disableInterceptRegionArr = (DisableInterceptRegion[]) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), LJJIJ2, DisableInterceptRegion[].class);
                } catch (s e) {
                    C78983UzD.LJIIZILJ(e);
                }
            }
            this.LJFF = disableInterceptRegionArr;
        }
    }

    @Override // X.InterfaceC60615Nqd
    public final void LJIIIIZZ(MotionEvent event) {
        boolean z;
        o.LJIIIZ(event, "event");
        if (C35730E0o.LIZ() && !this.LJ) {
            this.LIZ.requestDisallowInterceptTouchEvent(true);
        }
        if (event.getActionMasked() == 0) {
            this.LJI = false;
            this.LIZ.getLocationInWindow(new int[2]);
            int LJJJJI = C17N.LJJJJI(event.getRawX() - r2[0]);
            int LJJJJI2 = C17N.LJJJJI(event.getRawY() - r2[1]);
            DisableInterceptRegion[] disableInterceptRegionArr = this.LJFF;
            if (disableInterceptRegionArr != null) {
                for (DisableInterceptRegion disableInterceptRegion : disableInterceptRegionArr) {
                    double d = LJJJJI;
                    double d2 = disableInterceptRegion.x;
                    if (d >= d2 && d <= d2 + disableInterceptRegion.width) {
                        double d3 = LJJJJI2;
                        double d4 = disableInterceptRegion.y;
                        if (d3 >= d4 && d3 <= d4 + disableInterceptRegion.height) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            this.LJI = z;
        }
        if (this.LJI) {
            this.LIZ.requestDisallowInterceptTouchEvent(true);
        }
        if (this.LIZ.getCanTouch()) {
            ((GestureDetector) this.LJIIIIZZ.getValue()).onTouchEvent(event);
            View.OnTouchListener onTouchListener = this.LIZLLL;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this.LIZ, event);
            }
        }
        if (this.LIZJ) {
            if (!this.LIZIZ) {
                if (event.getAction() == 2) {
                    return;
                }
            } else {
                this.LIZ.requestDisallowInterceptTouchEvent(true);
            }
            throw new C59240NMu("An operation is not implemented");
        }
        throw new C59240NMu("An operation is not implemented");
    }

    public SparkWebViewTouchDelegate(WebKitView webKitView, boolean z, int i) {
        boolean z2;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i & 16) != 0 ? false : z;
        this.LIZ = webKitView;
        this.LIZIZ = z2;
        this.LIZJ = false;
        this.LIZLLL = null;
        this.LJ = z;
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 522));
    }
}