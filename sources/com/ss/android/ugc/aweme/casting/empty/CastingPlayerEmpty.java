package com.ss.android.ugc.aweme.casting.empty;

import X.C34N;
import X.C3C8;
import X.C8W0;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.casting.api.ICastingAbility;
import com.ss.android.ugc.aweme.casting.api.ICastingPlayerService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CastingPlayerEmpty implements ICastingPlayerService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
    public void addSeekListener(C34N listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
    public void appendPlaylist(List<? extends Aweme> list) {
        o.LJIIIZ(list, "list");
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
    public boolean blockByCasting(Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
    public ICastingAbility getCastingAbility(InterfaceC55235Lm3 interfaceC55235Lm3) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
    public InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> getCastingCellComponent() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
    public InterfaceC65350Pko<? extends C8W0> getCastingPanelComponent() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
    public boolean isCurrentAwemeCasting(String aid) {
        o.LJIIIZ(aid, "aid");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
    public void playAweme(String aid) {
        o.LJIIIZ(aid, "aid");
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
    public void seekPosition(long j) {
    }
}
