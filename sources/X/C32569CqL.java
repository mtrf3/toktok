package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelManualSortSetting;
import com.bytedance.keva.Keva;

/* renamed from: X.CqL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32569CqL {
    public static boolean LIZ;
    public static final C278417k<Long, EnumC32766CtW> LIZIZ = new C278417k<>(30);
    public static final Keva LIZJ = Keva.getRepo("gift_panel_sort");

    public static String LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("sort_guide_shown_");
        LIZ2.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        return X1D.LIZIZ(LIZ2);
    }

    public static EnumC32766CtW LIZ(long j) {
        if (LiveGiftPanelManualSortSetting.INSTANCE.getValue() == 2) {
            EnumC32766CtW enumC32766CtW = LIZIZ.get(Long.valueOf(j));
            if (enumC32766CtW == null) {
                return EnumC32766CtW.DEFAULT;
            }
            return enumC32766CtW;
        }
        return EnumC32766CtW.DEFAULT;
    }
}
