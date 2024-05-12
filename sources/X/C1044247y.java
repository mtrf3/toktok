package X;

import Y.ACListenerS21S0100000_1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.BotAnswerCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.botanswercard.BotAnswerCardItemComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.botanswercard.TakoAnswerVideoCell;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* renamed from: X.47y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1044247y extends AnonymousClass461<BotAnswerCardTemplate> implements SG1, InterfaceC71794SFq {
    public final View LLIIIJ;
    public final C4H3 LLIIIL;
    public final SYL LLIIIZ;
    public final TuxIconView LLIIJI;
    public final TuxIconView LLIIJLIL;
    public final ImageView LLIIL;
    public final View LLIILII;
    public final ViewStub LLIILZL;
    public C89973g1 LLIIZ;
    public final C71791SFn LLIL;
    public C109544Rq LLILII;
    public BotAnswerCardTemplate LLILIL;
    public final C62822Ol8 LLILL;
    public boolean LLILLIZIL;
    public final AnonymousClass481 LLILLJJLI;

    @Override // X.AbstractC1041546x
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
    }

    @Override // X.AbstractC1041546x
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
    }

    @Override // X.AbstractC1041546x
    public final View a0() {
        return this.LLIILII;
    }

    public static boolean o0(C109544Rq c109544Rq) {
        String str;
        java.util.Map<String, String> localExt;
        if (c109544Rq != null && (localExt = c109544Rq.getLocalExt()) != null) {
            str = localExt.get("bot_answer_disslike");
        } else {
            str = null;
        }
        return o.LJ(str, "1");
    }

    public static boolean p0(C109544Rq c109544Rq) {
        String str;
        java.util.Map<String, String> localExt;
        if (c109544Rq != null && (localExt = c109544Rq.getLocalExt()) != null) {
            str = localExt.get("bot_answer_like");
        } else {
            str = null;
        }
        return o.LJ(str, "1");
    }

    public static boolean v0(BotAnswerCardTemplate botAnswerCardTemplate) {
        List<Integer> list;
        if (botAnswerCardTemplate == null || (list = botAnswerCardTemplate.contentTypes) == null || list.isEmpty()) {
            return false;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC1041546x
    public final boolean V(C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        return C93793mB.LJIIL(msg);
    }

    @Override // X.AbstractC1041546x
    public final boolean X(C109544Rq c109544Rq) {
        return C93793mB.LJIIL(c109544Rq);
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        Aweme aweme;
        String aid;
        Integer LJJIL;
        List<BotAnswerCardItemComponent> list;
        C0A2 layoutManager;
        List<BotAnswerCardItemComponent> list2;
        o.LJIIIZ(event, "event");
        Object obj = event.LJLILLLLZI;
        BotAnswerCardItemComponent botAnswerCardItemComponent = null;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (aid = aweme.getAid()) != null && (LJJIL = C38350F3i.LJJIL(aid)) != null) {
            int intValue = LJJIL.intValue();
            BotAnswerCardTemplate botAnswerCardTemplate = this.LLILIL;
            if (botAnswerCardTemplate != null && (list2 = botAnswerCardTemplate.recommendItems) != null) {
                Iterator<BotAnswerCardItemComponent> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BotAnswerCardItemComponent next = it.next();
                    if (next.hashCode() == intValue) {
                        botAnswerCardItemComponent = next;
                        break;
                    }
                }
            }
            BotAnswerCardTemplate botAnswerCardTemplate2 = this.LLILIL;
            if (botAnswerCardTemplate2 != null && (list = botAnswerCardTemplate2.recommendItems) != null) {
                int indexOf = list.indexOf(botAnswerCardItemComponent);
                SYL syl = this.LLIIIZ;
                if (syl != null && (layoutManager = syl.getLayoutManager()) != null) {
                    layoutManager.LJZL(indexOf);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.481] */
    public C1044247y(final View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLILL = C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 970));
        this.LLIIIL = (C4H3) itemView.findViewById(R.id.l3s);
        SYL syl = (SYL) itemView.findViewById(R.id.n6g);
        this.LLIIIZ = syl;
        this.LLIIJI = (TuxIconView) itemView.findViewById(R.id.fqt);
        this.LLIIJLIL = (TuxIconView) itemView.findViewById(R.id.cbf);
        this.LLIIL = (ImageView) itemView.findViewById(R.id.gnq);
        this.LLIILII = itemView.findViewById(R.id.bun);
        this.LLIILZL = (ViewStub) itemView.findViewById(R.id.myo);
        View findViewById = itemView.findViewById(R.id.btl);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_end_guide)");
        this.LLIIIJ = findViewById;
        this.LLIL = (C71791SFn) itemView.findViewById(R.id.ft3);
        this.itemView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        if (syl != null) {
            syl.setLayoutManager(linearLayoutManager);
            syl.setAnimation(null);
            syl.LLLF.LJZL(TakoAnswerVideoCell.class);
            syl.LJII(new AbstractC030309z() { // from class: X.484
                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
                    Integer first;
                    Integer second;
                    OSZ<Integer, Integer> n0 = C1044247y.this.n0(C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view), c0ac.LIZIZ());
                    if (C90193gN.LIZ()) {
                        first = n0.getSecond();
                    } else {
                        first = n0.getFirst();
                    }
                    rect.left = first.intValue();
                    if (C90193gN.LIZ()) {
                        second = n0.getFirst();
                    } else {
                        second = n0.getSecond();
                    }
                    rect.right = second.intValue();
                }
            }, -1);
        }
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 106);
        }
        this.LLILLJJLI = new InterfaceC116744i6() { // from class: X.481
            @Override // X.InterfaceC116744i6
            public final void LIZ(C48R span) {
                o.LJIIIZ(span, "span");
                C4H3 c4h3 = C1044247y.this.LLIIIL;
                if (c4h3 != null) {
                    c4h3.performLongClick();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00fc A[Catch: Exception -> 0x01b5, TryCatch #0 {Exception -> 0x01b5, blocks: (B:7:0x000f, B:11:0x0017, B:13:0x0027, B:15:0x002b, B:17:0x004f, B:18:0x0053, B:20:0x0059, B:23:0x0066, B:25:0x006c, B:28:0x00dc, B:30:0x00e5, B:31:0x00d8, B:32:0x00f0, B:34:0x00fc, B:40:0x0031, B:42:0x003b, B:44:0x0042, B:45:0x0046, B:47:0x004a, B:50:0x0084, B:51:0x0088, B:53:0x008e, B:55:0x0094, B:56:0x0098, B:58:0x009e, B:60:0x00a4, B:62:0x00b2), top: B:6:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r1v53, types: [T, android.view.View, java.lang.Object] */
            @Override // X.InterfaceC116744i6
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.C48R r13, java.lang.CharSequence r14, java.util.Map<java.lang.String, ? extends java.lang.Object> r15) {
                /*
                    Method dump skipped, instructions count: 438
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass481.LIZIZ(X.48R, java.lang.CharSequence, java.util.Map):void");
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        if (r3 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bc  */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.ArrayList] */
    @Override // X.SG1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIZZ(int r20, android.view.View r21) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1044247y.LLLIZZ(int, android.view.View):void");
    }

    @Override // X.InterfaceC71794SFq
    public final void LLLZIL(int i, String str) {
        String str2;
        String str3;
        String uuid;
        String str4;
        String str5;
        String str6;
        String str7 = "";
        JSONObject LJ = C47135Ieh.LJ("business_event_keys_stay_time", "tikbot_webpage_stay_time", "business_event_keys_button_click", "tikbot_webpage_button_click");
        LJ.put("business_event_keys_close", "tikbot_webpage_close");
        JSONObject jSONObject = new JSONObject();
        try {
            C99033ud c99033ud = this.LJLLL;
            if (c99033ud == null || (str4 = c99033ud.getEnterFromForMob()) == null) {
                str4 = "";
            }
            jSONObject.put("enter_from", str4);
            C99033ud c99033ud2 = this.LJLLL;
            if (c99033ud2 == null || (str5 = c99033ud2.getEnterMethod()) == null) {
                str5 = "";
            }
            jSONObject.put("enter_method", str5);
            jSONObject.put("process_id", C3Y4.LIZJ);
            C109544Rq c109544Rq = this.LLILII;
            if (c109544Rq == null || (str6 = c109544Rq.getUuid()) == null) {
                str6 = "";
            }
            jSONObject.put("message_id", str6);
        } catch (Exception unused) {
        }
        C61200O0e.LIZLLL().LJII(UriProtector.parse("aweme://search_third_party/?url=".concat(str)).buildUpon().appendQueryParameter("business_event_tracking", jSONObject.toString()).appendQueryParameter("business_event_keys", LJ.toString()).appendQueryParameter("click_time", String.valueOf(System.currentTimeMillis())).build().toString());
        C99033ud c99033ud3 = this.LJLLL;
        if (c99033ud3 == null || (str2 = c99033ud3.getEnterFromForMob()) == null) {
            str2 = "";
        }
        C99033ud c99033ud4 = this.LJLLL;
        if (c99033ud4 == null || (str3 = c99033ud4.getEnterMethod()) == null) {
            str3 = "";
        }
        String processId = C3Y4.LIZJ;
        C109544Rq c109544Rq2 = this.LLILII;
        if (c109544Rq2 != null && (uuid = c109544Rq2.getUuid()) != null) {
            str7 = uuid;
        }
        String rank = String.valueOf(i);
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(processId, "processId");
        o.LJIIIZ(rank, "rank");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LIZJ = HXX.LIZJ("enter_from", str2, "enter_method", str3);
        LIZJ.put("process_id", processId);
        LIZJ.put("message_id", str7);
        LIZJ.put("link_url", str);
        LIZJ.put("rank", rank);
        onEventV3.LIZIZ("tikbot_webpage_link_click", LIZJ);
    }

    public final OSZ<Integer, Integer> n0(int i, int i2) {
        float f;
        C018905p c018905p;
        if (i == 0) {
            return new OSZ<>(Integer.valueOf(C97343ru.LJ(R.dimen.vl)), C1FJ.LIZIZ(8));
        }
        if (i == i2 - 1) {
            ViewGroup.LayoutParams layoutParams = this.LLIIIJ.getLayoutParams();
            Float f2 = null;
            if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                f2 = Float.valueOf(c018905p.guidePercent);
            }
            float LJ = C74275TDb.LJ(this.itemView.getContext());
            float f3 = 1;
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                f = 1.0f;
            }
            return new OSZ<>(0, Integer.valueOf((int) ((f3 - f) * LJ)));
        }
        return new OSZ<>(0, C1FJ.LIZIZ(8));
    }

    public final void t0(ActivityC45651qj activityC45651qj, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String conversationId;
        if (activityC45651qj == null) {
            return;
        }
        ISearchService LLLZI = SearchServiceImpl.LLLZI();
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "fragmentActivity.supportFragmentManager");
        C99033ud c99033ud = this.LJLLL;
        C109544Rq c109544Rq = this.LLILII;
        OSZ[] oszArr = new OSZ[7];
        String str5 = "";
        if (c99033ud == null || (str = c99033ud.getEnterFromForMob()) == null) {
            str = "";
        }
        oszArr[0] = new OSZ("enter_from", str);
        if (c99033ud == null || (str2 = c99033ud.getEnterMethod()) == null) {
            str2 = "";
        }
        oszArr[1] = new OSZ("enter_method", str2);
        if (c99033ud == null || (str3 = c99033ud.getSearchId()) == null) {
            str3 = "";
        }
        oszArr[2] = new OSZ("search_id", str3);
        if (c109544Rq == null || (str4 = c109544Rq.getUuid()) == null) {
            str4 = "";
        }
        oszArr[3] = new OSZ("message_id", str4);
        if (c99033ud != null && (conversationId = c99033ud.getConversationId()) != null) {
            str5 = conversationId;
        }
        oszArr[4] = new OSZ("conversation_id", str5);
        oszArr[5] = new OSZ("previous_message_id", C93793mB.LIZJ(c109544Rq));
        oszArr[6] = new OSZ("process_id", C3Y4.LIZJ);
        LLLZI.LJJIZ(supportFragmentManager, z, C113554cx.LJJL(oszArr));
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        View view;
        o.LJIIIZ(msg, "msg");
        boolean LJJIJIL = C78939UyV.LJJIJIL(msg, c109544Rq2);
        boolean LJJIJIIJIL = C78939UyV.LJJIJIIJIL(msg, c109544Rq);
        if (!LJJIJIL) {
            ImageView imageView = this.LLIIL;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            ImageView imageView2 = this.LLIIL;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            C48E c48e = c49v.LIZJ;
            if (c48e != null) {
                int i = c48e.LJLIL;
                ImageView imageView3 = this.LLIIL;
                if (imageView3 != null) {
                    imageView3.setColorFilter(i);
                }
            }
        }
        Context context = this.itemView.getContext();
        boolean LIZ = C90193gN.LIZ();
        o.LJIIIIZZ(context, "context");
        C49V LJIILIIL = C77413UZt.LJIILIIL(context, LJJIJIIJIL, LJJIJIL, LIZ);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 == null || (view = anonymousClass470.LIZ) == null) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable, LJIILIIL);
        view.setBackground(gradientDrawable);
    }

    @Override // X.AnonymousClass461
    public final void m0(C109544Rq msg, C109544Rq c109544Rq, BotAnswerCardTemplate botAnswerCardTemplate, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        String str3;
        View inflate;
        int i5;
        int i6;
        C72808Sho<InterfaceC57784Mm4> state;
        C72808Sho<InterfaceC57784Mm4> state2;
        LifecycleOwner LIZIZ;
        LifecycleCoroutineScope lifecycleScope;
        String str4;
        BotAnswerCardTemplate botAnswerCardTemplate2 = botAnswerCardTemplate;
        o.LJIIIZ(msg, "msg");
        this.LLILII = msg;
        C96963rI.LIZ().getClass();
        if (C89163ei.LJ(msg)) {
            C96963rI.LIZ().getClass();
            if (!C89163ei.LIZLLL(msg)) {
                View view = this.itemView;
                C96963rI.LJIIIZ().getClass();
                C97343ru.LIZJ(view, Integer.valueOf(C97223ri.LIZJ()), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2))), 5);
            } else {
                View view2 = this.itemView;
                Integer LIZIZ2 = C1FJ.LIZIZ(2);
                C96963rI.LJIIIZ().getClass();
                C97343ru.LIZJ(view2, LIZIZ2, Integer.valueOf(C97223ri.LIZJ()), 5);
            }
        } else {
            View view3 = this.itemView;
            C96963rI.LJIIIZ().getClass();
            Integer valueOf = Integer.valueOf(C97223ri.LIZJ());
            C96963rI.LJIIIZ().getClass();
            C97343ru.LIZJ(view3, valueOf, Integer.valueOf(C97223ri.LIZJ()), 5);
        }
        C96963rI.LIZ().getClass();
        int i7 = 0;
        if (!C89163ei.LJ(msg) && !C93793mB.LJIILIIL(msg)) {
            z = true;
        } else {
            z = false;
        }
        TuxIconView tuxIconView = this.LLIIJI;
        if (tuxIconView != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxIconView.setVisibility(i2);
        }
        TuxIconView tuxIconView2 = this.LLIIJLIL;
        if (tuxIconView2 != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            tuxIconView2.setVisibility(i3);
        }
        this.LLILIL = botAnswerCardTemplate2;
        C4H3 c4h3 = this.LLIIIL;
        if (c4h3 != null) {
            c4h3.LIZ(botAnswerCardTemplate2.answerText, this.LLILLJJLI, this.LJLLL, C99883w0.LIZLLL(msg));
        }
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        String str5 = null;
        if (anonymousClass470 != null) {
            C4H3 c4h32 = this.LLIIIL;
            if (c4h32 != null) {
                str4 = c4h32.getCopyStr();
            } else {
                str4 = null;
            }
            anonymousClass470.LIZIZ(150994946, str4);
        }
        Context context = this.itemView.getContext();
        if (context != null && (LIZIZ = C57434MgQ.LIZIZ(context)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LIZIZ)) != null) {
            XKX.LIZLLL(lifecycleScope, C78613UtF.LIZJ, null, new C69972or(msg, null), 2);
        }
        SYL syl = this.LLIIIZ;
        if (syl != null && (state2 = syl.getState()) != null) {
            state2.LJFF();
        }
        ArrayList arrayList = new ArrayList();
        List<BotAnswerCardItemComponent> list = botAnswerCardTemplate2.recommendItems;
        if (C1GE.LJIILIIL(list) && list != null) {
            int size = list.size();
            List<BotAnswerCardItemComponent> list2 = botAnswerCardTemplate2.recommendItems;
            if (list2 != null) {
                Iterator<BotAnswerCardItemComponent> it = list2.iterator();
                int i8 = 1;
                while (it.hasNext()) {
                    arrayList.add(new SG0(i8, v0(botAnswerCardTemplate2), it.next(), this, Integer.valueOf(size)));
                    i8++;
                }
            }
        }
        SYL syl2 = this.LLIIIZ;
        if (syl2 != null && (state = syl2.getState()) != null) {
            state.LJ(arrayList);
        }
        SYL syl3 = this.LLIIIZ;
        if (syl3 != null) {
            if (C1GE.LJIILIIL(arrayList)) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            syl3.setVisibility(i4);
        }
        C71791SFn c71791SFn = this.LLIL;
        if (c71791SFn != null) {
            c71791SFn.LIZ(botAnswerCardTemplate2.linkInfoItems, false);
        }
        C71791SFn c71791SFn2 = this.LLIL;
        if (c71791SFn2 != null) {
            c71791SFn2.setItemAction(this);
        }
        TuxIconView tuxIconView3 = this.LLIIJI;
        if (tuxIconView3 != null) {
            if (p0(msg)) {
                i6 = R.raw.icon_thumbs_up_fill;
            } else {
                i6 = R.raw.icon_thumbs_up;
            }
            tuxIconView3.setIconRes(i6);
        }
        TuxIconView tuxIconView4 = this.LLIIJLIL;
        if (tuxIconView4 != null) {
            if (o0(msg)) {
                i5 = R.raw.icon_thumbs_down_fill;
            } else {
                i5 = R.raw.icon_thumbs_down;
            }
            tuxIconView4.setIconRes(i5);
        }
        TuxIconView tuxIconView5 = this.LLIIJI;
        if (tuxIconView5 != null) {
            C16880lQ.LJJJ(tuxIconView5, new ACListenerS21S0100000_1(this, 215));
        }
        TuxIconView tuxIconView6 = this.LLIIJLIL;
        if (tuxIconView6 != null) {
            C16880lQ.LJJJ(tuxIconView6, new ACListenerS21S0100000_1(this, 216));
        }
        C4H3 c4h33 = this.LLIIIL;
        if (c4h33 != null) {
            c4h33.setCallback$im_base_release(new InterfaceC1044448a() { // from class: X.48B
                @Override // X.InterfaceC1044448a
                public final Rect LIZ() {
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    C1044247y.this.LLIIIL.getGlobalVisibleRect(rect);
                    TuxIconView tuxIconView7 = C1044247y.this.LLIIJI;
                    if (tuxIconView7 != null && tuxIconView7.getVisibility() == 0) {
                        C1044247y.this.LLIIJI.getGlobalVisibleRect(rect2);
                        rect.bottom = rect2.bottom;
                    }
                    return rect;
                }
            });
        }
        BaseUserComponent baseUserComponent = (BaseUserComponent) ORZ.LJLLLL(botAnswerCardTemplate2.recommendUsers);
        if (baseUserComponent != null) {
            ViewStub viewStub = this.LLIILZL;
            if (viewStub != null && viewStub.getParent() != null && (inflate = viewStub.inflate()) != null) {
                C89973g1 c89973g1 = this.LLIIZ;
                if (c89973g1 == null) {
                    Context context2 = this.itemView.getContext();
                    o.LJIIIIZZ(context2, "itemView.context");
                    c89973g1 = new C89973g1(context2, inflate);
                }
                this.LLIIZ = c89973g1;
            }
            final C89973g1 c89973g12 = this.LLIIZ;
            if (c89973g12 != null) {
                c89973g12.LJ = this.LJLLL;
                if (c89973g12.LIZLLL != null) {
                    Object value = c89973g12.LJI.getValue();
                    o.LJIIIIZZ(value, "<get-userService>(...)");
                    NextLiveData<BlockStatus> LJII = ((IUserService) value).LJII();
                    LJII.removeObserver(c89973g12.LJFF);
                    Activity LIZIZ3 = C27740Aue.LIZIZ(c89973g12.LIZIZ);
                    o.LJII(LIZIZ3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    LJII.observe((C1AU) LIZIZ3, c89973g12.LJFF);
                }
                User user = new User();
                Long l = baseUserComponent.userId;
                if (l != null) {
                    str = l.toString();
                } else {
                    str = null;
                }
                user.setUid(str);
                TextComponent textComponent = baseUserComponent.nickname;
                if (textComponent != null) {
                    str2 = textComponent.text;
                } else {
                    str2 = null;
                }
                user.setNickname(str2);
                TextComponent textComponent2 = baseUserComponent.username;
                if (textComponent2 != null) {
                    str3 = textComponent2.text;
                } else {
                    str3 = null;
                }
                user.setUniqueId(str3);
                UrlModel urlModel = new UrlModel();
                ImageComponent imageComponent = baseUserComponent.avatar;
                if (imageComponent != null) {
                    urlModel.setUrlList(imageComponent.urls);
                    ResolutionComponent resolutionComponent = imageComponent.resolution;
                    if (resolutionComponent != null) {
                        urlModel.setHeight(resolutionComponent.height);
                        urlModel.setWidth(resolutionComponent.width);
                    }
                }
                user.setAvatarThumb(urlModel);
                if (o.LJ(baseUserComponent.isVerify, Boolean.TRUE)) {
                    str5 = "1";
                }
                user.setCustomVerify(str5);
                Integer num = baseUserComponent.followerCount;
                if (num != null) {
                    i7 = num.intValue();
                }
                user.setFollowerCount(i7);
                user.setFollowStatus(-1);
                c89973g12.LIZJ(user);
                User user2 = c89973g12.LIZLLL;
                if (user2 != null) {
                    final AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(c89973g12, 395);
                    IMUser LJFF = C80533Eb.LJFF(user2.getUid(), user2.getSecUid());
                    C80533Eb.LIZ.getClass();
                    final boolean z2 = !C80533Eb.LIZJ().contains(user2.getUid());
                    if (LJFF == null || z2) {
                        C80533Eb.LJIIJJI(user2.getUid(), user2.getSecUid(), z2, new C3EU() { // from class: X.3h0
                            @Override // X.C3EU
                            public final void LIZ(IMUser result) {
                                o.LJIIIZ(result, "result");
                                InterfaceC88472Yns<User, C76800UCe> interfaceC88472Yns = aqS167S0100000_1;
                                C89973g1 c89973g13 = c89973g12;
                                c89973g13.getClass();
                                result.setBlockStatus(result.isBlock() ? 1 : 0);
                                User user3 = c89973g13.LIZLLL;
                                if (user3 != null) {
                                    result.setFollowerCount(user3.getFollowerCount());
                                }
                                User user4 = IMUser.toUser(result);
                                o.LJIIIIZZ(user4, "toUser(this)");
                                interfaceC88472Yns.invoke(user4);
                                if (z2) {
                                    C80533Eb.LIZ.getClass();
                                    java.util.Set LIZJ = C80533Eb.LIZJ();
                                    String uid = result.getUid();
                                    o.LJIIIIZZ(uid, "result.uid");
                                    LIZJ.add(uid);
                                }
                            }

                            @Override // X.C3EU
                            public final void LIZIZ(Throwable throwable) {
                                o.LJIIIZ(throwable, "throwable");
                            }
                        });
                    } else {
                        LJFF.setBlockStatus(LJFF.isBlock() ? 1 : 0);
                        User user3 = c89973g12.LIZLLL;
                        if (user3 != null) {
                            LJFF.setFollowerCount(user3.getFollowerCount());
                        }
                        User user4 = IMUser.toUser(LJFF);
                        o.LJIIIIZZ(user4, "toUser(this)");
                        aqS167S0100000_1.invoke(user4);
                    }
                }
            }
            C89973g1 c89973g13 = this.LLIIZ;
            if (c89973g13 != null) {
                C17N.LJJLIIIJJI(c89973g13.LIZIZ);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        C89973g1 c89973g14 = this.LLIIZ;
        if (c89973g14 != null) {
            C17N.LJJIIJZLJL(c89973g14.LIZIZ);
        }
    }

    public final void s0(final TuxIconView tuxIconView, final String str, final int i, final boolean z) {
        Long l;
        AnimatorSet animatorSet;
        final AnimatorSet animatorSet2;
        if (tuxIconView != null) {
            C109544Rq c109544Rq = this.LLILII;
            if (c109544Rq != null) {
                l = Long.valueOf(c109544Rq.getMsgId());
            } else {
                l = null;
            }
            tuxIconView.setTag(l);
        }
        if (tuxIconView == null) {
            animatorSet = new AnimatorSet();
            animatorSet2 = new AnimatorSet();
        } else {
            animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxIconView, (Property<TuxIconView, Float>) View.SCALE_X, 1.0f, 0.8f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tuxIconView, (Property<TuxIconView, Float>) View.SCALE_Y, 1.0f, 0.8f);
            animatorSet.setDuration(100L);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.play(ofFloat).with(ofFloat2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tuxIconView, (Property<TuxIconView, Float>) View.ALPHA, 0.0f, 1.0f);
            ofFloat3.setDuration(100L);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tuxIconView, (Property<TuxIconView, Float>) View.SCALE_X, 0.8f, 1.0f);
            ofFloat4.setDuration(200L);
            ofFloat4.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(tuxIconView, (Property<TuxIconView, Float>) View.SCALE_Y, 0.8f, 1.0f);
            ofFloat5.setDuration(200L);
            ofFloat5.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            animatorSet2 = new AnimatorSet();
            animatorSet2.play(ofFloat3).with(ofFloat4).with(ofFloat5);
        }
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.485
            public final void LIZIZ() {
                Object obj;
                TuxIconView tuxIconView2 = TuxIconView.this;
                Long l2 = null;
                if (tuxIconView2 != null) {
                    obj = tuxIconView2.getTag();
                } else {
                    obj = null;
                }
                C109544Rq c109544Rq2 = this.LLILII;
                if (c109544Rq2 != null) {
                    l2 = Long.valueOf(c109544Rq2.getMsgId());
                }
                if (o.LJ(obj, l2)) {
                    TuxIconView tuxIconView3 = TuxIconView.this;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setIconRes(i);
                    }
                    animatorSet2.start();
                    this.LLILLIZIL = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animation) {
                o.LJIIIZ(animation, "animation");
                LIZIZ();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                LIZIZ();
            }
        });
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: X.483
            public final void LIZIZ() {
                Object obj;
                Long l2;
                C1044247y c1044247y;
                C109544Rq c109544Rq2;
                TuxIconView tuxIconView2 = TuxIconView.this;
                if (tuxIconView2 != null) {
                    obj = tuxIconView2.getTag();
                } else {
                    obj = null;
                }
                C109544Rq c109544Rq3 = this.LLILII;
                if (c109544Rq3 != null) {
                    l2 = Long.valueOf(c109544Rq3.getMsgId());
                } else {
                    l2 = null;
                }
                if (o.LJ(obj, l2) && (c109544Rq2 = (c1044247y = this).LLILII) != null) {
                    String str2 = str;
                    TuxIconView tuxIconView3 = TuxIconView.this;
                    int i2 = i;
                    boolean z2 = z;
                    c109544Rq2.addLocalExt(str2, "1");
                    if (tuxIconView3 != null) {
                        tuxIconView3.setIconRes(i2);
                    }
                    C31F.LIZ.getClass();
                    C31G.LIZ();
                    C63164Oqe c63164Oqe = C63164Oqe.LIZIZ;
                    c63164Oqe.LJIIZILJ(null, c109544Rq2);
                    boolean z3 = !z2;
                    C109544Rq c109544Rq4 = c1044247y.LLILII;
                    if (c109544Rq4 == null) {
                        return;
                    }
                    if (z3) {
                        if (!C1044247y.p0(c109544Rq4)) {
                            return;
                        }
                        c109544Rq4.addLocalExt("bot_answer_like", CardStruct.IStatusCode.DEFAULT);
                        TuxIconView tuxIconView4 = c1044247y.LLIIJI;
                        if (tuxIconView4 != null) {
                            tuxIconView4.setIconRes(R.raw.icon_thumbs_up);
                        }
                        C31G.LIZ();
                        c63164Oqe.LJIIZILJ(null, c109544Rq4);
                        return;
                    }
                    if (!C1044247y.o0(c109544Rq4)) {
                        return;
                    }
                    c109544Rq4.addLocalExt("bot_answer_disslike", CardStruct.IStatusCode.DEFAULT);
                    TuxIconView tuxIconView5 = c1044247y.LLIIJLIL;
                    if (tuxIconView5 != null) {
                        tuxIconView5.setIconRes(R.raw.icon_thumbs_down);
                    }
                    C31G.LIZ();
                    c63164Oqe.LJIIZILJ(null, c109544Rq4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animation) {
                o.LJIIIZ(animation, "animation");
                LIZIZ();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                LIZIZ();
            }
        });
        animatorSet.start();
        this.LLILLIZIL = true;
    }
}
