package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C105504Cc;
import X.C111154Xv;
import X.C32151Nz;
import X.C4LX;
import X.C76800UCe;
import X.C87273bf;
import X.InterfaceC88472Yns;
import X.O6R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;

/* loaded from: classes2.dex */
public class AqS26S0001000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S0001000_1(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS26S0001000_1 aqS26S0001000_1, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C87273bf(aqS26S0001000_1.i0);
        hierarchyData.LIZIZ = "sticker_video_config";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS26S0001000_1 aqS26S0001000_1, Object obj) {
        ViewGroup.MarginLayoutParams configMarginLayoutParams = (ViewGroup.MarginLayoutParams) obj;
        o.LJIIIZ(configMarginLayoutParams, "$this$configMarginLayoutParams");
        configMarginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)) + aqS26S0001000_1.i0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS26S0001000_1 aqS26S0001000_1, Object obj) {
        ViewGroup.MarginLayoutParams configMarginLayoutParams = (ViewGroup.MarginLayoutParams) obj;
        o.LJIIIZ(configMarginLayoutParams, "$this$configMarginLayoutParams");
        configMarginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)) + aqS26S0001000_1.i0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS26S0001000_1 aqS26S0001000_1, Object obj) {
        ViewGroup.MarginLayoutParams configMarginLayoutParams = (ViewGroup.MarginLayoutParams) obj;
        o.LJIIIZ(configMarginLayoutParams, "$this$configMarginLayoutParams");
        configMarginLayoutParams.setMarginStart(aqS26S0001000_1.i0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS26S0001000_1 aqS26S0001000_1, Object obj) {
        LinearLayout.LayoutParams layoutParams;
        C111154Xv viewScope = (C111154Xv) obj;
        o.LJIIIZ(viewScope, "$this$viewScope");
        View view = viewScope.LJFF;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            int i = aqS26S0001000_1.i0;
            layoutParams.weight = 0.0f;
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS26S0001000_1 aqS26S0001000_1, Object obj) {
        ImSysEmojiModel it = (ImSysEmojiModel) obj;
        o.LJIIIZ(it, "it");
        int businessType = it.getBusinessType() & aqS26S0001000_1.i0;
        boolean z = true;
        if (businessType != 1 && businessType != 2 && businessType != 4 && businessType != 7) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AqS26S0001000_1 aqS26S0001000_1, Object setStateImmediate) {
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return new C105504Cc(aqS26S0001000_1.i0);
    }
}
