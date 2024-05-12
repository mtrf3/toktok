package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Ttu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76106Ttu extends C0A6 {
    public boolean LJLIL;
    public final /* synthetic */ C76104Tts LJLILLLLZI;

    public C76106Ttu(C76104Tts c76104Tts) {
        this.LJLILLLLZI = c76104Tts;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && this.LJLIL) {
            this.LJLILLLLZI.LIZLLL();
            this.LJLIL = false;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLILLLLZI.LIZ();
        this.LJLIL = true;
        this.LJLILLLLZI.LJIIJ = false;
    }
}
