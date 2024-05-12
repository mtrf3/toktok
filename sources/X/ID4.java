package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ID4 implements TII {
    public final /* synthetic */ C46245ICz LIZ;

    public ID4(C46245ICz c46245ICz) {
        this.LIZ = c46245ICz;
    }

    @Override // X.TII
    public final <T> TIH LIZ(InterfaceC46243ICx<T> request) {
        String str;
        MutableLiveData Za;
        StickerTagChangeData stickerTagChangeData;
        o.LJIIIZ(request, "request");
        if (request instanceof TID) {
            Effect effect = ((TID) request).LIZIZ;
            C46245ICz c46245ICz = this.LIZ;
            IAV iav = c46245ICz.LLFF;
            boolean LJJJJLL = C78866UxK.LJJJJLL(c46245ICz.LJLLLLLL, effect);
            IDH idh = this.LIZ.LJLJLJ;
            if (idh == null || (Za = idh.Za()) == null || (stickerTagChangeData = (StickerTagChangeData) Za.getValue()) == null || (str = stickerTagChangeData.getTabName()) == null) {
                str = "";
            }
            iav.LJIIIZ(effect, LJJJJLL, str, request.getPosition(), false, null);
        }
        return new TIH(false, null);
    }
}
