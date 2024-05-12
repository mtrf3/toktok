package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class F0M extends AbstractC37121EhZ {
    public final InterfaceC60187Njj getActivityWrapper() {
        return (InterfaceC60187Njj) this.contextProviderFactory.LIZJ(InterfaceC60187Njj.class);
    }

    public final Context getContext() {
        return (Context) this.contextProviderFactory.LIZJ(Context.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0M(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIJ(contextProviderFactory, "contextProviderFactory");
    }
}
