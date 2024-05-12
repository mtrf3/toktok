package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C121914qR;
import X.C123764tQ;
import X.C135005Ro;
import X.C145995oB;
import X.C150045ui;
import X.C6M6;
import X.C76800UCe;
import X.GXR;
import X.InterfaceC88474Ynu;
import X.OUP;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import v5.n;

/* loaded from: classes3.dex */
public class IDqS449S0100000_2 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS449S0100000_2(C121914qR c121914qR, int i) {
        super(4);
        this.$t = i;
        this.l0 = c121914qR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS449S0100000_2(C123764tQ c123764tQ, int i) {
        super(4);
        this.$t = i;
        this.l0 = c123764tQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS449S0100000_2(C150045ui c150045ui, int i) {
        super(4);
        this.$t = i;
        this.l0 = c150045ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS449S0100000_2(C6M6 c6m6, int i) {
        super(4);
        this.$t = i;
        this.l0 = c6m6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS449S0100000_2(n nVar, n<C76800UCe> nVar2) {
        super(4);
        this.$t = nVar2;
        this.l0 = nVar;
    }

    public static final Object invoke$0(IDqS449S0100000_2 iDqS449S0100000_2, Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        long longValue3 = ((Number) obj3).longValue();
        long longValue4 = ((Number) obj4).longValue();
        C121914qR c121914qR = (C121914qR) iDqS449S0100000_2.l0;
        c121914qR.LJ = longValue;
        c121914qR.LJFF = longValue2;
        c121914qR.LIZJ = longValue3;
        c121914qR.LIZLLL = longValue4;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS449S0100000_2 iDqS449S0100000_2, Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        ((Number) obj3).longValue();
        long longValue3 = ((Number) obj4).longValue();
        C123764tQ c123764tQ = (C123764tQ) iDqS449S0100000_2.l0;
        int i = (int) longValue;
        c123764tQ.LJLILLLLZI = i;
        c123764tQ.LJLJI = (int) longValue3;
        c123764tQ.LJLJJI = i;
        c123764tQ.LJLJJL = (int) longValue2;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS449S0100000_2 iDqS449S0100000_2, Object obj, Object obj2, Object obj3, Object obj4) {
        String actionType = (String) obj;
        String name = (String) obj2;
        String effectID = (String) obj3;
        int intValue = ((Number) obj4).intValue();
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(effectID, "effectID");
        VideoPublishEditModel editModel = ((C6M6) iDqS449S0100000_2.l0).LLJJI();
        o.LJIIIZ(editModel, "editModel");
        C145995oB LIZIZ = C135005Ro.LIZIZ(editModel);
        LIZIZ.LJI("tab_name", "");
        LIZIZ.LIZ(1003, "scene_id");
        LIZIZ.LJI("effect_name", name);
        LIZIZ.LJI("effect_id", effectID);
        LIZIZ.LIZ(0, "is_capcut");
        LIZIZ.LIZ(0, "is_editor_pro");
        LIZIZ.LIZ(0, "is_multi_track");
        LIZIZ.LIZ(intValue, "impr_position");
        int i = editModel.draftId;
        if (i != 0) {
            LIZIZ.LIZ(i, "draft_id");
        }
        if (!TextUtils.isEmpty(editModel.newDraftId)) {
            LIZIZ.LIZLLL("new_draft_id", editModel.newDraftId);
        }
        LIZIZ.LIZLLL("entrance", actionType);
        GXR.LIZ("effect_click", LIZIZ.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS449S0100000_2 iDqS449S0100000_2, Object obj, Object obj2, Object obj3, Object obj4) {
        String effectID = (String) obj;
        int intValue = ((Number) obj2).intValue();
        String actionType = (String) obj3;
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        o.LJIIIZ(effectID, "effectID");
        o.LJIIIZ(actionType, "actionType");
        C6M6 c6m6 = (C6M6) iDqS449S0100000_2.l0;
        c6m6.LLIL = true;
        c6m6.LJLZ(effectID, intValue, actionType, booleanValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS449S0100000_2 iDqS449S0100000_2, Object obj, Object obj2, Object obj3, Object obj4) {
        ((n) iDqS449S0100000_2.l0).LJ(null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS449S0100000_2 iDqS449S0100000_2, Object obj, Object obj2, Object obj3, Object obj4) {
        List<Effect> list = (List) obj;
        ((Boolean) obj2).booleanValue();
        if (list != null) {
            C150045ui c150045ui = (C150045ui) iDqS449S0100000_2.l0;
            ArrayList arrayList = new ArrayList();
            for (Effect effect : list) {
                c150045ui.getClass();
                if (!OUP.LJJIIZ(effect)) {
                    arrayList.add(effect);
                }
            }
            return arrayList;
        }
        return null;
    }
}
