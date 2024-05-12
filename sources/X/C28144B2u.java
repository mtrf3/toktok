package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.zhiliaoapp.musically.R;

/* renamed from: X.B2u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28144B2u {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Context context, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        if (!z) {
            interfaceC65784Pro.invoke();
        } else {
            C05L.LIZLLL(context, R.string.r9l);
        }
    }

    public static void LIZJ(Context context, ExceptionUX exceptionUX, boolean z, int i, InterfaceC65784Pro interfaceC65784Pro) {
        int i2;
        String iconRes;
        Integer duration;
        if (!z) {
            interfaceC65784Pro.invoke();
            return;
        }
        if (exceptionUX.getToastContent() != null) {
            ToastContent toastContent = exceptionUX.getToastContent();
            if (toastContent != null && (duration = toastContent.getDuration()) != null) {
                duration.intValue();
            }
            ToastContent toastContent2 = exceptionUX.getToastContent();
            if (toastContent2 != null && (iconRes = toastContent2.getIconRes()) != null) {
                i2 = C39985Fmf.LIZ(iconRes);
            } else {
                i2 = 0;
            }
            String str = null;
            if (i2 != 0) {
                if (i != 0) {
                    C5S1 c5s1 = new C5S1(context);
                    ToastContent toastContent3 = exceptionUX.getToastContent();
                    if (toastContent3 != null) {
                        str = toastContent3.getMessage();
                    }
                    c5s1.LIZLLL(str);
                    c5s1.LIZ(i2);
                    c5s1.LIZIZ(i);
                    c5s1.LJ();
                    return;
                }
                C5S1 c5s12 = new C5S1(context);
                ToastContent toastContent4 = exceptionUX.getToastContent();
                if (toastContent4 != null) {
                    str = toastContent4.getMessage();
                }
                c5s12.LIZLLL(str);
                c5s12.LIZ(i2);
                c5s12.LJ();
                return;
            }
            C5S1 c5s13 = new C5S1(context);
            ToastContent toastContent5 = exceptionUX.getToastContent();
            if (toastContent5 != null) {
                str = toastContent5.getMessage();
            }
            c5s13.LIZLLL(str);
            c5s13.LJ();
            return;
        }
        LIZIZ(context, interfaceC65784Pro, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0107, code lost:
    
        if (r8 != null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.EnumC28063Azr r18, android.content.Context r19, java.lang.String r20, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r21, boolean r22, X.InterfaceC65784Pro r23, X.InterfaceC65784Pro r24, X.InterfaceC65784Pro r25, X.InterfaceC65784Pro r26, X.InterfaceC88472Yns r27, kotlin.jvm.internal.AqS154S0100000_4 r28, kotlin.jvm.internal.AqS154S0100000_4 r29, kotlin.jvm.internal.AqS170S0100000_4 r30, X.B0A r31, X.InterfaceC65784Pro r32, kotlin.jvm.internal.AqS154S0100000_4 r33, int r34) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28144B2u.LIZ(X.Azr, android.content.Context, java.lang.String, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX, boolean, X.Pro, X.Pro, X.Pro, X.Pro, X.Yns, kotlin.jvm.internal.AqS154S0100000_4, kotlin.jvm.internal.AqS154S0100000_4, kotlin.jvm.internal.AqS170S0100000_4, X.B0A, X.Pro, kotlin.jvm.internal.AqS154S0100000_4, int):void");
    }
}
