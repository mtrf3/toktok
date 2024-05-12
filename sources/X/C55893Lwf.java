package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* renamed from: X.Lwf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55893Lwf implements InterfaceC78482Ur8 {
    public final /* synthetic */ android.net.Uri LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ EnterRoomConfig LIZJ;

    public C55893Lwf(android.net.Uri uri, Activity activity, EnterRoomConfig enterRoomConfig) {
        this.LIZ = uri;
        this.LIZIZ = activity;
        this.LIZJ = enterRoomConfig;
    }

    @Override // X.InterfaceC78482Ur8
    public final void LIZ() {
        String queryParameter = UriProtector.getQueryParameter(this.LIZ, "enter_square_source");
        if (queryParameter != null) {
            Activity activity = this.LIZIZ;
            EnterRoomConfig enterRoomConfig = this.LIZJ;
            LiveOuterService.LJJJLL().LJIILL();
            C78461Uqn.LIZIZ(activity, enterRoomConfig, queryParameter);
        }
    }
}
