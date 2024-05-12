package com.ss.android.ugc.aweme.music.v2.assem;

import X.C175046tw;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C32I;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C79004UzY;
import X.C7YK;
import X.C7YQ;
import X.C7YR;
import X.C7YT;
import X.C9BE;
import X.QD3;
import X.TBT;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class MusicDescAssem extends DynamicAssem {
    public static final /* synthetic */ int LJZI = 0;
    public final C214298b3 LJLJLLL;
    public final C62822Ol8 LJLL;
    public C7YK LJLLI;
    public Music LJLLILLLL;
    public boolean LJLLJ;
    public TuxTextView LJLLL;
    public View LJLLLL;
    public TuxTextView LJLLLLLL;
    public TuxTextView LJLZ;
    public String LJZ;

    public MusicDescAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 543), C7YT.INSTANCE, null);
        this.LJLL = C221108m2.LIZIZ(new C7YR(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.buq;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    public static List L3(List list) {
        ArrayList arrayList = new ArrayList();
        if (!C79004UzY.LJJIFFI(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) it.next();
                if (!TextUtils.isEmpty(musicOwnerInfo.getUid()) && !TextUtils.isEmpty(musicOwnerInfo.getSecUid()) && !TextUtils.isEmpty(musicOwnerInfo.getNickName()) && !TextUtils.isEmpty(musicOwnerInfo.getHandle())) {
                    arrayList.add(musicOwnerInfo);
                }
            }
        }
        return arrayList;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C175046tw c175046tw) {
        User user;
        Music music;
        List<MusicOwnerInfo> musicOwnerInfos;
        FragmentManager fragmentManager;
        if (c175046tw != null && (user = c175046tw.LJLIL) != null && (music = this.LJLLILLLL) != null && (musicOwnerInfos = music.getMusicOwnerInfos()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(musicOwnerInfos, 10));
            for (MusicOwnerInfo musicOwnerInfo : musicOwnerInfos) {
                if (o.LJ(musicOwnerInfo.getUid(), user.getUid())) {
                    musicOwnerInfo.setFollowStatus(Integer.valueOf(user.getFollowStatus()));
                    musicOwnerInfo.setFollowerStatus(Integer.valueOf(user.getFollowerStatus()));
                    musicOwnerInfo.setBlock(user.isBlock);
                    musicOwnerInfo.setBlocked(user.isBlocked());
                }
                arrayList.add(musicOwnerInfo);
            }
            C7YK c7yk = this.LJLLI;
            if (c7yk != null) {
                Fragment LIZLLL = C212428Vi.LIZLLL(this);
                if (LIZLLL != null) {
                    fragmentManager = LIZLLL.getFragmentManager();
                } else {
                    fragmentManager = null;
                }
                c7yk.LIZ(arrayList, fragmentManager, this.LJLLILLLL);
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFollowStatus(FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus;
        Music music;
        List<MusicOwnerInfo> musicOwnerInfos;
        FragmentManager fragmentManager;
        if (followStatusEvent != null && (followStatus = followStatusEvent.status) != null && (music = this.LJLLILLLL) != null && (musicOwnerInfos = music.getMusicOwnerInfos()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(musicOwnerInfos, 10));
            for (MusicOwnerInfo musicOwnerInfo : musicOwnerInfos) {
                if (o.LJ(musicOwnerInfo.getUid(), followStatus.userId)) {
                    musicOwnerInfo.setFollowStatus(Integer.valueOf(followStatus.followStatus));
                    int i = followStatus.followerStatus;
                    if (i != 0 && i != -1) {
                        musicOwnerInfo.setBlock(false);
                        musicOwnerInfo.setBlocked(false);
                    }
                }
                arrayList.add(musicOwnerInfo);
            }
            C7YK c7yk = this.LJLLI;
            if (c7yk != null) {
                Fragment LIZLLL = C212428Vi.LIZLLL(this);
                if (LIZLLL != null) {
                    fragmentManager = LIZLLL.getFragmentManager();
                } else {
                    fragmentManager = null;
                }
                c7yk.LIZ(arrayList, fragmentManager, this.LJLLILLLL);
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUnBlockUserEvent(C7YQ c7yq) {
        User user;
        Music music;
        List<MusicOwnerInfo> musicOwnerInfos;
        FragmentManager fragmentManager;
        if (c7yq != null && (user = c7yq.LJLIL) != null && (music = this.LJLLILLLL) != null && (musicOwnerInfos = music.getMusicOwnerInfos()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(musicOwnerInfos, 10));
            for (MusicOwnerInfo musicOwnerInfo : musicOwnerInfos) {
                if (o.LJ(musicOwnerInfo.getUid(), user.getUid())) {
                    musicOwnerInfo.setFollowStatus(Integer.valueOf(user.getFollowStatus()));
                    musicOwnerInfo.setFollowerStatus(Integer.valueOf(user.getFollowerStatus()));
                    musicOwnerInfo.setBlock(user.isBlock);
                    musicOwnerInfo.setBlocked(user.isBlocked());
                }
                arrayList.add(musicOwnerInfo);
            }
            C7YK c7yk = this.LJLLI;
            if (c7yk != null) {
                Fragment LIZLLL = C212428Vi.LIZLLL(this);
                if (LIZLLL != null) {
                    fragmentManager = LIZLLL.getFragmentManager();
                } else {
                    fragmentManager = null;
                }
                c7yk.LIZ(arrayList, fragmentManager, this.LJLLILLLL);
            }
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        EventBus.LIZJ().LJIILJJIL(this);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.7YS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new AqS134S0200000_3(this, view, 100), 14, null);
    }
}
