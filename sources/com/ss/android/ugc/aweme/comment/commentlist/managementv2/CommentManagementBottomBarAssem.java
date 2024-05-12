package com.ss.android.ugc.aweme.comment.commentlist.managementv2;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C175536uj;
import X.C175716v1;
import X.C212428Vi;
import X.C214298b3;
import X.C26045AKb;
import X.C26231ARf;
import X.C38333F2r;
import X.C41424GNo;
import X.C53816LAe;
import X.C55096Ljo;
import X.C55247LmF;
import X.C61898ORa;
import X.C65352Pkq;
import X.C78926UyI;
import X.C79004UzY;
import X.C79045V0n;
import X.C8YN;
import X.C9BD;
import X.C9XU;
import X.DialogInterfaceC39771hF;
import X.G27;
import X.InterfaceC55251LmJ;
import X.K14;
import X.LFH;
import X.ORY;
import X.TBV;
import Y.ACListenerS23S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.comment.commentlist.api.UserBatchBlockResponse;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class CommentManagementBottomBarAssem extends UISlotAssem implements G27 {
    public boolean LJLJLLL;
    public TextView LJLL;
    public TextView LJLLI;
    public View LJLLILLLL;
    public final C214298b3 LJLLJ;
    public C41424GNo LJLLL;
    public DialogInterfaceC39771hF LJLLLL;
    public C26231ARf LJLLLLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.w_;
    }

    public CommentManagementBottomBarAssem() {
        new LinkedHashMap();
        this.LJLLJ = C78926UyI.LJ(this, C65352Pkq.LIZ(CommentManagementAssemVM.class), C9BD.LIZ, new AqS153S0100000_3(this, 84), C175716v1.INSTANCE, null);
    }

    public final CommentManagementAssemVM I3() {
        return (CommentManagementAssemVM) this.LJLLJ.getValue();
    }

    public final C175536uj H3() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(this), C175536uj.class, "source_default_key");
        if (LIZLLL != null) {
            return (C175536uj) LIZLLL.getSource();
        }
        return null;
    }

    public final void L3() {
        I3().gv0();
        this.LJLJLLL = false;
        TextView textView = this.LJLL;
        if (textView != null) {
            textView.setEnabled(false);
            Context context = textView.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.gp, context);
            if (LJI != null) {
                textView.setTextColor(LJI.intValue());
                textView.setText(R.string.dj8);
            } else {
                return;
            }
        }
        TextView textView2 = this.LJLLI;
        if (textView2 != null) {
            textView2.setEnabled(false);
            Context context2 = textView2.getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.gp, context2);
            if (LJI2 != null) {
                textView2.setTextColor(LJI2.intValue());
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLL = (TextView) view.findViewById(R.id.itf);
        this.LJLLI = (TextView) view.findViewById(R.id.ith);
        this.LJLLILLLL = view;
        TextView textView = this.LJLL;
        if (textView != null) {
            C16880lQ.LJIJI(textView, new ACListenerS23S0100000_3(this, 15));
        }
        TextView textView2 = this.LJLLI;
        if (textView2 != null) {
            C16880lQ.LJIJI(textView2, new ACListenerS23S0100000_3(this, 16));
        }
        C8YN.LJII(this, I3(), new TBV() { // from class: X.6vJ
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C175886vI) obj).LJLIL;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                C175886vI c175886vI = (C175886vI) obj;
                C43I<Integer> c43i = (C43I) obj2;
                c175886vI.getClass();
                o.LJIIIZ(c43i, "<set-?>");
                c175886vI.LJLIL = c43i;
            }
        }, null, new AqS185S0100000_3(this, 14), 6);
        C8YN.LJII(this, I3(), new TBV() { // from class: X.6vG
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C175886vI) obj).LJLILLLLZI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                C175886vI c175886vI = (C175886vI) obj;
                C43I<Boolean> c43i = (C43I) obj2;
                c175886vI.getClass();
                o.LJIIIZ(c43i, "<set-?>");
                c175886vI.LJLILLLLZI = c43i;
            }
        }, null, new AqS185S0100000_3(this, 15), 6);
        C8YN.LJII(this, I3(), new TBV() { // from class: X.6vL
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C175886vI) obj).LJLJI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C175886vI) obj).LJLJI = (C43I) obj2;
            }
        }, null, new AqS185S0100000_3(this, 16), 6);
        C8YN.LJII(this, I3(), new TBV() { // from class: X.6vM
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C175886vI) obj).LJLJJL;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C175886vI) obj).LJLJJL = (C43I) obj2;
            }
        }, null, new AqS185S0100000_3(this, 12), 6);
        C8YN.LJII(this, I3(), new TBV() { // from class: X.6vK
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C175886vI) obj).LJLJJI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C175886vI) obj).LJLJJI = (C43I) obj2;
            }
        }, null, new AqS185S0100000_3(this, 13), 6);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C9XU.LIZIZ(LIZ, this);
        }
    }

    public final void K3(Throwable th, Set set) {
        String str;
        String[] strArr;
        Collection<?> LJIILL;
        if (th instanceof C38333F2r) {
            Object rawResponse = ((C38333F2r) th).getRawResponse();
            o.LJII(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.commentlist.api.UserBatchBlockResponse");
            UserBatchBlockResponse userBatchBlockResponse = (UserBatchBlockResponse) rawResponse;
            if (!TextUtils.isEmpty(userBatchBlockResponse.blockFailToUserIds) && !C79004UzY.LJJIFFI(set) && (str = userBatchBlockResponse.blockFailToUserIds) != null && (strArr = (String[]) s.LJLJJL(str, new String[]{","}, 0, 6).toArray(new String[0])) != null && set.containsAll(ORY.LJJZZIII(strArr)) && strArr.length != 0) {
                if (K14.LIZ) {
                    LJIILL = ORY.LJJLIL(strArr);
                } else {
                    LJIILL = C61898ORa.LJIILL(strArr);
                }
                set.removeAll(LJIILL);
            }
        }
        if (!C79004UzY.LJJIFFI(set)) {
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL == null) {
                return;
            }
            C26045AKb c26045AKb = new C26045AKb(LIZLLL);
            c26045AKb.LJIIIIZZ(R.string.djc);
            c26045AKb.LJIIJ();
            return;
        }
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 == null) {
            return;
        }
        C26045AKb c26045AKb2 = new C26045AKb(LIZLLL2);
        c26045AKb2.LJIIIIZZ(R.string.dj4);
        c26045AKb2.LJIIJ();
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        LFH.LIZIZ.LIZLLL().LJIILIIL();
        if (C53816LAe.LJIIIIZZ()) {
            DialogInterfaceC39771hF dialogInterfaceC39771hF = this.LJLLLL;
            if (dialogInterfaceC39771hF != null) {
                dialogInterfaceC39771hF.dismiss();
            }
            C26231ARf c26231ARf = this.LJLLLLLL;
            if (c26231ARf != null) {
                c26231ARf.LIZIZ(null);
            }
        }
    }
}
