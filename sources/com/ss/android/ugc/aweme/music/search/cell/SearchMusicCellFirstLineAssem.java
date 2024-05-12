package com.ss.android.ugc.aweme.music.search.cell;

import X.C240719cZ;
import X.C47704Ins;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFirstLineAssem;
import com.ss.android.ugc.aweme.music.search.SearchMusicArg;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchMusicCellFirstLineAssem extends DefaultFirstLineAssem {
    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFirstLineAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6i;
    }

    public SearchMusicCellFirstLineAssem() {
        new LinkedHashMap();
        checkSupervisorPrepared();
        C47704Ins.LIZJ(this, SearchMusicArg.class, null);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFirstLineAssem, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(C240719cZ c240719cZ) {
        F0(c240719cZ);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultFirstLineAssem
    /* renamed from: m4 */
    public final void F0(C240719cZ item) {
        o.LJIIIZ(item, "item");
        super.F0(item);
    }
}
