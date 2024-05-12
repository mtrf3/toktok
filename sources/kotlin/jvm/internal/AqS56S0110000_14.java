package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC81666W3i;
import X.C1547165j;
import X.C76800UCe;
import X.C81667W3j;
import X.C81668W3k;
import X.C82232WPc;
import X.C82454WXq;
import X.C83168WkW;
import X.C83169WkX;
import X.InterfaceC82236WPg;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.THS;
import android.view.ViewGroup;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelState;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.bytedance.creativex.recorder.sticker.panel.StickerPanelState;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class AqS56S0110000_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS56S0110000_14 aqS56S0110000_14, Object obj) {
        AbstractC81666W3i c81667W3j;
        InterfaceC82236WPg invoke;
        FilterPanelState receiver = (FilterPanelState) obj;
        o.LJIIIZ(receiver, "$receiver");
        if (aqS56S0110000_14.z1) {
            c81667W3j = new C81668W3k();
            ((FilterPanelViewModel) aqS56S0110000_14.l0).LJLLL.setValue(THS.ON_SHOWN);
            FilterPanelViewModel filterPanelViewModel = (FilterPanelViewModel) aqS56S0110000_14.l0;
            if (filterPanelViewModel.LJLLJ != -1 && (invoke = filterPanelViewModel.LJZ.invoke()) != null) {
                C82232WPc.LIZ(invoke, true, 2);
            }
        } else {
            c81667W3j = new C81667W3j();
            ((FilterPanelViewModel) aqS56S0110000_14.l0).LJLLL.setValue(THS.ON_DISMISSED);
            InterfaceC82236WPg invoke2 = ((FilterPanelViewModel) aqS56S0110000_14.l0).LJZ.invoke();
            if (invoke2 != null) {
                invoke2.LJJIJ();
            }
        }
        return FilterPanelState.copy$default(receiver, c81667W3j, null, false, null, null, null, 62, null);
    }

    public static final Object invoke$1(AqS56S0110000_14 aqS56S0110000_14, Object obj) {
        AbstractC81666W3i c81667W3j;
        StickerPanelState receiver = (StickerPanelState) obj;
        o.LJIIIZ(receiver, "$receiver");
        if (aqS56S0110000_14.z1 && !((RecordStickerPanelViewModel) aqS56S0110000_14.l0).LJLJLLL) {
            c81667W3j = new C81668W3k();
            ((RecordStickerPanelViewModel) aqS56S0110000_14.l0).LJLJL.setValue(Boolean.TRUE);
        } else {
            c81667W3j = new C81667W3j();
            ((RecordStickerPanelViewModel) aqS56S0110000_14.l0).LJLJL.setValue(Boolean.FALSE);
        }
        return receiver.copy(c81667W3j);
    }

    public static final Object invoke$2(AqS56S0110000_14 aqS56S0110000_14, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        if (!aqS56S0110000_14.z1) {
            float f = 1.0f - floatValue;
            ViewGroup viewGroup = ((C82454WXq) aqS56S0110000_14.l0).LJLJJLL;
            if (viewGroup != null) {
                viewGroup.setAlpha(f);
                C1547165j c1547165j = ((C82454WXq) aqS56S0110000_14.l0).LJLJJI;
                if (c1547165j != null) {
                    c1547165j.setAlpha(f);
                } else {
                    o.LJIJI("innerBorder");
                    throw null;
                }
            } else {
                o.LJIJI("placeholderLayout");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS56S0110000_14 aqS56S0110000_14, Object obj) {
        float f;
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        ComposerBeauty beauty = (ComposerBeauty) obj;
        o.LJIIIZ(beauty, "beauty");
        Map map = (Map) aqS56S0110000_14.l0;
        if (aqS56S0110000_14.z1) {
            int progressValue = beauty.getProgressValue();
            List<ComposerBeautyExtraBeautify.ItemsBean> items = beauty.getBeautifyExtra().getItems();
            if (items != null && (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) ORZ.LJLLLL(items)) != null) {
                f = C83168WkW.LIZ(new C83169WkX(itemsBean.getDoubleDirection(), itemsBean.getMax(), itemsBean.getMin(), 0.0f, progressValue, 0.0f, 1870));
            } else {
                f = progressValue;
            }
        } else {
            f = 0.0f;
        }
        map.put(beauty, Float.valueOf(f));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0110000_14(FilterPanelViewModel filterPanelViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = filterPanelViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0110000_14(RecordStickerPanelViewModel recordStickerPanelViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = recordStickerPanelViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0110000_14(boolean z, C82454WXq c82454WXq, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c82454WXq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS56S0110000_14(boolean z, Map map, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = map;
    }
}
