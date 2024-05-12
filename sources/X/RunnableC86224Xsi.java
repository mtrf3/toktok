package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;
import v5.n;

/* renamed from: X.Xsi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC86224Xsi implements Runnable {
    public final WeakReference<Activity> LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final WeakReference<InterfaceC86245Xt3> LJLJJL;

    public final void LIZ() {
        String str;
        long j;
        Activity activity;
        String str2 = this.LJLJJI;
        if (str2 == null) {
            return;
        }
        n nVar = new n();
        String str3 = null;
        try {
            AVExternalServiceImpl.LIZ().abilityService().processService().compressPhoto(str2, 216, 384, new HNE(nVar));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            nVar.LJ(null);
        }
        C10K<TResult> c10k = nVar.LIZ;
        o.LJIIIIZZ(c10k, "taskCompletionSource.task");
        try {
            c10k.LJIJI();
        } catch (InterruptedException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        String str4 = (String) c10k.LJIIJJI();
        int i = this.LJLJI;
        if (i == 1 || i == 3) {
            str = str4;
        } else {
            str = this.LJLJJI;
        }
        if (str != null) {
            Context LIZIZ = EF7.LIZIZ();
            android.net.Uri parse = UriProtector.parse(str);
            o.LJIIIIZZ(parse, "parse(it)");
            Long LIZ = C45876HzU.LIZ(LIZIZ, parse);
            if (LIZ != null) {
                j = LIZ.longValue();
            } else {
                j = 0;
            }
            C86241Xsz c86241Xsz = new C86241Xsz(j, str, "image");
            c86241Xsz.LIZIZ = C32200CkO.LIZ(str);
            if (this.LJLILLLLZI && (activity = this.LJLIL.get()) != null) {
                int i2 = this.LJLJI;
                if (i2 == 1 || i2 == 2) {
                    if (str4 != null) {
                        str3 = OYW.LIZ(activity, str4);
                    }
                    c86241Xsz.LIZ = str3;
                } else if (i2 == 3) {
                    c86241Xsz.LIZ = OYW.LIZ(activity, this.LJLJJI);
                }
            }
            List<C86241Xsz> LJJIJ = C47261Igj.LJJIJ(c86241Xsz);
            InterfaceC86245Xt3 interfaceC86245Xt3 = this.LJLJJL.get();
            if (interfaceC86245Xt3 != null) {
                C86242Xt0 c86242Xt0 = new C86242Xt0();
                c86242Xt0.LIZ = LJJIJ;
                interfaceC86245Xt3.LIZIZ(c86242Xt0);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        InterfaceC86245Xt3 interfaceC86245Xt32 = this.LJLJJL.get();
        if (interfaceC86245Xt32 != null) {
            interfaceC86245Xt32.LIZ(0, "CompressFilePath is null");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC86224Xsi(WeakReference<Activity> ctxRef, String str, InterfaceC86245Xt3 callback, boolean z, int i) {
        o.LJIIIZ(ctxRef, "ctxRef");
        o.LJIIIZ(callback, "callback");
        this.LJLIL = ctxRef;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = str;
        this.LJLJJL = new WeakReference<>(callback);
    }
}
