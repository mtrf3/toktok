package X;

import com.bytedance.android.livesdk.livesetting.gift.GiftConfig;
import com.bytedance.android.livesdk.livesetting.gift.GiftConfigParams;
import com.bytedance.android.livesdk.livesetting.gift.MsgStair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uki, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78084Uki {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C78109Ul7.LJLIL);
    public static final C78094Uks LIZIZ = C78094Uks.LJLIL;

    public static GiftConfigParams LIZLLL() {
        return (GiftConfigParams) LIZ.getValue();
    }

    public static boolean LJFF() {
        return LIZLLL()._enableConfig;
    }

    public static String LIZIZ(EnumC78099Ukx side) {
        o.LJIIIZ(side, "side");
        int i = C78100Uky.LIZ[side.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LIZLLL()._otherSide._trayComboConfig._comboType;
                }
                throw new C162476Zf();
            }
            return LIZLLL()._anchorSide._trayComboConfig._comboType;
        }
        return LIZLLL()._selfSide._trayComboConfig._comboType;
    }

    public static List LJ(EnumC78099Ukx side) {
        o.LJIIIZ(side, "side");
        int i = C78100Uky.LIZ[side.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LIZLLL()._otherSide._trayComboConfig._jumpInterval;
                }
                throw new C162476Zf();
            }
            return LIZLLL()._anchorSide._trayComboConfig._jumpInterval;
        }
        return LIZLLL()._selfSide._trayComboConfig._jumpInterval;
    }

    public static int LIZ(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            MsgStair msgStair = (MsgStair) ListProtector.get(list, i3);
            int i4 = msgStair._minMsgCount;
            if (i >= i4 && i <= msgStair._maxMsgCount) {
                return i3;
            }
            if (i < i4) {
                size = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return i2 - 1;
    }

    public static GiftConfig LIZJ(boolean z, boolean z2) {
        EnumC78099Ukx enumC78099Ukx;
        if (z) {
            enumC78099Ukx = EnumC78099Ukx.SELF;
        } else if (z2) {
            enumC78099Ukx = EnumC78099Ukx.ANCHOR;
        } else {
            enumC78099Ukx = EnumC78099Ukx.OTHER;
        }
        int i = C78100Uky.LIZ[enumC78099Ukx.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LIZLLL()._otherSide;
                }
                throw new C162476Zf();
            }
            return LIZLLL()._anchorSide;
        }
        return LIZLLL()._selfSide;
    }
}
