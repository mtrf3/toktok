package X;

import Y.IDDListenerS144S0100000_4;
import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.touchpoint.core.invitecode.InviteCodeResponse;
import com.bytedance.touchpoint.core.model.DynamicDialog;
import com.bytedance.touchpoint.core.popup.PopupViewModel;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9oH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247979oH extends AbstractC244999jT {
    public static final C5H3 LJLJLJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C247999oJ.LJLIL);
    public final String LJLIL = "performance_optimization_exp";
    public boolean LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public DynamicDialog LJLJJL;
    public DialogC248159oZ LJLJJLL;
    public final C214378bB LJLJL;

    public C247979oH() {
        C246049lA c246049lA = C246049lA.LJLILLLLZI;
        C214378bB c214378bB = new C214378bB(C65352Pkq.LIZ(PopupViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C247989oI.INSTANCE, null, null);
        this.LJLJL = c214378bB;
        C8YN.LJII(this, (AssemViewModel) c214378bB.getValue(), new TBT() { // from class: X.9Op
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C236009Oa) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 270), 4);
        C8YN.LJII(this, (AssemViewModel) c214378bB.getValue(), new TBT() { // from class: X.9P3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236009Oa) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 271), 4);
    }

    @Override // X.AbstractC244999jT
    public final BaseTouchPointDataVM LJJ() {
        return (BaseTouchPointDataVM) this.LJLJL.getValue();
    }

    public final void LJJI() {
        AbstractC247499nV abstractC247499nV;
        Activity LJII;
        String str;
        int i;
        Integer num;
        DynamicDialog dynamicDialog = this.LJLJJL;
        if (dynamicDialog != null && (abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0)) != null && (LJII = abstractC247499nV.LJII()) != null) {
            DynamicDialog dynamicDialog2 = this.LJLJJL;
            if (dynamicDialog2 != null) {
                str = dynamicDialog2.name;
            } else {
                str = null;
            }
            C248019oL c248019oL = (C248019oL) C95J.LIZ(4);
            String str2 = "others";
            if (c248019oL != null && !c248019oL.LIZLLL()) {
                InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                if (interfaceC247459nR != null) {
                    LinkedHashMap LIZIZ = JF1.LIZIZ("pop_name", str, "result", "not_in_feed");
                    LIZIZ.put("position", "others");
                    interfaceC247459nR.LIZIZ("pop_filtered_reason", LIZIZ);
                    return;
                }
                return;
            }
            C248019oL c248019oL2 = (C248019oL) C95J.LIZ(4);
            if (c248019oL2 != null && c248019oL2.LIZJ()) {
                InterfaceC247459nR interfaceC247459nR2 = C95J.LIZ;
                if (interfaceC247459nR2 == null) {
                    return;
                }
                LinkedHashMap LIZIZ2 = JF1.LIZIZ("pop_name", str, "result", "popup_occupied");
                C248019oL c248019oL3 = (C248019oL) C95J.LIZ(4);
                if (c248019oL3 != null && c248019oL3.LIZLLL()) {
                    str2 = "feed";
                }
                LIZIZ2.put("position", str2);
                interfaceC247459nR2.LIZIZ("pop_filtered_reason", LIZIZ2);
                return;
            }
            if (this.LJLILLLLZI) {
                if (this.LJLJJI) {
                    return;
                }
                InterfaceC247459nR interfaceC247459nR3 = C95J.LIZ;
                if (interfaceC247459nR3 != null) {
                    LinkedHashMap LIZIZ3 = JF1.LIZIZ("pop_name", str, "result", "have_popped");
                    C248019oL c248019oL4 = (C248019oL) C95J.LIZ(4);
                    if (c248019oL4 != null && c248019oL4.LIZLLL()) {
                        str2 = "feed";
                    }
                    LIZIZ3.put("position", str2);
                    interfaceC247459nR3.LIZIZ("pop_filtered_reason", LIZIZ3);
                }
                this.LJLJJI = true;
                return;
            }
            if (this.LJLJI > 0) {
                InterfaceC247459nR interfaceC247459nR4 = C95J.LIZ;
                if (interfaceC247459nR4 == null) {
                    return;
                }
                LinkedHashMap LIZIZ4 = JF1.LIZIZ("pop_name", str, "result", "popup_occupied");
                C248019oL c248019oL5 = (C248019oL) C95J.LIZ(4);
                if (c248019oL5 != null && c248019oL5.LIZLLL()) {
                    str2 = "feed";
                }
                LIZIZ4.put("position", str2);
                interfaceC247459nR4.LIZIZ("pop_filtered_reason", LIZIZ4);
                return;
            }
            DynamicDialog dynamicDialog3 = this.LJLJJL;
            if (dynamicDialog3 != null && (num = dynamicDialog3.showAfter) != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (C249979rV.LIZLLL < i) {
                return;
            }
            C248019oL c248019oL6 = (C248019oL) C95J.LIZ(4);
            if (c248019oL6 == null) {
                try {
                    LJJIFFI(LJII);
                    DialogC248159oZ dialogC248159oZ = this.LJLJJLL;
                    if (dialogC248159oZ == null) {
                        return;
                    }
                    this.LJLILLLLZI = true;
                    dialogC248159oZ.setOnDismissListener(new IDDListenerS144S0100000_4(null, 10));
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
            AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(LJII, this, 200);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(dynamicDialog.jsSource);
            LIZ.append("&touchpointId=");
            LIZ.append(dynamicDialog.LIZ);
            LIZ.append("&launchPlanId=");
            LIZ.append(dynamicDialog.LIZJ);
            LIZ.append("&popupType=");
            LIZ.append(dynamicDialog.name);
            c248019oL6.LJ(LJII, X1D.LIZIZ(LIZ), aqS135S0200000_4);
        }
    }

    public final void LJJIFFI(Activity activity) {
        String str;
        boolean z;
        String str2;
        List<InviteCodeResponse.Button> list;
        InviteCodeResponse.Button button;
        InviteCodeResponse.Action action;
        final DynamicDialog dynamicDialog = this.LJLJJL;
        if (dynamicDialog != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(dynamicDialog.jsSource);
            LIZ.append("&data=");
            LIZ.append(URLEncoder.encode(dynamicDialog.LJFF));
            LIZ.append("&touchpointId=");
            LIZ.append(Integer.valueOf(dynamicDialog.LIZ).intValue());
            String LIZIZ = X1D.LIZIZ(LIZ);
            DynamicDialog dynamicDialog2 = this.LJLJJL;
            if (dynamicDialog2 == null || (list = dynamicDialog2.buttons) == null || (button = (InviteCodeResponse.Button) ORZ.LJLLLLLL(0, list)) == null || (action = button.action) == null || (str = action.link) == null) {
                str = "";
            }
            java.util.Map<String, String> map = dynamicDialog.extra;
            if (map == null || (str2 = map.get(this.LJLIL)) == null) {
                z = true;
            } else {
                z = o.LJ(str2, "show_by_client");
            }
            C248079oR c248079oR = new C248079oR(LIZIZ, str, z);
            c248079oR.LIZ = new InterfaceC248189oc() { // from class: X.9oG
                @Override // X.InterfaceC248189oc
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC248189oc
                public final void onDismiss() {
                }

                @Override // X.InterfaceC248189oc
                public final void LIZ() {
                    int i;
                    DynamicDialog dynamicDialog3 = dynamicDialog;
                    int i2 = dynamicDialog3.LIZ;
                    Integer num = dynamicDialog3.LIZJ;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    C247749nu.LIZ(1, i2, i, "");
                }

                @Override // X.InterfaceC248189oc
                public final void onShow() {
                    String str3;
                    int i;
                    C247519nX c247519nX = C247519nX.LIZ;
                    int i2 = dynamicDialog.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    DynamicDialog dynamicDialog3 = C247979oH.this.LJLJJL;
                    String str4 = null;
                    if (dynamicDialog3 != null) {
                        str3 = dynamicDialog3.notificationName;
                    } else {
                        str3 = null;
                    }
                    linkedHashMap.put("notification_name", str3);
                    DynamicDialog dynamicDialog4 = C247979oH.this.LJLJJL;
                    if (dynamicDialog4 != null) {
                        str4 = dynamicDialog4.popName;
                    }
                    linkedHashMap.put("pop_name", str4);
                    DynamicDialog dynamicDialog5 = dynamicDialog;
                    Integer num = dynamicDialog5.LIZJ;
                    Integer num2 = dynamicDialog5.showAfter;
                    if (num2 != null) {
                        i = num2.intValue();
                    } else {
                        i = 0;
                    }
                    C247519nX.LJIIL(c247519nX, i2, linkedHashMap, num, Integer.valueOf(i), 48);
                }

                @Override // X.InterfaceC248189oc
                public final void LIZJ(String str3) {
                    int i;
                    String str4;
                    String str5;
                    InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                    if (interfaceC247459nR != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        DynamicDialog dynamicDialog3 = C247979oH.this.LJLJJL;
                        if (dynamicDialog3 != null) {
                            str4 = dynamicDialog3.name;
                        } else {
                            str4 = null;
                        }
                        linkedHashMap.put("pop_name", str4);
                        linkedHashMap.put("result", "wrong_info");
                        C248019oL c248019oL = (C248019oL) C95J.LIZ(4);
                        if (c248019oL != null && c248019oL.LIZLLL()) {
                            str5 = "feed";
                        } else {
                            str5 = "others";
                        }
                        linkedHashMap.put("position", str5);
                        interfaceC247459nR.LIZIZ("pop_filtered_reason", linkedHashMap);
                    }
                    DynamicDialog dynamicDialog4 = dynamicDialog;
                    int i2 = dynamicDialog4.LIZ;
                    Integer num = dynamicDialog4.LIZJ;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    C247749nu.LIZ(0, i2, i, str3);
                }

                @Override // X.InterfaceC248189oc
                public final void onClick(String str3) {
                    int i;
                    String str4;
                    String str5;
                    int i2;
                    C247519nX c247519nX = C247519nX.LIZ;
                    DynamicDialog dynamicDialog3 = C247979oH.this.LJLJJL;
                    if (dynamicDialog3 != null) {
                        i = dynamicDialog3.LIZ;
                    } else {
                        i = -1;
                    }
                    LinkedHashMap LIZ2 = C0JU.LIZ("click_position", str3);
                    DynamicDialog dynamicDialog4 = C247979oH.this.LJLJJL;
                    Integer num = null;
                    if (dynamicDialog4 != null) {
                        str4 = dynamicDialog4.notificationName;
                    } else {
                        str4 = null;
                    }
                    LIZ2.put("notification_name", str4);
                    DynamicDialog dynamicDialog5 = C247979oH.this.LJLJJL;
                    if (dynamicDialog5 != null) {
                        str5 = dynamicDialog5.popName;
                    } else {
                        str5 = null;
                    }
                    LIZ2.put("pop_name", str5);
                    DynamicDialog dynamicDialog6 = C247979oH.this.LJLJJL;
                    if (dynamicDialog6 != null) {
                        num = dynamicDialog6.LIZJ;
                        Integer num2 = dynamicDialog6.showAfter;
                        if (num2 != null) {
                            i2 = num2.intValue();
                            C247519nX.LJIIIZ(c247519nX, i, LIZ2, num, Integer.valueOf(i2), 16);
                        }
                    }
                    i2 = 0;
                    C247519nX.LJIIIZ(c247519nX, i, LIZ2, num, Integer.valueOf(i2), 16);
                }
            };
            this.LJLJJLL = new DialogC248159oZ(activity, new C248089oS(c248079oR));
        }
    }
}
