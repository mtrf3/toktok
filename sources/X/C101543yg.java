package X;

import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101543yg {
    public static IMNoticeMsgStruct LIZJ;
    public static AKT LIZLLL;
    public static InterfaceC88472Yns<? super Boolean, C76800UCe> LJ;
    public static final C101543yg LIZ = new C101543yg();
    public static int LIZIZ = -1;
    public static boolean LJFF = true;

    public static void LIZJ(Context context) {
        LIZJ = null;
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            AnonymousClass114.LIZ(LJIJJ, R.string.esw);
        }
    }

    public static void LIZ(Context context, String str, InterfaceC88472Yns interfaceC88472Yns) {
        String str2;
        if (context != null && C89363f2.LIZIZ()) {
            IMNoticeMsgStruct iMNoticeMsgStruct = LIZJ;
            if (iMNoticeMsgStruct != null) {
                str2 = iMNoticeMsgStruct.getNoticeCode();
            } else {
                str2 = null;
            }
            if (o.LJ(str2, "perm_on_reminder_popup")) {
                C82223Ko c82223Ko = C99033ud.Companion;
                if (str == null) {
                    str = "";
                }
                c82223Ko.getClass();
                if (!C82223Ko.LIZ(str)) {
                    C2U8.LIZ(new C101993zP("auto", interfaceC88472Yns));
                    return;
                }
            }
        }
        interfaceC88472Yns.invoke(null);
    }

    public static void LIZIZ(Context context, int i, String str, String str2, String str3, EnumC101583yk enumC101583yk) {
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            C101543yg c101543yg = LIZ;
            C101553yh c101553yh = new C101553yh(LJJIFFI, i, str, str2, enumC101583yk, context, str3);
            c101543yg.getClass();
            if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
                c101553yh.invoke();
            } else {
                C1DH.LJJIJIIJI(new ARunnableS37S0100000_1(c101553yh, (InterfaceC65784Pro<C76800UCe>) 152));
            }
        }
    }
}
