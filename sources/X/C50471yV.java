package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.1yV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50471yV extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C32131Nx LJLILLLLZI;
    public final /* synthetic */ LiveEffect LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ C32121Nw LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50471yV(int i, C32131Nx c32131Nx, LiveEffect liveEffect, boolean z, boolean z2, C32121Nw c32121Nw) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = c32131Nx;
        this.LJLJI = liveEffect;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = c32121Nw;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View it) {
        o.LJIIIZ(it, "it");
        int i = this.LJLIL;
        if (i >= 0 && i < ((ArrayList) this.LJLILLLLZI.LJLJI).size()) {
            C30522ByQ c30522ByQ = LiveEffect.Companion;
            LiveEffect liveEffect = this.LJLILLLLZI.LJLJJLL;
            if (liveEffect != null) {
                LiveEffect liveEffect2 = this.LJLJI;
                c30522ByQ.getClass();
                if (!C30522ByQ.LIZ(liveEffect, liveEffect2)) {
                    C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLLLIILLL;
                    Boolean LIZJ = c48459J0d.LIZJ();
                    o.LJIIIIZZ(LIZJ, "LIVE_VOICE_EFFECT_TIP_TOAST_SHOW.value");
                    if (LIZJ.booleanValue() && !this.LJLJJI) {
                        c48459J0d.LIZ(Boolean.FALSE);
                        C30868C9o.LIZJ(R.string.ow6);
                    }
                    if (!this.LJLJJL) {
                        this.LJLILLLLZI.LJLJJI.put(Long.valueOf(this.LJLJI.effectId), Integer.valueOf(this.LJLIL));
                        C29306Beo.LJI(this.LJLJJLL.LJLJI);
                        C29306Beo.LJJLJLI(this.LJLJJLL.LJLJJI);
                        C32141Ny.LJ.put(Long.valueOf(this.LJLJI.effectId), Long.valueOf(SystemClock.uptimeMillis()));
                        this.LJLILLLLZI.LJLILLLLZI.hv0(this.LJLJI, null);
                    } else {
                        C32141Ny.LJFF(this.LJLJI, false);
                    }
                    C32131Nx c32131Nx = this.LJLILLLLZI;
                    LiveEffect liveEffect3 = c32131Nx.LJLJJLL;
                    if (liveEffect3 != null) {
                        c32131Nx.LJLJJL = liveEffect3;
                    }
                    LiveEffect liveEffect4 = this.LJLJI;
                    c32131Nx.LJLJJLL = liveEffect4;
                    C31014CFe.LJIJJLI(String.valueOf(liveEffect4.effectId));
                    C31014CFe.LJIL(this.LJLJI.getResourceId());
                    C32131Nx c32131Nx2 = this.LJLILLLLZI;
                    DataChannel dataChannel = c32131Nx2.LJLIL;
                    LiveEffect liveEffect5 = this.LJLJI;
                    LiveEffect liveEffect6 = c32131Nx2.LJLJJL;
                    o.LJIIIZ(liveEffect5, "liveEffect");
                    java.util.Map<Long, String> map = AnonymousClass139.LIZ;
                    Long valueOf = Long.valueOf(liveEffect5.effectId);
                    String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
                    o.LJIIIIZZ(broadcastScene, "getService(IBroadcastSer…lass.java).broadcastScene");
                    map.put(valueOf, broadcastScene);
                    String broadcastScene2 = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
                    o.LJIIIIZZ(broadcastScene2, "getService(IBroadcastSer…lass.java).broadcastScene");
                    AnonymousClass139.LIZIZ = broadcastScene2;
                    BZI LIZ = C28787BRn.LIZ("livesdk_live_take_voice_select");
                    LIZ.LJIILLIIL(dataChannel);
                    LIZ.LJIJJ(liveEffect5.nameForEnglish, "effect_name");
                    LIZ.LJIJJ(Long.valueOf(liveEffect5.effectId), "effect_id");
                    LIZ.LJIJJ(liveEffect5.getResourceId(), "resource_id");
                    LIZ.LJIJJ(AnonymousClass139.LIZIZ, "select_scene");
                    LIZ.LJJIIJZLJL();
                    C32101Nu.LIZ(4L);
                    if (liveEffect6 != null) {
                        C32111Nv c32111Nv = (C32111Nv) ((LinkedHashMap) C32141Ny.LJFF).get(Long.valueOf(liveEffect6.effectId));
                        if (c32111Nv != null && !C32141Ny.LIZJ(liveEffect6)) {
                            C32101Nu.LJIIIZ(liveEffect6, Long.valueOf(c32111Nv.LJLIL), c32111Nv.LJLILLLLZI);
                        }
                    }
                    if (!C32141Ny.LIZJ(liveEffect5)) {
                        C32101Nu.LJIILLIIL(liveEffect5, null, AnonymousClass139.LIZIZ);
                    }
                    this.LJLILLLLZI.notifyDataSetChanged();
                }
            } else {
                o.LJIJI("selectSoundEffect");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
