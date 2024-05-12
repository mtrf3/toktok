package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C178266z8;
import X.C181847Bs;
import X.C185167Om;
import X.C194147je;
import X.C195937mX;
import X.C209798Lf;
import X.C209808Lg;
import X.C212518Vr;
import X.C29822Bn8;
import X.C3C8;
import X.C76800UCe;
import X.C78847Ux1;
import X.C7MK;
import X.C8LU;
import X.C8NH;
import X.C8NK;
import X.C8W0;
import X.InterfaceC194547kI;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardInputV2Assem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS11S0401000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AqS11S0401000_3 aqS11S0401000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(C29822Bn8.LIZ((Context) aqS11S0401000_3.l0, R.string.did, "context.resources.getStr…mmentSheet_popUp_button1)"), new AqS29S0301000_3((C8W0) aqS11S0401000_3.l1, (C8W0) aqS11S0401000_3.i4, (int) aqS11S0401000_3.l2, (InterfaceC88473Ynt<? super Integer, ? super Integer, ? super Intent, C76800UCe>) aqS11S0401000_3.l3, (InterfaceC65784Pro<C76800UCe>) 2));
        actionGroup.LJIIIZ(C29822Bn8.LIZ((Context) aqS11S0401000_3.l0, R.string.die, "context.resources.getStr…mmentSheet_popUp_button2)"), C178266z8.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS11S0401000_3 aqS11S0401000_3, Object obj) {
        String str;
        String str2;
        String str3;
        String desc;
        int i;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("earphone_status", EarphonePlayerControl.LJII().LIZJ() ? 1 : 0);
        sendEventTrackingAsync.put("enter_from", C7MK.LIZLLL(((C181847Bs) aqS11S0401000_3.l0).LJLILLLLZI, (InterfaceC194547kI) aqS11S0401000_3.l1));
        sendEventTrackingAsync.put("group_id", ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getAid());
        sendEventTrackingAsync.put("author_id", ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getAuthorUid());
        sendEventTrackingAsync.put("follow_status", ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getFollowStatus());
        NowPostInfo nowPostInfo = ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().nowPostInfo;
        if (nowPostInfo == null || (str = nowPostInfo.getNowMediaType()) == null) {
            str = "post";
        }
        sendEventTrackingAsync.put("now_type", str);
        sendEventTrackingAsync.put("is_now_clear", aqS11S0401000_3.i4);
        sendEventTrackingAsync.put("is_blue_v_user", C195937mX.LJIIL(((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getAuthor(), ((InterfaceC194547kI) aqS11S0401000_3.l1).z()) ? 1 : 0);
        sendEventTrackingAsync.put("now_card_type", C7MK.LIZIZ(((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme()));
        LogPbBean logPbBean = ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getLogPbBean();
        if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
            str2 = "";
        }
        sendEventTrackingAsync.put("impr_id", str2);
        sendEventTrackingAsync.put("request_id", ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getRequestId());
        sendEventTrackingAsync.put("enter_position", C7MK.LJ(((C181847Bs) aqS11S0401000_3.l0).LJLJJI, (InterfaceC194547kI) aqS11S0401000_3.l1));
        sendEventTrackingAsync.put("has_small_window", C78847Ux1.LJJIJIL((InterfaceC194547kI) aqS11S0401000_3.l1));
        sendEventTrackingAsync.put("is_original", C78847Ux1.LJJJJ(((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme()));
        if (((InterfaceC194547kI) aqS11S0401000_3.l1).LLLLIIIILLL()) {
            Integer num = (Integer) aqS11S0401000_3.l2;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            sendEventTrackingAsync.put("now_aggregate_rank", i + 1);
        }
        if (C185167Om.LIZIZ() == 0 || (desc = ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getDesc()) == null || desc.length() == 0) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str3 = "1";
        }
        sendEventTrackingAsync.put("caption_flag", str3);
        sendEventTrackingAsync.put("is_new_page", ((C181847Bs) aqS11S0401000_3.l0).LJLIL.LIZIZ());
        if (o.LJ(((C181847Bs) aqS11S0401000_3.l0).LJLIL, C194147je.LIZ)) {
            sendEventTrackingAsync.put("previous_page", ((C181847Bs) aqS11S0401000_3.l0).LJLJJL);
            sendEventTrackingAsync.put("now_tab_enter_method", ((C181847Bs) aqS11S0401000_3.l0).LJLJJLL);
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS11S0401000_3.l3;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(sendEventTrackingAsync);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS11S0401000_3 aqS11S0401000_3, Object obj) {
        String str;
        String str2;
        String desc;
        int i;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("earphone_status", EarphonePlayerControl.LJII().LIZJ() ? 1 : 0);
        sendEventTrackingAsync.put("enter_from", C7MK.LIZLLL(((C181847Bs) aqS11S0401000_3.l0).LJLILLLLZI, (InterfaceC194547kI) aqS11S0401000_3.l1));
        sendEventTrackingAsync.put("group_id", ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getAid());
        sendEventTrackingAsync.put("author_id", ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getAuthorUid());
        sendEventTrackingAsync.put("follow_status", ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getFollowStatus());
        NowPostInfo nowPostInfo = ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().nowPostInfo;
        if (nowPostInfo == null || (str = nowPostInfo.getNowMediaType()) == null) {
            str = "post";
        }
        sendEventTrackingAsync.put("now_type", str);
        sendEventTrackingAsync.put("is_now_clear", aqS11S0401000_3.i4);
        sendEventTrackingAsync.put("now_card_type", C7MK.LIZIZ(((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme()));
        sendEventTrackingAsync.put("request_id", ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getRequestId());
        sendEventTrackingAsync.put("enter_position", C7MK.LJ(((C181847Bs) aqS11S0401000_3.l0).LJLJJI, (InterfaceC194547kI) aqS11S0401000_3.l1));
        sendEventTrackingAsync.put("has_small_window", C78847Ux1.LJJIJIL((InterfaceC194547kI) aqS11S0401000_3.l1));
        sendEventTrackingAsync.put("is_original", C78847Ux1.LJJJJ(((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme()));
        if (((InterfaceC194547kI) aqS11S0401000_3.l1).LLLLIIIILLL()) {
            Integer num = (Integer) aqS11S0401000_3.l2;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            sendEventTrackingAsync.put("now_aggregate_rank", i + 1);
        }
        if (C185167Om.LIZIZ() == 0 || (desc = ((InterfaceC194547kI) aqS11S0401000_3.l1).getAweme().getDesc()) == null || desc.length() == 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        sendEventTrackingAsync.put("caption_flag", str2);
        sendEventTrackingAsync.put("is_new_page", ((C181847Bs) aqS11S0401000_3.l0).LJLIL.LIZIZ());
        if (o.LJ(((C181847Bs) aqS11S0401000_3.l0).LJLIL, C194147je.LIZ)) {
            sendEventTrackingAsync.put("previous_page", ((C181847Bs) aqS11S0401000_3.l0).LJLJJL);
            sendEventTrackingAsync.put("now_tab_enter_method", ((C181847Bs) aqS11S0401000_3.l0).LJLJJLL);
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS11S0401000_3.l3;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(sendEventTrackingAsync);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS11S0401000_3 aqS11S0401000_3, Object obj) {
        C8NK reusedUiContentAssem = (C8NK) obj;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        View LIZIZ = ((C8LU) aqS11S0401000_3.l0).LIZIZ(aqS11S0401000_3.i4, (ViewGroup) aqS11S0401000_3.l1, (ReusedUIAssem) aqS11S0401000_3.l2, (RootCellCommonAbility) aqS11S0401000_3.l3);
        reusedUiContentAssem.LJFF = LIZIZ;
        reusedUiContentAssem.LIZLLL = LIZIZ.getId();
        reusedUiContentAssem.LIZJ = (ReusedUIContentAssem) ((ReusedUIAssem) aqS11S0401000_3.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS11S0401000_3 aqS11S0401000_3, Object obj) {
        C209808Lg reusedUiTriggerAssem = (C209808Lg) obj;
        o.LJIIIZ(reusedUiTriggerAssem, "$this$reusedUiTriggerAssem");
        reusedUiTriggerAssem.LIZLLL = ((C8LU) aqS11S0401000_3.l0).LIZIZ(aqS11S0401000_3.i4, (ViewGroup) aqS11S0401000_3.l1, (ReusedUIAssem) aqS11S0401000_3.l2, (RootCellCommonAbility) aqS11S0401000_3.l3);
        reusedUiTriggerAssem.LIZIZ = (BaseCellTriggerComponent) ((ReusedUIAssem) aqS11S0401000_3.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS11S0401000_3 aqS11S0401000_3, Object obj) {
        C212518Vr c212518Vr;
        C8NH reusedUiSlotAssem = (C8NH) obj;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        View LIZIZ = ((C8LU) aqS11S0401000_3.l0).LIZIZ(aqS11S0401000_3.i4, (ViewGroup) aqS11S0401000_3.l1, (ReusedUIAssem) aqS11S0401000_3.l2, (RootCellCommonAbility) aqS11S0401000_3.l3);
        reusedUiSlotAssem.LJFF = LIZIZ;
        reusedUiSlotAssem.LIZLLL = LIZIZ.getId();
        reusedUiSlotAssem.LIZJ = (ReusedUISlotAssem) ((ReusedUIAssem) aqS11S0401000_3.l2);
        if (C209798Lf.LIZ) {
            c212518Vr = C212518Vr.LIZLLL;
        } else {
            c212518Vr = C212518Vr.LIZ;
        }
        reusedUiSlotAssem.LJ = c212518Vr;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S0401000_3(int i, InterfaceC194547kI interfaceC194547kI, C181847Bs c181847Bs, Integer num, InterfaceC88472Yns interfaceC88472Yns, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c181847Bs;
        this.l1 = interfaceC194547kI;
        this.i4 = i;
        this.l2 = num;
        this.l3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS11S0401000_3(C8LU c8lu, C8LU c8lu2, int i, ViewGroup viewGroup, ReusedUIAssem<? extends C3C8> reusedUIAssem, RootCellCommonAbility rootCellCommonAbility) {
        super(1);
        this.$t = rootCellCommonAbility;
        this.l0 = c8lu;
        this.i4 = c8lu2;
        this.l1 = i;
        this.l2 = viewGroup;
        this.l3 = reusedUIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S0401000_3(Context context, KeyboardInputV2Assem keyboardInputV2Assem, int i, InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC65784Pro interfaceC65784Pro, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = context;
        this.l1 = keyboardInputV2Assem;
        this.i4 = i;
        this.l2 = interfaceC88473Ynt;
        this.l3 = interfaceC65784Pro;
    }
}
