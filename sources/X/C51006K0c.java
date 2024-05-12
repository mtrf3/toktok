package X;

import Y.ACListenerS43S0200000_8;
import Y.ARunnableS44S0100000_8;
import Y.IDTListenerS90S0200000_8;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.BidiFormatter;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionUiAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionVM;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS13S0010000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS171S0200000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.K0c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51006K0c extends ConstraintLayout {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxIconView LJLJLJ;
    public TuxTextView LJLJLLL;
    public View LJLL;
    public LinearLayout LJLLI;
    public TuxIconView LJLLILLLL;
    public LinearLayout LJLLJ;
    public final String LJLLL;
    public final String LJLLLL;
    public final String LJLLLLLL;

    public final Bundle getSearchParams() {
        Bundle LIZ = C0H1.LIZ("in_single_stack", "true");
        LIZ.putString("keyword", this.LJLLLL);
        LIZ.putString("group_id", this.LJLIL.getAid());
        LIZ.putString("is_from_comment", "1");
        LIZ.putString("search_position", this.LJLILLLLZI);
        LIZ.putString("tab_name", this.LJLJI);
        LIZ.putString("set_hint_by_sug_word", "true");
        LIZ.putString("enter_from", this.LJLILLLLZI);
        LIZ.putString("enter_method", "comment_related_search");
        LIZ.putString("is_feed_liked", String.valueOf(this.LJLIL.isLike()));
        LIZ.putString("is_feed_collected", String.valueOf(this.LJLIL.isCollected()));
        LIZ.putString("is_feed_comment_clicked", String.valueOf(this.LJLIL.isCommentClicked()));
        LIZ.putString("is_feed_forward_clicked", String.valueOf(this.LJLIL.isForwardClicked()));
        if (Z9N.LIZIZ.LJJIJLIJ(this.LJLILLLLZI) || o.LJ("others_homepage", this.LJLILLLLZI)) {
            LIZ.putString("is_from_video_fix", "1");
        }
        if (this.LJLJJL) {
            LIZ.putString("is_from_photo", "1");
        }
        return LIZ;
    }

    public final void LJJLJLI() {
        Context context = getContext();
        if (context instanceof ActivityC45651qj) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) context;
            C65776Prg LIZ = C65352Pkq.LIZ(SearchRelatedSuggestionVM.class);
            boolean z = false;
            C214298b3 c214298b3 = new C214298b3(LIZ, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 595), C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C78926UyI.LJJIIJZLJL(activityC45651qj, false), C184077Kh.LJLIL, C51007K0d.INSTANCE, (InterfaceC65784Pro) null, 384);
            if (!this.LJLJJL) {
                SearchRelatedSuggestionVM searchRelatedSuggestionVM = (SearchRelatedSuggestionVM) c214298b3.getValue();
                SearchRelatedSuggestionUiAssem.LJLILLLLZI = new WeakReference<>(this);
                C86457XwT.LIZLLL(searchRelatedSuggestionVM.getState().LJLIL, searchRelatedSuggestionVM);
                C86457XwT.LIZJ(searchRelatedSuggestionVM.getState().LJLILLLLZI);
            }
            C8VV.LIZIZ(activityC45651qj, new AqS139S0200000_8(context, this, 36));
            SearchRelatedSuggestionVM searchRelatedSuggestionVM2 = (SearchRelatedSuggestionVM) c214298b3.getValue();
            Aweme aweme = this.LJLIL;
            String keyword = this.LJLLLL;
            String keywordId = this.LJLLLLLL;
            boolean z2 = this.LJLJJL;
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(keyword, "keyword");
            o.LJIIIZ(keywordId, "keywordId");
            searchRelatedSuggestionVM2.LJLJI = aweme;
            searchRelatedSuggestionVM2.LJLIL = keyword;
            searchRelatedSuggestionVM2.LJLILLLLZI = keywordId;
            searchRelatedSuggestionVM2.LJLJJI = z2;
            C51016K0m c51016K0m = (C51016K0m) searchRelatedSuggestionVM2.LJLJJLL.getValue().getOperator();
            c51016K0m.getClass();
            if (c51016K0m.LJLIL.isLogin() && C51019K0p.LIZ()) {
                String curUserId = c51016K0m.LJLIL.getCurUserId();
                o.LJIIIIZZ(curUserId, "userService.curUserId");
                if (!TextUtils.isEmpty(aweme.getAid()) && !TextUtils.isEmpty(curUserId)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(curUserId);
                    LIZ2.append(aweme.getAid());
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("check blacklist ");
                    LIZ3.append(aweme.getAid());
                    LIZ3.append(" , ");
                    LIZ3.append(curUserId);
                    C49133JQb.LIZ(X1D.LIZIZ(LIZ3), new Object[0]);
                    z = C51010K0g.LIZ.getBoolean(LIZIZ, false);
                }
            }
            if (C51019K0p.LIZ() && searchRelatedSuggestionVM2.LJLJJL.isLogin()) {
                searchRelatedSuggestionVM2.setState(new AqS13S0010000_8(z, 5));
            } else {
                searchRelatedSuggestionVM2.setState(new AqS13S0010000_8(z, 6));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.LJLJJL) {
            LJJLL(this.LJLIL, this.LJLILLLLZI);
        }
    }

    public final void LJJLL(Aweme aweme, String str) {
        String str2;
        C50648JuG c50648JuG = new C50648JuG();
        c50648JuG.LJIIZILJ("search_position", str);
        c50648JuG.LJJIIJ(this.LJLJI);
        c50648JuG.LJIIZILJ("words_source", "comment_related_search");
        c50648JuG.LJIIZILJ("words_content", this.LJLLLL);
        c50648JuG.LJIIZILJ("group_id", this.LJLLLLLL);
        String groupId = aweme.getGroupId();
        if (groupId != null) {
            groupId.toString();
            c50648JuG.LIZLLL("enter_group_id", groupId);
        }
        LogPbBean logPbBean = aweme.getLogPbBean();
        if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
            str2 = ((C50322Jp0) KNV.LIZ()).LJLJI;
        }
        c50648JuG.LJIIZILJ("impr_id", str2);
        c50648JuG.LJIIZILJ("is_ecom_search", CardStruct.IStatusCode.DEFAULT);
        if (this.LJLJJL) {
            c50648JuG.LJIIZILJ("is_from_photo", "1");
            DetailFeedSearchHelper.LJLIL.getClass();
            c50648JuG.LJIIZILJ("is_from_video", DetailFeedSearchHelper.LIZLLL(str));
        }
        c50648JuG.LJIILIIL();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i == 0) {
            LJJLJLI();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51006K0c(Context context, Aweme aweme, String str, String str2, boolean z, boolean z2) {
        super(context);
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        List<SuggestWordStruct> suggestWords;
        String str3;
        WordStruct wordStruct;
        String wordId;
        WordStruct wordStruct2;
        String word;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        new LinkedHashMap();
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLLL = "";
        this.LJLLLL = "";
        this.LJLLLLLL = "";
        new C2068389v();
        C79043V0l.LIZIZ(context, 8.0f);
        C79043V0l.LIZIZ(context, 8.0f);
        Integer.valueOf(R.attr.go);
        CommentSuggestWordList commentSuggestWordList = aweme.getCommentSuggestWordList();
        if (commentSuggestWordList != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
            for (SuggestWordStruct suggestWordStruct : suggestWords) {
                if (suggestWordStruct != null) {
                    str3 = suggestWordStruct.getScene();
                } else {
                    str3 = null;
                }
                if (o.LJ("comment_top", str3)) {
                    List<WordStruct> words = suggestWordStruct.getWords();
                    this.LJLLLL = (words == null || (wordStruct2 = (WordStruct) ORZ.LJLLLL(words)) == null || (word = wordStruct2.getWord()) == null) ? "" : word;
                    List<WordStruct> words2 = suggestWordStruct.getWords();
                    this.LJLLLLLL = (words2 == null || (wordStruct = (WordStruct) ORZ.LJLLLL(words2)) == null || (wordId = wordStruct.getWordId()) == null) ? "" : wordId;
                    this.LJLLL = suggestWordStruct.getHintText();
                }
            }
        }
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.w9, this, true);
        View findViewById = findViewById(R.id.e35);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.head)");
        this.LJLJJLL = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.fed);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.keyword)");
        this.LJLJL = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.e_a);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.ic_search_relative)");
        this.LJLJLJ = (TuxIconView) findViewById3;
        View findViewById4 = findViewById(R.id.ceb);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.doc)");
        this.LJLJLLL = (TuxTextView) findViewById4;
        View findViewById5 = findViewById(R.id.frt);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.line)");
        this.LJLL = findViewById5;
        View findViewById6 = findViewById(R.id.fg4);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.layout)");
        this.LJLLI = (LinearLayout) findViewById6;
        View findViewById7 = findViewById(R.id.e__);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.ic_search)");
        this.LJLLILLLL = (TuxIconView) findViewById7;
        View findViewById8 = findViewById(R.id.cec);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.doc_layout)");
        this.LJLLJ = (LinearLayout) findViewById8;
        LJJLJLI();
        SearchSecurityControlConfig.LIZ.getClass();
        if (SearchSecurityControlConfig.LIZ().disableSuggestWords) {
            LinearLayout linearLayout = this.LJLLI;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                o.LJIJI("layout");
                throw null;
            }
        } else {
            TuxTextView tuxTextView = this.LJLJLLL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
                TuxTextView tuxTextView2 = this.LJLJJLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(0);
                    TuxTextView tuxTextView3 = this.LJLJL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(0);
                        TuxTextView tuxTextView4 = this.LJLJJLL;
                        if (tuxTextView4 != null) {
                            if (tuxTextView4.getVisibility() == 0) {
                                TuxTextView tuxTextView5 = this.LJLJL;
                                if (tuxTextView5 != null) {
                                    if (tuxTextView5.getVisibility() == 0) {
                                        TuxTextView tuxTextView6 = this.LJLJJLL;
                                        if (tuxTextView6 != null) {
                                            C116724i4 c116724i4 = new C116724i4();
                                            c116724i4.LIZLLL(this.LJLLL);
                                            T5R t5r = new T5R(c116724i4.LIZ);
                                            t5r.LIZ(42);
                                            Context context2 = getContext();
                                            o.LJIIIIZZ(context2, "context");
                                            Integer LJI = C79045V0n.LJI(R.attr.gv, context2);
                                            if (LJI != null) {
                                                i = LJI.intValue();
                                            } else {
                                                i = 0;
                                            }
                                            t5r.setSpan(new ForegroundColorSpan(i), 0, t5r.length(), 33);
                                            tuxTextView6.setText(t5r);
                                            TuxTextView tuxTextView7 = this.LJLJL;
                                            if (tuxTextView7 != null) {
                                                C116724i4 c116724i42 = new C116724i4();
                                                c116724i42.LIZLLL(this.LJLLLL);
                                                tuxTextView7.setText(new T5R(c116724i42.LIZ));
                                                TuxIconView tuxIconView = this.LJLLILLLL;
                                                if (tuxIconView != null) {
                                                    C2068389v c2068389v = new C2068389v();
                                                    Context context3 = getContext();
                                                    o.LJIIIIZZ(context3, "context");
                                                    c2068389v.LIZJ = (int) C79043V0l.LIZIZ(context3, 8.0f);
                                                    Context context4 = getContext();
                                                    o.LJIIIIZZ(context4, "context");
                                                    c2068389v.LIZIZ = (int) C79043V0l.LIZIZ(context4, 8.0f);
                                                    c2068389v.LIZ = R.raw.icon_magnifying_glass_fill;
                                                    tuxIconView.setTuxIcon(c2068389v);
                                                    TuxIconView tuxIconView2 = this.LJLJLJ;
                                                    if (tuxIconView2 != null) {
                                                        C2068389v c2068389v2 = new C2068389v();
                                                        Context context5 = getContext();
                                                        o.LJIIIIZZ(context5, "context");
                                                        c2068389v2.LIZJ = (int) C79043V0l.LIZIZ(context5, 8.0f);
                                                        Context context6 = getContext();
                                                        o.LJIIIIZZ(context6, "context");
                                                        c2068389v2.LIZIZ = (int) C79043V0l.LIZIZ(context6, 8.0f);
                                                        c2068389v2.LIZ = R.raw.icon_magnifying_glass_fill;
                                                        tuxIconView2.setTuxIcon(c2068389v2);
                                                        Context context7 = getContext();
                                                        o.LJIIIIZZ(context7, "context");
                                                        Integer LJI2 = C79045V0n.LJI(R.attr.bx, context7);
                                                        if (LJI2 != null) {
                                                            int intValue = LJI2.intValue();
                                                            TuxTextView tuxTextView8 = this.LJLJL;
                                                            if (tuxTextView8 != null) {
                                                                tuxTextView8.setTextColor(intValue);
                                                                TuxIconView tuxIconView3 = this.LJLLILLLL;
                                                                if (tuxIconView3 != null) {
                                                                    tuxIconView3.setTintColor(intValue);
                                                                    TuxIconView tuxIconView4 = this.LJLJLJ;
                                                                    if (tuxIconView4 != null) {
                                                                        tuxIconView4.setTintColor(intValue);
                                                                    } else {
                                                                        o.LJIJI("icSearchRelative");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("icSearch");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("keyWordTv");
                                                                throw null;
                                                            }
                                                        }
                                                        int intValue2 = ((Number) C51021K0r.LIZ.getValue()).intValue();
                                                        if (intValue2 != 0) {
                                                            if (intValue2 == 1) {
                                                                TuxTextView tuxTextView9 = this.LJLJL;
                                                                if (tuxTextView9 != null) {
                                                                    tuxTextView9.setTuxFont(101);
                                                                } else {
                                                                    o.LJIJI("keyWordTv");
                                                                    throw null;
                                                                }
                                                            }
                                                        } else {
                                                            TuxTextView tuxTextView10 = this.LJLJL;
                                                            if (tuxTextView10 != null) {
                                                                tuxTextView10.setTuxFont(102);
                                                                TuxIconView tuxIconView5 = this.LJLLILLLL;
                                                                if (tuxIconView5 != null) {
                                                                    Context context8 = getContext();
                                                                    o.LJIIIIZZ(context8, "context");
                                                                    tuxIconView5.setIconHeight((int) C79043V0l.LIZIZ(context8, 10.0f));
                                                                    TuxIconView tuxIconView6 = this.LJLLILLLL;
                                                                    if (tuxIconView6 != null) {
                                                                        Context context9 = getContext();
                                                                        o.LJIIIIZZ(context9, "context");
                                                                        tuxIconView6.setIconWidth((int) C79043V0l.LIZIZ(context9, 10.0f));
                                                                        TuxIconView tuxIconView7 = this.LJLJLJ;
                                                                        if (tuxIconView7 != null) {
                                                                            Context context10 = getContext();
                                                                            o.LJIIIIZZ(context10, "context");
                                                                            tuxIconView7.setIconHeight((int) C79043V0l.LIZIZ(context10, 10.0f));
                                                                            TuxIconView tuxIconView8 = this.LJLJLJ;
                                                                            if (tuxIconView8 != null) {
                                                                                Context context11 = getContext();
                                                                                o.LJIIIIZZ(context11, "context");
                                                                                tuxIconView8.setIconWidth((int) C79043V0l.LIZIZ(context11, 10.0f));
                                                                            } else {
                                                                                o.LJIJI("icSearchRelative");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("icSearchRelative");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("icSearch");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("icSearch");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("keyWordTv");
                                                                throw null;
                                                            }
                                                        }
                                                        TuxTextView tuxTextView11 = this.LJLJL;
                                                        if (tuxTextView11 != null) {
                                                            tuxTextView11.setTuxFont(42);
                                                            if (C90193gN.LIZ()) {
                                                                TuxIconView tuxIconView9 = this.LJLLILLLL;
                                                                if (tuxIconView9 != null) {
                                                                    ViewGroup.LayoutParams layoutParams = tuxIconView9.getLayoutParams();
                                                                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                                                        marginLayoutParams4.rightMargin = 0;
                                                                    }
                                                                    tuxIconView9.requestLayout();
                                                                    if (!BidiFormatter.getInstance().isRtl(this.LJLLLL)) {
                                                                        TuxIconView tuxIconView10 = this.LJLLILLLL;
                                                                        if (tuxIconView10 != null) {
                                                                            tuxIconView10.setVisibility(8);
                                                                            TuxIconView tuxIconView11 = this.LJLJLJ;
                                                                            if (tuxIconView11 != null) {
                                                                                tuxIconView11.setVisibility(0);
                                                                                TuxTextView tuxTextView12 = this.LJLJL;
                                                                                if (tuxTextView12 != null) {
                                                                                    C26338AVi.LJI(tuxTextView12, 0, 0, 0, 0, false, 16);
                                                                                    TuxIconView tuxIconView12 = this.LJLJLJ;
                                                                                    if (tuxIconView12 != null) {
                                                                                        Context context12 = getContext();
                                                                                        o.LJIIIIZZ(context12, "context");
                                                                                        int LIZIZ = (int) C79043V0l.LIZIZ(context12, 4.0f);
                                                                                        ViewGroup.LayoutParams layoutParams2 = tuxIconView12.getLayoutParams();
                                                                                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                                                                            marginLayoutParams3.rightMargin = LIZIZ;
                                                                                        }
                                                                                        tuxIconView12.requestLayout();
                                                                                    } else {
                                                                                        o.LJIJI("icSearchRelative");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    o.LJIJI("keyWordTv");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("icSearchRelative");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("icSearch");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        TuxIconView tuxIconView13 = this.LJLJLJ;
                                                                        if (tuxIconView13 != null) {
                                                                            tuxIconView13.setVisibility(8);
                                                                        } else {
                                                                            o.LJIJI("icSearchRelative");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                } else {
                                                                    o.LJIJI("icSearch");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                TuxIconView tuxIconView14 = this.LJLLILLLL;
                                                                if (tuxIconView14 != null) {
                                                                    ViewGroup.LayoutParams layoutParams3 = tuxIconView14.getLayoutParams();
                                                                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                                                                        marginLayoutParams2.leftMargin = 0;
                                                                    }
                                                                    tuxIconView14.requestLayout();
                                                                    if (BidiFormatter.getInstance().isRtl(this.LJLLLL)) {
                                                                        TuxIconView tuxIconView15 = this.LJLLILLLL;
                                                                        if (tuxIconView15 != null) {
                                                                            tuxIconView15.setVisibility(8);
                                                                            TuxIconView tuxIconView16 = this.LJLJLJ;
                                                                            if (tuxIconView16 != null) {
                                                                                tuxIconView16.setVisibility(0);
                                                                                TuxTextView tuxTextView13 = this.LJLJL;
                                                                                if (tuxTextView13 != null) {
                                                                                    C26338AVi.LJI(tuxTextView13, 0, 0, 0, 0, false, 16);
                                                                                    TuxIconView tuxIconView17 = this.LJLJLJ;
                                                                                    if (tuxIconView17 != null) {
                                                                                        Context context13 = getContext();
                                                                                        o.LJIIIIZZ(context13, "context");
                                                                                        int LIZIZ2 = (int) C79043V0l.LIZIZ(context13, 4.0f);
                                                                                        ViewGroup.LayoutParams layoutParams4 = tuxIconView17.getLayoutParams();
                                                                                        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                                                                                            marginLayoutParams.leftMargin = LIZIZ2;
                                                                                        }
                                                                                        tuxIconView17.requestLayout();
                                                                                    } else {
                                                                                        o.LJIJI("icSearchRelative");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    o.LJIJI("keyWordTv");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("icSearchRelative");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("icSearch");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        TuxIconView tuxIconView18 = this.LJLJLJ;
                                                                        if (tuxIconView18 != null) {
                                                                            tuxIconView18.setVisibility(8);
                                                                        } else {
                                                                            o.LJIJI("icSearchRelative");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                } else {
                                                                    o.LJIJI("icSearch");
                                                                    throw null;
                                                                }
                                                            }
                                                        } else {
                                                            o.LJIJI("keyWordTv");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("icSearchRelative");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("icSearch");
                                                    throw null;
                                                }
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
                            C72242sW c72242sW = new C72242sW();
                            ACListenerS43S0200000_8 aCListenerS43S0200000_8 = new ACListenerS43S0200000_8(this, c72242sW, 11);
                            IDTListenerS90S0200000_8 iDTListenerS90S0200000_8 = new IDTListenerS90S0200000_8(c72242sW, this, 3);
                            TuxTextView tuxTextView14 = this.LJLJL;
                            if (tuxTextView14 != null) {
                                C78897Uxp.LJJJJLI(tuxTextView14, new AqS171S0200000_8(this, c72242sW, 8));
                                TuxTextView tuxTextView15 = this.LJLJL;
                                if (tuxTextView15 != null) {
                                    C16880lQ.LJJJJI(tuxTextView15, aCListenerS43S0200000_8);
                                    TuxIconView tuxIconView19 = this.LJLLILLLL;
                                    if (tuxIconView19 != null) {
                                        C16880lQ.LJJJ(tuxIconView19, aCListenerS43S0200000_8);
                                        TuxIconView tuxIconView20 = this.LJLLILLLL;
                                        if (tuxIconView20 != null) {
                                            tuxIconView20.setOnTouchListener(iDTListenerS90S0200000_8);
                                            TuxIconView tuxIconView21 = this.LJLJLJ;
                                            if (tuxIconView21 != null) {
                                                C16880lQ.LJJJ(tuxIconView21, aCListenerS43S0200000_8);
                                                TuxIconView tuxIconView22 = this.LJLJLJ;
                                                if (tuxIconView22 != null) {
                                                    tuxIconView22.setOnTouchListener(iDTListenerS90S0200000_8);
                                                    if (this.LJLJJI) {
                                                        LinearLayout linearLayout2 = this.LJLLJ;
                                                        if (linearLayout2 != null) {
                                                            C26338AVi.LJI(linearLayout2, null, KNV.LIZIZ(4.5d), null, KNV.LIZIZ(4.5d), false, 21);
                                                            View view = this.LJLL;
                                                            if (view != null) {
                                                                view.setVisibility(8);
                                                            } else {
                                                                o.LJIJI("line");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("docLayout");
                                                            throw null;
                                                        }
                                                    }
                                                    if (this.LJLJJL) {
                                                        LinearLayout linearLayout3 = this.LJLLJ;
                                                        if (linearLayout3 != null) {
                                                            C26338AVi.LJI(linearLayout3, AnonymousClass391.LIZJ(16), AnonymousClass391.LIZJ(1), AnonymousClass391.LIZJ(16), AnonymousClass391.LIZJ(1), false, 16);
                                                            LinearLayout linearLayout4 = this.LJLLI;
                                                            if (linearLayout4 != null) {
                                                                C48966JJq.LIZIZ(linearLayout4, C51008K0e.LJLIL);
                                                                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                                                                anonymousClass064.LJII(this);
                                                                LinearLayout linearLayout5 = this.LJLLI;
                                                                if (linearLayout5 != null) {
                                                                    anonymousClass064.LJIIIIZZ(linearLayout5.getId(), 6, 0, 6);
                                                                    anonymousClass064.LIZIZ(this);
                                                                    View view2 = this.LJLL;
                                                                    if (view2 != null) {
                                                                        C79043V0l.LJIIJ(view2);
                                                                    } else {
                                                                        o.LJIJI("line");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("layout");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("layout");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("docLayout");
                                                            throw null;
                                                        }
                                                    }
                                                } else {
                                                    o.LJIJI("icSearchRelative");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("icSearchRelative");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("icSearch");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("icSearch");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("keyWordTv");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("keyWordTv");
                                throw null;
                            }
                        } else {
                            o.LJIJI("headTv");
                            throw null;
                        }
                    } else {
                        o.LJIJI("keyWordTv");
                        throw null;
                    }
                } else {
                    o.LJIJI("headTv");
                    throw null;
                }
            } else {
                o.LJIJI("textView");
                throw null;
            }
        }
        if (this.LJLJJL) {
            LJJLL(this.LJLIL, this.LJLILLLLZI);
        }
        if (C49818Jgs.LIZ().enableAheadPrefetch) {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS44S0100000_8(this, 137), C49818Jgs.LIZ().prefetchDelayTime);
        }
    }
}
