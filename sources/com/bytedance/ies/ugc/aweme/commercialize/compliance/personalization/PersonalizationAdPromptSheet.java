package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.AEM;
import X.AEY;
import X.AI8;
import X.AI9;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C29S;
import X.C33381Ss;
import X.C3C5;
import X.C41290GIk;
import X.C41297GIr;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.SY4;
import Y.ACListenerS27S0100000_7;
import Y.AObserverS75S0100000_7;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.PopUpCopyWriting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PersonalizationAdPromptSheet extends Fragment {
    public static TuxSheet LJLJJL;
    public Activity LJLIL;
    public long LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final MutableLiveData<Integer> LJLJI = new MutableLiveData<>();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    public final void vl() {
        C41290GIk.LJIIJJI("1", true);
        TuxSheet tuxSheet = LJLJJL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(1, "click_position");
            c188727au.LJ(System.currentTimeMillis() - this.LJLILLLLZI, "stay_time");
            c188727au.LJFF(C41290GIk.LJI(), "style_name");
            c188727au.LJFF(C41290GIk.LJFF(), "content_type");
            FMX.LJIIL("click_equally_balanced_pa_prompt", c188727au.LIZ);
            return;
        }
        o.LJIJI("sheet");
        throw null;
    }

    public final void wl() {
        C41290GIk.LJIIJJI("2", false);
        TuxSheet tuxSheet = LJLJJL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(0, "click_position");
            c188727au.LJ(System.currentTimeMillis() - this.LJLILLLLZI, "stay_time");
            c188727au.LJFF(C41290GIk.LJI(), "style_name");
            c188727au.LJFF(C41290GIk.LJFF(), "content_type");
            FMX.LJIIL("click_equally_balanced_pa_prompt", c188727au.LIZ);
            return;
        }
        o.LJIJI("sheet");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PopUpCopyWriting popUpCopyWriting;
        Integer num;
        boolean z;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null) {
            popUpCopyWriting = LIZIZ.getAbCopyWriting();
        } else {
            popUpCopyWriting = null;
        }
        if (popUpCopyWriting == null) {
            TuxSheet tuxSheet = LJLJJL;
            if (tuxSheet != null) {
                tuxSheet.dismiss();
            } else {
                o.LJIJI("sheet");
                throw null;
            }
        } else {
            AdPersonalitySettings LIZIZ2 = C41290GIk.LIZIZ();
            if (LIZIZ2 != null) {
                num = LIZIZ2.getPopUpStyle();
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == 4) {
                    ((TextView) _$_findCachedViewById(R.id.ie_)).setText(popUpCopyWriting.getTitle());
                    TextView textView = (TextView) _$_findCachedViewById(R.id.id3);
                    Activity activity = this.LJLIL;
                    if (activity != null) {
                        textView.setText(C41297GIr.LIZ(activity, popUpCopyWriting.getDescription(), popUpCopyWriting.getPolicyList(), popUpCopyWriting.getPolicyLinkList()));
                        ((TextView) _$_findCachedViewById(R.id.id3)).setMovementMethod(LinkMovementMethod.getInstance());
                        ((TextView) _$_findCachedViewById(R.id.idy)).setText(popUpCopyWriting.getCheck());
                        ((TextView) _$_findCachedViewById(R.id.icz)).setText(popUpCopyWriting.getConfirm());
                        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.idy), new ACListenerS27S0100000_7(this, 147));
                        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.icz), new ACListenerS27S0100000_7(this, 149));
                    } else {
                        o.LJIJI("activty");
                        throw null;
                    }
                } else {
                    if (num.intValue() == 5 || num.intValue() == 6) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ((TextView) _$_findCachedViewById(R.id.iea)).setText(popUpCopyWriting.getTitle());
                        TextView textView2 = (TextView) _$_findCachedViewById(R.id.id4);
                        Activity activity2 = this.LJLIL;
                        if (activity2 != null) {
                            textView2.setText(C41297GIr.LIZ(activity2, popUpCopyWriting.getDescription(), popUpCopyWriting.getPolicyList(), popUpCopyWriting.getPolicyLinkList()));
                            ((TextView) _$_findCachedViewById(R.id.id4)).setMovementMethod(LinkMovementMethod.getInstance());
                            _$_findCachedViewById(R.id.id2).setVisibility(0);
                            ((AI8) _$_findCachedViewById(R.id.id2)).setTitle(popUpCopyWriting.getConfirm());
                            AI8 ai8 = (AI8) _$_findCachedViewById(R.id.id2);
                            Activity activity3 = this.LJLIL;
                            if (activity3 != null) {
                                ai8.setSubtitle(C41297GIr.LIZ(activity3, popUpCopyWriting.getConfirmDesc(), popUpCopyWriting.getConfirmPolicyList(), popUpCopyWriting.getConfirmPolicyLinkList()));
                                ((AI8) _$_findCachedViewById(R.id.id2)).setWithSeparator(true);
                                AI9 accessory = ((AI8) _$_findCachedViewById(R.id.id2)).getAccessory();
                                o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
                                ((AEY) accessory).LJIILJJIL(new AqS157S0100000_7(this, 613));
                                _$_findCachedViewById(R.id.ie1).setVisibility(0);
                                ((AI8) _$_findCachedViewById(R.id.ie1)).setTitle(popUpCopyWriting.getCheck());
                                AI8 ai82 = (AI8) _$_findCachedViewById(R.id.ie1);
                                Activity activity4 = this.LJLIL;
                                if (activity4 != null) {
                                    ai82.setSubtitle(C41297GIr.LIZ(activity4, popUpCopyWriting.getCheckDesc(), popUpCopyWriting.getCheckPolicyList(), popUpCopyWriting.getCheckPolicyLinkList()));
                                    ((AI8) _$_findCachedViewById(R.id.ie1)).setWithSeparator(true);
                                    AI9 accessory2 = ((AI8) _$_findCachedViewById(R.id.ie1)).getAccessory();
                                    o.LJII(accessory2, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
                                    ((AEY) accessory2).LJIILJJIL(new AqS157S0100000_7(this, 614));
                                    _$_findCachedViewById(R.id.ie3).setVisibility(0);
                                    ((TextView) _$_findCachedViewById(R.id.ie3)).setText(popUpCopyWriting.getSubmitButtonText());
                                    this.LJLJI.observe(this, new AObserverS75S0100000_7(this, 108));
                                    C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.ie3), new ACListenerS27S0100000_7(this, 151));
                                } else {
                                    o.LJIJI("activty");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("activty");
                                throw null;
                            }
                        } else {
                            o.LJIJI("activty");
                            throw null;
                        }
                    } else if (num.intValue() == 7) {
                        C33381Ss c33381Ss = new C33381Ss();
                        c33381Ss.LJLIL = R.drawable.ba7;
                        Activity activity5 = this.LJLIL;
                        if (activity5 != null) {
                            ((ImageView) _$_findCachedViewById(R.id.idw)).setImageDrawable(c33381Ss.LIZ(activity5));
                            ((TextView) _$_findCachedViewById(R.id.iea)).setText(popUpCopyWriting.getTitle());
                            TextView textView3 = (TextView) _$_findCachedViewById(R.id.id4);
                            Activity activity6 = this.LJLIL;
                            if (activity6 != null) {
                                textView3.setText(C41297GIr.LIZ(activity6, popUpCopyWriting.getDescription(), popUpCopyWriting.getPolicyList(), popUpCopyWriting.getPolicyLinkList()));
                                ((TextView) _$_findCachedViewById(R.id.id4)).setMovementMethod(LinkMovementMethod.getInstance());
                                _$_findCachedViewById(R.id.id1).setVisibility(0);
                                ((AI8) _$_findCachedViewById(R.id.id1)).setTitle(popUpCopyWriting.getConfirm());
                                AI8 ai83 = (AI8) _$_findCachedViewById(R.id.id1);
                                Activity activity7 = this.LJLIL;
                                if (activity7 != null) {
                                    ai83.setSubtitle(C41297GIr.LIZ(activity7, popUpCopyWriting.getConfirmDesc(), popUpCopyWriting.getConfirmPolicyList(), popUpCopyWriting.getConfirmPolicyLinkList()));
                                    ((AI8) _$_findCachedViewById(R.id.id1)).setWithSeparator(true);
                                    AI9 accessory3 = ((AI8) _$_findCachedViewById(R.id.id1)).getAccessory();
                                    o.LJII(accessory3, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Button");
                                    AEM aem = (AEM) accessory3;
                                    aem.LJIIL(popUpCopyWriting.getConfirmSelectText());
                                    aem.LJIIJJI(new ACListenerS27S0100000_7(this, 152));
                                    _$_findCachedViewById(R.id.ie0).setVisibility(0);
                                    ((AI8) _$_findCachedViewById(R.id.ie0)).setTitle(popUpCopyWriting.getCheck());
                                    AI8 ai84 = (AI8) _$_findCachedViewById(R.id.ie0);
                                    Activity activity8 = this.LJLIL;
                                    if (activity8 != null) {
                                        ai84.setSubtitle(C41297GIr.LIZ(activity8, popUpCopyWriting.getCheckDesc(), popUpCopyWriting.getCheckPolicyList(), popUpCopyWriting.getCheckPolicyLinkList()));
                                        AI9 accessory4 = ((AI8) _$_findCachedViewById(R.id.ie0)).getAccessory();
                                        o.LJII(accessory4, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Button");
                                        AEM aem2 = (AEM) accessory4;
                                        aem2.LJIIL(popUpCopyWriting.getCheckSelectText());
                                        aem2.LJIIJJI(new ACListenerS27S0100000_7(this, 153));
                                    } else {
                                        o.LJIJI("activty");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("activty");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("activty");
                                throw null;
                            }
                        } else {
                            o.LJIJI("activty");
                            throw null;
                        }
                    }
                }
            }
        }
        this.LJLILLLLZI = System.currentTimeMillis();
        C188727au c188727au = new C188727au();
        if (C41290GIk.LJII() == 1) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        c188727au.LJIIIZ("age_status", str);
        FMX.LJIIL("display_equally_balanced_pa_prompt", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View LLLLIILL;
        Integer popUpStyle;
        o.LJIIIZ(inflater, "inflater");
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ == null || (popUpStyle = LIZIZ.getPopUpStyle()) == null || popUpStyle.intValue() != 4) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.agv, viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.agw, viewGroup, false);
        }
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
