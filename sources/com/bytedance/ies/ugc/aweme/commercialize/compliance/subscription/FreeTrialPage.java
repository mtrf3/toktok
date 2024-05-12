package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C29S;
import X.C33381Ss;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.GI8;
import X.InterfaceC32051Chz;
import X.ORZ;
import X.SY4;
import X.V8E;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.Description;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public final class FreeTrialPage extends Fragment {
    public static InterfaceC32051Chz LJLLLL;
    public AdFreeTrialPageInfo LJLIL;
    public Integer LJLILLLLZI;
    public Context LJLJI;
    public ImageView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public TuxTextView LJLL;
    public TuxTextView LJLLI;
    public TuxTextView LJLLILLLL;
    public SY4 LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Integer num;
        super.onDestroy();
        Integer num2 = this.LJLILLLLZI;
        if ((num2 == null || num2.intValue() != 2) && ((num = this.LJLILLLLZI) == null || num.intValue() != 1)) {
            return;
        }
        a.LJIILL().LJIILLIIL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLIL = (AdFreeTrialPageInfo) arguments.getParcelable("page_data");
            this.LJLILLLLZI = Integer.valueOf(arguments.getInt("enter_from"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        V8E v8e;
        String str;
        String str2;
        String str3;
        List<Description> description;
        String str4;
        String str5;
        List<Description> description2;
        Description description3;
        List<Description> description4;
        Description description5;
        List<Description> description6;
        String str6;
        String str7;
        List<Description> description7;
        Description description8;
        List<Description> description9;
        Description description10;
        List<Description> description11;
        String str8;
        String str9;
        List<Description> description12;
        Description description13;
        List<Description> description14;
        Description description15;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.LJLJI = context;
        View findViewById = view.findViewById(R.id.dnq);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.free_trial_page_image)");
        this.LJLJJI = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.do1);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.free_trial_page_title)");
        this.LJLJJL = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.dnr);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.free_trial_page_subtitle)");
        this.LJLJJLL = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.dnu);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.f…e_trial_page_tip_1_title)");
        this.LJLJL = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.dns);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.f…l_page_tip_1_description)");
        this.LJLJLJ = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.dnx);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.f…e_trial_page_tip_2_title)");
        this.LJLJLLL = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.dnv);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.f…l_page_tip_2_description)");
        this.LJLL = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.do0);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.f…e_trial_page_tip_3_title)");
        this.LJLLI = (TuxTextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.dny);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.f…l_page_tip_3_description)");
        this.LJLLILLLL = (TuxTextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.dnp);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.free_trial_page_button)");
        this.LJLLJ = (SY4) findViewById10;
        Context context2 = this.LJLJI;
        if (context2 != null) {
            C33381Ss c33381Ss = new C33381Ss();
            c33381Ss.LJLIL = R.drawable.ba7;
            v8e = c33381Ss.LIZ(context2);
        } else {
            v8e = null;
        }
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            imageView.setImageDrawable(v8e);
            TuxTextView tuxTextView = this.LJLJJL;
            if (tuxTextView != null) {
                AdFreeTrialPageInfo adFreeTrialPageInfo = this.LJLIL;
                if (adFreeTrialPageInfo != null) {
                    str = adFreeTrialPageInfo.getTitle();
                } else {
                    str = null;
                }
                tuxTextView.setText(str);
                TuxTextView tuxTextView2 = this.LJLJJLL;
                if (tuxTextView2 != null) {
                    AdFreeTrialPageInfo adFreeTrialPageInfo2 = this.LJLIL;
                    if (adFreeTrialPageInfo2 != null) {
                        str2 = adFreeTrialPageInfo2.getSubtitle();
                    } else {
                        str2 = null;
                    }
                    tuxTextView2.setText(str2);
                    AdFreeTrialPageInfo adFreeTrialPageInfo3 = this.LJLIL;
                    if (adFreeTrialPageInfo3 != null && (description11 = adFreeTrialPageInfo3.getDescription()) != null && ORZ.LJLLLLLL(0, description11) != null) {
                        TuxTextView tuxTextView3 = this.LJLJL;
                        if (tuxTextView3 != null) {
                            AdFreeTrialPageInfo adFreeTrialPageInfo4 = this.LJLIL;
                            if (adFreeTrialPageInfo4 != null && (description14 = adFreeTrialPageInfo4.getDescription()) != null && (description15 = (Description) ORZ.LJLLLLLL(0, description14)) != null) {
                                str8 = description15.getTitle();
                            } else {
                                str8 = null;
                            }
                            tuxTextView3.setText(str8);
                            TuxTextView tuxTextView4 = this.LJLJLJ;
                            if (tuxTextView4 != null) {
                                AdFreeTrialPageInfo adFreeTrialPageInfo5 = this.LJLIL;
                                if (adFreeTrialPageInfo5 != null && (description12 = adFreeTrialPageInfo5.getDescription()) != null && (description13 = (Description) ORZ.LJLLLLLL(0, description12)) != null) {
                                    str9 = description13.getDescription();
                                } else {
                                    str9 = null;
                                }
                                tuxTextView4.setText(str9);
                            } else {
                                o.LJIJI("descriptionOneDescription");
                                throw null;
                            }
                        } else {
                            o.LJIJI("descriptionOneTitle");
                            throw null;
                        }
                    }
                    AdFreeTrialPageInfo adFreeTrialPageInfo6 = this.LJLIL;
                    if (adFreeTrialPageInfo6 != null && (description6 = adFreeTrialPageInfo6.getDescription()) != null && ORZ.LJLLLLLL(1, description6) != null) {
                        TuxTextView tuxTextView5 = this.LJLJLLL;
                        if (tuxTextView5 != null) {
                            AdFreeTrialPageInfo adFreeTrialPageInfo7 = this.LJLIL;
                            if (adFreeTrialPageInfo7 != null && (description9 = adFreeTrialPageInfo7.getDescription()) != null && (description10 = (Description) ORZ.LJLLLLLL(1, description9)) != null) {
                                str6 = description10.getTitle();
                            } else {
                                str6 = null;
                            }
                            tuxTextView5.setText(str6);
                            TuxTextView tuxTextView6 = this.LJLL;
                            if (tuxTextView6 != null) {
                                AdFreeTrialPageInfo adFreeTrialPageInfo8 = this.LJLIL;
                                if (adFreeTrialPageInfo8 != null && (description7 = adFreeTrialPageInfo8.getDescription()) != null && (description8 = (Description) ORZ.LJLLLLLL(1, description7)) != null) {
                                    str7 = description8.getDescription();
                                } else {
                                    str7 = null;
                                }
                                tuxTextView6.setText(str7);
                            } else {
                                o.LJIJI("descriptionTwoDescription");
                                throw null;
                            }
                        } else {
                            o.LJIJI("descriptionTwoTitle");
                            throw null;
                        }
                    }
                    AdFreeTrialPageInfo adFreeTrialPageInfo9 = this.LJLIL;
                    if (adFreeTrialPageInfo9 != null && (description = adFreeTrialPageInfo9.getDescription()) != null && ORZ.LJLLLLLL(2, description) != null) {
                        TuxTextView tuxTextView7 = this.LJLLI;
                        if (tuxTextView7 != null) {
                            AdFreeTrialPageInfo adFreeTrialPageInfo10 = this.LJLIL;
                            if (adFreeTrialPageInfo10 != null && (description4 = adFreeTrialPageInfo10.getDescription()) != null && (description5 = (Description) ORZ.LJLLLLLL(2, description4)) != null) {
                                str4 = description5.getTitle();
                            } else {
                                str4 = null;
                            }
                            tuxTextView7.setText(str4);
                            TuxTextView tuxTextView8 = this.LJLLILLLL;
                            if (tuxTextView8 != null) {
                                AdFreeTrialPageInfo adFreeTrialPageInfo11 = this.LJLIL;
                                if (adFreeTrialPageInfo11 != null && (description2 = adFreeTrialPageInfo11.getDescription()) != null && (description3 = (Description) ORZ.LJLLLLLL(2, description2)) != null) {
                                    str5 = description3.getDescription();
                                } else {
                                    str5 = null;
                                }
                                tuxTextView8.setText(str5);
                            } else {
                                o.LJIJI("descriptionThreeDescription");
                                throw null;
                            }
                        } else {
                            o.LJIJI("descriptionThreeTitle");
                            throw null;
                        }
                    }
                    SY4 sy4 = this.LJLLJ;
                    if (sy4 != null) {
                        AdFreeTrialPageInfo adFreeTrialPageInfo12 = this.LJLIL;
                        if (adFreeTrialPageInfo12 != null) {
                            str3 = adFreeTrialPageInfo12.getButtonText();
                        } else {
                            str3 = null;
                        }
                        sy4.setText(str3);
                        SY4 sy42 = this.LJLLJ;
                        if (sy42 != null) {
                            C16880lQ.LJJIZ(sy42, GI8.LJLIL);
                            FMX.LJIIL("show_ad_free_trial_prompt", new C188727au().LIZ);
                            return;
                        } else {
                            o.LJIJI("button");
                            throw null;
                        }
                    }
                    o.LJIJI("button");
                    throw null;
                }
                o.LJIJI("subtitle");
                throw null;
            }
            o.LJIJI("title");
            throw null;
        }
        o.LJIJI("image");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ahu, viewGroup, false);
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
