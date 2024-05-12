package X;

import Y.AObserverS75S0200000_12;
import Y.AObserverS80S0100000_12;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKA {
    public final I9W LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public final C62822Ol8 LIZLLL;

    public final TK6 LIZIZ() {
        return (TK6) this.LIZLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ() {
        MutableLiveData Za;
        String str;
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        AObserverS80S0100000_12 aObserverS80S0100000_12 = new AObserverS80S0100000_12(this, 59);
        IDH LLLF = this.LIZ.LLLF();
        if (LLLF != null && (Za = LLLF.Za()) != null) {
            StickerTagChangeData stickerTagChangeData = (StickerTagChangeData) Za.getValue();
            if (stickerTagChangeData == null || (str = stickerTagChangeData.getTabKey()) == null) {
                str = "";
            }
            this.LIZJ = str;
            Za.observe(this.LIZ.getLifecycleOwner(), new AObserverS75S0200000_12(this, aObserverS80S0100000_12, 25));
        }
    }

    public final boolean LIZLLL() {
        return o.LJ(this.LIZ.sF().LIZJ(), Boolean.TRUE);
    }

    public TKA(I9W stickerApi) {
        o.LJIIIZ(stickerApi, "stickerApi");
        this.LIZ = stickerApi;
        this.LIZJ = "";
        this.LIZLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1030));
    }

    public final LiveData<C74413TIj<CategoryEffectModel>> LIZ(String str, boolean z) {
        return C74310TEk.LIZ(this.LIZ.LLLLL().LJJJJLL().LIZ(), str, z, 12);
    }
}
