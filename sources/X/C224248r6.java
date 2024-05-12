package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.8r6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224248r6 {
    public static boolean LIZ(Context context) {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        C224298rB LIZIZ = LIZIZ(context);
        if (LIZIZ != null && (interfaceC65784Pro = LIZIZ.LJLIL) != null && interfaceC65784Pro.invoke().booleanValue()) {
            return true;
        }
        return false;
    }

    public static C224298rB LIZIZ(Context context) {
        Activity LJIJJ;
        ActivityC45651qj LJJIFFI;
        InterfaceC55251LmJ LIZLLL;
        if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null || (LJJIFFI = C45804HyK.LJJIFFI(LJIJJ)) == null || (LIZLLL = C55247LmF.LIZLLL(C55230Lly.LIZLLL(LJJIFFI, null), C224298rB.class, "source_default_key")) == null) {
            return null;
        }
        return (C224298rB) LIZLLL.getSource();
    }
}
