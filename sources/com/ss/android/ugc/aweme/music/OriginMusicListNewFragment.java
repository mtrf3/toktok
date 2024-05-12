package com.ss.android.ugc.aweme.music;

import X.ActivityC45651qj;
import X.AnonymousClass950;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C2310594z;
import X.C240369c0;
import X.C242129eq;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C51029K0z;
import X.C5H3;
import X.C61520OCm;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C7Y8;
import X.C8VC;
import X.C8VV;
import X.C90903hW;
import X.HG3;
import X.InterfaceC241869eQ;
import X.InterfaceC242139er;
import X.InterfaceC242149es;
import X.InterfaceC242159et;
import X.InterfaceC246289lY;
import X.InterfaceC26350AVu;
import X.InterfaceC65784Pro;
import X.O3E;
import X.OSZ;
import X.YFG;
import X.Z8A;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.music.vm.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OriginMusicListNewFragment extends ProfileListFragment implements YFG, InterfaceC246289lY, InterfaceC241869eQ {
    public final C214298b3 LJLJJL;
    public String LJLJJLL;
    public InterfaceC26350AVu LJLJL;
    public InterfaceC242159et LJLJLJ;
    public InterfaceC242149es LJLJLLL;
    public InterfaceC242139er LJLL;
    public Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C5H3 LJLJJI = RouteArgExtension.INSTANCE.navArg(this);

    public /* bridge */ /* synthetic */ int Ml() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void Oi() {
    }

    public void _$_clearFindViewByIdCache() {
        this.LJLLI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return Il(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC241869eQ, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public OriginMusicListNewFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(LegacyCommunicateViewModel.class);
        this.LJLJJL = new C214298b3(LIZ, new AqS154S0100000_4(LIZ, 386), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C242129eq.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    private final LegacyCommunicateViewModel Ll() {
        return (LegacyCommunicateViewModel) this.LJLJJL.getValue();
    }

    @Override // X.C8VB
    /* renamed from: Jl, reason: merged with bridge method [inline-methods] */
    public C240369c0 defaultObservableData() {
        String str;
        String str2;
        boolean z;
        List<Long> list;
        User user;
        OriginalMusician originalMusician;
        User user2;
        OriginalMusician originalMusician2;
        OriginMusicArg Kl = Kl();
        String str3 = null;
        if (Kl != null) {
            str = Kl.getUserId();
        } else {
            str = null;
        }
        OriginMusicArg Kl2 = Kl();
        if (Kl2 != null) {
            str2 = Kl2.getSecUserID();
        } else {
            str2 = null;
        }
        OriginMusicArg Kl3 = Kl();
        if (Kl3 != null) {
            z = Kl3.isMe();
        } else {
            z = false;
        }
        boolean Nl = Nl();
        OriginMusicArg Kl4 = Kl();
        if (Kl4 != null && (user2 = Kl4.getUser()) != null && (originalMusician2 = user2.getOriginalMusician()) != null) {
            list = originalMusician2.newReleaseClipIds;
        } else {
            list = null;
        }
        OriginMusicArg Kl5 = Kl();
        if (Kl5 != null && (user = Kl5.getUser()) != null && (originalMusician = user.getOriginalMusician()) != null) {
            str3 = Long.valueOf(originalMusician.highlightMusicId).toString();
        }
        return new C240369c0(str, str2, z, Nl, false, (PinnedMusicList) null, (List) list, str3, 96);
    }

    public final OriginMusicArg Kl() {
        return (OriginMusicArg) this.LJLJJI.getValue();
    }

    @Override // X.OGG
    public View LJIJJ() {
        InterfaceC242149es interfaceC242149es = this.LJLJLLL;
        if (interfaceC242149es != null) {
            return interfaceC242149es.LJIJJ();
        }
        return null;
    }

    @Override // X.C8Z7
    public boolean LJJ() {
        InterfaceC242149es interfaceC242149es = this.LJLJLLL;
        if (interfaceC242149es != null) {
            return interfaceC242149es.LJJ();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void LL() {
        InterfaceC242149es interfaceC242149es = this.LJLJLLL;
        if (interfaceC242149es != null) {
            interfaceC242149es.LL();
        }
    }

    @Override // X.YFG
    public boolean LLLZI() {
        InterfaceC242149es interfaceC242149es = this.LJLJLLL;
        if (interfaceC242149es != null) {
            return interfaceC242149es.LLLZI();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public boolean isEmpty() {
        InterfaceC242149es interfaceC242149es = this.LJLJLLL;
        if (interfaceC242149es != null) {
            return interfaceC242149es.isEmpty();
        }
        return false;
    }

    private final boolean Nl() {
        OriginMusicArg Kl = Kl();
        if (Kl == null || !Kl.isMe() || HG3.LJIILL().getCurUser().getAccountType() == 3) {
            return false;
        }
        return true;
    }

    @Override // X.C8Z7
    public void LJJJJ() {
        if (!isViewValid()) {
            return;
        }
        Ll().setState(C2310594z.LJLIL);
    }

    @Override // X.InterfaceC246289lY
    public void clearData() {
        if (!isViewValid()) {
            return;
        }
        Ll().setState(AnonymousClass950.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public int wl() {
        if (isAdded()) {
            if (((ViewGroup) _$_findCachedViewById(R.id.gts)).getChildCount() > 0) {
                View endingView = ((ViewGroup) _$_findCachedViewById(R.id.gts)).getChildAt(((ViewGroup) _$_findCachedViewById(R.id.gts)).getChildCount() - 1);
                Z8A z8a = Z8A.LIZIZ;
                o.LJIIIIZZ(endingView, "endingView");
                return z8a.getViewRawBottomY(endingView);
            }
            if (_$_findCachedViewById(R.id.gu2).getVisibility() == 0) {
                Z8A z8a2 = Z8A.LIZIZ;
                View music_tab_status_view_slot = _$_findCachedViewById(R.id.gu2);
                o.LJIIIIZZ(music_tab_status_view_slot, "music_tab_status_view_slot");
                return z8a2.getViewRawBottomY(music_tab_status_view_slot);
            }
            return super.wl();
        }
        return super.wl();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void Dl(boolean z) {
        this.LJLIL = z;
        if (isAdded()) {
            Ll().LJLJI = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void H5(boolean z) {
        InterfaceC242139er interfaceC242139er = this.LJLL;
        if (interfaceC242139er != null) {
            interfaceC242139er.H5(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void K7(boolean z) {
        InterfaceC242139er interfaceC242139er = this.LJLL;
        if (interfaceC242139er != null) {
            interfaceC242139er.K7(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void Kh(boolean z) {
        InterfaceC242139er interfaceC242139er = this.LJLL;
        if (interfaceC242139er != null) {
            interfaceC242139er.Kh(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void Pf(boolean z) {
        InterfaceC242139er interfaceC242139er = this.LJLL;
        if (interfaceC242139er != null) {
            interfaceC242139er.Pf(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void Sj(boolean z) {
        InterfaceC242139er interfaceC242139er = this.LJLL;
        if (interfaceC242139er != null) {
            interfaceC242139er.Sj(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void Yk(boolean z) {
        InterfaceC242139er interfaceC242139er = this.LJLL;
        if (interfaceC242139er != null) {
            interfaceC242139er.Yk(z);
        }
    }

    @Override // X.InterfaceC246289lY
    public void o3(InterfaceC26350AVu interfaceC26350AVu) {
        this.LJLJL = interfaceC26350AVu;
        if (isAdded()) {
            Ll().LJLIL = interfaceC26350AVu;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        o.LJIIIZ(activity, "activity");
        super.onAttach(activity);
        if (C7Y8.LIZ() && Nl()) {
            try {
                OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                optionCheckUpdateParams.setLazyUpdate(true);
                String accessKey = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAccessKey();
                C61520OCm LIZ = O3E.LIZ(accessKey);
                if (LIZ != null) {
                    LIZ.LIZ(null, C51029K0z.LJJIIZI(new OSZ(accessKey, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel("music_artist_release")))), optionCheckUpdateParams);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x012e, code lost:
    
        if (r12.LIZIZ.containsKey(new X.C62582cw(r5, serviceKey())) != false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.8VA, T] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onHiddenChanged(boolean r18) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.OriginMusicListNewFragment.onHiddenChanged(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013c, code lost:
    
        if (r12.LIZIZ.containsKey(new X.C62582cw(r5, serviceKey())) != false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.8VA, T] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setUserVisibleHint(boolean r18) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.OriginMusicListNewFragment.setUserVisibleHint(boolean):void");
    }

    @Override // X.InterfaceC246289lY
    public void setUsername(String str) {
        this.LJLJJLL = str;
        if (isAdded()) {
            Ll().LJLILLLLZI = this.LJLJJLL;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        Ll().LJLIL = this.LJLJL;
        Ll().LJLJI = this.LJLIL;
        Ll().LJLILLLLZI = this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS170S0100000_4(this, 406));
        this.LJLJLJ = (InterfaceC242159et) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC242159et.class));
        this.LJLJLLL = (InterfaceC242149es) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC242149es.class));
        this.LJLL = (InterfaceC242139er) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC242139er.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if (r9.LIZIZ.containsKey(new X.C62582cw(r2, serviceKey())) == false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8VA, T] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.8VA, T] */
    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ye(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.OriginMusicListNewFragment.ye(java.lang.String, java.lang.String):void");
    }

    public View Hl(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int bottomBarHeight;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c7r, viewGroup, false);
        if (LLLLIILL != null) {
            OriginMusicArg Kl = Kl();
            if (Kl != null && (bottomBarHeight = Kl.getBottomBarHeight()) > 0) {
                LLLLIILL.setPadding(0, 0, 0, bottomBarHeight);
                return LLLLIILL;
            }
            return LLLLIILL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void N0(int i, float f, int i2) {
        InterfaceC242159et interfaceC242159et = this.LJLJLJ;
        if (interfaceC242159et != null) {
            interfaceC242159et.N0(i, f, i2);
        }
    }

    public static View Il(OriginMusicListNewFragment originMusicListNewFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View Hl = originMusicListNewFragment.Hl(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(Hl instanceof View)) {
            Hl = null;
        }
        if (Hl != null) {
            try {
                ViewTreeLifecycleOwner.set(Hl, originMusicListNewFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(Hl, originMusicListNewFragment);
                C10A.LIZIZ(Hl, originMusicListNewFragment);
                ActivityC45651qj mo49getActivity = originMusicListNewFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return Hl;
    }
}
