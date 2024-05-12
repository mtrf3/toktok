package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C1793372b;
import X.C214928c4;
import X.C215498cz;
import X.C224748ru;
import X.C226998vX;
import X.C2YJ;
import X.C34K;
import X.C3C8;
import X.C56412MCa;
import X.C59974NgI;
import X.C76800UCe;
import X.C8EI;
import X.C8EN;
import X.EnumC207888Dw;
import X.InterfaceC1793272a;
import X.InterfaceC214978c9;
import X.InterfaceC215558d5;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import X.LRD;
import X.Q8U;
import Y.IDCListenerS243S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.profile.popup.AvatarAndNicknamePopupController;
import java.util.Map;

/* loaded from: classes4.dex */
public class AqS20S0500000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        String wikipediaAnchorUrlPlaceholder = C2YJ.LIZIZ.LIZ.getWikipediaAnchorUrlPlaceholder();
        o.LJIIIIZZ(wikipediaAnchorUrlPlaceholder, "get().wikipediaAnchorUrlPlaceholder");
        String LIZIZ = Q8U.LIZIZ(new Object[]{((WikipediaInfo) this.l0).getLang(), ((WikipediaInfo) this.l0).getKeyword()}, 2, wikipediaAnchorUrlPlaceholder, "format(format, *args)");
        Map map = (Map) this.l1;
        String keyword = ((WikipediaInfo) this.l0).getKeyword();
        o.LJI(keyword);
        map.put("title", keyword);
        Map map2 = (Map) this.l1;
        String keyword2 = ((WikipediaInfo) this.l0).getKeyword();
        o.LJI(keyword2);
        map2.put("wiki_entry", keyword2);
        Map map3 = (Map) this.l1;
        String lang = ((WikipediaInfo) this.l0).getLang();
        o.LJI(lang);
        map3.put("language", lang);
        Map map4 = (Map) this.l1;
        String anchorId = ((WikipediaInfo) this.l2).getAnchorId();
        if (anchorId == null) {
            anchorId = "";
        }
        map4.put("anchor_id", anchorId);
        C59974NgI.LIZ((Context) this.l3, LIZIZ, (Map) this.l1, (Map) this.l4);
    }

    public static final Object invoke$0(AqS20S0500000_3 aqS20S0500000_3) {
        IDCListenerS243S0100000_3 iDCListenerS243S0100000_3 = (IDCListenerS243S0100000_3) aqS20S0500000_3.l0;
        InterfaceC1793272a interfaceC1793272a = (InterfaceC1793272a) aqS20S0500000_3.l1;
        if (interfaceC1793272a != null && interfaceC1793272a.Hf() && iDCListenerS243S0100000_3 != null) {
            C1793372b.LIZIZ((View) aqS20S0500000_3.l2, (EditText) aqS20S0500000_3.l3, (InterfaceC1793272a) aqS20S0500000_3.l1, ((C34K) aqS20S0500000_3.l4).element);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS20S0500000_3 aqS20S0500000_3) {
        return ((AssemViewModel) aqS20S0500000_3.l0).getVmDispatcher().LIZIZ((LifecycleOwner) aqS20S0500000_3.l1, (C56412MCa) aqS20S0500000_3.l2, (InterfaceC88472Yns) aqS20S0500000_3.l3, (InterfaceC88472Yns) aqS20S0500000_3.l4);
    }

    public static final Object invoke$2(AqS20S0500000_3 aqS20S0500000_3) {
        ((C8EN) aqS20S0500000_3.l0).LIZLLL(C8EI.ADD_PHOTO);
        ((AvatarAndNicknamePopupController) aqS20S0500000_3.l1).LJFF((Activity) aqS20S0500000_3.l2, (C8EN) aqS20S0500000_3.l0, (EnumC207888Dw) aqS20S0500000_3.l3, (C226998vX) aqS20S0500000_3.l4, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS20S0500000_3 aqS20S0500000_3) {
        ((C8EN) aqS20S0500000_3.l0).LJ(C8EI.EDIT_NICKNAME);
        ((AvatarAndNicknamePopupController) aqS20S0500000_3.l1).LJFF((Activity) aqS20S0500000_3.l2, (C8EN) aqS20S0500000_3.l0, (EnumC207888Dw) aqS20S0500000_3.l3, (C226998vX) aqS20S0500000_3.l4, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS20S0500000_3 aqS20S0500000_3) {
        LRD.LIZ((ActivityC45651qj) aqS20S0500000_3.l0).LJIIJ("show_danmaku_rethink", false, null);
        ((InterfaceC214978c9) aqS20S0500000_3.l1).LIZIZ();
        C215498cz c215498cz = (C215498cz) aqS20S0500000_3.l2;
        c215498cz.LJIILIIL.LIZ(c215498cz.LIZJ(C214928c4.L((C214928c4) aqS20S0500000_3.l3, null, true, null, 23), (InterfaceC215558d5) aqS20S0500000_3.l4).LJJJJZ());
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AqS20S0500000_3 aqS20S0500000_3) {
        aqS20S0500000_3.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS20S0500000_3 aqS20S0500000_3) {
        ((InterfaceC88474Ynu) aqS20S0500000_3.l0).invoke((C3C8) aqS20S0500000_3.l1, aqS20S0500000_3.l2, aqS20S0500000_3.l3, aqS20S0500000_3.l4);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS20S0500000_3(ActivityC45651qj activityC45651qj, InterfaceC214978c9 interfaceC214978c9, C215498cz c215498cz, C214928c4 c214928c4, InterfaceC215558d5 interfaceC215558d5, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = interfaceC214978c9;
        this.l2 = c215498cz;
        this.l3 = c214928c4;
        this.l4 = interfaceC215558d5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS20S0500000_3(C8EN c8en, AvatarAndNicknamePopupController avatarAndNicknamePopupController, Activity activity, EnumC207888Dw enumC207888Dw, C226998vX c226998vX, int i) {
        super(0);
        this.$t = i;
        this.l0 = c8en;
        this.l1 = avatarAndNicknamePopupController;
        this.l2 = activity;
        this.l3 = enumC207888Dw;
        this.l4 = c226998vX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS20S0500000_3(InterfaceC88474Ynu interfaceC88474Ynu, InterfaceC88474Ynu<C3C8, Object, Object, Object, C76800UCe> interfaceC88474Ynu2, C3C8 c3c8, Object obj, Object obj2, Object obj3) {
        super(0);
        this.$t = obj3;
        this.l0 = interfaceC88474Ynu;
        this.l1 = interfaceC88474Ynu2;
        this.l2 = c3c8;
        this.l3 = obj;
        this.l4 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS20S0500000_3(IDCListenerS243S0100000_3 iDCListenerS243S0100000_3, InterfaceC1793272a interfaceC1793272a, View view, C224748ru c224748ru, C34K c34k, int i) {
        super(0);
        this.$t = i;
        this.l0 = iDCListenerS243S0100000_3;
        this.l1 = interfaceC1793272a;
        this.l2 = view;
        this.l3 = c224748ru;
        this.l4 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS20S0500000_3(AssemViewModel assemViewModel, AssemViewModel<S> assemViewModel2, LifecycleOwner lifecycleOwner, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super S, C76800UCe> interfaceC88472Yns2) {
        super(0);
        this.$t = interfaceC88472Yns2;
        this.l0 = assemViewModel;
        this.l1 = assemViewModel2;
        this.l2 = lifecycleOwner;
        this.l3 = c56412MCa;
        this.l4 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS20S0500000_3(WikipediaInfo wikipediaInfo, WikipediaInfo wikipediaInfo2, Map<String, String> map, WikipediaInfo wikipediaInfo3, Context context, Map<String, String> map2) {
        super(0);
        this.$t = map2;
        this.l0 = wikipediaInfo;
        this.l1 = wikipediaInfo2;
        this.l2 = map;
        this.l3 = wikipediaInfo3;
        this.l4 = context;
    }
}
