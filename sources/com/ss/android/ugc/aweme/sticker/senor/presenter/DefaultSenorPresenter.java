package com.ss.android.ugc.aweme.sticker.senor.presenter;

import X.C03880Dg;
import X.C29S;
import X.C39187FZn;
import X.C39188FZo;
import X.C39519Ff9;
import X.C5NP;
import X.C65300Pk0;
import X.C78862UxG;
import X.C82891Wg3;
import X.C83663WsV;
import X.C83884Ww4;
import X.C86953YAr;
import X.C86955YAt;
import X.C86961YAz;
import X.Q0C;
import X.V0N;
import X.X1D;
import X.YB2;
import X.YB3;
import X.YB5;
import X.YB6;
import X.YB7;
import X.YB8;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DefaultSenorPresenter extends BaseSenorPresenter {
    public C86961YAz LJLJL;
    public final boolean LJLJLJ;
    public final YB2 LJLJLLL;
    public final boolean LJLL;
    public final YB3 LJLLI;

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC84018WyE
    public final void register() {
        Sensor LIZ;
        this.LJLIL = true;
        Sensor LIZ2 = LIZ(9, YB6.LIZ);
        if (LIZ2 == null) {
            C86961YAz c86961YAz = new C86961YAz(this.LJLJJL, this.LJLJLLL);
            this.LJLJL = c86961YAz;
            c86961YAz.enable();
        } else {
            C86953YAr c86953YAr = new C86953YAr(this.LJLJLLL, this.LJLJLJ);
            try {
                C39187FZn c39187FZn = C39188FZo.LIZ;
                SensorManager sensorManager = this.LJLILLLLZI;
                int i = this.LJLJI.get(LIZ2.getType(), 10000);
                Handler handler = this.LJLJJLL;
                C78862UxG c78862UxG = C83663WsV.LIZ;
                c39187FZn.getClass();
                C39187FZn.LIZIZ(sensorManager, c86953YAr, LIZ2, i, handler, c78862UxG);
                ((CopyOnWriteArrayList) this.LJLJJI).add(c86953YAr);
            } catch (Q0C e) {
                C5NP LIZLLL = C82891Wg3.LIZLLL();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("BPEA-registerGravitySenor: ");
                LIZ3.append(V0N.LJJIJL(e));
                LIZLLL.w(X1D.LIZIZ(LIZ3));
            }
        }
        if (!this.LJLL || (LIZ = LIZ(15, YB5.LIZ)) == null) {
            LIZ = LIZ(11, YB8.LIZ);
        }
        if (LIZ == null) {
            return;
        }
        C86955YAt c86955YAt = new C86955YAt(this.LJLJLLL, this.LJLJLJ);
        try {
            C39187FZn c39187FZn2 = C39188FZo.LIZ;
            SensorManager sensorManager2 = this.LJLILLLLZI;
            int i2 = this.LJLJI.get(LIZ.getType(), 10000);
            Handler handler2 = this.LJLJJLL;
            C78862UxG c78862UxG2 = C83663WsV.LIZIZ;
            c39187FZn2.getClass();
            C39187FZn.LIZIZ(sensorManager2, c86955YAt, LIZ, i2, handler2, c78862UxG2);
            ((CopyOnWriteArrayList) this.LJLJJI).add(c86955YAt);
        } catch (Q0C e2) {
            C5NP LIZLLL2 = C82891Wg3.LIZLLL();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("BPEA-registerRotationVectorSenor: ");
            LIZ4.append(V0N.LJJIJL(e2));
            LIZLLL2.w(X1D.LIZIZ(LIZ4));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC84018WyE
    public final void unRegister() {
        super.unRegister();
        C86961YAz c86961YAz = this.LJLJL;
        if (c86961YAz != null) {
            o.LJI(c86961YAz);
            c86961YAz.disable();
        }
    }

    public final Sensor LIZ(int i, YB7 yb7) {
        Sensor LIZJ;
        YB3 yb3 = this.LJLLI;
        if (yb3 != null && (LIZJ = yb3.LIZJ(this.LJLILLLLZI, i)) != null) {
            return LIZJ;
        }
        SensorManager sensorManager = this.LJLILLLLZI;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "6150738578566649370");
        C39519Ff9 LIZJ2 = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ2.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ2.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSenorPresenter(C29S c29s, C29S c29s2, boolean z, YB2 mListener, boolean z2, Handler handler, YB3 yb3, boolean z3) {
        super(c29s, c29s2, handler);
        o.LJIIIZ(mListener, "mListener");
        o.LJI(c29s);
        o.LJI(c29s2);
        this.LJLJLJ = z;
        this.LJLJLLL = mListener;
        this.LJLL = z2;
        this.LJLLI = yb3;
    }

    public /* synthetic */ DefaultSenorPresenter(C29S c29s, C29S c29s2, boolean z, C83884Ww4 c83884Ww4, boolean z2, Handler handler, YB3 yb3, boolean z3, int i) {
        this(c29s, c29s2, z, c83884Ww4, (i & 16) != 0 ? true : z2, handler, (i & 64) != 0 ? null : yb3, (i & 128) != 0 ? false : z3);
    }
}
