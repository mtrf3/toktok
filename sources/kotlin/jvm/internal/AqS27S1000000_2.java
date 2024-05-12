package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C08630Vn;
import X.C122004qa;
import X.C122034qd;
import X.C5M1;
import X.C76800UCe;
import X.EnumC122254qz;
import X.InterfaceC123794tT;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;

/* loaded from: classes3.dex */
public class AqS27S1000000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S1000000_2(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS27S1000000_2 aqS27S1000000_2, Object obj) {
        FTCEditToolbarState setState = (FTCEditToolbarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditToolbarState.copy$default(setState, null, null, null, aqS27S1000000_2.s0, null, null, null, null, null, null, null, null, 4087, null);
    }

    public static final Object invoke$1(AqS27S1000000_2 aqS27S1000000_2, Object obj) {
        FTCEditToolbarState setState = (FTCEditToolbarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditToolbarState.copy$default(setState, null, null, null, null, null, null, null, aqS27S1000000_2.s0, null, null, null, null, 3967, null);
    }

    public static final Object invoke$2(AqS27S1000000_2 aqS27S1000000_2, Object obj) {
        C5M1 setState = (C5M1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5M1.LIZ(setState, null, false, null, null, false, null, false, null, 0, null, null, null, null, null, new C08630Vn(aqS27S1000000_2.s0), null, null, null, null, false, null, 2080767);
    }

    public static final Object invoke$3(AqS27S1000000_2 aqS27S1000000_2, Object obj) {
        C122034qd editorPro = (C122034qd) obj;
        o.LJIIIZ(editorPro, "editorPro");
        InterfaceC123794tT LJFF = editorPro.LJFF();
        C122004qa c122004qa = new C122004qa(EnumC122254qz.TEXT_SPEAK);
        c122004qa.LIZIZ = aqS27S1000000_2.s0;
        LJFF.LJFF(c122004qa);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS27S1000000_2 aqS27S1000000_2, Object obj) {
        EditToolbarState setState = (EditToolbarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return EditToolbarState.copy$default(setState, null, null, null, null, null, aqS27S1000000_2.s0, null, null, null, null, null, null, null, null, null, null, null, false, 262111, null);
    }

    public static final Object invoke$5(AqS27S1000000_2 aqS27S1000000_2, Object obj) {
        EffectCategoryResponse it = (EffectCategoryResponse) obj;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(ujb.o.LJJJLIIL(it.getKey(), aqS27S1000000_2.s0, false));
    }
}
