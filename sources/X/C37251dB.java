package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1dB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37251dB implements C0WP<LiveEffect> {
    public final boolean LJLIL;

    public C37251dB(boolean z) {
        this.LJLIL = z;
    }

    public final void LIZ(final LiveEffect liveEffect) {
        C1KJ c1kj = C1KJ.LIZ;
        if (!c1kj.LIZ(liveEffect) && !C78880UxY.LJJJJLI(liveEffect) && !liveEffect.isLocal) {
            final long currentTimeMillis = System.currentTimeMillis();
            c1kj.LIZLLL(liveEffect.getEffect(), new C0WN() { // from class: X.1dA
                @Override // X.C0WN
                public final void LJFF(int i, Effect effect) {
                }

                @Override // X.C0WN
                public final void onStart(Effect effect) {
                }

                @Override // X.C0WN
                public final void LJI(Effect effect) {
                    C37251dB.this.LIZIZ(currentTimeMillis, liveEffect, false);
                }

                @Override // X.C0WN
                public final void onSuccess(Effect effect) {
                    C37251dB.this.LIZIZ(currentTimeMillis, liveEffect, true);
                    C12890ez.LIZ().LJIILIIL();
                }
            });
        }
    }

    @Override // X.C0WP
    public final List<C1QC> LJIIZILJ(List<C1QC> effectPanelList) {
        List<? extends LiveEffect> list;
        o.LJIIIZ(effectPanelList, "effectPanelList");
        C0TX.LIZ.LIZJ("SmallItemBeauty");
        C0TX.LIZLLL("performing small beauty's process.");
        Iterator<Object> it = ORZ.LJLIIIL(effectPanelList).iterator();
        while (it.hasNext()) {
            Iterator<Object> it2 = ((C1QC) it.next()).LJLILLLLZI.iterator();
            while (it2.hasNext()) {
                LiveEffect liveEffect = (LiveEffect) it2.next();
                LIZ(liveEffect);
                if (C78880UxY.LJJJJLI(liveEffect) && (list = liveEffect.subStickers) != null) {
                    Iterator<? extends LiveEffect> it3 = list.iterator();
                    while (it3.hasNext()) {
                        LIZ(it3.next());
                    }
                }
            }
        }
        return effectPanelList;
    }

    public final void LIZIZ(long j, LiveEffect liveEffect, boolean z) {
        String str = "done";
        String str2 = "";
        if (this.LJLIL) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_beauty_resource_download");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis() - j), "duration");
            LIZ.LJIJJ(Long.valueOf(liveEffect.effectId), "effect_id");
            LIZ.LJIJJ(liveEffect.getResourceId(), "resource_id");
            String str3 = liveEffect.parentResName;
            if (str3 == null) {
                str3 = liveEffect.getName();
            }
            LIZ.LJIJJ(str3, "beauty_type_name");
            if (liveEffect.isSubItem()) {
                str2 = liveEffect.getName();
            }
            LIZ.LJIJJ(str2, "beauty_type_name_tier2");
            if (!z) {
                str = "failed";
            }
            LIZ.LJIJJ(str, "status");
            LIZ.LJJIIJZLJL();
            return;
        }
        o.LJIIIZ(liveEffect, "liveEffect");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_beauty_resource_download");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(System.currentTimeMillis() - j), "duration");
        LIZ2.LJIJJ(Long.valueOf(liveEffect.effectId), "effect_id");
        LIZ2.LJIJJ(liveEffect.getResourceId(), "resource_id");
        String str4 = liveEffect.parentResName;
        if (str4 == null) {
            str4 = liveEffect.getName();
        }
        LIZ2.LJIJJ(str4, "beauty_type_name");
        if (liveEffect.isSubItem()) {
            str2 = liveEffect.getName();
        }
        LIZ2.LJIJJ(str2, "beauty_type_name_tier2");
        if (!z) {
            str = "failed";
        }
        LIZ2.LJIJJ(str, "status");
        LIZ2.LJJIFFI(C42151l5.LJIIL);
        LIZ2.LJJIIJZLJL();
    }
}
