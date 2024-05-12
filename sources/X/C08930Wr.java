package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.IDqS3S0010000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Wr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08930Wr {
    public static boolean LIZ;

    public static void LIZJ(DataChannel dataChannel, boolean z) {
        String str;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_sound_panel_show");
        LIZ2.LJIILLIIL(dataChannel);
        if (z) {
            str = "shortcut";
        } else {
            str = "normal";
        }
        LIZ2.LJIJJ(str, "panel_type");
        LIZ2.LJJI(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LIZ)) ? 1 : 0), "is_live_take_default", new IDqS3S0010000(z, 1));
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(DataChannel dataChannel, EnumC08910Wp buttonType, long j) {
        o.LJIIIZ(buttonType, "buttonType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_sound_position_button_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(buttonType.getStr(), "button_type");
        LIZ2.LJJI(Long.valueOf(j), "effect_id", new IDqS420S0100000(buttonType, 95));
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(long j, DataChannel dataChannel, boolean z) {
        String str;
        if (j == 0) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_sound_panel_duration");
        LIZ2.LJIILLIIL(dataChannel);
        if (z) {
            str = "shortcut";
        } else {
            str = "normal";
        }
        LIZ2.LJIJJ(str, "panel_type");
        LIZ2.LJIJJ(Long.valueOf((System.currentTimeMillis() - j) / 1000), "duration");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZLLL(DataChannel dataChannel, TreeMap visibleItems, List effectList, EnumC08920Wq panelType) {
        long j;
        o.LJIIIZ(visibleItems, "visibleItems");
        o.LJIIIZ(effectList, "effectList");
        o.LJIIIZ(panelType, "panelType");
        if (visibleItems.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : visibleItems.entrySet()) {
            arrayList.add(Integer.valueOf(((C75295Tgp) entry.getValue()).LIZ + 1));
            SoundEffect soundEffect = (SoundEffect) ORZ.LJLLLLLL(((C75295Tgp) entry.getValue()).LIZ, effectList);
            if (soundEffect != null) {
                j = soundEffect.id;
            } else {
                j = 0;
            }
            arrayList2.add(Long.valueOf(j));
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_sound_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(arrayList.toString(), "sound_position");
        LIZ2.LJIJJ(arrayList2.toString(), "effect_id_set");
        LIZ2.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
        LIZ2.LJIJJ(panelType.getStr(), "panel_type");
        LIZ2.LJJIIJZLJL();
    }
}
