package X;

import Y.ACListenerS23S0201000_5;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS31S0300000_5;
import Y.IDCListenerS298S0100000_5;
import Y.IDCSpanS31S0100000_5;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.model.message.QuestionDeleteMessage;
import com.bytedance.android.livesdk.qa.CurrentQuestionChannel;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdk.qa.QuestionViewModel;
import com.bytedance.android.livesdk.qa.ReportQuestionDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.internal.b;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BV9 extends AbstractC42141l4<QuestionEx> implements OnMessageListener {
    public boolean LJZ;
    public boolean LJZI;
    public Room LJZL;
    public final DataChannel LL;
    public final String LLD;
    public ReportQuestionDialog LLF;
    public boolean LLFF;
    public final String LLFFF;

    @Override // X.AbstractC42141l4
    public final RecyclerView.ViewHolder LJZ(ViewGroup viewGroup) {
        return new BVF(this, viewGroup.getContext(), C28289B8j.LIZ(viewGroup, R.layout.dhp, viewGroup, false));
    }

    @Override // X.AbstractC42141l4
    public final int LL(Object obj) {
        return ((QuestionEx) obj).question.answerStatus;
    }

    @Override // X.AbstractC42141l4
    public final void LLFF(RecyclerView.ViewHolder viewHolder) {
        AbstractC42141l4.LLIIII(viewHolder);
        if (viewHolder instanceof BVH) {
            BVH bvh = (BVH) viewHolder;
            if (bvh.LJLJJL.LJZ) {
                bvh.LJLILLLLZI.setText(R.string.ms7);
                bvh.LJLIL.setText(R.string.ms6);
                TextView textView = (TextView) bvh.LJLJI.findViewById(R.id.e3i);
                ViewGroup viewGroup = (ViewGroup) bvh.LJLJI.findViewById(R.id.e42);
                if (!C1DH.LJJIIJZLJL(bvh.LJLJJL.LL)) {
                    bvh.LJLJJL.LLIIIZ(bvh.LJLJJI, textView, viewGroup);
                    textView.setVisibility(0);
                    return;
                } else {
                    textView.setVisibility(8);
                    return;
                }
            }
            bvh.LJLIL.setText(R.string.l05);
        }
    }

    @Override // X.AbstractC42141l4
    public final RecyclerView.ViewHolder LLIFFJFJJ(ViewGroup viewGroup) {
        return new BVH(this, viewGroup.getContext(), C28289B8j.LIZ(viewGroup, R.layout.dhv, viewGroup, false));
    }

    public final void LLIIJLIL(long j) {
        List arrayList;
        if (this.LL.kv0(CurrentQuestionChannel.class) != null && ((QuestionEx) this.LL.kv0(CurrentQuestionChannel.class)).question.questionId == j) {
            this.LL.rv0(CurrentQuestionChannel.class, new QuestionEx());
        }
        C28881BVd c28881BVd = ((QuestionViewModel) this.LJLILLLLZI).LJZI;
        if (c28881BVd != null) {
            arrayList = c28881BVd.LJIILLIIL;
        } else {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
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
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof BVA) {
            ((BVA) viewHolder).LJLJL.LIZLLL();
        }
    }

    @Override // X.AbstractC42141l4
    public final RecyclerView.ViewHolder LJZI(int i, ViewGroup viewGroup) {
        if (i == -1091576148) {
            return new BVD(C28289B8j.LIZ(viewGroup, R.layout.d24, viewGroup, false), this.LJLILLLLZI);
        }
        if (i == -1091576149) {
            return new BVK(C28289B8j.LIZ(viewGroup, R.layout.dht, viewGroup, false), this.LJLILLLLZI);
        }
        return super.LJZI(i, viewGroup);
    }

    @Override // X.AbstractC42141l4
    public final void LLFZ(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String LJIIIIZZ;
        User user;
        int i6;
        QuestionEx item = getItem(i);
        if (viewHolder instanceof BVA) {
            BVA bva = (BVA) viewHolder;
            if (item == null) {
                bva.getClass();
                return;
            }
            BV9 bv9 = bva.LJLJLJ;
            if (bv9.LJZ && !bv9.LLFF && (item.LJLJI || item.question.answerFrom == 1)) {
                BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_invited_question_show");
                LIZ.LJIILLIIL(bva.LJLJLJ.LL);
                LIZ.LJJIIJZLJL();
                bva.LJLJLJ.LLFF = true;
            }
            bva.LJLIL = item.question;
            TextView textView = (TextView) bva.LJLJI.findViewById(R.id.h1d);
            ImageView imageView = (ImageView) bva.LJLJI.findViewById(R.id.a9p);
            TextView textView2 = (TextView) bva.LJLJI.findViewById(R.id.ijp);
            BV9 bv92 = bva.LJLJLJ;
            if (bv92.LJZ || bv92.LJZI) {
                ImageView imageView2 = (ImageView) bva.LJLJI.findViewById(R.id.gm2);
                if (bva.LJLJLJ.LJZI && bva.LJLIL.user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                    imageView2.setVisibility(8);
                } else {
                    imageView2.setVisibility(0);
                }
                C16880lQ.LJIILLIIL(imageView2, new ACListenerS23S0201000_5(0, bva, item, 7));
                Question question = bva.LJLIL;
                if (question != null && question.answerStatus == 2) {
                    if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                        C87277YNd.LJJIII(R.drawable.d_f, bva.LJLJI);
                    } else {
                        bva.LJLJI.setBackgroundResource(R.drawable.d_f);
                    }
                } else if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                    C87277YNd.LJJIII(R.drawable.d_g, bva.LJLJI);
                } else {
                    bva.LJLJI.setBackgroundResource(R.drawable.d_g);
                }
                C16880lQ.LJIIJ(new ACListenerS23S0201000_5(i, bva, item, 8), bva.LJLJI);
                if (item.LJLJI || (i3 = item.question.answerFrom) == 3 || i3 == 2 || i3 == 1) {
                    View findViewById = bva.LJLJI.findViewById(R.id.fqu);
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    ImageView imageView3 = (ImageView) bva.LJLJI.findViewById(R.id.e4u);
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                    if (bva.LJLJLJ.LJZ) {
                        bva.LJLJI.findViewById(R.id.gm2).setVisibility(8);
                        View findViewById2 = bva.LJLJI.findViewById(R.id.frc);
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(8);
                        }
                    }
                } else if (bva.LJLJLJ.LJZ) {
                    bva.LJLJI.findViewById(R.id.gm2).setVisibility(0);
                    View findViewById3 = bva.LJLJI.findViewById(R.id.frc);
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(0);
                    }
                }
                TextView textView3 = (TextView) bva.LJLJI.findViewById(R.id.frc);
                long j = (int) item.likeCount;
                textView3.setText(textView3.getContext().getResources().getQuantityString(R.plurals.ms, (int) j, ((IBarrageService) CN1.LIZ(IBarrageService.class)).j90(j)));
            } else {
                TextView textView4 = (TextView) bva.LJLJI.findViewById(R.id.fqu);
                ImageView imageView4 = (ImageView) bva.LJLJI.findViewById(R.id.e4u);
                int i7 = item.question.answerFrom;
                if (i7 == 3 || i7 == 2 || i7 == 1) {
                    textView4.setVisibility(8);
                    imageView4.setVisibility(8);
                } else {
                    long j2 = item.likeCount;
                    bva.LJLJJL = j2;
                    textView4.setText(b.LJIIL(j2));
                    if (bva.LJLJJL <= 0) {
                        i6 = 4;
                    } else {
                        i6 = 0;
                    }
                    textView4.setVisibility(i6);
                    if (item.selfLikeStatus == 1) {
                        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                            C87277YNd.LJJIII(R.drawable.d_k, imageView4);
                        } else {
                            imageView4.setBackgroundResource(R.drawable.d_k);
                        }
                        textView4.setTextColor(C259910h.LIZJ(R.attr.bnd, textView2));
                        bva.LJLJJI = Boolean.TRUE;
                    }
                    C16880lQ.LJIILLIIL(imageView4, new ACListenerS31S0300000_5(bva, imageView4, textView4, 25));
                }
                textView2.setOnLongClickListener(new IDCListenerS298S0100000_5(bva, 6));
            }
            C16880lQ.LJIJI(textView, new ACListenerS24S0101000_5(0, bva, 12));
            C16880lQ.LJIILLIIL(imageView, new ACListenerS24S0101000_5(1, bva, 5));
            textView.setText(C05170If.LIZ(bva.LJLIL.user));
            Question question2 = bva.LJLIL;
            if (question2 != null && (user = question2.user) != null && user.getAvatarThumb() != null) {
                C31665Cbl.LJIIJ(imageView, bva.LJLIL.user.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), R.drawable.d65);
            } else {
                C15640jQ.LJIIJ(imageView, R.drawable.d65, imageView.getWidth(), imageView.getHeight());
            }
            View findViewById4 = bva.LJLJI.findViewById(R.id.afl);
            User user2 = bva.LJLIL.user;
            if (user2 != null && user2.getUserAttr() != null && bva.LJLIL.user.getUserAttr().isAdmin) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            findViewById4.setVisibility(i4);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bva.LJLIL.content);
            int length = spannableStringBuilder.length();
            if (bva.LJLJLJ.LJZ && !item.LJLJI && (i5 = item.question.answerFrom) != 2 && i5 != 1 && i5 != 3) {
                long currentTimeMillis = (System.currentTimeMillis() / 1000) - bva.LJLIL.createTime;
                if (currentTimeMillis < 60) {
                    LJIIIIZZ = C15380j0.LJIILJJIL(R.string.om5);
                } else if (currentTimeMillis < 300) {
                    LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.nf, 1, 1);
                } else if (currentTimeMillis < 1800) {
                    LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.nf, 5, 5);
                } else if (currentTimeMillis < 10800) {
                    LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.nf, 30, 30);
                } else if (currentTimeMillis < 21600) {
                    LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.ne, 3, 3);
                } else {
                    LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.ne, 6, 6);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" ");
                LIZ2.append(LJIIIIZZ);
                spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ2));
                int i8 = length + 1;
                C23010vJ.LIZJ(textView2.getContext(), spannableStringBuilder, i8, spannableStringBuilder.length(), 33, 3, LiveChatShowDelayForHotLiveSetting.DEFAULT);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C259910h.LIZIZ(R.attr.bnt, textView2.getContext())), i8, spannableStringBuilder.length(), 33);
            }
            C23010vJ.LIZJ(textView2.getContext(), spannableStringBuilder, 0, length, 33, 3, 600);
            if (bva.LJLIL.answerStatus == 1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C259910h.LIZIZ(R.attr.bnt, textView2.getContext())), 0, length, 33);
                imageView.setAlpha(0.5f);
                textView.setTextColor(C259910h.LIZIZ(R.attr.bnt, textView2.getContext()));
            } else {
                textView.setTextColor(C259910h.LIZIZ(R.attr.bnz, textView2.getContext()));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C259910h.LIZIZ(R.attr.bns, textView2.getContext())), 0, length, 33);
            }
            textView2.setText(spannableStringBuilder);
            Question question3 = bva.LJLIL;
            if (question3 != null) {
                if (question3.answerStatus == 2) {
                    C15490jB.LJ(bva.LJLJI.findViewById(R.id.c17), CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "current_question.webp");
                    bva.LJLJI.findViewById(R.id.c10).setVisibility(0);
                    if (!bva.LJLJLJ.LJZ) {
                        return;
                    }
                    bva.LJLJI.findViewById(R.id.ik2).setVisibility(0);
                    bva.LJLJI.findViewById(R.id.a6i).setVisibility(8);
                    return;
                }
                if (question3.answerStatus == 1) {
                    bva.LJLJI.findViewById(R.id.c10).setVisibility(8);
                    if (!bva.LJLJLJ.LJZ) {
                        return;
                    }
                    bva.LJLJI.findViewById(R.id.ik2).setVisibility(0);
                    bva.LJLJI.findViewById(R.id.a6i).setVisibility(0);
                    return;
                }
            }
            bva.LJLJI.findViewById(R.id.c10).setVisibility(8);
            if (!bva.LJLJLJ.LJZ) {
                return;
            }
            bva.LJLJI.findViewById(R.id.ik2).setVisibility(8);
            bva.LJLJI.findViewById(R.id.a6i).setVisibility(8);
            return;
        }
        if (viewHolder instanceof BVR) {
            if (!this.LJZ && !this.LJZI && i != 0) {
                return;
            }
            ((BVR) viewHolder).LJLIL.setVisibility(8);
            return;
        }
        if (!(viewHolder instanceof BVF)) {
            return;
        }
        if ((!this.LJZ && !this.LJZI) || item.question.answerStatus == 14) {
            return;
        }
        BVF bvf = (BVF) viewHolder;
        BV9 bv93 = bvf.LJLJJL;
        QuestionViewModel questionViewModel = (QuestionViewModel) bv93.LJLILLLLZI;
        if (!C1DH.LJJIIJZLJL(bv93.LL) && bvf.LJLJJL.LJZ) {
            bvf.LJLIL.setVisibility(0);
            bvf.LJLJJI.setVisibility(8);
            bvf.LJLJJL.LLIIIZ(bvf.LJLILLLLZI, bvf.LJLIL, bvf.LJLJI);
            return;
        }
        if (bvf.LJLJJL.LJZ && ((ArrayList) questionViewModel.LJZI.LJIJ).isEmpty() && ((ArrayList) questionViewModel.LJZI.LJIIZILJ).isEmpty() && !((ArrayList) questionViewModel.LJZI.LJIJI).isEmpty()) {
            if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                ViewGroup viewGroup = bvf.LJLJI;
                C87277YNd.LJJIII(C259910h.LIZJ(R.attr.ar7, viewGroup), viewGroup);
            } else {
                bvf.LJLJI.setBackgroundResource(R.color.abc);
            }
            bvf.LJLIL.setVisibility(8);
            bvf.LJLJJI.setVisibility(0);
            return;
        }
        if (!BV1.LJIIIZ(bvf.LJLJJL.LL)) {
            if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                ViewGroup viewGroup2 = bvf.LJLJI;
                C87277YNd.LJJIII(C259910h.LIZJ(R.attr.ar7, viewGroup2), viewGroup2);
            } else {
                bvf.LJLJI.setBackgroundResource(R.color.abc);
            }
            if (bvf.LJLJJL.LJZ) {
                i2 = R.string.lvb;
            } else {
                i2 = R.string.nr9;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C15380j0.LJIILJJIL(i2));
            C23010vJ.LIZJ(bvf.LJLIL.getContext(), spannableStringBuilder2, 0, spannableStringBuilder2.length(), 33, 5, LiveChatShowDelayForHotLiveSetting.DEFAULT);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(C259910h.LIZJ(R.attr.bnz, bvf.LJLIL)), 0, spannableStringBuilder2.length(), 33);
            bvf.LJLIL.setText(spannableStringBuilder2);
            bvf.LJLIL.setVisibility(0);
            bvf.LJLJJI.setVisibility(8);
            return;
        }
        bvf.itemView.setVisibility(8);
    }

    @Override // X.AbstractC42141l4
    public final RecyclerView.ViewHolder LLII(int i, ViewGroup viewGroup) {
        View LIZ;
        if (i == 11) {
            return LJZ(viewGroup);
        }
        if (i == 14) {
            return new BVS(C28289B8j.LIZ(viewGroup, R.layout.dhq, viewGroup, false));
        }
        if (i == 12) {
            return new BVO(C28289B8j.LIZ(viewGroup, R.layout.dhw, viewGroup, false));
        }
        if (i == 13) {
            return new BVP(C28289B8j.LIZ(viewGroup, R.layout.dhw, viewGroup, false));
        }
        if (this.LJZ || this.LJZI) {
            LIZ = C28289B8j.LIZ(viewGroup, R.layout.dhu, viewGroup, false);
        } else {
            LIZ = C28289B8j.LIZ(viewGroup, R.layout.dhy, viewGroup, false);
        }
        return new BVA(this, viewGroup.getContext(), LIZ);
    }

    public final void LLIIJI(long j, long j2) {
        boolean z;
        QuestionViewModel questionViewModel = (QuestionViewModel) this.LJLILLLLZI;
        questionViewModel.iv0(this.LJZL, this.LJZ, this.LJZI, BV1.LJIIIZ(this.LL), C1DH.LJJIIJZLJL(this.LL));
        C18960om<T> c18960om = this.LJLIL;
        AbstractC19190p9 abstractC19190p9 = c18960om.LJI;
        if (abstractC19190p9 == null) {
            abstractC19190p9 = c18960om.LJFF;
        }
        if (questionViewModel.LJZI == null) {
            return;
        }
        Iterator<T> it = abstractC19190p9.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            QuestionEx questionEx = (QuestionEx) it.next();
            Question question = questionEx.question;
            if (question != null && question.questionId != j && question.user.getId() != j2) {
                ((ArrayList) questionViewModel.LJZI.LJIILLIIL).add(questionEx);
                if (questionEx.question.answerStatus == 1) {
                    ((ArrayList) questionViewModel.LJZI.LJIJ).add(questionEx);
                }
                int i = questionEx.question.answerStatus;
                if (i == 0 || i == 2) {
                    ((ArrayList) questionViewModel.LJZI.LJIIZILJ).add(questionEx);
                }
            }
        }
        if (C79004UzY.LJJIFFI(questionViewModel.LJZI.LJIJ) && C79004UzY.LJJIFFI(questionViewModel.LJZI.LJIIZILJ)) {
            List<QuestionEx> list = questionViewModel.LJZI.LJIILLIIL;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            z = false;
        }
        C28881BVd c28881BVd = questionViewModel.LJZI;
        C19180p8 config = abstractC19190p9.LJLJJI;
        c28881BVd.getClass();
        o.LJIIIZ(config, "config");
        c28881BVd.LJIL = z;
        C19150p5 c19150p5 = new C19150p5(c28881BVd, config);
        c19150p5.LIZLLL = C28O.LJLJJI;
        c19150p5.LIZJ = C28O.LJLJI;
        LJLLLLLL(c19150p5.LIZ());
    }

    public BV9(DataChannel dataChannel, String str, String str2) {
        super(new BVG());
        this.LLFF = false;
        this.LL = dataChannel;
        this.LLD = str;
        this.LLFFF = str2;
    }

    public final void LLIIIZ(Context context, TextView textView, ViewGroup viewGroup) {
        viewGroup.setBackgroundColor(C259910h.LIZIZ(R.attr.bmi, viewGroup.getContext()));
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ot1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a1.LJ(LJIILJJIL, " ", C15380j0.LJIILJJIL(R.string.ot0)));
        spannableStringBuilder.setSpan(new IDCSpanS31S0100000_5(this, 10), LJIILJJIL.length() + 1, spannableStringBuilder.length(), 33);
        C23010vJ.LIZJ(context, spannableStringBuilder, LJIILJJIL.length() + 1, spannableStringBuilder.length(), 33, 5, 600);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C259910h.LIZIZ(R.attr.bnd, textView.getContext())), LJIILJJIL.length() + 1, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
