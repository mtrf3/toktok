package Y;

import X.AbstractC50059Jkl;
import X.C16880lQ;
import X.C32151Nz;
import X.C49587Jd9;
import X.C49589JdB;
import X.C50322Jp0;
import X.C50427Jqh;
import X.C50646JuE;
import X.C50699Jv5;
import X.C51006K0c;
import X.C6ZT;
import X.C72242sW;
import X.C78685UuP;
import X.C78688UuS;
import X.EnumC27399Ap9;
import X.JQ0;
import X.JQA;
import X.K5T;
import X.K5U;
import X.O6R;
import X.ViewOnAttachStateChangeListenerC49329JXp;
import X.ViewOnAttachStateChangeListenerC49333JXt;
import X.Z9N;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.relation.ffp.ui.FFPMainFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.SearchResultFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendsV2Fragment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoFeedbackAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IDTListenerS90S0200000_8 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS90S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(IDTListenerS90S0200000_8 iDTListenerS90S0200000_8, View view, MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            K5T k5t = (K5T) iDTListenerS90S0200000_8.l0;
            K5U k5u = new K5U();
            String string = ((FFPMainFragment) iDTListenerS90S0200000_8.l1).getString(R.string.cg_);
            k5u.LJI = string;
            TuxTextView tuxTextView = k5u.LJII;
            if (tuxTextView != null) {
                tuxTextView.setText(string);
            }
            k5u.LIZIZ(EnumC27399Ap9.SECONDARY);
            k5u.LIZ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), 0, 0);
            AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8((FFPMainFragment) iDTListenerS90S0200000_8.l1, 52);
            k5u.LJFF = new ACListenerS28S0100000_8(aqS174S0100000_8, 52);
            TuxTextView tuxTextView2 = k5u.LJII;
            if (tuxTextView2 != null) {
                C16880lQ.LJJJJI(tuxTextView2, new ACListenerS28S0100000_8(aqS174S0100000_8, 53));
            }
            k5t.setEndAction(k5u);
            FFPMainFragment fFPMainFragment = (FFPMainFragment) iDTListenerS90S0200000_8.l1;
            Fragment fragment = fFPMainFragment.LJLJJI;
            if (fragment == null || (!(fragment instanceof SearchResultFragment) && !(fragment instanceof SearchFriendsV2Fragment))) {
                fFPMainFragment.LJLJJL = fragment;
                fFPMainFragment.Il().gv0(C78685UuP.LJJLIL(((FFPMainFragment) iDTListenerS90S0200000_8.l1).Kl()));
            }
        }
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS90S0200000_8 iDTListenerS90S0200000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((View) iDTListenerS90S0200000_8.l0).performClick();
            if (JQ0.LIZ()) {
                SearchPhotoFeedbackAssem searchPhotoFeedbackAssem = (SearchPhotoFeedbackAssem) iDTListenerS90S0200000_8.l1;
                C78688UuS.LJJLIIIIJ(motionEvent, searchPhotoFeedbackAssem.LLD, ((SearchPhotoViewModel) searchPhotoFeedbackAssem.LJZL.getValue()).LJLILLLLZI, ((SearchPhotoFeedbackAssem) iDTListenerS90S0200000_8.l1).LL);
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS90S0200000_8 iDTListenerS90S0200000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((SearchVideoHolder) iDTListenerS90S0200000_8.l0).onClick((View) iDTListenerS90S0200000_8.l1);
            if (JQ0.LIZ()) {
                ((SearchVideoHolder) iDTListenerS90S0200000_8.l0).LLLIIL(motionEvent);
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS90S0200000_8 iDTListenerS90S0200000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((C72242sW) iDTListenerS90S0200000_8.l0).element = System.currentTimeMillis();
            Z9N.LIZIZ.LLILII(((C51006K0c) iDTListenerS90S0200000_8.l1).getContext(), ((C51006K0c) iDTListenerS90S0200000_8.l1).getSearchParams());
        } else if (motionEvent.getAction() == 3) {
            Z9N z9n = Z9N.LIZIZ;
            z9n.LLLIIII(((C72242sW) iDTListenerS90S0200000_8.l0).element, "comment_related_search", true);
            z9n.LJIIIZ("cancel", ((C51006K0c) iDTListenerS90S0200000_8.l1).LJLLLL, "ACTION_CANCEL");
        }
        return false;
    }

    public static final boolean onTouch$4(IDTListenerS90S0200000_8 iDTListenerS90S0200000_8, View view, MotionEvent motionEvent) {
        String str;
        String str2;
        String str3;
        String str4;
        Long l;
        AbstractC50059Jkl<C50427Jqh> cs;
        C50427Jqh LIZJ;
        AbstractC50059Jkl<C49589JdB> IO;
        C49589JdB LIZJ2;
        AbstractC50059Jkl<C50427Jqh> cs2;
        C50427Jqh LIZJ3;
        AbstractC50059Jkl<C50427Jqh> cs3;
        C50427Jqh LIZJ4;
        String str5;
        String str6;
        String str7;
        String str8;
        AbstractC50059Jkl<C49587Jd9> ut0;
        C49587Jd9 LIZJ5;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ6;
        AbstractC50059Jkl<C49587Jd9> ut02;
        C49587Jd9 LIZJ7;
        AbstractC50059Jkl<C50322Jp0> If2;
        C50322Jp0 LIZJ8;
        if (motionEvent.getActionMasked() == 1 && !C6ZT.LIZ(view)) {
            ViewOnAttachStateChangeListenerC49333JXt viewOnAttachStateChangeListenerC49333JXt = (ViewOnAttachStateChangeListenerC49333JXt) iDTListenerS90S0200000_8.l0;
            RelatedWord relatedWord = (RelatedWord) iDTListenerS90S0200000_8.l1;
            viewOnAttachStateChangeListenerC49333JXt.getClass();
            Word word = relatedWord.wordRecord;
            String str9 = null;
            if (word != null) {
                ISearchContextAbility iSearchContextAbility = viewOnAttachStateChangeListenerC49333JXt.LJLILLLLZI;
                Integer valueOf = Integer.valueOf(viewOnAttachStateChangeListenerC49333JXt.LJLJI);
                int i = viewOnAttachStateChangeListenerC49333JXt.LJLJJI;
                C50646JuE c50646JuE = new C50646JuE();
                c50646JuE.LJIIZILJ("group_id", word.getId());
                c50646JuE.LJIIZILJ("words_source", word.getWordSource());
                c50646JuE.LJJIIJZLJL(Integer.valueOf(word.getWordPosition()));
                c50646JuE.LJIIZILJ("words_content", word.getWord());
                if (iSearchContextAbility != null && (If2 = iSearchContextAbility.If()) != null && (LIZJ8 = If2.LIZJ()) != null) {
                    str5 = LIZJ8.LJLJI;
                } else {
                    str5 = null;
                }
                c50646JuE.LJIIZILJ("search_id", str5);
                if (iSearchContextAbility != null && (ut02 = iSearchContextAbility.ut0()) != null && (LIZJ7 = ut02.LIZJ()) != null) {
                    str6 = LIZJ7.LJLIL;
                } else {
                    str6 = null;
                }
                c50646JuE.LJIIZILJ("impr_id", str6);
                if (iSearchContextAbility != null && (If = iSearchContextAbility.If()) != null && (LIZJ6 = If.LIZJ()) != null) {
                    str7 = LIZJ6.LJLJJI;
                } else {
                    str7 = null;
                }
                c50646JuE.LJIIZILJ("raw_query", str7);
                c50646JuE.LJIIZILJ("words_content", word.getWord());
                c50646JuE.LJIIZILJ("search_position", "general");
                c50646JuE.LJJIII(Integer.valueOf(i));
                c50646JuE.LJIIZILJ("group_position", String.valueOf(valueOf));
                if (o.LJ("2", word.getWordType())) {
                    c50646JuE.LJJIIZ("hot");
                }
                c50646JuE.LJIILIIL();
                C50699Jv5 c50699Jv5 = new C50699Jv5();
                if (iSearchContextAbility == null || (ut0 = iSearchContextAbility.ut0()) == null || (LIZJ5 = ut0.LIZJ()) == null || (str8 = LIZJ5.LJLIL) == null) {
                    str8 = "";
                }
                c50699Jv5.LJII(str8);
            }
            JSONObject jSONObject = new JSONObject();
            Word word2 = relatedWord.wordRecord;
            if (word2 != null) {
                str = word2.getId();
            } else {
                str = null;
            }
            JSONObject put = jSONObject.put("trending_words_group_id", str);
            Word word3 = relatedWord.wordRecord;
            if (word3 != null) {
                str2 = word3.getId();
            } else {
                str2 = null;
            }
            String jSONObject2 = put.put("group_id", str2).toString();
            o.LJIIIIZZ(jSONObject2, "JSONObject()\n           …)\n            .toString()");
            new C50699Jv5(viewOnAttachStateChangeListenerC49333JXt.itemView.getContext()).LJI();
            SmartRoute buildRoute = SmartRouter.buildRoute(viewOnAttachStateChangeListenerC49333JXt.itemView.getContext(), "aweme://search/");
            buildRoute.withParam("keyword", relatedWord.text);
            buildRoute.withParam("search_type", "general");
            buildRoute.withParam("enter_method", "related_search_keyword");
            buildRoute.withParam("from", "related_search_keyword");
            ISearchContextAbility iSearchContextAbility2 = viewOnAttachStateChangeListenerC49333JXt.LJLILLLLZI;
            if (iSearchContextAbility2 != null && (cs3 = iSearchContextAbility2.cs()) != null && (LIZJ4 = cs3.LIZJ()) != null) {
                str3 = LIZJ4.LJLIL;
            } else {
                str3 = null;
            }
            buildRoute.withParam("previous_page", str3);
            ISearchContextAbility iSearchContextAbility3 = viewOnAttachStateChangeListenerC49333JXt.LJLILLLLZI;
            if (iSearchContextAbility3 != null && (cs2 = iSearchContextAbility3.cs()) != null && (LIZJ3 = cs2.LIZJ()) != null) {
                str4 = LIZJ3.LJLIL;
            } else {
                str4 = null;
            }
            buildRoute.withParam("enter_from", str4);
            ISearchContextAbility iSearchContextAbility4 = viewOnAttachStateChangeListenerC49333JXt.LJLILLLLZI;
            if (iSearchContextAbility4 != null && (IO = iSearchContextAbility4.IO()) != null && (LIZJ2 = IO.LIZJ()) != null) {
                l = Long.valueOf(LIZJ2.LJLIL);
            } else {
                l = null;
            }
            buildRoute.withParam("search_session_id", l);
            buildRoute.withParam("extraLogParams", jSONObject2);
            ISearchContextAbility iSearchContextAbility5 = viewOnAttachStateChangeListenerC49333JXt.LJLILLLLZI;
            if (iSearchContextAbility5 != null && (cs = iSearchContextAbility5.cs()) != null && (LIZJ = cs.LIZJ()) != null) {
                str9 = LIZJ.LJLILLLLZI;
            }
            if (C78685UuP.LJJJZ(str9)) {
                buildRoute.withParam("enter_from_sub", str9);
            }
            buildRoute.open();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$5(IDTListenerS90S0200000_8 iDTListenerS90S0200000_8, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((SearchVideoHolder) iDTListenerS90S0200000_8.l0).onClick((View) iDTListenerS90S0200000_8.l1);
            ((SearchVideoHolder) iDTListenerS90S0200000_8.l0).LLLIIL(motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$6(IDTListenerS90S0200000_8 iDTListenerS90S0200000_8, View view, MotionEvent motionEvent) {
        String str;
        String str2;
        String str3;
        AbstractC50059Jkl<C49589JdB> IO;
        C49589JdB LIZJ;
        AbstractC50059Jkl<C50427Jqh> cs;
        C50427Jqh LIZJ2;
        AbstractC50059Jkl<C50427Jqh> cs2;
        C50427Jqh LIZJ3;
        String str4;
        String str5;
        String str6;
        Integer num;
        String str7;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ4;
        AbstractC50059Jkl<C50322Jp0> If2;
        C50322Jp0 LIZJ5;
        if (motionEvent.getActionMasked() == 1 && !C6ZT.LIZ(view)) {
            ViewOnAttachStateChangeListenerC49329JXp viewOnAttachStateChangeListenerC49329JXp = (ViewOnAttachStateChangeListenerC49329JXp) iDTListenerS90S0200000_8.l0;
            ClickSearchWord clickSearchWord = (ClickSearchWord) iDTListenerS90S0200000_8.l1;
            viewOnAttachStateChangeListenerC49329JXp.getClass();
            Word word = clickSearchWord.wordRecord;
            Long l = null;
            if (word != null) {
                ISearchContextAbility iSearchContextAbility = viewOnAttachStateChangeListenerC49329JXp.LJLILLLLZI;
                JQA jqa = viewOnAttachStateChangeListenerC49329JXp.LJLJI;
                C50646JuE c50646JuE = new C50646JuE();
                c50646JuE.LJIIZILJ("group_id", word.getId());
                c50646JuE.LJIIZILJ("words_source", word.getWordSource());
                c50646JuE.LJJIIJZLJL(Integer.valueOf(word.getWordPosition()));
                c50646JuE.LJIIZILJ("words_content", word.getWord());
                if (iSearchContextAbility != null && (If2 = iSearchContextAbility.If()) != null && (LIZJ5 = If2.LIZJ()) != null) {
                    str4 = LIZJ5.LJLJI;
                } else {
                    str4 = null;
                }
                c50646JuE.LJIIZILJ("search_id", str4);
                if (jqa != null) {
                    str5 = jqa.LJIIIZ;
                } else {
                    str5 = null;
                }
                c50646JuE.LJIIZILJ("impr_id", str5);
                if (iSearchContextAbility != null && (If = iSearchContextAbility.If()) != null && (LIZJ4 = If.LIZJ()) != null) {
                    str6 = LIZJ4.LJLJJI;
                } else {
                    str6 = null;
                }
                c50646JuE.LJIIZILJ("raw_query", str6);
                c50646JuE.LJIIZILJ("words_content", word.getWord());
                c50646JuE.LJIIZILJ("search_position", "general");
                if (jqa != null) {
                    num = Integer.valueOf(jqa.LJIIL);
                } else {
                    num = null;
                }
                c50646JuE.LJJIII(num);
                if (o.LJ("2", word.getWordType())) {
                    c50646JuE.LJJIIZ("hot");
                }
                c50646JuE.LJIILIIL();
                C50699Jv5 c50699Jv5 = new C50699Jv5();
                if (jqa == null || (str7 = jqa.LJIIIZ) == null) {
                    str7 = "";
                }
                c50699Jv5.LJII(str7);
            }
            JSONObject jSONObject = new JSONObject();
            Word word2 = clickSearchWord.wordRecord;
            if (word2 != null) {
                str = word2.getId();
            } else {
                str = null;
            }
            String jSONObject2 = jSONObject.put("group_id", str).toString();
            o.LJIIIIZZ(jSONObject2, "JSONObject()\n           …)\n            .toString()");
            new C50699Jv5(viewOnAttachStateChangeListenerC49329JXp.itemView.getContext()).LJI();
            SmartRoute buildRoute = SmartRouter.buildRoute(viewOnAttachStateChangeListenerC49329JXp.itemView.getContext(), "aweme://search/");
            buildRoute.withParam("keyword", clickSearchWord.word);
            buildRoute.withParam("search_type", "general");
            buildRoute.withParam("enter_method", "click_recom");
            buildRoute.withParam("from", "click_recom");
            ISearchContextAbility iSearchContextAbility2 = viewOnAttachStateChangeListenerC49329JXp.LJLILLLLZI;
            if (iSearchContextAbility2 != null && (cs2 = iSearchContextAbility2.cs()) != null && (LIZJ3 = cs2.LIZJ()) != null) {
                str2 = LIZJ3.LJLIL;
            } else {
                str2 = null;
            }
            buildRoute.withParam("previous_page", str2);
            ISearchContextAbility iSearchContextAbility3 = viewOnAttachStateChangeListenerC49329JXp.LJLILLLLZI;
            if (iSearchContextAbility3 != null && (cs = iSearchContextAbility3.cs()) != null && (LIZJ2 = cs.LIZJ()) != null) {
                str3 = LIZJ2.LJLIL;
            } else {
                str3 = null;
            }
            buildRoute.withParam("enter_from", str3);
            ISearchContextAbility iSearchContextAbility4 = viewOnAttachStateChangeListenerC49329JXp.LJLILLLLZI;
            if (iSearchContextAbility4 != null && (IO = iSearchContextAbility4.IO()) != null && (LIZJ = IO.LIZJ()) != null) {
                l = Long.valueOf(LIZJ.LJLIL);
            }
            buildRoute.withParam("search_session_id", l);
            buildRoute.withParam("extraLogParams", jSONObject2);
            buildRoute.open();
            return false;
        }
        return false;
    }
}
