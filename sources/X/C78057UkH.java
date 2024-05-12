package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;

/* renamed from: X.UkH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78057UkH implements R47 {
    public final /* synthetic */ LiveHostWatch LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ EnterRoomConfig LIZJ;

    public C78057UkH(Context context, EnterRoomConfig enterRoomConfig, LiveHostWatch liveHostWatch) {
        this.LIZ = liveHostWatch;
        this.LIZIZ = context;
        this.LIZJ = enterRoomConfig;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i2 == 1) {
            this.LIZ.watchLiveFromSchema(this.LIZIZ, this.LIZJ);
        }
    }
}
