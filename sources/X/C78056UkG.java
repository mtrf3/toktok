package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.UkG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78056UkG implements LEA {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ LiveHostWatch LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ EnterRoomConfig LJLJJI;

    public C78056UkG(Context context, EnterRoomConfig enterRoomConfig, LiveHostWatch liveHostWatch, String str) {
        this.LJLIL = str;
        this.LJLILLLLZI = liveHostWatch;
        this.LJLJI = context;
        this.LJLJJI = enterRoomConfig;
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            if (!TextUtils.isEmpty(this.LJLIL)) {
                this.LJLILLLLZI.watchLive(this.LJLJI, this.LJLJJI, this.LJLIL);
            } else {
                this.LJLILLLLZI.watchLiveFromSchema(this.LJLJI, this.LJLJJI);
            }
        }
        C78056UkG c78056UkG = this.LJLILLLLZI.LJLILLLLZI;
        if (c78056UkG != null) {
            HG3.LJIIL();
            HG3.LJLJL.LJIILLIIL(c78056UkG);
        }
    }
}
