package com.ss.android.ugc.gamora.editorpro.guide;

import X.ActivityC45651qj;
import X.C00F;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29701Eo;
import X.C29S;
import X.C3C5;
import X.C58B;
import X.C60996Nwm;
import X.C76800UCe;
import X.C90903hW;
import X.SY4;
import Y.ACListenerS22S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditorProGuideFragment extends Fragment {
    public TuxSheet LJLILLLLZI;
    public VideoPublishEditModel LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final String LJLIL = "editorproguide.json";

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C29701Eo c29701Eo = (C29701Eo) view.findViewById(R.id.ga_);
        View findViewById = view.findViewById(R.id.hif);
        TextView textView = (TextView) view.findViewById(R.id.title);
        findViewById.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) ((C60996Nwm.LJIIJ(getContext()) * 184.0f) / 375.0f)));
        c29701Eo.setAnimation(this.LJLIL);
        c29701Eo.setRepeatCount(-1);
        c29701Eo.setRepeatMode(1);
        c29701Eo.post(new ARunnableS38S0100000_2(c29701Eo, 117));
        int LIZ = C00F.LIZ(31744, 0, "studio_editor_pro_change_adjust_clip_name", true);
        if (LIZ != 1) {
            if (LIZ != 2) {
                if (LIZ != 3) {
                    if (LIZ != 4) {
                        if (LIZ != 5) {
                            i = R.string.ina;
                        } else {
                            i = R.string.fpv;
                        }
                    } else {
                        i = R.string.fpy;
                    }
                } else {
                    i = R.string.fpw;
                }
            } else {
                i = R.string.fpx;
            }
        } else {
            i = R.string.fpz;
        }
        textView.setText(i);
        SY4 sy4 = (SY4) view.findViewById(R.id.h_w);
        if (C58B.LIZ()) {
            sy4.getClass();
        }
        C16880lQ.LJJIZ(sy4, new ACListenerS22S0100000_2(this, 69));
        C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 70), view.findViewById(R.id.bfj));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.asi, viewGroup, false);
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
