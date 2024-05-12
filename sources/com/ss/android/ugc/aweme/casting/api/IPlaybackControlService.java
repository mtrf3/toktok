package com.ss.android.ugc.aweme.casting.api;

import X.C3C8;
import X.InterfaceC65350Pko;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;

/* loaded from: classes4.dex */
public interface IPlaybackControlService {
    void addPlayBackControls(ViewGroup viewGroup);

    InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> getCastingAssemClass();

    void removePlayBackControls(ViewGroup viewGroup);

    void updatePlaybackControlsForMainTabs(Fragment fragment, boolean z);
}
