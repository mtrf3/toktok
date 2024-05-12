package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.6UW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UW extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C6UW LJLIL = new C6UW();

    public C6UW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int LIZLLL = C226388uY.LIZLLL();
        int value = C6UU.ADD_YOURS.getValue();
        Integer valueOf = Integer.valueOf(R.string.bcx);
        if (LIZLLL == value || LIZLLL != C6UU.POST_YOURS.getValue()) {
            return valueOf;
        }
        return Integer.valueOf(R.string.bd3);
    }
}
