package Y;

import X.C68322mC;
import X.C79877VWn;
import X.C79889VWz;
import X.VX0;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import java.util.concurrent.Callable;

/* loaded from: classes15.dex */
public class ACallableS39S1100000_14 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS39S1100000_14 aCallableS39S1100000_14) {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        ((LynxAlphaVideo) aCallableS39S1100000_14.l1).LJJII(aCallableS39S1100000_14.s0, new C79889VWz(aCallableS39S1100000_14, c68322mC));
        return new C79877VWn(c68322mC.element);
    }

    public static final Object call$1(ACallableS39S1100000_14 aCallableS39S1100000_14) {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        ((LynxAlphaVideo) aCallableS39S1100000_14.l1).LJJII(aCallableS39S1100000_14.s0, new VX0(aCallableS39S1100000_14, c68322mC));
        return new C79877VWn(c68322mC.element);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        if (X.C76800UCe.LIZ != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$2(Y.ACallableS39S1100000_14 r6) {
        /*
            java.lang.Object r3 = r6.l1
            com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView r3 = (com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView) r3
            java.lang.String r4 = r6.s0
            r3.getClass()
            java.lang.String r0 = "./"
            r1 = 0
            boolean r0 = ujb.o.LJJJLIIL(r4, r0, r1)
            if (r0 == 0) goto Lc2
            X.VNU r0 = r3.mContext
            java.lang.String r5 = X.VA1.LIZ(r0, r4, r1)
        L18:
            java.lang.String r0 = r3.LJLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            if (r0 == 0) goto L28
        L20:
            X.0GQ r1 = new X.0GQ
            java.lang.String r0 = ""
            r1.<init>(r0)
            return r1
        L28:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "start load lottie: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            r1 = 2
            java.lang.String r0 = "byted-lottie"
            com.lynx.tasm.base.LLog.LIZLLL(r1, r0, r2)
            r3.LJLL = r5
            X.Ui4 r0 = r3.LJZL
            if (r5 == 0) goto Lb9
            java.util.HashMap<java.lang.String, java.lang.Long> r2 = r0.LIZ
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r5, r0)
        L51:
            X.VTw r0 = new X.VTw
            java.lang.String r5 = r3.LJLL
            r0.<init>(r3, r5)
            r3.LLII = r0
            T extends android.view.View r2 = r3.mView
            boolean r1 = r2 instanceof X.C77919Ui3
            r0 = 0
            if (r1 != 0) goto L62
            r2 = r0
        L62:
            X.Ui3 r2 = (X.C77919Ui3) r2
            if (r2 == 0) goto L69
            r2.setSrcUrl(r5)
        L69:
            X.J0G<X.O2l> r5 = r3.LJLZ
            if (r5 == 0) goto Lbd
            java.lang.String r6 = r3.LJLL
            if (r6 == 0) goto Lbd
            r3.LJLLI = r0
            com.lynx.react.bridge.JavaOnlyMap r1 = r3.getProps()
            java.lang.String r0 = "only-local"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r3.LLFZ = r0
            if (r0 == 0) goto Lb7
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "onlyLocal"
            java.lang.String r0 = "1"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)
            android.net.Uri r0 = r0.build()
            java.lang.String r2 = r0.toString()
        L9f:
            java.lang.String r0 = "if (mIsOnlyLocal) Uri.pa…).toString() else safeSrc"
            kotlin.jvm.internal.o.LJFF(r2, r0)
            X.VTo r1 = new X.VTo
            r1.<init>(r3, r6)
            X.VTm r0 = new X.VTm
            r0.<init>(r3, r4)
            r5.LIZ(r2, r1, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 == 0) goto Lbd
            goto L20
        Lb7:
            r2 = r6
            goto L9f
        Lb9:
            r0.getClass()
            goto L51
        Lbd:
            r3.LJJII(r4)
            goto L20
        Lc2:
            r5 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS39S1100000_14.call$2(Y.ACallableS39S1100000_14):java.lang.Object");
    }

    public ACallableS39S1100000_14(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
