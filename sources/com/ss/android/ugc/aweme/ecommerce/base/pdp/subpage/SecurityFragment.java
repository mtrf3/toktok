package com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.AnonymousClass636;
import X.C10A;
import X.C119774mz;
import X.C141335gf;
import X.C234529Ii;
import X.C235119Kp;
import X.C26087ALr;
import X.C26338AVi;
import X.C27162AlK;
import X.C27531ArH;
import X.C29S;
import X.C32151Nz;
import X.C32I;
import X.C3C5;
import X.C70921RsT;
import X.C70922RsU;
import X.C76800UCe;
import X.C78946Uyc;
import X.C78948Uye;
import X.C84654XKg;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.InterfaceC71003Rtn;
import X.O6R;
import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SecurityInformationItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SecurityInformationItemDesc;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SecurityFragment extends ECBaseFragment implements InterfaceC219588ja {
    public static C84654XKg LJLILLLLZI;
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
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

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "shopping_security";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        String str;
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL = true;
        C9KF c9kf = new C9KF();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("title");
        } else {
            str = null;
        }
        c9kf.LIZJ = String.valueOf(str);
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 237));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C84654XKg c84654XKg = LJLILLLLZI;
        if (c84654XKg != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            c84654XKg.resumeWith(c76800UCe);
        }
        LJLILLLLZI = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C78946Uyc.LJJII(this, new C70921RsT(), new AqS170S0100000_4(this, 302));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        List<SecurityInformationItem> list;
        Image image;
        Image image2;
        LinkRichText linkRichText;
        LaneParams LJIILJJIL;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC71003Rtn preTrackNode = preTrackNode();
        if (preTrackNode != null && (LJIILJJIL = C78948Uye.LJIILJJIL(preTrackNode, "lib_track_builtin_lane_business")) != null) {
            obj = LJIILJJIL.get((Object) "security_detail");
        } else {
            obj = null;
        }
        if ((obj instanceof List) && (list = (List) obj) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (SecurityInformationItem securityInformationItem : list) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "view.context");
                C26087ALr c26087ALr = new C26087ALr(context, null, 0);
                int i = C27162AlK.LJIIIIZZ;
                c26087ALr.setTitle(securityInformationItem.name);
                Icon icon = securityInformationItem.logo;
                if (icon != null) {
                    image = icon.icon;
                } else {
                    image = null;
                }
                c26087ALr.setIcon(image);
                List<SecurityInformationItemDesc> list2 = securityInformationItem.securityInformationItemDesc;
                if (list2 != null) {
                    for (SecurityInformationItemDesc securityInformationItemDesc : list2) {
                        Integer num = securityInformationItemDesc.type;
                        if (num != null) {
                            if (num.intValue() == 1) {
                                String str = securityInformationItemDesc.plainDescription;
                                if (str != null) {
                                    Context context2 = c26087ALr.getContext();
                                    o.LJIIIIZZ(context2, "context");
                                    TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
                                    tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                                    tuxTextView.setText(str);
                                    tuxTextView.setTuxFont(61);
                                    Context context3 = tuxTextView.getContext();
                                    o.LJIIIIZZ(context3, "context");
                                    tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gs, context3));
                                    C26338AVi.LJI(tuxTextView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))), 0, 0, AnonymousClass391.LIZJ(8), false, 16);
                                    ((ViewGroup) c26087ALr._$_findCachedViewById(R.id.et0)).addView(tuxTextView);
                                }
                            } else if (num.intValue() == 2) {
                                ArrayList arrayList2 = new ArrayList();
                                List<Icon> list3 = securityInformationItemDesc.logos;
                                if (list3 != null) {
                                    for (Icon icon2 : list3) {
                                        Context context4 = c26087ALr.getContext();
                                        o.LJIIIIZZ(context4, "context");
                                        if (AnonymousClass636.LJIILJJIL(context4)) {
                                            image2 = icon2.iconDark;
                                        } else {
                                            image2 = icon2.icon;
                                        }
                                        if (image2 != null || (image2 = icon2.icon) != null) {
                                            arrayList2.add(image2);
                                        }
                                    }
                                }
                                Context context5 = c26087ALr.getContext();
                                o.LJIIIIZZ(context5, "context");
                                C119774mz c119774mz = new C119774mz(context5, null, 6);
                                c119774mz.setGravity(-1);
                                if (arrayList2.isEmpty()) {
                                    c119774mz.setVisibility(8);
                                } else {
                                    c119774mz.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                                    c119774mz.setVisibility(0);
                                    C26338AVi.LJI(c119774mz, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))), 0, 0, 0, false, 16);
                                    AqS93S0300000_4 aqS93S0300000_4 = new AqS93S0300000_4(c119774mz, (C119774mz) arrayList2, (List<Image>) c26087ALr, (C26087ALr) 186);
                                    if (c119774mz.getWidth() == 0) {
                                        c119774mz.post(new ARunnableS40S0100000_4((Object) aqS93S0300000_4, 138));
                                    } else {
                                        aqS93S0300000_4.invoke();
                                    }
                                }
                                ((ViewGroup) c26087ALr._$_findCachedViewById(R.id.et0)).addView(c119774mz);
                            } else if (num.intValue() == 3 && (linkRichText = securityInformationItemDesc.mixLinkDescription) != null) {
                                Context context6 = c26087ALr.getContext();
                                o.LJIIIIZZ(context6, "context");
                                TuxTextView tuxTextView2 = new TuxTextView(context6, null, 6, 0);
                                tuxTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                                RichTextUtil richTextUtil = RichTextUtil.LIZ;
                                Context context7 = tuxTextView2.getContext();
                                o.LJIIIIZZ(context7, "context");
                                tuxTextView2.setText(RichTextUtil.LIZJ(richTextUtil, context7, linkRichText, null, 0, false, null, null, 124));
                                tuxTextView2.setTuxFont(61);
                                Context context8 = tuxTextView2.getContext();
                                o.LJIIIIZZ(context8, "context");
                                tuxTextView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gs, context8));
                                C26338AVi.LJI(tuxTextView2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))), 0, 0, AnonymousClass391.LIZJ(8), false, 16);
                                tuxTextView2.setClickable(true);
                                tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                                ((ViewGroup) c26087ALr._$_findCachedViewById(R.id.et0)).addView(tuxTextView2);
                            }
                        }
                    }
                }
                c26087ALr.setPadding(i, i, i, i);
                arrayList.add(c26087ALr);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ViewGroup) _$_findCachedViewById(R.id.jci)).addView((View) it.next());
            }
        }
        C78946Uyc.LJJII(this, new C70922RsU(), null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        C29S c29s = null;
        if (context != null) {
            view = C27531ArH.LIZ(R.layout.a28, context, viewGroup, false);
        } else {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
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
        return view;
    }
}
