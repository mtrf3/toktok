package X;

import Y.IDrS50S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecItemAdapterV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rhc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70248Rhc extends FrameLayout implements InterfaceC70273Ri1 {
    public InterfaceC70059ReZ LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public List<C70216Rh6> LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final SpecItemAdapterV2 LJLJLLL;
    public boolean LJLL;
    public final java.util.Map<Integer, View> LJLLI = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final int getDataSize() {
        List<C70216Rh6> list = this.LJLJJI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void LIZIZ() {
        C0A2 layoutManager = ((RecyclerView) LIZ(R.id.k9c)).getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        if (getDataSize() > Math.abs(LLILL - LLILLJJLI) && ((ViewGroup) LIZ(R.id.k9c)).getChildCount() > 0) {
            int i = -1;
            if (this.LJLILLLLZI == -1) {
                return;
            }
            int i2 = (LLILL + LLILLJJLI) / 2;
            int width = ((ViewGroup) LIZ(R.id.k9c)).getChildAt(0).getWidth();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (!C26338AVi.LIZJ(context)) {
                i = 1;
            }
            int i3 = this.LJLILLLLZI;
            if (i3 == i2) {
                return;
            }
            if (i3 > i2 && !LIZ(R.id.k9c).canScrollHorizontally(i)) {
                return;
            }
            if (this.LJLILLLLZI < i2 && !LIZ(R.id.k9c).canScrollHorizontally(-i)) {
                return;
            }
            int abs = (int) ((Math.abs(this.LJLILLLLZI - i2) + 0.5d) * width);
            if (this.LJLILLLLZI <= i2) {
                i = -i;
            }
            ((RecyclerView) LIZ(R.id.k9c)).LJLIIIL(abs * i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C70248Rhc(Context context) {
        super(context);
        this.LJLILLLLZI = -1;
        this.LJLJI = -2;
        this.LJLJJL = -1;
        this.LJLJJLL = "";
        SpecItemAdapterV2 specItemAdapterV2 = new SpecItemAdapterV2(null, 1, 0 == true ? 1 : 0);
        this.LJLJLLL = specItemAdapterV2;
        this.LJLL = true;
        C27533ArJ.LIZ(R.layout.a7u, context, this, true);
        ((RecyclerView) LIZ(R.id.k9c)).setAdapter(specItemAdapterV2);
        ((RecyclerView) LIZ(R.id.k9c)).setItemAnimator(null);
        RecyclerView recyclerView = (RecyclerView) LIZ(R.id.k9c);
        ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context);
        scrollTopLinearLayoutManager.LLJJIII(0);
        recyclerView.setLayoutManager(scrollTopLinearLayoutManager);
        ((RecyclerView) LIZ(R.id.k9c)).LJIIJJI(new IDrS50S0100000_12(this, 18));
        int i = (int) (C27162AlK.LIZ * 0.5d);
        if (i > 0) {
            ((TextView) LIZ(R.id.k9f)).setMaxWidth(i);
        }
        ((ViewGroup) LIZ(R.id.k9c)).setClipChildren(false);
        ((RecyclerView) LIZ(R.id.k9c)).setClipToPadding(false);
        ((ViewGroup) LIZ(R.id.k9a)).setClipChildren(false);
        ((ViewGroup) LIZ(R.id.k9a)).setClipToPadding(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void setSpecListener(InterfaceC70059ReZ interfaceC70059ReZ) {
        this.LJLIL = interfaceC70059ReZ;
    }

    @Override // X.InterfaceC70273Ri1
    public final void LJJIJLIJ(int i, Object obj) {
        boolean z;
        InterfaceC70059ReZ interfaceC70059ReZ;
        C70216Rh6 c70216Rh6;
        if (i != this.LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        if ((!(obj instanceof C70253Rhh) || z) && (interfaceC70059ReZ = this.LJLIL) != null) {
            int i2 = this.LJLJJL;
            List<C70216Rh6> list = this.LJLJJI;
            if (list != null) {
                c70216Rh6 = (C70216Rh6) ORZ.LJLLLLLL(i, list);
            } else {
                c70216Rh6 = null;
            }
            interfaceC70059ReZ.onSpecChecked(this, i2, i, c70216Rh6, z);
        }
    }

    @Override // X.InterfaceC70273Ri1
    public final void LJJLIIIJL(int i, RecyclerView.ViewHolder holder) {
        C70216Rh6 c70216Rh6;
        o.LJIIIZ(holder, "holder");
        InterfaceC70059ReZ interfaceC70059ReZ = this.LJLIL;
        if (interfaceC70059ReZ != null) {
            View view = holder.itemView;
            int i2 = this.LJLJJL;
            List<C70216Rh6> list = this.LJLJJI;
            if (list != null) {
                c70216Rh6 = (C70216Rh6) ORZ.LJLLLLLL(i, list);
            } else {
                c70216Rh6 = null;
            }
            interfaceC70059ReZ.onSpecItemBind(view, i2, i, c70216Rh6);
        }
    }
}
