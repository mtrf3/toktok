package X;

import android.graphics.Color;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.ArrowConfig;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.BadgeText;
import com.bytedance.android.live.base.model.user.CombineBadgeBackground;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.CbR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31645CbR {
    public static C31642CbO LIZ(boolean z, BadgeStruct badgeModel) {
        CombineBadgeBackground combineBadgeBackground;
        ImageModel imageModel;
        BadgeText badgeText;
        String str;
        ImageModel imageModel2;
        ArrowConfig arrowConfig;
        CombineBadgeStruct combineBadgeStruct;
        o.LJIIIZ(badgeModel, "badgeModel");
        ImageModel imageModel3 = null;
        if (z && (combineBadgeStruct = badgeModel.combineBadgeStruct) != null && combineBadgeStruct.backgroundDarkMode != null) {
            if (combineBadgeStruct != null) {
                combineBadgeBackground = combineBadgeStruct.backgroundDarkMode;
            }
            combineBadgeBackground = null;
        } else {
            CombineBadgeStruct combineBadgeStruct2 = badgeModel.combineBadgeStruct;
            if (combineBadgeStruct2 != null) {
                combineBadgeBackground = combineBadgeStruct2.background;
            }
            combineBadgeBackground = null;
        }
        CombineBadgeStruct combineBadgeStruct3 = badgeModel.combineBadgeStruct;
        if (combineBadgeStruct3 != null) {
            imageModel = combineBadgeStruct3.icon;
            badgeText = combineBadgeStruct3.text;
            str = combineBadgeStruct3.str;
        } else {
            imageModel = null;
            badgeText = null;
            str = null;
        }
        if (combineBadgeBackground != null) {
            imageModel2 = combineBadgeBackground.image;
        } else {
            imageModel2 = null;
        }
        if (combineBadgeStruct3 != null && (arrowConfig = combineBadgeStruct3.arrowConfig) != null) {
            imageModel3 = arrowConfig.icon;
        }
        return new C31642CbO(imageModel, badgeText, str, imageModel2, imageModel3);
    }

    public static int LIZJ(C31645CbR c31645CbR, Integer num) {
        int i;
        c31645CbR.getClass();
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        return C15380j0.LIZ(i);
    }

    public static int LIZLLL(int i, String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return Color.parseColor(str);
                }
                return i;
            } catch (Exception unused) {
                return i;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C31647CbT LIZIZ(com.bytedance.android.live.base.model.user.BadgeStruct r42, int r43, boolean r44, X.C31647CbT r45, boolean r46, X.C31642CbO r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31645CbR.LIZIZ(com.bytedance.android.live.base.model.user.BadgeStruct, int, boolean, X.CbT, boolean, X.CbO, boolean):X.CbT");
    }
}
