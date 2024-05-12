package X;

import android.content.Context;
import fjb.a;
import java.lang.ref.WeakReference;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.screenshot.ScreenShotMonitor$stopListen$2", f = "ScreenShotMonitor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Oi8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62636Oi8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ WeakReference<Context> LJLIL;
    public final /* synthetic */ C62635Oi7 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62636Oi8(WeakReference<Context> weakReference, C62635Oi7 c62635Oi7, InterfaceC67352kd<? super C62636Oi8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = weakReference;
        this.LJLILLLLZI = c62635Oi7;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C62636Oi8(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Context context = this.LJLIL.get();
        if (context == null) {
            return null;
        }
        C62635Oi7 c62635Oi7 = this.LJLILLLLZI;
        c62635Oi7.LJFF.LIZIZ(C62635Oi7.LJII[0], null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("context[");
        LIZ.append(context);
        LIZ.append("]: try to stop screen shot listener: isHasScreenShotListen: ");
        LIZ.append(c62635Oi7.LIZ);
        C62657OiT.LIZIZ(X1D.LIZIZ(LIZ));
        if (c62635Oi7.LIZ) {
            try {
                C62638OiA c62638OiA = c62635Oi7.LIZIZ;
                if (c62638OiA != null) {
                    context.getContentResolver().unregisterContentObserver(c62638OiA);
                }
            } catch (Exception e) {
                C62657OiT.LIZIZ(e.toString());
            }
            c62635Oi7.LIZIZ = null;
            try {
                C62638OiA c62638OiA2 = c62635Oi7.LIZJ;
                if (c62638OiA2 != null) {
                    context.getContentResolver().unregisterContentObserver(c62638OiA2);
                }
            } catch (Exception e2) {
                C62657OiT.LIZIZ(e2.toString());
            }
            c62635Oi7.LIZJ = null;
            C62657OiT.LIZIZ("[" + context + "] stop listen");
            c62635Oi7.LIZ = false;
            c62635Oi7.LJ = 0L;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("startListenTime change to ");
            LIZ2.append(0L);
            C62657OiT.LIZIZ(X1D.LIZIZ(LIZ2));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
