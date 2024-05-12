package com.ss.android.ugc.aweme.setting.serverpush.ui;

import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C234529Ii;
import X.C235119Kp;
import X.C26018AJa;
import X.C26021AJd;
import X.C26031AJn;
import X.C26032AJo;
import X.C26034AJq;
import X.C29S;
import X.C3C5;
import X.C45631qh;
import X.C6J7;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.EnumC26023AJf;
import X.FMX;
import X.InterfaceC219588ja;
import X.InterfaceC26036AJs;
import X.InterfaceC26038AJu;
import X.ORZ;
import X.SY4;
import Y.ACListenerS24S0100000_4;
import Y.IDComparatorS32S0000000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReason;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReasonsData;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class PushOffReasonBottomSheetFragment extends Fragment implements InterfaceC219588ja, InterfaceC26036AJs {
    public static PushOffReasonsData LJLLL;
    public static String LJLLLL;
    public C26031AJn LJLIL;
    public WeakReference<InterfaceC26038AJu> LJLJJI;
    public RecyclerView LJLJJL;
    public C26034AJq LJLJJLL;
    public C45631qh LJLJL;
    public C26021AJd LJLJLJ;
    public C6J7 LJLJLLL;
    public C26018AJa LJLL;
    public String LJLLI;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public String LJLILLLLZI = "";
    public final Set<Integer> LJLJI = new LinkedHashSet();
    public final C26032AJo LJLLILLLL = new C26032AJo(this);

    @Override // X.InterfaceC26036AJs
    public final void Vt() {
        InterfaceC26038AJu interfaceC26038AJu;
        WeakReference<InterfaceC26038AJu> weakReference = this.LJLJJI;
        if (weakReference != null && (interfaceC26038AJu = weakReference.get()) != null) {
            interfaceC26038AJu.fD(true);
        }
        ASQ.LJ(this, ASX.LIZ);
    }

    @Override // X.InterfaceC26036AJs
    public final void pf() {
        InterfaceC26038AJu interfaceC26038AJu;
        WeakReference<InterfaceC26038AJu> weakReference = this.LJLJJI;
        if (weakReference != null && (interfaceC26038AJu = weakReference.get()) != null) {
            interfaceC26038AJu.fD(false);
        }
        ASQ.LJ(this, ASX.LIZ);
    }

    public final void vl() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(R.id.kpl));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (view = view2.findViewById(R.id.kpl)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.kpl), view);
            } else {
                view = null;
            }
        }
        SY4 sy4 = (SY4) view;
        boolean z = false;
        if (this.LJLILLLLZI.length() > 0 || (!this.LJLJI.isEmpty())) {
            z = true;
        }
        sy4.setEnabled(z);
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        Integer LJI;
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.c9, context)) != null) {
            int intValue = LJI.intValue();
            C235119Kp c235119Kp = new C235119Kp();
            c235119Kp.LIZJ(intValue);
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark;
            LIZJ.LIZIZ(new AqS154S0100000_4(this, 810));
            c235119Kp.LIZIZ(LIZJ);
            return c235119Kp;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C26031AJn c26031AJn = this.LJLIL;
        if (c26031AJn != null) {
            c26031AJn.LIZIZ();
        } else {
            o.LJIJI("feedbackPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLLI = getString(R.string.i9i);
    }

    public final void xl(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "push_setting_page");
        String str2 = LJLLLL;
        if (str2 != null) {
            c188727au.LJIIIZ("label", str2);
            c188727au.LJIIIZ("click_method", str);
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            PushOffReasonsData pushOffReasonsData = LJLLL;
            if (pushOffReasonsData != null) {
                for (PushOffReason pushOffReason : ORZ.LLILII(new IDComparatorS32S0000000_4(6), pushOffReasonsData.reasonsList)) {
                    if (this.LJLJI.contains(Integer.valueOf(pushOffReason.category))) {
                        stringBuffer.append(pushOffReason.reason);
                        stringBuffer.append(",");
                        stringBuffer2.append(pushOffReason.category);
                        stringBuffer2.append(",");
                    }
                }
                if (this.LJLILLLLZI.length() > 0) {
                    stringBuffer.append(this.LJLILLLLZI);
                    c188727au.LJI("other_reason", this.LJLILLLLZI);
                } else if (stringBuffer.length() > 0) {
                    stringBuffer.deleteCharAt(s.LJJLIIIJ(stringBuffer));
                }
                c188727au.LJI("text", stringBuffer.toString());
                if (stringBuffer2.length() > 0) {
                    stringBuffer2.deleteCharAt(s.LJJLIIIJ(stringBuffer2));
                    c188727au.LJI("selected_reason", stringBuffer2.toString());
                }
                FMX.LJIIL("push_feedback_pop_up_click", c188727au.LIZ);
                return;
            }
            o.LJIJI("offReasonsData");
            throw null;
        }
        o.LJIJI("switchName");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C26031AJn c26031AJn = new C26031AJn();
        this.LJLIL = c26031AJn;
        c26031AJn.LJLILLLLZI = this;
    }

    public final void wl(int i, boolean z) {
        if (z) {
            if (!this.LJLJI.contains(Integer.valueOf(i))) {
                this.LJLJI.add(Integer.valueOf(i));
                vl();
                return;
            }
            return;
        }
        if (!this.LJLJI.contains(Integer.valueOf(i))) {
            return;
        }
        this.LJLJI.remove(Integer.valueOf(i));
        vl();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C45631qh c45631qh;
        TextView textView;
        TextView textView2;
        C26018AJa c26018AJa;
        C6J7 c6j7;
        C26021AJd c26021AJd;
        SY4 sy4;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ckw, viewGroup, false);
        C29S c29s = null;
        if (LLLLIILL != null) {
            c45631qh = (C45631qh) LLLLIILL.findViewById(R.id.jcz);
        } else {
            c45631qh = null;
        }
        this.LJLJL = c45631qh;
        if (LLLLIILL != null) {
            textView = (TextView) LLLLIILL.findViewById(R.id.title);
        } else {
            textView = null;
        }
        String str = "";
        if (textView != null) {
            PushOffReasonsData pushOffReasonsData = LJLLL;
            if (pushOffReasonsData != null) {
                String str2 = pushOffReasonsData.title;
                if (str2 == null) {
                    str2 = "";
                }
                textView.setText(str2);
            } else {
                o.LJIJI("offReasonsData");
                throw null;
            }
        }
        if (LLLLIILL != null) {
            textView2 = (TextView) LLLLIILL.findViewById(R.id.c84);
        } else {
            textView2 = null;
        }
        if (textView2 != null) {
            PushOffReasonsData pushOffReasonsData2 = LJLLL;
            if (pushOffReasonsData2 != null) {
                String str3 = pushOffReasonsData2.description;
                if (str3 != null) {
                    str = str3;
                }
                textView2.setText(str);
            } else {
                o.LJIJI("offReasonsData");
                throw null;
            }
        }
        Context context = getContext();
        if (context != null) {
            c26018AJa = new C26018AJa(context, null, 6);
            c26018AJa.LJII(getString(R.string.i9m));
            c26018AJa.LJLJI = 200;
            c26018AJa.LJI(300);
        } else {
            c26018AJa = null;
        }
        this.LJLL = c26018AJa;
        Context context2 = getContext();
        if (context2 != null) {
            c6j7 = new C6J7(context2);
        } else {
            c6j7 = null;
        }
        this.LJLJLLL = c6j7;
        if (LLLLIILL != null) {
            c26021AJd = (C26021AJd) LLLLIILL.findViewById(R.id.eos);
        } else {
            c26021AJd = null;
        }
        this.LJLJLJ = c26021AJd;
        if (c26021AJd != null) {
            c26021AJd.LJIIIIZZ(getString(R.string.i9l));
            c26021AJd.setFormField(this.LJLL);
            c26021AJd.LIZJ(EnumC26023AJf.HEADER);
            c26021AJd.LJIIIZ(this.LJLJLLL);
            c26021AJd.LJFF(getString(R.string.i9h));
            c26021AJd.LIZLLL(this.LJLLI);
            C26018AJa c26018AJa2 = this.LJLL;
            if (c26018AJa2 != null) {
                c26018AJa2.setTuxFieldContentCallback(this.LJLLILLLL);
            }
        }
        if (LLLLIILL != null) {
            sy4 = (SY4) LLLLIILL.findViewById(R.id.kpl);
        } else {
            sy4 = null;
        }
        this.LJLJJL = (RecyclerView) LLLLIILL.findViewById(R.id.dwx);
        Context context3 = getContext();
        if (context3 != null) {
            PushOffReasonsData pushOffReasonsData3 = LJLLL;
            if (pushOffReasonsData3 != null) {
                this.LJLJJLL = new C26034AJq(context3, ORZ.LLJILJILJ(pushOffReasonsData3.reasonsList));
                RecyclerView recyclerView = this.LJLJJL;
                if (recyclerView != null) {
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                    recyclerView.setAdapter(this.LJLJJLL);
                }
                C26034AJq c26034AJq = this.LJLJJLL;
                if (c26034AJq != null) {
                    c26034AJq.LJLJI = this;
                }
            } else {
                o.LJIJI("offReasonsData");
                throw null;
            }
        }
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 177));
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
