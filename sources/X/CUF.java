package X;

import Y.ACListenerS25S0100000_5;
import Y.IDCListenerS298S0100000_5;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveLongPressCommentAvatarSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS62S0110000_5;
import kotlin.jvm.internal.o;
import uw.b;
import zw.c;

/* loaded from: classes6.dex */
public abstract class CUF<TEXT_MODEL extends b<? extends CR6>, PINNED_MODEL extends c<TEXT_MODEL>> extends CUH<TEXT_MODEL, PINNED_MODEL> {
    public final boolean LLD;
    public final TextView LLF;
    public final C47061t0 LLFF;
    public final C74074T5i LLFFF;
    public final View LLFII;
    public final Drawable LLFZ;
    public final C32207CkV LLI;
    public final C32206CkU LLIFFJFJJ;
    public boolean LLII;
    public final C62822Ol8 LLIIII;

    public abstract Drawable f0();

    public boolean h0(PINNED_MODEL pinnedPublicScreenMessageModel, List<? extends Object> payloads) {
        o.LJIIIZ(pinnedPublicScreenMessageModel, "pinnedPublicScreenMessageModel");
        o.LJIIIZ(payloads, "payloads");
        return false;
    }

    public final C31470CWs g0() {
        Object value = this.LLIIII.getValue();
        o.LJIIIIZZ(value, "<get-labelView>(...)");
        return (C31470CWs) value;
    }

    @Override // X.CUH
    public final C74074T5i V() {
        return this.LLFFF;
    }

    @Override // X.CUH
    public final View X() {
        return this.LLFII;
    }

    @Override // X.CUH
    public final void c0(PINNED_MODEL pinnedPublicScreenMessageModel) {
        o.LJIIIZ(pinnedPublicScreenMessageModel, "pinnedPublicScreenMessageModel");
        super.c0(pinnedPublicScreenMessageModel);
        if (!(pinnedPublicScreenMessageModel instanceof CSG)) {
            return;
        }
        T().LIZIZ().LJIILLIIL();
        if (pinnedPublicScreenMessageModel.LIZLLL == 1) {
            C31470CWs g0 = g0();
            ArrayList arrayList = new ArrayList();
            CSG csg = (CSG) pinnedPublicScreenMessageModel;
            if (!csg.LJIIIZ.LIZJ) {
                pinnedPublicScreenMessageModel.LJ = true;
                Y().LJI();
                arrayList.add(Y());
                CS6 cs6 = csg.LJIIIZ;
                if (cs6.LJ && cs6.LIZ() > 0) {
                    arrayList.add(P());
                    P().LJI();
                }
            } else {
                arrayList.add(Q());
                Q().LJI();
                T().LJIIIIZZ();
            }
            g0.setBadges(arrayList);
            return;
        }
        C31470CWs g02 = g0();
        ArrayList arrayList2 = new ArrayList();
        CSG csg2 = (CSG) pinnedPublicScreenMessageModel;
        CS6 cs62 = csg2.LJIIIZ;
        if (!cs62.LIZJ) {
            if (!pinnedPublicScreenMessageModel.LJ) {
                pinnedPublicScreenMessageModel.LJ = true;
                if (cs62.LJ) {
                    P().LIZIZ().LJJL = 0;
                    P().LIZIZ().LIZIZ = 0;
                    arrayList2.add(Q());
                    Q().LJIIIZ(new CUJ(pinnedPublicScreenMessageModel, this));
                } else {
                    P().LJI();
                    Y().LJI();
                    arrayList2.add(Y());
                }
            } else {
                P().LJI();
                Y().LJI();
                arrayList2.add(Y());
            }
            CS6 cs63 = csg2.LJIIIZ;
            if (cs63.LJ && cs63.LIZ() > 0) {
                arrayList2.add(P());
            }
        } else {
            arrayList2.add(Q());
            T().LJIIIIZZ();
        }
        g02.setBadges(arrayList2);
    }

    public static void i0(CUF cuf, String str) {
        User user;
        Context context;
        long j;
        String str2;
        long j2;
        CSG csg;
        CS6 cs6;
        PinMessage pinMessage;
        CSG csg2;
        CS6 cs62;
        PinMessage pinMessage2;
        MODEL model = cuf.LJLJJI;
        if (model != 0 && (user = model.getUser()) != null) {
            CQQ cqq = cuf.LJLIL;
            if (cqq != null) {
                context = cqq.LIZ;
            } else {
                context = null;
            }
            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
            if (LIZIZ != null) {
                ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).x9(LIZIZ, user);
            }
            C73943T0h LIZ = C73943T0h.LIZ();
            UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId(), str);
            CR6 cr6 = cuf.LJLJJL;
            long j3 = 0;
            if (cr6 != null) {
                j = cr6.getMessageId();
            } else {
                j = 0;
            }
            userProfileEvent.msgId = j;
            CR6 cr62 = cuf.LJLJJL;
            if (cr62 instanceof ChatMessage) {
                o.LJII(cr62, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.ChatMessage");
                str2 = ((ChatMessage) cr62).content;
            } else {
                str2 = "";
            }
            userProfileEvent.content = str2;
            userProfileEvent.clickMethod = "pin";
            userProfileEvent.mSource = "live_comment";
            userProfileEvent.mReportType = cuf.a0();
            CSG csg3 = cuf.LJLJL;
            if ((csg3 instanceof CSG) && (csg2 = csg3) != null && (cs62 = csg2.LJIIIZ) != null && (pinMessage2 = cs62.LJI) != null) {
                j2 = pinMessage2.pinId;
            } else {
                j2 = 0;
            }
            userProfileEvent.pinId = j2;
            if ((csg3 instanceof CSG) && (csg = csg3) != null && (cs6 = csg.LJIIIZ) != null && (pinMessage = cs6.LJI) != null) {
                j3 = pinMessage.getMessageId();
            }
            userProfileEvent.pinMsgId = j3;
            userProfileEvent.mShowEntrance = "comment_area";
            userProfileEvent.mClickUserPosition = null;
            LIZ.LIZIZ(userProfileEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.CQL, MODEL extends uw.c0<? extends X.CR6>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.CQL, X.CQK] */
    @Override // X.CUH, X.CUL
    public void M(PINNED_MODEL pinnedModel, List<? extends Object> payloads) {
        CharSequence LLFII;
        ImageModel LJJLJ;
        Animatable animatable;
        ?? LJJJLIIL;
        Animatable animatable2;
        Animatable animatable3;
        CQQ cqq;
        o.LJIIIZ(pinnedModel, "pinnedModel");
        o.LJIIIZ(payloads, "payloads");
        super.M(pinnedModel, payloads);
        if (h0(pinnedModel, payloads)) {
            return;
        }
        c0(pinnedModel);
        ?? r5 = (CQK) this.LJLJJI;
        if (r5 != 0) {
            CQQ cqq2 = this.LJLIL;
            if (cqq2 != null) {
                cqq2.LIZ(this.LLF);
            }
            CQQ cqq3 = this.LJLIL;
            if (cqq3 != null) {
                cqq3.LIZ(this.LLFFF);
            }
            TextView textView = this.LLF;
            if (this.LJLJLJ) {
                textView.setTextColor(this.LJLJLLL);
                LLFII = C78840Uwu.LJJIJLIJ(this.LJLL, String.valueOf(r5.LLFII()));
            } else {
                LLFII = r5.LLFII();
            }
            textView.setText(LLFII);
            boolean z = false;
            if (!this.LJLLI || ((cqq = this.LJLIL) != null && cqq.LJFF)) {
                ?? r0 = this.LJLJJI;
                if (r0 != 0 && (LJJLJ = r0.LJJLJ()) != null) {
                    C31665Cbl.LJ(LJJLJ, this.LLFF);
                } else {
                    C87277YNd.LJJIIJ(R.drawable.d2a, this.LLFF);
                }
            } else {
                this.LLFF.setVisibility(8);
            }
            String str = "";
            if (r5 instanceof CSC) {
                CSC csc = (CSC) r5;
                if (csc.LJIIZILJ()) {
                    C74074T5i c74074T5i = this.LLFFF;
                    ?? content = r5.getContent();
                    if (content != 0) {
                        str = content;
                    }
                    c74074T5i.setOriginText(str);
                    C74074T5i c74074T5i2 = this.LLFFF;
                    SpannableString spannableString = new SpannableString(" ");
                    spannableString.setSpan(this.LLI, 0, 1, 33);
                    c74074T5i2.setSuffix(spannableString);
                    this.LLFFF.setAutoExpand(!pinnedModel.LIZJ);
                    this.LLFFF.setText(new SpannableStringBuilder(this.LLFFF.getOriginText()).append(this.LLFFF.getSuffix()));
                    Object obj = this.LLFZ;
                    if ((obj instanceof Animatable) && (animatable3 = (Animatable) obj) != null) {
                        animatable3.start();
                    }
                } else {
                    Object obj2 = this.LLFZ;
                    if ((obj2 instanceof Animatable) && (animatable2 = (Animatable) obj2) != null) {
                        animatable2.stop();
                    }
                    if (csc.LJJLIIIJLLLLLLLZ()) {
                        CTZ ctz = new CTZ(r5, this);
                        if (!TextUtils.isEmpty(csc.LJJJLIIL()) && (LJJJLIIL = csc.LJJJLIIL()) != 0) {
                            str = LJJJLIIL;
                        }
                        boolean z2 = pinnedModel.LIZJ;
                        this.LLFFF.setOriginText(str);
                        if (!pinnedModel.LIZJ) {
                            this.LLFFF.setAutoExpand(true);
                        }
                        C74074T5i c74074T5i3 = this.LLFFF;
                        SpannableString spannableString2 = new SpannableString(" ");
                        spannableString2.setSpan(this.LLIFFJFJJ, 0, 1, 33);
                        spannableString2.setSpan(ctz, 0, 1, 33);
                        c74074T5i3.setSuffix(spannableString2);
                        C74074T5i c74074T5i4 = this.LLFFF;
                        StringBuilder sb = new StringBuilder(c74074T5i4.getOriginText());
                        sb.append(this.LLFFF.getSuffix());
                        c74074T5i4.setText(sb);
                        z = z2;
                    } else {
                        this.LLFFF.setSuffix("");
                        C74074T5i c74074T5i5 = this.LLFFF;
                        ?? content2 = r5.getContent();
                        if (content2 != 0) {
                            str = content2;
                        }
                        c74074T5i5.setOriginText(str);
                        C74074T5i c74074T5i6 = this.LLFFF;
                        c74074T5i6.setText(c74074T5i6.getOriginText());
                        this.LLFFF.setAutoExpand(!pinnedModel.LIZJ);
                    }
                }
            } else {
                this.LLFFF.setSuffix("");
                C74074T5i c74074T5i7 = this.LLFFF;
                ?? content3 = r5.getContent();
                if (content3 != 0) {
                    str = content3;
                }
                c74074T5i7.setOriginText(str);
                C74074T5i c74074T5i8 = this.LLFFF;
                c74074T5i8.setText(c74074T5i8.getOriginText());
                this.LLFFF.setAutoExpand(!pinnedModel.LIZJ);
                Object obj3 = this.LLFZ;
                if ((obj3 instanceof Animatable) && (animatable = (Animatable) obj3) != null) {
                    animatable.stop();
                }
            }
            if (this.LLII && !pinnedModel.LJI) {
                pinnedModel.LJI = true;
                this.LLFFF.setAutoExpand(true);
            }
            show();
            V().setMeasureListener(new AqS62S0110000_5((CUH) this, (CUH<CQO<? extends CR6>, CSH<Object>>) z, false));
        }
    }

    public CUF(View view, CQQ cqq, boolean z) {
        super(view, cqq);
        Drawable drawable;
        float f;
        this.LLD = z;
        View findViewById = view.findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.name)");
        TextView textView = (TextView) findViewById;
        this.LLF = textView;
        View findViewById2 = view.findViewById(R.id.ghf);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.message_avatar)");
        C47061t0 c47061t0 = (C47061t0) findViewById2;
        this.LLFF = c47061t0;
        View findViewById3 = view.findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.content)");
        C74074T5i c74074T5i = (C74074T5i) findViewById3;
        this.LLFFF = c74074T5i;
        View findViewById4 = view.findViewById(R.id.ffe);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.label_view)");
        this.LLFII = findViewById4;
        this.LLII = true;
        c47061t0.getHierarchy().LJIILLIIL(0);
        C6H.LIZ(new ACListenerS25S0100000_5(this, 14), c47061t0);
        if (LiveLongPressCommentAvatarSetting.INSTANCE.getEnableLongPress()) {
            c47061t0.setOnLongClickListener(new IDCListenerS298S0100000_5(this, 2));
        }
        textView.setOnLongClickListener(new IDCListenerS298S0100000_5(this, 0));
        C6H.LIZ(new ACListenerS25S0100000_5(this, 13), textView);
        if (C8FP.LJFF == null) {
            C8FP.LJFF = new C8FP();
        }
        c74074T5i.setMovementMethod(C8FP.LJFF);
        c74074T5i.setHighlightColor(c74074T5i.getResources().getColor(R.color.yi));
        c74074T5i.setStateChangedListener(this.LJLLLL);
        c74074T5i.setOnLongClickListener(new IDCListenerS298S0100000_5(this, 1));
        Drawable LIZ = C20110qd.LIZ(view.getContext(), R.drawable.c_q);
        C32206CkU c32206CkU = null;
        if (LIZ != null) {
            LIZ.setBounds(0, 0, C15380j0.LIZ(14.0f), C15380j0.LIZ(10.0f));
            LIZ.setCallback(c74074T5i);
            drawable = LIZ;
        } else {
            drawable = null;
        }
        this.LLFZ = drawable;
        c74074T5i.setVerifiedDrawable(drawable);
        this.LLI = new C32207CkV(drawable);
        C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.as1, view.getContext());
        if (LIZLLL != null) {
            LIZLLL.setTint(C259910h.LIZIZ(R.attr.bmu, view.getContext()));
            if (z) {
                f = 24.0f;
            } else {
                f = 10.0f;
            }
            LIZLLL.setBounds(0, 0, C15380j0.LIZ(f), C15380j0.LIZ(z ? 24.0f : 10.0f));
            c32206CkU = new C32206CkU(LIZLLL);
            c32206CkU.LJLJJI = C15380j0.LJFF(R.dimen.aft);
        }
        this.LLIFFJFJJ = c32206CkU;
        Q().LJII(new CUQ(this));
        P().LJII(new CUR(this));
        C16300kU.LJIILLIIL(view, f0());
        this.LLIIII = C221108m2.LIZIZ(new AqS155S0100000_5(view, 17));
    }
}
