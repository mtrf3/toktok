package com.ss.android.ugc.gamora.editorpro.audio;

import X.ActivityC45651qj;
import X.AnonymousClass512;
import X.AnonymousClass525;
import X.C10A;
import X.C124604um;
import X.C127834zz;
import X.C1284452i;
import X.C1290254o;
import X.C1290454q;
import X.C132805Jc;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C50Q;
import X.C56S;
import X.C58D;
import X.C5HC;
import X.C5UU;
import X.C62822Ol8;
import X.C76800UCe;
import X.C79057V0z;
import X.C90903hW;
import X.InterfaceC1290554r;
import X.InterfaceC45540Hu4;
import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.audio.AudioRecordFragment;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.IFunctionBarService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.TrackState;
import com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioRecordFragment extends Fragment {
    public static final /* synthetic */ int LJLLJ = 0;
    public boolean LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final String[] LJLIL = {"android.permission.RECORD_AUDIO"};
    public final C1290454q LJLILLLLZI = new C5HC() { // from class: X.54q
        @Override // X.C5HC
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            AudioRecordFragment.this.vl();
            return true;
        }
    };
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 566));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(AnonymousClass512.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C1290254o.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 563));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 565));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 564));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C56S.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 562));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C1284452i Al() {
        return (C1284452i) this.LJLJJI.getValue();
    }

    public final VideoPublishEditModel Dl() {
        return C132805Jc.LIZIZ(EditModelProvider.Companion);
    }

    public final EditorProContext wl() {
        return (EditorProContext) this.LJLJJL.getValue();
    }

    public final AudioRecordFragmentViewModel xl() {
        return (AudioRecordFragmentViewModel) this.LJLJI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LJLLI) {
            this.LJLLI = true;
            C79057V0z.LJJJJL(wl(), "event_open_audio_record", Boolean.FALSE);
            ((InterfaceC1290554r) this.LJLJLJ.getValue()).LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) this.LJLL.getValue();
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(this.LJLILLLLZI);
        }
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (((C5UU) _$_findCachedViewById(R.id.a__)).LJLILLLLZI) {
            ((C5UU) _$_findCachedViewById(R.id.a__)).LIZ();
        }
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
    }

    public final void vl() {
        C50Q funcBarController;
        AnonymousClass525 LJI;
        C58D c58d;
        TrackPanelViewModel trackPanelViewModel;
        C58D c58d2;
        C58D c58d3;
        C50Q funcBarController2;
        AnonymousClass525 LJI2;
        if (((C5UU) _$_findCachedViewById(R.id.a__)).LJLILLLLZI) {
            ((C5UU) _$_findCachedViewById(R.id.a__)).LIZ();
        }
        this.LJLLI = true;
        C79057V0z.LJJJJL(wl(), "event_open_audio_record", Boolean.FALSE);
        ((InterfaceC1290554r) this.LJLJLJ.getValue()).LIZLLL();
        if (xl().LJLLLLLL) {
            C1284452i Al = Al();
            if (Al != null) {
                Al.LJIJJLI(TrackState.AUDIO);
            }
            IFunctionBarService LIZ = C127834zz.LIZ();
            if (LIZ != null && (funcBarController2 = LIZ.getFuncBarController()) != null && (LJI2 = funcBarController2.LJI()) != null) {
                LJI2.LJII("bottom_item_root_sound");
            }
            C1284452i Al2 = Al();
            if (Al2 != null && (c58d3 = Al2.LJLIL) != null) {
                c58d3.showOrHideNullAudioTrack(C124604um.LJIIIZ(wl()));
            }
            C1284452i Al3 = Al();
            if (Al3 != null && (c58d2 = Al3.LJLIL) != null) {
                c58d2.showOrHideNullEffectTrack(false);
            }
            VideoPublishEditModel Dl = Dl();
            if (Dl != null) {
                ((AudioRecordActivityViewModel) this.LJLJJLL.getValue()).lv0(wl(), Dl, 0L);
                return;
            }
            return;
        }
        C1284452i Al4 = Al();
        if (Al4 != null && (trackPanelViewModel = Al4.LJLILLLLZI) != null && trackPanelViewModel.ov0()) {
            C1284452i Al5 = Al();
            if (Al5 != null) {
                Al5.LJIJJLI(TrackState.NORMAL);
            }
        } else {
            C1284452i Al6 = Al();
            if (Al6 != null) {
                Al6.LJIJJLI(TrackState.AUDIO);
            }
            IFunctionBarService LIZ2 = C127834zz.LIZ();
            if (LIZ2 != null && (funcBarController = LIZ2.getFuncBarController()) != null && (LJI = funcBarController.LJI()) != null) {
                LJI.LJII("bottom_item_root_sound");
            }
        }
        C1284452i Al7 = Al();
        if (Al7 == null || (c58d = Al7.LJLIL) == null) {
            return;
        }
        c58d.showOrHideNullAudioTrack(C124604um.LJIIIZ(wl()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C79057V0z.LJJJJL(wl(), "event_open_audio_record", Boolean.TRUE);
        ((InterfaceC1290554r) this.LJLJLJ.getValue()).LIZJ();
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.cpi), new ACListenerS22S0100000_2(this, 132));
        ((C5UU) _$_findCachedViewById(R.id.a__)).setOnPermissionCheck(new AqS152S0100000_2(this, 857));
        ((C5UU) _$_findCachedViewById(R.id.a__)).setOnRecordStart(new AqS168S0100000_2(this, 511));
        ((C5UU) _$_findCachedViewById(R.id.a__)).setOnRecordStop(new AqS168S0100000_2(this, 512));
        xl().LJLILLLLZI.observe(this, new AObserverS70S0100000_2(this, 277));
        xl().LJLJJI.observe(this, new AObserverS70S0100000_2(this, 278));
        xl().LJLJJLL.observe(this, new AObserverS70S0100000_2(this, 279));
        xl().LJLJLJ.observe(this, new AObserverS70S0100000_2(this, 280));
        InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) this.LJLL.getValue();
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.registerActivityOnKeyDownListener(this.LJLILLLLZI);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bj9, viewGroup, false);
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
