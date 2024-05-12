package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.ActivityC45651qj;
import X.C04330Ez;
import X.C10K;
import X.C252709vu;
import X.C45818HyY;
import X.C61099NyR;
import X.C72H;
import X.C84934XVa;
import X.C84964XWe;
import X.C9KF;
import X.EnumC84975XWp;
import X.InterfaceC191547fS;
import X.InterfaceC84984XWy;
import X.InterfaceC85024XYm;
import X.XVF;
import X.XVG;
import X.XWQ;
import X.XYM;
import X.XYV;
import Y.AgS11S0200100_15;
import Y.IDRunnableS6S0101000;
import Y.IDeS405S0100000_15;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class LocalMusicFragment extends BaseMusicListFragment<C84934XVa> implements XYV<MusicModel>, InterfaceC191547fS {
    public static final /* synthetic */ int LJZ = 0;
    public C45818HyY LJLLL;
    public long LJLLLL;
    public final SafeHandler LJLLLLLL = new SafeHandler(this);
    public boolean LJLZ = false;

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int Al() {
        return 5;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String Dl() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean Gl() {
        return true;
    }

    @Override // X.InterfaceC84974XWo
    public final String LLJJJ() {
        return "local_music_list_data";
    }

    @Override // X.InterfaceC84974XWo
    public final String V() {
        return "local_music_list_status";
    }

    @Override // X.InterfaceC84974XWo
    public final String b() {
        return "local_music_list_load_more_status";
    }

    @Override // X.XYV
    public final void pk() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int wl() {
        return R.layout.awx;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        C45818HyY c45818HyY = this.LJLLL;
        if (c45818HyY == null || c45818HyY.LIZIZ) {
            return;
        }
        InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJLJ;
        if (interfaceC84984XWy != 0) {
            interfaceC84984XWy.showLoadMoreLoading();
        }
        C45818HyY c45818HyY2 = this.LJLLL;
        WeakReference<Activity> weakReference = new WeakReference<>(mo49getActivity());
        c45818HyY2.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (c45818HyY2.LIZJ) {
            return;
        }
        c45818HyY2.LIZJ = true;
        c45818HyY2.LIZIZ(weakReference).LJ(new AgS11S0200100_15(c45818HyY2, weakReference, currentTimeMillis, 1), C10K.LJIIIIZZ, null);
    }

    public final void Ll() {
        String str;
        String str2;
        if (this.LJLZ || mo49getActivity() == null) {
            return;
        }
        this.LJLZ = true;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        int i = Build.VERSION.SDK_INT;
        String str3 = "android.permission.READ_MEDIA_AUDIO";
        if (i >= 33) {
            str = "android.permission.READ_MEDIA_AUDIO";
        } else {
            str = "android.permission.WRITE_EXTERNAL_STORAGE";
        }
        if (C04330Ez.LIZ(mo49getActivity, str) == 0 && this.LJLLL != null) {
            Ml();
            return;
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (i >= 33) {
            str2 = "bpea-tools_request_storage_permission_load_local_music_target33";
        } else {
            str2 = "bpea-tools_request_storage_permission_load_local_music";
        }
        C61099NyR LIZIZ = C61099NyR.LIZIZ(mo49getActivity2, TokenCert.with(str2));
        String[] strArr = new String[1];
        if (i < 33) {
            str3 = "android.permission.WRITE_EXTERNAL_STORAGE";
        }
        strArr[0] = str3;
        LIZIZ.LIZ(strArr).LIZJ(new IDeS405S0100000_15(this, 0));
    }

    public final void Ml() {
        C45818HyY c45818HyY = this.LJLLL;
        WeakReference<Activity> weakReference = new WeakReference<>(mo49getActivity());
        c45818HyY.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (c45818HyY.LIZJ) {
            return;
        }
        c45818HyY.LIZJ = true;
        c45818HyY.LIZIZ(weakReference).LJ(new AgS11S0200100_15(c45818HyY, weakReference, currentTimeMillis, 0), C10K.LJIIIIZZ, null);
    }

    @Override // X.XYV
    public final void refreshData() {
        if (this.LJLLL != null) {
            Ml();
        }
    }

    @Override // X.XYV
    public final void LJI() {
        if (mo49getActivity() != null) {
            mo49getActivity().onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC84974XWo
    public final void initData() {
        super.initData();
        this.LJLLL = new C45818HyY(this.LJLJJLL);
        this.LJLLLLLL.postDelayed(new IDRunnableS6S0101000(4, this, 19), 5000L);
    }

    public static LocalMusicFragment Nl(int i) {
        LocalMusicFragment localMusicFragment = new LocalMusicFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        localMusicFragment.setArguments(bundle);
        return localMusicFragment;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLLLL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC84984XWy<C84934XVa> vl(View view) {
        XWQ xwq = new XWQ(getContext(), view, this, R.string.iqx, this, (C72H<XYM>) null, this.LJLLJ, EnumC84975XWp.LOCAL_MUSIC, this.LJLLILLLL);
        xwq.LJIJ = this.LJLLLL;
        xwq.LJIIL = C84964XWe.LIZ(this);
        String title = xwq.LJ.getString(R.string.ij0);
        C252709vu c252709vu = xwq.LIZ;
        C9KF c9kf = new C9KF();
        o.LJIIIZ(title, "title");
        c9kf.LIZJ = title;
        c252709vu.LJIILLIIL(c9kf);
        xwq.LJIIIIZZ(this);
        xwq.LJII(this);
        xwq.LJIIJ(new Pair<>(Long.valueOf(this.LJLL), Long.valueOf(this.LJLLI)));
        xwq.LJIIIZ(new XVG("change_music_page_detail", "local_music", "click_button", XVF.LIZ));
        xwq.LJ(new InterfaceC85024XYm() { // from class: X.XYb
            @Override // X.InterfaceC85024XYm
            public final void LIZ() {
                LocalMusicFragment.this.LJIIJJI();
            }
        }, 10);
        xwq.LIZJ.setVisibility(0);
        xwq.LJI();
        return xwq;
    }

    @Override // X.XYV
    public final /* bridge */ /* synthetic */ void LLLF(Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final void Jl(String str, MusicModel musicModel, String str2, ActivityC45651qj activityC45651qj) {
        String name;
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        if (musicModel == null) {
            name = "";
        } else {
            name = musicModel.getName();
        }
        intent.putExtra("local_music_name", name);
        activityC45651qj.setResult(-1, intent);
        activityC45651qj.finish();
    }
}
