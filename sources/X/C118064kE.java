package X;

import com.bytedance.bddatefmt.BDDateFormat;

/* renamed from: X.4kE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118064kE extends AbstractC65781Prl implements InterfaceC88472Yns<Long, String> {
    public static final C118064kE LJLIL = new C118064kE();

    public C118064kE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(Long l) {
        long longValue = l.longValue();
        if (longValue == 0) {
            return "";
        }
        if (System.currentTimeMillis() < longValue) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJI.getValue(), longValue);
        }
        if (SU4.LIZLLL(longValue)) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LIZIZ.getValue(), longValue);
        }
        if (SU4.LJ(longValue)) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIJ.getValue(), longValue);
        }
        if (System.currentTimeMillis() - longValue < 604800000) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LIZLLL.getValue(), longValue);
        }
        if (C86036Xpg.LJIIIIZZ(longValue)) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIIIZ.getValue(), longValue);
        }
        return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJI.getValue(), longValue);
    }
}
