package com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice;

import X.AEY;
import X.AI2;
import X.AI8;
import X.AI9;
import X.C16880lQ;
import X.C188727au;
import X.C232559At;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25991AHz;
import X.C79045V0n;
import X.FMX;
import X.SY4;
import Y.ACListenerS27S0100000_7;
import Y.AObserverS75S0100000_7;
import Y.IDCListenerS207S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.ChooseYourExperienceCommonContentStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.CustomizeYourExperienceCommonContentStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.CustomizeYourExperienceStruct;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CustomizeYourExperienceFragment extends BaseAdChoiceFragment {
    public static int LJLJLLL = -1;
    public static int LJLL = -1;
    public static boolean LJLLI;
    public static boolean LJLLILLLL;
    public CustomizeYourExperienceStruct LJLJJLL;
    public long LJLJL;
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

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment
    public final int vl() {
        return R.layout.ajr;
    }

    public final void Dl() {
        AEY aey;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        AEY aey2;
        AEY aey3;
        AEY aey4;
        AI9 accessory = ((AI8) _$_findCachedViewById(R.id.n9p)).getAccessory();
        if (accessory instanceof C25991AHz) {
            aey = (AEY) accessory;
        } else {
            aey = null;
        }
        boolean z5 = true;
        if (aey != null && aey.LJIIL()) {
            z = true;
        } else {
            z = false;
        }
        AI9 accessory2 = ((AI8) _$_findCachedViewById(R.id.n9o)).getAccessory();
        if ((accessory2 instanceof C25991AHz) && (aey4 = (AEY) accessory2) != null && aey4.LJIIL()) {
            z2 = true;
        } else {
            z2 = false;
        }
        AI9 accessory3 = ((AI8) _$_findCachedViewById(R.id.xp)).getAccessory();
        if ((accessory3 instanceof C25991AHz) && (aey3 = (AEY) accessory3) != null && aey3.LJIIL()) {
            z3 = true;
        } else {
            z3 = false;
        }
        AI9 accessory4 = ((AI8) _$_findCachedViewById(R.id.xn)).getAccessory();
        if ((accessory4 instanceof C25991AHz) && (aey2 = (AEY) accessory4) != null && aey2.LJIIL()) {
            z4 = true;
        } else {
            z4 = false;
        }
        MutableLiveData<Boolean> mutableLiveData = xl().LJLIL;
        if ((!z2 && !z) || (!z3 && !z4)) {
            z5 = false;
        }
        mutableLiveData.postValue(Boolean.valueOf(z5));
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AEY aey;
        boolean z;
        int i;
        AEY aey2;
        AEY aey3;
        AEY aey4;
        AEY aey5;
        super.onDestroyView();
        AI9 accessory = ((AI8) _$_findCachedViewById(R.id.n9p)).getAccessory();
        if (accessory instanceof C25991AHz) {
            aey = (AEY) accessory;
        } else {
            aey = null;
        }
        boolean z2 = true;
        if (aey != null && aey.LJIIL()) {
            z = true;
        } else {
            z = false;
        }
        int i2 = -1;
        if (z) {
            i = 1;
        } else {
            AI9 accessory2 = ((AI8) _$_findCachedViewById(R.id.n9o)).getAccessory();
            if ((accessory2 instanceof C25991AHz) && (aey2 = (AEY) accessory2) != null && aey2.LJIIL()) {
                i = 0;
            } else {
                i = -1;
            }
        }
        LJLJLLL = i;
        AI9 accessory3 = ((AI8) _$_findCachedViewById(R.id.xp)).getAccessory();
        if ((accessory3 instanceof C25991AHz) && (aey5 = (AEY) accessory3) != null && aey5.LJIIL()) {
            i2 = 1;
        } else {
            AI9 accessory4 = ((AI8) _$_findCachedViewById(R.id.xn)).getAccessory();
            if ((accessory4 instanceof C25991AHz) && (aey3 = (AEY) accessory4) != null && aey3.LJIIL()) {
                i2 = 0;
            }
        }
        LJLL = i2;
        AI9 accessory5 = ((AI8) _$_findCachedViewById(R.id.xq)).getAccessory();
        if (!(accessory5 instanceof AI2) || (aey4 = (AEY) accessory5) == null || !aey4.LJIIL()) {
            z2 = false;
        }
        LJLLI = z2;
        _$_clearFindViewByIdCache();
    }

    public final void Al(boolean z) {
        AEY aey;
        int i;
        int i2;
        AEY aey2;
        AEY aey3;
        AEY aey4;
        AEY aey5;
        C188727au c188727au = new C188727au();
        c188727au.LJ(SystemClock.elapsedRealtime() - this.LJLJL, "stay_time");
        AI9 accessory = ((AI8) _$_findCachedViewById(R.id.xq)).getAccessory();
        if (accessory instanceof AI2) {
            aey = (AEY) accessory;
        } else {
            aey = null;
        }
        int i3 = 0;
        if (aey != null && aey.LJIIL()) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "toggle_status");
        AI9 accessory2 = ((AI8) _$_findCachedViewById(R.id.n9p)).getAccessory();
        if ((accessory2 instanceof C25991AHz) && (aey5 = (AEY) accessory2) != null && aey5.LJIIL()) {
            i2 = 1;
        } else {
            AI9 accessory3 = ((AI8) _$_findCachedViewById(R.id.n9o)).getAccessory();
            if ((accessory3 instanceof C25991AHz) && (aey2 = (AEY) accessory3) != null && aey2.LJIIL()) {
                i2 = 0;
            } else {
                i2 = -1;
            }
        }
        c188727au.LIZLLL(i2, "video_status");
        AI9 accessory4 = ((AI8) _$_findCachedViewById(R.id.xp)).getAccessory();
        if ((accessory4 instanceof C25991AHz) && (aey4 = (AEY) accessory4) != null && aey4.LJIIL()) {
            i3 = 1;
        } else {
            AI9 accessory5 = ((AI8) _$_findCachedViewById(R.id.xn)).getAccessory();
            if (!(accessory5 instanceof C25991AHz) || (aey3 = (AEY) accessory5) == null || !aey3.LJIIL()) {
                i3 = -1;
            }
        }
        c188727au.LIZLLL(i3, "ad_status");
        c188727au.LIZLLL(!z ? 1 : 0, "is_back");
        FMX.LJIIL("exit_choose_your_experience_prompt", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CustomizeYourExperienceStruct customizeYourExperienceStruct;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (customizeYourExperienceStruct = (CustomizeYourExperienceStruct) arguments.getParcelable("customizeYourExperienceFragmentData")) != null) {
            this.LJLJJLL = customizeYourExperienceStruct;
            this.LJLJL = SystemClock.elapsedRealtime();
            C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
            C235119Kp c235119Kp = new C235119Kp();
            boolean z5 = true;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS157S0100000_7(this, 440));
            c235119Kp.LIZLLL(LIZJ);
            c235119Kp.LIZLLL = false;
            c252709vu.setNavActions(c235119Kp);
            Context context = _$_findCachedViewById(R.id.gwg).getContext();
            o.LJIIIIZZ(context, "nav_bar.context");
            Integer LJI = C79045V0n.LJI(R.attr.c9, context);
            if (LJI != null) {
                ((C252709vu) _$_findCachedViewById(R.id.gwg)).setNavBackground(LJI.intValue());
            }
            TextView textView = (TextView) _$_findCachedViewById(R.id.e4n);
            CustomizeYourExperienceStruct customizeYourExperienceStruct2 = this.LJLJJLL;
            if (customizeYourExperienceStruct2 != null) {
                textView.setText(customizeYourExperienceStruct2.header_title);
                ((TuxTextView) _$_findCachedViewById(R.id.e4n)).LJJJ(38.0f);
                TextView textView2 = (TextView) _$_findCachedViewById(R.id.n9r);
                CustomizeYourExperienceStruct customizeYourExperienceStruct3 = this.LJLJJLL;
                if (customizeYourExperienceStruct3 != null) {
                    textView2.setText(customizeYourExperienceStruct3.video_experience_data.title);
                    AI8 ai8 = (AI8) _$_findCachedViewById(R.id.n9p);
                    CustomizeYourExperienceStruct customizeYourExperienceStruct4 = this.LJLJJLL;
                    if (customizeYourExperienceStruct4 != null) {
                        ai8.setTitle(customizeYourExperienceStruct4.video_experience_data.personalized_title);
                        CustomizeYourExperienceStruct customizeYourExperienceStruct5 = this.LJLJJLL;
                        if (customizeYourExperienceStruct5 != null) {
                            if (!TextUtils.isEmpty(customizeYourExperienceStruct5.video_experience_data.personalized_link_text)) {
                                AI8 ai82 = (AI8) _$_findCachedViewById(R.id.n9p);
                                Context context2 = _$_findCachedViewById(R.id.n9p).getContext();
                                o.LJIIIIZZ(context2, "videos_personalize_cell.context");
                                CustomizeYourExperienceStruct customizeYourExperienceStruct6 = this.LJLJJLL;
                                if (customizeYourExperienceStruct6 != null) {
                                    CustomizeYourExperienceCommonContentStruct customizeYourExperienceCommonContentStruct = customizeYourExperienceStruct6.video_experience_data;
                                    ai82.setSubtitle(C232559At.LIZ(context2, customizeYourExperienceCommonContentStruct.personalized_link_text, customizeYourExperienceCommonContentStruct.personalized_desc, new AqS157S0100000_7(this, 441)));
                                    ((TextView) _$_findCachedViewById(R.id.n9p).findViewById(R.id.ks_)).setMovementMethod(LinkMovementMethod.getInstance());
                                } else {
                                    o.LJIJI("data");
                                    throw null;
                                }
                            } else {
                                AI8 ai83 = (AI8) _$_findCachedViewById(R.id.n9p);
                                CustomizeYourExperienceStruct customizeYourExperienceStruct7 = this.LJLJJLL;
                                if (customizeYourExperienceStruct7 != null) {
                                    ai83.setSubtitle(customizeYourExperienceStruct7.video_experience_data.personalized_desc);
                                } else {
                                    o.LJIJI("data");
                                    throw null;
                                }
                            }
                            AI8 ai84 = (AI8) _$_findCachedViewById(R.id.n9p);
                            Context context3 = _$_findCachedViewById(R.id.n9p).getContext();
                            o.LJIIIIZZ(context3, "videos_personalize_cell.context");
                            C25991AHz c25991AHz = new C25991AHz(context3);
                            if (LJLJLLL == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c25991AHz.LJIILIIL(z);
                            c25991AHz.LJIILL(new IDCListenerS207S0100000_7(this, 5));
                            ai84.setAccessory(c25991AHz);
                            AI8 ai85 = (AI8) _$_findCachedViewById(R.id.n9o);
                            CustomizeYourExperienceStruct customizeYourExperienceStruct8 = this.LJLJJLL;
                            if (customizeYourExperienceStruct8 != null) {
                                ai85.setTitle(customizeYourExperienceStruct8.video_experience_data.generic_title);
                                AI8 ai86 = (AI8) _$_findCachedViewById(R.id.n9o);
                                CustomizeYourExperienceStruct customizeYourExperienceStruct9 = this.LJLJJLL;
                                if (customizeYourExperienceStruct9 != null) {
                                    ai86.setSubtitle(customizeYourExperienceStruct9.video_experience_data.generic_desc);
                                    AI8 ai87 = (AI8) _$_findCachedViewById(R.id.n9o);
                                    Context context4 = _$_findCachedViewById(R.id.n9o).getContext();
                                    o.LJIIIIZZ(context4, "videos_generic_cell.context");
                                    C25991AHz c25991AHz2 = new C25991AHz(context4);
                                    if (LJLJLLL == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c25991AHz2.LJIILIIL(z2);
                                    c25991AHz2.LJIILL(new IDCListenerS207S0100000_7(this, 6));
                                    ai87.setAccessory(c25991AHz2);
                                    TextView textView3 = (TextView) _$_findCachedViewById(R.id.xt);
                                    CustomizeYourExperienceStruct customizeYourExperienceStruct10 = this.LJLJJLL;
                                    if (customizeYourExperienceStruct10 != null) {
                                        textView3.setText(customizeYourExperienceStruct10.ads_experience_data.title);
                                        AI8 ai88 = (AI8) _$_findCachedViewById(R.id.xp);
                                        CustomizeYourExperienceStruct customizeYourExperienceStruct11 = this.LJLJJLL;
                                        if (customizeYourExperienceStruct11 != null) {
                                            ai88.setTitle(customizeYourExperienceStruct11.ads_experience_data.personalized_title);
                                            CustomizeYourExperienceStruct customizeYourExperienceStruct12 = this.LJLJJLL;
                                            if (customizeYourExperienceStruct12 != null) {
                                                if (!TextUtils.isEmpty(customizeYourExperienceStruct12.ads_experience_data.personalized_link_text)) {
                                                    AI8 ai89 = (AI8) _$_findCachedViewById(R.id.xp);
                                                    Context context5 = _$_findCachedViewById(R.id.xp).getContext();
                                                    o.LJIIIIZZ(context5, "ads_personalize_cell.context");
                                                    CustomizeYourExperienceStruct customizeYourExperienceStruct13 = this.LJLJJLL;
                                                    if (customizeYourExperienceStruct13 != null) {
                                                        CustomizeYourExperienceCommonContentStruct customizeYourExperienceCommonContentStruct2 = customizeYourExperienceStruct13.ads_experience_data;
                                                        ai89.setSubtitle(C232559At.LIZ(context5, customizeYourExperienceCommonContentStruct2.personalized_link_text, customizeYourExperienceCommonContentStruct2.personalized_desc, new AqS157S0100000_7(this, 442)));
                                                        ((TextView) _$_findCachedViewById(R.id.xp).findViewById(R.id.ks_)).setMovementMethod(LinkMovementMethod.getInstance());
                                                    } else {
                                                        o.LJIJI("data");
                                                        throw null;
                                                    }
                                                } else {
                                                    AI8 ai810 = (AI8) _$_findCachedViewById(R.id.xp);
                                                    CustomizeYourExperienceStruct customizeYourExperienceStruct14 = this.LJLJJLL;
                                                    if (customizeYourExperienceStruct14 != null) {
                                                        ai810.setSubtitle(customizeYourExperienceStruct14.ads_experience_data.personalized_desc);
                                                    } else {
                                                        o.LJIJI("data");
                                                        throw null;
                                                    }
                                                }
                                                AI8 ai811 = (AI8) _$_findCachedViewById(R.id.xp);
                                                Context context6 = _$_findCachedViewById(R.id.xp).getContext();
                                                o.LJIIIIZZ(context6, "ads_personalize_cell.context");
                                                C25991AHz c25991AHz3 = new C25991AHz(context6);
                                                if (LJLL == 1) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                c25991AHz3.LJIILIIL(z3);
                                                c25991AHz3.LJIILL(new IDCListenerS207S0100000_7(this, 7));
                                                ai811.setAccessory(c25991AHz3);
                                                AI8 ai812 = (AI8) _$_findCachedViewById(R.id.xq);
                                                CustomizeYourExperienceStruct customizeYourExperienceStruct15 = this.LJLJJLL;
                                                if (customizeYourExperienceStruct15 != null) {
                                                    ai812.setTitle(customizeYourExperienceStruct15.ads_experience_data.personalized_off_tiktok_title);
                                                    AI8 ai813 = (AI8) _$_findCachedViewById(R.id.xq);
                                                    CustomizeYourExperienceStruct customizeYourExperienceStruct16 = this.LJLJJLL;
                                                    if (customizeYourExperienceStruct16 != null) {
                                                        ai813.setSubtitle(customizeYourExperienceStruct16.ads_experience_data.personalized_off_tiktok_desc);
                                                        AI8 ai814 = (AI8) _$_findCachedViewById(R.id.xq);
                                                        Context context7 = _$_findCachedViewById(R.id.xq).getContext();
                                                        o.LJIIIIZZ(context7, "ads_personalize_off_tiktok_cell.context");
                                                        AI2 ai2 = new AI2(context7);
                                                        ai2.LJIILIIL(LJLLI);
                                                        ai814.setAccessory(ai2);
                                                        View _$_findCachedViewById = _$_findCachedViewById(R.id.d1h);
                                                        if (LJLLILLLL) {
                                                            i = 0;
                                                        } else {
                                                            i = 8;
                                                        }
                                                        _$_findCachedViewById.setVisibility(i);
                                                        AI8 ai815 = (AI8) _$_findCachedViewById(R.id.xq);
                                                        if (LJLL == 1) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        ai815.setCellEnabled(z4);
                                                        AI8 ai816 = (AI8) _$_findCachedViewById(R.id.xn);
                                                        CustomizeYourExperienceStruct customizeYourExperienceStruct17 = this.LJLJJLL;
                                                        if (customizeYourExperienceStruct17 != null) {
                                                            ai816.setTitle(customizeYourExperienceStruct17.ads_experience_data.generic_title);
                                                            AI8 ai817 = (AI8) _$_findCachedViewById(R.id.xn);
                                                            CustomizeYourExperienceStruct customizeYourExperienceStruct18 = this.LJLJJLL;
                                                            if (customizeYourExperienceStruct18 != null) {
                                                                ai817.setSubtitle(customizeYourExperienceStruct18.ads_experience_data.generic_desc);
                                                                AI8 ai818 = (AI8) _$_findCachedViewById(R.id.xn);
                                                                Context context8 = _$_findCachedViewById(R.id.xn).getContext();
                                                                o.LJIIIIZZ(context8, "ads_generic_cell.context");
                                                                C25991AHz c25991AHz4 = new C25991AHz(context8);
                                                                if (LJLL != 0) {
                                                                    z5 = false;
                                                                }
                                                                c25991AHz4.LJIILIIL(z5);
                                                                c25991AHz4.LJIILL(new IDCListenerS207S0100000_7(this, 8));
                                                                ai818.setAccessory(c25991AHz4);
                                                                CustomizeYourExperienceStruct customizeYourExperienceStruct19 = this.LJLJJLL;
                                                                if (customizeYourExperienceStruct19 != null) {
                                                                    if (!TextUtils.isEmpty(customizeYourExperienceStruct19.learn_more_data.link_text)) {
                                                                        TextView textView4 = (TextView) _$_findCachedViewById(R.id.e5i);
                                                                        Context context9 = _$_findCachedViewById(R.id.e5i).getContext();
                                                                        o.LJIIIIZZ(context9, "hint.context");
                                                                        CustomizeYourExperienceStruct customizeYourExperienceStruct20 = this.LJLJJLL;
                                                                        if (customizeYourExperienceStruct20 != null) {
                                                                            ChooseYourExperienceCommonContentStruct chooseYourExperienceCommonContentStruct = customizeYourExperienceStruct20.learn_more_data;
                                                                            textView4.setText(C232559At.LIZ(context9, chooseYourExperienceCommonContentStruct.link_text, chooseYourExperienceCommonContentStruct.desc, new AqS157S0100000_7(this, 443)));
                                                                            ((TextView) _$_findCachedViewById(R.id.e5i)).setMovementMethod(LinkMovementMethod.getInstance());
                                                                        } else {
                                                                            o.LJIJI("data");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        TextView textView5 = (TextView) _$_findCachedViewById(R.id.e5i);
                                                                        CustomizeYourExperienceStruct customizeYourExperienceStruct21 = this.LJLJJLL;
                                                                        if (customizeYourExperienceStruct21 != null) {
                                                                            textView5.setText(customizeYourExperienceStruct21.learn_more_data.desc);
                                                                        } else {
                                                                            o.LJIJI("data");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    TextView textView6 = (TextView) _$_findCachedViewById(R.id.h0u);
                                                                    CustomizeYourExperienceStruct customizeYourExperienceStruct22 = this.LJLJJLL;
                                                                    if (customizeYourExperienceStruct22 != null) {
                                                                        textView6.setText(customizeYourExperienceStruct22.next_button_text);
                                                                        _$_findCachedViewById(R.id.h0u).getClass();
                                                                        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.h0u), new ACListenerS27S0100000_7(this, 87));
                                                                        Dl();
                                                                        xl().LJLIL.observe(getViewLifecycleOwner(), new AObserverS75S0100000_7(this, 57));
                                                                        return;
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
