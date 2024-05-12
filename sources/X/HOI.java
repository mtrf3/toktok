package X;

import Y.AObjectS52S0101000_7;
import android.graphics.Bitmap;
import android.util.Size;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import kotlin.jvm.internal.o;
import o53.IDdS474S0100000_7;

/* loaded from: classes8.dex */
public final class HOI implements HO6 {
    public final HashSet<C45507HtX> LIZ;
    public final InterfaceC65784Pro<Boolean> LIZIZ;

    public HOI(HashSet mUnRequestedViewHolders, AObjectS52S0101000_7 aObjectS52S0101000_7) {
        o.LJIIIZ(mUnRequestedViewHolders, "mUnRequestedViewHolders");
        this.LIZ = mUnRequestedViewHolders;
        this.LIZIZ = aObjectS52S0101000_7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.W5O, REQUEST] */
    @Override // X.HO6
    public final void LIZ(C45507HtX holder, Size itemSize, MyMediaModel myMediaModel, C45470Hsw c45470Hsw, boolean z) {
        double d;
        EnumC72807Shn enumC72807Shn;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(itemSize, "itemSize");
        C44947HkV c44947HkV = InterfaceC44948HkW.LJI;
        if (c44947HkV.getOpenAlbumOptiGroup() == 1) {
            d = 0.8d;
        } else if (c44947HkV.getOpenAlbumOptiGroup() == 2) {
            d = 0.6d;
        } else {
            d = 1.0d;
        }
        W5P LIZLLL = W5P.LIZLLL(C44694HgQ.LJIIIIZZ(myMediaModel.fileLocalUriPath));
        LIZLLL.LJIIL = true;
        LIZLLL.LIZJ = new C79238V7y((int) (itemSize.getWidth() * d), (int) (itemSize.getHeight() * d));
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.getClass();
        LIZLLL.LJ = new C81810W8w(imageDecodeOptionsBuilder);
        ?? LIZ = LIZLLL.LIZ();
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = holder.LJLIL.getController();
        LIZJ.LIZLLL = LIZ;
        LIZJ.LJII = new IDdS474S0100000_7(c45470Hsw, 2);
        W4R LIZ2 = LIZJ.LIZ();
        W6J LIZ3 = W5I.LIZ();
        o.LJIIIIZZ(LIZ3, "getImagePipeline()");
        ((AbstractC48384Iyq) LIZ3.LJ(LIZ, this)).LJ(new HO9(z, myMediaModel, holder), C79561VKj.LJLIL);
        holder.LJLIL.setPlaceholderImage(R.drawable.a1i);
        C164066cE c164066cE = holder.LJLIL;
        if (HO5.LIZ(itemSize, myMediaModel, z)) {
            enumC72807Shn = EnumC72807Shn.FIT_CENTER;
        } else {
            enumC72807Shn = EnumC72807Shn.CENTER_CROP;
        }
        c164066cE.setActualImageScaleType(enumC72807Shn);
        holder.LJLIL.getHierarchy().LJIILLIIL(10);
        holder.LJLZ = LIZ2;
        if (this.LIZIZ.invoke().booleanValue()) {
            this.LIZ.add(holder);
        } else {
            holder.LJLIL.setController(LIZ2);
        }
    }
}
