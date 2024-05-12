package X;

import android.graphics.drawable.Animatable;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BQZ extends C31073CHl {
    public final /* synthetic */ C29894BoI LJLJL;

    @Override // X.C31073CHl
    public final void LJFF() {
        C2A4 c2a4 = this.LJLJL.LJLJJL;
        if (c2a4 != null) {
            C29306Beo.LJIIIZ(c2a4);
        }
    }

    public BQZ(C29894BoI c29894BoI) {
        this.LJLJL = c29894BoI;
    }

    @Override // X.C31073CHl
    public final void LJI(Animatable anim) {
        List<String> list;
        o.LJIIIZ(anim, "anim");
        C78720Uuy LJII = C15650jR.LIZ().LJII(R.drawable.dbk);
        LJII.LJIJ(ImageView.ScaleType.CENTER_INSIDE);
        ImageModel LJ = C29232Bdc.LJ(this.LJLJL.LJLIL);
        if (LJ != null) {
            list = LJ.getUrls();
        } else {
            list = null;
        }
        LJII.LIZ(list);
        LJII.LIZLLL(ImageView.ScaleType.CENTER_INSIDE);
        LJII.LJIIJJI(this.LJLJL.LJLJJI);
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        ImageView imageView = this.LJLJL.LJLJJI;
        if (imageView != null) {
            C29306Beo.LJJLJLI(imageView);
        }
        C2A4 c2a4 = this.LJLJL.LJLJJL;
        if (c2a4 != null) {
            C29306Beo.LJIIIZ(c2a4);
        }
    }
}
