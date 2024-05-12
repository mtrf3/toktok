package X;

import android.app.Activity;
import android.content.res.Configuration;
import kotlin.jvm.internal.o;

/* renamed from: X.LFn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53955LFn implements G27 {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;

    public C53955LFn(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        this.LJLIL.invoke();
    }
}
