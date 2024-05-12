package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HU1 implements InterfaceC44146HUg {
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, List<MediaModel>, C76800UCe> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public HU1(InterfaceC88471Ynr<? super Boolean, ? super List<MediaModel>, C76800UCe> interfaceC88471Ynr) {
        this.LJLIL = interfaceC88471Ynr;
    }

    @Override // X.InterfaceC44146HUg
    public final void LIZ(boolean z, int i, List<MediaModel> list, AbstractC45692HwW mediaRefreshType) {
        o.LJIIIZ(mediaRefreshType, "mediaRefreshType");
        this.LJLIL.invoke(Boolean.valueOf(z), list);
    }
}
