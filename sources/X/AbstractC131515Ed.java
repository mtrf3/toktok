package X;

import Y.ACListenerS22S0100000_2;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC131515Ed extends AbstractC56012Ht<C131555Eh, C5EY> {
    public abstract int LLJILJIL(C52V c52v);

    public abstract void LLJILJILJ(long j);

    public abstract void LLJJ(C52X c52x);

    public abstract void LLJJI(long j);

    public abstract void LLJJIII(C52V c52v, boolean z, boolean z2);

    public final void LLJJIJI(C52V c52v, View.OnClickListener onClickListener) {
        View findViewById;
        View view = this.mView;
        if (view != null && (findViewById = view.findViewById(LLJILJIL(c52v))) != null) {
            C16880lQ.LJIIJ(new ACListenerS22S0100000_2(onClickListener, LiveTryModeCountDownThresholdSetting.DEFAULT), findViewById);
        }
    }

    @Override // X.WM7
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (!C1280450u.LIZ()) {
            return;
        }
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Ee
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C131555Eh) obj).LIZ);
            }
        }, null, new AqS168S0100000_2(this, 482), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Ec
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C131555Eh) obj).LIZIZ);
            }
        }, null, new AqS168S0100000_2(this, 483), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Ef
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C131555Eh) obj).LIZJ;
            }
        }, null, new AqS168S0100000_2(this, 484), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5Ek
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C131555Eh) obj).LJFF;
            }
        }, null, new AqS168S0100000_2(this, 485), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5El
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C131555Eh) obj).LJ;
            }
        }, null, new AqS133S0200000_2(view, this, 106), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5Eg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C131555Eh) obj).LJI;
            }
        }, null, new AqS133S0200000_2(view, this, 107), 2, null);
        LLJJIJI(C52V.FULL_SCREEN, new ACListenerS22S0100000_2(this, 116));
        LLJJIJI(C52V.UNDO, new ACListenerS22S0100000_2(this, 117));
        LLJJIJI(C52V.REDO, new ACListenerS22S0100000_2(this, 118));
        LLJJIJI(C52V.PLAY, new ACListenerS22S0100000_2(this, 119));
    }
}
