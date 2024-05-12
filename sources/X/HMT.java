package X;

import Y.ACallableS110S0100000_7;
import android.content.Context;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HMT implements HMV {
    public final Context LIZ;
    public boolean LIZIZ;

    @Override // X.HMV
    public final void setEnterFrom(String str) {
    }

    public HMT(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = true;
    }

    @Override // X.HMV
    public final void LIZ(MediaModel mediaModel, boolean z, long j, long j2, boolean z2, boolean z3, InterfaceC88472Yns<? super C43933HMb, C76800UCe> onSuccess, InterfaceC88472Yns<? super C43933HMb, C76800UCe> onError) {
        ProgressDialogC164766dM progressDialogC164766dM;
        o.LJIIIZ(mediaModel, "mediaModel");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onError, "onError");
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LIZIZ) {
            C42303Gix.LIZ(1018, GGO.SHOW, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
            Context context = this.LIZ;
            progressDialogC164766dM = ProgressDialogC164766dM.LIZLLL(context, context.getString(R.string.pc6));
        } else {
            progressDialogC164766dM = null;
        }
        C10K.LIZJ(new ACallableS110S0100000_7(mediaModel, 2)).LJ(new HMR(mediaModel, progressDialogC164766dM, this, onSuccess, currentTimeMillis, onError), C10K.LJIIIIZZ, null);
    }
}
