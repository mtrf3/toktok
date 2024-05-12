package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TKn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74469TKn extends AbstractC42164Ggi<C76800UCe> {
    public final /* synthetic */ C74467TKl LJLJJI;

    @Override // X.AbstractC42164Ggi
    public final RecyclerView.ViewHolder LJZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        this.LJLJJI.getClass();
        return new C74474TKs(C1FL.LIZIZ(parent, R.layout.j7, parent, false, "LayoutInflater.from(pare…list_line, parent, false)"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74469TKn(C74467TKl c74467TKl, C74464TKi c74464TKi) {
        super(c74464TKi);
        this.LJLJJI = c74467TKl;
    }

    @Override // X.AbstractC42164Ggi
    public final void LJLZ(RecyclerView.ViewHolder holder, C76800UCe c76800UCe) {
        o.LJIIIZ(holder, "holder");
    }
}
