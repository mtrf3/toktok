package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS7S0002000_7;

/* loaded from: classes8.dex */
public final class GS7 implements InterfaceC42180Ggy {
    public final /* synthetic */ GS5 LIZ;

    @Override // X.InterfaceC42180Ggy
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC42180Ggy
    public final void LIZ() {
        GS5.LIZJ(this.LIZ, "long_press_picture", false, null, 6);
    }

    public GS7(GS5 gs5) {
        this.LIZ = gs5;
    }

    @Override // X.InterfaceC42180Ggy
    public final void LIZJ(int i, int i2) {
        GS5 gs5 = this.LIZ;
        ImageAlbumData imageAlbumData = gs5.LIZ.getImageAlbumData();
        if (imageAlbumData != null) {
            Object obj = ListProtector.get(imageAlbumData.getImageList(), gs5.LIZ.getCoverPublishModel().getImageCurrentIndex());
            List<SingleImageData> LLJILJILJ = ORZ.LLJILJILJ(imageAlbumData.getImageList());
            ListProtector.add(LLJILJILJ, i2, ListProtector.remove(LLJILJILJ, i));
            imageAlbumData.setImageList(LLJILJILJ);
            gs5.LIZ.getCoverPublishModel().setImageCurrentIndex(((ArrayList) LLJILJILJ).indexOf(obj));
        }
        GS5.LIZJ(this.LIZ, "move_picture", false, new AqS7S0002000_7(i2, i, 2), 2);
    }
}
