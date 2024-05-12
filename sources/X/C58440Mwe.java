package X;

import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.music.v2.assem.button.MusicAddSongButtonAssem;
import kotlin.jvm.internal.AqS25S0010000_10;

/* renamed from: X.Mwe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58440Mwe implements InterfaceC58439Mwd {
    public final InterfaceC65784Pro<Boolean> LIZ;

    @Override // X.InterfaceC58439Mwd
    public final String tag() {
        return "mdp_music_button_add_song_to_dsp";
    }

    @Override // X.InterfaceC58439Mwd
    public final InterfaceC65350Pko<? extends DynamicAssem> type() {
        return C65352Pkq.LIZ(MusicAddSongButtonAssem.class);
    }

    @Override // X.InterfaceC58439Mwd
    public final boolean trigger() {
        return this.LIZ.invoke().booleanValue();
    }

    public C58440Mwe(AqS25S0010000_10 aqS25S0010000_10) {
        this.LIZ = aqS25S0010000_10;
    }
}
