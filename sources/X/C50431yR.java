package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.1yR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50431yR extends AbstractC65781Prl implements InterfaceC88472Yns<C19680pw, C76800UCe> {
    public C50431yR(DataChannel dataChannel) {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C19680pw c19680pw) {
        C08870Wl c08870Wl;
        boolean z;
        int i;
        String str;
        C19680pw it = c19680pw;
        o.LJIIIZ(it, "it");
        C08870Wl c08870Wl2 = C32041No.LJFF;
        if (c08870Wl2 == null || it.LIZ.effectId != c08870Wl2.LIZ) {
            if (it.LIZ.getEffect() != null) {
                LiveEffect liveEffect = it.LIZ;
                long j = liveEffect.effectId;
                String resourceId = liveEffect.getResourceId();
                String name = it.LIZ.getName();
                boolean z2 = it.LIZ.isVideoUsedSticker;
                String str2 = it.LIZJ;
                String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
                C30496By0 c30496By0 = it.LIZ.logParams;
                boolean z3 = c30496By0.LIZ;
                boolean z4 = c30496By0.LIZIZ;
                String str3 = it.LIZIZ;
                o.LJIIIIZZ(str3, "it.panel");
                LiveEffect liveEffect2 = it.LIZ;
                String str4 = liveEffect2.parentEffectId;
                String str5 = liveEffect2.parentResName;
                String str6 = liveEffect2.parentResId;
                boolean z5 = it.LIZLLL;
                long LIZ = C30725C4b.LIZ();
                Effect effect = it.LIZ.getEffect();
                if (effect != null && (C0TZ.LIZ(effect.getExtra(), "is_avatar", false) || C0TZ.LIZ(effect.getSdkExtra(), "is_avatar", false))) {
                    z = true;
                } else {
                    z = false;
                }
                Effect effect2 = it.LIZ.getEffect();
                if (effect2 != null) {
                    i = effect2.getSource();
                } else {
                    i = 0;
                }
                Effect effect3 = it.LIZ.getEffect();
                if (effect3 != null) {
                    str = effect3.getDesignerId();
                } else {
                    str = null;
                }
                C30496By0 c30496By02 = it.LIZ.logParams;
                c08870Wl = new C08870Wl(j, resourceId, name, z2, str2, broadcastScene, z3, z4, str3, str4, str5, str6, null, null, z5, LIZ, false, null, z, 0L, i, str, c30496By02.LIZJ, c30496By02.LIZLLL);
            } else {
                c08870Wl = null;
            }
            C32041No.LJI = c08870Wl;
            C32041No.LJIL();
        }
        C08870Wl c08870Wl3 = C32041No.LJFF;
        if (c08870Wl3 == null || it.LIZ.effectId != c08870Wl3.LIZ) {
            C32041No.LJFF = C32041No.LJI;
            C32041No.LJI = null;
        }
        return C76800UCe.LIZ;
    }
}
