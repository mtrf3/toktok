package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.panel.paidcontent.PaidContentPreviewComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.A6d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25683A6d implements C2MJ {
    public final /* synthetic */ PaidContentPreviewComponent LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ ViewGroup LJLJJI;

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
    }

    @Override // X.C2MJ
    public final void J8(int i) {
        boolean z;
        if (this.LJLIL.LJLJL != null) {
            z = true;
        } else {
            z = false;
        }
        C2U8.LIZ(new A6O(false, z, this.LJLILLLLZI));
        this.LJLIL.LJLJL = null;
        View findViewById = this.LJLJI.findViewById(R.id.hgn);
        ViewGroup viewGroup = this.LJLJJI;
        if (viewGroup != null) {
            C16880lQ.LJLLL(findViewById, viewGroup);
        }
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    public C25683A6d(PaidContentPreviewComponent paidContentPreviewComponent, boolean z, View view, ViewGroup viewGroup) {
        this.LJLIL = paidContentPreviewComponent;
        this.LJLILLLLZI = z;
        this.LJLJI = view;
        this.LJLJJI = viewGroup;
    }
}
