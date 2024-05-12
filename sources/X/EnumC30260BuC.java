package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerSupportForDifferentScenesSetting;
import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.BuC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC30260BuC {
    public static final EnumC30260BuC ICON;
    public static final EnumC30260BuC ICON_LAND;
    public static final EnumC30260BuC ICON_WITH_TEXT;
    public static final /* synthetic */ EnumC30260BuC[] LJLJI;
    public final int LJLIL;
    public final C30267BuJ LJLILLLLZI;

    public static EnumC30260BuC valueOf(String str) {
        return (EnumC30260BuC) V0N.LJJJ(EnumC30260BuC.class, str);
    }

    public static EnumC30260BuC[] values() {
        return (EnumC30260BuC[]) LJLJI.clone();
    }

    public final boolean getHasTitle() {
        return false;
    }

    public final boolean isPopup() {
        return false;
    }

    static {
        int i;
        EnumC30260BuC enumC30260BuC = new EnumC30260BuC("ICON", 0, R.layout.dd9, C1DF.LJJIIJZLJL(C30274BuQ.LJLIL));
        ICON = enumC30260BuC;
        EnumC30260BuC enumC30260BuC2 = new EnumC30260BuC("ICON_LAND", 1, R.layout.dd8, C1DF.LJJIIJZLJL(C30275BuR.LJLIL));
        ICON_LAND = enumC30260BuC2;
        if (LiveInsertStickerSupportForDifferentScenesSetting.INSTANCE.isV2()) {
            i = R.layout.ddc;
        } else {
            i = R.layout.dda;
        }
        EnumC30260BuC enumC30260BuC3 = new EnumC30260BuC("ICON_WITH_TEXT", 2, i, C1DF.LJJIIJZLJL(C30276BuS.LJLIL));
        ICON_WITH_TEXT = enumC30260BuC3;
        LJLJI = new EnumC30260BuC[]{enumC30260BuC, enumC30260BuC2, enumC30260BuC3};
    }

    public final int getLayoutId() {
        return this.LJLIL;
    }

    public final C30267BuJ getLayoutParams() {
        return this.LJLILLLLZI;
    }

    public EnumC30260BuC(String str, int i, int i2, C30267BuJ c30267BuJ) {
        this.LJLIL = i2;
        this.LJLILLLLZI = c30267BuJ;
    }
}
