package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS175S0200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V5H {
    public static boolean LIZ;

    public static final void LIZJ(Context context, Aweme aweme) {
        FragmentManager supportFragmentManager;
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
            return;
        }
        V5J v5j = new V5J(context);
        v5j.setContent(C1DJ.LJFF(new AqS175S0200000_13(v5j, aweme, 13), 1910365378, true));
        ASL asl = new ASL();
        asl.LIZ.LJLLI = v5j;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = (int) (KL2.LJIIIZ(context) * 0.4482758620689655d);
        tuxSheet2.show(supportFragmentManager, "DeviceListPanelFragment");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r15, X.InterfaceC07790Sh r16, X.InterfaceC65784Pro<X.C76800UCe> r17, X.InterfaceC24520xk r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V5H.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.0Sh, X.Pro, X.0xk, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0198 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r23, X.InterfaceC07790Sh r24, X.InterfaceC65784Pro<X.C76800UCe> r25, X.InterfaceC24520xk r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V5H.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.0Sh, X.Pro, X.0xk, int, int):void");
    }
}
