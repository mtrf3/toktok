package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidgetV2;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecListLayoutV2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ReV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70055ReV implements InterfaceC70059ReZ {
    public final /* synthetic */ SkuWidgetV2 LJLIL;

    @Override // X.InterfaceC70059ReZ
    public final void onSpecItemBind(View view, int i, int i2, C70216Rh6 c70216Rh6) {
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSpecLayoutBind(C70248Rhc c70248Rhc, int i, List<C70216Rh6> list) {
    }

    public C70055ReV(SkuWidgetV2 skuWidgetV2) {
        this.LJLIL = skuWidgetV2;
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSizeGuideClick(SizeGuide sizeGuide) {
        HashMap<String, Object> hashMap;
        FragmentManager requireFragmentManager = this.LJLIL.LJLIL.requireFragmentManager();
        o.LJIIIIZZ(requireFragmentManager, "fragment.requireFragmentManager()");
        Context requireContext = this.LJLIL.LJLIL.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        SkuWidgetV2 skuWidgetV2 = this.LJLIL;
        SkuPanelFragment skuPanelFragment = skuWidgetV2.LJLIL;
        SkuPanelStarter.SkuEnterParams skuEnterParams = skuWidgetV2.getMViewModel().LJLLJ;
        if (skuEnterParams != null) {
            hashMap = skuEnterParams.getTrackParams();
        } else {
            hashMap = null;
        }
        C70064Ree.LIZIZ(requireFragmentManager, requireContext, skuPanelFragment, hashMap, sizeGuide);
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSpecListLayoutBind(SpecListLayoutV2 specListLayoutV2, RWJ vo) {
        o.LJIIIZ(vo, "vo");
        List<String> list = vo.LJFF;
        int i = 0;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next(), "")) {
                    if (i < 0) {
                        return;
                    }
                } else {
                    i++;
                }
            }
            return;
        }
        this.LJLIL.getMViewModel().LJZI = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01c8, code lost:
    
        if (r10 != null) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012a  */
    @Override // X.InterfaceC70059ReZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSpecChecked(android.view.View r56, int r57, int r58, X.C70216Rh6 r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70055ReV.onSpecChecked(android.view.View, int, int, X.Rh6, boolean):void");
    }
}
