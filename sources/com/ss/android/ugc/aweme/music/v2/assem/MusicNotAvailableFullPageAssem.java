package com.ss.android.ugc.aweme.music.v2.assem;

import X.C186467Tm;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.TBT;
import X.WM7;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MusicNotAvailableFullPageAssem extends DetailPageStatusViewAssem {
    public static final /* synthetic */ int LJLLLL = 0;
    public final C214298b3 LJLLL;

    public MusicNotAvailableFullPageAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 547), C186467Tm.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void assembleChildren() {
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber
    public final void pN() {
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLL.getValue(), new TBT() { // from class: X.7Tn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new AqS169S0100000_3(this, 275), 14, null);
    }

    public static final /* synthetic */ void L3(MusicNotAvailableFullPageAssem musicNotAvailableFullPageAssem) {
        super.pN();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        getConfig().LJ.put(WM7.SCENE_SERVICE, "music_not_available");
        super.onViewCreated(view);
    }
}
