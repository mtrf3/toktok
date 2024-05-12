package X;

/* renamed from: X.9TO, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9TO {
    public static boolean LIZ() {
        try {
            Integer isProaccountDisplay = C2YJ.LIZIZ.LIZ.getProAccountEnableDetailInfo().getIsProaccountDisplay();
            if (isProaccountDisplay != null) {
                if (isProaccountDisplay.intValue() == 2) {
                    return true;
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return false;
    }
}
