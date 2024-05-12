package com.ss.android.ugc.aweme.kids.choosemusic.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C78598Ut0;
import X.C84939XVf;
import X.C84983XWx;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC157206Ey;
import X.InterfaceC191547fS;
import X.InterfaceC84974XWo;
import X.InterfaceC84984XWy;
import X.SFS;
import X.XRT;
import X.XWX;
import Y.AgS131S0100000_15;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.kids.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class MusicSheetFragment extends AmeBaseFragment implements InterfaceC157206Ey<MusicCollectionItem>, InterfaceC191547fS, InterfaceC84974XWo<MusicCollectionItem> {
    public C84939XVf LJLIL;
    public DataCenter LJLILLLLZI;
    public XWX LJLJI;
    public C84983XWx LJLJJI;
    public int LJLJJL;

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

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        DataCenter dataCenter;
        int intValue;
        C84983XWx c84983XWx = this.LJLJJI;
        if (c84983XWx != null) {
            c84983XWx.showLoadMoreLoading();
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
                C84939XVf c84939XVf = this.LJLIL;
                c84939XVf.getClass();
                ChooseMusicApi.LIZ.getMusicSheet(intValue, 20).LJ(new AgS131S0100000_15(c84939XVf, 31), C10K.LJIIIIZZ, null);
            }
        }
    }

    @Override // X.InterfaceC84974XWo
    public final void initData() {
        C84939XVf c84939XVf = new C84939XVf(getContext(), this.LJLILLLLZI);
        this.LJLIL = c84939XVf;
        ChooseMusicApi.LIZ.getMusicSheet(0, 20).LJ(new AgS131S0100000_15(c84939XVf, 33), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC157206Ey
    public final void refreshData() {
        C84939XVf c84939XVf = this.LJLIL;
        if (c84939XVf != null) {
            ChooseMusicApi.LIZ.getMusicSheet(0, 20).LJ(new AgS131S0100000_15(c84939XVf, 33), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC157206Ey
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

    @Override // X.InterfaceC157206Ey
    public final void LLLF(Object obj) {
        MusicCollectionItem musicCollectionItem = (MusicCollectionItem) obj;
        if (musicCollectionItem != null && !TextUtils.isEmpty(musicCollectionItem.mcId)) {
            Intent intent = new Intent(getContext(), (Class<?>) MusicDetailListActivity.class);
            intent.putExtra("music_type", 2);
            intent.putExtra("music_class_id", musicCollectionItem.mcId);
            intent.putExtra("music_class_name", musicCollectionItem.mcName);
            intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.LJLJJL);
            intent.putExtra("music_class_enter_method", "click_category_list");
            intent.putExtra("music_class_level", musicCollectionItem.level);
            C78598Ut0.LJIJJ(intent, this);
            startActivityForResult(intent, 10001);
            SFS.LJJII(musicCollectionItem.mcName, "click_category_list", "", "change_music_page_detail", musicCollectionItem.mcId);
        }
    }

    @Override // X.InterfaceC84974XWo
    public final InterfaceC84984XWy<MusicCollectionItem> o2(View view) {
        C84983XWx c84983XWx = new C84983XWx(getContext(), view, this, this, this.LJLJJL);
        C252709vu c252709vu = c84983XWx.LIZ;
        C9KF c9kf = new C9KF();
        c9kf.LIZ(c84983XWx.LJ.getString(R.string.iir));
        c252709vu.LJIILLIIL(c9kf);
        this.LJLJJI = c84983XWx;
        return c84983XWx;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.LJLJJL = i;
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
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bg4, viewGroup, false);
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
