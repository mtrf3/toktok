package com.ss.android.ugc.aweme.music.v2.assem;

import X.C212428Vi;
import X.C214298b3;
import X.C220558l9;
import X.C50420Jqa;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7Y0;
import X.C9BE;
import X.QD3;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageScrollAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class MusicDetailListAssem extends DynamicAssem {
    public final C214298b3 LJLJLLL;
    public MusicDetailAwemeListFragment LJLL;

    public MusicDetailListAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 544), C7Y0.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void H3() {
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void assembleChildren() {
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(R.id.ftq);
        E3(frameLayout);
        super.onCreateView();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3
    public final void onReceiveVideoEvent(C50420Jqa event) {
        Aweme aweme;
        Fragment LIZLLL;
        PageScrollAbility pageScrollAbility;
        o.LJIIIZ(event, "event");
        Object obj = event.LJLILLLLZI;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null && event.LJLIL == 21 && o.LJ(((MusicDetailViewModel) this.LJLJLLL.getValue()).LJLILLLLZI, aweme.getMusic().getMid()) && (LIZLLL = C212428Vi.LIZLLL(this)) != null && (pageScrollAbility = (PageScrollAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), PageScrollAbility.class, null)) != null) {
            pageScrollAbility.jk0(5000);
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        Context context = getContext();
        if (context == null) {
            return;
        }
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.7Xz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new C220558l9(this, view, context), 14, null);
    }
}
