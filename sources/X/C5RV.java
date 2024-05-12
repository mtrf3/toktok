package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.a1;

/* renamed from: X.5RV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RV implements Cloneable {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;
    public String LJLJJI;

    public static C5RV LJI() {
        return new C5RV(CardStruct.IStatusCode.DEFAULT);
    }

    public static C5RV LJII() {
        return new C5RV("1");
    }

    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C5RV clone() {
        try {
            return (C5RV) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VETimeEffectOp{mType='");
        Q89.LIZIZ(LIZ, this.LJLIL, '\'', ", mStartTimePoint=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", mEndTimePoint=");
        C06510Nj.LIZIZ(LIZ, this.LJLJI, ", mIndex=", 0);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C5RV(String str) {
        this.LJLIL = str;
        this.LJLILLLLZI = 0L;
        this.LJLJI = 0L;
    }

    public static boolean LIZIZ(C5RV c5rv) {
        if (CardStruct.IStatusCode.DEFAULT.equals(c5rv.LJLIL)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(C5RV c5rv) {
        if (c5rv != null && "2".equals(c5rv.LJLIL)) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(C5RV c5rv) {
        if (c5rv != null && "3".equals(c5rv.LJLIL)) {
            return true;
        }
        return false;
    }

    public static boolean LJ(C5RV c5rv) {
        if (c5rv != null && "1".equals(c5rv.LJLIL)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5RV)) {
            return false;
        }
        C5RV c5rv = (C5RV) obj;
        if (this.LJLIL.equals(c5rv.LJLIL) && this.LJLILLLLZI == c5rv.LJLILLLLZI && this.LJLJI == c5rv.LJLJI) {
            c5rv.getClass();
            return true;
        }
        return false;
    }

    public C5RV(String str, long j, long j2) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    public static C5RV LJFF(long j, long j2, String str) {
        str.getClass();
        str.hashCode();
        switch (str.hashCode()) {
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                if (str.equals(CardStruct.IStatusCode.DEFAULT)) {
                    return LJI();
                }
                throw new IllegalArgumentException(a1.LJ("op key ", str, " is not supported, plz check again."));
            case C61447O9r.LJIIJ:
                if (str.equals("1")) {
                    return LJII();
                }
                throw new IllegalArgumentException(a1.LJ("op key ", str, " is not supported, plz check again."));
            case 50:
                if (str.equals("2")) {
                    return new C5RV("2", j, j2);
                }
                throw new IllegalArgumentException(a1.LJ("op key ", str, " is not supported, plz check again."));
            case 51:
                if (str.equals("3")) {
                    return new C5RV("3", j, j2);
                }
                throw new IllegalArgumentException(a1.LJ("op key ", str, " is not supported, plz check again."));
            default:
                throw new IllegalArgumentException(a1.LJ("op key ", str, " is not supported, plz check again."));
        }
    }
}
