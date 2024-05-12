package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* renamed from: X.QpY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68192QpY extends AbstractC68056QnM {
    @Override // X.AbstractC68056QnM
    public final Object LIZ(Object obj) {
        try {
            return Long.valueOf(CastLongProtector.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            this.LIZ.getClass();
            return null;
        }
    }

    public C68192QpY(C68559QvT c68559QvT, String str, Long l) {
        super(c68559QvT, str, l);
    }
}
