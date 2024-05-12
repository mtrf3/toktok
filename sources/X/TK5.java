package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TK5 {
    public final I9W LIZ;
    public final C62822Ol8 LIZIZ;

    public final LiveData<C74413TIj<PanelInfoModel>> LIZ() {
        return C74310TEk.LIZIZ(this.LIZ.LLLLL().LJJJJLL().LIZ(), false, 14);
    }

    public TK5(I9W stickerApi) {
        o.LJIIIZ(stickerApi, "stickerApi");
        this.LIZ = stickerApi;
        this.LIZIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1038));
    }
}
