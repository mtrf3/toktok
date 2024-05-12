package com.bytedance.android.livesdk.qa;

import X.AbstractC19190p9;
import X.BV1;
import X.BV8;
import X.BZI;
import X.C0A3;
import X.C19050ov;
import X.C1DH;
import X.C221108m2;
import X.C28422BDm;
import X.C28787BRn;
import X.C28874BUw;
import X.C28896BVs;
import X.C29927Bop;
import X.C32537Cpp;
import X.C5H3;
import X.C62822Ol8;
import X.C78996UzQ;
import X.EnumC31509CYf;
import Y.AObserverS73S0100000_5;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.QAQuickEntranceSetting;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class QASuggestedFragment extends BaseQATabFragment {
    public BV8 LJLJL;
    public boolean LJLL;
    public boolean LJLLI;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C5H3 LJLJLJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 265));
    public final String LJLJLLL = "suggested";
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 264));

    @Override // com.bytedance.android.livesdk.qa.BaseQATabFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    @Override // com.bytedance.android.livesdk.qa.BaseQATabFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C28896BVs c28896BVs = (C28896BVs) this.LJLLILLLL.getValue();
        ((Handler) c28896BVs.LJLJJI.getValue()).removeCallbacksAndMessages(null);
        RecyclerView recyclerView = c28896BVs.LJLIL;
        if (recyclerView != null) {
            List<C0A3> list = recyclerView.LLIFFJFJJ;
            if (list != null) {
                ((ArrayList) list).remove(c28896BVs);
            }
            recyclerView.LJJLL(c28896BVs);
        }
        ((Set) c28896BVs.LJLJJL.getValue()).clear();
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment
    public final void onVisible() {
        Room room;
        Room LJIILL;
        InteractionQuestionInfo interactionQuestionInfo;
        if (!this.LJLL) {
            boolean z = true;
            this.LJLL = true;
            DataChannel dataChannel = this.LJLIL;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                BV8 bv8 = new BV8(room, dataChannel, this.LJLJLLL);
                bv8.LLIIIJ((PagingViewModel) this.LJLJLJ.getValue());
                this.LJLJL = bv8;
                dataChannel.lv0(this, QuestionRemoveQuestionChannel.class, new AqS171S0100000_5(this, 686));
                dataChannel.lv0(this, QuestionBatchRemoveQuestionEvent.class, new AqS171S0100000_5(this, 689));
                if (BV1.LJ(dataChannel) || QAQuickEntranceSetting.INSTANCE.enable()) {
                    ((SuggestedQuestionViewModel) this.LJLJLJ.getValue()).iv0(this.LJLJI, dataChannel, false);
                } else {
                    SuggestedQuestionViewModel suggestedQuestionViewModel = (SuggestedQuestionViewModel) this.LJLJLJ.getValue();
                    boolean z2 = this.LJLJI;
                    if (!C1DH.LJJIIJZLJL(dataChannel) || (LJIILL = C1DH.LJIILL(dataChannel)) == null || (interactionQuestionInfo = LJIILL.interactionQuestion) == null || !interactionQuestionInfo.hasQuickAnswer) {
                        z = false;
                    }
                    suggestedQuestionViewModel.iv0(z2, dataChannel, z);
                }
                SuggestedQuestionViewModel suggestedQuestionViewModel2 = (SuggestedQuestionViewModel) this.LJLJLJ.getValue();
                if (suggestedQuestionViewModel2.LJZI == null) {
                    suggestedQuestionViewModel2.LJZI = new C19050ov(suggestedQuestionViewModel2.LL, suggestedQuestionViewModel2.LLD).LIZ();
                }
                LiveData<AbstractC19190p9<QuestionEx>> liveData = suggestedQuestionViewModel2.LJZI;
                o.LJII(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<androidx.paging.PagedList<com.bytedance.android.livesdk.qa.QuestionEx>>");
                liveData.observe(this, new AObserverS73S0100000_5(this, 40));
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.iki);
                BV8 bv82 = this.LJLJL;
                if (bv82 != null) {
                    recyclerView.setAdapter(bv82);
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                    C28896BVs c28896BVs = (C28896BVs) this.LJLLILLLL.getValue();
                    AqS136S0200000_5 aqS136S0200000_5 = new AqS136S0200000_5(this, dataChannel, 35);
                    c28896BVs.getClass();
                    c28896BVs.LJLJJLL = aqS136S0200000_5;
                    RecyclerView recyclerView2 = c28896BVs.LJLIL;
                    if (recyclerView2 != null) {
                        recyclerView2.LJIIIZ(c28896BVs);
                        recyclerView2.LJIIJJI(c28896BVs);
                    }
                    IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
                    if (iMessageManager != null) {
                        int intType = EnumC31509CYf.QUESTION_DELETE_MESSAGE.getIntType();
                        BV8 bv83 = this.LJLJL;
                        if (bv83 != null) {
                            iMessageManager.addMessageListener(intType, bv83);
                        } else {
                            o.LJIJI("questionAdapter");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("questionAdapter");
                    throw null;
                }
            }
            ((PagingViewModel) this.LJLJLJ.getValue()).LJLJJL.observe(this, new AObserverS73S0100000_5(this, 39));
        }
        if (this.LJLLI) {
            vl();
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Boolean, O] */
    public final void vl() {
        String str;
        String str2;
        Boolean bool;
        Question question;
        Question question2;
        if (this.LJLILLLLZI) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C28874BUw.LJ);
            Iterator it = arrayList.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                QuestionEx questionEx = (QuestionEx) it.next();
                if (questionEx != null && (question2 = questionEx.question) != null && question2.answerStatus == 1) {
                    i2++;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(C28874BUw.LJ);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                QuestionEx questionEx2 = (QuestionEx) it2.next();
                if (questionEx2 != null && (question = questionEx2.question) != null && question.answerStatus == 0) {
                    i++;
                }
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_list_show");
            LIZ.LJIILLIIL(this.LJLIL);
            LIZ.LJIJJ(Integer.valueOf(i2), "show_answered_question_cnt");
            LIZ.LJIJJ(Integer.valueOf(i), "show_not_answered_question_cnt");
            LIZ.LJIJJ(Integer.valueOf(i2 + i), "show_question_cnt");
            DataChannel dataChannel = this.LJLIL;
            if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(C28422BDm.class)) == null || bool.booleanValue()) {
                str = this.LJLJJI;
            } else {
                str = this.LJLJJL;
            }
            LIZ.LJIJJ(str, "qa_list_enter_from");
            if (o.LJ(this.LJLJJI, "interaction_feature")) {
                LIZ.LJIJJ(this.LJLJJI, "enter_from");
            }
            LIZ.LJIJJ(this.LJLJLLL, "sub_list");
            if (C28874BUw.LIZIZ) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str2 = "1";
            }
            LIZ.LJIJJ(str2, "is_qa_list_end");
            LIZ.LJJIIJZLJL();
            DataChannel dataChannel2 = this.LJLIL;
            if (dataChannel2 != null) {
                ((C32537Cpp) dataChannel2.gv0(C28422BDm.class)).LIZ = Boolean.FALSE;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.qa.BaseQATabFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannel dataChannel;
        IMessageManager iMessageManager;
        super.onDestroy();
        if (this.LJLJL != null && (dataChannel = this.LJLIL) != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            int intType = EnumC31509CYf.QUESTION_DELETE_MESSAGE.getIntType();
            BV8 bv8 = this.LJLJL;
            if (bv8 != null) {
                iMessageManager.addMessageListener(intType, bv8);
            } else {
                o.LJIJI("questionAdapter");
                throw null;
            }
        }
    }
}
