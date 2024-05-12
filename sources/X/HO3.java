package X;

import android.graphics.Bitmap;
import android.util.Size;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.vesdk.VEMediaParser;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HO3<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ HO4 LIZ;
    public final /* synthetic */ Size LIZIZ;
    public final /* synthetic */ MyMediaModel LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ C45507HtX LJ;
    public final /* synthetic */ HO7 LJFF;
    public final /* synthetic */ VEMediaParser LJI;

    public HO3(Size size, HO7 ho7, C45507HtX c45507HtX, HO4 ho4, MyMediaModel myMediaModel, VEMediaParser vEMediaParser, boolean z) {
        this.LIZ = ho4;
        this.LIZIZ = size;
        this.LIZJ = myMediaModel;
        this.LIZLLL = z;
        this.LJ = c45507HtX;
        this.LJFF = ho7;
        this.LJI = vEMediaParser;
    }

    @Override // X.C10I
    public final Object then(C10K task) {
        o.LJIIIZ(task, "task");
        if (task.LJIILIIL()) {
            Bitmap bitmap = (Bitmap) task.LJIIJJI();
            if (HOC.LIZIZ()) {
                HO4 ho4 = this.LIZ;
                Size size = this.LIZIZ;
                MyMediaModel myMediaModel = this.LIZJ;
                boolean z = this.LIZLLL;
                ho4.getClass();
                if (HO5.LIZ(size, myMediaModel, z)) {
                    this.LJ.LJLIL.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    this.LJ.LJLIL.setActualImageScaleType(EnumC72807Shn.FIT_CENTER);
                    this.LJ.LJLIL.setImageBitmap(bitmap);
                    ((C45470Hsw) this.LJFF).LIZ();
                }
            }
            this.LJ.LJLIL.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.LJ.LJLIL.setActualImageScaleType(EnumC72807Shn.CENTER_CROP);
            this.LJ.LJLIL.setImageBitmap(bitmap);
            ((C45470Hsw) this.LJFF).LIZ();
        }
        this.LJI.release();
        return C76800UCe.LIZ;
    }
}
