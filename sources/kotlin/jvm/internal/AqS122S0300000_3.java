package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C187127Wa;
import X.C189957ct;
import X.C190397db;
import X.C193037hr;
import X.C212428Vi;
import X.C228108xK;
import X.C2U8;
import X.C32I;
import X.C34K;
import X.C43I;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C73305Spp;
import X.C76800UCe;
import X.C8CH;
import X.FFL;
import X.InterfaceC189137bZ;
import X.InterfaceC88471Ynr;
import X.ORZ;
import X.SYL;
import X.Z8A;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBasicInfo;
import com.ss.android.ugc.aweme.poi.detail.v2.PoiDetailYmalViewModel;
import com.ss.android.ugc.aweme.poi.detail.ymal.PoiDetailYmalAssemV2;
import com.ss.android.ugc.aweme.upvote.detail.repostlist.RepostListAssem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AqS122S0300000_3 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS122S0300000_3 aqS122S0300000_3, Object selectSubscribe, Object obj) {
        List list = (List) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (list != null) {
            MixFeedManagerAssem mixFeedManagerAssem = (MixFeedManagerAssem) aqS122S0300000_3.l0;
            C73305Spp statusView = (C73305Spp) aqS122S0300000_3.l1;
            SYL syl = (SYL) aqS122S0300000_3.l2;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new C228108xK((Aweme) obj2, Integer.valueOf(i2)));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            List LLJI = ORZ.LLJI(arrayList);
            if (list.isEmpty()) {
                o.LJIIIIZZ(statusView, "statusView");
                mixFeedManagerAssem.x3(statusView);
            } else {
                statusView.setVisibility(8);
            }
            syl.getState().LJIILLIIL(LLJI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS122S0300000_3 aqS122S0300000_3, Object selectSubscribe, Object obj) {
        Fragment LIZLLL;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        List<PoiListApi.PoiYMALModel> list;
        PoiDetailYmalAssemV2 poiDetailYmalAssemV2;
        ViewGroup viewGroup;
        ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (((PoiDetailYmalAssemV2) aqS122S0300000_3.l0).N3()) {
            if (!((C34K) aqS122S0300000_3.l1).element) {
                C189957ct.LIZ.getClass();
                FFL.LJIIIZ().getClass();
                if (FFL.LJIIJ(31744, 0, "poi_ymal_show", false) == 2 && (LIZLLL = C212428Vi.LIZLLL((PoiDetailYmalAssemV2) aqS122S0300000_3.l0)) != null && (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), IPoiDetailInfoVAbility.class, null)) != null && iPoiDetailInfoVAbility.w4() && (list = ((PoiDetailYmalAssemV2) aqS122S0300000_3.l0).O3().LJLIL) != null && !((ArrayList) list).isEmpty() && ((viewGroup = (poiDetailYmalAssemV2 = (PoiDetailYmalAssemV2) aqS122S0300000_3.l0).LJLL) == null ? poiDetailYmalAssemV2.x3().getVisibility() != 0 : viewGroup.getVisibility() != 0)) {
                    ((PoiDetailYmalAssemV2) aqS122S0300000_3.l0).P3((View) aqS122S0300000_3.l2, true);
                }
            }
            ((C34K) aqS122S0300000_3.l1).element = false;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS122S0300000_3 aqS122S0300000_3, Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        PoiBasicInfo poiBasicInfo = ((PoiListApi.PoiYMALModel) aqS122S0300000_3.l0).basicInfo;
        String str6 = null;
        if (poiBasicInfo != null) {
            str = poiBasicInfo.id;
        } else {
            str = null;
        }
        if (o.LJ(str5, str)) {
            if (str5 != null) {
                ((PoiDetailYmalViewModel) ((PoiDetailYmalAssemV2.YmalPoiListItemCell) aqS122S0300000_3.l1).LJLJJL.getValue()).hv0(str5, booleanValue);
            }
            C193037hr c193037hr = C193037hr.LIZ;
            Context context = ((PoiDetailYmalAssemV2.YmalPoiListItemCell) aqS122S0300000_3.l1).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C193037hr.LIZIZ(context, (TuxIconView) aqS122S0300000_3.l2, booleanValue);
            InterfaceC189137bZ interfaceC189137bZ = (InterfaceC189137bZ) C8CH.LIZIZ((PoiDetailYmalAssemV2.YmalPoiListItemCell) aqS122S0300000_3.l1, C65352Pkq.LIZ(InterfaceC189137bZ.class));
            if (str5 == null) {
                str2 = "";
            } else {
                str2 = str5;
            }
            PoiListApi.PoiYMALModel poiYMALModel = (PoiListApi.PoiYMALModel) aqS122S0300000_3.l0;
            String str7 = poiYMALModel.trackInfo;
            if (str7 == null) {
                str7 = "";
            }
            interfaceC189137bZ.Lg(booleanValue, str2, str7, "ymal_item_click", null, poiYMALModel);
            if (booleanValue) {
                View itemView = ((PoiDetailYmalAssemV2.YmalPoiListItemCell) aqS122S0300000_3.l1).itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C193037hr.LIZ(itemView, "poi_detail");
                PoiBasicInfo poiBasicInfo2 = ((PoiListApi.PoiYMALModel) aqS122S0300000_3.l0).basicInfo;
                if (poiBasicInfo2 != null) {
                    str4 = poiBasicInfo2.id;
                } else {
                    str4 = null;
                }
                C190397db.LIZIZ(str4, "poi_detail", "ymal_item_click");
            }
            PoiBasicInfo poiBasicInfo3 = ((PoiListApi.PoiYMALModel) aqS122S0300000_3.l0).basicInfo;
            if (poiBasicInfo3 != null) {
                str3 = poiBasicInfo3.name;
                str6 = poiBasicInfo3.address;
            } else {
                str3 = null;
            }
            C2U8.LIZ(new C187127Wa(str5, str3, booleanValue, str6, true, String.valueOf(c193037hr.hashCode())));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AqS122S0300000_3 aqS122S0300000_3, Object selectSubscribe, Object obj) {
        Fragment fragment;
        int i;
        C43I onCellLongPressEvent = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(onCellLongPressEvent, "onCellLongPressEvent");
        Aweme aweme = (Aweme) onCellLongPressEvent.LIZ;
        if (aweme != null && (fragment = (Fragment) aqS122S0300000_3.l0) != null) {
            RepostListAssem repostListAssem = (RepostListAssem) aqS122S0300000_3.l1;
            RepostListAssem repostListAssem2 = (RepostListAssem) aqS122S0300000_3.l2;
            Z8A z8a = Z8A.LIZIZ;
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            String str = repostListAssem.A3().LJLILLLLZI;
            String str2 = repostListAssem.A3().LJLJJI;
            if (str2 == null) {
                str2 = "";
            }
            if (o.LJ(repostListAssem.A3().LJLJJI, "others_homepage") || o.LJ(repostListAssem.A3().LJLJJI, "personal_homepage")) {
                i = 18;
            } else {
                i = -1;
            }
            z8a.longPressProfileCell("shortcut_panel", aweme, mo49getActivity, str, str2, i, null, fragment, repostListAssem2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS122S0300000_3(SYL syl, C73305Spp c73305Spp, MixFeedManagerAssem mixFeedManagerAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = mixFeedManagerAssem;
        this.l1 = c73305Spp;
        this.l2 = syl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS122S0300000_3(Fragment fragment, RepostListAssem repostListAssem, RepostListAssem repostListAssem2, int i) {
        super(2);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = repostListAssem;
        this.l2 = repostListAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS122S0300000_3(PoiListApi.PoiYMALModel poiYMALModel, PoiDetailYmalAssemV2.YmalPoiListItemCell ymalPoiListItemCell, TuxIconView tuxIconView, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiYMALModel;
        this.l1 = ymalPoiListItemCell;
        this.l2 = tuxIconView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS122S0300000_3(PoiDetailYmalAssemV2 poiDetailYmalAssemV2, C34K c34k, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailYmalAssemV2;
        this.l1 = c34k;
        this.l2 = view;
    }
}
