package com.ss.android.ugc.aweme.sticker.senor.presenter;

import X.C29S;
import X.C39187FZn;
import X.C39188FZo;
import X.C5NP;
import X.C78862UxG;
import X.C82891Wg3;
import X.C83663WsV;
import X.C83893WwD;
import X.C86956YAu;
import X.InterfaceC83894WwE;
import X.Q0C;
import X.V0N;
import X.X1D;
import X.YB0;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LandmarkARPresenter extends BaseSenorPresenter {
    public final YB0 LJLJL;
    public final boolean LJLJLJ;
    public final InterfaceC83894WwE LJLJLLL;
    public final int LJLL;

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC84018WyE
    public final void register() {
        this.LJLIL = true;
        Sensor LIZJ = this.LJLJLLL.LIZJ(this.LJLILLLLZI, 15);
        if (LIZJ == null) {
            LIZJ = this.LJLJLLL.LIZJ(this.LJLILLLLZI, 11);
        }
        if (LIZJ == null) {
            return;
        }
        this.LJLJL.LIZIZ(true);
        this.LJLJLLL.LIZ(new AqS181S0100000_15(this, 151));
        C86956YAu c86956YAu = new C86956YAu(this.LJLJLJ, this.LJLJL);
        try {
            C39187FZn c39187FZn = C39188FZo.LIZ;
            SensorManager sensorManager = this.LJLILLLLZI;
            int i = this.LJLJI.get(LIZJ.getType(), this.LJLL);
            Handler handler = this.LJLJJLL;
            C78862UxG c78862UxG = C83663WsV.LJI;
            c39187FZn.getClass();
            C39187FZn.LIZIZ(sensorManager, c86956YAu, LIZJ, i, handler, c78862UxG);
            ((CopyOnWriteArrayList) this.LJLJJI).add(c86956YAu);
        } catch (Q0C e) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BPEA-registerRotationVectorSenor: ");
            LIZ.append(V0N.LJJIJL(e));
            LIZLLL.w(X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.senor.presenter.BaseSenorPresenter, X.InterfaceC84018WyE
    public final void unRegister() {
        super.unRegister();
        this.LJLJL.LIZIZ(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandmarkARPresenter(C29S context, LifecycleOwner lifecycleOwner, boolean z, C83893WwD c83893WwD, int i) {
        super(context, lifecycleOwner, null);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJLJ = z;
        this.LJLJLLL = c83893WwD;
        this.LJLL = i;
        this.LJLJL = c83893WwD.LIZLLL;
    }
}
