package X;

import Y.ACListenerS25S0100000_5;
import Y.AUListenerS94S0100000_5;
import Y.IDCListenerS298S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usercard.IUserCardService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveLongPressCommentAvatarSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.google.gson.internal.h;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CSD extends CSX<CQK<? extends CR6>> {
    public final TextView LJLJLLL;
    public final C74073T5h LJLL;
    public final C31470CWs LJLLI;
    public final C31470CWs LJLLILLLL;
    public final C47061t0 LJLLJ;
    public final C47171tB LJLLL;
    public final C81026Vr4 LJLLLL;
    public final SpannableStringBuilder LJLLLLLL;
    public final C13670gF LJLZ;
    public final Drawable LJZ;
    public final C1Q4 LJZI;
    public final C1Q4 LJZL;
    public final C32207CkV LL;
    public C32206CkU LLD;
    public CR6 LLF;
    public ValueAnimator LLFF;
    public ValueAnimator LLFFF;
    public boolean LLFII;
    public final HashSet<String> LLFZ;
    public SpannableStringBuilder LLI;
    public SpannableStringBuilder LLIFFJFJJ;
    public final char LLII;
    public final char LLIIII;

    @Override // X.CSF
    public final void LJJJJIZL() {
        Animatable animatable;
        Object obj = this.LJZ;
        if ((obj instanceof Animatable) && (animatable = (Animatable) obj) != null) {
            animatable.stop();
        }
    }

    @Override // X.CSF
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        this.LLFII = false;
    }

    @Override // X.CSF
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        this.LJLLL.setVisibility(8);
        ValueAnimator valueAnimator = this.LLFF;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLFFF;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSD(View itemView) {
        super(itemView);
        C018905p c018905p;
        C018905p c018905p2;
        int i;
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.name)");
        TextView textView = (TextView) findViewById;
        this.LJLJLLL = textView;
        View findViewById2 = itemView.findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.content)");
        C74073T5h c74073T5h = (C74073T5h) findViewById2;
        this.LJLL = c74073T5h;
        C31470CWs c31470CWs = (C31470CWs) itemView.findViewById(R.id.ag1);
        this.LJLLI = c31470CWs;
        C31470CWs c31470CWs2 = (C31470CWs) itemView.findViewById(R.id.ag2);
        this.LJLLILLLL = c31470CWs2;
        View findViewById3 = itemView.findViewById(R.id.ghf);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.message_avatar)");
        C47061t0 c47061t0 = (C47061t0) findViewById3;
        this.LJLLJ = c47061t0;
        View findViewById4 = itemView.findViewById(R.id.af5);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.background)");
        this.LJLLL = (C47171tB) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.gvy);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.name_badge_layout)");
        C81026Vr4 c81026Vr4 = (C81026Vr4) findViewById5;
        this.LJLLLL = c81026Vr4;
        this.LJLLLLLL = new SpannableStringBuilder();
        C13670gF LIZJ = C13670gF.LIZJ();
        o.LJIIIIZZ(LIZJ, "getInstance()");
        this.LJLZ = LIZJ;
        this.LLFZ = new HashSet<>();
        this.LLI = new SpannableStringBuilder();
        this.LLIFFJFJJ = new SpannableStringBuilder();
        this.LLII = (char) 8207;
        this.LLIIII = (char) 8206;
        c47061t0.getHierarchy().LJIILLIIL(0);
        C6H.LIZ(new ACListenerS25S0100000_5(this, 386), c47061t0);
        if (LiveLongPressCommentAvatarSetting.INSTANCE.getEnableLongPress()) {
            c47061t0.setOnLongClickListener(new IDCListenerS298S0100000_5(this, 12));
        }
        Drawable drawable = null;
        if (!this.LJLJJL) {
            textView.setOnLongClickListener(new IDCListenerS298S0100000_5(this, 10));
            C6H.LIZ(new ACListenerS25S0100000_5(this, 385), textView);
            C31308CQm c31308CQm = new C31308CQm(this);
            if (c31470CWs != null) {
                c31470CWs.setOnBadgeClickListener(c31308CQm);
            }
            if (c31470CWs2 != null) {
                c31470CWs2.setOnBadgeClickListener(c31308CQm);
            }
        } else {
            itemView.setMinimumHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
            C29306Beo.LJJJJJL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), c74073T5h);
            c74073T5h.setIncludeFontPadding(false);
            ViewGroup.LayoutParams layoutParams = c74073T5h.getLayoutParams();
            if (layoutParams instanceof C018905p) {
                c018905p = (C018905p) layoutParams;
            } else {
                c018905p = null;
            }
            if (c018905p != null) {
                c018905p.goneTopMargin = C7MY.LIZIZ(2);
                c74073T5h.setLayoutParams(c018905p);
            }
            ViewGroup.LayoutParams layoutParams2 = c74073T5h.getLayoutParams();
            if ((layoutParams2 instanceof C018905p) && (c018905p2 = (C018905p) layoutParams2) != null) {
                c018905p2.topToTop = R.id.fg4;
                int i2 = this.LJLJJLL;
                if (i2 > 2) {
                    i = i2 - 2;
                } else {
                    i = 0;
                }
                ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = C7MY.LIZIZ(i);
                c74073T5h.setLayoutParams(c018905p2);
            }
            C29306Beo.LJJLIIIJILLIZJL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(this.LJLJJLL))), c47061t0);
            c81026Vr4.setVisibility(8);
            c74073T5h.setSpaceExplore(this.LJLJJL);
        }
        c74073T5h.setHighlightColor(c74073T5h.getResources().getColor(R.color.yi));
        c74073T5h.setOnLongClickListener(new IDCListenerS298S0100000_5(this, 11));
        Drawable LIZ = C20110qd.LIZ(itemView.getContext(), R.drawable.c_q);
        if (LIZ != null) {
            LIZ.setBounds(0, 0, C15380j0.LIZ(14.0f), C15380j0.LIZ(10.0f));
            LIZ.setCallback(c74073T5h);
            drawable = LIZ;
        }
        this.LJZ = drawable;
        c74073T5h.setVerifiedDrawable(drawable);
        this.LL = new C32207CkV(drawable);
        C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.as1, itemView.getContext());
        this.LJZI = LIZLLL;
        if (LIZLLL != null) {
            LIZLLL.setTint(C259910h.LIZIZ(R.attr.bmu, itemView.getContext()));
        }
        C1Q4 LIZLLL2 = C259910h.LIZLLL(R.attr.atf, itemView.getContext());
        if (LIZLLL2 != null) {
            LIZLLL2.setTint(C15380j0.LIZIZ(R.color.bd));
        }
        this.LJZL = LIZLLL2;
    }

    public final C32207CkV P(CQQ cqq) {
        float f;
        C1Q4 c1q4 = this.LJZL;
        if (c1q4 != null) {
            float f2 = 12.0f;
            if (cqq.LJIIZILJ) {
                f = 24.0f;
            } else {
                f = 12.0f;
            }
            int LIZ = C15380j0.LIZ(f);
            if (cqq.LJIIZILJ) {
                f2 = 24.0f;
            }
            c1q4.setBounds(0, 0, LIZ, C15380j0.LIZ(f2));
        }
        C1Q4 c1q42 = this.LJZL;
        if (c1q42 != null) {
            return new C32207CkV(c1q42);
        }
        return null;
    }

    public final void Q(CQQ cqq) {
        C32206CkU c32206CkU;
        int i;
        int i2;
        C1Q4 c1q4 = this.LJZI;
        if (c1q4 != null) {
            if (cqq.LJIIZILJ) {
                i = 24;
            } else {
                i = 12;
            }
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(i));
            if (cqq.LJIIZILJ) {
                i2 = 24;
            } else {
                i2 = 12;
            }
            c1q4.setBounds(0, 0, LJJIIZ, O6R.LJJIIZ(C32151Nz.LJIIZILJ(i2)));
        }
        C1Q4 c1q42 = this.LJZI;
        if (c1q42 != null) {
            c32206CkU = new C32206CkU(c1q42);
            c32206CkU.LJLJJI = C15380j0.LJFF(R.dimen.aft);
        } else {
            c32206CkU = null;
        }
        this.LLD = c32206CkU;
    }

    public final void T(boolean z) {
        CQQ cqq;
        C31304CQi LJJLJLI;
        CQK cqk = this.LJLJI;
        Boolean bool = null;
        if (cqk != null && cqk.LJJJJZI() != null && !this.LLFII) {
            CQK cqk2 = this.LJLJI;
            if (cqk2 != null && (LJJLJLI = cqk2.LJJLJLI()) != null) {
                bool = Boolean.valueOf(LJJLJLI.LIZ);
            }
            if (C29306Beo.LJJIFFI(bool)) {
                return;
            }
            this.LLFII = true;
            CQK cqk3 = this.LJLJI;
            if (cqk3 != null) {
                cqk3.LLIIIILZ(z);
            }
            if (this.LJLILLLLZI == null || !(!CUE.LIZ)) {
                return;
            }
            this.LJLLL.setVisibility(0);
            this.LJLLL.setAlpha(0.0f);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f, 1.0f, 0.0f).setDuration(1000L);
            duration.addUpdateListener(new AUListenerS94S0100000_5(this, 61));
            duration.start();
            this.LLFF = duration;
            ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f, 1.0f, 0.0f).setDuration(1000L);
            duration2.addUpdateListener(new AUListenerS94S0100000_5(this, 62));
            duration2.setStartDelay(2000L);
            duration2.start();
            this.LLFFF = duration2;
            if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_highlight_message_show") || (cqq = this.LJLILLLLZI) == null) {
                return;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_highlight_message_show");
            LIZ.LJIILLIIL(cqq.LJIIIIZZ);
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // X.CSF
    public final void L(CQQ cqq, CRD model) {
        o.LJIIIZ(model, "model");
    }

    public final void N(CQQ cqq, CQK<? extends CR6> cqk) {
        List arrayList;
        List arrayList2;
        C31646CbS c31646CbS;
        C31646CbS c31646CbS2;
        Collection<AbstractC31462CWk<? extends AbstractC31467CWp>> LLFFF = cqk.LLFFF();
        C31472CWu c31472CWu = cqk.LJJI;
        if (c31472CWu == null || (arrayList = c31472CWu.LJ) == null) {
            arrayList = new ArrayList();
        }
        if (!this.LJLJJL) {
            if (LLFFF.isEmpty()) {
                this.LJLLI.setVisibility(8);
            } else {
                this.LJLLI.setVisibility(0);
            }
            this.LJLLI.setBadges(C65777Prh.LIZIZ(LLFFF));
            if (arrayList.isEmpty()) {
                this.LJLLILLLL.setVisibility(8);
            } else {
                this.LJLLILLLL.setVisibility(0);
            }
            this.LJLLILLLL.setBadges(C65777Prh.LIZIZ(arrayList));
            return;
        }
        this.LLI.clear();
        this.LLIFFJFJJ.clear();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        for (AbstractC31462CWk<? extends AbstractC31467CWp> abstractC31462CWk : cqk.LLFFF()) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC31462CWk<? extends AbstractC31467CWp> abstractC31462CWk2 = abstractC31462CWk;
                AbstractC31467CWp LIZIZ = abstractC31462CWk2.LIZIZ();
                if ((LIZIZ instanceof C31646CbS) && (c31646CbS2 = (C31646CbS) LIZIZ) != null) {
                    c31646CbS2.LJJ = 0;
                    c31646CbS2.LJJI = 0;
                }
                if (cqq.LJIIZILJ) {
                    abstractC31462CWk2.LIZIZ().LIZJ = C15380j0.LJFF(R.dimen.abo);
                }
                arrayList3.add(new C31464CWm(abstractC31462CWk2.LIZIZ(), cqq.LIZJ));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C31472CWu c31472CWu2 = cqk.LJJI;
        if (c31472CWu2 == null || (arrayList2 = c31472CWu2.LJ) == null) {
            arrayList2 = new ArrayList();
        }
        int i3 = 0;
        for (Object obj : arrayList2) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                AbstractC31462CWk abstractC31462CWk3 = (AbstractC31462CWk) obj;
                AbstractC31467CWp LIZIZ2 = abstractC31462CWk3.LIZIZ();
                if ((LIZIZ2 instanceof C31646CbS) && (c31646CbS = (C31646CbS) LIZIZ2) != null) {
                    c31646CbS.LJJ = 0;
                    c31646CbS.LJJI = 0;
                }
                if (cqq.LJIIZILJ) {
                    abstractC31462CWk3.LIZIZ().LIZJ = C15380j0.LJFF(R.dimen.abo);
                }
                arrayList4.add(new C31464CWm(abstractC31462CWk3.LIZIZ(), cqq.LIZJ));
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (!arrayList3.isEmpty()) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                C31465CWn c31465CWn = (C31465CWn) it.next();
                this.LLI.append((CharSequence) " ");
                this.LLI.append((CharSequence) h.LJIIIZ(c31465CWn));
            }
            SpannableStringBuilder spannableStringBuilder = this.LLI;
            h.LJ(new AqS155S0100000_5(this, 364), spannableStringBuilder, null, 46);
            this.LLI = spannableStringBuilder;
        }
        if (!(!arrayList4.isEmpty())) {
            return;
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            this.LLIFFJFJJ.append((CharSequence) h.LJIIIZ((C31465CWn) it2.next()));
            this.LLIFFJFJJ.append((CharSequence) " ");
        }
        SpannableStringBuilder spannableStringBuilder2 = this.LLIFFJFJJ;
        h.LJ(new AqS155S0100000_5(this, 364), spannableStringBuilder2, null, 46);
        this.LLIFFJFJJ = spannableStringBuilder2;
    }

    public final void U(String str, String str2) {
        User user;
        Context context;
        long j;
        String str3;
        C31303CQh c31303CQh;
        CQL cql = this.LJLJI;
        if (cql != null && (user = cql.getUser()) != null) {
            CQQ cqq = this.LJLILLLLZI;
            if (cqq != null) {
                context = cqq.LIZ;
            } else {
                context = null;
            }
            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
            if (LIZIZ != null) {
                ((IUserCardService) CN1.LIZ(IUserCardService.class)).x9(LIZIZ, user);
            }
            C73943T0h LIZ = C73943T0h.LIZ();
            UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId(), str);
            CR6 cr6 = this.LLF;
            long j2 = 0;
            if (cr6 != null) {
                j = cr6.getMessageId();
            } else {
                j = 0;
            }
            userProfileEvent.msgId = j;
            CQL cql2 = this.LJLJI;
            if (cql2 != null && (c31303CQh = cql2.LJIILLIIL) != null) {
                j2 = c31303CQh.LIZ;
            }
            userProfileEvent.releaseId = j2;
            CR6 cr62 = this.LLF;
            if (cr62 instanceof ChatMessage) {
                o.LJII(cr62, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.ChatMessage");
                str3 = ((ChatMessage) cr62).content;
            } else {
                str3 = "";
            }
            userProfileEvent.content = str3;
            userProfileEvent.mSource = "live_comment";
            userProfileEvent.clickMethod = "normal";
            userProfileEvent.mReportType = "report_message";
            userProfileEvent.mShowEntrance = "comment_area";
            userProfileEvent.mClickUserPosition = str2;
            LIZ.LIZIZ(userProfileEvent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x03ee, code lost:
    
        if (r15 == 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0100, code lost:
    
        if (r13 == 0) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [MESSAGE extends X.CR6, X.CR6] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.CSD, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.CSF] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.CRD, X.CQO, X.CQL, X.CQK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.CharSequence] */
    @Override // X.CSF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(X.CQQ r18, X.CRD r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CSD.M(X.CQQ, X.CRD, java.util.List):void");
    }
}
