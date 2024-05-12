package X;

import Y.ACListenerS25S0100000_5;
import Y.IDcS170S0100000_5;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.QAQuickEntranceSetting;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.model.message.QuestionDeleteMessage;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdk.qa.SuggestedQuestionViewModel;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BV8 extends AbstractC42141l4<QuestionEx> implements OnMessageListener {
    public final DataChannel LJZ;
    public final Room LJZI;
    public int LJZL;

    @Override // X.AbstractC42141l4
    public final int LL(Object obj) {
        QuestionEx data = (QuestionEx) obj;
        o.LJIIIZ(data, "data");
        return data.question.answerStatus;
    }

    @Override // X.AbstractC42141l4
    public final void LLFF(RecyclerView.ViewHolder viewHolder) {
        AbstractC42141l4.LLIIII(viewHolder);
        if (viewHolder instanceof BVC) {
            ((BVC) viewHolder).L();
        }
    }

    @Override // X.AbstractC42141l4
    public final RecyclerView.ViewHolder LLIFFJFJJ(ViewGroup viewGroup) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.dhv, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return new BVC(this, view, context);
    }

    public final void LLIIJLIL(long j) {
        Iterator it = ((ArrayList) C28874BUw.LJ).iterator();
        while (it.hasNext()) {
            if (((QuestionEx) it.next()).question.questionId == j) {
                LLIIJI(j, -1L);
                return;
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof QuestionDeleteMessage) {
            LLIIJLIL(((QuestionDeleteMessage) iMessage).questionId);
        }
    }

    @Override // X.AbstractC42141l4, X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof C28877BUz) {
            ((C28877BUz) holder).LJLILLLLZI.LIZLLL();
        }
    }

    public static final void LLIIIZ(Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (C1I.LIZJ) {
            C47071t1 c47071t1 = new C47071t1(context);
            c47071t1.LJIILL = true;
            c47071t1.LJIILLIIL(R.string.msd);
            c47071t1.LJFF(R.string.msc);
            c47071t1.LJIIIZ(R.string.msa, new IDcS170S0100000_5(interfaceC65784Pro, 35));
            c47071t1.LJIIJJI(R.string.msb);
            LiveDialog LIZ = c47071t1.LIZ();
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-4893863405263284206")).LIZ) {
                return;
            }
            LIZ.show();
            return;
        }
        interfaceC65784Pro.invoke();
    }

    @Override // X.AbstractC42141l4
    public final RecyclerView.ViewHolder LJZI(int i, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        switch (i) {
            case -1091576149:
                View LIZ = C28289B8j.LIZ(parent, R.layout.dht, parent, false);
                PagingViewModel<T> viewModel = this.LJLILLLLZI;
                o.LJIIIIZZ(viewModel, "viewModel");
                return new BVE(LIZ, viewModel);
            case -1091576148:
                View view = C28289B8j.LIZ(parent, R.layout.d24, parent, false);
                o.LJIIIIZZ(view, "view");
                PagingViewModel<T> viewModel2 = this.LJLILLLLZI;
                o.LJIIIIZZ(viewModel2, "viewModel");
                return new BVB(view, viewModel2);
            default:
                return super.LJZI(i, parent);
        }
    }

    @Override // X.AbstractC42141l4
    public final void LLFII(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof BVC) {
            ((BVC) viewHolder).L();
        }
        super.LLFII(viewHolder, i);
    }

    @Override // X.AbstractC42141l4
    public final void LLFZ(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        boolean z2;
        QuestionEx item = getItem(i);
        if (item != null && (viewHolder instanceof C28877BUz)) {
            C28877BUz c28877BUz = (C28877BUz) viewHolder;
            c28877BUz.getClass();
            Question question = item.question;
            c28877BUz.LJLJI = question;
            QuestionEx questionEx = new QuestionEx(question, item.likeCount, item.selfLikeStatus, false, false, false, 0L, 0, 0, 504, null);
            questionEx.LJLILLLLZI = true;
            C29306Beo.LJI(c28877BUz.itemView.findViewById(R.id.frc));
            C29306Beo.LJI(c28877BUz.itemView.findViewById(R.id.c10));
            C29306Beo.LJI(c28877BUz.itemView.findViewById(R.id.gm2));
            if (c28877BUz.LJLJJI.LJZL == i) {
                View bind$lambda$0 = c28877BUz.itemView;
                if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                    o.LJIIIIZZ(bind$lambda$0, "bind$lambda$0");
                    C87277YNd.LJJIII(R.drawable.d_f, bind$lambda$0);
                } else {
                    bind$lambda$0.setBackgroundResource(R.drawable.d_f);
                }
            } else {
                View bind$lambda$1 = c28877BUz.itemView;
                if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                    o.LJIIIIZZ(bind$lambda$1, "bind$lambda$1");
                    C87277YNd.LJJIII(R.drawable.d_g, bind$lambda$1);
                } else {
                    bind$lambda$1.setBackgroundResource(R.drawable.d_g);
                }
            }
            C16880lQ.LJIIJ(new BVU(c28877BUz.LJLJJI, c28877BUz, questionEx, i), c28877BUz.itemView);
            TextView textView = (TextView) c28877BUz.itemView.findViewById(R.id.ijp);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = C15380j0.LIZ(12.0f);
            textView.setLayoutParams(marginLayoutParams);
            Question question2 = c28877BUz.LJLJI;
            if (question2 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(question2.content);
                int length = spannableStringBuilder.length();
                TextView textView2 = (TextView) c28877BUz.itemView.findViewById(R.id.h1d);
                Question question3 = c28877BUz.LJLJI;
                if (question3 != null) {
                    textView2.setText(C05170If.LIZ(question3.user));
                    ImageView imageView = (ImageView) c28877BUz.itemView.findViewById(R.id.a9p);
                    C23010vJ.LIZJ(textView.getContext(), spannableStringBuilder, 0, length, 33, 3, 600);
                    Question question4 = c28877BUz.LJLJI;
                    if (question4 != null) {
                        if (question4.answerStatus == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(C259910h.LIZIZ(R.attr.bnt, textView.getContext())), 0, length, 33);
                            imageView.setAlpha(0.5f);
                            textView2.setTextColor(C259910h.LIZIZ(R.attr.bnt, textView.getContext()));
                        } else {
                            imageView.setAlpha(1.0f);
                            textView2.setTextColor(C259910h.LIZIZ(R.attr.bnz, textView.getContext()));
                        }
                        textView2.setTextColor(C259910h.LIZIZ(R.attr.bnz, textView.getContext()));
                        C16880lQ.LJIJI(textView2, new ACListenerS25S0100000_5(c28877BUz, 339));
                        C16880lQ.LJIILLIIL(imageView, new ACListenerS25S0100000_5(c28877BUz, 340));
                        Question question5 = c28877BUz.LJLJI;
                        if (question5 != null) {
                            User user = question5.user;
                            if (user != null && user.getAvatarThumb() != null) {
                                Question question6 = c28877BUz.LJLJI;
                                if (question6 != null) {
                                    C31665Cbl.LJIIJ(imageView, question6.user.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), R.drawable.d65);
                                } else {
                                    o.LJIJI("question");
                                    throw null;
                                }
                            } else {
                                C15640jQ.LJIIJ(imageView, R.drawable.d65, imageView.getWidth(), imageView.getHeight());
                            }
                            textView.setText(spannableStringBuilder);
                            if (CCJ.LIZ(c28877BUz.LJLIL)) {
                                textView.setTextDirection(4);
                            } else {
                                textView.setTextDirection(3);
                            }
                            Question question7 = c28877BUz.LJLJI;
                            if (question7 != null) {
                                int i2 = question7.answerStatus;
                                if (i2 == 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    c28877BUz.itemView.findViewById(R.id.c10).setVisibility(0);
                                    c28877BUz.itemView.findViewById(R.id.ik2).setVisibility(0);
                                    c28877BUz.itemView.findViewById(R.id.a6i).setVisibility(8);
                                    return;
                                } else if (i2 == 1) {
                                    c28877BUz.itemView.findViewById(R.id.c10).setVisibility(8);
                                    c28877BUz.itemView.findViewById(R.id.ik2).setVisibility(0);
                                    c28877BUz.itemView.findViewById(R.id.a6i).setVisibility(0);
                                    return;
                                } else {
                                    c28877BUz.itemView.findViewById(R.id.c10).setVisibility(8);
                                    c28877BUz.itemView.findViewById(R.id.ik2).setVisibility(8);
                                    c28877BUz.itemView.findViewById(R.id.a6i).setVisibility(8);
                                    return;
                                }
                            }
                            o.LJIJI("question");
                            throw null;
                        }
                        o.LJIJI("question");
                        throw null;
                    }
                    o.LJIJI("question");
                    throw null;
                }
                o.LJIJI("question");
                throw null;
            }
            o.LJIJI("question");
            throw null;
        }
    }

    @Override // X.AbstractC42141l4
    public final RecyclerView.ViewHolder LLII(int i, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        if (i != 12) {
            if (i != 13) {
                View LIZIZ = C1FL.LIZIZ(parent, R.layout.dhu, parent, false, "from(parent.context)\n   …iewholder, parent, false)");
                Context context = parent.getContext();
                o.LJIIIIZZ(context, "parent.context");
                return new C28877BUz(this, LIZIZ, context);
            }
            return new BVL(C1FL.LIZIZ(parent, R.layout.dhw, parent, false, "from(parent.context)\n   …iewholder, parent, false)"));
        }
        View LIZIZ2 = C1FL.LIZIZ(parent, R.layout.dhx, parent, false, "from(parent.context)\n   …iewholder, parent, false)");
        Context context2 = parent.getContext();
        o.LJIIIIZZ(context2, "parent.context");
        return new C28875BUx(this, LIZIZ2, context2);
    }

    public final void LLIIJI(long j, long j2) {
        boolean z;
        Room LJIILL;
        InteractionQuestionInfo interactionQuestionInfo;
        AbstractC19190p9 abstractC19190p9;
        User user;
        UserAttr userAttr;
        RxViewModel rxViewModel = this.LJLILLLLZI;
        o.LJII(rxViewModel, "null cannot be cast to non-null type com.bytedance.android.livesdk.qa.SuggestedQuestionViewModel");
        SuggestedQuestionViewModel suggestedQuestionViewModel = (SuggestedQuestionViewModel) rxViewModel;
        DataChannel dataChannel = this.LJZ;
        boolean z2 = false;
        if (dataChannel != null && (user = (User) dataChannel.kv0(RoomUserChannel.class)) != null && (userAttr = user.getUserAttr()) != null) {
            z = userAttr.isAdmin;
        } else {
            z = false;
        }
        if (QAQuickEntranceSetting.INSTANCE.enable()) {
            suggestedQuestionViewModel.iv0(z, this.LJZ, false);
        } else {
            DataChannel dataChannel2 = this.LJZ;
            if (C1DH.LJJIIJZLJL(dataChannel2) && (LJIILL = C1DH.LJIILL(dataChannel2)) != null && (interactionQuestionInfo = LJIILL.interactionQuestion) != null && interactionQuestionInfo.hasQuickAnswer) {
                z2 = true;
            }
            suggestedQuestionViewModel.iv0(z, dataChannel2, z2);
        }
        C18960om<T> c18960om = this.LJLIL;
        AbstractC19190p9 abstractC19190p92 = c18960om.LJI;
        if (abstractC19190p92 == null) {
            abstractC19190p92 = c18960om.LJFF;
        }
        ArrayList arrayList = new ArrayList();
        o.LJI(abstractC19190p92);
        Iterator<T> it = abstractC19190p92.iterator();
        while (it.hasNext()) {
            QuestionEx questionEx = (QuestionEx) it.next();
            Question question = questionEx.question;
            if (question.questionId != j && question.user.getId() != j2) {
                arrayList.add(questionEx);
            }
        }
        if (arrayList.isEmpty()) {
            C28874BUw.LIZ();
        }
        C28882BVe c28882BVe = suggestedQuestionViewModel.LJZL;
        if (c28882BVe != null) {
            C19180p8 c19180p8 = abstractC19190p92.LJLJJI;
            o.LJIIIIZZ(c19180p8, "curList.config");
            c28882BVe.LJIIL = true;
            C19150p5 c19150p5 = new C19150p5(c28882BVe, c19180p8);
            c19150p5.LIZLLL = C28O.LJLJJI;
            c19150p5.LIZJ = C28O.LJLJI;
            abstractC19190p9 = c19150p5.LIZ();
        } else {
            abstractC19190p9 = null;
        }
        LJLLLLLL(abstractC19190p9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BV8(Room room, DataChannel dataChannel, String subList) {
        super(BVT.LIZ);
        o.LJIIIZ(subList, "subList");
        this.LJZ = dataChannel;
        this.LJZI = room;
        this.LJZL = -1;
    }
}
