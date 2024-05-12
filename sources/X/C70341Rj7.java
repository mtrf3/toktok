package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rj7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70341Rj7 extends C0A6 {
    public String LJLIL;
    public int LJLJI;
    public int LJLJJI;
    public final /* synthetic */ MiniPdpHeaderWidget LJLJJLL;
    public final int LJLILLLLZI = 8;
    public List<Image> LJLJJL = C61878OQg.INSTANCE;

    public C70341Rj7(MiniPdpHeaderWidget miniPdpHeaderWidget) {
        this.LJLJJLL = miniPdpHeaderWidget;
    }

    public final List<Image> LJIILLIIL(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int i;
        int i2;
        List<Image> subList;
        LinearLayoutManager linearLayoutManager2;
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            i = linearLayoutManager.LLILL();
        } else {
            i = 0;
        }
        C0A2 layoutManager2 = recyclerView.getLayoutManager();
        if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
            i2 = linearLayoutManager2.LLILLJJLI();
        } else {
            i2 = 0;
        }
        List<Image> data = this.LJLJJLL.LJLJJLL.getData();
        if (data == null || (subList = data.subList(Math.max(0, i), Math.min(i2, data.size() - 1))) == null) {
            return C61878OQg.INSTANCE;
        }
        return subList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r5 == 0) goto L15;
     */
    @Override // X.C0A6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(int r5, androidx.recyclerview.widget.RecyclerView r6) {
        /*
            r4 = this;
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            int r0 = r4.LJLJJI
            if (r0 != 0) goto L11
            if (r5 == 0) goto L11
            java.util.List r0 = r4.LJIILLIIL(r6)
            r4.LJLJJL = r0
        L11:
            int r0 = r4.LJLJJI
            if (r0 == 0) goto L4d
            if (r5 != 0) goto L4a
            int r1 = r4.LJLJI
            int r0 = r4.LJLILLLLZI
            if (r1 <= r0) goto L47
            java.lang.String r3 = r4.LJLIL
            if (r3 == 0) goto L38
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = X.C70307RiZ.LIZ
            java.util.Map r2 = X.C113554cx.LJJLIL(r0)
            java.lang.String r1 = "module_name"
            java.lang.String r0 = "head_pic"
            r2.put(r1, r0)
            java.lang.String r0 = "slide_type"
            r2.put(r0, r3)
            java.lang.String r0 = "tiktokec_module_slide"
            X.C76542zS.LIZ(r0, r2)
        L38:
            X.Rsq r2 = new X.Rsq
            r2.<init>()
            kotlin.jvm.internal.AqS143S0200000_12 r1 = new kotlin.jvm.internal.AqS143S0200000_12
            r0 = 39
            r1.<init>(r4, r6, r0)
            X.C78946Uyc.LJJIIJ(r6, r2, r1)
        L47:
            r0 = 0
            r4.LJLJI = r0
        L4a:
            r4.LJLJJI = r5
            return
        L4d:
            if (r5 != 0) goto L4a
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70341Rj7.LJIILJJIL(int, androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        String str;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i < 0) {
            str = "left";
        } else {
            str = "right";
        }
        this.LJLIL = str;
        this.LJLJI = Math.abs(i) + this.LJLJI;
    }
}
