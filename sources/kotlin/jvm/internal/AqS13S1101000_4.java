package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C232459Aj;
import X.C248269ok;
import X.C25558A1i;
import X.C25559A1j;
import X.C25561A1l;
import X.C25562A1m;
import X.C25563A1n;
import X.C25565A1p;
import X.C26338AVi;
import X.C32151Nz;
import X.C32I;
import X.C45804HyK;
import X.C4LX;
import X.C52804Knw;
import X.C62822Ol8;
import X.C70414RkI;
import X.C73422Sri;
import X.C73969T1h;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.T16;
import Y.AfS56S0100000_4;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HiddenItem;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HideAccountApi;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HideAccountViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ujb.s;

/* loaded from: classes5.dex */
public class AqS13S1101000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l1;
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
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS13S1101000_4 aqS13S1101000_4, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        String str2 = aqS13S1101000_4.s0;
        if (str2 == null) {
            str2 = "";
        }
        logNode.plusAssign("drop_down_list_name", str2);
        logNode.plusAssign("item_num", Integer.valueOf(aqS13S1101000_4.i2));
        if (o.LJ(aqS13S1101000_4.s0, "address") && (str = ((CandInputDataOptions) aqS13S1101000_4.l1).report) != null) {
            logNode.plusAssign("sever_data_report", str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS13S1101000_4 aqS13S1101000_4, Object it) {
        o.LJIIIZ(it, "it");
        ((LinkedHashMap) ((FollowerRelationViewModel) aqS13S1101000_4.l1).LJLLILLLL).clear();
        if (aqS13S1101000_4.i2 <= 1000) {
            C62822Ol8 c62822Ol8 = C52804Knw.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() == 1 || ((Number) c62822Ol8.getValue()).intValue() == 2) {
                FollowerRelationViewModel followerRelationViewModel = (FollowerRelationViewModel) aqS13S1101000_4.l1;
                String str = aqS13S1101000_4.s0;
                followerRelationViewModel.getClass();
                if (str != null && str.length() != 0) {
                    Map<String, Boolean> map = followerRelationViewModel.LJLLILLLL;
                    List LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6);
                    ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
                    Iterator it2 = LJLJJL.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new OSZ(it2.next(), Boolean.TRUE));
                    }
                    map.putAll(C113554cx.LJJLIIIJLJLI(arrayList));
                }
                return C76800UCe.LIZ;
            }
        }
        ((FollowerRelationViewModel) aqS13S1101000_4.l1).LJLJLLL = null;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS13S1101000_4 aqS13S1101000_4, Object obj) {
        TuxTextView setText = (TuxTextView) obj;
        o.LJIIIZ(setText, "$this$setText");
        setText.setText(aqS13S1101000_4.s0);
        if (aqS13S1101000_4.i2 > 0) {
            Context context = setText.getContext();
            o.LJIIIIZZ(context, "context");
            setText.setMaxWidth((C32151Nz.LJJII(context) - C45804HyK.LJJI(92)) / aqS13S1101000_4.i2);
        }
        setText.setTuxFont(61);
        setText.setTextColorRes(R.attr.go);
        StaticSellingPoint staticSellingPoint = (StaticSellingPoint) aqS13S1101000_4.l1;
        if (staticSellingPoint != null && staticSellingPoint.icon != null) {
            C26338AVi.LJIIIZ(setText, 6, 1, 0, 1, 16);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS13S1101000_4 aqS13S1101000_4, Object obj) {
        C73422Sri LJIJJ;
        C248269ok state = (C248269ok) obj;
        o.LJIIIZ(state, "state");
        boolean isHidden = ((HiddenItem) ListProtector.get(state.LJLIL, aqS13S1101000_4.i2)).isHidden();
        if (isHidden) {
            C25559A1j c25559A1j = HideAccountApi.LIZ;
            String userId = aqS13S1101000_4.s0;
            c25559A1j.getClass();
            o.LJIIIZ(userId, "userId");
            LJIJJ = C25559A1j.LIZIZ.unHideAccount(userId, "setting").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(C25562A1m.LJLIL).LJIJJ(C25563A1n.LJLIL);
        } else {
            C25559A1j c25559A1j2 = HideAccountApi.LIZ;
            String userId2 = aqS13S1101000_4.s0;
            c25559A1j2.getClass();
            o.LJIIIZ(userId2, "userId");
            LJIJJ = C25559A1j.LIZIZ.hideAccount(userId2, "setting").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(C25561A1l.LJLIL).LJIJJ(C25565A1p.LJLIL);
        }
        HideAccountViewModel hideAccountViewModel = (HideAccountViewModel) aqS13S1101000_4.l1;
        LJIJJ.LJJJLIIL(new C25558A1i(isHidden, hideAccountViewModel, aqS13S1101000_4.i2), new AfS56S0100000_4(hideAccountViewModel, 102));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS13S1101000_4 aqS13S1101000_4, Object obj) {
        TuxTextView setText = (TuxTextView) obj;
        o.LJIIIZ(setText, "$this$setText");
        setText.setText(aqS13S1101000_4.s0);
        if (aqS13S1101000_4.i2 > 0) {
            Context context = setText.getContext();
            o.LJIIIIZZ(context, "context");
            setText.setMaxWidth((C32151Nz.LJJII(context) - C45804HyK.LJJI(92)) / aqS13S1101000_4.i2);
        }
        setText.setTuxFont(71);
        setText.setTextColorRes(R.attr.gu);
        StaticSellingPoint staticSellingPoint = (StaticSellingPoint) aqS13S1101000_4.l1;
        if (staticSellingPoint != null && staticSellingPoint.icon != null) {
            ViewGroup.LayoutParams layoutParams = setText.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(6, 1, 4, 1);
            setText.setLayoutParams(marginLayoutParams);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS13S1101000_4 aqS13S1101000_4, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C232459Aj(aqS13S1101000_4.i2, (ProfileComponents) aqS13S1101000_4.l1);
        hierarchyData.LIZIZ = aqS13S1101000_4.s0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS13S1101000_4 aqS13S1101000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS13S1101000_4.l1).LIZIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entrance_zone", "add_on_layer");
        linkedHashMap.put("reason", aqS13S1101000_4.s0);
        linkedHashMap.put("action_cnt", Integer.valueOf(aqS13S1101000_4.i2));
        logNode.compareTo(logNode, linkedHashMap);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS13S1101000_4 aqS13S1101000_4, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C232459Aj(aqS13S1101000_4.i2, (ProfileComponents) aqS13S1101000_4.l1);
        hierarchyData.LIZIZ = aqS13S1101000_4.s0;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1101000_4(int i, ProfileComponents profileComponents, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l1 = profileComponents;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1101000_4(int i, String str, HideAccountViewModel hideAccountViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = hideAccountViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1101000_4(C70414RkI c70414RkI, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c70414RkI;
        this.s0 = str;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1101000_4(FollowerRelationViewModel followerRelationViewModel, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = followerRelationViewModel;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1101000_4(String str, int i, CandInputDataOptions candInputDataOptions, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i2 = i;
        this.l1 = candInputDataOptions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1101000_4(String str, int i, StaticSellingPoint staticSellingPoint, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i2 = i;
        this.l1 = staticSellingPoint;
    }
}
