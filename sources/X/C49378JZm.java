package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.SearchChallengeAdData;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JZm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49378JZm extends JZH<SearchChallenge> {
    @Override // X.AbstractC51777KTt
    public final RecyclerView.ViewHolder LJLZ(ViewGroup viewGroup) {
        View LIZIZ = C50365Jph.LIZIZ(R.layout.ch0, viewGroup);
        ViewOnAttachStateChangeListenerC49384JZs viewOnAttachStateChangeListenerC49384JZs = new ViewOnAttachStateChangeListenerC49384JZs(LIZIZ);
        LIZIZ.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC49384JZs);
        LIZIZ.setTag(R.id.jen, viewOnAttachStateChangeListenerC49384JZs);
        C49383JZr c49383JZr = new C49383JZr(LIZIZ);
        c49383JZr.LJLLI = "search_result";
        return c49383JZr;
    }

    @Override // X.C8HS
    public final void setData(List<SearchChallenge> list) {
        this.LJLJJL.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        super.setData(list);
    }

    @Override // X.AbstractC51777KTt
    public final void LJLLLLLL(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String str2;
        String str3;
        SpannableString spannableString;
        int i2;
        List<T> list = this.mmItems;
        if (list == 0) {
            return;
        }
        C49383JZr c49383JZr = (C49383JZr) viewHolder;
        SearchChallenge searchChallenge = (SearchChallenge) ListProtector.get(list, i);
        InterfaceC50157JmL LIZ = K0M.LIZ();
        String str4 = "";
        if (LIZ == null) {
            str = "";
            str2 = "";
        } else {
            str = LIZ.LIZJ().LIZ;
            str2 = LIZ.LIZJ().LIZIZ;
            LIZ.LIZIZ();
        }
        if (i % 10 == 0) {
            JVR.LIZJ("challenge");
        }
        LogPbBean logPbBean = searchChallenge.logPbBean;
        if (logPbBean == null) {
            logPbBean = new LogPbBean();
            logPbBean.setImprId("");
        }
        String imprId = logPbBean.getImprId();
        String logPbStr = C3A5.LIZ.LIZLLL(imprId);
        this.LJLJI.getEnterMethod();
        JWD.LIZ.getClass();
        String LIZ2 = JWE.LIZ(2);
        InterfaceC49275JVn.LIZ.getClass();
        String LIZ3 = C49270JVi.LIZ(2);
        JQA jqa = new JQA();
        jqa.LJFF = "search_result";
        jqa.LIZ = false;
        jqa.LIZJ(str);
        jqa.LIZIZ(imprId);
        o.LJIIIZ(logPbStr, "logPbStr");
        jqa.LJIIJJI = logPbStr;
        jqa.LJIIJ = logPbBean;
        jqa.LJIIL = i;
        jqa.LIZLLL(str2);
        jqa.LIZIZ = 2;
        jqa.LIZJ = LIZ2;
        jqa.LIZLLL = LIZ3;
        c49383JZr.LLLLIIIILLL(jqa);
        SearchChallenge searchChallenge2 = (SearchChallenge) ListProtector.get(list, i);
        InterfaceC49765Jg1 interfaceC49765Jg1 = this.LJLJJI;
        if (interfaceC49765Jg1 == null || interfaceC49765Jg1.getKeyword() == null) {
            str3 = "";
        } else {
            str3 = this.LJLJJI.getKeyword().LJLIL;
        }
        if (searchChallenge2 != null) {
            Challenge challenge = searchChallenge2.getChallenge();
            String str5 = null;
            if (challenge != null) {
                if (challenge.getHighlightInfoList() != null) {
                    c49383JZr.LJLJL.setTypeface(C49616Jdc.LIZIZ().LIZLLL("regular"));
                    c49383JZr.LJLJL.setTextColor(C79045V0n.LJI(R.attr.gu, c49383JZr.itemView.getContext()).intValue());
                    c49383JZr.LJLLLLLL = new C49448Jau(new C49385JZt(c49383JZr));
                } else {
                    c49383JZr.LJLJL.setTypeface(C49616Jdc.LIZIZ().LIZLLL("medium"));
                    c49383JZr.LJLJL.setTextColor(C79045V0n.LJI(R.attr.go, c49383JZr.itemView.getContext()).intValue());
                    c49383JZr.LJLLLLLL = null;
                }
            }
            c49383JZr.LJLL = str3;
            if (searchChallenge2.getChallenge() != null) {
                c49383JZr.LJLJLLL = searchChallenge2.getChallenge();
            }
            c49383JZr.LJLJLJ.setText(c49383JZr.itemView.getContext().getResources().getQuantityString(R.plurals.ga, (int) c49383JZr.LJLJLLL.getDisplayCount(), C77123UOp.LJJIIJ(c49383JZr.LJLJLLL.getDisplayCount())));
            Context context = c49383JZr.LJLJL.getContext();
            String searchChaName = c49383JZr.LJLJLLL.getSearchChaName();
            List<Position> position = searchChallenge2.getPosition();
            if (searchChaName != null) {
                str4 = searchChaName;
            }
            if (context == null || TextUtils.isEmpty(str4) || C79004UzY.LJJIFFI(position)) {
                spannableString = new SpannableString(str4);
            } else {
                spannableString = new SpannableString(str4);
                for (Position position2 : position) {
                    if (position2 != null) {
                        Integer LJI = C79045V0n.LJI(R.attr.bx, context);
                        if (LJI != null) {
                            i2 = LJI.intValue();
                        } else {
                            i2 = 0;
                        }
                        int begin = position2.getBegin();
                        int end = position2.getEnd() + 1;
                        int max = Math.max(0, begin);
                        if (!TextUtils.isEmpty(spannableString) && max <= end && max < spannableString.length() && end <= spannableString.length()) {
                            spannableString.setSpan(new ForegroundColorSpan(i2), max, end, 17);
                        }
                    }
                }
            }
            C49448Jau c49448Jau = c49383JZr.LJLLLLLL;
            if (c49448Jau != null) {
                c49448Jau.LIZ(spannableString, "search_cha_name", 0);
            }
            UrlModel LJIJ = CommerceChallengeServiceImpl.LIZIZ().LJIJ(c49383JZr.LJLJLLL.getSearchChaName(), c49383JZr.LJLJLLL.isCommerce(), false);
            if (LJIJ != null) {
                c49383JZr.LJLLILLLL = Boolean.TRUE;
                c49383JZr.LJLLJ = "search_hashtag";
                CommerceChallengeServiceImpl.LIZIZ().LJIILJJIL(c49383JZr.LJLJL.getContext(), c49383JZr.LJLJLLL.getSearchChaName(), LJIJ, spannableString, c49383JZr.LJLJL, c49383JZr.LJLLJ);
            } else {
                c49383JZr.LJLLILLLL = Boolean.FALSE;
                c49383JZr.LJLJL.setText(spannableString);
            }
            View view = c49383JZr.itemView;
            SearchChallengeAdData adData = searchChallenge2.getAdData();
            Object tag = view.getTag(R.id.jen);
            if (tag instanceof ViewOnAttachStateChangeListenerC49384JZs) {
                ViewOnAttachStateChangeListenerC49384JZs viewOnAttachStateChangeListenerC49384JZs = (ViewOnAttachStateChangeListenerC49384JZs) tag;
                if (viewOnAttachStateChangeListenerC49384JZs.LJLILLLLZI != adData) {
                    if (adData == null) {
                        viewOnAttachStateChangeListenerC49384JZs.LJLILLLLZI = null;
                    } else {
                        viewOnAttachStateChangeListenerC49384JZs.LJLILLLLZI = adData;
                        viewOnAttachStateChangeListenerC49384JZs.LJLJJI = false;
                        viewOnAttachStateChangeListenerC49384JZs.run();
                    }
                }
            }
            JQA LJLJL = c49383JZr.LJLJL();
            if (c49383JZr.M() != null) {
                str5 = c49383JZr.M().jv0();
            }
            LJLJL.LIZ(str5);
            if (searchChallenge2.getChallenge() != null) {
                JN8 LIZIZ = JND.LIZIZ(LJLJL);
                LIZIZ.LJIIZILJ("token_type", "tag");
                LIZIZ.LJJIIJZLJL(CardStruct.IStatusCode.DEFAULT);
                LIZIZ.LJIJ("search_result_id", searchChallenge2.getChallenge().getCid());
                LIZIZ.LJJI(Integer.valueOf(c49383JZr.getAdapterPosition()));
                LIZIZ.LJ("hashtags_name", searchChallenge2.getChallenge().getSearchChaName(), InterfaceC1798974f.LIZ);
                LIZIZ.LJIILIIL();
            }
            c49383JZr.LJLJJL = true;
            View view2 = c49383JZr.itemView;
            Challenge challenge2 = c49383JZr.LJLJLLL;
            JYG jyg = new JYG();
            jyg.setFeedbackType("challenge");
            jyg.setTitle(challenge2.getChallengeName());
            jyg.setImgCover(challenge2.getBackgroundImageUrl());
            HashMap hashMap = new HashMap();
            hashMap.put("search_result_id", challenge2.getCid());
            hashMap.put("enter_from", c49383JZr.LJLLI);
            hashMap.put("token_type", "tag");
            c49383JZr.LJLJL();
            hashMap.put("is_aladdin", CardStruct.IStatusCode.DEFAULT);
            hashMap.put("rank", String.valueOf(c49383JZr.LJLJL().LJIIL));
            jyg.setLogParams(hashMap);
            jyg.setMultipleChoices(C51757KSz.LIZLLL(jyg.getFeedbackType()));
            c49383JZr.L(view2, view2, jyg, new View.OnTouchListener() { // from class: X.JZv
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() == 1) {
                        view3.performClick();
                        return false;
                    }
                    return false;
                }
            });
        }
        this.LJLJJL.LIZ(i, getBasicItemCount());
    }

    public C49378JZm(SearchResultParam searchResultParam, InterfaceC49816Jgq interfaceC49816Jgq, JZI jzi) {
        super(searchResultParam, interfaceC49816Jgq, jzi);
    }
}
