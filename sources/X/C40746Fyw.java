package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Fyw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40746Fyw implements InterfaceC40749Fyz {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC40744Fyu LJLILLLLZI;
    public final InterfaceC88471Ynr<Fragment, Boolean, C76800UCe> LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // X.InterfaceC40749Fyz
    public final void LIZIZ() {
        LIZJ(C40748Fyy.LJLIL);
    }

    @Override // X.InterfaceC40749Fyz
    public final void LIZ(Intent intent) {
        LIZJ(new AqS172S0100000_6(intent, 109));
    }

    public final void LIZJ(InterfaceC88472Yns<? super InterfaceC40749Fyz, C76800UCe> interfaceC88472Yns) {
        boolean z = C35878E6g.LIZ;
        C35878E6g.LIZ();
        interfaceC88472Yns.invoke(this.LJLJJI.getValue());
    }

    @Override // X.InterfaceC40749Fyz
    public void onEvent(IEvent event) {
        o.LJIIIZ(event, "event");
        LIZJ(new AqS172S0100000_6(event, 108));
    }

    public C40746Fyw(NewUserJourneyActivity activity, C40725Fyb activityParamProvider, AqS188S0100000_6 aqS188S0100000_6) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(activityParamProvider, "activityParamProvider");
        this.LJLIL = activity;
        this.LJLILLLLZI = activityParamProvider;
        this.LJLJI = aqS188S0100000_6;
        this.LJLJJI = C221108m2.LIZIZ(new AqS156S0100000_6(this, 122));
        C221108m2.LIZIZ(new AqS156S0100000_6(this, 123));
    }

    @Override // X.InterfaceC40749Fyz
    public final void onActivityResult(int i, int i2, Intent intent) {
        LIZJ(new C40747Fyx(i, i2, intent));
    }
}
