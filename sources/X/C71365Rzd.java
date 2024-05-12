package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.model.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rzd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71365Rzd implements Observer<List<? extends C71379Rzr>>, InterfaceC60061Nhh, InterfaceC27538ArO {
    public static boolean LJZ;
    public final ProductListModel LJLIL;
    public final Context LJLILLLLZI;
    public final List<ShopWindowAnchorModel> LJLJI;
    public final boolean LJLJJI;
    public int LJLJJL;
    public final L7W LJLJJLL;
    public final int LJLJL;
    public int LJLJLJ;
    public InterfaceC71392S0e LJLJLLL;
    public C71393S0f LJLL;
    public final IECommerceVideoService LJLLI;
    public final IECommerceAnchorService LJLLILLLL;
    public AqS162S0100000_12 LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public long LJLLLLLL;
    public final C62822Ol8 LJLZ;

    public final void LIZIZ() {
        AnchorPanelAdapter anchorPanelAdapter;
        this.LJLJJL = 2;
        if (LIZ().getAdapter() instanceof AnchorPanelAdapter) {
            AbstractC029409q adapter = LIZ().getAdapter();
            if (!(adapter instanceof AnchorPanelAdapter) || (anchorPanelAdapter = (AnchorPanelAdapter) adapter) == null) {
                return;
            }
            anchorPanelAdapter.LJLJJL = 2;
        }
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageName() {
        return "video_multi_anchor";
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageNameKey() {
        return "page_name";
    }

    public final RecyclerView LIZ() {
        return (RecyclerView) this.LJLZ.getValue();
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        return C79234V7u.LJIILL(this);
    }

    @Override // X.InterfaceC37828Esy
    public final java.util.Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<? extends C71379Rzr> list) {
        int i;
        int i2;
        CartEntry cartEntry;
        Integer num;
        CartEntry cartEntry2;
        CartEntry cartEntry3;
        String str;
        String l;
        CartEntry cartEntry4;
        AnchorPanelAdapter anchorPanelAdapter;
        List<? extends C71379Rzr> items = list;
        o.LJIIIZ(items, "items");
        AbstractC029409q adapter = LIZ().getAdapter();
        Integer num2 = null;
        if ((adapter instanceof AnchorPanelAdapter) && (anchorPanelAdapter = (AnchorPanelAdapter) adapter) != 0) {
            anchorPanelAdapter.LLIFFJFJJ(items);
        }
        if (!items.isEmpty()) {
            Iterator<? extends C71379Rzr> it = items.iterator();
            while (it.hasNext()) {
                java.util.Map<String, String> map = it.next().LIZ;
                if (map != null && !map.isEmpty()) {
                    i = this.LJLJL;
                    break;
                }
            }
        }
        i = 0;
        this.LJLJLJ = i;
        C71379Rzr c71379Rzr = (C71379Rzr) ORZ.LJLLLLLL(0, items);
        if (c71379Rzr != null && c71379Rzr.LJIIZILJ) {
            i2 = C71370Rzi.LJIIIZ;
        } else {
            if (c71379Rzr != null && (cartEntry2 = c71379Rzr.LJIIIIZZ) != null) {
                num2 = cartEntry2.itemCount;
            }
            C71370Rzi.LIZ(num2);
            if (c71379Rzr != null && (cartEntry = c71379Rzr.LJIIIIZZ) != null && (num = cartEntry.itemCount) != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
        }
        boolean z = LIZ().getAdapter() instanceof AnchorPanelAdapter;
        this.LJLLL = i2;
        if (this.LJLLJ == null) {
            this.LJLLJ = new AqS162S0100000_12(this, 1095);
        }
        String str2 = "";
        if (!this.LJLJI.isEmpty()) {
            if (c71379Rzr == null || (cartEntry4 = c71379Rzr.LJIIIIZZ) == null || (str = cartEntry4.link) == null) {
                str = "";
            }
            ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) ListProtector.get(this.LJLJI, 0);
            Long l2 = ((ShopWindowAnchorModel) ListProtector.get(this.LJLJI, 0)).LIZ.productId;
            if (l2 != null && (l = l2.toString()) != null) {
                str2 = l;
            }
            Aweme aweme = this.LJLIL.getAweme();
            String eventType = this.LJLIL.getEventType();
            String LJIIIZ = C71360RzY.LJIIIZ(this.LJLIL, this.LJLJJI);
            if (LJIIIZ == null) {
                LJIIIZ = "video_multi_anchor";
            }
            str2 = C71360RzY.LJII(str, shopWindowAnchorModel, str2, aweme, eventType, LJIIIZ, this.LJLJJI);
        }
        if (c71379Rzr != null && (cartEntry3 = c71379Rzr.LJIIIIZZ) != null && cartEntry3.link != null) {
            InterfaceC71392S0e interfaceC71392S0e = this.LJLJLLL;
            if (interfaceC71392S0e != null) {
                interfaceC71392S0e.LJIILJJIL(str2, this.LJLLJ, true);
            }
        } else {
            InterfaceC71392S0e interfaceC71392S0e2 = this.LJLJLLL;
            if (interfaceC71392S0e2 != null) {
                interfaceC71392S0e2.LJIILJJIL(str2, this.LJLLJ, false);
            }
        }
        InterfaceC71392S0e interfaceC71392S0e3 = this.LJLJLLL;
        if (interfaceC71392S0e3 != null) {
            interfaceC71392S0e3.LJIIIIZZ(this.LJLLL);
        }
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        int i;
        Integer num;
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_cart_refresh")) {
            if (this.LJLL == null) {
                this.LJLL = new C71393S0f(this);
            }
            try {
                CartRefreshEvent LIZ = C55824LvY.LIZ(str);
                Integer num2 = LIZ.count;
                int i2 = 0;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                this.LJLLL = i;
                AbstractC029409q adapter = LIZ().getAdapter();
                if ((adapter instanceof AnchorPanelAdapter) && ((AnchorPanelAdapter) adapter) != null && (num = LIZ.count) != null) {
                    num.intValue();
                }
                InterfaceC71392S0e interfaceC71392S0e = this.LJLJLLL;
                if (interfaceC71392S0e != null) {
                    Integer num3 = LIZ.count;
                    if (num3 != null) {
                        i2 = num3.intValue();
                    }
                    interfaceC71392S0e.LJIIIIZZ(i2);
                }
                C71370Rzi.LIZ(LIZ.count);
                IECommerceVideoService iECommerceVideoService = this.LJLLI;
                if (iECommerceVideoService != null) {
                    iECommerceVideoService.LJ(LIZ(), C78949Uyf.LJIILL(this.LJLILLLLZI), this.LJLL, LIZ.toast, C71409S0v.LJLIL);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC27538ArO
    public final void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }

    public C71365Rzd(ProductListModel productListModel, Context context, List<ShopWindowAnchorModel> anchors, C188727au c188727au, boolean z, int i, L7W shopStatus) {
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(shopStatus, "shopStatus");
        this.LJLIL = productListModel;
        this.LJLILLLLZI = context;
        this.LJLJI = anchors;
        this.LJLJJI = z;
        this.LJLJJL = i;
        this.LJLJJLL = shopStatus;
        this.LJLJL = 1;
        this.LJLJLJ = 0;
        IECommerceVideoService LJIIJ = ECommerceVideoService.LJIIJ();
        this.LJLLI = LJIIJ;
        IECommerceAnchorService LJJJJI = ECommerceAnchorService.LJJJJI();
        this.LJLLILLLL = LJJJJI;
        this.LJLZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1094));
        LIZ().setBackgroundColor(0);
        LIZ().setAdapter(new AnchorPanelAdapter(productListModel, context, new HashMap(c188727au.LIZ), z, this.LJLJJL, LJIIJ, LJJJJI, new PanelOpenInfo(0, null, 0, false, 4, 11, null)));
        C71382Rzu c71382Rzu = new C71382Rzu(false, anchors);
        RecyclerView LIZ = LIZ();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        LIZ().LJII(c71382Rzu, -1);
        LIZ.setLayoutManager(gridLayoutManager);
    }
}
