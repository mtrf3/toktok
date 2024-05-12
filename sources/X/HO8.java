package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS20S0310000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HO8 implements HO6 {
    public final Context LIZ;
    public final C5H3 LIZIZ;

    public HO8(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = C221108m2.LIZ(EnumC221088m0.NONE, new AqS157S0100000_7(this, 489));
    }

    @Override // X.HO6
    public final void LIZ(C45507HtX holder, Size itemSize, MyMediaModel myMediaModel, C45470Hsw c45470Hsw, boolean z) {
        ImageView.ScaleType scaleType;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(itemSize, "itemSize");
        holder.LJLIL.setImageDrawable((Drawable) this.LIZIZ.getValue());
        C164066cE c164066cE = holder.LJLIL;
        if (HO5.LIZ(itemSize, myMediaModel, z)) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        c164066cE.setScaleType(scaleType);
        c45470Hsw.LIZ = System.currentTimeMillis();
        C164066cE c164066cE2 = holder.LJLIL;
        o.LJIIIIZZ(c164066cE2, "holder.mImageView");
        holder.LJZ = C42606Gnq.LIZ(c164066cE2, myMediaModel, itemSize, new AqS20S0310000_7(holder, c45470Hsw, z, myMediaModel, 2));
    }
}
