package X;

import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.IsHandleEffectChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bxa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30470Bxa implements InterfaceC30494Bxy {
    public final /* synthetic */ C28984BZc LIZ;

    @Override // X.InterfaceC30494Bxy
    public final void LIZLLL(LiveEffect liveEffect) {
        o.LJIIIZ(liveEffect, "liveEffect");
    }

    @Override // X.InterfaceC30494Bxy
    public final int LJI(String str, String str2) {
        return -1;
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJII(String str, String str2) {
    }

    @Override // X.InterfaceC30494Bxy
    public final void onDestroy() {
        C0TW c0tw;
        DataChannel dataChannel = this.LIZ.LJLILLLLZI;
        if (dataChannel != null && (c0tw = (C0TW) dataChannel.kv0(C54562Ce.class)) != null) {
            c0tw.onDestroy();
        }
    }

    public C30470Bxa(C28984BZc c28984BZc) {
        this.LIZ = c28984BZc;
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZ(String panel) {
        C0TW c0tw;
        o.LJIIIZ(panel, "panel");
        DataChannel dataChannel = this.LIZ.LJLILLLLZI;
        if (dataChannel != null && (c0tw = (C0TW) dataChannel.kv0(C54562Ce.class)) != null) {
            c0tw.LIZ(panel);
        }
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZIZ(LiveEffect liveEffect) {
        boolean z;
        C0TW c0tw;
        o.LJIIIZ(liveEffect, "liveEffect");
        DataChannel dataChannel = this.LIZ.LJLILLLLZI;
        if (dataChannel != null && (c0tw = (C0TW) dataChannel.kv0(C54562Ce.class)) != null) {
            if (c0tw.LJFF(liveEffect)) {
                c0tw.LIZIZ(liveEffect);
            } else {
                c0tw.LIZLLL();
            }
        }
        DataChannel dataChannel2 = this.LIZ.LJLILLLLZI;
        if (dataChannel2 != null) {
            List<String> list = liveEffect.types;
            if (list != null && (!list.isEmpty())) {
                z = list.contains("TouchGes");
            } else {
                z = false;
            }
            dataChannel2.rv0(IsHandleEffectChannel.class, Boolean.valueOf(z));
        }
        C31014CFe.LJFF(String.valueOf(liveEffect.effectId));
        C31014CFe.LJI(liveEffect.getResourceId());
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZJ(String panel) {
        C0TW c0tw;
        o.LJIIIZ(panel, "panel");
        DataChannel dataChannel = this.LIZ.LJLILLLLZI;
        if (dataChannel != null && (c0tw = (C0TW) dataChannel.kv0(C54562Ce.class)) != null) {
            c0tw.LJ(null, panel);
        }
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJ(ViewGroup parentView) {
        C0TW c0tw;
        o.LJIIIZ(parentView, "parentView");
        DataChannel dataChannel = this.LIZ.LJLILLLLZI;
        if (dataChannel != null && (c0tw = (C0TW) dataChannel.kv0(C54562Ce.class)) != null) {
            c0tw.LJI(parentView, false);
        }
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJFF(LiveEffect liveEffect) {
        C0TW c0tw;
        o.LJIIIZ(liveEffect, "liveEffect");
        DataChannel dataChannel = this.LIZ.LJLILLLLZI;
        if (dataChannel != null && (c0tw = (C0TW) dataChannel.kv0(C54562Ce.class)) != null && c0tw.LJFF(liveEffect)) {
            c0tw.LIZLLL();
        }
        DataChannel dataChannel2 = this.LIZ.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.rv0(IsHandleEffectChannel.class, Boolean.FALSE);
        }
        C31014CFe.LJFF("");
        C31014CFe.LJI("");
    }
}
