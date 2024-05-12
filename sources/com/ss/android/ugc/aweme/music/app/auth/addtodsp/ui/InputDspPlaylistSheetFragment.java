package com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C26018AJa;
import X.C26021AJd;
import X.C29S;
import X.C3C5;
import X.C6J7;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.C94137ac9;
import X.C94346afW;
import X.C9KF;
import X.EF7;
import X.EnumC26023AJf;
import X.InterfaceC219588ja;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class InputDspPlaylistSheetFragment extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public boolean LJLJL;
    public TT2DSPSongInfo LJLJLJ;
    public boolean LJLL;
    public C26018AJa LJLLI;
    public C26021AJd LJLLILLLL;
    public C6J7 LJLLJ;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public String LJLIL = "";
    public String LJLILLLLZI = "homepage_hot";
    public String LJLJI = "";
    public String LJLJJI = "";
    public String LJLJJL = "";
    public String LJLJJLL = "";
    public String LJLJLLL = "";
    public final C94137ac9 LJLLL = new C94137ac9(this);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLLL;
        Integer valueOf = Integer.valueOf(R.id.kpl);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.kpl)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        Serializable serializable;
        TT2DSPSongInfo tT2DSPSongInfo;
        Context context = getContext();
        if (context == null) {
            context = EF7.LIZIZ();
        }
        C234529Ii c234529Ii = new C234529Ii();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_chevron_left_offset_ltr;
        c2068389v.LIZLLL = C79045V0n.LJI(R.attr.go, context);
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new IDqS423S0100000_42(this, 61));
        Bundle arguments = getArguments();
        Integer num = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("linked_dsp_song_info");
        } else {
            serializable = null;
        }
        if (serializable instanceof TT2DSPSongInfo) {
            tT2DSPSongInfo = (TT2DSPSongInfo) serializable;
        } else {
            tT2DSPSongInfo = null;
        }
        DspPlatform.Companion companion = DspPlatform.Companion;
        if (tT2DSPSongInfo != null) {
            num = tT2DSPSongInfo.getDspPlatform();
        }
        DspPlatform from = companion.from(num);
        String string = getString(R.string.bag);
        o.LJIIIIZZ(string, "getString(R.string.addMu…p_createNewPlaylistTitle)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{from.getTitle()}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = LLLZ;
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZLLL(c234529Ii);
        c235119Kp.LIZLLL = true;
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        TT2DSPSongInfo tT2DSPSongInfo;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("meta_song_id");
            String str = "";
            if (string == null) {
                string = "";
            }
            this.LJLIL = string;
            String string2 = arguments.getString("enter_from");
            if (string2 == null) {
                string2 = "homepage_hot";
            }
            this.LJLILLLLZI = string2;
            String string3 = arguments.getString("video_id");
            if (string3 == null) {
                string3 = "";
            }
            this.LJLJI = string3;
            String string4 = arguments.getString("id");
            if (string4 == null) {
                string4 = "";
            }
            this.LJLJJI = string4;
            String string5 = arguments.getString("music_volume");
            if (string5 == null) {
                string5 = "";
            }
            this.LJLJJL = string5;
            String string6 = arguments.getString("tt_to_dsp_button_type");
            if (string6 != null) {
                str = string6;
            }
            this.LJLJJLL = str;
            Serializable serializable = arguments.getSerializable("linked_dsp_song_info");
            if (serializable instanceof TT2DSPSongInfo) {
                tT2DSPSongInfo = (TT2DSPSongInfo) serializable;
            } else {
                tT2DSPSongInfo = null;
            }
            this.LJLJLJ = tT2DSPSongInfo;
            this.LJLJL = arguments.getBoolean("is_dsp_auth_from_music_detail");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C26018AJa c26018AJa;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        C6J7 c6j7 = null;
        if (context != null) {
            c26018AJa = new C26018AJa(context, null, 6);
            c26018AJa.LJLJI = 30;
            c26018AJa.LJI(130);
            c26018AJa.LJII(getString(R.string.bah));
            ((TextView) c26018AJa.LIZIZ(R.id.cps)).setSingleLine(true);
        } else {
            c26018AJa = null;
        }
        this.LJLLI = c26018AJa;
        Context context2 = getContext();
        if (context2 != null) {
            c6j7 = new C6J7(context2);
        }
        this.LJLLJ = c6j7;
        C26021AJd c26021AJd = (C26021AJd) view.findViewById(R.id.npb);
        this.LJLLILLLL = c26021AJd;
        if (c26021AJd != null) {
            c26021AJd.LJIIIIZZ(getString(R.string.baf));
            c26021AJd.setFormField(this.LJLLI);
            c26021AJd.LIZJ(EnumC26023AJf.HEADER);
            c26021AJd.LJIIIZ(this.LJLLJ);
            c26021AJd.LIZLLL(getString(R.string.gax));
            C26018AJa c26018AJa2 = this.LJLLI;
            if (c26018AJa2 != null) {
                c26018AJa2.setTuxFieldContentCallback(this.LJLLL);
            }
        }
        View findViewById = view.findViewById(R.id.kpl);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new C94346afW(this), findViewById);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dwd, viewGroup, false);
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
