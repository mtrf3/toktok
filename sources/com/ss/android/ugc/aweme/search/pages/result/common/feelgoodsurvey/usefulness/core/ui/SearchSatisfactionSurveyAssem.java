package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.usefulness.core.ui;

import X.AbstractC50059Jkl;
import X.C04270Et;
import X.C07820Sk;
import X.C07840Sm;
import X.C12460eI;
import X.C207728Dg;
import X.C221108m2;
import X.C32151Nz;
import X.C44384HbQ;
import X.C50322Jp0;
import X.C50352JpU;
import X.C50562Jss;
import X.C50567Jsx;
import X.C50573Jt3;
import X.C50676Jui;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C79045V0n;
import X.C8XO;
import X.ORZ;
import X.V1B;
import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodOptionData;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyQuestionnaire;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSatisfactionSurveyAssem extends ReusedUISlotAssem<SearchSatisfactionSurveyAssem> implements C8XO<C50352JpU> {
    public TuxTextView LLFF;
    public C207728Dg LLFFF;
    public TuxTextView LLFII;
    public TuxTextView LLFZ;
    public TuxIconView LLI;
    public RelativeLayout LLIFFJFJJ;
    public View LLII;
    public C50352JpU LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C50567Jsx LLIIIJ;
    public final ACListenerS28S0100000_8 LLIIIL;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ch7;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchSatisfactionSurveyAssem() {
        new LinkedHashMap();
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 232));
        this.LLIIIJ = new C50567Jsx(this);
        this.LLIIIL = new ACListenerS28S0100000_8(this, 31);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C50352JpU c50352JpU) {
        int i;
        String str;
        FeelgoodSurveyModel feelgoodSurveyModel;
        FeelgoodSurveyQuestionnaire questionnaire;
        FeelgoodOptionData feelgoodOptionData;
        int intValue;
        boolean z;
        Drawable drawable;
        FeelgoodSurveyQuestionnaire questionnaire2;
        C50352JpU item = c50352JpU;
        o.LJIIIZ(item, "item");
        this.LLIIII = item;
        View view = this.LLII;
        if (view != null) {
            C12460eI.LJ(view, new AqS174S0100000_8(this, LiveCoverMinSizeSetting.DEFAULT));
        }
        FeelgoodSurveyModel feelgoodSurveyModel2 = item.LJLIL;
        if (feelgoodSurveyModel2 != null && (questionnaire2 = feelgoodSurveyModel2.getQuestionnaire()) != null) {
            String LJJZZIII = C44384HbQ.LJJZZIII(questionnaire2);
            TuxTextView tuxTextView = this.LLFF;
            if (tuxTextView != null) {
                tuxTextView.setText(LJJZZIII);
            }
        }
        Context context = getContext();
        Aweme aweme = null;
        if (context != null) {
            Integer LJI = C79045V0n.LJI(R.attr.cf, context);
            Drawable LIZIZ = C04270Et.LIZIZ(context, R.drawable.lb);
            if (LJI != null && LIZIZ != null) {
                drawable = C07840Sm.LJFF(LIZIZ);
                C07820Sk.LJI(drawable, LJI.intValue());
            } else {
                drawable = null;
            }
            TuxIconView tuxIconView = this.LLI;
            if (tuxIconView != null) {
                tuxIconView.setImageDrawable(drawable);
            }
        }
        Integer num = (Integer) this.LLIIIILZ.getValue();
        if (num != null && (intValue = num.intValue()) > 0) {
            C50352JpU c50352JpU2 = this.LLIIII;
            if (c50352JpU2 != null && c50352JpU2.LJLJJI) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                RelativeLayout relativeLayout = this.LLIFFJFJJ;
                if (relativeLayout != null) {
                    V1B.LJLLL((int) ((intValue / 4) - (C32151Nz.LJIIZILJ(Double.valueOf(36.0d)) / 2)), relativeLayout);
                }
            } else {
                RelativeLayout relativeLayout2 = this.LLIFFJFJJ;
                if (relativeLayout2 != null) {
                    V1B.LJLLL((int) (((intValue / 4) * 3) - (C32151Nz.LJIIZILJ(Double.valueOf(36.0d)) / 2)), relativeLayout2);
                }
            }
        }
        C207728Dg c207728Dg = this.LLFFF;
        if (c207728Dg != null) {
            C50352JpU c50352JpU3 = this.LLIIII;
            if (c50352JpU3 != null) {
                i = c50352JpU3.LJLJL;
            } else {
                i = item.LJLJL;
            }
            c207728Dg.setValue(i);
        }
        if (item.LJLJL > 0) {
            TuxTextView tuxTextView2 = this.LLFII;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
            TuxTextView tuxTextView3 = this.LLFZ;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(0);
            }
            C207728Dg c207728Dg2 = this.LLFFF;
            if (c207728Dg2 != null) {
                V1B.LJLJJLL((int) C32151Nz.LJIIZILJ(Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)), c207728Dg2);
            }
            TuxTextView tuxTextView4 = this.LLFII;
            if (tuxTextView4 != null) {
                C50352JpU c50352JpU4 = this.LLIIII;
                if (c50352JpU4 != null && (feelgoodSurveyModel = c50352JpU4.LJLIL) != null && (questionnaire = feelgoodSurveyModel.getQuestionnaire()) != null) {
                    int i2 = item.LJLJL - 1;
                    List LJJLIL = C44384HbQ.LJJLIL(questionnaire);
                    if (LJJLIL != null && (feelgoodOptionData = (FeelgoodOptionData) ORZ.LJLLLLLL(i2, LJJLIL)) != null) {
                        str = feelgoodOptionData.getText();
                        tuxTextView4.setText(str);
                    }
                }
                str = null;
                tuxTextView4.setText(str);
            }
        } else {
            TuxTextView tuxTextView5 = this.LLFII;
            if (tuxTextView5 != null) {
                tuxTextView5.setVisibility(8);
            }
            TuxTextView tuxTextView6 = this.LLFZ;
            if (tuxTextView6 != null) {
                tuxTextView6.setVisibility(8);
            }
            C207728Dg c207728Dg3 = this.LLFFF;
            if (c207728Dg3 != null) {
                V1B.LJLJJLL((int) C32151Nz.LJIIZILJ(Double.valueOf(10.0d)), c207728Dg3);
            }
        }
        C207728Dg c207728Dg4 = this.LLFFF;
        if (c207728Dg4 != null) {
            c207728Dg4.setOnValueChangeListener(this.LLIIIJ);
        }
        C50352JpU c50352JpU5 = this.LLIIII;
        if (c50352JpU5 != null) {
            aweme = c50352JpU5.LJLJI;
        }
        C50562Jss.LIZIZ(aweme, "@show");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C50352JpU c50352JpU) {
        return true;
    }

    public final void m4(C50573Jt3 c50573Jt3) {
        C50322Jp0 c50322Jp0;
        String str;
        int i;
        String str2;
        int i2;
        String str3;
        FeelgoodSurveyQuestionnaire questionnaire;
        AbstractC50059Jkl<C50322Jp0> If;
        String str4 = null;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchContextAbility.class, null);
        if (iSearchContextAbility != null && (If = iSearchContextAbility.If()) != null) {
            c50322Jp0 = If.LIZJ();
        } else {
            c50322Jp0 = null;
        }
        C50352JpU c50352JpU = this.LLIIII;
        if (c50352JpU != null) {
            if (c50352JpU.LJLJJI) {
                i2 = c50352JpU.LJLJJL + 2;
            } else {
                i2 = c50352JpU.LJLJJL + 1;
            }
            FeelgoodSurveyModel feelgoodSurveyModel = c50352JpU.LJLIL;
            if (feelgoodSurveyModel != null && (questionnaire = feelgoodSurveyModel.getQuestionnaire()) != null) {
                str3 = questionnaire.getSurveyID();
            } else {
                str3 = null;
            }
            c50573Jt3.LJIIZILJ("feedback_id", str3);
            c50573Jt3.LJJI(Integer.valueOf(i2));
        }
        if (c50322Jp0 != null) {
            str = c50322Jp0.LJLJI;
        } else {
            str = null;
        }
        c50573Jt3.LJIIZILJ("search_id", str);
        if (c50322Jp0 != null) {
            i = c50322Jp0.LJLIL;
        } else {
            i = 0;
        }
        c50573Jt3.LJIIZILJ("search_type", C50676Jui.LIZ(i));
        if (c50322Jp0 != null) {
            str2 = c50322Jp0.LJLJJI;
        } else {
            str2 = null;
        }
        c50573Jt3.LJIIZILJ("search_keyword", str2);
        if (c50322Jp0 != null) {
            if (c50322Jp0.LJLIL == 0) {
                str4 = "general_search";
            } else {
                str4 = "search_result";
            }
        }
        c50573Jt3.LJIJI(str4);
        c50573Jt3.LIZLLL("card_position", "search_result_page");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = (TuxTextView) view.findViewById(R.id.mm6);
        this.LLFFF = (C207728Dg) view.findViewById(R.id.int);
        this.LLFII = (TuxTextView) view.findViewById(R.id.m2_);
        this.LLFZ = (TuxTextView) view.findViewById(R.id.azl);
        view.findViewById(R.id.a87);
        this.LLI = (TuxIconView) view.findViewById(R.id.a86);
        this.LLIFFJFJJ = (RelativeLayout) view.findViewById(R.id.a85);
        this.LLII = view.findViewById(R.id.kvc);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C50352JpU c50352JpU) {
    }
}
