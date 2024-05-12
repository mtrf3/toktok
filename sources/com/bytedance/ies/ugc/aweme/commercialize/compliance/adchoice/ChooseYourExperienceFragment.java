package com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice;

import X.C16880lQ;
import X.C188727au;
import X.C232559At;
import X.FMX;
import X.SY4;
import Y.ACListenerS27S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceCommonContentStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceStruct;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChooseYourExperienceFragment extends BaseAdChoiceFragment {
    public static final /* synthetic */ int LJLJLLL = 0;
    public ChooseYourExperienceStruct LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment
    public final int vl() {
        return R.layout.w0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        super.onResume();
        C188727au c188727au = new C188727au();
        if (this.LJLJL) {
            str = "more_options";
        } else {
            str = this.LJLJJI;
            if (str == null) {
                str = "";
            }
        }
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("show_choose_your_experience_prompt", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ChooseYourExperienceStruct chooseYourExperienceStruct;
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (chooseYourExperienceStruct = (ChooseYourExperienceStruct) arguments.getParcelable("chooseYourExperienceFragmentData")) != null) {
            this.LJLJJLL = chooseYourExperienceStruct;
            TextView textView = (TextView) _$_findCachedViewById(R.id.e4n);
            ChooseYourExperienceStruct chooseYourExperienceStruct2 = this.LJLJJLL;
            if (chooseYourExperienceStruct2 != null) {
                textView.setText(chooseYourExperienceStruct2.header_title);
                ((TuxTextView) _$_findCachedViewById(R.id.e4n)).LJJJ(38.0f);
                TextView textView2 = (TextView) _$_findCachedViewById(R.id.hmt);
                ChooseYourExperienceStruct chooseYourExperienceStruct3 = this.LJLJJLL;
                if (chooseYourExperienceStruct3 != null) {
                    textView2.setText(chooseYourExperienceStruct3.personalize_data.title);
                    TextView textView3 = (TextView) _$_findCachedViewById(R.id.hms);
                    ChooseYourExperienceStruct chooseYourExperienceStruct4 = this.LJLJJLL;
                    if (chooseYourExperienceStruct4 != null) {
                        textView3.setText(chooseYourExperienceStruct4.personalize_data.sub_title);
                        ChooseYourExperienceStruct chooseYourExperienceStruct5 = this.LJLJJLL;
                        if (chooseYourExperienceStruct5 != null) {
                            String str = chooseYourExperienceStruct5.personalize_data.link_text;
                            if (str == null || str.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                TextView textView4 = (TextView) _$_findCachedViewById(R.id.hmo);
                                Context context = _$_findCachedViewById(R.id.hmo).getContext();
                                o.LJIIIIZZ(context, "personalized_desc.context");
                                ChooseYourExperienceStruct chooseYourExperienceStruct6 = this.LJLJJLL;
                                if (chooseYourExperienceStruct6 != null) {
                                    ChooseYourExperienceCommonContentStruct chooseYourExperienceCommonContentStruct = chooseYourExperienceStruct6.personalize_data;
                                    textView4.setText(C232559At.LIZ(context, chooseYourExperienceCommonContentStruct.link_text, chooseYourExperienceCommonContentStruct.desc, new AqS157S0100000_7(this, 437)));
                                    ((TextView) _$_findCachedViewById(R.id.hmo)).setMovementMethod(LinkMovementMethod.getInstance());
                                } else {
                                    o.LJIJI("data");
                                    throw null;
                                }
                            } else {
                                TextView textView5 = (TextView) _$_findCachedViewById(R.id.hmo);
                                ChooseYourExperienceStruct chooseYourExperienceStruct7 = this.LJLJJLL;
                                if (chooseYourExperienceStruct7 != null) {
                                    textView5.setText(chooseYourExperienceStruct7.personalize_data.desc);
                                } else {
                                    o.LJIJI("data");
                                    throw null;
                                }
                            }
                            SY4 sy4 = (SY4) _$_findCachedViewById(R.id.hmr);
                            sy4.getClass();
                            ChooseYourExperienceStruct chooseYourExperienceStruct8 = this.LJLJJLL;
                            if (chooseYourExperienceStruct8 != null) {
                                sy4.setText(chooseYourExperienceStruct8.personalize_data.button_text);
                                C16880lQ.LJJIZ(sy4, new ACListenerS27S0100000_7(this, 84));
                                TextView textView6 = (TextView) _$_findCachedViewById(R.id.dr4);
                                ChooseYourExperienceStruct chooseYourExperienceStruct9 = this.LJLJJLL;
                                if (chooseYourExperienceStruct9 != null) {
                                    textView6.setText(chooseYourExperienceStruct9.gen_data.title);
                                    TextView textView7 = (TextView) _$_findCachedViewById(R.id.dr3);
                                    ChooseYourExperienceStruct chooseYourExperienceStruct10 = this.LJLJJLL;
                                    if (chooseYourExperienceStruct10 != null) {
                                        textView7.setText(chooseYourExperienceStruct10.gen_data.sub_title);
                                        ChooseYourExperienceStruct chooseYourExperienceStruct11 = this.LJLJJLL;
                                        if (chooseYourExperienceStruct11 != null) {
                                            if (!TextUtils.isEmpty(chooseYourExperienceStruct11.gen_data.link_text)) {
                                                TextView textView8 = (TextView) _$_findCachedViewById(R.id.dr1);
                                                Context context2 = _$_findCachedViewById(R.id.dr1).getContext();
                                                o.LJIIIIZZ(context2, "generic_desc.context");
                                                ChooseYourExperienceStruct chooseYourExperienceStruct12 = this.LJLJJLL;
                                                if (chooseYourExperienceStruct12 != null) {
                                                    ChooseYourExperienceCommonContentStruct chooseYourExperienceCommonContentStruct2 = chooseYourExperienceStruct12.gen_data;
                                                    textView8.setText(C232559At.LIZ(context2, chooseYourExperienceCommonContentStruct2.link_text, chooseYourExperienceCommonContentStruct2.desc, new AqS157S0100000_7(this, 438)));
                                                    ((TextView) _$_findCachedViewById(R.id.dr1)).setMovementMethod(LinkMovementMethod.getInstance());
                                                } else {
                                                    o.LJIJI("data");
                                                    throw null;
                                                }
                                            } else {
                                                TextView textView9 = (TextView) _$_findCachedViewById(R.id.dr1);
                                                ChooseYourExperienceStruct chooseYourExperienceStruct13 = this.LJLJJLL;
                                                if (chooseYourExperienceStruct13 != null) {
                                                    textView9.setText(chooseYourExperienceStruct13.gen_data.desc);
                                                } else {
                                                    o.LJIJI("data");
                                                    throw null;
                                                }
                                            }
                                            SY4 sy42 = (SY4) _$_findCachedViewById(R.id.dr2);
                                            sy42.getClass();
                                            ChooseYourExperienceStruct chooseYourExperienceStruct14 = this.LJLJJLL;
                                            if (chooseYourExperienceStruct14 != null) {
                                                sy42.setText(chooseYourExperienceStruct14.gen_data.button_text);
                                                C16880lQ.LJJIZ(sy42, new ACListenerS27S0100000_7(this, 85));
                                                TextView textView10 = (TextView) _$_findCachedViewById(R.id.gmu);
                                                ChooseYourExperienceStruct chooseYourExperienceStruct15 = this.LJLJJLL;
                                                if (chooseYourExperienceStruct15 != null) {
                                                    textView10.setText(chooseYourExperienceStruct15.more_options_data.title);
                                                    TextView textView11 = (TextView) _$_findCachedViewById(R.id.gmt);
                                                    ChooseYourExperienceStruct chooseYourExperienceStruct16 = this.LJLJJLL;
                                                    if (chooseYourExperienceStruct16 != null) {
                                                        textView11.setText(chooseYourExperienceStruct16.more_options_data.desc);
                                                        SY4 sy43 = (SY4) _$_findCachedViewById(R.id.b2_);
                                                        sy43.getClass();
                                                        ChooseYourExperienceStruct chooseYourExperienceStruct17 = this.LJLJJLL;
                                                        if (chooseYourExperienceStruct17 != null) {
                                                            sy43.setText(chooseYourExperienceStruct17.more_options_data.button_text);
                                                            C16880lQ.LJJIZ(sy43, new ACListenerS27S0100000_7(this, 86));
                                                            ChooseYourExperienceStruct chooseYourExperienceStruct18 = this.LJLJJLL;
                                                            if (chooseYourExperienceStruct18 != null) {
                                                                if (!TextUtils.isEmpty(chooseYourExperienceStruct18.learn_more_data.link_text)) {
                                                                    TextView textView12 = (TextView) _$_findCachedViewById(R.id.e5i);
                                                                    Context context3 = _$_findCachedViewById(R.id.e5i).getContext();
                                                                    o.LJIIIIZZ(context3, "hint.context");
                                                                    ChooseYourExperienceStruct chooseYourExperienceStruct19 = this.LJLJJLL;
                                                                    if (chooseYourExperienceStruct19 != null) {
                                                                        ChooseYourExperienceCommonContentStruct chooseYourExperienceCommonContentStruct3 = chooseYourExperienceStruct19.learn_more_data;
                                                                        textView12.setText(C232559At.LIZ(context3, chooseYourExperienceCommonContentStruct3.link_text, chooseYourExperienceCommonContentStruct3.desc, new AqS157S0100000_7(this, 439)));
                                                                        ((TextView) _$_findCachedViewById(R.id.e5i)).setMovementMethod(LinkMovementMethod.getInstance());
                                                                        return;
                                                                    }
                                                                    o.LJIJI("data");
                                                                    throw null;
                                                                }
                                                                TextView textView13 = (TextView) _$_findCachedViewById(R.id.e5i);
                                                                ChooseYourExperienceStruct chooseYourExperienceStruct20 = this.LJLJJLL;
                                                                if (chooseYourExperienceStruct20 != null) {
                                                                    textView13.setText(chooseYourExperienceStruct20.learn_more_data.desc);
                                                                    return;
                                                                } else {
                                                                    o.LJIJI("data");
                                                                    throw null;
                                                                }
                                                            }
                                                            o.LJIJI("data");
                                                            throw null;
                                                        }
                                                        o.LJIJI("data");
                                                        throw null;
                                                    }
                                                    o.LJIJI("data");
                                                    throw null;
                                                }
                                                o.LJIJI("data");
                                                throw null;
                                            }
                                            o.LJIJI("data");
                                            throw null;
                                        }
                                        o.LJIJI("data");
                                        throw null;
                                    }
                                    o.LJIJI("data");
                                    throw null;
                                }
                                o.LJIJI("data");
                                throw null;
                            }
                            o.LJIJI("data");
                            throw null;
                        }
                        o.LJIJI("data");
                        throw null;
                    }
                    o.LJIJI("data");
                    throw null;
                }
                o.LJIJI("data");
                throw null;
            }
            o.LJIJI("data");
            throw null;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
