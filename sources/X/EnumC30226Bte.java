package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerSupportForDifferentScenesSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting;
import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Bte, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC30226Bte {
    public static final EnumC30226Bte ICON;
    public static final EnumC30226Bte ICON_LAND;
    public static final EnumC30226Bte ICON_TITLE_HORIZONTAL;
    public static final EnumC30226Bte ICON_TITLE_HORIZONTAL_ARROW;
    public static final EnumC30226Bte ICON_TITLE_HORIZONTAL_ARROW_OPT;
    public static final EnumC30226Bte ICON_WITH_TEXT;
    public static final EnumC30226Bte ICON_WITH_TEXT_EFFECT;
    public static final /* synthetic */ EnumC30226Bte[] LJLJI;
    public final int LJLIL;
    public final ViewGroup.LayoutParams LJLILLLLZI;

    public static EnumC30226Bte valueOf(String str) {
        return (EnumC30226Bte) V0N.LJJJ(EnumC30226Bte.class, str);
    }

    public static EnumC30226Bte[] values() {
        return (EnumC30226Bte[]) LJLJI.clone();
    }

    static {
        int i;
        EnumC30226Bte enumC30226Bte = new EnumC30226Bte("ICON", 0, R.layout.dd9, new ViewGroup.MarginLayoutParams(C15380j0.LIZ(44.0f), C15380j0.LIZ(56.0f)));
        ICON = enumC30226Bte;
        if (LiveInsertStickerSupportForDifferentScenesSetting.INSTANCE.isV2()) {
            i = R.layout.ddc;
        } else {
            i = R.layout.dd_;
        }
        EnumC30226Bte enumC30226Bte2 = new EnumC30226Bte("ICON_WITH_TEXT", 1, i, new ViewGroup.MarginLayoutParams(C15380j0.LIZ(44.0f), C15380j0.LIZ(56.0f)));
        ICON_WITH_TEXT = enumC30226Bte2;
        EnumC30226Bte enumC30226Bte3 = new EnumC30226Bte("ICON_TITLE_HORIZONTAL", 2, R.layout.ddf, new ViewGroup.LayoutParams(-1, C15380j0.LIZ(48.0f)));
        ICON_TITLE_HORIZONTAL = enumC30226Bte3;
        EnumC30226Bte enumC30226Bte4 = new EnumC30226Bte("ICON_TITLE_HORIZONTAL_ARROW", 3, R.layout.ddg, new ViewGroup.LayoutParams(-1, C15380j0.LIZ(48.0f)));
        ICON_TITLE_HORIZONTAL_ARROW = enumC30226Bte4;
        EnumC30226Bte enumC30226Bte5 = new EnumC30226Bte("ICON_TITLE_HORIZONTAL_ARROW_OPT", 4, R.layout.ddd, new ViewGroup.LayoutParams(-1, C15380j0.LIZ(48.0f)));
        ICON_TITLE_HORIZONTAL_ARROW_OPT = enumC30226Bte5;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C15380j0.LIZ(36.0f), C15380j0.LIZ(64.0f));
        if (TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldAddIconBackground()) {
            if (C15380j0.LJIIZILJ()) {
                marginLayoutParams.rightMargin = C15380j0.LIZ(12.0f);
            } else {
                marginLayoutParams.leftMargin = C15380j0.LIZ(12.0f);
            }
        } else {
            marginLayoutParams.setMarginStart(C15380j0.LIZ(2.0f));
            marginLayoutParams.setMarginEnd(C15380j0.LIZ(2.0f));
        }
        EnumC30226Bte enumC30226Bte6 = new EnumC30226Bte("ICON_LAND", 5, R.layout.dd8, marginLayoutParams);
        ICON_LAND = enumC30226Bte6;
        EnumC30226Bte enumC30226Bte7 = new EnumC30226Bte("ICON_WITH_TEXT_EFFECT", 6, R.layout.ddb, new ViewGroup.MarginLayoutParams((C15380j0.LJIIL() - C15380j0.LIZ(17.0f)) / 4, -2));
        ICON_WITH_TEXT_EFFECT = enumC30226Bte7;
        LJLJI = new EnumC30226Bte[]{enumC30226Bte, enumC30226Bte2, enumC30226Bte3, enumC30226Bte4, enumC30226Bte5, enumC30226Bte6, enumC30226Bte7};
    }

    public final boolean getHasText() {
        if (this == ICON_WITH_TEXT || this == ICON_WITH_TEXT_EFFECT) {
            return true;
        }
        return false;
    }

    public final boolean getHasTitle() {
        if (this == ICON_TITLE_HORIZONTAL || this == ICON_TITLE_HORIZONTAL_ARROW || this == ICON_TITLE_HORIZONTAL_ARROW_OPT) {
            return true;
        }
        return false;
    }

    public final boolean isBottomToolbar() {
        if (this == ICON || this == ICON_WITH_TEXT || this == ICON_LAND) {
            return true;
        }
        return false;
    }

    public final boolean isPopup() {
        if (this == ICON_TITLE_HORIZONTAL || this == ICON_TITLE_HORIZONTAL_ARROW || this == ICON_TITLE_HORIZONTAL_ARROW_OPT || this == ICON_WITH_TEXT_EFFECT) {
            return true;
        }
        return false;
    }

    public final int getLayoutId() {
        return this.LJLIL;
    }

    public final ViewGroup.LayoutParams getLayoutParams() {
        return this.LJLILLLLZI;
    }

    public EnumC30226Bte(String str, int i, int i2, ViewGroup.LayoutParams layoutParams) {
        this.LJLIL = i2;
        this.LJLILLLLZI = layoutParams;
    }
}
