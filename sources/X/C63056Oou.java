package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Oou, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63056Oou implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ Activity LIZ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
    }

    public C63056Oou(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        Activity activity = this.LIZ;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("creation_id", XVF.LJ);
        bundle2.putString("shoot_way", XVF.LJFF);
        String str = XVF.LIZ;
        o.LJIIIIZZ(str, "getPreviousPage()");
        if (s.LJJJLZIJ(str, "shoot", false)) {
            str = "shoot_page_upload_song";
        } else if (s.LJJJLZIJ(str, "edit", false)) {
            str = "edit_page_upload_song";
        }
        bundle2.putString("enter_from", str);
        bundle2.putLong("start_time", System.currentTimeMillis());
        bundle.putBundle("extra_log_info_map", bundle2);
        if (C63057Oov.LIZ()) {
            bundle.putBoolean("extra_show_const_theme", true);
        }
        LIZ.startAlbumForExtractMusic(activity, bundle);
    }
}
