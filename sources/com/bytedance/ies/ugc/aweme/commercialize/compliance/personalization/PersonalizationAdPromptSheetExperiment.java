package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.AEM;
import X.AI8;
import X.AI9;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C2068389v;
import X.C207798Dn;
import X.C29S;
import X.C33381Ss;
import X.C3C5;
import X.C41290GIk;
import X.C41297GIr;
import X.C47261Igj;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.SY4;
import Y.ACListenerS27S0100000_7;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.PopUpCopyWriting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PersonalizationAdPromptSheetExperiment extends Fragment {
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
        Integer num;
        boolean z;
        String str;
        String str2;
        Integer popUpStyle;
        String privacyPolicyLink;
        Integer popUpStyle2;
        String str3;
        String privacyPolicyLink2;
        String str4;
        String privacyPolicyLink3;
        String str5;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null) {
            popUpCopyWriting = LIZIZ.getAbCopyWriting();
        } else {
            popUpCopyWriting = null;
        }
        AdPersonalitySettings LIZIZ2 = C41290GIk.LIZIZ();
        if (LIZIZ2 != null) {
            num = LIZIZ2.getPopUpStyle();
        } else {
            num = null;
        }
        String str6 = "";
        if (num != null) {
            if (num.intValue() == 8) {
                C33381Ss c33381Ss = new C33381Ss();
                c33381Ss.LJLIL = R.drawable.b_5;
                Activity activity = this.LJLIL;
                if (activity != null) {
                    ((ImageView) _$_findCachedViewById(R.id.idc)).setImageDrawable(c33381Ss.LIZ(activity));
                    TextView textView = (TextView) _$_findCachedViewById(R.id.idd);
                    Activity activity2 = this.LJLIL;
                    if (activity2 != null) {
                        textView.setText(activity2.getResources().getString(R.string.sco));
                        Activity activity3 = this.LJLIL;
                        if (activity3 != null) {
                            String LIZIZ3 = C207798Dn.LIZIZ(activity3, R.string.scq, "activty.resources.getStr…description_3rdtest_v1v2)");
                            Activity activity4 = this.LJLIL;
                            if (activity4 != null) {
                                String LIZIZ4 = C207798Dn.LIZIZ(activity4, R.string.h2x, "activty.resources.getStr…hyperlink_placeholder_LM)");
                                Activity activity5 = this.LJLIL;
                                if (activity5 != null) {
                                    String LIZIZ5 = C207798Dn.LIZIZ(activity5, R.string.h2y, "activty.resources.getStr…hyperlink_placeholder_PP)");
                                    TextView textView2 = (TextView) _$_findCachedViewById(R.id.idb);
                                    Activity activity6 = this.LJLIL;
                                    if (activity6 != null) {
                                        List LJJIJIIJI = C47261Igj.LJJIJIIJI(LIZIZ4, LIZIZ5);
                                        String[] strArr = new String[2];
                                        if (popUpCopyWriting == null || (str4 = popUpCopyWriting.getLearnMoreLink()) == null) {
                                            str4 = "";
                                        }
                                        strArr[0] = str4;
                                        if (popUpCopyWriting != null && (privacyPolicyLink3 = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                                            str6 = privacyPolicyLink3;
                                        }
                                        strArr[1] = str6;
                                        textView2.setText(C41297GIr.LIZ(activity6, LIZIZ3, LJJIJIIJI, C47261Igj.LJJIJIIJI(strArr)));
                                        ((TextView) _$_findCachedViewById(R.id.idb)).setMovementMethod(LinkMovementMethod.getInstance());
                                        TextView textView3 = (TextView) _$_findCachedViewById(R.id.idu);
                                        Activity activity7 = this.LJLIL;
                                        if (activity7 != null) {
                                            textView3.setText(activity7.getResources().getString(R.string.dw1));
                                            _$_findCachedViewById(R.id.idu).setVisibility(0);
                                            _$_findCachedViewById(R.id.idp).setVisibility(0);
                                            AI8 ai8 = (AI8) _$_findCachedViewById(R.id.idp);
                                            Activity activity8 = this.LJLIL;
                                            if (activity8 != null) {
                                                ai8.setTitle(activity8.getResources().getString(R.string.ip));
                                                ((AI8) _$_findCachedViewById(R.id.idp)).setWithSeparator(true);
                                                TextView textView4 = (TextView) _$_findCachedViewById(R.id.idq);
                                                Activity activity9 = this.LJLIL;
                                                if (activity9 != null) {
                                                    textView4.setText(activity9.getResources().getString(R.string.it));
                                                    AI9 accessory = ((AI8) _$_findCachedViewById(R.id.idp)).getAccessory();
                                                    o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Button");
                                                    AEM aem = (AEM) accessory;
                                                    Activity activity10 = this.LJLIL;
                                                    if (activity10 != null) {
                                                        aem.LJIIL(activity10.getResources().getString(R.string.iz));
                                                        aem.LJIIJJI(new ACListenerS27S0100000_7(this, 132));
                                                        _$_findCachedViewById(R.id.idr).setVisibility(0);
                                                        AI8 ai82 = (AI8) _$_findCachedViewById(R.id.idr);
                                                        Activity activity11 = this.LJLIL;
                                                        if (activity11 != null) {
                                                            ai82.setTitle(activity11.getResources().getString(R.string.iu));
                                                            ((AI8) _$_findCachedViewById(R.id.idr)).setWithSeparator(true);
                                                            TextView textView5 = (TextView) _$_findCachedViewById(R.id.ids);
                                                            Activity activity12 = this.LJLIL;
                                                            if (activity12 != null) {
                                                                textView5.setText(activity12.getResources().getString(R.string.iy));
                                                                AI9 accessory2 = ((AI8) _$_findCachedViewById(R.id.idr)).getAccessory();
                                                                o.LJII(accessory2, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Button");
                                                                AEM aem2 = (AEM) accessory2;
                                                                Activity activity13 = this.LJLIL;
                                                                if (activity13 != null) {
                                                                    aem2.LJIIL(activity13.getResources().getString(R.string.iz));
                                                                    aem2.LJIIJJI(new ACListenerS27S0100000_7(this, 133));
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
                    } else {
                        o.LJIJI("activty");
                        throw null;
                    }
                } else {
                    o.LJIJI("activty");
                    throw null;
                }
            } else if (num.intValue() == 13) {
                C33381Ss c33381Ss2 = new C33381Ss();
                c33381Ss2.LJLIL = R.drawable.be0;
                Activity activity14 = this.LJLIL;
                if (activity14 != null) {
                    ((ImageView) _$_findCachedViewById(R.id.idh)).setImageDrawable(c33381Ss2.LIZ(activity14));
                    TextView textView6 = (TextView) _$_findCachedViewById(R.id.idi);
                    Activity activity15 = this.LJLIL;
                    if (activity15 != null) {
                        textView6.setText(activity15.getResources().getString(R.string.sco));
                        Activity activity16 = this.LJLIL;
                        if (activity16 != null) {
                            String LIZIZ6 = C207798Dn.LIZIZ(activity16, R.string.scr, "activty.resources.getStr…e_description_3rdtest_v3)");
                            Activity activity17 = this.LJLIL;
                            if (activity17 != null) {
                                String LIZIZ7 = C207798Dn.LIZIZ(activity17, R.string.h2x, "activty.resources.getStr…hyperlink_placeholder_LM)");
                                Activity activity18 = this.LJLIL;
                                if (activity18 != null) {
                                    String LIZIZ8 = C207798Dn.LIZIZ(activity18, R.string.h2y, "activty.resources.getStr…hyperlink_placeholder_PP)");
                                    TextView textView7 = (TextView) _$_findCachedViewById(R.id.idg);
                                    Activity activity19 = this.LJLIL;
                                    if (activity19 != null) {
                                        List LJJIJIIJI2 = C47261Igj.LJJIJIIJI(LIZIZ7, LIZIZ8);
                                        String[] strArr2 = new String[2];
                                        if (popUpCopyWriting == null || (str3 = popUpCopyWriting.getLearnMoreLink()) == null) {
                                            str3 = "";
                                        }
                                        strArr2[0] = str3;
                                        if (popUpCopyWriting != null && (privacyPolicyLink2 = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                                            str6 = privacyPolicyLink2;
                                        }
                                        strArr2[1] = str6;
                                        textView7.setText(C41297GIr.LIZ(activity19, LIZIZ6, LJJIJIIJI2, C47261Igj.LJJIJIIJI(strArr2)));
                                        ((TextView) _$_findCachedViewById(R.id.idg)).setMovementMethod(LinkMovementMethod.getInstance());
                                        AI8 ai83 = (AI8) _$_findCachedViewById(R.id.ie6);
                                        Activity activity20 = this.LJLIL;
                                        if (activity20 != null) {
                                            ai83.setTitle(activity20.getResources().getString(R.string.jp));
                                            AI8 ai84 = (AI8) _$_findCachedViewById(R.id.ie6);
                                            Activity activity21 = this.LJLIL;
                                            if (activity21 != null) {
                                                ai84.setSubtitle(activity21.getResources().getString(R.string.jn));
                                                _$_findCachedViewById(R.id.ie6).setVisibility(0);
                                                AI8 ai85 = (AI8) _$_findCachedViewById(R.id.ie7);
                                                Activity activity22 = this.LJLIL;
                                                if (activity22 != null) {
                                                    ai85.setTitle(activity22.getResources().getString(R.string.ju));
                                                    AI8 ai86 = (AI8) _$_findCachedViewById(R.id.ie7);
                                                    Activity activity23 = this.LJLIL;
                                                    if (activity23 != null) {
                                                        ai86.setSubtitle(activity23.getResources().getString(R.string.jr));
                                                        _$_findCachedViewById(R.id.ie7).setVisibility(0);
                                                        _$_findCachedViewById(R.id.ie8).setVisibility(8);
                                                        TextView textView8 = (TextView) _$_findCachedViewById(R.id.idv);
                                                        Activity activity24 = this.LJLIL;
                                                        if (activity24 != null) {
                                                            textView8.setText(activity24.getResources().getString(R.string.dw1));
                                                            _$_findCachedViewById(R.id.idv).setVisibility(0);
                                                            TextView textView9 = (TextView) _$_findCachedViewById(R.id.id0);
                                                            Activity activity25 = this.LJLIL;
                                                            if (activity25 != null) {
                                                                textView9.setText(activity25.getResources().getString(R.string.ir));
                                                                _$_findCachedViewById(R.id.id0).setVisibility(0);
                                                                C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.id0), new ACListenerS27S0100000_7(this, 134));
                                                                TextView textView10 = (TextView) _$_findCachedViewById(R.id.idz);
                                                                Activity activity26 = this.LJLIL;
                                                                if (activity26 != null) {
                                                                    textView10.setText(activity26.getResources().getString(R.string.iw));
                                                                    _$_findCachedViewById(R.id.idz).setVisibility(0);
                                                                    C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.idz), new ACListenerS27S0100000_7(this, 136));
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
                    } else {
                        o.LJIJI("activty");
                        throw null;
                    }
                } else {
                    o.LJIJI("activty");
                    throw null;
                }
            } else {
                if (num.intValue() == 14 || num.intValue() == 15 || num.intValue() == 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || num.intValue() == 17) {
                    C33381Ss c33381Ss3 = new C33381Ss();
                    c33381Ss3.LJLIL = R.drawable.bej;
                    Activity activity27 = this.LJLIL;
                    if (activity27 != null) {
                        ((ImageView) _$_findCachedViewById(R.id.idh)).setImageDrawable(c33381Ss3.LIZ(activity27));
                        TextView textView11 = (TextView) _$_findCachedViewById(R.id.idi);
                        Activity activity28 = this.LJLIL;
                        if (activity28 != null) {
                            textView11.setText(activity28.getResources().getString(R.string.scp));
                            Activity activity29 = this.LJLIL;
                            if (activity29 != null) {
                                String LIZIZ9 = C207798Dn.LIZIZ(activity29, R.string.scs, "activty.resources.getStr…e_description_3rdtest_v4)");
                                Activity activity30 = this.LJLIL;
                                if (activity30 != null) {
                                    String LIZIZ10 = C207798Dn.LIZIZ(activity30, R.string.h2x, "activty.resources.getStr…hyperlink_placeholder_LM)");
                                    TextView textView12 = (TextView) _$_findCachedViewById(R.id.idg);
                                    Activity activity31 = this.LJLIL;
                                    if (activity31 != null) {
                                        List LJJIJ = C47261Igj.LJJIJ(LIZIZ10);
                                        if (popUpCopyWriting == null || (str = popUpCopyWriting.getLearnMoreLink()) == null) {
                                            str = "";
                                        }
                                        textView12.setText(C41297GIr.LIZ(activity31, LIZIZ9, LJJIJ, C47261Igj.LJJIJ(str)));
                                        ((TextView) _$_findCachedViewById(R.id.idg)).setMovementMethod(LinkMovementMethod.getInstance());
                                        AI8 ai87 = (AI8) _$_findCachedViewById(R.id.ie6);
                                        Activity activity32 = this.LJLIL;
                                        if (activity32 != null) {
                                            ai87.setTitle(activity32.getResources().getString(R.string.jq));
                                            AI8 ai88 = (AI8) _$_findCachedViewById(R.id.ie6);
                                            Activity activity33 = this.LJLIL;
                                            if (activity33 != null) {
                                                ai88.setSubtitle(activity33.getResources().getString(R.string.jn));
                                                C2068389v c2068389v = new C2068389v();
                                                c2068389v.LIZ = R.raw.icon_vertical_bars;
                                                c2068389v.LJ = Integer.valueOf(R.attr.go);
                                                ((AI8) _$_findCachedViewById(R.id.ie6)).setIcon(c2068389v);
                                                _$_findCachedViewById(R.id.ie6).setVisibility(0);
                                                AI8 ai89 = (AI8) _$_findCachedViewById(R.id.ie7);
                                                Activity activity34 = this.LJLIL;
                                                if (activity34 != null) {
                                                    ai89.setTitle(activity34.getResources().getString(R.string.jv));
                                                    AdPersonalitySettings LIZIZ11 = C41290GIk.LIZIZ();
                                                    if (LIZIZ11 == null || (popUpStyle2 = LIZIZ11.getPopUpStyle()) == null || popUpStyle2.intValue() != 17) {
                                                        Activity activity35 = this.LJLIL;
                                                        if (activity35 != null) {
                                                            String LIZIZ12 = C207798Dn.LIZIZ(activity35, R.string.js, "activty.resources.getStr…on_bullet_point2_text_v4)");
                                                            Activity activity36 = this.LJLIL;
                                                            if (activity36 != null) {
                                                                String LIZIZ13 = C207798Dn.LIZIZ(activity36, R.string.h2y, "activty.resources.getStr…hyperlink_placeholder_PP)");
                                                                AI8 ai810 = (AI8) _$_findCachedViewById(R.id.ie7);
                                                                Activity activity37 = this.LJLIL;
                                                                if (activity37 != null) {
                                                                    List LJJIJ2 = C47261Igj.LJJIJ(LIZIZ13);
                                                                    if (popUpCopyWriting == null || (str2 = popUpCopyWriting.getPrivacyPolicyLink()) == null) {
                                                                        str2 = "";
                                                                    }
                                                                    ai810.setSubtitle(C41297GIr.LIZ(activity37, LIZIZ12, LJJIJ2, C47261Igj.LJJIJ(str2)));
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
                                                        AI8 ai811 = (AI8) _$_findCachedViewById(R.id.ie7);
                                                        Activity activity38 = this.LJLIL;
                                                        if (activity38 != null) {
                                                            ai811.setSubtitle(activity38.getResources().getString(R.string.jt));
                                                        } else {
                                                            o.LJIJI("activty");
                                                            throw null;
                                                        }
                                                    }
                                                    C2068389v c2068389v2 = new C2068389v();
                                                    c2068389v2.LIZ = R.raw.icon_personalization_fill;
                                                    c2068389v2.LJ = Integer.valueOf(R.attr.go);
                                                    ((AI8) _$_findCachedViewById(R.id.ie7)).setIcon(c2068389v2);
                                                    _$_findCachedViewById(R.id.ie7).setVisibility(0);
                                                    C2068389v c2068389v3 = new C2068389v();
                                                    c2068389v3.LIZ = R.raw.icon_lock_large_fill;
                                                    c2068389v3.LJ = Integer.valueOf(R.attr.go);
                                                    ((AI8) _$_findCachedViewById(R.id.ie8)).setIcon(c2068389v3);
                                                    AdPersonalitySettings LIZIZ14 = C41290GIk.LIZIZ();
                                                    if (LIZIZ14 != null && (popUpStyle = LIZIZ14.getPopUpStyle()) != null) {
                                                        if (popUpStyle.intValue() == 14) {
                                                            _$_findCachedViewById(R.id.ie8).setVisibility(8);
                                                            TextView textView13 = (TextView) _$_findCachedViewById(R.id.idv);
                                                            Activity activity39 = this.LJLIL;
                                                            if (activity39 != null) {
                                                                textView13.setText(activity39.getResources().getString(R.string.dw1));
                                                                _$_findCachedViewById(R.id.idv).setVisibility(0);
                                                            } else {
                                                                o.LJIJI("activty");
                                                                throw null;
                                                            }
                                                        } else if (popUpStyle.intValue() == 15) {
                                                            AI8 ai812 = (AI8) _$_findCachedViewById(R.id.ie8);
                                                            Activity activity40 = this.LJLIL;
                                                            if (activity40 != null) {
                                                                ai812.setTitle(activity40.getResources().getString(R.string.jy));
                                                                _$_findCachedViewById(R.id.ie8).setVisibility(0);
                                                                TextView textView14 = (TextView) _$_findCachedViewById(R.id.idv);
                                                                Activity activity41 = this.LJLIL;
                                                                if (activity41 != null) {
                                                                    textView14.setText(activity41.getResources().getString(R.string.dw1));
                                                                    _$_findCachedViewById(R.id.idv).setVisibility(0);
                                                                } else {
                                                                    o.LJIJI("activty");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("activty");
                                                                throw null;
                                                            }
                                                        } else if (popUpStyle.intValue() == 16) {
                                                            AI8 ai813 = (AI8) _$_findCachedViewById(R.id.ie8);
                                                            Activity activity42 = this.LJLIL;
                                                            if (activity42 != null) {
                                                                ai813.setTitle(activity42.getResources().getString(R.string.jz));
                                                                AI8 ai814 = (AI8) _$_findCachedViewById(R.id.ie8);
                                                                Activity activity43 = this.LJLIL;
                                                                if (activity43 != null) {
                                                                    ai814.setSubtitle(activity43.getResources().getString(R.string.jw));
                                                                    _$_findCachedViewById(R.id.ie8).setVisibility(0);
                                                                    _$_findCachedViewById(R.id.idv).setVisibility(8);
                                                                } else {
                                                                    o.LJIJI("activty");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("activty");
                                                                throw null;
                                                            }
                                                        } else if (popUpStyle.intValue() == 17) {
                                                            AI8 ai815 = (AI8) _$_findCachedViewById(R.id.ie8);
                                                            Activity activity44 = this.LJLIL;
                                                            if (activity44 != null) {
                                                                ai815.setTitle(activity44.getResources().getString(R.string.k0));
                                                                Activity activity45 = this.LJLIL;
                                                                if (activity45 != null) {
                                                                    String LIZIZ15 = C207798Dn.LIZIZ(activity45, R.string.jx, "activty.resources.getStr…_bullet_point3_text_3_v4)");
                                                                    Activity activity46 = this.LJLIL;
                                                                    if (activity46 != null) {
                                                                        String LIZIZ16 = C207798Dn.LIZIZ(activity46, R.string.h2y, "activty.resources.getStr…hyperlink_placeholder_PP)");
                                                                        AI8 ai816 = (AI8) _$_findCachedViewById(R.id.ie8);
                                                                        Activity activity47 = this.LJLIL;
                                                                        if (activity47 != null) {
                                                                            List LJJIJ3 = C47261Igj.LJJIJ(LIZIZ16);
                                                                            if (popUpCopyWriting != null && (privacyPolicyLink = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                                                                                str6 = privacyPolicyLink;
                                                                            }
                                                                            ai816.setSubtitle(C41297GIr.LIZ(activity47, LIZIZ15, LJJIJ3, C47261Igj.LJJIJ(str6)));
                                                                            _$_findCachedViewById(R.id.ie8).setVisibility(0);
                                                                            TextView textView15 = (TextView) _$_findCachedViewById(R.id.idv);
                                                                            Activity activity48 = this.LJLIL;
                                                                            if (activity48 != null) {
                                                                                textView15.setText(activity48.getResources().getString(R.string.dw1));
                                                                                _$_findCachedViewById(R.id.idv).setVisibility(0);
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
                                                    TextView textView16 = (TextView) _$_findCachedViewById(R.id.id0);
                                                    Activity activity49 = this.LJLIL;
                                                    if (activity49 != null) {
                                                        textView16.setText(activity49.getResources().getString(R.string.is));
                                                        _$_findCachedViewById(R.id.id0).setVisibility(0);
                                                        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.id0), new ACListenerS27S0100000_7(this, 137));
                                                        TextView textView17 = (TextView) _$_findCachedViewById(R.id.idz);
                                                        Activity activity50 = this.LJLIL;
                                                        if (activity50 != null) {
                                                            textView17.setText(activity50.getResources().getString(R.string.ix));
                                                            _$_findCachedViewById(R.id.idz).setVisibility(0);
                                                            C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.idz), new ACListenerS27S0100000_7(this, 138));
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
        }
        this.LJLILLLLZI = System.currentTimeMillis();
        C188727au c188727au = new C188727au();
        if (C41290GIk.LJII() == 1) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str5 = "1";
        }
        c188727au.LJIIIZ("age_status", str5);
        FMX.LJIIL("display_equally_balanced_pa_prompt", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View LLLLIILL;
        Integer popUpStyle;
        o.LJIIIZ(inflater, "inflater");
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ == null || (popUpStyle = LIZIZ.getPopUpStyle()) == null || popUpStyle.intValue() != 8) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.agy, viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.agz, viewGroup, false);
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
