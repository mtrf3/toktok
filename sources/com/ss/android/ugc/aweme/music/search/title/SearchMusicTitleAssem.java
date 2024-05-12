package com.ss.android.ugc.aweme.music.search.title;

import X.C16880lQ;
import X.C19K;
import X.C214298b3;
import X.C239409aS;
import X.C239419aT;
import X.C32151Nz;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C99W;
import X.C9BE;
import X.InterfaceC239449aW;
import X.KL2;
import X.OUP;
import X.T5T;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import Y.ARunnableS23S0200000_4;
import Y.AUListenerS90S0100000_1;
import Y.AUListenerS91S0100000_2;
import Y.IDObjectS177S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.ss.android.ugc.aweme.music.search.title.SearchMusicTitleAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchMusicTitleAssem extends UIContentAssem {
    public final long LJLIL;
    public final C214298b3 LJLILLLLZI;

    public SearchMusicTitleAssem() {
        new LinkedHashMap();
        this.LJLIL = 300L;
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 483);
        C65776Prg LIZ = C65352Pkq.LIZ(SearchMusicListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 484), C239419aT.INSTANCE, aqS154S0100000_4);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        o.LJIIIZ(view, "view");
        C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.eys), new ACListenerS24S0100000_4(this, 92));
        C16880lQ.LJJJJI((TuxTextView) view.findViewById(R.id.m7l), new ACListenerS39S0200000_4(this, view, 22));
        ((C239409aS) view.findViewById(R.id.kw5)).setDispatchTouchEventListener(new InterfaceC239449aW() { // from class: X.9aV
            @Override // X.InterfaceC239449aW
            public final void LIZ() {
                SearchMusicTitleAssem.this.v3(view);
            }
        });
        ((TextView) view.findViewById(R.id.czx)).addTextChangedListener(new IDObjectS177S0100000_4(this, 5));
        ((TextView) view.findViewById(R.id.czx)).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.9aU
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 3) {
                    SearchMusicTitleAssem.this.v3(view);
                    return true;
                }
                return true;
            }
        });
        T5T t5t = (T5T) view.findViewById(R.id.czx);
        t5t.post(new ARunnableS23S0200000_4(t5t, view, 13));
        int measureText = (int) ((TextView) view.findViewById(R.id.m7l)).getPaint().measureText(((AppCompatTextView) view.findViewById(R.id.m7l)).getText().toString());
        if (C99W.LIZ) {
            OUP.LJJJJLI(view.findViewById(R.id.g5v), Float.valueOf(C32151Nz.LJIIZILJ(6)), null, null, 30);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS90S0100000_1(view, 39));
        ofFloat.setDuration(this.LJLIL);
        ValueAnimator ofInt = ValueAnimator.ofInt((int) KL2.LIZJ(view.getContext(), 16.0f), ((int) KL2.LIZJ(view.getContext(), 32.0f)) + measureText);
        ofInt.addUpdateListener(new AUListenerS90S0100000_1(view, 40));
        ofInt.setDuration(this.LJLIL);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((measureText / 2.0f) + (-KL2.LIZJ(view.getContext(), 16.0f)), 0.0f);
        ofFloat2.addUpdateListener(new AUListenerS91S0100000_2(view, 35));
        ofFloat2.setDuration(this.LJLIL);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt).with(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public final void v3(View view) {
        if (String.valueOf(((C19K) view.findViewById(R.id.czx)).getText()).length() > 0) {
            KeyboardUtils.LIZIZ(view.findViewById(R.id.czx));
        }
    }
}
