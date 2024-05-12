package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HZR implements IFoundationAVService.IFetchResourcesListener {
    public final /* synthetic */ HZQ LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onFailed(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onSuccess(String[] requirements) {
        o.LJIIIZ(requirements, "requirements");
        Object value = this.LJLIL.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        ((Keva) value).storeLong("sticker_point_last_download", this.LJLILLLLZI);
    }

    public HZR(HZQ hzq, long j) {
        this.LJLIL = hzq;
        this.LJLILLLLZI = j;
    }
}
