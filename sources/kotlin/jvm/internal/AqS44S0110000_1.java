package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass391;
import X.C105044Ai;
import X.C109544Rq;
import X.C111154Xv;
import X.C111164Xw;
import X.C18950ol;
import X.C26338AVi;
import X.C2U8;
import X.C32I;
import X.C33W;
import X.C34B;
import X.C43I;
import X.C47135Ieh;
import X.C4EQ;
import X.C4ET;
import X.C4IE;
import X.C4IH;
import X.C4T8;
import X.C4Y6;
import X.C63081OpJ;
import X.C71052qb;
import X.C76800UCe;
import X.C80763Ey;
import X.C89333ez;
import X.C90442ZeY;
import X.C90459Zep;
import X.C96963rI;
import X.C97313rr;
import X.C97383ry;
import X.C99883w0;
import X.C9PM;
import X.InterfaceC88472Yns;
import X.InterfaceC99673vf;
import X.X1D;
import Y.ARunnableS20S0200000_1;
import Y.AUListenerS90S0100000_1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.byted.cast.common.api.IResultListener;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.TakoChatSendButtonAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import com.ss.android.ugc.aweme.im.sdk.u16.data.model.DisableChatUnder16Resp;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AqS44S0110000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public final void LIZ$0(IResultListener it) {
        C90442ZeY LJ;
        int i;
        o.LJIIIZ(it, "it");
        C90459Zep c90459Zep = ((C71052qb) this.l0).LIZIZ;
        if (c90459Zep != null && (LJ = c90459Zep.LJ()) != null) {
            if (this.z1) {
                i = 2;
            } else {
                i = 1;
            }
            LJ.LJIL(i, it);
        }
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AqS44S0110000_1 aqS44S0110000_1, Object obj) {
        aqS44S0110000_1.LIZ$0((IResultListener) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS44S0110000_1 aqS44S0110000_1, Object obj) {
        C105044Ai it = (C105044Ai) obj;
        o.LJIIIZ(it, "it");
        if (aqS44S0110000_1.z1 && !((TakoChatSendButtonAssem) aqS44S0110000_1.l0).v3(it.LJLILLLLZI)) {
            C97313rr LJIIIIZZ = C96963rI.LJIIIIZZ();
            Map LIZJ = C99883w0.LIZJ(((C89333ez) ((TakoChatSendButtonAssem) aqS44S0110000_1.l0).LJLJI.getValue()).LJLIL);
            LJIIIIZZ.getClass();
            C97313rr.LIZ(LIZJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS44S0110000_1 aqS44S0110000_1, Object obj) {
        final C111154Xv viewScope = (C111154Xv) obj;
        o.LJIIIZ(viewScope, "$this$viewScope");
        if (!aqS44S0110000_1.z1) {
            ((C111164Xw) aqS44S0110000_1.l0).LIZJ(C4EQ.DEFAULT_INPUT);
            ((C111164Xw) aqS44S0110000_1.l0).LIZLLL();
        } else {
            int i = C4ET.LIZ[((C111164Xw) aqS44S0110000_1.l0).LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        viewScope.LJ.setVisibility(0);
                        C111164Xw c111164Xw = (C111164Xw) aqS44S0110000_1.l0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setDuration(60L);
                        ofFloat.setStartDelay(20L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.addUpdateListener(new AUListenerS90S0100000_1(viewScope, 45));
                        ofFloat.addListener(new C4Y6() { // from class: X.4Y4
                            @Override // X.C4Y6, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                C111154Xv.this.LJFF.setVisibility(0);
                            }
                        });
                        c111164Xw.LIZJ = ofFloat;
                        C111164Xw c111164Xw2 = (C111164Xw) aqS44S0110000_1.l0;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat2.setDuration(40L);
                        ofFloat2.setInterpolator(new LinearInterpolator());
                        ofFloat2.addUpdateListener(new AUListenerS90S0100000_1(viewScope, 46));
                        c111164Xw2.LIZLLL = ofFloat2;
                        C111164Xw c111164Xw3 = (C111164Xw) aqS44S0110000_1.l0;
                        AnimatorSet animatorSet = new AnimatorSet();
                        final C111164Xw c111164Xw4 = (C111164Xw) aqS44S0110000_1.l0;
                        animatorSet.addListener(new C4Y6() { // from class: X.4Y2
                            @Override // X.C4Y6, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                C111164Xw.this.LIZJ(C4EQ.DEFAULT_INPUT);
                            }

                            @Override // X.C4Y6, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animation) {
                                o.LJIIIZ(animation, "animation");
                                C111164Xw.this.LIZJ(C4EQ.DEFAULT_INPUT);
                            }
                        });
                        animatorSet.play(c111164Xw4.LIZJ).with(c111164Xw4.LIZLLL);
                        c111164Xw3.LJ = animatorSet;
                    }
                } else {
                    viewScope.LJFF.setVisibility(0);
                    viewScope.LJ.setVisibility(0);
                    View view = viewScope.LIZLLL;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    ((C111164Xw) aqS44S0110000_1.l0).LIZLLL();
                    C26338AVi.LJI(viewScope.LJFF, AnonymousClass391.LIZJ(12), null, null, null, false, 30);
                    viewScope.LJFF.post(new ARunnableS20S0200000_1((C111164Xw) aqS44S0110000_1.l0, viewScope, 34));
                }
            } else {
                viewScope.LJFF.setVisibility(0);
                viewScope.LJ.setVisibility(0);
                if (viewScope.LIZIZ.getVisibility() == 0) {
                    C111164Xw c111164Xw5 = (C111164Xw) aqS44S0110000_1.l0;
                    Context context = viewScope.LJFF.getContext();
                    o.LJIIIIZZ(context, "inputArea.context");
                    ValueAnimator ofInt = ValueAnimator.ofInt(viewScope.LJFF.getWidth(), C47135Ieh.LIZ(24, C63081OpJ.LJJJJL(context)));
                    final C111164Xw c111164Xw6 = (C111164Xw) aqS44S0110000_1.l0;
                    ofInt.setDuration(120L);
                    ofInt.setInterpolator(C18950ol.LIZIZ(0.42f, 0.0f, 0.58f, 1.0f));
                    ofInt.addUpdateListener(new AUListenerS90S0100000_1(c111164Xw6, 43));
                    ofInt.start();
                    ofInt.addListener(new C4Y6() { // from class: X.4Y1
                        @Override // X.C4Y6, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animation) {
                            o.LJIIIZ(animation, "animation");
                            C111164Xw.this.LIZJ(C4EQ.DEFAULT_INPUT);
                        }
                    });
                    c111164Xw5.LIZJ = ofInt;
                } else {
                    ((C111164Xw) aqS44S0110000_1.l0).LIZJ(C4EQ.DEFAULT_INPUT);
                    ((C111164Xw) aqS44S0110000_1.l0).LIZLLL();
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS44S0110000_1 aqS44S0110000_1, Object obj) {
        DisableChatUnder16Resp disableChatUnder16Resp = (DisableChatUnder16Resp) obj;
        C4IE c4ie = C4IE.LIZ;
        Keva keva = (Keva) aqS44S0110000_1.l0;
        boolean z = aqS44S0110000_1.z1;
        c4ie.getClass();
        if (disableChatUnder16Resp != null) {
            keva.storeBoolean("is_u16_fetched", true);
            keva.storeBoolean("is_chat_function_off", disableChatUnder16Resp.isChatFucOffLine);
            C4IE.LIZIZ(keva, z);
            C2U8.LIZ(new IEvent() { // from class: X.3K2
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }
            });
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("disable chat config saved ");
            LIZ.append(disableChatUnder16Resp.isChatFucOffLine);
            C34B.LJI("ImUnder16Manger", X1D.LIZIZ(LIZ));
        }
        C4IE.LIZIZ = true;
        CopyOnWriteArrayList<C4IH> copyOnWriteArrayList = C4IE.LIZLLL.get(C80763Ey.LIZ(false));
        if (copyOnWriteArrayList != null) {
            Iterator<C4IH> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS44S0110000_1 aqS44S0110000_1, Object obj) {
        InterfaceC99673vf it = (InterfaceC99673vf) obj;
        o.LJIIIZ(it, "it");
        it.v0((List) aqS44S0110000_1.l0, aqS44S0110000_1.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS44S0110000_1 aqS44S0110000_1, Object obj) {
        InterfaceC99673vf it = (InterfaceC99673vf) obj;
        o.LJIIIZ(it, "it");
        it.M1((List) aqS44S0110000_1.l0, aqS44S0110000_1.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS44S0110000_1 aqS44S0110000_1, Object obj) {
        InterfaceC99673vf it = (InterfaceC99673vf) obj;
        o.LJIIIZ(it, "it");
        it.ea((C109544Rq) aqS44S0110000_1.l0, aqS44S0110000_1.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS44S0110000_1 aqS44S0110000_1, Object obj) {
        C4T8 state = (C4T8) obj;
        o.LJIIIZ(state, "state");
        List<C97383ry> list = state.LJLJJL;
        boolean z = aqS44S0110000_1.z1;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<C97383ry> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C97383ry.L(it.next(), z));
        }
        ((MessageRequestViewModel) aqS44S0110000_1.l0).setState(new AqS167S0100000_1(arrayList, (List<VoucherInfoNew>) 431));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS44S0110000_1 aqS44S0110000_1, Object obj) {
        Integer valueOf;
        C33W setState = (C33W) obj;
        o.LJIIIZ(setState, "$this$setState");
        if (aqS44S0110000_1.z1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((RssArticle) aqS44S0110000_1.l0).guid);
        }
        return C33W.LIZ(setState, null, null, null, false, valueOf, 15);
    }

    public static final Object invoke$9(AqS44S0110000_1 aqS44S0110000_1, Object obj) {
        C9PM setState = (C9PM) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C9PM.LIZ(setState, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, aqS44S0110000_1.z1, null, null, null, (C43I) aqS44S0110000_1.l0, null, null, null, null, null, null, -16809985, 511);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S0110000_1(C71052qb c71052qb, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c71052qb;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S0110000_1(C109544Rq c109544Rq, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c109544Rq;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S0110000_1(Keva keva, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = keva;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS44S0110000_1(List list, List<C109544Rq> list2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = list;
        this.z1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS44S0110000_1(boolean z, boolean z2, C43I<Boolean> c43i) {
        super(1);
        this.$t = c43i;
        this.z1 = z;
        this.l0 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S0110000_1(boolean z, C111164Xw c111164Xw, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c111164Xw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S0110000_1(boolean z, TakoChatSendButtonAssem takoChatSendButtonAssem, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = takoChatSendButtonAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S0110000_1(boolean z, MessageRequestViewModel messageRequestViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = messageRequestViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S0110000_1(boolean z, RssArticle rssArticle, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = rssArticle;
    }
}
