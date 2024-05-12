package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6mR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170396mR extends C8HS<EffectModel> {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final InterfaceC165006dk LJLJI;
    public final C164926dc LJLJJI;
    public final C84507XEp LJLJJL;
    public final List<Integer> LJLJJLL;
    public InterfaceC170486ma LJLJL;

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        return 0;
    }

    @Override // X.C8HS
    public final void setData(List<EffectModel> list) {
        int i;
        super.setData(list);
        ((ArrayList) this.LJLJJLL).clear();
        List<EffectModel> data = getData();
        if (data != null) {
            for (EffectModel effectModel : data) {
                if (C44687HgJ.LIZIZ(effectModel.resDir)) {
                    i = 16;
                } else if (this.LJLJJL.LIZJ(effectModel) || this.LJLJJL.LIZLLL(effectModel)) {
                    i = 8;
                } else {
                    i = 2;
                }
                ((ArrayList) this.LJLJJLL).add(Integer.valueOf(i));
            }
        }
    }

    public final void LJLLLLLL(int i, int i2) {
        if (((ArrayList) this.LJLJJLL).size() <= i || ((Number) ListProtector.get(this.LJLJJLL, i)).intValue() == i2) {
            return;
        }
        ListProtector.set(this.LJLJJLL, i, Integer.valueOf(i2));
        notifyItemChanged(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0236  */
    @Override // X.C4II
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170396mR.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.arh, parent, false);
        o.LJIIIIZZ(view, "view");
        return new C170406mS(view, this.LJLJJI, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170396mR(boolean z, boolean z2, InterfaceC165006dk interfaceC165006dk, C164926dc config, C84507XEp downloadController) {
        super(false, 1, null);
        o.LJIIIZ(config, "config");
        o.LJIIIZ(downloadController, "downloadController");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = interfaceC165006dk;
        this.LJLJJI = config;
        this.LJLJJL = downloadController;
        this.LJLJJLL = new ArrayList();
    }
}
