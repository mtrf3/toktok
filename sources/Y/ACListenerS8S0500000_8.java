package Y;

import X.ActivityC45651qj;
import X.C49489JbZ;
import X.C49604JdQ;
import X.C50600JtU;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50699Jv5;
import X.C50948Jz6;
import X.C6ZT;
import X.InterfaceC50036JkO;
import X.JKG;
import X.JL4;
import X.JL9;
import X.JLF;
import X.JON;
import X.JP4;
import X.JQA;
import X.JSL;
import X.JV9;
import X.X1D;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ACListenerS8S0500000_8 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS8S0500000_8 aCListenerS8S0500000_8, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aCListenerS8S0500000_8.l0;
        o.LJII(activityC45651qj, "null cannot be cast to non-null type android.content.Context");
        new C50699Jv5((Context) activityC45651qj).LJI();
        ClickSearchWord clickSearchWord = (ClickSearchWord) aCListenerS8S0500000_8.l1;
        JP4 jp4 = (JP4) aCListenerS8S0500000_8.l2;
        C49604JdQ.LIZJ(clickSearchWord, jp4.LIZJ, jp4.LIZIZ, (JQA) aCListenerS8S0500000_8.l3);
        SearchResultParam param = new SearchResultParam();
        param.setLastSearchId(((JV9) aCListenerS8S0500000_8.l4).LJLJI.LJII);
        param.setSearchFrom("click_recom");
        param.setKeyword(((JV9) aCListenerS8S0500000_8.l4).LJLIL.word);
        ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) aCListenerS8S0500000_8.l0;
        o.LJIIIIZZ(param, "param");
        C50948Jz6 searchEnterParam = param.getSearchEnterParam();
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj activityC45651qj3 = (ActivityC45651qj) aCListenerS8S0500000_8.l0;
        c50651JuJ.getClass();
        C50600JtU.LIZIZ(activityC45651qj2, param, searchEnterParam, null, C50651JuJ.LJIIJ(activityC45651qj3), 40);
    }

    public static final void onClick$1(ACListenerS8S0500000_8 aCListenerS8S0500000_8, View view) {
        JSL jsl;
        boolean z;
        JON n0 = ((JKG) aCListenerS8S0500000_8.l0).n0();
        if (n0 != null) {
            n0.setVisibility(8);
        }
        C49489JbZ c49489JbZ = C49489JbZ.LIZ;
        Aweme aweme = (Aweme) aCListenerS8S0500000_8.l1;
        JL9 jl9 = (JL9) aCListenerS8S0500000_8.l2;
        InterfaceC50036JkO interfaceC50036JkO = (InterfaceC50036JkO) aCListenerS8S0500000_8.l3;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        String livePlayerTag = ((JKG) aCListenerS8S0500000_8.l0).c0().getLivePlayerTag();
        Context context = ((JKG) aCListenerS8S0500000_8.l0).itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        c49489JbZ.getClass();
        C49489JbZ.LIZIZ(aweme, jl9, interfaceC50036JkO, enterRoomConfig, livePlayerTag, context);
        ((JKG) aCListenerS8S0500000_8.l0).t0("search_result_click", (Aweme) aCListenerS8S0500000_8.l1, (JQA) aCListenerS8S0500000_8.l4);
        JLF jlf = ((JKG) aCListenerS8S0500000_8.l0).LJLLILLLL;
        if (jlf != null) {
            Aweme currentRoom = (Aweme) aCListenerS8S0500000_8.l1;
            o.LJIIIZ(currentRoom, "currentRoom");
            Taco taco = (Taco) jlf.LIZ.LJZ.getValue();
            if (taco != null) {
                jsl = taco.LJFF(18);
            } else {
                jsl = null;
            }
            JL4 jl4 = jlf.LIZ;
            if (jsl != null) {
                z = o.LJ(jsl.isActive(), Boolean.TRUE);
            } else {
                z = false;
            }
            jl4.LJZI = z;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("enter ");
            LIZ.append(jlf.LIZ.LJZI);
            X1D.LIZIZ(LIZ);
        }
    }

    public ACListenerS8S0500000_8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
