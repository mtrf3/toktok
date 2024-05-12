package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tch, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C75039Tch extends TBS implements InterfaceC88472Yns<Integer, C76800UCe> {
    public C75039Tch(Object obj) {
        super(1, obj, MultiLiveAsAnchorListDialogV2.class, "onChangeApplierSettingClick", "onChangeApplierSettingClick(I)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        AbstractC74727TUl abstractC74727TUl;
        int intValue = num.intValue();
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) this.receiver;
        multiLiveAsAnchorListDialogV2.LLD.LJIIZILJ(intValue, multiLiveAsAnchorListDialogV2.LJJIZ().LJIIJ);
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = multiLiveAsAnchorListDialogV2.LJJIZ().LJIIJ;
        if (multiLiveAnchorPanelSettings != null) {
            multiLiveAnchorPanelSettings.applierSortSetting = intValue;
        }
        List<?> list = multiLiveAsAnchorListDialogV2.LJZL.LJLIL;
        o.LJIIIIZZ(list, "mNormalAdapter.items");
        Iterator<?> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if ((next instanceof C74900TaS) && ((C74900TaS) next).LJLILLLLZI == 0) {
                if (i >= 0 && i < multiLiveAsAnchorListDialogV2.LJZL.LJLIL.size()) {
                    multiLiveAsAnchorListDialogV2.LJZL.notifyItemChanged(i);
                }
            } else {
                i++;
            }
        }
        InterfaceC31805Ce1 LJJJJJL = multiLiveAsAnchorListDialogV2.LJJJJJL();
        if (LJJJJJL != null) {
            TRT.LIZ(LJJJJJL, "fetch_on_change_applier_display_way", 15, new AqS179S0100000_13(multiLiveAsAnchorListDialogV2, 386), null, 8);
        }
        multiLiveAsAnchorListDialogV2.LLILZLL = true;
        String LJIIJJI = C74824TYe.LJIIJJI(intValue);
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLZLL;
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_MULTI_LIVE_GUEST_GI…RED_DOT_SHOULD_SHOW.value");
        boolean booleanValue = LIZJ.booleanValue();
        InterfaceC31805Ce1 LJJJJJL2 = multiLiveAsAnchorListDialogV2.LJJJJJL();
        if (LJJJJJL2 != null) {
            abstractC74727TUl = LJJJJJL2.LIZ();
        } else {
            abstractC74727TUl = null;
        }
        C74824TYe.LJLJJI(LJIIJJI, booleanValue, abstractC74727TUl);
        c48459J0d.LIZ(Boolean.FALSE);
        return C76800UCe.LIZ;
    }
}
