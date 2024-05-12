package com.ss.android.ugc.aweme.nows.publish.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1DD;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C79158V4w;
import X.C7MK;
import X.C90903hW;
import X.InterfaceC88472Yns;
import X.SY4;
import X.Y54;
import Y.ACListenerS35S0100000_15;
import Y.ARunnableS51S0100000_15;
import Y.IDDListenerS154S0100000_15;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class NowsPublishPopWindowFragment extends Fragment {
    public final C79158V4w LJLIL;
    public final Y54 LJLILLLLZI;
    public final InterfaceC88472Yns<Fragment, C76800UCe> LJLJI;
    public final IDDListenerS154S0100000_15 LJLJJI;
    public boolean LJLJJL;
    public final Handler LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final String vl(int i) {
        return C1DD.LIZLLL(i, "AppContextManager.getApp…onContext().getString(id)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NowsPublishPopWindowFragment(C79158V4w c79158V4w, Y54 y54, InterfaceC88472Yns<? super Fragment, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = c79158V4w;
        this.LJLILLLLZI = y54;
        this.LJLJI = interfaceC88472Yns;
        C7MK.LJII(y54.LIZ, new AqS181S0100000_15(this, 80));
        this.LJLJJI = new IDDListenerS154S0100000_15(this, 0);
        this.LJLJJL = true;
        this.LJLJJLL = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        CardView cardView;
        ImageView imageView;
        SY4 sy4;
        TextView textView;
        TextView textView2;
        TextView textView3;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bxy, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.gl1);
        C29S c29s = null;
        if (findViewById instanceof CardView) {
            cardView = (CardView) findViewById;
        } else {
            cardView = null;
        }
        if (cardView != null) {
            this.LJLJJLL.post(new ARunnableS51S0100000_15(cardView, 34));
        }
        View findViewById2 = LLLLIILL.findViewById(R.id.bfv);
        if (findViewById2 instanceof ImageView) {
            imageView = (ImageView) findViewById2;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS35S0100000_15(this, 113));
        }
        View findViewById3 = LLLLIILL.findViewById(R.id.b20);
        if (findViewById3 instanceof SY4) {
            sy4 = (SY4) findViewById3;
        } else {
            sy4 = null;
        }
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS35S0100000_15(this, 114));
        }
        View findViewById4 = LLLLIILL.findViewById(R.id.lao);
        if (findViewById4 instanceof TuxTextView) {
            textView = (TextView) findViewById4;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(this.LJLIL.LIZ);
        }
        View findViewById5 = LLLLIILL.findViewById(R.id.ks_);
        if (findViewById5 instanceof TuxTextView) {
            textView2 = (TextView) findViewById5;
        } else {
            textView2 = null;
        }
        if (textView2 != null) {
            textView2.setText(this.LJLIL.LIZIZ);
        }
        View findViewById6 = LLLLIILL.findViewById(R.id.b20);
        if (findViewById6 instanceof TuxTextView) {
            textView3 = (TextView) findViewById6;
        } else {
            textView3 = null;
        }
        if (textView3 != null) {
            textView3.setText(this.LJLIL.LIZJ);
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
