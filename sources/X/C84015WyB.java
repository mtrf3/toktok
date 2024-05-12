package X;

import com.ss.android.ugc.aweme.sticker.senor.presenter.DefaultSenorPresenter;
import kotlin.jvm.internal.o;

/* renamed from: X.WyB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84015WyB extends ESP {
    public boolean LJLILLLLZI;
    public final C29S LJLJI;
    public final C0IB<Boolean> LJLJJI;
    public final InterfaceC65784Pro<Boolean> LJLJJL;
    public final YB2 LJLJJLL;
    public final InterfaceC84016WyC LJLJL;
    public final boolean LJLJLJ;
    public final YB3 LJLJLLL;

    @Override // X.ESP
    public final void LJIIJJI() {
        if (this.LJLJLJ) {
            this.LJLJL.LIZ();
        }
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return !ID0.LIZLLL(session.LIZ);
    }

    public final void LJIILIIL(boolean z) {
        boolean z2;
        Boolean LIZ = this.LJLJJI.LIZ();
        if (LIZ != null) {
            z2 = LIZ.booleanValue();
        } else {
            z2 = false;
        }
        C29S c29s = this.LJLJI;
        this.LJLJL.LIZJ(new DefaultSenorPresenter(c29s, c29s, z2, this.LJLJJLL, this.LJLJJL.invoke().booleanValue(), this.LJLJL.LIZIZ(), this.LJLJLLL, this.LJLJLJ), z);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        boolean z;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        int i = 0;
        if (session.LIZ.getTypes().contains("highRotationFreq")) {
            this.LJLILLLLZI = true;
            int[] iArr = {11, 15};
            Boolean LIZ = this.LJLJJI.LIZ();
            if (LIZ != null) {
                z = LIZ.booleanValue();
            } else {
                z = false;
            }
            C29S c29s = this.LJLJI;
            DefaultSenorPresenter defaultSenorPresenter = new DefaultSenorPresenter(c29s, c29s, z, this.LJLJJLL, this.LJLJJL.invoke().booleanValue(), this.LJLJL.LIZIZ(), this.LJLJLLL, this.LJLJLJ);
            do {
                int i2 = iArr[i];
                if (i2 != 0) {
                    defaultSenorPresenter.LJLJI.put(i2, 5000);
                }
                i++;
            } while (i < 2);
            this.LJLJL.LIZJ(defaultSenorPresenter, true);
            return;
        }
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            LJIILIIL(true);
        } else {
            LJIILIIL(false);
        }
    }

    public C84015WyB(C29S activity, C0IB nativeInitLiveData, C46197IBd enableGameRotationSensor, C83884Ww4 onSensorInfoChangedListener, ID9 sensorPresenterHolder, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(nativeInitLiveData, "nativeInitLiveData");
        o.LJIIIZ(enableGameRotationSensor, "enableGameRotationSensor");
        o.LJIIIZ(onSensorInfoChangedListener, "onSensorInfoChangedListener");
        o.LJIIIZ(sensorPresenterHolder, "sensorPresenterHolder");
        this.LJLJI = activity;
        this.LJLJJI = nativeInitLiveData;
        this.LJLJJL = enableGameRotationSensor;
        this.LJLJJLL = onSensorInfoChangedListener;
        this.LJLJL = sensorPresenterHolder;
        this.LJLJLJ = z;
        this.LJLJLLL = null;
    }
}
