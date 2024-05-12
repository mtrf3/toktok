package com.ss.android.ugc.aweme.kids.choosemusic.fragment;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C207668Da;
import X.C29S;
import X.C38354F3m;
import X.C3C5;
import X.C5S1;
import X.C76800UCe;
import X.C79004UzY;
import X.C84880XSy;
import X.C84939XVf;
import X.C84980XWu;
import X.C90903hW;
import X.InterfaceC84871XSp;
import X.InterfaceC84974XWo;
import X.InterfaceC84984XWy;
import X.InterfaceC85019XYh;
import X.QD3;
import X.SS0;
import X.XT7;
import X.XTE;
import X.XWX;
import X.XX9;
import X.XY6;
import X.XYA;
import X.XYD;
import X.XYN;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseMusicListFragment<T> extends AmeBaseFragment implements XY6, InterfaceC84871XSp, InterfaceC84974XWo<T>, InterfaceC85019XYh<XYN>, Observer<C207668Da> {
    public C84880XSy LJLIL;
    public MusicModel LJLILLLLZI;
    public C84939XVf LJLJJI;
    public DataCenter LJLJJL;
    public XWX<?> LJLJJLL;
    public InterfaceC84984XWy<T> LJLJL;
    public int LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final boolean LJLJI = true;

    public abstract int Al();

    public abstract String Dl();

    @Override // X.InterfaceC84871XSp
    public final void LJJJJIZL(MusicModel musicModel, Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public abstract InterfaceC84984XWy<T> vl(View view);

    public abstract int wl();

    @Override // X.InterfaceC84974XWo
    public DataCenter cg() {
        if (this.LJLJJL == null) {
            this.LJLJJL = DataCenter.gv0(ViewModelProviders.of(this), this);
        }
        DataCenter dataCenter = this.LJLJJL;
        o.LJI(dataCenter);
        dataCenter.iv0("music_collect_status", this, false);
        dataCenter.iv0("play_compeleted", this, false);
        DataCenter dataCenter2 = this.LJLJJL;
        o.LJI(dataCenter2);
        return dataCenter2;
    }

    @Override // X.InterfaceC84974XWo
    public void initData() {
        this.LJLJJI = new C84939XVf(getContext(), this.LJLJJL);
    }

    public AbstractC029409q<?> xl() {
        InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJL;
        if (interfaceC84984XWy != null) {
            o.LJI(interfaceC84984XWy);
            return interfaceC84984XWy.LJJLIIIJJIZ();
        }
        return null;
    }

    private final boolean Gl() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        if (mo49getActivity.getIntent() == null) {
            return false;
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        o.LJI(mo49getActivity2);
        return mo49getActivity2.getIntent().getBooleanExtra("extra_beat_music_sticker", false);
    }

    @Override // X.InterfaceC84871XSp
    public final boolean LJJIIZI() {
        return isViewValid();
    }

    @Override // X.InterfaceC84871XSp
    public final Activity LJJIZ() {
        return mo49getActivity();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C84880XSy c84880XSy = this.LJLIL;
        if (c84880XSy != null) {
            o.LJI(c84880XSy);
            c84880XSy.LJII();
            C84880XSy c84880XSy2 = this.LJLIL;
            o.LJI(c84880XSy2);
            c84880XSy2.LJI();
        }
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C84880XSy c84880XSy = this.LJLIL;
        if (c84880XSy != null) {
            o.LJI(c84880XSy);
            c84880XSy.LJII();
            C84880XSy c84880XSy2 = this.LJLIL;
            o.LJI(c84880XSy2);
            c84880XSy2.LJI = true;
        }
        AbstractC029409q<?> xl = xl();
        o.LJI(xl);
        if (xl instanceof XX9) {
            ((XX9) xl).LJLLLLLL();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C84880XSy c84880XSy = this.LJLIL;
        if (c84880XSy != null) {
            o.LJI(c84880XSy);
            c84880XSy.LJI = false;
        }
    }

    @Override // X.InterfaceC84871XSp
    public final MusicModel LIZLLL() {
        return this.LJLILLLLZI;
    }

    @Override // X.XY6
    public final void C7(XT7 xt7) {
        C84880XSy c84880XSy = this.LJLIL;
        o.LJI(c84880XSy);
        c84880XSy.LJFF = xt7;
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: Hl, reason: merged with bridge method [inline-methods] */
    public void onChanged(C207668Da c207668Da) {
        int i;
        int i2;
        MusicModel.CollectionType collectionType;
        if (c207668Da == null) {
            return;
        }
        String str = c207668Da.LIZ;
        int hashCode = str.hashCode();
        if (hashCode != -1635157503) {
            if (hashCode != -1322093457 || !str.equals("play_compeleted") || !(xl() instanceof XX9)) {
                return;
            }
            AbstractC029409q<?> xl = xl();
            o.LJII(xl, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.choosemusic.adapter.MusicAdapter");
            ((XX9) xl).LJLLLLLL();
            return;
        }
        if (!str.equals("music_collect_status")) {
            return;
        }
        Object obj = c207668Da.LIZIZ;
        if (obj == null) {
            obj = null;
        }
        XYD xyd = (XYD) obj;
        InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJL;
        if (interfaceC84984XWy != null && interfaceC84984XWy.LJJLIIIJJIZ() != null) {
            InterfaceC84984XWy<T> interfaceC84984XWy2 = this.LJLJL;
            o.LJI(interfaceC84984XWy2);
            List<T> data = interfaceC84984XWy2.LJJLIIIJJIZ().getData();
            if (C79004UzY.LJJIFFI(data)) {
                return;
            }
            if (xyd.LIZ == 1) {
                o.LJI(data);
                if (data.size() > xyd.LIZJ) {
                    InterfaceC84984XWy<T> interfaceC84984XWy3 = this.LJLJL;
                    o.LJI(interfaceC84984XWy3);
                    interfaceC84984XWy3.LJJLIIIJJIZ().notifyItemChanged(xyd.LIZJ);
                }
            } else if (xyd.LIZJ == -1) {
                String musicId = xyd.LJ.getMusicId();
                if (C79004UzY.LJJIFFI(data)) {
                    return;
                }
                for (T t : data) {
                    if (t != null && C38354F3m.LIZJ(t.getMusicId(), musicId)) {
                        if (xyd.LIZLLL == 1) {
                            collectionType = MusicModel.CollectionType.COLLECTED;
                        } else {
                            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                        }
                        t.setCollectionType(collectionType);
                        o.LJI(data);
                        int indexOf = data.indexOf(t);
                        if (indexOf < 0 || indexOf >= data.size() || !(!(this instanceof CollectMusicFragment))) {
                            return;
                        }
                        InterfaceC84984XWy<T> interfaceC84984XWy4 = this.LJLJL;
                        o.LJI(interfaceC84984XWy4);
                        interfaceC84984XWy4.LJJLIIIJJIZ().notifyItemChanged(indexOf);
                        return;
                    }
                }
                return;
            }
        }
        if (!getUserVisibleHint()) {
            return;
        }
        if (xyd.LIZ == 1) {
            if (xyd.LIZLLL == 1) {
                i2 = R.string.dgl;
            } else {
                i2 = R.string.cgd;
            }
            C5S1 c5s1 = new C5S1(mo49getActivity());
            c5s1.LIZJ(i2);
            c5s1.LJ();
            return;
        }
        if (xyd.LIZLLL == 1) {
            i = R.string.dgq;
        } else {
            i = R.string.cge;
        }
        C5S1 c5s12 = new C5S1(mo49getActivity());
        c5s12.LIZJ(i);
        c5s12.LJ();
    }

    @Override // X.XY6
    public final void k2(MusicModel musicModel) {
        C84880XSy c84880XSy = this.LJLIL;
        if (c84880XSy != null) {
            c84880XSy.LJII();
        }
    }

    @Override // X.InterfaceC84974XWo
    public final InterfaceC84984XWy<T> o2(View view) {
        o.LJIIIZ(view, "view");
        if (this.LJLJL == null) {
            this.LJLJL = vl(view);
        }
        InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJL;
        o.LJI(interfaceC84984XWy);
        return interfaceC84984XWy;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            o.LJI(arguments);
            i = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.LJLJLJ = i;
    }

    @Override // X.InterfaceC85019XYh
    public final void onInternalEvent(XYN xyn) {
        XYN xyn2 = xyn;
        String str = xyn2.LIZIZ;
        MusicModel musicModel = xyn2.LIZ;
        String str2 = null;
        if (o.LJ("follow_type", str)) {
            C84939XVf c84939XVf = this.LJLJJI;
            o.LJI(c84939XVf);
            if (musicModel != null) {
                str2 = musicModel.getMusicId();
            }
            c84939XVf.LIZ(musicModel, str2, 1, xyn2.LIZJ, xyn2.LIZLLL);
            return;
        }
        if (!o.LJ("unfollow_type", str)) {
            return;
        }
        C84939XVf c84939XVf2 = this.LJLJJI;
        o.LJI(c84939XVf2);
        if (musicModel != null) {
            str2 = musicModel.getMusicId();
        }
        c84939XVf2.LIZ(musicModel, str2, 0, xyn2.LIZJ, xyn2.LIZLLL);
    }

    @QD3(sticky = true)
    public final void onMusicCollectEvent(XYA xya) {
        if (this.LJLJJL != null && xya != null && o.LJ("music_detail", null)) {
            DataCenter dataCenter = this.LJLJJL;
            o.LJI(dataCenter);
            dataCenter.jv0(new XYD(0, xya.LJLIL, -1, -1, xya.LJLILLLLZI), "music_collect_status");
        }
    }

    @Override // X.XY6
    public final void y8(MusicModel musicModel) {
        if (this.LJLIL != null) {
            Dl();
        }
        C84880XSy c84880XSy = this.LJLIL;
        if (c84880XSy != null) {
            c84880XSy.LIZ(Al(), musicModel, Gl());
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new XWX<>(this);
        }
        XWX<?> xwx = this.LJLJJLL;
        o.LJI(xwx);
        xwx.LIZ(view, bundle);
        C84880XSy c84880XSy = new C84880XSy(this, new C84980XWu(this));
        this.LJLIL = c84880XSy;
        c84880XSy.LJFF();
        C84880XSy c84880XSy2 = this.LJLIL;
        o.LJI(c84880XSy2);
        c84880XSy2.LIZIZ = this.LJLJLJ;
        AbstractC029409q<?> xl = xl();
        o.LJI(xl);
        if (xl instanceof XX9) {
            C84880XSy c84880XSy3 = this.LJLIL;
            o.LJI(c84880XSy3);
            c84880XSy3.LJIIL = ((XX9) xl).LJLJJLL;
        }
    }

    @Override // X.XY6
    public final void t2(XTE xte, MusicModel musicModel) {
        this.LJLILLLLZI = musicModel;
        if (this.LJLJI) {
            C84880XSy c84880XSy = this.LJLIL;
            o.LJI(c84880XSy);
            c84880XSy.LJIIL = xte;
            C84880XSy c84880XSy2 = this.LJLIL;
            o.LJI(c84880XSy2);
            c84880XSy2.LJIIIIZZ(musicModel, Al());
            return;
        }
        C84880XSy c84880XSy3 = this.LJLIL;
        o.LJI(c84880XSy3);
        c84880XSy3.LIZ(Al(), musicModel, Gl());
    }

    @Override // X.InterfaceC84871XSp
    public final void LJJII(MusicModel musicModel, String str, String str2) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || mo49getActivity.isFinishing()) {
            return;
        }
        SS0.LIZ(musicModel);
        AVExternalServiceImpl.LIZ().publishService().setCurMusic(musicModel, Boolean.FALSE, 0);
        if (this.LJLJLJ == 1) {
            RecordConfig.Builder builder = new RecordConfig.Builder();
            o.LJI(str2);
            builder.musicOrigin(str2);
            builder.musicModel(musicModel);
            o.LJI(str);
            builder.musicPath(str);
            AVExternalServiceImpl.LIZ().asyncService("BaseMuiscList", new IDLCallbackS16S0200000_7(mo49getActivity, builder, 4));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        mo49getActivity.setResult(-1, intent);
        mo49getActivity.finish();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, wl(), viewGroup, false);
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
