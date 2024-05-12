package com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C118364ki;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C26045AKb;
import X.C29S;
import X.C3C5;
import X.C63044Ooi;
import X.C76800UCe;
import X.C85882XnC;
import X.C85883XnD;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.LBJ;
import X.T5T;
import X.UTU;
import X.ViewOnClickListenerC13880ga;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model.LabelData;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.viewmodel.InferenceCategoryVM;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class LabelDialog extends Fragment implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, InterfaceC219588ja {
    public LabelData LJLIL;
    public ActivityC45651qj LJLILLLLZI;
    public InferenceCategoryVM LJLJI;
    public ICommercializeComplianceApi LJLJJI;
    public TuxTextView LJLJLLL;
    public RelativeLayout LJLL;
    public RelativeLayout LJLLI;
    public LBJ LJLLILLLL;
    public View LJLLJ;
    public TuxTextView LJLLL;
    public TuxTextView LJLLLL;
    public T5T LJLLLLLL;
    public C63044Ooi LJLZ;
    public C63044Ooi LJZ;
    public C63044Ooi LJZI;
    public int LLI;
    public TuxSheet LLIIIILZ;
    public final Map<Integer, View> LLIIIJ = new LinkedHashMap();
    public int LJLJJL = -1;
    public String LJLJJLL = "";
    public int LJLJL = -1;
    public String LJLJLJ = "";
    public String LJZL = "";
    public String LL = "";
    public String LLD = "";
    public String LLF = "";
    public String LLFF = "";
    public String LLFFF = "";
    public String LLFII = "";
    public String LLFZ = "";
    public String LLIFFJFJJ = "";
    public String LLII = "";
    public String LLIIII = "";

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIJ;
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

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        String interestTagValue;
        LabelData labelData = this.LJLIL;
        if (labelData != null) {
            if (labelData.getLabelType() == 0) {
                interestTagValue = this.LJZL;
            } else {
                LabelData labelData2 = this.LJLIL;
                if (labelData2 != null) {
                    interestTagValue = labelData2.getInterestTagValue();
                } else {
                    o.LJIJI("mLabelData");
                    throw null;
                }
            }
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            if (interestTagValue == null) {
                interestTagValue = this.LLFZ;
            }
            c9kf.LIZ(interestTagValue);
            c235119Kp.LIZJ = c9kf;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZIZ(new AqS165S0100000_15(this, 44));
            c235119Kp.LIZIZ(LIZJ);
            c235119Kp.LIZLLL = true;
            return c235119Kp;
        }
        o.LJIJI("mLabelData");
        throw null;
    }

    public final void xl() {
        String LJJJJZ = ujb.o.LJJJJZ(this.LLII, "%s", this.LLIIII, false);
        this.LLII = LJJJJZ;
        TuxTextView tuxTextView = this.LJLJLLL;
        if (tuxTextView != null) {
            String str = this.LLIIII;
            String str2 = this.LLIFFJFJJ;
            ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
            if (activityC45651qj != null) {
                tuxTextView.setText(C118364ki.LIZ(activityC45651qj, LJJJJZ, str, str2));
                TuxTextView tuxTextView2 = this.LJLJLLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                } else {
                    o.LJIJI("labelExplainInfoView");
                    throw null;
                }
            }
            o.LJIJI("mActivity");
            throw null;
        }
        o.LJIJI("labelExplainInfoView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLIIIJ).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        Integer num;
        super.onResume();
        LabelData labelData = this.LJLIL;
        if (labelData != null) {
            int labelType = labelData.getLabelType();
            if (labelType != 0) {
                if (labelType != 1) {
                    if (labelType != 2) {
                        return;
                    }
                    xl();
                    TuxTextView tuxTextView = this.LJLLL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(this.LLFFF);
                        TuxTextView tuxTextView2 = this.LJLLLL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(this.LLFII);
                            C63044Ooi c63044Ooi = this.LJZ;
                            if (c63044Ooi != null) {
                                c63044Ooi.setChecked(true);
                                return;
                            } else {
                                o.LJIJI("secondRadio");
                                throw null;
                            }
                        }
                        o.LJIJI("labelItemSecondText");
                        throw null;
                    }
                    o.LJIJI("labelItemFirstText");
                    throw null;
                }
                xl();
                TuxTextView tuxTextView3 = this.LJLLL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(this.LLFFF);
                    TuxTextView tuxTextView4 = this.LJLLLL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setText(this.LLFII);
                        C63044Ooi c63044Ooi2 = this.LJLZ;
                        if (c63044Ooi2 != null) {
                            c63044Ooi2.setChecked(true);
                            return;
                        } else {
                            o.LJIJI("firstRadio");
                            throw null;
                        }
                    }
                    o.LJIJI("labelItemSecondText");
                    throw null;
                }
                o.LJIJI("labelItemFirstText");
                throw null;
            }
            TuxTextView tuxTextView5 = this.LJLLL;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(this.LLF);
                TuxTextView tuxTextView6 = this.LJLLLL;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(this.LLFF);
                    LBJ lbj = this.LJLLILLLL;
                    if (lbj != null) {
                        lbj.setVisibility(0);
                        View view = this.LJLLJ;
                        if (view != null) {
                            view.setVisibility(0);
                            TuxTextView tuxTextView7 = this.LJLJLLL;
                            if (tuxTextView7 != null) {
                                LabelData labelData2 = this.LJLIL;
                                if (labelData2 != null) {
                                    if (o.LJ(labelData2.getInterestTagActive(), Boolean.TRUE)) {
                                        str = this.LL;
                                    } else {
                                        str = this.LLD;
                                    }
                                    tuxTextView7.setText(str);
                                    LabelData labelData3 = this.LJLIL;
                                    if (labelData3 != null) {
                                        String interestTagId = labelData3.getInterestTagId();
                                        if (interestTagId != null) {
                                            num = Integer.valueOf(CastIntegerProtector.parseInt(interestTagId));
                                        } else {
                                            num = null;
                                        }
                                        if (num == null) {
                                            return;
                                        }
                                        if (num.intValue() == 0) {
                                            C63044Ooi c63044Ooi3 = this.LJLZ;
                                            if (c63044Ooi3 != null) {
                                                c63044Ooi3.setChecked(true);
                                                T5T t5t = this.LJLLLLLL;
                                                if (t5t != null) {
                                                    t5t.setText("");
                                                    return;
                                                } else {
                                                    o.LJIJI("labelItemThirdText");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("firstRadio");
                                            throw null;
                                        }
                                        if (num.intValue() == 1) {
                                            C63044Ooi c63044Ooi4 = this.LJZ;
                                            if (c63044Ooi4 != null) {
                                                c63044Ooi4.setChecked(true);
                                                T5T t5t2 = this.LJLLLLLL;
                                                if (t5t2 != null) {
                                                    t5t2.setText("");
                                                    return;
                                                } else {
                                                    o.LJIJI("labelItemThirdText");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("secondRadio");
                                            throw null;
                                        }
                                        if (num.intValue() != 2) {
                                            return;
                                        }
                                        C63044Ooi c63044Ooi5 = this.LJZI;
                                        if (c63044Ooi5 != null) {
                                            c63044Ooi5.setChecked(true);
                                            T5T t5t3 = this.LJLLLLLL;
                                            if (t5t3 != null) {
                                                LabelData labelData4 = this.LJLIL;
                                                if (labelData4 != null) {
                                                    t5t3.setText(labelData4.getInterestTagValue());
                                                    return;
                                                } else {
                                                    o.LJIJI("mLabelData");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("labelItemThirdText");
                                            throw null;
                                        }
                                        o.LJIJI("thirdRadio");
                                        throw null;
                                    }
                                    o.LJIJI("mLabelData");
                                    throw null;
                                }
                                o.LJIJI("mLabelData");
                                throw null;
                            }
                            o.LJIJI("labelExplainInfoView");
                            throw null;
                        }
                        o.LJIJI("labelItemBottomLine");
                        throw null;
                    }
                    o.LJIJI("labelItemThirdView");
                    throw null;
                }
                o.LJIJI("labelItemSecondText");
                throw null;
            }
            o.LJIJI("labelItemFirstText");
            throw null;
        }
        o.LJIJI("mLabelData");
        throw null;
    }

    public final void Al(String str) {
        if (UTU.LIZIZ(UTU.LIZ)) {
            return;
        }
        ICommercializeComplianceApi iCommercializeComplianceApi = this.LJLJJI;
        if (iCommercializeComplianceApi != null) {
            iCommercializeComplianceApi.setUserLabel(str).enqueue(new C85882XnC(this, str));
        } else {
            o.LJIJI("api");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.s_) {
            ((C63044Ooi) _$_findCachedViewById(R.id.sa)).setChecked(true);
            return;
        }
        if (valueOf.intValue() == R.id.sc) {
            ((C63044Ooi) _$_findCachedViewById(R.id.sd)).setChecked(true);
            return;
        }
        if (valueOf == null) {
            return;
        }
        if (valueOf.intValue() == R.id.sf) {
            ((C63044Ooi) _$_findCachedViewById(R.id.sg)).setChecked(true);
        } else {
            if (valueOf.intValue() != R.id.sh) {
                return;
            }
            ((C63044Ooi) _$_findCachedViewById(R.id.sg)).setChecked(true);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Integer valueOf;
        if (!z || compoundButton == null || (valueOf = Integer.valueOf(compoundButton.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.sa) {
            ((C63044Ooi) _$_findCachedViewById(R.id.sd)).setChecked(false);
            ((C63044Ooi) _$_findCachedViewById(R.id.sg)).setChecked(false);
            return;
        }
        if (valueOf.intValue() == R.id.sd) {
            ((C63044Ooi) _$_findCachedViewById(R.id.sa)).setChecked(false);
            ((C63044Ooi) _$_findCachedViewById(R.id.sg)).setChecked(false);
        } else if (valueOf.intValue() == R.id.sg) {
            ((C63044Ooi) _$_findCachedViewById(R.id.sa)).setChecked(false);
            ((C63044Ooi) _$_findCachedViewById(R.id.sd)).setChecked(false);
        } else {
            if (valueOf.intValue() != R.id.sh) {
                return;
            }
            ((C63044Ooi) _$_findCachedViewById(R.id.sa)).setChecked(false);
            ((C63044Ooi) _$_findCachedViewById(R.id.sd)).setChecked(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            context = this;
        }
        Context context2 = context;
        String string = context2.getString(R.string.qzg);
        o.LJIIIIZZ(string, "context.getString(R.stri…_granular_control_gender)");
        this.LJZL = string;
        String string2 = context2.getString(R.string.b9c);
        o.LJIIIIZZ(string2, "context.getString(R.stri…der_inferred_description)");
        this.LL = string2;
        String string3 = context2.getString(R.string.qzk);
        o.LJIIIIZZ(string3, "context.getString(R.stri…er_customize_description)");
        this.LLD = string3;
        o.LJIIIIZZ(context2.getString(R.string.qzq), "context.getString(R.stri…est_inferred_description)");
        String string4 = context2.getString(R.string.b9f);
        o.LJIIIIZZ(string4, "context.getString(R.stri…est_inferred_description)");
        this.LLII = string4;
        String string5 = context2.getString(R.string.b9d);
        o.LJIIIIZZ(string5, "context.getString(R.stri…trol_learnmore_hyperlink)");
        this.LLIIII = string5;
        String string6 = context2.getString(R.string.qzl);
        o.LJIIIIZZ(string6, "context.getString(R.stri…ar_control_gender_female)");
        this.LLF = string6;
        String string7 = context2.getString(R.string.qzn);
        o.LJIIIIZZ(string7, "context.getString(R.stri…ular_control_gender_male)");
        this.LLFF = string7;
        o.LJIIIIZZ(context2.getString(R.string.qzh), "context.getString(R.stri…ar_control_gender_custom)");
        String string8 = context2.getString(R.string.qzo);
        o.LJIIIIZZ(string8, "context.getString(R.stri…r_control_gender_unknown)");
        this.LLFZ = string8;
        String string9 = context2.getString(R.string.qzs);
        o.LJIIIIZZ(string9, "context.getString(R.stri…rol_interest_inferred_on)");
        this.LLFFF = string9;
        String string10 = context2.getString(R.string.qzr);
        o.LJIIIIZZ(string10, "context.getString(R.stri…ol_interest_inferred_off)");
        this.LLFII = string10;
        View findViewById = view.findViewById(R.id.si);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.ad_label_setting_info)");
        this.LJLJLLL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.s_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.ad_label_item_first)");
        this.LJLL = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.sc);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.ad_label_item_second)");
        this.LJLLI = (RelativeLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.sf);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.ad_label_item_third)");
        this.LJLLILLLL = (LBJ) findViewById4;
        View findViewById5 = view.findViewById(R.id.s9);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.ad_label_item_bottom_line)");
        this.LJLLJ = findViewById5;
        View findViewById6 = view.findViewById(R.id.sb);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.ad_label_item_first_text)");
        this.LJLLL = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.se);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.ad_label_item_second_text)");
        this.LJLLLL = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.sh);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.ad_label_item_third_text)");
        this.LJLLLLLL = (T5T) findViewById8;
        View findViewById9 = view.findViewById(R.id.sa);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.ad_label_item_first_radio)");
        this.LJLZ = (C63044Ooi) findViewById9;
        View findViewById10 = view.findViewById(R.id.sd);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.ad_label_item_second_radio)");
        this.LJZ = (C63044Ooi) findViewById10;
        View findViewById11 = view.findViewById(R.id.sg);
        o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.ad_label_item_third_radio)");
        this.LJZI = (C63044Ooi) findViewById11;
        LBJ lbj = this.LJLLILLLL;
        if (lbj != null) {
            lbj.setTouchListener(new C85883XnD(this));
            C63044Ooi c63044Ooi = this.LJLZ;
            if (c63044Ooi != null) {
                c63044Ooi.setOnCheckedChangeListener(this);
                C63044Ooi c63044Ooi2 = this.LJZ;
                if (c63044Ooi2 != null) {
                    c63044Ooi2.setOnCheckedChangeListener(this);
                    C63044Ooi c63044Ooi3 = this.LJZI;
                    if (c63044Ooi3 != null) {
                        c63044Ooi3.setOnCheckedChangeListener(this);
                        RelativeLayout relativeLayout = this.LJLL;
                        if (relativeLayout != null) {
                            C16880lQ.LJIJ(relativeLayout, this);
                            RelativeLayout relativeLayout2 = this.LJLLI;
                            if (relativeLayout2 != null) {
                                C16880lQ.LJIJ(relativeLayout2, this);
                                LBJ lbj2 = this.LJLLILLLL;
                                if (lbj2 != null) {
                                    lbj2.setOnClickListener(new ViewOnClickListenerC13880ga(this));
                                    T5T t5t = this.LJLLLLLL;
                                    if (t5t != null) {
                                        t5t.setOnClickListener(new ViewOnClickListenerC13880ga(this));
                                        return;
                                    } else {
                                        o.LJIJI("labelItemThirdText");
                                        throw null;
                                    }
                                }
                                o.LJIJI("labelItemThirdView");
                                throw null;
                            }
                            o.LJIJI("labelItemSecondView");
                            throw null;
                        }
                        o.LJIJI("labelItemFirstView");
                        throw null;
                    }
                    o.LJIJI("thirdRadio");
                    throw null;
                }
                o.LJIJI("secondRadio");
                throw null;
            }
            o.LJIJI("firstRadio");
            throw null;
        }
        o.LJIJI("labelItemThirdView");
        throw null;
    }

    public final void vl(int i, String str) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "gender_tag_type").put("value", String.valueOf(i)));
        jSONArray.put(new JSONObject().put("field", "gender_tag_content").put("value", str));
        String jSONArray2 = jSONArray.toString();
        o.LJIIIIZZ(jSONArray2, "JSONArray().apply {\n    …ng))\n        }.toString()");
        Al(jSONArray2);
    }

    public final void wl(String str, boolean z) {
        if (str == null || str.length() == 0) {
            ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
            if (activityC45651qj != null) {
                C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
                return;
            }
            o.LJIJI("mActivity");
            throw null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "interest_tag_id").put("value", str));
        jSONArray.put(new JSONObject().put("field", "interest_tag_active").put("value", String.valueOf(z)));
        String jSONArray2 = jSONArray.toString();
        o.LJIIIIZZ(jSONArray2, "JSONArray().apply {\n    …()))\n        }.toString()");
        Al(jSONArray2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cl4, viewGroup, false);
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
