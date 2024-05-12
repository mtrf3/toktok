package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.C1JI;
import X.C214348b8;
import X.C46314IFq;
import X.C49098JOs;
import X.C5H3;
import X.C61328O5c;
import X.C65352Pkq;
import X.C72434Sbm;
import X.C78897Uxp;
import X.C8XO;
import X.JKK;
import X.JKL;
import X.JKM;
import X.JKN;
import X.JON;
import X.JQ0;
import Y.IDTListenerS117S0100000_8;
import Y.IDTListenerS90S0200000_8;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchPhotoFeedbackAssem extends ReusedUIContentAssem<SearchPhotoFeedbackAssem> implements C8XO<JKM> {
    public final C5H3 LJZL;
    public Aweme LL;
    public FrameLayout LLD;
    public TextView LLF;
    public C72434Sbm LLFF;
    public TextView LLFFF;
    public TextView LLFII;
    public JON LLFZ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchPhotoFeedbackAssem() {
        new LinkedHashMap();
        this.LJZL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(SearchPhotoViewModel.class), JKL.INSTANCE);
    }

    public final void a4() {
        Z3(this.LLD);
        TextView textView = this.LLF;
        if (textView != null) {
            Z3(textView);
            C72434Sbm c72434Sbm = this.LLFF;
            if (c72434Sbm != null) {
                Z3(c72434Sbm);
                TextView textView2 = this.LLFFF;
                if (textView2 != null) {
                    Z3(textView2);
                    TextView textView3 = this.LLFII;
                    if (textView3 != null) {
                        Z3(textView3);
                        return;
                    } else {
                        o.LJIJI("txtLikeCount");
                        throw null;
                    }
                }
                o.LJIJI("txtAuthorName");
                throw null;
            }
            o.LJIJI("authorAvatar");
            throw null;
        }
        o.LJIJI("txtDesc");
        throw null;
    }

    public final void b4() {
        int i;
        FrameLayout frameLayout;
        if (JQ0.LIZ() && (frameLayout = this.LLD) != null) {
            frameLayout.setOnTouchListener(new IDTListenerS117S0100000_8(this, 12));
        }
        FrameLayout frameLayout2 = this.LLD;
        if (frameLayout2 != null) {
            C49098JOs.LIZ.getClass();
            Integer valueOf = Integer.valueOf(C49098JOs.LIZLLL());
            if (valueOf.intValue() > 0) {
                i = valueOf.intValue();
            } else {
                i = 4;
            }
            C1JI.LJJIIZ(frameLayout2, C61328O5c.LIZJ(i), null, null, null, null, 30);
        }
    }

    @Override // X.C8XO
    public final void F0(JKM jkm) {
        JKM item = jkm;
        o.LJIIIZ(item, "item");
        this.LL = item.LJLIL;
        ((SearchPhotoViewModel) this.LJZL.getValue()).LJLILLLLZI = item.LJLILLLLZI;
        if (!SearchVideoAndUserOptimizeExperiment.LIZ()) {
            b4();
            a4();
            JON jon = this.LLFZ;
            if (jon != null) {
                C78897Uxp.LJJJJLI(jon, null);
            }
        }
    }

    public final void Z3(View view) {
        if (view != null) {
            JKK jkk = new JKK(this, view.getContext());
            jkk.LJLJLJ = new JKN(view, this);
            jkk.LJLJLLL = new IDTListenerS90S0200000_8(view, this, 1);
            view.setOnTouchListener(jkk);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(JKM jkm) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLD = (FrameLayout) view.findViewById(R.id.jgz);
        View findViewById = view.findViewById(R.id.desc);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.desc)");
        this.LLF = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.fqv);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.like_and_play_count)");
        this.LLFII = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.aa0);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.author_name)");
        this.LLFFF = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.a_v);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.author_avatar)");
        this.LLFF = (C72434Sbm) findViewById4;
        if (C46314IFq.LIZIZ()) {
            this.LLFZ = (JON) view.findViewById(R.id.k7p);
        }
        if (SearchVideoAndUserOptimizeExperiment.LIZ()) {
            b4();
            a4();
            JON jon = this.LLFZ;
            if (jon != null) {
                C78897Uxp.LJJJJLI(jon, null);
            }
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(JKM jkm) {
    }
}
