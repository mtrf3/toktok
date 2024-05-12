package com.bytedance.android.livesdk.watch;

import X.B53;
import X.B83;
import X.BM1;
import X.BZI;
import X.C0A2;
import X.C15380j0;
import X.C16880lQ;
import X.C1EW;
import X.C28507BGt;
import X.C28703BOh;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29401Dk;
import X.C30868C9o;
import X.C47121t6;
import X.C5H3;
import X.C65814PsI;
import X.C78996UzQ;
import X.C79004UzY;
import X.C81185Vtd;
import X.CH1;
import X.HandlerC28345BAn;
import X.InterfaceC28344BAm;
import X.InterfaceC28707BOl;
import Y.AfS36S0101000_5;
import Y.AfS57S0100000_5;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Answer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import com.bytedance.android.livesdkapi.depend.model.live.debug.SubmitResponse;
import com.google.gson.g;
import com.google.gson.m;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DetectReportDialog extends LiveDialogFragment implements View.OnClickListener, InterfaceC28344BAm, InterfaceC28707BOl {
    public LiveIconView LJLIL;
    public C47121t6 LJLILLLLZI;
    public RecyclerView LJLJI;
    public C28703BOh LJLJJI;
    public List<Question> LJLJJL;
    public CoverImageModel LJLJJLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final HashMap<Long, Answer> LJLJL = new HashMap<>();
    public long LJLJLJ = -1;
    public final C5H3 LJLJLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 272));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.dds);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    public final boolean vl() {
        CoverImageModel coverImageModel;
        CoverImageModel coverImageModel2;
        if (!this.LJLJL.isEmpty() && (coverImageModel = this.LJLJJLL) != null) {
            List<String> list = null;
            if (!TextUtils.isEmpty(coverImageModel.uri) && (coverImageModel2 = this.LJLJJLL) != null && coverImageModel2.urlList != null) {
                if (coverImageModel2 != null) {
                    list = coverImageModel2.urlList;
                }
                if (!C79004UzY.LJJIFFI(list)) {
                    List<Question> list2 = this.LJLJJL;
                    if (list2 != null) {
                        for (Question question : list2) {
                            if (question.getRequired()) {
                                Answer answer = this.LJLJL.get(Long.valueOf(question.getQuestionId()));
                                if (answer != null && !answer.getAnswers().isEmpty() && !C79004UzY.LJJIFFI(answer.getAnswers())) {
                                    Iterator<String> it = answer.getAnswers().iterator();
                                    while (it.hasNext()) {
                                        if (TextUtils.isEmpty(it.next())) {
                                        }
                                    }
                                }
                                return false;
                            }
                        }
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC28707BOl
    public final void eg() {
        if (vl()) {
            C47121t6 c47121t6 = this.LJLILLLLZI;
            if (c47121t6 != null) {
                c47121t6.setEnabled(true);
                C47121t6 c47121t62 = this.LJLILLLLZI;
                if (c47121t62 != null) {
                    c47121t62.setTextColor(C15380j0.LIZIZ(R.color.abc));
                    C47121t6 c47121t63 = this.LJLILLLLZI;
                    if (c47121t63 != null) {
                        c47121t63.setBackgroundResource(R.drawable.chj);
                        return;
                    } else {
                        o.LJIJI("dialogSubmit");
                        throw null;
                    }
                }
                o.LJIJI("dialogSubmit");
                throw null;
            }
            o.LJIJI("dialogSubmit");
            throw null;
        }
        C47121t6 c47121t64 = this.LJLILLLLZI;
        if (c47121t64 != null) {
            c47121t64.setEnabled(false);
            C47121t6 c47121t65 = this.LJLILLLLZI;
            if (c47121t65 != null) {
                c47121t65.setTextColor(C15380j0.LIZIZ(R.color.a7e));
                C47121t6 c47121t66 = this.LJLILLLLZI;
                if (c47121t66 != null) {
                    c47121t66.setBackgroundResource(R.drawable.cqa);
                    return;
                } else {
                    o.LJIJI("dialogSubmit");
                    throw null;
                }
            }
            o.LJIJI("dialogSubmit");
            throw null;
        }
        o.LJIJI("dialogSubmit");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (isShowing()) {
            dismiss();
        }
        this.LJLJJLL = null;
        this.LJLJL.clear();
        ((Handler) this.LJLJLLL.getValue()).removeCallbacksAndMessages(null);
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        Integer valueOf;
        Object obj;
        if (message == null || (valueOf = Integer.valueOf(message.what)) == null || valueOf.intValue() != 49 || (obj = message.obj) == null) {
            return;
        }
        if (obj instanceof CH1) {
            C29401Dk c29401Dk = (C29401Dk) obj;
            if (!TextUtils.isEmpty(c29401Dk.getPrompt())) {
                C30868C9o.LJI(c29401Dk.getPrompt());
                return;
            }
        } else if ((obj instanceof SubmitResponse) && ((SubmitResponse) obj).getSuccess()) {
            C30868C9o.LJI("Submit success");
            dismiss();
            return;
        }
        C30868C9o.LJI("Submit fail,Please try again later");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        CoverImageModel coverImageModel;
        String str;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.c_a) {
            dismiss();
            return;
        }
        if (valueOf.intValue() != R.id.m56) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_submit_detection");
        LIZ.LJIJJ(Long.valueOf(B53.LIZIZ), "detection_user_id");
        if (this.LJLJLJ <= 0) {
            this.LJLJLJ = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        }
        LIZ.LJIJJ(Long.valueOf(this.LJLJLJ), "user_id");
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
        if (!vl() || (coverImageModel = this.LJLJJLL) == null || (str = coverImageModel.uri) == null || str.length() <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        HandlerC28345BAn handlerC28345BAn = (HandlerC28345BAn) this.LJLJLLL.getValue();
        if (this.LJLJLJ <= 0) {
            this.LJLJLJ = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        }
        long j = this.LJLJLJ;
        long j2 = BM1.LJ;
        long j3 = BM1.LIZLLL;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        m mVar = new m();
        mVar.LJJIIJ("detector_user_id", Long.valueOf(j));
        mVar.LJJIIJ("anchor_id", Long.valueOf(j2));
        mVar.LJJIIJ("room_id", Long.valueOf(j3));
        mVar.LJJIIJ("report_time", Long.valueOf(currentTimeMillis));
        mVar.LJJIIZ("screenshot_url", str);
        g gVar = new g();
        for (Map.Entry<Long, Answer> entry : this.LJLJL.entrySet()) {
            m mVar2 = new m();
            mVar2.LJJIIJ("question_id", Long.valueOf(entry.getValue().getQuestionId()));
            g gVar2 = new g();
            Iterator<String> it = entry.getValue().getAnswers().iterator();
            while (it.hasNext()) {
                gVar2.LJJIIJ(it.next());
            }
            mVar2.LJJII("answers", gVar2);
            gVar.LJJII(mVar2);
        }
        mVar.LJJII("answers", gVar);
        C65814PsI.LIZ().getClass();
        C1EW.LIZ(((RoomRetrofitApi) C65814PsI.LIZJ(RoomRetrofitApi.class)).submitDetect(mVar)).LJJJLIIL(new AfS57S0100000_5(handlerC28345BAn, 186), new AfS36S0101000_5(1, handlerC28345BAn, 43));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        if (isShowing()) {
            dismiss();
        }
        this.LJLJJLL = null;
        this.LJLJL.clear();
        ((Handler) this.LJLJLLL.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.c_a);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.dialog_icon_close)");
        this.LJLIL = (LiveIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.m56);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_detection_submit)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.c4s);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.dectet_recycleview)");
        this.LJLJI = (RecyclerView) findViewById3;
        LiveIconView liveIconView = this.LJLIL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, this);
            C47121t6 c47121t6 = this.LJLILLLLZI;
            if (c47121t6 != null) {
                C16880lQ.LJJIIZ(c47121t6, this);
                this.LJLJJI = new C28703BOh();
                RecyclerView recyclerView = this.LJLJI;
                if (recyclerView != null) {
                    getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                    C28703BOh c28703BOh = this.LJLJJI;
                    if (c28703BOh != null) {
                        List<Question> list = this.LJLJJL;
                        CoverImageModel coverImageModel = this.LJLJJLL;
                        c28703BOh.LJLIL = list;
                        c28703BOh.LJLJI = coverImageModel;
                        c28703BOh.notifyDataSetChanged();
                    }
                    C28703BOh c28703BOh2 = this.LJLJJI;
                    if (c28703BOh2 != null) {
                        HashMap<Long, Answer> answers = this.LJLJL;
                        o.LJIIIZ(answers, "answers");
                        c28703BOh2.LJLJJI = answers;
                    }
                    RecyclerView recyclerView2 = this.LJLJI;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(this.LJLJJI);
                        RecyclerView recyclerView3 = this.LJLJI;
                        if (recyclerView3 != null) {
                            ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
                            layoutParams.height = (int) (C81185Vtd.LIZIZ() * 0.75d);
                            RecyclerView recyclerView4 = this.LJLJI;
                            if (recyclerView4 != null) {
                                recyclerView4.setLayoutParams(layoutParams);
                                C28703BOh c28703BOh3 = this.LJLJJI;
                                if (c28703BOh3 != null) {
                                    c28703BOh3.LJLJJL = this;
                                }
                                RecyclerView recyclerView5 = this.LJLJI;
                                if (recyclerView5 != null) {
                                    recyclerView5.LJLI(0);
                                    RecyclerView recyclerView6 = this.LJLJI;
                                    if (recyclerView6 != null) {
                                        C0A2 layoutManager = recyclerView6.getLayoutManager();
                                        if (layoutManager != null) {
                                            layoutManager.LJZL(0);
                                            return;
                                        }
                                        return;
                                    }
                                    o.LJIJI("recyclerView");
                                    throw null;
                                }
                                o.LJIJI("recyclerView");
                                throw null;
                            }
                            o.LJIJI("recyclerView");
                            throw null;
                        }
                        o.LJIJI("recyclerView");
                        throw null;
                    }
                    o.LJIJI("recyclerView");
                    throw null;
                }
                o.LJIJI("recyclerView");
                throw null;
            }
            o.LJIJI("dialogSubmit");
            throw null;
        }
        o.LJIJI("dialogClose");
        throw null;
    }
}
