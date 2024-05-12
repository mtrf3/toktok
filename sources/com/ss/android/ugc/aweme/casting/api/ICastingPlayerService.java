package com.ss.android.ugc.aweme.casting.api;

import X.C34N;
import X.C3C8;
import X.C8W0;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes2.dex */
public interface ICastingPlayerService {
    void addSeekListener(C34N c34n);

    void appendPlaylist(List<? extends Aweme> list);

    boolean blockByCasting(Aweme aweme);

    ICastingAbility getCastingAbility(InterfaceC55235Lm3 interfaceC55235Lm3);

    InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> getCastingCellComponent();

    InterfaceC65350Pko<? extends C8W0> getCastingPanelComponent();

    boolean isCurrentAwemeCasting(String str);

    void playAweme(String str);

    void seekPosition(long j);
}
