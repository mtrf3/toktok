package X;

import Y.AObserverS74S0100000_6;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Fyp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40739Fyp implements InterfaceC40749Fyz, G1H {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC40744Fyu LJLILLLLZI;
    public final InterfaceC88471Ynr<Fragment, Boolean, C76800UCe> LJLJI;
    public boolean LJLJJI;
    public Intent LJLJJL;
    public boolean LJLJJLL;
    public final AqS156S0100000_6 LJLJL;

    @Override // X.InterfaceC40749Fyz
    public final void LIZIZ() {
        this.LJLJJI = false;
        C40732Fyi.LIZ = new C40735Fyl(this);
        ActivityC45651qj lifecycleOwner = this.LJLIL;
        AObserverS74S0100000_6 aObserverS74S0100000_6 = new AObserverS74S0100000_6(this, 12);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        C40732Fyi.LIZIZ.observe(lifecycleOwner, aObserverS74S0100000_6);
    }

    @Override // X.InterfaceC40749Fyz
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.G1H
    public final void onComplete() {
    }

    @Override // X.InterfaceC40749Fyz
    public void onEvent(IEvent event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.G1H
    public final void onStart() {
    }

    @Override // X.G1H
    public final void Di0(G04<?> nujComponent) {
        o.LJIIIZ(nujComponent, "nujComponent");
    }

    @Override // X.InterfaceC40749Fyz
    public final void LIZ(Intent intent) {
        Intent intent2;
        if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("deeplink_intent_about_welcome_screen")) != null) {
            this.LJLJJL = intent2;
        }
    }

    @Override // X.G1H
    public final void OS(EnumC35461Dvt error) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.G1H
    public final void gb0(G04<?> nujComponent, C40745Fyv c40745Fyv) {
        o.LJIIIZ(nujComponent, "nujComponent");
        if (c40745Fyv != null && c40745Fyv.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(nujComponent.type());
            LIZ.append(" affect Feed Content");
            C40741Fyr.LIZIZ(X1D.LIZIZ(LIZ));
            this.LJLJJLL = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40739Fyp(ActivityC45651qj activity, InterfaceC40744Fyu activityParamProvider, InterfaceC88471Ynr<? super Fragment, ? super Boolean, C76800UCe> replaceFragment) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(activityParamProvider, "activityParamProvider");
        o.LJIIIZ(replaceFragment, "replaceFragment");
        this.LJLIL = activity;
        this.LJLILLLLZI = activityParamProvider;
        this.LJLJI = replaceFragment;
        this.LJLJL = new AqS156S0100000_6(this, 124);
    }
}
