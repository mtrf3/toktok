package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.ActivityC45651qj;
import X.C122284r2;
import X.C124994vP;
import X.C1280450u;
import X.C139795eB;
import X.C145995oB;
import X.C150045ui;
import X.C150055uj;
import X.C29S;
import X.C5G0;
import X.C5QW;
import X.C78880UxY;
import X.C79057V0z;
import X.EnumC126814yL;
import X.FMX;
import X.H7R;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SoundFilterFragment extends TTResourcePanelFragment<CutViewModel> {
    public String LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "sound_filter_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
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

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int xl() {
        return R.layout.asx;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Il() {
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        String str;
        String nameId = EnumC126814yL.CHANGE_FILTER.getNameId();
        String str2 = this.LJLZ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        VideoPublishEditModel em = em();
        if (em != null && (creativeModel = em.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null && (str = musicBuzModel.soundFilterId) != null) {
            str3 = str;
        }
        return C78880UxY.LJLILLLLZI(new C139795eB(nameId, str2, str3, null, null, 24));
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(CutViewModel.class);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        EditorProContext Jl;
        VideoPublishEditModel em = em();
        if (em != null && (Jl = Jl()) != null) {
            C145995oB LJFF = C5QW.LJFF(em, Jl);
            LJFF.LIZ(1, "is_editor_pro");
            FMX.LJIIL("cancel_sound_filter", LJFF.LIZ);
        }
        super.Sl();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        VideoPublishEditModel em = em();
        if (em != null) {
            EditorProContext Jl = Jl();
            EditorProContext.Companion.getClass();
            String valueOf = String.valueOf(C122284r2.LIZJ(C79057V0z.LJJ(C124994vP.LIZ())));
            if (Jl != null) {
                C145995oB LJFF = C5QW.LJFF(em, Jl);
                LJFF.LIZ(1, "is_editor_pro");
                LJFF.LJI("sound_filter_id", valueOf);
                FMX.LJIIL("save_sound_filter", LJFF.LIZ);
            }
        }
        super.V3();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C1280450u.LIZ()) {
            _$_findCachedViewById(R.id.a6v).setVisibility(4);
            _$_findCachedViewById(R.id.a6v).setClickable(false);
            String string = getString(R.string.rgs);
            o.LJIIIIZZ(string, "getString(R.string.soundsremix_status_soundfilter)");
            Yl(string);
            EditorProContext.Companion.getClass();
            NLEEditor LJJ = C79057V0z.LJJ(C124994vP.LIZ());
            VideoPublishEditModel em = em();
            String str6 = null;
            if (em != null && (creativeModel = em.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
                str = musicBuzModel.soundFilterId;
            } else {
                str = null;
            }
            AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(this, 334);
            VideoPublishEditModel em2 = em();
            if (em2 != null) {
                str2 = em2.getCreationId();
            } else {
                str2 = null;
            }
            VideoPublishEditModel em3 = em();
            if (em3 != null) {
                str3 = H7R.LJIIIIZZ(em3);
            } else {
                str3 = null;
            }
            VideoPublishEditModel em4 = em();
            if (em4 != null) {
                str4 = H7R.LJIIIZ(em4);
            } else {
                str4 = null;
            }
            VideoPublishEditModel em5 = em();
            if (em5 != null) {
                str5 = em5.getMusicId();
            } else {
                str5 = null;
            }
            VideoPublishEditModel em6 = em();
            if (em6 != null) {
                str6 = em6.mShootWay;
            }
            C150045ui c150045ui = new C150045ui(LJJ, str, aqS168S0100000_2, new C150055uj(str2, str3, str4, str5, str6, 1));
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            C29S c29s = (C29S) mo49getActivity;
            View view2 = this.LJLLLL;
            o.LJII(view2, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) view2;
            VideoPublishEditModel em7 = em();
            if (em7 != null) {
                CreativeModel creativeModel2 = em7.creativeModel;
            }
            c150045ui.LIZJ(c29s, frameLayout);
        }
    }
}
