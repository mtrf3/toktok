package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HTy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44138HTy implements InterfaceC44146HUg {
    public final /* synthetic */ C44125HTl LJLIL;

    public C44138HTy(C44125HTl c44125HTl) {
        this.LJLIL = c44125HTl;
    }

    @Override // X.InterfaceC44146HUg
    public final void LIZ(boolean z, int i, List<MediaModel> list, AbstractC45692HwW mediaRefreshType) {
        o.LJIIIZ(mediaRefreshType, "mediaRefreshType");
        if (list == null || list.isEmpty() || C78688UuS.LJIJJ(this.LJLIL).isFinishing() || C78688UuS.LJIJJ(this.LJLIL).isDestroyed() || this.LJLIL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        this.LJLIL.LJJLIIJ().f10().setValue(list);
    }
}
