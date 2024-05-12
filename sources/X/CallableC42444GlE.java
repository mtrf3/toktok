package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.Callable;

/* renamed from: X.GlE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC42444GlE<V> implements Callable {
    public final /* synthetic */ IRecordService.UICallback LJLIL;
    public final /* synthetic */ RecordConfig LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ HPU LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ Intent LJLJJLL;

    public CallableC42444GlE(IRecordService.UICallback uICallback, RecordConfig recordConfig, String str, HPU hpu, Context context, Intent intent) {
        this.LJLIL = uICallback;
        this.LJLILLLLZI = recordConfig;
        this.LJLJI = str;
        this.LJLJJI = hpu;
        this.LJLJJL = context;
        this.LJLJJLL = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        IRecordService.UICallback uICallback = this.LJLIL;
        if (uICallback != null) {
            uICallback.preSuccess();
        }
        I9T.LJFF(C44172HVg.LJI.transformMusicModel(this.LJLILLLLZI.getMusicModel()));
        MusicModel musicModel = this.LJLILLLLZI.getMusicModel();
        if (musicModel != null) {
            this.LJLJJLL.putExtra("extra_duet_music", musicModel);
        }
        if (!TextUtils.equals(this.LJLJI, "challenge")) {
            this.LJLJJI.LIZ.LJFF();
        }
        IRecordService.UICallback uICallback2 = this.LJLIL;
        if (uICallback2 == null || !uICallback2.checkIsCanceled()) {
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.LJLJJL, this.LJLJJLL);
            IRecordService.UICallback uICallback3 = this.LJLIL;
            if (uICallback3 != null) {
                uICallback3.postSuccess();
            }
        }
        return C76800UCe.LIZ;
    }
}
