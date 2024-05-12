package com.ss.android.ugc.aweme.commercialize.mission.music;

import X.AbstractC44290HZu;
import X.C16880lQ;
import X.C44289HZt;
import X.XWG;
import Y.ACListenerS27S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MissionChooseMusicViewModel extends ViewModel implements XWG {
    public Mission LJLIL;
    public final MutableLiveData<AbstractC44290HZu> LJLILLLLZI = new MutableLiveData<>();

    @Override // X.XWG
    public final /* bridge */ /* synthetic */ MutableLiveData getEvent() {
        return this.LJLILLLLZI;
    }

    @Override // X.XWG
    public final void HX(Mission mission) {
        o.LJIIIZ(mission, "mission");
        this.LJLIL = mission;
    }

    @Override // X.XWG
    public final void Jn(MusicModel musicModel) {
        String str;
        Mission mission = this.LJLIL;
        if (mission != null && mission.getMissionId() != null) {
            Mission mission2 = this.LJLIL;
            String str2 = null;
            if (mission2 != null && mission2.getMusicId() != null) {
                Mission mission3 = this.LJLIL;
                if (mission3 != null) {
                    str = mission3.getMusicId();
                } else {
                    str = null;
                }
                if (musicModel != null) {
                    str2 = musicModel.getMusicId();
                }
                if (o.LJ(str, str2)) {
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS43S0100000_7(this, 14), 300L);
                }
            }
        }
    }

    @Override // X.XWG
    public final void Y10(FrameLayout rootView, LayoutInflater inflater) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(inflater, "inflater");
        Mission mission = this.LJLIL;
        if (mission != null && mission.getMissionId() != null) {
            View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bl2, rootView, true);
            ((TextView) LLLLIILL.findViewById(R.id.aql)).setText(R.string.i64);
            C16880lQ.LJJJ((TuxIconView) LLLLIILL.findViewById(R.id.aqj), new ACListenerS27S0100000_7(this, 14));
            this.LJLILLLLZI.setValue(new C44289HZt(0));
        }
    }
}
