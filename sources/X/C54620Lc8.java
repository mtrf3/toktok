package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.assem.FeedSkylightListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Lc8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54620Lc8 implements C0A3 {
    public final /* synthetic */ FeedSkylightListAssem LJLIL;
    public final /* synthetic */ C54619Lc7 LJLILLLLZI;

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.C0A3
    public final void LJJIFFI(View view) {
        o.LJIIIZ(view, "view");
        this.LJLIL.v3();
        if (RecyclerView.LJJJJIZL(view) == 0) {
            this.LJLIL.H3(this.LJLILLLLZI.LJLJI, true);
        }
    }

    public C54620Lc8(FeedSkylightListAssem feedSkylightListAssem, C54619Lc7 c54619Lc7) {
        this.LJLIL = feedSkylightListAssem;
        this.LJLILLLLZI = c54619Lc7;
    }
}
