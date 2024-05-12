package com.ss.android.ugc.aweme.music.v2.assem.button;

import X.C110614Vt;
import X.C214298b3;
import X.C221108m2;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8UI;
import X.C8UR;
import X.C9BE;
import X.FMX;
import X.QD3;
import X.SWI;
import X.SWM;
import X.SY4;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes13.dex */
public final class MusicAddSongButtonAssem extends DynamicAssem {
    public static final /* synthetic */ int LJLLL = 0;
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 787));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 788));
    public final C214298b3 LJLLI;
    public Music LJLLILLLL;
    public SY4 LJLLJ;

    public MusicAddSongButtonAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 789), SWM.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bui;
    }

    public final String L3() {
        return (String) this.LJLJLLL.getValue();
    }

    public final String M3() {
        return (String) this.LJLL.getValue();
    }

    public final void N3() {
        DspPlatform LJI = SWI.LIZIZ.LJI(this.LJLLILLLL);
        if (LJI == DspPlatform.UNKNOWN) {
            SY4 sy4 = this.LJLLJ;
            if (sy4 != null) {
                sy4.setText(R.string.bap);
                return;
            }
            return;
        }
        SY4 sy42 = this.LJLLJ;
        if (sy42 == null) {
            return;
        }
        sy42.setText(LJI.getTitle());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3
    public final void onReceiveMusic2DspAuthEvent(C8UI event) {
        o.LJIIIZ(event, "event");
        N3();
    }

    @QD3
    public final void onReceiveMusic2DspLinkChangeEvent(C8UR event) {
        o.LJIIIZ(event, "event");
        N3();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        assembleChildren();
        EventBus.LIZJ().LJIILJJIL(this);
        SY4 sy4 = (SY4) view;
        this.LJLLJ = sy4;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(6);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        Context context = sy4.getContext();
        o.LJIIIIZZ(context, "view.context");
        sy4.setBackground(c110614Vt.LIZ(context));
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.OGa
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new AqS178S0100000_12(this, 240), 14, null);
        DspPlatform LJI = SWI.LIZIZ.LJI(this.LJLLILLLL);
        HashMap hashMap = new HashMap();
        hashMap.put("group_id", L3());
        hashMap.put("enter_from", "single_song");
        Music music = this.LJLLILLLL;
        if (music == null || (str = music.getMid()) == null) {
            str = "";
        }
        hashMap.put("music_id", str);
        hashMap.put("music_volume", M3());
        hashMap.put("button_name", LJI.getEventName());
        hashMap.put("button_type", "null");
        FMX.LJIIL("show_tttodsp_music", hashMap);
    }
}
