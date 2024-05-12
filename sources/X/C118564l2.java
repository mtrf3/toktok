package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* renamed from: X.4l2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118564l2 {
    public static final C118564l2 LIZ = new C118564l2();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void LIZ(C1HQ c1hq) {
        int i;
        if (C85773Yf.LJLJI != null) {
            try {
                String str = (String) c1hq.getOrDefault("success_cnt", null);
                if (str != null) {
                    i = CastIntegerProtector.parseInt(str);
                } else {
                    i = 0;
                }
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    C09900aA.LJIIJJI("aweme_im_message_error_rate", 0, null);
                    i = i2;
                }
                String str2 = (String) c1hq.getOrDefault("fail_cnt", null);
                if (str2 != null) {
                    int parseInt = CastIntegerProtector.parseInt(str2);
                    while (true) {
                        int i3 = parseInt - 1;
                        if (parseInt > 0) {
                            C09900aA.LJIIJJI("aweme_im_message_error_rate", 1, null);
                            parseInt = i3;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Exception e) {
                C36922EeM.LIZ(e);
            }
        }
    }
}
