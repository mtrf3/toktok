package X;

import android.content.Context;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.g0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BNa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28670BNa extends BTV<C28826BTa> {
    public final List<String> LIZIZ = C47261Igj.LJJIJ("webcast_user_level_setting_panel");

    @Override // X.BTV
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String, O] */
    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, java.util.Map<String, String> map) {
        ?? queryParameter;
        o.LJIIIZ(context, "context");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room == null || ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() != room.getOwnerUserId()) {
            android.net.Uri uri = c28826BTa.LIZ;
            if (uri != null && (queryParameter = UriProtector.getQueryParameter(uri, "entrance")) != 0 && queryParameter.length() > 0) {
                ((C32537Cpp) dataChannelGlobal.gv0(C29036BaS.class)).LIZ = queryParameter;
            }
            C73943T0h.LIZ().LIZIZ(new C28671BNb());
            ActivityC45651qj LJIILL = g0.LJIILL(((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity());
            if (LJIILL != null) {
                ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Kc0(LJIILL);
                return true;
            }
        }
        return false;
    }
}
