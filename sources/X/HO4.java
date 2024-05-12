package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Size;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.vesdk.VEMediaParser;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HO4 implements HO6 {
    public final Context LIZ;
    public final C5H3 LIZIZ;

    public HO4(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = C221108m2.LIZ(EnumC221088m0.NONE, new AqS157S0100000_7(this, 486));
    }

    @Override // X.HO6
    public final void LIZ(C45507HtX holder, Size itemSize, MyMediaModel myMediaModel, C45470Hsw c45470Hsw, boolean z) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(itemSize, "itemSize");
        holder.LJLIL.setImageDrawable((Drawable) this.LIZIZ.getValue());
        VEMediaParser vEMediaParser = new VEMediaParser();
        c45470Hsw.LIZ = System.currentTimeMillis();
        holder.itemView.post(new HO2(itemSize, c45470Hsw, holder, this, myMediaModel, vEMediaParser, z));
    }
}
