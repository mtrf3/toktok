package X;

import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rpo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70756Rpo extends AbstractC29229BdZ {
    public final C80769Vmv LJLJJLL;
    public final String LJLJL;
    public final PdpViewModel LJLJLJ;
    public final Lifecycle LJLJLLL;
    public final IQ9 LJLL;
    public final boolean LJLLI;
    public boolean LJLLILLLL;
    public AbstractC65781Prl LJLLJ;
    public AbstractC65781Prl LJLLL;
    public AbstractC65781Prl LJLLLL;
    public long LJLLLLLL;
    public AbstractC65781Prl LJLZ;
    public final List<MediaItem> LJZ;
    public final List<ProductBannerLabel> LJZI;
    public Video LJZL;
    public int LL;
    public boolean LLD;
    public HeaderDisplayImageOpt LLF;
    public C73044Slc LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public final C70738RpW LLFZ;

    public final void LJJIIZ() {
        C73044Slc c73044Slc = this.LLFF;
        if (c73044Slc != null) {
            c73044Slc.LJFF(true);
        }
        IQ9 iq9 = this.LJLL;
        SurfaceTexture surfaceTexture = iq9.LIZ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        iq9.LIZ = null;
    }

    public final void LJJIIZI() {
        C73044Slc c73044Slc = this.LLFF;
        if (c73044Slc != null) {
            c73044Slc.setForceHideCenterControl(true);
        }
        this.LLFII = true;
    }

    public final C70765Rpx LJJIJ() {
        C70772Rq4 c70772Rq4;
        PdpViewModel pdpViewModel = this.LJLJLJ;
        if (pdpViewModel != null && (c70772Rq4 = (C70772Rq4) pdpViewModel.LLIZ.getValue()) != null) {
            return c70772Rq4.LIZ;
        }
        return null;
    }

    public final int LJJIJIIJI() {
        Iterator it = ((ArrayList) this.LJZ).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((MediaItem) it.next()).type == 2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        if (C52469KiX.LIZ) {
            return ((ArrayList) this.LJZ).size() + 1;
        }
        return ((ArrayList) this.LJZ).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIILJJIL(int i) {
        if (C52469KiX.LIZ && i == getCount() - 1) {
            return 0.3f;
        }
        return 1.0f;
    }

    public static void LJJIJIL(C70756Rpo c70756Rpo, List items) {
        c70756Rpo.getClass();
        o.LJIIIZ(items, "items");
        ((ArrayList) c70756Rpo.LJZ).clear();
        ((ArrayList) c70756Rpo.LJZ).addAll(items);
        c70756Rpo.notifyDataSetChanged();
    }

    public static void LJJIJL(C70756Rpo c70756Rpo, List list) {
        ((ArrayList) c70756Rpo.LJZI).clear();
        if (list != null) {
            ((ArrayList) c70756Rpo.LJZI).addAll(list);
        }
        c70756Rpo.notifyDataSetChanged();
    }

    @Override // X.AbstractC29229BdZ, androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(obj, "obj");
        return o.LJ(view, obj);
    }

    @Override // X.AbstractC29229BdZ, androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        super.LJIIIZ(i, container, object);
        if (C52469KiX.LIZ && i >= getCount() - 1) {
            this.LJLJI.removeLast();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0278  */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.Pro, X.Prl] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [X.Pro, X.Prl] */
    @Override // X.AbstractC29229BdZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJIII(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instructions count: 1359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70756Rpo.LJJIII(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0121, code lost:
    
        if (r13 == null) goto L75;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Yns, X.Prl] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ynr, X.Prl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(android.content.Context r22, int r23, android.view.ViewGroup r24) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70756Rpo.LJJIIJZLJL(android.content.Context, int, android.view.ViewGroup):void");
    }

    public /* synthetic */ C70756Rpo(C80766Vms c80766Vms, PdpViewModel pdpViewModel, Lifecycle lifecycle, IQ9 iq9) {
        this(c80766Vms, pdpViewModel, lifecycle, iq9, false);
    }

    public final void LJJIJIIJIL(int i, long j, boolean z, boolean z2) {
        C70414RkI c70414RkI;
        PdpViewModel pdpViewModel = this.LJLJLJ;
        if (pdpViewModel != null && (c70414RkI = pdpViewModel.LLFII) != null) {
            c70414RkI.LJJLIIIJJIZ(0.0f, 0.0f, i, j, 0L, z2, z, false, false, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70756Rpo(C80766Vms c80766Vms, PdpViewModel pdpViewModel, Lifecycle lifecycle, IQ9 videoPlayerController, boolean z) {
        super(c80766Vms.getContext(), C16880lQ.LLZIL(c80766Vms.getContext()), 1);
        o.LJIIIZ(lifecycle, "lifecycle");
        o.LJIIIZ(videoPlayerController, "videoPlayerController");
        this.LJLJJLL = c80766Vms;
        this.LJLJL = "pdp_head";
        this.LJLJLJ = pdpViewModel;
        this.LJLJLLL = lifecycle;
        this.LJLL = videoPlayerController;
        this.LJLLI = z;
        this.LJLLILLLL = true;
        this.LJLLLLLL = -1L;
        this.LJZ = new ArrayList();
        this.LJZI = new ArrayList();
        this.LLFFF = true;
        this.LLFZ = new C70738RpW(this);
    }
}
