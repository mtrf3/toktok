package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C63057Oov;
import X.C76800UCe;
import X.C78598Ut0;
import X.C85003XXr;
import X.C90903hW;
import X.C9KF;
import X.H7B;
import X.InterfaceC191547fS;
import X.InterfaceC84974XWo;
import X.InterfaceC84984XWy;
import X.XRT;
import X.XVF;
import X.XVW;
import X.XWX;
import X.XYV;
import Y.AgS131S0100000_15;
import Y.AgS87S0101000_15;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class MusicSheetFragment extends AmeBaseFragment implements XYV<MusicCollectionItem>, InterfaceC191547fS, InterfaceC84974XWo<MusicCollectionItem> {
    public XVW LJLIL;
    public DataCenter LJLILLLLZI;
    public XWX LJLJI;
    public C85003XXr LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;

    @Override // X.InterfaceC84974XWo
    public final String LLJJJ() {
        return "music_sheet_list";
    }

    @Override // X.InterfaceC84974XWo
    public final String V() {
        return "refresh_status_music_sheet";
    }

    @Override // X.InterfaceC84974XWo
    public final String b() {
        return "loadmore_status_music_sheet";
    }

    @Override // X.XYV
    public final void pk() {
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        DataCenter dataCenter;
        int intValue;
        C85003XXr c85003XXr = this.LJLJJI;
        if (c85003XXr != null) {
            c85003XXr.showLoadMoreLoading();
        }
        if (this.LJLIL != null && (dataCenter = this.LJLILLLLZI) != null) {
            Object LIZ = ((XRT) dataCenter.get("music_sheet_list")).LIZ("list_cursor");
            if (LIZ instanceof Long) {
                intValue = ((Long) LIZ).intValue();
            } else if (!(LIZ instanceof Integer)) {
                return;
            } else {
                intValue = ((Integer) LIZ).intValue();
            }
            if (intValue > 0) {
                XVW xvw = this.LJLIL;
                int i = this.LJLJJLL;
                xvw.getClass();
                ChooseMusicApi.LIZIZ(intValue, 20, i, 0).LJ(new AgS131S0100000_15(xvw, 13), C10K.LJIIIIZZ, null);
            }
        }
    }

    @Override // X.InterfaceC84974XWo
    public final void initData() {
        XVW xvw = new XVW(getContext(), this.LJLILLLLZI);
        this.LJLIL = xvw;
        ChooseMusicApi.LIZIZ(0, 20, this.LJLJJLL, this.LJLJL).LJ(new AgS87S0101000_15(0, xvw, 2), C10K.LJIIIIZZ, null);
    }

    @Override // X.XYV
    public final void refreshData() {
        XVW xvw = this.LJLIL;
        if (xvw != null) {
            ChooseMusicApi.LIZIZ(0, 20, this.LJLJJLL, this.LJLJL).LJ(new AgS87S0101000_15(0, xvw, 2), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.XYV
    public final void LJI() {
        if (mo49getActivity() != null) {
            mo49getActivity().onBackPressed();
        }
    }

    @Override // X.InterfaceC84974XWo
    public final DataCenter cg() {
        DataCenter gv0 = DataCenter.gv0(ViewModelProviders.of(this), this);
        this.LJLILLLLZI = gv0;
        return gv0;
    }

    @Override // X.XYV
    public final void LLLF(Object obj) {
        MusicCollectionItem musicCollectionItem = (MusicCollectionItem) obj;
        if (musicCollectionItem != null && !TextUtils.isEmpty(musicCollectionItem.mcId)) {
            try {
                Intent intent = new Intent(getContext(), (Class<?>) MusicDetailListActivity.class);
                intent.putExtra("music_type", 2);
                intent.putExtra("music_class_id", musicCollectionItem.mcId);
                intent.putExtra("music_class_name", musicCollectionItem.mcName);
                intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.LJLJJL);
                intent.putExtra("music_class_enter_method", "click_category_list");
                intent.putExtra("music_class_level", musicCollectionItem.level);
                intent.putExtra("sound_page_scene", this.LJLJJLL);
                intent.putExtra("max_video_duration", this.LJLJLJ);
                intent.putExtra("shoot_video_length", this.LJLJLLL);
                C78598Ut0.LJIJJ(intent, this);
                startActivityForResult(intent, 10001);
                XVF.LJIIIZ(musicCollectionItem.mcName, "click_category_list", null, null, "", "change_music_page_detail", musicCollectionItem.mcId);
            } catch (Exception e) {
                H7B.LIZLLL(e);
            }
        }
    }

    @Override // X.InterfaceC84974XWo
    public final InterfaceC84984XWy<MusicCollectionItem> o2(View view) {
        C85003XXr c85003XXr = new C85003XXr(getContext(), view, this, this, this.LJLJJL);
        C252709vu c252709vu = c85003XXr.LIZ;
        C9KF c9kf = new C9KF();
        c9kf.LIZ(c85003XXr.LJ.getString(R.string.iir));
        c252709vu.LJIILLIIL(c9kf);
        this.LJLJJI = c85003XXr;
        return c85003XXr;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        int i2 = 1;
        if (getArguments() != null) {
            i2 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.LJLJJL = i2;
        int i3 = 0;
        if (getArguments() == null) {
            i = 0;
        } else {
            i = getArguments().getInt("sound_page_scene", 0);
        }
        this.LJLJJLL = i;
        if (getArguments() != null) {
            i3 = getArguments().getInt("more_tab_music_sheet_collection_type", 0);
        }
        this.LJLJL = i3;
        if (getArguments() == null) {
            this.LJLJLJ = 0L;
            this.LJLJLLL = 0L;
        } else {
            this.LJLJLJ = getArguments().getLong("max_video_duration", 0L);
            this.LJLJLLL = getArguments().getLong("shoot_video_length", 0L);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LJLJI == null) {
            this.LJLJI = new XWX(this);
        }
        this.LJLJI.LIZ(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            mo49getActivity().setResult(-1, intent);
            mo49getActivity().finish();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        if (C63057Oov.LIZ()) {
            inflater = inflater.cloneInContext(new ContextThemeWrapper(requireActivity(), R.style.uw));
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awv, viewGroup, false);
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
}
