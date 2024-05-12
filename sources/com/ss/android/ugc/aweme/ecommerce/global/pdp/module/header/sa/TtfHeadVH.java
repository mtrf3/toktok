package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.header.sa;

import X.C018905p;
import X.C113554cx;
import X.C116894iL;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C27162AlK;
import X.C2UK;
import X.C42398GkU;
import X.C47261Igj;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69696RWy;
import X.C70414RkI;
import X.C70622Rne;
import X.C70637Rnt;
import X.C70642Rny;
import X.C70653Ro9;
import X.C70756Rpo;
import X.C70877Rrl;
import X.C72545SdZ;
import X.C73156SnQ;
import X.C78946Uyc;
import X.C80766Vms;
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
import android.widget.TextView;
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
import java.util.ArrayList;
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
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TtfHeadVH extends AbsFullSpanVH {
    public final Fragment LJLIL;
    public final C80766Vms LJLILLLLZI;
    public final TextView LJLJI;
    public final C116894iL LJLJJI;
    public C70756Rpo LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public List<Image> LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public C70637Rnt LJLLJ;
    public final Set<String> LJLLL;
    public final Map<Integer, View> LJLLLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final IQ9 N() {
        return (IQ9) this.LJLLILLLL.getValue();
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLJJLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int L() {
        List<MediaItem> list = ((C69696RWy) getItem()).LJLJLJ;
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
    public final int M() {
        Iterator<MediaItem> it = ((C69696RWy) getItem()).LJLJLJ.iterator();
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
        N().pause();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, false);
        C80766Vms viewPager = this.LJLILLLLZI;
        o.LJIIIIZZ(viewPager, "viewPager");
        this.LJLJJL = new C70756Rpo(viewPager, getViewModel(), getLifecycle(), N());
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rnl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((PdpMainState) obj).isFullScreen());
            }
        }, new AqS194S0100000_12(this, 115));
        C73156SnQ.LJIIIIZZ(this, getViewModel().LLIILII, new TBT() { // from class: X.Rmz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuEntranceState) obj).getSelectImage();
            }
        }, new AqS194S0100000_12(this, 116));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        Video video;
        C70414RkI c70414RkI;
        super.onDestroy();
        MediaItem mediaItem = (MediaItem) ORZ.LJLLLLLL(M(), ((C69696RWy) getItem()).LJLJLJ);
        if (mediaItem != null && (video = mediaItem.video) != null) {
            Aweme LIZIZ = video.LIZIZ();
            if (LIZIZ.getVideo() != null && (c70414RkI = getViewModel().LLFII) != null) {
                c70414RkI.LJJJJZI((int) N().LJIIL, LIZIZ.getAid(), "head_pic");
            }
        }
        C70756Rpo c70756Rpo = this.LJLJJL;
        if (c70756Rpo != null) {
            c70756Rpo.LJJIIZ();
        }
        C70637Rnt c70637Rnt = this.LJLLJ;
        if (c70637Rnt != null) {
            c70637Rnt.LIZIZ();
        }
        this.LJLLJ = null;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        super.onPause();
        N().pause();
    }

    public final void P(Image image) {
        InterfaceC71003Rtn interfaceC71003Rtn;
        String uri = image.getUri();
        if (uri != null && !ujb.o.LJJJJJL(uri) && !this.LJLLL.contains(uri)) {
            this.LJLLL.add(uri);
            InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
            if ((interfaceC36571c5 instanceof InterfaceC71003Rtn) && (interfaceC71003Rtn = (InterfaceC71003Rtn) interfaceC36571c5) != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70877Rrl(), new AqS35S1000000_12(uri, 10));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i) {
        _$_findCachedViewById(R.id.aw6).setVisibility(i);
        if (((C69696RWy) getItem()).LJLJJLL == 1) {
            this.LJLJJI.setVisibility(i);
        }
        if (((C69696RWy) getItem()).LJLJJLL == 0) {
            this.LJLJI.setVisibility(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object item) {
        C018905p c018905p;
        int i;
        String str;
        String[] strArr;
        String str2;
        int i2;
        float f;
        o.LJIIIZ(item, "item");
        View _$_findCachedViewById = _$_findCachedViewById(R.id.bng);
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.bng).getLayoutParams();
        if (layoutParams instanceof C018905p) {
            c018905p = (C018905p) layoutParams;
        } else {
            c018905p = null;
        }
        boolean z = false;
        if (c018905p != null) {
            Image image = (Image) ORZ.LJLLLL(((C69696RWy) getItem()).LJLIL);
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
        _$_findCachedViewById.setLayoutParams(c018905p);
        this.LJLJLLL = ((C69696RWy) getItem()).LJLJLJ.size();
        if (((C69696RWy) getItem()).LJLJLJ.isEmpty()) {
            this.LJLJI.setVisibility(8);
            this.LJLJJI.setVisibility(8);
            ((ImageView) this.itemView.findViewById(R.id.bnh)).setVisibility(0);
        } else {
            if (((C69696RWy) getItem()).LJLJJLL == 0) {
                this.LJLJJI.setVisibility(8);
                this.LJLJI.setVisibility(0);
                this.LJLJI.setText(C27162AlK.LIZ(String.valueOf(this.LJLJL + 1), String.valueOf(this.LJLJLLL)));
            } else {
                this.LJLJJI.setVisibility(0);
                this.LJLJI.setVisibility(8);
                this.LJLJJI.setCount(this.LJLJLLL);
            }
            ((ImageView) this.itemView.findViewById(R.id.bnh)).setVisibility(8);
            C70756Rpo c70756Rpo = this.LJLJJL;
            if (c70756Rpo != null) {
                C70756Rpo.LJJIJIL(c70756Rpo, ((C69696RWy) getItem()).LJLJLJ);
                List<ProductBannerLabel> list = ((C69696RWy) getItem()).LJLJJI;
                ((ArrayList) c70756Rpo.LJZI).clear();
                if (list != null) {
                    ((ArrayList) c70756Rpo.LJZI).addAll(list);
                }
                c70756Rpo.LJLLILLLL = getViewModel().LJLJL;
                c70756Rpo.LJLLJ = new AqS178S0100000_12(this, 353);
                c70756Rpo.LJLLLL = new AqS194S0100000_12(this, 173);
                c70756Rpo.LJLLL = new AqS162S0100000_12(this, 994);
                c70756Rpo.LJLZ = new AqS162S0100000_12(this, 995);
            }
            if (this.LJLLI.isEmpty() || !o.LJ(this.LJLLI, ((C69696RWy) getItem()).LJLIL)) {
                this.LJLILLLLZI.setAdapter(this.LJLJJL);
            }
            this.LJLLI = ((C69696RWy) getItem()).LJLIL;
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null) {
                Image image2 = (Image) ORZ.LJLLLLLL(this.LJLJL, ((C69696RWy) getItem()).LJLIL);
                if (image2 != null) {
                    str2 = image2.getUri();
                } else {
                    str2 = null;
                }
                c70414RkI.LJJLIIIJLLLLLLLZ(str2);
            }
            this.LJLILLLLZI.setOnPageChangeListener(new IDiS273S0100000_12(this, 1));
            C80766Vms c80766Vms = this.LJLILLLLZI;
            if (this.LJLJLJ && !((C69696RWy) getItem()).LJLJI) {
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
                    i = this.LJLJL;
                }
            } else {
                i = this.LJLJL;
            }
            c80766Vms.setCurrentItem(i, false);
            if (!getViewModel().LLIIII) {
                this.LJLJLJ = false;
            }
            C70414RkI c70414RkI2 = getViewModel().LLFII;
            if (c70414RkI2 != null && c70414RkI2.LJIJI) {
                String str3 = "";
                int i3 = 0;
                for (ProductBannerLabel productBannerLabel : ((C69696RWy) getItem()).LJLJJI) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str3);
                        LIZ2.append(productBannerLabel.eventTrackingName);
                        str3 = X1D.LIZIZ(LIZ2);
                        if (i3 < ((C69696RWy) getItem()).LJLJJI.size() - 1) {
                            str3 = C42398GkU.LIZIZ(str3, ',');
                        }
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                C70414RkI c70414RkI3 = getViewModel().LLFII;
                if (c70414RkI3 != null) {
                    boolean z2 = getViewModel().LJLJL;
                    OSZ[] oszArr = new OSZ[3];
                    oszArr[0] = new OSZ("rights_cnt", Integer.valueOf(((C69696RWy) getItem()).LJLJJI.size()));
                    oszArr[1] = new OSZ("rights_content", str3);
                    if (L() > 0) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    oszArr[2] = new OSZ("has_video", str);
                    C70414RkI.LJJJJI(c70414RkI3, "head_pic", z2, false, null, C113554cx.LJJL(oszArr), 44);
                }
            }
            P((Image) ListProtector.get(((C69696RWy) getItem()).LJLIL, 0));
        }
        if (((C69696RWy) getItem()).LJLJJL == null) {
            View btn_favorite = _$_findCachedViewById(R.id.aw6);
            o.LJIIIIZZ(btn_favorite, "btn_favorite");
            btn_favorite.setVisibility(8);
        } else {
            View btn_favorite2 = _$_findCachedViewById(R.id.aw6);
            o.LJIIIIZZ(btn_favorite2, "btn_favorite");
            btn_favorite2.setVisibility(0);
            Boolean bool = ((C69696RWy) getItem()).LJLJJL;
            if (bool != null) {
                z = bool.booleanValue();
            }
            this.LJLL = z;
            C70653Ro9 c70653Ro9 = (C70653Ro9) _$_findCachedViewById(R.id.aw6);
            if (z) {
                i2 = R.raw.icon_3pt_bookmark_fill;
            } else {
                i2 = R.raw.icon_3pt_bookmark;
            }
            c70653Ro9.setIconRes(i2);
            View btn_favorite3 = _$_findCachedViewById(R.id.aw6);
            o.LJIIIIZZ(btn_favorite3, "btn_favorite");
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 39, 42), btn_favorite3);
        }
        View video_control_button = _$_findCachedViewById(R.id.n4s);
        o.LJIIIIZZ(video_control_button, "video_control_button");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 40, 42), video_control_button);
        N().LIZLLL(new C70622Rne(this));
        if (((C69696RWy) getItem()).LJLJL == null) {
            return;
        }
        C70637Rnt c70637Rnt = this.LJLLJ;
        if (c70637Rnt == null) {
            this.LJLLJ = new C70637Rnt();
        } else {
            c70637Rnt.LIZIZ();
        }
        C70637Rnt c70637Rnt2 = this.LJLLJ;
        if (c70637Rnt2 == null) {
            return;
        }
        DynamicSellingPointsBase dynamicSellingPointsBase = ((C69696RWy) getItem()).LJLJL;
        C2UK dynamic_sell_point_label = (C2UK) _$_findCachedViewById(R.id.ck6);
        o.LJIIIIZZ(dynamic_sell_point_label, "dynamic_sell_point_label");
        c70637Rnt2.LIZ(dynamicSellingPointsBase, dynamic_sell_point_label, getViewModel());
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rno
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((PdpMainState) obj).isFullScreen());
            }
        }, new AqS174S0200000_12(this, c70637Rnt2, 17));
        c70637Rnt2.LJIIIIZZ.postDelayed(c70637Rnt2.LJIIIZ, c70637Rnt2.LIZJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfHeadVH(ViewGroup parent, ECBaseFragment fragment) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a3_, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this.LJLLLL = new LinkedHashMap();
        this.LJLIL = fragment;
        this.LJLILLLLZI = (C80766Vms) this.itemView.findViewById(R.id.bng);
        this.LJLJI = (TextView) this.itemView.findViewById(R.id.ela);
        this.LJLJJI = (C116894iL) this.itemView.findViewById(R.id.el5);
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 159));
        this.LJLJLJ = true;
        this.LJLLI = C61878OQg.INSTANCE;
        this.LJLLILLLL = C221108m2.LIZIZ(C70642Rny.LJLIL);
        this.LJLLL = new LinkedHashSet();
    }
}
