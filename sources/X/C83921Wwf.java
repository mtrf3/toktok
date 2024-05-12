package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* renamed from: X.Wwf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83921Wwf extends F9E {
    public final Context LJLIL;
    public final InterfaceC83927Wwl LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final VERecorder LJLJJI;
    public final C83733Wtd LJLJJL;
    public final InterfaceC83697Wt3 LJLJJLL;
    public final InterfaceC65784Pro<Boolean> LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    public C83921Wwf(Context context, InterfaceC83927Wwl recorderContext, LifecycleOwner lifecycleOwner, VERecorder veRecorder, C83733Wtd c83733Wtd, InterfaceC83697Wt3 interfaceC83697Wt3, InterfaceC65784Pro<Boolean> interceptCallback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recorderContext, "recorderContext");
        o.LJIIIZ(veRecorder, "veRecorder");
        o.LJIIIZ(interceptCallback, "interceptCallback");
        this.LJLIL = context;
        this.LJLILLLLZI = recorderContext;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = veRecorder;
        this.LJLJJL = c83733Wtd;
        this.LJLJJLL = interfaceC83697Wt3;
        this.LJLJL = interceptCallback;
    }
}
