package com.ss.android.ugc.aweme.qna.fragment;

import X.ActivityC45651qj;
import X.C00F;
import X.C0A2;
import X.C162476Zf;
import X.C2068389v;
import X.C245319jz;
import X.C252669vq;
import X.C32I;
import X.C36922EeM;
import X.C73305Spp;
import X.C73306Spq;
import X.C74125T7h;
import X.C74135T7r;
import X.C74140T7w;
import X.C74141T7x;
import X.C76800UCe;
import X.C7MY;
import X.E1D;
import X.InterfaceC65784Pro;
import X.InterfaceC72761Sh3;
import X.InterfaceC74128T7k;
import X.InterfaceC88472Yns;
import X.KKR;
import X.KKS;
import X.MIL;
import X.T77;
import X.T78;
import X.T79;
import X.T7E;
import X.T7L;
import X.X1D;
import Y.ACListenerS21S0100000_1;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class BaseQnaTabFragment extends BaseFragment {
    public boolean LJLIL;
    public String LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public String wl() {
        return null;
    }

    public abstract int xl();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLILLLLZI = arguments.getString("author_id");
            arguments.getString("enter_from");
            arguments.getString("enter_method");
        }
    }

    public static void Gl(C74140T7w rv, C74135T7r adapter) {
        C74141T7x c74141T7x;
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(adapter, "adapter");
        C0A2 layoutManager = rv.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        if (LLILL > LLILLJJLI) {
            return;
        }
        while (true) {
            try {
                C74125T7h item = adapter.getItem(LLILL);
                if ((item instanceof C74141T7x) && (c74141T7x = (C74141T7x) item) != null) {
                    adapter.LJLJJLL.LIZIZ(c74141T7x, adapter.LJLJI);
                    adapter.LJLJL.LIZIZ(c74141T7x);
                }
                if (LLILL != LLILLJJLI) {
                    LLILL++;
                } else {
                    return;
                }
            } catch (Exception unused) {
                C36922EeM.LIZLLL(4, "QNA_TAB_ADAPTER", "Recommendation Mob Out of Bound");
                return;
            }
        }
    }

    public final void vl(List<T7L> list, InterfaceC74128T7k interfaceC74128T7k, T7E navigateDialogUiModel) {
        o.LJIIIZ(navigateDialogUiModel, "navigateDialogUiModel");
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            T7L t7l = (T7L) it.next();
            C252669vq c252669vq = new C252669vq();
            c252669vq.LIZIZ(t7l.LJLIL);
            c252669vq.LIZJ = t7l.LJLILLLLZI;
            c252669vq.LJ = new ACListenerS21S0100000_1(new AqS116S0300000_12(interfaceC74128T7k, navigateDialogUiModel, t7l, 17), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            arrayList.add(c252669vq);
        }
        C252669vq[] c252669vqArr = (C252669vq[]) arrayList.toArray(new C252669vq[0]);
        C245319jz c245319jz = new C245319jz();
        c245319jz.LIZIZ((C252669vq[]) Arrays.copyOf(c252669vqArr, c252669vqArr.length));
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            LIZJ.show(fragmentManager, "BaseQnaTabFragment");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        if (r5 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Dl(android.content.Context r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            X.T7F r0 = X.InterfaceC72761Sh3.LIZ
            r0.getClass()
            X.7au r6 = new X.7au
            r6.<init>()
            java.lang.String r3 = "enter_from"
            java.lang.String r2 = "qa_personal_profile"
            r6.LJIIIZ(r3, r2)
            X.Yp3 r5 = X.C88545Yp3.LIZIZ
            java.lang.String r4 = ""
            if (r5 == 0) goto L1d
            java.lang.String r1 = r5.LJ()
            if (r1 != 0) goto L20
        L1d:
            r1 = r4
            if (r5 == 0) goto L64
        L20:
            boolean r0 = r5.isConnected()
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.LJFF(r0, r1)
            if (r5 == 0) goto L33
            java.lang.String r1 = r5.LIZIZ()
            if (r1 != 0) goto L36
        L33:
            r1 = r4
            if (r5 == 0) goto L3c
        L36:
            java.lang.String r0 = r5.LJIILJJIL()
            if (r0 != 0) goto L62
        L3c:
            r6.LJIIIZ(r1, r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r6.LIZ
            java.lang.String r0 = "enter_personal_detail"
            X.FMX.LJIIL(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L5e
            java.lang.String r0 = "aweme://user/profile/"
            com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r7, r0)
            java.lang.String r0 = "uid"
            r1.withParam(r0, r8)
            if (r10 == 0) goto L5f
        L59:
            java.lang.String r0 = "sec_uid"
            X.C05040Hs.LJ(r1, r3, r2, r0, r9)
        L5e:
            return
        L5f:
            java.lang.String r2 = "qa_others_profile"
            goto L59
        L62:
            r4 = r0
            goto L3c
        L64:
            r0 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment.Dl(android.content.Context, java.lang.String, java.lang.String, boolean):void");
    }

    public final void Al(String str, String str2, boolean z, boolean z2) {
        String str3;
        if (str == null) {
            return;
        }
        InterfaceC72761Sh3.LIZ.getClass();
        if (z) {
            str3 = "qa_personal_profile";
        } else {
            str3 = "qa_others_profile";
        }
        ActivityC45651qj requireActivity = requireActivity();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://aweme/detail/");
        LIZ.append(str);
        SmartRoute buildRoute = SmartRouter.buildRoute(requireActivity, X1D.LIZIZ(LIZ));
        buildRoute.withParam("enter_from", str3);
        buildRoute.withParam("video_from", str3);
        buildRoute.withParam("show_answer_question_button", 1);
        if (str2 == null) {
            str2 = "";
        }
        buildRoute.withParam("question_content", str2);
        if (z2) {
            buildRoute.withParam("qa_origin", "qa_trending_page");
        }
        buildRoute.open();
    }

    public final void Hl(KKR qnaUiStatus, View view, T78 qnaTabRv, boolean z, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z2, MIL mil) {
        E1D e1d;
        String str2;
        String str3;
        int i;
        o.LJIIIZ(qnaUiStatus, "qnaUiStatus");
        o.LJIIIZ(qnaTabRv, "qnaTabRv");
        int i2 = KKS.LIZ[qnaUiStatus.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                C73305Spp qnaStatusView = (C73305Spp) view.findViewById(R.id.iia);
                o.LJIIIIZZ(requireContext(), "requireContext()");
                o.LJIIIIZZ(qnaStatusView, "qnaStatusView");
                C73306Spq c73306Spq = new C73306Spq();
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_wifi_slash;
                c2068389v.LJ = Integer.valueOf(R.attr.gp);
                c73306Spq.LIZJ = 0;
                c73306Spq.LIZIZ = c2068389v;
                int LIZIZ = C7MY.LIZIZ(72);
                int LIZIZ2 = C7MY.LIZIZ(72);
                c73306Spq.LIZLLL = LIZIZ;
                c73306Spq.LJ = LIZIZ2;
                c73306Spq.LJFF = T77.LIZ(R.string.im9);
                c73306Spq.LJI = T77.LIZ(R.string.g5t);
                c73306Spq.LJII = new AqS143S0200000_12(qnaStatusView, interfaceC65784Pro, 99);
                qnaStatusView.setStatus(c73306Spq);
                return;
            }
            C73305Spp c73305Spp = (C73305Spp) view.findViewById(R.id.iia);
            boolean z3 = this instanceof QnaSuggestedTabFragment;
            if (z) {
                int i3 = T79.LIZ[qnaTabRv.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            if (z2) {
                                e1d = new E1D(T77.LIZ(R.string.pqs), T77.LIZ(R.string.pqr));
                            } else {
                                e1d = new E1D(T77.LIZ(R.string.pnu), T77.LIZ(R.string.pnt));
                            }
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        e1d = new E1D(T77.LIZ(R.string.pnw), T77.LIZ(R.string.pnv));
                    }
                } else if (C00F.LIZ(31744, 0, "public_qna_suggested_tab", true) == 1 || mil == MIL.FYP_BANNER) {
                    e1d = new E1D(T77.LIZ(R.string.pqp), T77.LIZ(R.string.pqo));
                } else {
                    e1d = new E1D(T77.LIZ(R.string.pq_), T77.LIZ(R.string.pq9));
                }
            } else {
                int i4 = T79.LIZ[qnaTabRv.ordinal()];
                String str4 = "";
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            if (str == null) {
                                str3 = "";
                            } else {
                                str4 = T77.LIZIZ(R.string.pns, str);
                                str3 = T77.LIZIZ(R.string.pnr, str);
                            }
                            e1d = new E1D(str4, str3);
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        if (str == null) {
                            str2 = "";
                        } else {
                            str4 = T77.LIZIZ(R.string.pq8, str);
                            str2 = T77.LIZIZ(R.string.pq7, str);
                        }
                        e1d = new E1D(str4, str2);
                    }
                } else {
                    e1d = new E1D("", "");
                }
            }
            C73306Spq c73306Spq2 = new C73306Spq();
            C2068389v c2068389v2 = new C2068389v();
            if (!z3 || C00F.LIZ(31744, 0, "public_qna_suggested_tab", true) != 1) {
                i = R.raw.icon_large_error_qa_ltr;
            } else {
                i = R.raw.icon_large_lightbulb;
            }
            c2068389v2.LIZ = i;
            c2068389v2.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq2.LIZJ = 0;
            c73306Spq2.LIZIZ = c2068389v2;
            int LIZIZ3 = C7MY.LIZIZ(72);
            int LIZIZ4 = C7MY.LIZIZ(72);
            c73306Spq2.LIZLLL = LIZIZ3;
            c73306Spq2.LJ = LIZIZ4;
            c73306Spq2.LIZJ(e1d.LIZ);
            c73306Spq2.LIZIZ(e1d.LIZIZ);
            c73305Spp.setStatus(c73306Spq2);
            view.findViewById(qnaTabRv.getRvId()).setVisibility(8);
            view.findViewById(R.id.ihm).setVisibility(0);
            return;
        }
        view.findViewById(qnaTabRv.getRvId()).setVisibility(0);
        view.findViewById(R.id.ihm).setVisibility(8);
    }

    public static /* synthetic */ void Il(BaseQnaTabFragment baseQnaTabFragment, KKR kkr, View view, T78 t78, boolean z, String str, InterfaceC65784Pro interfaceC65784Pro, boolean z2, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        baseQnaTabFragment.Hl(kkr, view, t78, z, str, interfaceC65784Pro, z2, null);
    }
}
