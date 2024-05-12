package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.header;

import X.C018905p;
import X.C113554cx;
import X.C116894iL;
import X.C16880lQ;
import X.C221108m2;
import X.C2UK;
import X.C42398GkU;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69694RWw;
import X.C70414RkI;
import X.C70621Rnd;
import X.C70637Rnt;
import X.C70641Rnx;
import X.C70653Ro9;
import X.C70756Rpo;
import X.C70877Rrl;
import X.C72545SdZ;
import X.C73156SnQ;
import X.C78946Uyc;
import X.C80769Vmv;
import X.IQ9;
import X.InterfaceC36571c5;
import X.InterfaceC71003Rtn;
import X.ORZ;
import X.OSZ;
import X.RX4;
import X.TBT;
import X.X1D;
import Y.IDiS273S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.SkuEntranceState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import ujb.o;

/* loaded from: classes13.dex */
public final class GlobalHeaderVH extends AbsFullSpanVH {
    public final Fragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final Set<String> LJLJLLL;
    public C70637Rnt LJLL;
    public final Map<Integer, View> LJLLI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C70756Rpo L() {
        return (C70756Rpo) this.LJLJJI.getValue();
    }

    public final IQ9 P() {
        return (IQ9) this.LJLJI.getValue();
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int M() {
        List<MediaItem> list = ((C69694RWw) getItem()).LJLJL;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<MediaItem> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().type == 2 && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int N() {
        Iterator<MediaItem> it = ((C69694RWw) getItem()).LJLJL.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().type == 2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.AbstractC73265SpB
    public final void detachFromWindow() {
        super.detachFromWindow();
        P().pause();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C73156SnQ.LJIIIIZZ(this, getViewModel().LLIILII, new TBT() { // from class: X.Rmy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuEntranceState) obj).getSelectImage();
            }
        }, new AqS194S0100000_12(this, 112));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.RnA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getShowFavoriteGuide();
            }
        }, new AqS194S0100000_12(this, 113));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rnk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((PdpMainState) obj).isFullScreen());
            }
        }, new AqS194S0100000_12(this, 114));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        Video video;
        C70414RkI c70414RkI;
        super.onDestroy();
        MediaItem mediaItem = (MediaItem) ORZ.LJLLLLLL(N(), ((C69694RWw) getItem()).LJLJL);
        if (mediaItem != null && (video = mediaItem.video) != null) {
            Aweme LIZIZ = video.LIZIZ();
            if (LIZIZ.getVideo() != null && (c70414RkI = getViewModel().LLFII) != null) {
                c70414RkI.LJJJJZI((int) P().LJIIL, LIZIZ.getAid(), "head_pic");
            }
        }
        L().LJJIIZ();
        C70637Rnt c70637Rnt = this.LJLL;
        if (c70637Rnt != null) {
            c70637Rnt.LIZIZ();
        }
        this.LJLL = null;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        super.onPause();
        P().pause();
    }

    public final void Q(Image image) {
        InterfaceC71003Rtn interfaceC71003Rtn;
        String uri = image.getUri();
        if (uri != null && !o.LJJJJJL(uri) && !this.LJLJLLL.contains(uri)) {
            this.LJLJLLL.add(uri);
            InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
            if ((interfaceC36571c5 instanceof InterfaceC71003Rtn) && (interfaceC71003Rtn = (InterfaceC71003Rtn) interfaceC36571c5) != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70877Rrl(), new AqS35S1000000_12(uri, 9));
            }
        }
    }

    public final void T(int i) {
        _$_findCachedViewById(R.id.aw6).setVisibility(i);
        _$_findCachedViewById(R.id.el4).setVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object item) {
        C018905p c018905p;
        int i;
        String str;
        String[] strArr;
        float f;
        int i2;
        kotlin.jvm.internal.o.LJIIIZ(item, "item");
        ((C116894iL) _$_findCachedViewById(R.id.el4)).setCount(((C69694RWw) getItem()).LJLJL.size());
        boolean z = false;
        if (((C69694RWw) getItem()).LJLJL.isEmpty()) {
            View indicator = _$_findCachedViewById(R.id.el4);
            kotlin.jvm.internal.o.LJIIIIZZ(indicator, "indicator");
            indicator.setVisibility(8);
            ImageView commerce_header_pager_empty = (ImageView) _$_findCachedViewById(R.id.bnh);
            kotlin.jvm.internal.o.LJIIIIZZ(commerce_header_pager_empty, "commerce_header_pager_empty");
            commerce_header_pager_empty.setVisibility(0);
        } else {
            ImageView commerce_header_pager_empty2 = (ImageView) _$_findCachedViewById(R.id.bnh);
            kotlin.jvm.internal.o.LJIIIIZZ(commerce_header_pager_empty2, "commerce_header_pager_empty");
            commerce_header_pager_empty2.setVisibility(8);
            C70756Rpo L = L();
            C70756Rpo.LJJIJIL(L, ((C69694RWw) getItem()).LJLJL);
            C70756Rpo.LJJIJL(L, ((C69694RWw) getItem()).LJLJI);
            L.LJLLILLLL = getViewModel().LJLJL;
            L.LJLLJ = new AqS178S0100000_12(this, 74);
            L.LJLLLL = new AqS194S0100000_12(this, 11);
            L.LJLLL = new AqS162S0100000_12(this, 51);
            L.LJLZ = new AqS162S0100000_12(this, 52);
            C80769Vmv c80769Vmv = (C80769Vmv) _$_findCachedViewById(R.id.bng);
            c80769Vmv.setAdapter(L());
            ViewGroup.LayoutParams layoutParams = c80769Vmv.getLayoutParams();
            String str2 = null;
            if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                Image image = (Image) ORZ.LJLLLL(((C69694RWw) getItem()).LJLIL);
                if (image != null) {
                    f = image.getRadio();
                } else {
                    f = 1.0f;
                }
                ((ViewGroup.MarginLayoutParams) c018905p).height = 0;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("h,");
                LIZ.append(1.0f / f);
                c018905p.dimensionRatio = X1D.LIZIZ(LIZ);
            } else {
                c018905p = null;
            }
            c80769Vmv.setLayoutParams(c018905p);
            c80769Vmv.setOnPageChangeListener(new IDiS273S0100000_12(this, 0));
            if (this.LJLJJLL) {
                ProductPackStruct productPackStruct = getViewModel().LJLJLLL;
                if (productPackStruct != null) {
                    SkuPanelState skuPanelState = getViewModel().LJLL;
                    if (skuPanelState != null) {
                        strArr = skuPanelState.getCheckedSkuIds();
                    } else {
                        strArr = null;
                    }
                    i = RX4.LIZ(productPackStruct, strArr);
                } else {
                    i = this.LJLJJL;
                }
            } else {
                i = this.LJLJJL;
            }
            c80769Vmv.setCurrentItem(i);
            if (!getViewModel().LLIIII) {
                this.LJLJJLL = false;
            }
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null && c70414RkI.LJIJI) {
                String str3 = "";
                int i3 = 0;
                for (ProductBannerLabel productBannerLabel : ((C69694RWw) getItem()).LJLJI) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str3);
                        LIZ2.append(productBannerLabel.eventTrackingName);
                        str3 = X1D.LIZIZ(LIZ2);
                        if (i3 < ((C69694RWw) getItem()).LJLJI.size() - 1) {
                            str3 = C42398GkU.LIZIZ(str3, ',');
                        }
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                C70414RkI c70414RkI2 = getViewModel().LLFII;
                if (c70414RkI2 != null) {
                    boolean z2 = getViewModel().LJLJL;
                    OSZ[] oszArr = new OSZ[3];
                    oszArr[0] = new OSZ("rights_cnt", Integer.valueOf(((C69694RWw) getItem()).LJLJI.size()));
                    oszArr[1] = new OSZ("rights_content", str3);
                    if (M() > 0) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    oszArr[2] = new OSZ("has_video", str);
                    C70414RkI.LJJJJI(c70414RkI2, "head_pic", z2, false, null, C113554cx.LJJL(oszArr), 44);
                }
            }
            Q((Image) ListProtector.get(((C69694RWw) getItem()).LJLIL, 0));
            getViewModel().LLIILZL = (Image) ListProtector.get(((C69694RWw) getItem()).LJLIL, 0);
            C70414RkI c70414RkI3 = getViewModel().LLFII;
            if (c70414RkI3 != null) {
                Image image2 = (Image) ORZ.LJLLLLLL(this.LJLJJL, ((C69694RWw) getItem()).LJLIL);
                if (image2 != null) {
                    str2 = image2.getUri();
                }
                c70414RkI3.LJJLIIIJLLLLLLLZ(str2);
            }
        }
        if (((C69694RWw) getItem()).LJLJJI == null) {
            View btn_favorite = _$_findCachedViewById(R.id.aw6);
            kotlin.jvm.internal.o.LJIIIIZZ(btn_favorite, "btn_favorite");
            btn_favorite.setVisibility(8);
        } else {
            View btn_favorite2 = _$_findCachedViewById(R.id.aw6);
            kotlin.jvm.internal.o.LJIIIIZZ(btn_favorite2, "btn_favorite");
            btn_favorite2.setVisibility(0);
            Boolean bool = ((C69694RWw) getItem()).LJLJJI;
            if (bool != null) {
                z = bool.booleanValue();
            }
            this.LJLJL = z;
            C70653Ro9 c70653Ro9 = (C70653Ro9) _$_findCachedViewById(R.id.aw6);
            if (z) {
                i2 = R.raw.icon_bookmark_fill;
            } else {
                i2 = R.raw.icon_bookmark;
            }
            c70653Ro9.setIconRes(i2);
            View btn_favorite3 = _$_findCachedViewById(R.id.aw6);
            kotlin.jvm.internal.o.LJIIIIZZ(btn_favorite3, "btn_favorite");
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 4, 42), btn_favorite3);
        }
        if (((C69694RWw) getItem()).LJLJJL != null) {
            C70637Rnt c70637Rnt = this.LJLL;
            if (c70637Rnt == null) {
                this.LJLL = new C70637Rnt();
            } else {
                c70637Rnt.LIZIZ();
            }
            C70637Rnt c70637Rnt2 = this.LJLL;
            if (c70637Rnt2 != null) {
                DynamicSellingPointsBase dynamicSellingPointsBase = ((C69694RWw) getItem()).LJLJJL;
                C2UK dynamic_sell_point_label = (C2UK) _$_findCachedViewById(R.id.ck6);
                kotlin.jvm.internal.o.LJIIIIZZ(dynamic_sell_point_label, "dynamic_sell_point_label");
                c70637Rnt2.LIZ(dynamicSellingPointsBase, dynamic_sell_point_label, getViewModel());
                C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rnn
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((PdpMainState) obj).isFullScreen());
                    }
                }, new AqS174S0200000_12(this, c70637Rnt2, 3));
                c70637Rnt2.LJIIIIZZ.postDelayed(c70637Rnt2.LJIIIZ, c70637Rnt2.LIZJ);
            }
        }
        View video_control_button = _$_findCachedViewById(R.id.n4s);
        kotlin.jvm.internal.o.LJIIIIZZ(video_control_button, "video_control_button");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 5, 42), video_control_button);
        P().LIZLLL(new C70621Rnd(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalHeaderVH(ViewGroup parent, ECBaseFragment fragment) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a3a, parent, false));
        kotlin.jvm.internal.o.LJIIIZ(parent, "parent");
        kotlin.jvm.internal.o.LJIIIZ(fragment, "fragment");
        this.LJLLI = new LinkedHashMap();
        this.LJLIL = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 2));
        this.LJLJI = C221108m2.LIZIZ(C70641Rnx.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 53));
        this.LJLJJLL = true;
        this.LJLJLLL = new LinkedHashSet();
    }
}
