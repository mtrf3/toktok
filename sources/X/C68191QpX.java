package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;

/* renamed from: X.QpX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68191QpX extends AbstractC68056QnM {
    @Override // X.AbstractC68056QnM
    public final Object LIZ(Object obj) {
        try {
            return Double.valueOf(CastDoubleProtector.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            this.LIZ.getClass();
            return null;
        }
    }

    public C68191QpX(C68559QvT c68559QvT, Double d) {
        super(c68559QvT, "measurement.test.double_flag", d);
    }
}
