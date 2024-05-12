package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C207668Da;
import X.C29S;
import X.C3C5;
import X.C5S1;
import X.C63057Oov;
import X.C72197SVd;
import X.C72H;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC84974XWo;
import X.InterfaceC84984XWy;
import X.QD3;
import X.XUC;
import X.XUP;
import X.XV5;
import X.XVG;
import X.XVW;
import X.XWX;
import X.XX0;
import X.XX7;
import X.XY4;
import X.XYC;
import X.XYM;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS0S0300000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseMusicListFragment<T> extends AmeBaseFragment implements XY4, XUC, InterfaceC84974XWo<T>, C72H<XYM>, Observer<C207668Da> {
    public XV5 LJLIL;
    public ChooseMusicDownloadPlayHelper LJLILLLLZI;
    public MusicModel LJLJI;
    public final boolean LJLJJI = true;
    public XVW LJLJJL;
    public DataCenter LJLJJLL;
    public XWX LJLJL;
    public InterfaceC84984XWy<T> LJLJLJ;
    public int LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;

    public abstract int Al();

    public abstract String Dl();

    public abstract boolean Gl();

    @Override // X.XUC
    public final /* synthetic */ void LJJJJIZL(MusicModel musicModel, Exception exc) {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLIZLLLIL() {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLLL(MusicModel musicModel, long j) {
    }

    @Override // X.XUC
    public final /* synthetic */ void T3(MusicModel musicModel) {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public abstract InterfaceC84984XWy<T> vl(View view);

    public abstract int wl();

    @Override // X.InterfaceC84974XWo
    public DataCenter cg() {
        if (this.LJLJJLL == null) {
            this.LJLJJLL = DataCenter.gv0(ViewModelProviders.of(this), this);
        }
        DataCenter dataCenter = this.LJLJJLL;
        dataCenter.iv0("music_collect_status", this, false);
        dataCenter.iv0("play_compeleted", this, false);
        dataCenter.iv0("music_reset_play_start", this, false);
        this.LJLJJLL.iv0("music_loading", this, false);
        this.LJLJJLL.iv0("data_share_info", this, false);
        this.LJLJJLL.iv0("music_list", this, false);
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC84974XWo
    public void initData() {
        this.LJLJJL = new XVW(getContext(), this.LJLJJLL);
    }

    public AbstractC029409q xl() {
        InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJLJ;
        if (interfaceC84984XWy != null) {
            return interfaceC84984XWy.LJJLIIIJJIZ();
        }
        return null;
    }

    @Override // X.XUC
    public final boolean LJJIIZI() {
        return isViewValid();
    }

    @Override // X.XUC
    public final Activity LJJIZ() {
        return mo49getActivity();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        XV5 xv5 = this.LJLIL;
        if (xv5 != null) {
            xv5.LJ();
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LJLILLLLZI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
            this.LJLILLLLZI.onDestroy();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LJLILLLLZI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
            this.LJLILLLLZI.LJLLLL = true;
        }
        AbstractC029409q xl = xl();
        if (xl instanceof XX7) {
            ((XX7) xl).LJZ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LJLILLLLZI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.LJLLLL = false;
        }
    }

    @Override // X.XUC
    public final MusicModel LIZLLL() {
        return this.LJLJI;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    @Override // androidx.lifecycle.Observer
    /* renamed from: Hl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onChanged(X.C207668Da r12) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment.onChanged(X.8Da):void");
    }

    @Override // X.C72H
    /* renamed from: Il, reason: merged with bridge method [inline-methods] */
    public void onInternalEvent(XYM xym) {
        String str = xym.LIZIZ;
        MusicModel musicModel = xym.LIZ;
        if ("follow_type".equals(str)) {
            this.LJLJJL.LIZ(musicModel, musicModel.getMusicId(), 1, xym.LIZJ, xym.LIZLLL);
        } else {
            if (!"unfollow_type".equals(str)) {
                return;
            }
            this.LJLJJL.LIZ(musicModel, musicModel.getMusicId(), 0, xym.LIZJ, xym.LIZLLL);
        }
    }

    public void Kl(XYC xyc) {
        int i;
        if (xyc.LIZ == 1) {
            if (xyc.LIZLLL == 1) {
                i = R.string.dgl;
            } else {
                i = R.string.cgd;
            }
        } else if (xyc.LIZLLL == 1) {
            i = R.string.dgq;
        } else {
            i = R.string.cge;
        }
        C5S1 c5s1 = new C5S1(mo49getActivity());
        c5s1.LIZJ(i);
        c5s1.LJ();
    }

    @Override // X.XY4
    public final void k2(MusicModel musicModel) {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LJLILLLLZI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
        }
    }

    @Override // X.InterfaceC84974XWo
    public final InterfaceC84984XWy<T> o2(View view) {
        if (this.LJLJLJ == null) {
            this.LJLJLJ = vl(view);
        }
        return this.LJLJLJ;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        XV5 xv5 = this.LJLIL;
        if (xv5 != null) {
            xv5.LIZIZ();
            XV5 xv52 = this.LJLIL;
            xv52.getClass();
            xv52.LIZJ = this;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        int i2 = 1;
        if (getArguments() != null) {
            i2 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.LJLLJ = i2;
        int i3 = 0;
        if (getArguments() == null) {
            i = 0;
        } else {
            i = getArguments().getInt("sound_page_scene", 0);
        }
        this.LJLJLLL = i;
        if (getArguments() != null) {
            i3 = getArguments().getInt("music_discovery_type", 0);
        }
        this.LJLLILLLL = i3;
        if (getArguments() == null) {
            this.LJLL = 0L;
            this.LJLLI = 0L;
        } else {
            this.LJLL = getArguments().getLong("max_video_duration", 0L);
            this.LJLLI = getArguments().getLong("shoot_video_length", 0L);
        }
    }

    @QD3(sticky = true)
    public void onMusicCollectEvent(C72197SVd c72197SVd) {
        if (this.LJLJJLL != null && c72197SVd != null && "music_detail".equals(c72197SVd.LJLJI)) {
            this.LJLJJLL.jv0(new XYC(0, c72197SVd.LJLIL, -1, -1, c72197SVd.LJLILLLLZI), "music_collect_status");
        }
    }

    @Override // X.XY4
    public final void y8(MusicModel musicModel) {
        this.LJLILLLLZI.LJLLILLLL = Dl();
        int Al = Al();
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            Al = 12;
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LJLILLLLZI;
        boolean z = false;
        if (mo49getActivity().getIntent() != null) {
            z = mo49getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        chooseMusicDownloadPlayHelper.LIZIZ(Al, musicModel, true, z);
    }

    @Override // X.XY4
    public final void za0(XUP xup) {
        this.LJLILLLLZI.LJLJJLL = xup;
    }

    @Override // X.XY4
    public final void oj0(MusicModel musicModel, XVG xvg) {
        this.LJLJI = musicModel;
        this.LJLJJLL.jv0(Boolean.TRUE, "music_loading");
        int Al = Al();
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            Al = 12;
        }
        boolean z = false;
        if (this.LJLJJI) {
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LJLILLLLZI;
            chooseMusicDownloadPlayHelper.LLFFF = xvg;
            chooseMusicDownloadPlayHelper.LJIIJ(musicModel, false, Al);
        } else {
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = this.LJLILLLLZI;
            if (mo49getActivity().getIntent() != null) {
                z = mo49getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
            }
            chooseMusicDownloadPlayHelper2.LIZIZ(Al, musicModel, true, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LJLJL == null) {
            this.LJLJL = new XWX(this);
        }
        this.LJLJL.LIZ(view, bundle);
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = new ChooseMusicDownloadPlayHelper(this, new XX0(this));
        this.LJLILLLLZI = chooseMusicDownloadPlayHelper;
        chooseMusicDownloadPlayHelper.LJ();
        this.LJLILLLLZI.LJLILLLLZI = this.LJLLJ;
        AbstractC029409q xl = xl();
        if (xl instanceof XX7) {
            this.LJLILLLLZI.LLFFF = ((XX7) xl).LJLLLLLL(this.LJLJI);
        }
    }

    @Override // X.XUC
    public final void LJJII(MusicModel musicModel, String str, String str2) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || mo49getActivity.isFinishing()) {
            return;
        }
        AVExternalServiceImpl.LIZ().publishService().setCurMusic(musicModel, Boolean.FALSE, 0);
        Jl(str, musicModel, str2, mo49getActivity);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater;
        o.LJIIIZ(inflater, "inflater");
        if (C63057Oov.LIZ()) {
            layoutInflater = inflater.cloneInContext(new ContextThemeWrapper(requireActivity(), R.style.uw));
        } else {
            layoutInflater = inflater;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, wl(), viewGroup, false);
        if (Gl()) {
            mo49getActivity();
            XV5 xv5 = new XV5(this, inflater, viewGroup);
            this.LJLIL = xv5;
            int i = (int) this.LJLLI;
            int i2 = (int) this.LJLL;
            xv5.LJIIIIZZ = i;
            xv5.LJIIIZ = i2;
        }
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public void Jl(String str, MusicModel musicModel, String str2, ActivityC45651qj activityC45651qj) {
        if (this.LJLLJ == 1) {
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.musicOrigin(str2);
            builder.musicModel(musicModel);
            builder.musicPath(str);
            builder.shootWay("single_song");
            AVExternalServiceImpl.LIZ().asyncService("BaseMuiscList", new IDLCallbackS0S0300000_7(activityC45651qj, builder, musicModel, 9));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        activityC45651qj.setResult(-1, intent);
        activityC45651qj.finish();
    }
}
