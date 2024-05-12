package X;

import android.graphics.Bitmap;
import android.util.Size;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HOJ implements HO6 {
    public final boolean LIZ = e1.LIZ(31744, "creative_tools_enable_resized_image_diskcache", true, false);

    @Override // X.HO6
    public final void LIZ(C45507HtX holder, Size itemSize, MyMediaModel myMediaModel, C45470Hsw c45470Hsw, boolean z) {
        EnumC72807Shn enumC72807Shn;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(itemSize, "itemSize");
        W5F LJFF = W5U.LJFF(C44694HgQ.LJIIIIZZ(myMediaModel.fileLocalUriPath));
        LJFF.LJJIIJ = holder.LJLIL;
        LJFF.LJIJI = Bitmap.Config.RGB_565;
        if (HO5.LIZ(itemSize, myMediaModel, z)) {
            enumC72807Shn = EnumC72807Shn.FIT_CENTER;
        } else {
            enumC72807Shn = EnumC72807Shn.CENTER_CROP;
        }
        LJFF.LJIJJ = enumC72807Shn;
        LJFF.LJIIJJI = R.drawable.a1i;
        int width = itemSize.getWidth();
        int height = itemSize.getHeight();
        LJFF.LJII = width;
        LJFF.LJIIIIZZ = height;
        LJFF.LJJIJIL = this.LIZ;
        LJFF.LJIIL = 10;
        LJFF.LIZLLL(new C44215HWx(c45470Hsw));
    }
}
