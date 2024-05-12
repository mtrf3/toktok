package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170416mT extends C8HS<EffectModel> {
    public final InterfaceC165006dk LJLIL;
    public final C164926dc LJLILLLLZI;
    public InterfaceC170526me LJLJI;
    public int LJLJJI;

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170416mT(InterfaceC165006dk interfaceC165006dk, C164926dc config) {
        super(false, 1, null);
        o.LJIIIZ(config, "config");
        this.LJLIL = interfaceC165006dk;
        this.LJLILLLLZI = config;
        this.LJLJJI = config.LJIIJ ? 0 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x016d, code lost:
    
        if (r4 != ((java.lang.Number) r3).intValue()) goto L15;
     */
    @Override // X.C4II
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170416mT.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.ari, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new C170436mV(this, view, this.LJLIL);
    }
}
