package com.ss.android.ugc.aweme.upvote.publish.panel;

import X.AnonymousClass784;
import X.C110614Vt;
import X.C16880lQ;
import X.C183917Jr;
import X.C32151Nz;
import X.C61328O5c;
import X.C62822Ol8;
import X.C62846OlW;
import X.C72062SPy;
import X.C78765Uvh;
import X.C7HR;
import X.C7HT;
import X.C7HV;
import X.C7IK;
import X.C99W;
import X.HG3;
import X.O6R;
import X.RBX;
import X.SY4;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UpvoteNewbieGuideFragment extends BaseFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static void vl(View view) {
        view.findViewById(R.id.m4q).setVisibility(8);
        view.findViewById(R.id.c72).setVisibility(8);
        view.findViewById(R.id.g2p).setVisibility(8);
        view.findViewById(R.id.k0p).setVisibility(0);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UrlModel urlModel;
        String str;
        boolean z;
        UrlModel urlModel2;
        UrlModel urlModel3;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.f0h), new ACListenerS23S0100000_3(this, 177));
        C16880lQ.LJJIZ((SY4) view.findViewById(R.id.l1p), new ACListenerS23S0100000_3(this, 178));
        if (C99W.LIZ) {
            view.findViewById(R.id.l1p).getClass();
        }
        if (C7HT.LIZ()) {
            Context context = view.getContext();
            if (context != null) {
                User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                C62822Ol8 c62822Ol8 = C183917Jr.LIZ;
                if (((Number) c62822Ol8.getValue()).intValue() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C62846OlW c62846OlW = (C62846OlW) view.findViewById(R.id.eyq);
                    View findViewById = view.findViewById(R.id.n2n);
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                        C110614Vt c110614Vt = new C110614Vt();
                        c110614Vt.LIZJ = C61328O5c.LIZJ(4);
                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
                        findViewById.setBackground(c110614Vt.LIZ(context));
                    }
                    TextView textView = (TextView) view.findViewById(R.id.mh9);
                    if (textView != null) {
                        C72062SPy c72062SPy = new C72062SPy();
                        if ((((Number) c62822Ol8.getValue()).intValue() & 2) == 2) {
                            string = context.getString(R.string.q3g);
                        } else {
                            string = context.getString(R.string.g7m);
                        }
                        o.LJIIIIZZ(string, "if (UpvoteWhiteBarSecond…iption)\n                }");
                        c72062SPy.LIZIZ = string;
                        c72062SPy.LIZ = false;
                        c72062SPy.LJ(1);
                        c72062SPy.LIZIZ(62);
                        textView.setText(c72062SPy.LIZ(context));
                    }
                    if (curUser != null) {
                        urlModel3 = curUser.getAvatarThumb();
                    } else {
                        urlModel3 = null;
                    }
                    C78765Uvh.LJFF(c62846OlW, urlModel3);
                } else {
                    View findViewById2 = view.findViewById(R.id.n1y);
                    o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.v_bubble)");
                    findViewById2.setVisibility(0);
                    C62846OlW c62846OlW2 = (C62846OlW) view.findViewById(R.id.eye);
                    TextView textView2 = (TextView) view.findViewById(R.id.mh8);
                    if (textView2 != null) {
                        textView2.setText(context.getString(R.string.q3g));
                    }
                    if (curUser != null) {
                        urlModel2 = curUser.getAvatarThumb();
                    } else {
                        urlModel2 = null;
                    }
                    C78765Uvh.LJFF(c62846OlW2, urlModel2);
                }
                view.findViewById(R.id.g42).setPadding(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(-10)), 0, 0);
                view.post(new ARunnableS37S0100000_1(view, 4));
                Context context2 = view.getContext();
                TextView textView3 = (TextView) view.findViewById(R.id.mo6);
                C7HV c7hv = C7HV.LIZIZ;
                textView3.setText(context2.getString(c7hv.LJIIJ(R.string.pvf, R.string.q46)));
                ((TextView) view.findViewById(R.id.m4o)).setText(context2.getString(c7hv.LJIIJ(R.string.pvc, R.string.q43)));
                ((TextView) view.findViewById(R.id.m4p)).setText(context2.getString(c7hv.LJIIJ(R.string.pvd, R.string.q44)));
                ((TextView) view.findViewById(R.id.m4r)).setText(context2.getString(c7hv.LJIIJ(R.string.pve, R.string.q45)));
                if (C7HR.LIZ() || AnonymousClass784.LIZ()) {
                    vl(view);
                } else {
                    View findViewById3 = view.findViewById(R.id.k0p);
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(8);
                    }
                }
            }
        } else {
            Context context3 = view.getContext();
            if (context3 != null) {
                View findViewById4 = view.findViewById(R.id.be0);
                C110614Vt c110614Vt2 = new C110614Vt();
                c110614Vt2.LJIIJ = C61328O5c.LIZJ(26);
                c110614Vt2.LJIIJJI = C61328O5c.LIZJ(26);
                c110614Vt2.LIZIZ = Integer.valueOf(R.attr.ca);
                Drawable LIZ = c110614Vt2.LIZ(context3);
                if (findViewById4 != null) {
                    findViewById4.setBackground(LIZ);
                }
                User curUser2 = ((RBX) HG3.LJIILL()).getCurUser();
                C62846OlW c62846OlW3 = (C62846OlW) view.findViewById(R.id.eye);
                if (curUser2 != null) {
                    urlModel = curUser2.getAvatarThumb();
                } else {
                    urlModel = null;
                }
                C78765Uvh.LJFF(c62846OlW3, urlModel);
                View findViewById5 = view.findViewById(R.id.f9t);
                C110614Vt c110614Vt3 = new C110614Vt();
                c110614Vt3.LIZJ = C61328O5c.LIZJ(10);
                c110614Vt3.LIZIZ = Integer.valueOf(R.attr.ca);
                Context context4 = findViewById5.getContext();
                o.LJIIIIZZ(context4, "context");
                findViewById5.setBackground(c110614Vt3.LIZ(context4));
                view.post(new ARunnableS37S0100000_1(view, 3));
                Context context5 = view.getContext();
                TextView textView4 = (TextView) view.findViewById(R.id.mo6);
                C7HV c7hv2 = C7HV.LIZIZ;
                textView4.setText(context5.getString(c7hv2.LJIIJ(R.string.pvf, R.string.q46)));
                ((TextView) view.findViewById(R.id.m4o)).setText(context5.getString(c7hv2.LJIIJ(R.string.pvc, R.string.q43)));
                ((TextView) view.findViewById(R.id.m4p)).setText(context5.getString(c7hv2.LJIIJ(R.string.pvd, R.string.q44)));
                ((TextView) view.findViewById(R.id.m4r)).setText(context5.getString(c7hv2.LJIIJ(R.string.pve, R.string.q45)));
                TextView textView5 = (TextView) view.findViewById(R.id.l1p);
                if (textView5 != null) {
                    Context context6 = getContext();
                    if (context6 != null) {
                        str = context6.getString(c7hv2.LJIIJ(R.string.ptm, R.string.q2l));
                    } else {
                        str = null;
                    }
                    textView5.setText(str);
                }
                if (C7HR.LIZ() || AnonymousClass784.LIZ()) {
                    vl(view);
                } else {
                    View findViewById6 = view.findViewById(R.id.k0p);
                    if (findViewById6 != null) {
                        findViewById6.setVisibility(8);
                    }
                }
            }
        }
        C7IK.LIZJ().storeBoolean(C7IK.LIZ("has_displayed_new_guide_panel_"), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            boolean r0 = X.C7HT.LIZ()
            r2 = 1
            r1 = 0
            if (r0 != 0) goto L1e
            X.Ol8 r0 = X.C183917Jr.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L47
            r0 = 1
        L1c:
            if (r0 == 0) goto L43
        L1e:
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L41
            boolean r0 = X.AnonymousClass636.LJIILJJIL(r0)
            if (r0 != r2) goto L41
        L2a:
            if (r2 == 0) goto L3d
            r0 = 2131564453(0x7f0d17a5, float:1.8754392E38)
        L2f:
            android.view.View r3 = X.C16880lQ.LLLLIILL(r5, r0, r6, r1)
            boolean r0 = r3 instanceof android.view.View
            r2 = 0
            if (r0 == 0) goto L3b
        L38:
            if (r3 == 0) goto L64
            goto L49
        L3b:
            r3 = r2
            goto L38
        L3d:
            r0 = 2131564452(0x7f0d17a4, float:1.875439E38)
            goto L2f
        L41:
            r2 = 0
            goto L2a
        L43:
            r0 = 2131564451(0x7f0d17a3, float:1.8754388E38)
            goto L2f
        L47:
            r0 = 0
            goto L1c
        L49:
            androidx.lifecycle.LifecycleOwner r0 = r4.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L6a
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r3, r0)     // Catch: java.lang.Throwable -> L6a
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r3, r4)     // Catch: java.lang.Throwable -> L6a
            X.C10A.LIZIZ(r3, r4)     // Catch: java.lang.Throwable -> L6a
            X.1qj r1 = r4.mo49getActivity()     // Catch: java.lang.Throwable -> L6a
            boolean r0 = r1 instanceof X.C29S     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L61
            r2 = r1
            X.29S r2 = (X.C29S) r2     // Catch: java.lang.Throwable -> L6a
        L61:
            X.C90903hW.LIZ(r2)     // Catch: java.lang.Throwable -> L6a
        L64:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L6a
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L6a
            goto L72
        L6a:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.publish.panel.UpvoteNewbieGuideFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
