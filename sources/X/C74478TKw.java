package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TKw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74478TKw extends AbstractC42164Ggi<EffectCategoryResponse> {
    public final /* synthetic */ C74480TKy LJLJJI;

    @Override // X.AbstractC42164Ggi
    public final RecyclerView.ViewHolder LJZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        C74480TKy c74480TKy = this.LJLJJI;
        c74480TKy.getClass();
        if (c74480TKy.LJJJJJ) {
            View LIZ = C28289B8j.LIZ(parent, R.layout.crz, parent, false);
            TextView text = (TextView) LIZ.findViewById(R.id.khv);
            o.LJIIIIZZ(text, "text");
            return new C42230Ghm(LIZ, text);
        }
        return new C74474TKs(C1FL.LIZIZ(parent, R.layout.ba7, parent, false, "LayoutInflater.from(pare…r_divider, parent, false)"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74478TKw(C74480TKy c74480TKy, AbstractC029409q<RecyclerView.ViewHolder> delegate) {
        super(delegate);
        o.LJIIIZ(delegate, "delegate");
        this.LJLJJI = c74480TKy;
    }

    @Override // X.AbstractC42164Ggi
    public final void LJLZ(RecyclerView.ViewHolder holder, EffectCategoryResponse effectCategoryResponse) {
        o.LJIIIZ(holder, "holder");
        this.LJLJJI.LJJIIZI(holder, effectCategoryResponse);
    }
}
