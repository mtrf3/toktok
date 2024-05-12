package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.0GW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0GW implements Runnable {
    public final WeakReference<InterfaceC29711Ep> LJLIL;
    public final WeakReference<C0GL> LJLILLLLZI;
    public final WeakReference<Context> LJLJI;

    public C0GW(InterfaceC29711Ep interfaceC29711Ep, C0GL c0gl, VNU vnu) {
        this.LJLIL = new WeakReference<>(interfaceC29711Ep);
        this.LJLILLLLZI = new WeakReference<>(c0gl);
        this.LJLJI = new WeakReference<>(vnu);
    }
}
