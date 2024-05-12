package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uij, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77961Uij extends CZA<C78034Uju, C77985Uj7> {
    public C77961Uij() {
        super(R.layout.d9e, Boolean.FALSE);
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        ImageModel imageModel;
        int i;
        Integer LJI;
        C77985Uj7 holder = (C77985Uj7) viewHolder;
        C78034Uju data = (C78034Uju) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(data, "data");
        ImageView imageView = holder.LJLIL;
        User user = data.LIZ.rankUser;
        if (user != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        C31665Cbl.LJIIJ(imageView, imageModel, holder.LJLIL.getWidth(), holder.LJLIL.getHeight(), R.drawable.d65);
        Drawable background = holder.LJLILLLLZI.getBackground();
        o.LJII(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        int LIZ = C15380j0.LIZ(1.0f);
        long j = data.LIZ.rank;
        if (j == 1) {
            i = C15380j0.LIZIZ(R.color.a_e);
        } else if (j == 2) {
            i = C15380j0.LIZIZ(R.color.a_f);
        } else if (j == 3) {
            i = C15380j0.LIZIZ(R.color.a_g);
        } else {
            Context LIZLLL = C15380j0.LIZLLL();
            if (LIZLLL != null && (LJI = C79045V0n.LJI(R.attr.gp, LIZLLL)) != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
        }
        gradientDrawable.setStroke(LIZ, i);
    }

    @Override // X.CZA
    public final C77985Uj7 LJI(View view, ViewGroup viewGroup) {
        return new C77985Uj7(view);
    }
}
