package com.ss.android.ugc.aweme.feed.assem.music.artistprofile;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C7YL;
import X.C8VV;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ArtistProfileTuxSheetFragment extends Fragment implements InterfaceC219588ja {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C234529Ii c234529Ii = new C234529Ii();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark_small;
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new AqS153S0100000_3(this, 349));
        C9KF c9kf = new C9KF();
        String string = getString(R.string.ii7);
        o.LJIIIIZZ(string, "getString(R.string.music_fyp_more_artists_list)");
        c9kf.LIZJ = string;
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZIZ(c234529Ii);
        c235119Kp.LIZLLL = true;
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        Aweme aweme;
        Serializable serializable2;
        Music music;
        String str;
        String str2;
        boolean z;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("extra_aweme");
        } else {
            serializable = null;
        }
        if (serializable instanceof Aweme) {
            aweme = (Aweme) serializable;
        } else {
            aweme = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("extra_music");
        } else {
            serializable2 = null;
        }
        if (serializable2 instanceof Music) {
            music = (Music) serializable2;
        } else {
            music = null;
        }
        Bundle arguments3 = getArguments();
        String str3 = "";
        if (arguments3 == null || (str = arguments3.getString("extra_artist_profile", "")) == null) {
            str = "";
        }
        List LIZIZ = JsonParseUtils.LIZIZ(MusicOwnerInfo.class, str);
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str2 = arguments4.getString("extra_enter_type", "")) == null) {
            str2 = "";
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string = arguments5.getString("extra_enter_method", "")) != null) {
            str3 = string;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            z = arguments6.getBoolean("extra_show_follow_btn", false);
        } else {
            z = false;
        }
        C8VV.LIZ(this, false, new C7YL(this, aweme, music, LIZIZ, str2, str3, z, view));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aav, viewGroup, false);
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
