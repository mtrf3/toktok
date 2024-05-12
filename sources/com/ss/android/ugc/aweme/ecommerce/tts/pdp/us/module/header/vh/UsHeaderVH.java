package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.header.vh;

import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69694RWw;
import X.C70414RkI;
import X.C70617RnZ;
import X.C70637Rnt;
import X.C70643Rnz;
import X.C70756Rpo;
import X.C72545SdZ;
import X.C73156SnQ;
import X.IQ9;
import X.InterfaceC71003Rtn;
import X.ORZ;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.SkuEntranceState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UsHeaderVH extends AbsFullSpanVH {
    public final InterfaceC71003Rtn LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public C70637Rnt LJLJJI;
    public final Map<Integer, View> LJLJJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    public final IQ9 M() {
        return (IQ9) this.LJLJI.getValue();
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int L() {
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
        M().pause();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C73156SnQ.LJIIIIZZ(this, getViewModel().LLIILII, new TBT() { // from class: X.Rn0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuEntranceState) obj).getSelectImage();
            }
        }, new AqS194S0100000_12(this, 117));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rn1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getFlashSaleCountDown();
            }
        }, new AqS194S0100000_12(this, 118));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rnm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((PdpMainState) obj).isFullScreen());
            }
        }, new AqS194S0100000_12(this, 119));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        Video video;
        C70414RkI c70414RkI;
        super.onDestroy();
        MediaItem mediaItem = (MediaItem) ORZ.LJLLLLLL(L(), ((C69694RWw) getItem()).LJLJL);
        if (mediaItem != null && (video = mediaItem.video) != null) {
            Aweme LIZIZ = video.LIZIZ();
            if (LIZIZ.getVideo() != null && (c70414RkI = getViewModel().LLFII) != null) {
                c70414RkI.LJJJJZI((int) M().LJIIL, LIZIZ.getAid(), "head_pic");
            }
        }
        C70756Rpo headerPagerAdapter = ((C70617RnZ) _$_findCachedViewById(R.id.bnx)).getHeaderPagerAdapter();
        if (headerPagerAdapter != null) {
            headerPagerAdapter.LJJIIZ();
        }
        C70637Rnt c70637Rnt = this.LJLJJI;
        if (c70637Rnt != null) {
            c70637Rnt.LIZIZ();
        }
        this.LJLJJI = null;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        super.onPause();
        M().pause();
    }

    public final void N(int i) {
        _$_findCachedViewById(R.id.ck6).setVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.header.vh.UsHeaderVH.onBind(java.lang.Object):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsHeaderVH(ViewGroup parent, ECBaseFragment logTracker) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a2x, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(logTracker, "logTracker");
        this.LJLJJL = new LinkedHashMap();
        this.LJLIL = logTracker;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 184));
        this.LJLJI = C221108m2.LIZIZ(C70643Rnz.LJLIL);
    }
}
