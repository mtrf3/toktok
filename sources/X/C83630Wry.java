package X;

import Y.AObjectS50S0101000_5;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Wry, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83630Wry extends F9E {
    public final Context LJLIL;
    public final InterfaceC83927Wwl LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final C83733Wtd LJLJJI;
    public final InterfaceC83707WtD LJLJJL;
    public final InterfaceC83659WsR LJLJJLL;
    public final InterfaceC83697Wt3 LJLJL;
    public final InterfaceC65784Pro<Boolean> LJLJLJ;
    public final Effect LJLJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL};
    }

    public C83630Wry(Context context, InterfaceC83927Wwl recorderContext, LifecycleOwner lifecycleOwner, C83733Wtd c83733Wtd, InterfaceC83707WtD nativeInitListener, InterfaceC83659WsR onCameraListener, InterfaceC83697Wt3 interfaceC83697Wt3, AObjectS50S0101000_5 aObjectS50S0101000_5, Effect effect) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recorderContext, "recorderContext");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(nativeInitListener, "nativeInitListener");
        o.LJIIIZ(onCameraListener, "onCameraListener");
        this.LJLIL = context;
        this.LJLILLLLZI = recorderContext;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = c83733Wtd;
        this.LJLJJL = nativeInitListener;
        this.LJLJJLL = onCameraListener;
        this.LJLJL = interfaceC83697Wt3;
        this.LJLJLJ = aObjectS50S0101000_5;
        this.LJLJLLL = effect;
    }
}
