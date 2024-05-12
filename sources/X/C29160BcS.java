package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BcS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29160BcS implements InterfaceC28916BWm {
    public final LiveMode LIZ = LiveMode.VIDEO;
    public final InterfaceC28918BWo[] LIZIZ;

    @Override // X.InterfaceC28916BWm
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC28916BWm
    public final void LJI(String str, String str2) {
    }

    public C29160BcS() {
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale().getLanguage();
        this.LIZIZ = new InterfaceC28918BWo[]{new C28914BWk(), new C29353BfZ(), new C28562BIw(), new C29120Bbo(), new C29118Bbm(), new C29207BdD(), new C28525BHl(), new C28523BHj(), new C28521BHh(), new C30546Byo(), new C29183Bcp()};
    }

    @Override // X.InterfaceC28916BWm
    public final InterfaceC28918BWo[] LJFF() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC28916BWm
    public final void LIZJ(Fragment fragment) {
        DataChannel LJIILIIL;
        Context context;
        String str;
        if (fragment == null || (LJIILIIL = C51029K0z.LJIILIIL(fragment)) == null || (context = fragment.getContext()) == null) {
            return;
        }
        Intent createStartBroadcastIntent = C7N.LJIIJJI().createStartBroadcastIntent(C29306Beo.LIZIZ(context), C29152BcK.LIZ(this.LIZ));
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) LJIILIIL.kv0(RoomCreateInfoChannel.class);
        if (roomCreateInfo != null) {
            str = roomCreateInfo.mAdditionalPrompt;
        } else {
            str = null;
        }
        createStartBroadcastIntent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
        createStartBroadcastIntent.putExtra("request_page", (String) LJIILIIL.kv0(C28990BZi.class));
        C16880lQ.LIZJ(context, createStartBroadcastIntent);
    }

    @Override // X.InterfaceC28916BWm
    public final boolean LJII(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return false;
    }

    @Override // X.InterfaceC28916BWm
    public final void LIZLLL(int i, DataChannel dataChannel) {
        C29697Bl7.LJFF(i, this.LIZ);
        ((C29165BcX) C7N.LJ().startLiveManager()).fg(i, dataChannel);
    }

    @Override // X.InterfaceC28916BWm
    public final boolean LJ(C29180Bcm c29180Bcm, BUT but) {
        Boolean bool;
        Boolean bool2 = null;
        if (c29180Bcm != null) {
            bool = Boolean.valueOf(c29180Bcm.LJLIL);
        } else {
            bool = null;
        }
        if (C29306Beo.LJIL(bool)) {
            if (but != null) {
                bool2 = Boolean.valueOf(but.LJLIL);
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0212  */
    @Override // X.InterfaceC28916BWm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C29164BcW LIZ(android.content.Context r9, com.bytedance.ies.sdk.datachannel.DataChannel r10, X.HandlerC28345BAn r11) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29160BcS.LIZ(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, X.BAn):X.BcW");
    }
}
