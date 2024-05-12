package com.bytedance.android.livesdk.qa;

import X.AbstractC19190p9;
import X.BV1;
import X.BV9;
import X.BZI;
import X.C0K2;
import X.C113554cx;
import X.C16880lQ;
import X.C19050ov;
import X.C1DH;
import X.C221108m2;
import X.C28422BDm;
import X.C28787BRn;
import X.C28863BUl;
import X.C28881BVd;
import X.C28O;
import X.C29306Beo;
import X.C29927Bop;
import X.C32537Cpp;
import X.C5H3;
import X.C62822Ol8;
import X.C78996UzQ;
import X.EnumC31509CYf;
import X.OSZ;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS73S0100000_5;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.QuestionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class QAQuestionsFragment extends BaseQATabFragment implements OnMessageListener {
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public boolean LJLLJ;
    public boolean LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 262));
    public final C5H3 LJLJLJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 263));
    public final String LJLLILLLL = "questions";

    @Override // com.bytedance.android.livesdk.qa.BaseQATabFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
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
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void initView() {
        Room room;
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return;
        }
        BV9 vl = vl();
        vl.LLIIIJ(wl());
        vl.LJZ = this.LJLILLLLZI;
        vl.LJZI = this.LJLJI;
        vl.LJLLLLLL = false;
        vl.notifyDataSetChanged();
        if (!vl.LJLLILLLL || vl.LJLLJ) {
            vl.LJLLILLLL = false;
        } else {
            vl.LJLLILLLL = false;
            vl.notifyDataSetChanged();
        }
        if (!this.LJLILLLLZI) {
            DataChannel dataChannel2 = this.LJLIL;
            if (dataChannel2 != null) {
                dataChannel2.lv0(this, QuestionAddEvent.class, new AqS171S0100000_5(this, 471));
                dataChannel2.lv0(this, LiveEndDismissDialogEvent.class, new AqS171S0100000_5(this, 472));
            }
            C0K2.LJII(0, "live_Q&A_audience_show", C113554cx.LJJJLZIJ(new OSZ("isQAOPen", Boolean.valueOf(C1DH.LJJIIJZLJL(this.LJLIL))), new OSZ("isQAReducedVersion", Boolean.valueOf(BV1.LJFF(this.LJLIL)))));
        } else {
            DataChannel dataChannel3 = this.LJLIL;
            if (dataChannel3 != null) {
                dataChannel3.lv0(this, AnchorSwitchQuestionEvent.class, new AqS171S0100000_5(this, 473));
            }
        }
        DataChannel dataChannel4 = this.LJLIL;
        if (dataChannel4 != null) {
            dataChannel4.lv0(this, QuestionRemoveQuestionChannel.class, new AqS171S0100000_5(this, 474));
            dataChannel4.lv0(this, QuestionBatchRemoveQuestionEvent.class, new AqS171S0100000_5(this, 475));
        }
        wl().iv0(room, this.LJLILLLLZI, this.LJLJI, BV1.LJIIIZ(this.LJLIL), C1DH.LJJIIJZLJL(this.LJLIL));
        vl().LJZL = room;
        QuestionViewModel wl = wl();
        if (wl.LJZ == null) {
            wl.LJZ = new C19050ov(wl.LJZL, wl.LL).LIZ();
        }
        wl.LJZ.observe(this, new AObserverS73S0100000_5(this, 31));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.iki);
        recyclerView.setAdapter(vl());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        DataChannel dataChannel5 = this.LJLIL;
        if (dataChannel5 == null || (iMessageManager = (IMessageManager) dataChannel5.kv0(C29927Bop.class)) == null) {
            return;
        }
        iMessageManager.addMessageListener(EnumC31509CYf.QUESTION_DELETE_MESSAGE.getIntType(), vl());
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment
    public final void onVisible() {
        int i;
        String str;
        String str2;
        Boolean bool;
        List<QuestionEx> list;
        List<QuestionEx> list2;
        IMessageManager iMessageManager;
        DataChannel dataChannel;
        int i2 = 0;
        if (!this.LJLLJ) {
            initView();
            if (!this.LJLILLLLZI) {
                ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.a8s);
                C29306Beo.LJJLJLI(constraintLayout);
                C16880lQ.LJIL(constraintLayout, new ACListenerS25S0100000_5(this, 303));
            }
            wl().LJLJJL.observe(this, new AObserverS73S0100000_5(this, 37));
            if (C29306Beo.LJIIJ(this.LJLIL) && (dataChannel = this.LJLIL) != null) {
                dataChannel.lv0(this, AnchorSwitchQuestionEvent.class, new AqS171S0100000_5(this, 682));
            }
            if (this.LJLILLLLZI || this.LJLJI) {
                DataChannel dataChannel2 = this.LJLIL;
                if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
                    iMessageManager.addMessageListener(EnumC31509CYf.QUESTION.getIntType(), this);
                }
                wl().LJLJJLL.observe(this, new AObserverS73S0100000_5(this, 38));
            }
            this.LJLLJ = true;
        } else if (this.LJLLL) {
            this.LJLLL = false;
            xl();
        }
        if (this.LJLILLLLZI) {
            C28881BVd c28881BVd = wl().LJZI;
            if (c28881BVd != null && (list2 = c28881BVd.LJIJ) != null) {
                i = ((ArrayList) list2).size();
            } else {
                i = 0;
            }
            this.LJLJLLL = i;
            C28881BVd c28881BVd2 = wl().LJZI;
            if (c28881BVd2 != null && (list = c28881BVd2.LJIIZILJ) != null) {
                i2 = ((ArrayList) list).size();
            }
            this.LJLL = i2;
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_list_show");
            LIZ.LJIILLIIL(this.LJLIL);
            LIZ.LJIJJ(Integer.valueOf(this.LJLJLLL), "show_answered_question_cnt");
            LIZ.LJIJJ(Integer.valueOf(this.LJLL), "show_not_answered_question_cnt");
            LIZ.LJIJJ(Integer.valueOf(this.LJLJLLL + this.LJLL), "show_question_cnt");
            DataChannel dataChannel3 = this.LJLIL;
            if (dataChannel3 == null || (bool = (Boolean) dataChannel3.kv0(C28422BDm.class)) == null || bool.booleanValue()) {
                str = this.LJLJJI;
            } else {
                str = this.LJLJJL;
            }
            LIZ.LJIJJ(str, "qa_list_enter_from");
            LIZ.LJIJJ(this.LJLLILLLL, "sub_list");
            if (this.LJLLI) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str2 = "1";
            }
            LIZ.LJIJJ(str2, "is_qa_list_end");
            LIZ.LJJIIJZLJL();
            DataChannel dataChannel4 = this.LJLIL;
            if (dataChannel4 != null) {
                ((C32537Cpp) dataChannel4.gv0(C28422BDm.class)).LIZ = Boolean.FALSE;
            }
        }
    }

    public final BV9 vl() {
        return (BV9) this.LJLJL.getValue();
    }

    public final QuestionViewModel wl() {
        return (QuestionViewModel) this.LJLJLJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.qa.BaseQATabFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        String str;
        List<QuestionEx> list;
        List<QuestionEx> list2;
        super.onDestroy();
        if (!this.LJLILLLLZI) {
            C28881BVd c28881BVd = wl().LJZI;
            boolean z4 = false;
            if (c28881BVd != null && (list2 = c28881BVd.LJIJ) != null) {
                i = ((ArrayList) list2).size();
            } else {
                i = 0;
            }
            this.LJLJLLL = i;
            C28881BVd c28881BVd2 = wl().LJZI;
            if (c28881BVd2 != null && (list = c28881BVd2.LJIIZILJ) != null) {
                i2 = ((ArrayList) list).size();
            } else {
                i2 = 0;
            }
            this.LJLL = i2;
            int i3 = this.LJLJLLL + i2;
            C28881BVd c28881BVd3 = wl().LJZI;
            if (c28881BVd3 != null) {
                z = c28881BVd3.LJJI;
            } else {
                z = false;
            }
            C28881BVd c28881BVd4 = wl().LJZI;
            if (c28881BVd4 != null) {
                z2 = c28881BVd4.LJJ;
            } else {
                z2 = false;
            }
            C28881BVd c28881BVd5 = wl().LJZI;
            if (c28881BVd5 != null) {
                z3 = c28881BVd5.LJJIFFI;
            } else {
                z3 = false;
            }
            DataChannel dataChannel = this.LJLIL;
            if (dataChannel == null || (obj = dataChannel.kv0(C28863BUl.class)) == null) {
                obj = "";
            }
            if (z && z2 && z3) {
                z4 = true;
            }
            this.LJLLI = z4;
            BZI LIZ = C28787BRn.LIZ("livesdk_qa_list_show");
            LIZ.LJIILLIIL(this.LJLIL);
            LIZ.LJIJJ(Integer.valueOf(this.LJLJLLL), "answered_question_cnt");
            LIZ.LJIJJ(Integer.valueOf(this.LJLL), "not_answered_question_cnt");
            LIZ.LJIJJ(Integer.valueOf(i3), "question_cnt");
            LIZ.LJIJJ(obj, "qa_list_enter_from");
            if (this.LJLLI) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            LIZ.LJIJJ(str, "is_qa_list_end");
            LIZ.LJJIIJZLJL();
        }
        DataChannel dataChannel2 = this.LJLIL;
        if (dataChannel2 != null && (iMessageManager2 = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
            iMessageManager2.removeMessageListener(vl());
        }
        DataChannel dataChannel3 = this.LJLIL;
        if (dataChannel3 != null && (iMessageManager = (IMessageManager) dataChannel3.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
        wl().LJLJJL.removeObservers(this);
    }

    public final void xl() {
        QuestionViewModel wl = wl();
        wl.getClass();
        C19050ov c19050ov = new C19050ov(wl.LJZL, wl.LL);
        c19050ov.LIZLLL = C28O.LJLJJI;
        LiveData<AbstractC19190p9<QuestionEx>> LIZ = c19050ov.LIZ();
        wl.LJZ = LIZ;
        LIZ.observe(this, new AObserverS73S0100000_5(this, 32));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if ((iMessage instanceof QuestionMessage) && C29306Beo.LJIIJ(this.LJLIL)) {
            this.LJLLL = true;
        }
    }
}
