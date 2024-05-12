package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BWu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28924BWu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(DataChannel dataChannel) {
        BPM bpm = new BPM();
        bpm.LJFF = dataChannel;
        bpm.LIZIZ = "pm_mt_liveTryMode_livePreviewScreen_errorToast";
        bpm.LIZJ = R.string.mcf;
        bpm.LIZLLL = true;
        C30868C9o.LJII(bpm);
    }

    public static final void LIZ(Context context, DataChannel dataChannel, C2A7 c2a7) {
        if (context == null) {
            return;
        }
        C28915BWl c28915BWl = (C28915BWl) dataChannel.kv0(C28925BWv.class);
        if (c28915BWl == null) {
            LIZIZ(dataChannel);
            return;
        }
        String str = (String) dataChannel.kv0(C28926BWw.class);
        if (str == null) {
            LIZIZ(dataChannel);
            return;
        }
        C29163BcV c29163BcV = new C29163BcV();
        Boolean bool = Boolean.FALSE;
        c28915BWl.LIZ(bool, -1, bool, c29163BcV, c2a7, LiveMode.VIDEO, true, new C28923BWt(c28915BWl, c29163BcV, context, dataChannel, str));
    }
}
