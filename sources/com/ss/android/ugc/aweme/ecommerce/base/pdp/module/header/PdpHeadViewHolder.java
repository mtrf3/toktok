package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header;

import X.C221108m2;
import X.C26508Aam;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69695RWx;
import X.C70414RkI;
import X.C70637Rnt;
import X.C70644Ro0;
import X.C70756Rpo;
import X.C70877Rrl;
import X.C72545SdZ;
import X.C73156SnQ;
import X.C78946Uyc;
import X.C7MY;
import X.C80766Vms;
import X.IQ9;
import X.InterfaceC36571c5;
import X.InterfaceC71003Rtn;
import X.ORZ;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.SkuEntranceState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS16S1101000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpHeadViewHolder extends AbsFullSpanVH {
    public final Fragment LJLIL;
    public final C80766Vms LJLILLLLZI;
    public final TextView LJLJI;
    public final C62822Ol8 LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public C70637Rnt LJLLILLLL;
    public final Set<String> LJLLJ;
    public final Map<Integer, View> LJLLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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

    public final C70756Rpo L() {
        return (C70756Rpo) this.LJLLI.getValue();
    }

    public final IQ9 T() {
        return (IQ9) this.LJLL.getValue();
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLJJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int M() {
        List<MediaItem> list = ((C69695RWx) getItem()).LJLJJLL;
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

    public final boolean P() {
        if (getViewModel().xw0() || Q() >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int Q() {
        Iterator<MediaItem> it = ((C69695RWx) getItem()).LJLJJLL.iterator();
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
        T().pause();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, false);
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rnj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((PdpMainState) obj).isFullScreen());
            }
        }, new AqS194S0100000_12(this, 50));
        C73156SnQ.LJIIIIZZ(this, getViewModel().LLIILII, new TBT() { // from class: X.Rmx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuEntranceState) obj).getSelectImage();
            }
        }, new AqS194S0100000_12(this, 51));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        Video video;
        C70414RkI c70414RkI;
        super.onDestroy();
        MediaItem mediaItem = (MediaItem) ORZ.LJLLLLLL(Q(), ((C69695RWx) getItem()).LJLJJLL);
        if (mediaItem != null && (video = mediaItem.video) != null) {
            Aweme LIZIZ = video.LIZIZ();
            if (LIZIZ.getVideo() != null && (c70414RkI = getViewModel().LLFII) != null) {
                c70414RkI.LJJJJZI((int) T().LJIIL, LIZIZ.getAid(), "head_pic");
            }
        }
        L().LJJIIZ();
        C70637Rnt c70637Rnt = this.LJLLILLLL;
        if (c70637Rnt != null) {
            c70637Rnt.LIZIZ();
        }
        this.LJLLILLLL = null;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        super.onPause();
        T().pause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String N(int i) {
        if (((C69695RWx) getItem()).LJLJI && i == ((C69695RWx) getItem()).LJLIL.size() - 1) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public final void V(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        if (Q() == 0 && this.LJLJJL == 0) {
            _$_findCachedViewById(R.id.ck6).setVisibility(i);
        }
        _$_findCachedViewById(R.id.ela).setVisibility(i);
        if (P()) {
            _$_findCachedViewById(R.id.kxw).setVisibility(i);
        }
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.n4s).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            View indicator_text = _$_findCachedViewById(R.id.ela);
            o.LJIIIIZZ(indicator_text, "indicator_text");
            if (indicator_text.getVisibility() == 0) {
                i2 = 48;
            } else {
                i2 = 16;
            }
            marginLayoutParams.bottomMargin = C7MY.LIZIZ(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x026c, code lost:
    
        if (r1 >= 0) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.PdpHeadViewHolder.onBind(java.lang.Object):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpHeadViewHolder(ViewGroup parent, ECBaseFragment fragment) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a39, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this.LJLLL = new LinkedHashMap();
        this.LJLIL = fragment;
        this.LJLILLLLZI = (C80766Vms) this.itemView.findViewById(R.id.bng);
        this.LJLJI = (TextView) this.itemView.findViewById(R.id.ela);
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLJJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 202));
        this.LJLJJLL = true;
        this.LJLJL = true;
        this.LJLL = C221108m2.LIZIZ(C70644Ro0.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1245));
        this.LJLLJ = new LinkedHashSet();
    }

    public final void U(int i, Image image) {
        InterfaceC71003Rtn interfaceC71003Rtn;
        String uri = image.getUri();
        if (uri != null && !ujb.o.LJJJJJL(uri) && !this.LJLLJ.contains(uri)) {
            this.LJLLJ.add(uri);
            InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
            if ((interfaceC36571c5 instanceof InterfaceC71003Rtn) && (interfaceC71003Rtn = (InterfaceC71003Rtn) interfaceC36571c5) != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70877Rrl(), new AqS16S1101000_12(uri, this, i, 3));
            }
        }
    }
}
