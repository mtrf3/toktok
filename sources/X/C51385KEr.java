package X;

import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.ecommerce.model.EcFeedSuggestWordList;
import com.ss.android.ugc.aweme.ecommerce.model.EcSuggestWordStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EcWordStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.KEr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51385KEr extends ConstraintLayout implements KFE {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final long LJLJJL;
    public final ECSearchEntranceData LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public View LJLJLLL;
    public LinearLayout LJLL;
    public LinearLayout LJLLI;
    public final String LJLLILLLL;
    public final String LJLLJ;
    public final String LJLLL;
    public final KF7 LJLLLL;

    @Override // X.InterfaceC70514Rlu
    public final void LLFFF(AqS178S0100000_12 aqS178S0100000_12) {
    }

    @Override // X.InterfaceC70514Rlu
    public final void W0() {
    }

    @Override // X.InterfaceC70514Rlu
    public final void Y0() {
    }

    public final void LJJLJLI() {
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//search");
        buildRoute.withParam("in_single_stack", true);
        buildRoute.withParam("keyword", this.LJLLJ);
        buildRoute.withParam("group_id", this.LJLIL.getAid());
        buildRoute.withParam("set_hint_by_sug_word", false);
        buildRoute.withParam("enter_from", this.LJLILLLLZI);
        KAK kak = KAK.SHOP;
        buildRoute.withParam("target_tab", kak.getTabName());
        buildRoute.withParam("enter_method", "comment_related_search");
        buildRoute.withParam("root_enter_from_type", EnumC51280KAq.COMMENT_TOP_ANCHOR.getValue());
        buildRoute.withParam("single_tab_type", kak.getTabName());
        buildRoute.withParam("back_flag", 1);
        buildRoute.withParam("search_hint_word", this.LJLLJ);
        buildRoute.withParam("traffic_source_list", M2T.LJIIIIZZ(this.LJLIL));
        ECSearchEntranceData eCSearchEntranceData = this.LJLJJLL;
        if (eCSearchEntranceData != null) {
            buildRoute.withParam("ec_entrance_data", eCSearchEntranceData);
        }
        buildRoute.open();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        String str2;
        super.onAttachedToWindow();
        C51393KEz c51393KEz = KFE.LJLIIL;
        String str3 = this.LJLILLLLZI;
        String str4 = this.LJLLJ;
        String str5 = this.LJLLL;
        LogPbBean logPbBean = this.LJLIL.getLogPbBean();
        if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
            str = "";
        }
        String groupId = this.LJLIL.getGroupId();
        KF7 kf7 = this.LJLLLL;
        if (kf7 == null || KF8.LIZ[kf7.ordinal()] != 1) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        o.LJIIIIZZ(groupId, "groupId");
        c51393KEz.getClass();
        C51393KEz.LIZIZ("comment_related_search", str4, str3, str5, str, groupId, str2);
    }

    @Override // X.InterfaceC70514Rlu
    public final void LLZZZZ(KF0 hintWordModel) {
        o.LJIIIZ(hintWordModel, "hintWordModel");
    }

    @Override // X.InterfaceC70514Rlu
    public final boolean LLLFF(KF2 kf2, InterfaceC88472Yns<? super Boolean, C76800UCe> callbackInUIThread) {
        o.LJIIIZ(callbackInUIThread, "callbackInUIThread");
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51385KEr(Context context, Aweme aweme, String str, String str2, boolean z, long j, ECSearchEntranceData eCSearchEntranceData) {
        super(context);
        List<EcSuggestWordStruct> suggestWords;
        EcWordStruct ecWordStruct;
        String wordId;
        EcWordStruct ecWordStruct2;
        String word;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        new LinkedHashMap();
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = j;
        this.LJLJJLL = eCSearchEntranceData;
        this.LJLLILLLL = "";
        this.LJLLJ = "";
        this.LJLLL = "";
        EcFeedSuggestWordList ecFeedSuggestWordList = aweme.getEcFeedSuggestWordList();
        if (ecFeedSuggestWordList != null && (suggestWords = ecFeedSuggestWordList.getSuggestWords()) != null) {
            for (EcSuggestWordStruct ecSuggestWordStruct : suggestWords) {
                if (ecSuggestWordStruct != null && o.LJ("comment_top", ecSuggestWordStruct.getScene())) {
                    List<EcWordStruct> words = ecSuggestWordStruct.getWords();
                    this.LJLLJ = (words == null || (ecWordStruct2 = (EcWordStruct) ORZ.LJLLLL(words)) == null || (word = ecWordStruct2.getWord()) == null) ? "" : word;
                    List<EcWordStruct> words2 = ecSuggestWordStruct.getWords();
                    this.LJLLL = (words2 == null || (ecWordStruct = (EcWordStruct) ORZ.LJLLLL(words2)) == null || (wordId = ecWordStruct.getWordId()) == null) ? "" : wordId;
                    String hintText = ecSuggestWordStruct.getHintText();
                    this.LJLLILLLL = hintText == null ? "" : hintText;
                    Integer redirectPage = ecSuggestWordStruct.getRedirectPage();
                    if (redirectPage != null) {
                        int intValue = redirectPage.intValue();
                        KF7.Companion.getClass();
                        KF7 kf7 = KF7.MAP.get(Integer.valueOf(intValue));
                        if (kf7 != null) {
                            this.LJLLLL = kf7;
                        }
                    }
                }
            }
        }
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.aom, this, true);
        View findViewById = findViewById(R.id.e35);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.head)");
        this.LJLJL = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.fed);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.keyword)");
        this.LJLJLJ = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.frt);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.line)");
        this.LJLJLLL = findViewById3;
        View findViewById4 = findViewById(R.id.fg4);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.layout)");
        this.LJLL = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(R.id.cec);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.doc_layout)");
        this.LJLLI = (LinearLayout) findViewById5;
        SearchSecurityControlConfig.LIZ.getClass();
        if (SearchSecurityControlConfig.LIZ().disableSuggestWords) {
            LinearLayout linearLayout = this.LJLL;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            } else {
                o.LJIJI("layout");
                throw null;
            }
        }
        TuxTextView tuxTextView = this.LJLJL;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = this.LJLJLJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
                TuxTextView tuxTextView3 = this.LJLJL;
                if (tuxTextView3 != null) {
                    if (tuxTextView3.getVisibility() == 0) {
                        TuxTextView tuxTextView4 = this.LJLJLJ;
                        if (tuxTextView4 != null) {
                            if (tuxTextView4.getVisibility() == 0) {
                                TuxTextView tuxTextView5 = this.LJLJL;
                                if (tuxTextView5 != null) {
                                    C116724i4 c116724i4 = new C116724i4();
                                    c116724i4.LIZLLL(this.LJLLILLLL);
                                    tuxTextView5.setText(new T5R(c116724i4.LIZ));
                                    TuxTextView tuxTextView6 = this.LJLJLJ;
                                    if (tuxTextView6 != null) {
                                        C116724i4 c116724i42 = new C116724i4();
                                        c116724i42.LIZLLL(this.LJLLJ);
                                        tuxTextView6.setText(new T5R(c116724i42.LIZ));
                                    } else {
                                        o.LJIJI("keyWordTv");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("headTv");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("keyWordTv");
                            throw null;
                        }
                    }
                    ACListenerS28S0100000_8 aCListenerS28S0100000_8 = new ACListenerS28S0100000_8(this, 5);
                    TuxTextView tuxTextView7 = this.LJLJLJ;
                    if (tuxTextView7 != null) {
                        C78897Uxp.LJJJJLI(tuxTextView7, null);
                        TuxTextView tuxTextView8 = this.LJLJLJ;
                        if (tuxTextView8 != null) {
                            C16880lQ.LJJJJI(tuxTextView8, aCListenerS28S0100000_8);
                            if (!this.LJLJJI) {
                                return;
                            }
                            LinearLayout linearLayout2 = this.LJLLI;
                            if (linearLayout2 != null) {
                                C26338AVi.LJI(linearLayout2, null, KNV.LIZIZ(4.5d), null, KNV.LIZIZ(4.5d), false, 21);
                                View view = this.LJLJLLL;
                                if (view != null) {
                                    view.setVisibility(8);
                                    return;
                                } else {
                                    o.LJIJI("line");
                                    throw null;
                                }
                            }
                            o.LJIJI("docLayout");
                            throw null;
                        }
                        o.LJIJI("keyWordTv");
                        throw null;
                    }
                    o.LJIJI("keyWordTv");
                    throw null;
                }
                o.LJIJI("headTv");
                throw null;
            }
            o.LJIJI("keyWordTv");
            throw null;
        }
        o.LJIJI("headTv");
        throw null;
    }
}
