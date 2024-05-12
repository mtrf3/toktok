package X;

import android.os.Binder;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common.MediaSessionService;
import kotlin.jvm.internal.o;

/* renamed from: X.Zp8, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class BinderC91098Zp8 extends Binder {
    public final MediaSessionService LJLIL;
    public boolean LJLILLLLZI;

    public BinderC91098Zp8(MediaSessionService mService) {
        o.LJIIIZ(mService, "mService");
        this.LJLIL = mService;
        this.LJLILLLLZI = true;
    }
}
