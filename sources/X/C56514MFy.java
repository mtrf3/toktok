package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.dsp.preload.MusicVipInfoPreload;
import kotlin.jvm.internal.o;

/* renamed from: X.MFy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56514MFy implements InterfaceC84349X8n {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Boolean LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.InterfaceC84349X8n
    public final void LIZ(X8W trigger) {
        o.LJIIIZ(trigger, "trigger");
        if (MG0.LIZJ) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(WM7.SCENE_SERVICE, this.LIZ);
        String str = this.LIZIZ;
        if (str != null) {
            bundle.putString("track_id", str);
        }
        Boolean bool = this.LIZJ;
        if (bool != null) {
            bundle.putBoolean("allow_play_full_song_in_tt", bool.booleanValue());
        }
        String str2 = this.LIZLLL;
        if (str2 != null) {
            bundle.putString("scene_context", str2);
        }
        bundle.putBoolean("power_net_preload_key_strict_mode", true);
        trigger.LIZIZ(bundle, MusicVipInfoPreload.class, new C56515MFz());
    }

    public C56514MFy(int i, String str, Boolean bool, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = bool;
        this.LIZLLL = str2;
    }
}
