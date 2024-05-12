package com.ss.android.ugc.aweme.music.v2.assem.button;

import X.C65352Pkq;
import X.InterfaceC58439Mwd;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MusicPlayFullSongButtonPriority implements InterfaceC58439Mwd {
    public final InterfaceC65784Pro<Boolean> triggerCondition;

    @Override // X.InterfaceC58439Mwd
    public String tag() {
        return "mdp_music_button_play_full_song";
    }

    @Override // X.InterfaceC58439Mwd
    public InterfaceC65350Pko<? extends DynamicAssem> type() {
        return C65352Pkq.LIZ(MusicPlayFullSongButtonAssem.class);
    }

    @Override // X.InterfaceC58439Mwd
    public boolean trigger() {
        return this.triggerCondition.invoke().booleanValue();
    }

    public MusicPlayFullSongButtonPriority(InterfaceC65784Pro<Boolean> triggerCondition) {
        o.LJIIIZ(triggerCondition, "triggerCondition");
        this.triggerCondition = triggerCondition;
    }
}
