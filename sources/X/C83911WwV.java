package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* renamed from: X.WwV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83911WwV extends F9E {
    public final Context LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final C83733Wtd LJLJI;
    public final InterfaceC83927Wwl LJLJJI;
    public final InterfaceC83697Wt3 LJLJJL;
    public final InterfaceC65784Pro<Boolean> LJLJJLL;
    public final InterfaceC65784Pro<VERecorder> LJLJL;
    public final Effect LJLJLJ;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83911WwV(Context context, LifecycleOwner lifecycleOwner, C83733Wtd c83733Wtd, InterfaceC83927Wwl recorderContext, InterfaceC83697Wt3 interfaceC83697Wt3, InterfaceC65784Pro<Boolean> interceptCallback, InterfaceC65784Pro<? extends VERecorder> interfaceC65784Pro, Effect effect) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recorderContext, "recorderContext");
        o.LJIIIZ(interceptCallback, "interceptCallback");
        this.LJLIL = context;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = c83733Wtd;
        this.LJLJJI = recorderContext;
        this.LJLJJL = interfaceC83697Wt3;
        this.LJLJJLL = interceptCallback;
        this.LJLJL = interfaceC65784Pro;
        this.LJLJLJ = effect;
    }
}
