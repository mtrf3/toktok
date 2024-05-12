package X;

/* renamed from: X.FHn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38719FHn {
    public static final C38719FHn LIZIZ = new C38719FHn();
    public volatile FI4 LIZ;

    public void onEvent(C38718FHm c38718FHm) {
        try {
            FI4 fi4 = this.LIZ;
            if (fi4 != null) {
                String str = c38718FHm.LIZIZ;
                if (fi4.LIZ.LIZIZ != null) {
                    fi4.LIZ.LIZIZ.onEvent(str);
                }
            }
        } catch (Exception unused) {
        }
    }
}
