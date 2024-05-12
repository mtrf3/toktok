package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.AI8;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.AnonymousClass636;
import X.C04270Et;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C207798Dn;
import X.C26338AVi;
import X.C29S;
import X.C32151Nz;
import X.C33381Ss;
import X.C3C5;
import X.C41290GIk;
import X.C41297GIr;
import X.C47261Igj;
import X.C76800UCe;
import X.C7MY;
import X.C90903hW;
import X.FMX;
import X.O6R;
import Y.ACListenerS27S0100000_7;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.PopUpCopyWriting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PersonalizationAdPromptSheetExperimentFive extends Fragment {
    public static TuxSheet LJLJJI;
    public Activity LJLIL;
    public long LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
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

    public final void vl() {
        C41290GIk.LJIIJJI("1", true);
        TuxSheet tuxSheet = LJLJJI;
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
        TuxSheet tuxSheet = LJLJJI;
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
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PopUpCopyWriting popUpCopyWriting;
        boolean z;
        String str;
        String privacyPolicyLink;
        String str2;
        String privacyPolicyLink2;
        String str3;
        String str4;
        Integer popUpStyle;
        Integer popUpStyle2;
        String privacyPolicyLink3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        Integer num = null;
        if (LIZIZ != null) {
            popUpCopyWriting = LIZIZ.getAbCopyWriting();
        } else {
            popUpCopyWriting = null;
        }
        Activity activity = this.LJLIL;
        if (activity != null) {
            if (AnonymousClass636.LJIILJJIL(activity)) {
                View _$_findCachedViewById = _$_findCachedViewById(R.id.id8);
                Activity activity2 = this.LJLIL;
                if (activity2 != null) {
                    _$_findCachedViewById.setBackground(C04270Et.LIZIZ(activity2, R.drawable.c4i));
                    View prompt_experiment_five_first_layout = _$_findCachedViewById(R.id.id8);
                    o.LJIIIIZZ(prompt_experiment_five_first_layout, "prompt_experiment_five_first_layout");
                    C26338AVi.LJI(prompt_experiment_five_first_layout, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), null, AnonymousClass391.LIZJ(10), null, false, 26);
                    _$_findCachedViewById(R.id.id8).setPadding(0, 0, 0, 0);
                    View _$_findCachedViewById2 = _$_findCachedViewById(R.id.id_);
                    Activity activity3 = this.LJLIL;
                    if (activity3 != null) {
                        _$_findCachedViewById2.setBackground(C04270Et.LIZIZ(activity3, R.drawable.c4i));
                        View prompt_experiment_five_second_layout = _$_findCachedViewById(R.id.id_);
                        int LIZIZ2 = C7MY.LIZIZ(10);
                        int LIZIZ3 = C7MY.LIZIZ(10);
                        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
                        o.LJIIIIZZ(prompt_experiment_five_second_layout, "prompt_experiment_five_second_layout");
                        C26338AVi.LJI(prompt_experiment_five_second_layout, Integer.valueOf(LIZIZ2), Integer.valueOf(LJJIIZ), Integer.valueOf(LIZIZ3), null, false, 24);
                        _$_findCachedViewById(R.id.id_).setPadding(0, 0, 0, 0);
                    } else {
                        o.LJIJI("activty");
                        throw null;
                    }
                } else {
                    o.LJIJI("activty");
                    throw null;
                }
            }
            AdPersonalitySettings LIZIZ4 = C41290GIk.LIZIZ();
            if (LIZIZ4 == null || (num = LIZIZ4.getPopUpStyle()) == null || (num.intValue() != 9 && num.intValue() != 10)) {
                z = false;
            } else {
                z = true;
            }
            String str5 = "";
            if (z) {
                ((ImageView) _$_findCachedViewById(R.id.id9)).setVisibility(8);
                TextView textView = (TextView) _$_findCachedViewById(R.id.ida);
                Activity activity4 = this.LJLIL;
                if (activity4 != null) {
                    textView.setText(activity4.getResources().getString(R.string.sco));
                    ((TuxTextView) _$_findCachedViewById(R.id.ida)).LJJJ(32.0f);
                    Activity activity5 = this.LJLIL;
                    if (activity5 != null) {
                        String LIZIZ5 = C207798Dn.LIZIZ(activity5, R.string.scq, "activty.resources.getStr…description_3rdtest_v1v2)");
                        Activity activity6 = this.LJLIL;
                        if (activity6 != null) {
                            String LIZIZ6 = C207798Dn.LIZIZ(activity6, R.string.h2x, "activty.resources.getStr…hyperlink_placeholder_LM)");
                            Activity activity7 = this.LJLIL;
                            if (activity7 != null) {
                                String LIZIZ7 = C207798Dn.LIZIZ(activity7, R.string.h2y, "activty.resources.getStr…hyperlink_placeholder_PP)");
                                TextView textView2 = (TextView) _$_findCachedViewById(R.id.id7);
                                Activity activity8 = this.LJLIL;
                                if (activity8 != null) {
                                    List LJJIJIIJI = C47261Igj.LJJIJIIJI(LIZIZ6, LIZIZ7);
                                    String[] strArr = new String[2];
                                    if (popUpCopyWriting == null || (str4 = popUpCopyWriting.getLearnMoreLink()) == null) {
                                        str4 = "";
                                    }
                                    strArr[0] = str4;
                                    if (popUpCopyWriting != null && (privacyPolicyLink3 = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                                        str5 = privacyPolicyLink3;
                                    }
                                    strArr[1] = str5;
                                    textView2.setText(C41297GIr.LIZ(activity8, LIZIZ5, LJJIJIIJI, C47261Igj.LJJIJIIJI(strArr)));
                                    ((TextView) _$_findCachedViewById(R.id.id7)).setMovementMethod(LinkMovementMethod.getInstance());
                                    ((ImageView) _$_findCachedViewById(R.id.id5)).setVisibility(8);
                                    AI8 ai8 = (AI8) _$_findCachedViewById(R.id.idk);
                                    Activity activity9 = this.LJLIL;
                                    if (activity9 != null) {
                                        ai8.setTitle(activity9.getResources().getString(R.string.iq));
                                        AI8 ai82 = (AI8) _$_findCachedViewById(R.id.idk);
                                        Activity activity10 = this.LJLIL;
                                        if (activity10 != null) {
                                            ai82.setSubtitle(activity10.getResources().getString(R.string.it));
                                            AdPersonalitySettings LIZIZ8 = C41290GIk.LIZIZ();
                                            if (LIZIZ8 == null || (popUpStyle2 = LIZIZ8.getPopUpStyle()) == null || popUpStyle2.intValue() != 9) {
                                                C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.id8), new ACListenerS27S0100000_7(this, 143));
                                                ((AI8) _$_findCachedViewById(R.id.idk)).setOnClickListener(new AqS173S0100000_7(this, 338));
                                            } else {
                                                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.idj), new ACListenerS27S0100000_7(this, 142));
                                            }
                                            ((ImageView) _$_findCachedViewById(R.id.ide)).setVisibility(8);
                                            AI8 ai83 = (AI8) _$_findCachedViewById(R.id.idn);
                                            Activity activity11 = this.LJLIL;
                                            if (activity11 != null) {
                                                ai83.setTitle(activity11.getResources().getString(R.string.iv));
                                                AI8 ai84 = (AI8) _$_findCachedViewById(R.id.idn);
                                                Activity activity12 = this.LJLIL;
                                                if (activity12 != null) {
                                                    ai84.setSubtitle(activity12.getResources().getString(R.string.iy));
                                                    AdPersonalitySettings LIZIZ9 = C41290GIk.LIZIZ();
                                                    if (LIZIZ9 == null || (popUpStyle = LIZIZ9.getPopUpStyle()) == null || popUpStyle.intValue() != 9) {
                                                        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.id_), new ACListenerS27S0100000_7(this, 146));
                                                        ((AI8) _$_findCachedViewById(R.id.idn)).setOnClickListener(new AqS173S0100000_7(this, 341));
                                                    } else {
                                                        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.idm), new ACListenerS27S0100000_7(this, 145));
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
                    } else {
                        o.LJIJI("activty");
                        throw null;
                    }
                } else {
                    o.LJIJI("activty");
                    throw null;
                }
            } else if (num != null) {
                if (num.intValue() == 11) {
                    C33381Ss c33381Ss = new C33381Ss();
                    c33381Ss.LJLIL = R.drawable.b9u;
                    Activity activity13 = this.LJLIL;
                    if (activity13 != null) {
                        ((ImageView) _$_findCachedViewById(R.id.id9)).setImageDrawable(c33381Ss.LIZ(activity13));
                        ((ImageView) _$_findCachedViewById(R.id.id9)).setVisibility(0);
                        TextView textView3 = (TextView) _$_findCachedViewById(R.id.ida);
                        Activity activity14 = this.LJLIL;
                        if (activity14 != null) {
                            textView3.setText(activity14.getResources().getString(R.string.sco));
                            ((TuxTextView) _$_findCachedViewById(R.id.ida)).setTuxFont(13);
                            ((TextView) _$_findCachedViewById(R.id.ida)).setGravity(17);
                            Activity activity15 = this.LJLIL;
                            if (activity15 != null) {
                                String LIZIZ10 = C207798Dn.LIZIZ(activity15, R.string.scq, "activty.resources.getStr…description_3rdtest_v1v2)");
                                Activity activity16 = this.LJLIL;
                                if (activity16 != null) {
                                    String LIZIZ11 = C207798Dn.LIZIZ(activity16, R.string.h2x, "activty.resources.getStr…hyperlink_placeholder_LM)");
                                    Activity activity17 = this.LJLIL;
                                    if (activity17 != null) {
                                        String LIZIZ12 = C207798Dn.LIZIZ(activity17, R.string.h2y, "activty.resources.getStr…hyperlink_placeholder_PP)");
                                        TextView textView4 = (TextView) _$_findCachedViewById(R.id.id7);
                                        Activity activity18 = this.LJLIL;
                                        if (activity18 != null) {
                                            List LJJIJIIJI2 = C47261Igj.LJJIJIIJI(LIZIZ11, LIZIZ12);
                                            String[] strArr2 = new String[2];
                                            if (popUpCopyWriting == null || (str2 = popUpCopyWriting.getLearnMoreLink()) == null) {
                                                str2 = "";
                                            }
                                            strArr2[0] = str2;
                                            if (popUpCopyWriting != null && (privacyPolicyLink2 = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                                                str5 = privacyPolicyLink2;
                                            }
                                            strArr2[1] = str5;
                                            textView4.setText(C41297GIr.LIZ(activity18, LIZIZ10, LJJIJIIJI2, C47261Igj.LJJIJIIJI(strArr2)));
                                            ((TextView) _$_findCachedViewById(R.id.id7)).setMovementMethod(LinkMovementMethod.getInstance());
                                            ((TextView) _$_findCachedViewById(R.id.id7)).setGravity(17);
                                            ((ImageView) _$_findCachedViewById(R.id.id5)).setVisibility(8);
                                            AI8 ai85 = (AI8) _$_findCachedViewById(R.id.idk);
                                            Activity activity19 = this.LJLIL;
                                            if (activity19 != null) {
                                                ai85.setTitle(activity19.getResources().getString(R.string.iq));
                                                AI8 ai86 = (AI8) _$_findCachedViewById(R.id.idk);
                                                Activity activity20 = this.LJLIL;
                                                if (activity20 != null) {
                                                    ai86.setSubtitle(activity20.getResources().getString(R.string.it));
                                                    C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.id8), new ACListenerS27S0100000_7(this, 148));
                                                    ((AI8) _$_findCachedViewById(R.id.idk)).setOnClickListener(new AqS173S0100000_7(this, 343));
                                                    ((ImageView) _$_findCachedViewById(R.id.ide)).setVisibility(8);
                                                    AI8 ai87 = (AI8) _$_findCachedViewById(R.id.idn);
                                                    Activity activity21 = this.LJLIL;
                                                    if (activity21 != null) {
                                                        ai87.setTitle(activity21.getResources().getString(R.string.iv));
                                                        AI8 ai88 = (AI8) _$_findCachedViewById(R.id.idn);
                                                        Activity activity22 = this.LJLIL;
                                                        if (activity22 != null) {
                                                            ai88.setSubtitle(activity22.getResources().getString(R.string.iy));
                                                            C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.id_), new ACListenerS27S0100000_7(this, 150));
                                                            ((AI8) _$_findCachedViewById(R.id.idn)).setOnClickListener(new AqS173S0100000_7(this, 334));
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
                        } else {
                            o.LJIJI("activty");
                            throw null;
                        }
                    } else {
                        o.LJIJI("activty");
                        throw null;
                    }
                } else if (num.intValue() == 12) {
                    C33381Ss c33381Ss2 = new C33381Ss();
                    c33381Ss2.LJLIL = R.drawable.bfi;
                    Activity activity23 = this.LJLIL;
                    if (activity23 != null) {
                        ((ImageView) _$_findCachedViewById(R.id.id5)).setImageDrawable(c33381Ss2.LIZ(activity23));
                        C33381Ss c33381Ss3 = new C33381Ss();
                        c33381Ss3.LJLIL = R.drawable.bfa;
                        Activity activity24 = this.LJLIL;
                        if (activity24 != null) {
                            ((ImageView) _$_findCachedViewById(R.id.ide)).setImageDrawable(c33381Ss3.LIZ(activity24));
                            ((ImageView) _$_findCachedViewById(R.id.id9)).setVisibility(8);
                            TextView textView5 = (TextView) _$_findCachedViewById(R.id.ida);
                            Activity activity25 = this.LJLIL;
                            if (activity25 != null) {
                                textView5.setText(activity25.getResources().getString(R.string.sco));
                                ((TuxTextView) _$_findCachedViewById(R.id.ida)).LJJJ(32.0f);
                                Activity activity26 = this.LJLIL;
                                if (activity26 != null) {
                                    String LIZIZ13 = C207798Dn.LIZIZ(activity26, R.string.scq, "activty.resources.getStr…description_3rdtest_v1v2)");
                                    Activity activity27 = this.LJLIL;
                                    if (activity27 != null) {
                                        String LIZIZ14 = C207798Dn.LIZIZ(activity27, R.string.h2x, "activty.resources.getStr…hyperlink_placeholder_LM)");
                                        Activity activity28 = this.LJLIL;
                                        if (activity28 != null) {
                                            String LIZIZ15 = C207798Dn.LIZIZ(activity28, R.string.h2y, "activty.resources.getStr…hyperlink_placeholder_PP)");
                                            TextView textView6 = (TextView) _$_findCachedViewById(R.id.id7);
                                            Activity activity29 = this.LJLIL;
                                            if (activity29 != null) {
                                                List LJJIJIIJI3 = C47261Igj.LJJIJIIJI(LIZIZ14, LIZIZ15);
                                                String[] strArr3 = new String[2];
                                                if (popUpCopyWriting == null || (str = popUpCopyWriting.getLearnMoreLink()) == null) {
                                                    str = "";
                                                }
                                                strArr3[0] = str;
                                                if (popUpCopyWriting != null && (privacyPolicyLink = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                                                    str5 = privacyPolicyLink;
                                                }
                                                strArr3[1] = str5;
                                                textView6.setText(C41297GIr.LIZ(activity29, LIZIZ13, LJJIJIIJI3, C47261Igj.LJJIJIIJI(strArr3)));
                                                ((TextView) _$_findCachedViewById(R.id.id7)).setMovementMethod(LinkMovementMethod.getInstance());
                                                ((ImageView) _$_findCachedViewById(R.id.id5)).setVisibility(0);
                                                AI8 ai89 = (AI8) _$_findCachedViewById(R.id.idk);
                                                Activity activity30 = this.LJLIL;
                                                if (activity30 != null) {
                                                    ai89.setTitle(activity30.getResources().getString(R.string.iq));
                                                    AI8 ai810 = (AI8) _$_findCachedViewById(R.id.idk);
                                                    Activity activity31 = this.LJLIL;
                                                    if (activity31 != null) {
                                                        ai810.setSubtitle(activity31.getResources().getString(R.string.it));
                                                        ((AI8) _$_findCachedViewById(R.id.idk)).setWithSeparator(false);
                                                        _$_findCachedViewById(R.id.idl).setVisibility(0);
                                                        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.id8), new ACListenerS27S0100000_7(this, UserLevelGeckoUpdateSetting.DEFAULT));
                                                        ((AI8) _$_findCachedViewById(R.id.idk)).setOnClickListener(new AqS173S0100000_7(this, 335));
                                                        ((ImageView) _$_findCachedViewById(R.id.ide)).setVisibility(0);
                                                        AI8 ai811 = (AI8) _$_findCachedViewById(R.id.idn);
                                                        Activity activity32 = this.LJLIL;
                                                        if (activity32 != null) {
                                                            ai811.setTitle(activity32.getResources().getString(R.string.iv));
                                                            AI8 ai812 = (AI8) _$_findCachedViewById(R.id.idn);
                                                            Activity activity33 = this.LJLIL;
                                                            if (activity33 != null) {
                                                                ai812.setSubtitle(activity33.getResources().getString(R.string.iy));
                                                                ((AI8) _$_findCachedViewById(R.id.idk)).setWithSeparator(false);
                                                                _$_findCachedViewById(R.id.ido).setVisibility(0);
                                                                C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.id_), new ACListenerS27S0100000_7(this, 141));
                                                                ((AI8) _$_findCachedViewById(R.id.idn)).setOnClickListener(new AqS173S0100000_7(this, 337));
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
            this.LJLILLLLZI = System.currentTimeMillis();
            C188727au c188727au = new C188727au();
            if (C41290GIk.LJII() == 1) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str3 = "1";
            }
            c188727au.LJIIIZ("age_status", str3);
            FMX.LJIIL("display_equally_balanced_pa_prompt", c188727au.LIZ);
            return;
        }
        o.LJIJI("activty");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.agx, viewGroup, false);
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
