package X;

import Y.ARunnableS48S0100000_12;
import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S0Q extends HSS implements InterfaceC60061Nhh {
    public final S0R LJLJLJ = ECommerceAnchorService.LJJJJI().LJJIJ();
    public boolean LJLJLLL = true;
    public final ARunnableS48S0100000_12 LJLL = new ARunnableS48S0100000_12(this, 70);

    @Override // X.HSS, X.S1E
    public final /* bridge */ /* synthetic */ CharSequence LIZJ() {
        return null;
    }

    @Override // X.HSW
    public final boolean LJIL() {
        return true;
    }

    @Override // X.HSS
    public final String LJJIJIL() {
        return "webview";
    }

    @Override // X.HSS, X.S1E
    public final String LIZ() {
        String LJIJI = this.LJLJLJ.LJIJI();
        if (LJIJI == null) {
            return super.LIZ();
        }
        return LJIJI;
    }

    @Override // X.HSW, X.S1E
    public final int LJIILJJIL() {
        return this.LJLJLJ.LJIJJ();
    }

    @Override // X.HSW, X.S1E
    public final InterfaceC44104HSq LJIJI() {
        return new S0T(this);
    }

    @Override // X.S1E
    public final S1E clone() {
        return new C71364Rzc();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LIZLLL(SmartImageView imageView) {
        o.LJIIIZ(imageView, "imageView");
        LJJJJI(imageView, new AqS159S0200000_12(this, imageView, 57));
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        super.LJ(eventMapBuilder);
        this.LJLJLJ.LJIIZILJ(eventMapBuilder, LJIIIZ().LJJLJ(), LJIIIZ(), new S0T(this).LIZLLL());
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((AnchorCommonStruct) next).getType() == type()) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC26289ATl.NOT_FOUND;
        }
        if (LJJII().isPhotoMode() && !C42921Gsv.LIZ()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.remove(it2.next());
            }
            return EnumC26289ATl.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        arrayList2.remove(anchorCommonStruct);
        LJJIJL(anchorCommonStruct);
        LJJ(anchorCommonStruct);
        this.LJLJJL = anchorCommonStruct;
        if (arrayList.size() == 1) {
            return EnumC26289ATl.DONE;
        }
        return EnumC26289ATl.PROCEED;
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        LJJJ(c188727au);
        this.LJLJLJ.LJIIJ(false, c188727au, LJIIIZ().LJJLJ(), LJIIIZ(), new AqS178S0100000_12(this, 392));
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (this.LJLJLLL) {
            this.LJLJLLL = false;
            C1DH.LJJIJIIJIL(300L, this.LJLL);
            this.LJLJLJ.LIZLLL(true, LJIIIZ(), eventMapBuilder, new AqS178S0100000_12(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
        }
    }

    @Override // X.HSS, X.S1E
    public final void LJIJJ(Aweme aweme) {
        this.LJLJLJ.LJIILL(new AqS162S0100000_12(this, 1040));
    }

    @Override // X.HSS, X.InterfaceC71405S0r
    public final void LJIJJLI(C188727au c188727au) {
        this.LJLJLJ.LJIIJ(true, c188727au, LJIIIZ().LJJLJ(), LJIIIZ(), new AqS178S0100000_12(this, 392));
    }

    @Override // X.HSS
    public final void LJJIJL(AnchorCommonStruct anchor) {
        o.LJIIIZ(anchor, "anchor");
        this.LJLJLJ.LJIIJJI(anchor, LJIIIZ().LJJLL());
        EventCenter.LJ().LIZJ("ec_page_quit", this);
        EventCenter.LJ().LIZJ("ec_page_show", this);
    }

    @Override // X.HSW, X.S1E
    public final void LJIIL(C188727au c188727au, boolean z) {
        this.LJLJLJ.LJIL(c188727au, z, LJIIIZ());
    }

    @Override // X.HSW, X.S1E
    public final void LJIJ(Activity activity, Dialog dialog) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dialog, "dialog");
        if (o.LJ(LJJI().getLocalClassName(), activity.getLocalClassName()) && !LJIIIZ().LJJLJ()) {
            this.LJLJLJ.LJIILJJIL(dialog, this.LJLJL);
        }
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        int i;
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_cart_refresh")) {
            S0R s0r = this.LJLJLJ;
            Integer num = C55824LvY.LIZ(str).count;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            s0r.LIZJ(i);
            return;
        }
        if (!o.LJ(eventName, "ec_page_quit")) {
            return;
        }
        S0R s0r2 = this.LJLJLJ;
        LJIIIZ().LJJLL();
        s0r2.LJ(eventName, str);
    }

    @Override // X.HSS, X.S1E
    public final void LJIILL(View view, Aweme aweme, boolean z) {
        this.LJLJLJ.LJJ(aweme, view, z, new AqS162S0100000_12(this, 1041));
    }

    @Override // X.HSW, X.S1E
    public final void LJIIZILJ(C7F9 chain, String str, boolean z) {
        o.LJIIIZ(chain, "chain");
        this.LJLJLJ.LJIJJLI(z, LJJIIZI(), LJIIIZ());
    }

    public final void LJJJJJ(ShopWindowAnchorModel model, C188727au eventMapBuilder, int i) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (this.LJLJLLL) {
            this.LJLJLLL = false;
            C1DH.LJJIJIIJIL(300L, this.LJLL);
            this.LJLJLJ.LJIILLIIL(model, i, LJIIIZ(), new AqS178S0100000_12(this, 391));
        }
    }

    @Override // X.HSS, X.InterfaceC71405S0r
    public final void LIZIZ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        this.LJLJLJ.LIZ(viewGroup, dialog, c188727au, false, LJIIIZ());
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        this.LJLJLJ.LIZ(viewGroup, dialog, c188727au, true, LJIIIZ());
    }

    @Override // X.HSW, X.S1E
    public final void LJIILIIL(C7F9 chain, Dialog dialog, boolean z, boolean z2) {
        o.LJIIIZ(chain, "chain");
        if (!LJIIIZ().LJJLJ()) {
            this.LJLJLJ.LJII(z, dialog, z2);
        }
    }
}
