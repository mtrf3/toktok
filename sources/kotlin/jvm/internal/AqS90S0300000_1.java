package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C105574Cj;
import X.C107834Lb;
import X.C109544Rq;
import X.C113554cx;
import X.C2K0;
import X.C34K;
import X.C4AP;
import X.C4D6;
import X.C4EF;
import X.C4MW;
import X.C55096Ljo;
import X.C5H3;
import X.C70657RoD;
import X.C76800UCe;
import X.C88903eI;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.InterfaceC92803ka;
import X.OSZ;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.view.TakoInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.NewChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AqS90S0300000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS90S0300000_1 aqS90S0300000_1) {
        Lifecycle lifecycle = ((LifecycleOwner) aqS90S0300000_1.l0).getLifecycle();
        final InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) aqS90S0300000_1.l1;
        final Class cls = (Class) aqS90S0300000_1.l2;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.provider.LogicAssemExtKt$bindLifecycle$runnable$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C55096Ljo.LJIILL(InterfaceC55235Lm3.this, cls, null);
                }
            }
        });
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [X.2xu] */
    public static final Object invoke$1(AqS90S0300000_1 aqS90S0300000_1) {
        Fragment fragment;
        Fragment fragment2;
        NewChatRoomFragment newChatRoomFragment;
        final String businessAccountIdWithWelcomeMsgEnabled;
        String str;
        C34K c34k = (C34K) aqS90S0300000_1.l0;
        if (!c34k.element) {
            c34k.element = true;
            BaseChatPanel baseChatPanel = (BaseChatPanel) aqS90S0300000_1.l1;
            InputView inputView = (InputView) aqS90S0300000_1.l2;
            Context getActivity = baseChatPanel.LJLJL;
            o.LJIIIZ(getActivity, "$this$getActivity");
            Activity LIZ = C105574Cj.LIZ(getActivity);
            Integer num = null;
            if (LIZ != null) {
                fragment = C70657RoD.LJIILIIL(LIZ);
            } else {
                fragment = null;
            }
            if (fragment instanceof NewChatRoomFragment) {
                Context getActivity2 = baseChatPanel.LJLJL;
                o.LJIIIZ(getActivity2, "$this$getActivity");
                Activity LIZ2 = C105574Cj.LIZ(getActivity2);
                if (LIZ2 != null) {
                    fragment2 = C70657RoD.LJIILIIL(LIZ2);
                } else {
                    fragment2 = null;
                }
                if ((fragment2 instanceof NewChatRoomFragment) && (newChatRoomFragment = (NewChatRoomFragment) fragment2) != null && (businessAccountIdWithWelcomeMsgEnabled = newChatRoomFragment.getBusinessAccountIdWithWelcomeMsgEnabled()) != null) {
                    IMUser singleChatFromUser = baseChatPanel.LJLJJI.getSingleChatFromUser();
                    if (singleChatFromUser != null) {
                        num = Integer.valueOf(singleChatFromUser.getFollowStatus());
                    }
                    final ?? r5 = new InterfaceC92803ka() { // from class: X.2xu
                        @Override // X.InterfaceC92793kZ
                        public final void LIZ(C63120Opw c63120Opw, List<? extends C109544Rq> list) {
                        }

                        @Override // X.InterfaceC92803ka
                        public final void LIZIZ(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                        }

                        @Override // X.InterfaceC92793kZ
                        public final void LIZJ(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                        }

                        @Override // X.InterfaceC92803ka
                        public final void LIZLLL(C63120Opw c63120Opw, List<C109544Rq> list, java.util.Map<C109544Rq, C63623Oy3> map) {
                        }

                        @Override // X.InterfaceC92803ka
                        public final void LJFF(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C75572xt(businessAccountIdWithWelcomeMsgEnabled, null), 3);
                        }

                        @Override // X.InterfaceC92803ka
                        public final void LJ(C63120Opw c63120Opw, C109544Rq c109544Rq, C63623Oy3 c63623Oy3) {
                            if (c109544Rq != null) {
                                String str2 = businessAccountIdWithWelcomeMsgEnabled;
                                java.util.Map<String, String> localExt = c109544Rq.getLocalExt();
                                o.LJIIIIZZ(localExt, "it.localExt");
                                localExt.put("ba_uid", str2);
                            }
                        }
                    };
                    inputView.getClass();
                    Context context = inputView.getContext();
                    if (context == null || (str = context.getString(R.string.sld)) == null) {
                        str = "";
                    }
                    if (num != null) {
                        num.intValue();
                        final ChatViewModel chatViewModel = inputView.LLIILZL;
                        if (chatViewModel != null) {
                            String conversationId = inputView.LJLZ.getConversationId();
                            Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_method", "click_get_started_button"));
                            TextContent obtain$default = TextContent.Companion.obtain$default(TextContent.Companion, str, null, null, 6, null);
                            obtain$default.type = 706;
                            C4MW c4mw = (C4MW) C88903eI.LIZ();
                            c4mw.LIZ.LIZIZ = conversationId;
                            c4mw.LIZLLL(obtain$default);
                            c4mw.LIZ("ttba_qa");
                            c4mw.LIZ.LJII = LJJLIIIIJ;
                            c4mw.LJII(new InterfaceC92803ka() { // from class: X.3kY
                                @Override // X.InterfaceC92803ka
                                public final void LIZIZ(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                                }

                                @Override // X.InterfaceC92793kZ
                                public final void LIZJ(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                                }

                                @Override // X.InterfaceC92803ka
                                public final void LIZLLL(C63120Opw c63120Opw, List<C109544Rq> list, java.util.Map<C109544Rq, C63623Oy3> map) {
                                }

                                @Override // X.InterfaceC92793kZ
                                public final void LIZ(C63120Opw c63120Opw, List<? extends C109544Rq> list) {
                                    InterfaceC92803ka interfaceC92803ka = r5;
                                    if (interfaceC92803ka != null) {
                                        interfaceC92803ka.LIZ(c63120Opw, list);
                                    }
                                }

                                @Override // X.InterfaceC92803ka
                                public final void LJFF(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                                    chatViewModel.LJLJLJ.setValue(new C92723kS(c109544Rq));
                                    InterfaceC92803ka interfaceC92803ka = r5;
                                    if (interfaceC92803ka != null) {
                                        interfaceC92803ka.LJFF(c63120Opw, c109544Rq);
                                    }
                                }

                                @Override // X.InterfaceC92803ka
                                public final void LJ(C63120Opw c63120Opw, C109544Rq c109544Rq, C63623Oy3 c63623Oy3) {
                                    ChatViewModel chatViewModel2 = chatViewModel;
                                    chatViewModel2.LJLJJLL = 3;
                                    chatViewModel2.LJLJLJ.setValue(new C92733kT(c63623Oy3));
                                    InterfaceC92803ka interfaceC92803ka = r5;
                                    if (interfaceC92803ka != null) {
                                        interfaceC92803ka.LJ(c63120Opw, c109544Rq, c63623Oy3);
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS90S0300000_1 aqS90S0300000_1) {
        C4D6.LIZIZ(((TakoInputView) aqS90S0300000_1.l0).LJLZ, "finger_off");
        ((TakoSpeechViewModel) aqS90S0300000_1.l1).kv0();
        ((C4EF) aqS90S0300000_1.l2).LIZ(false);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0186, code lost:
    
        if (X.C1GE.LJIIL(r15) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AqS90S0300000_1 r16) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS90S0300000_1.invoke$3(kotlin.jvm.internal.AqS90S0300000_1):java.lang.Object");
    }

    public static final Object invoke$4(AqS90S0300000_1 aqS90S0300000_1) {
        boolean z;
        if (((Number) ((C5H3) aqS90S0300000_1.l1).getValue()).intValue() - ((Number) ((C5H3) aqS90S0300000_1.l2).getValue()).intValue() >= ((C107834Lb) aqS90S0300000_1.l0).LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS90S0300000_1(C34K c34k, BaseChatPanel baseChatPanel, InputView inputView, int i) {
        super(0);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = baseChatPanel;
        this.l2 = inputView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS90S0300000_1(C4AP c4ap, UrlModel urlModel, C109544Rq c109544Rq, int i) {
        super(0);
        this.$t = i;
        this.l0 = c4ap;
        this.l1 = urlModel;
        this.l2 = c109544Rq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS90S0300000_1(C107834Lb c107834Lb, C107834Lb c107834Lb2, C5H3<Integer> c5h3, C5H3<Integer> c5h32) {
        super(0);
        this.$t = c5h32;
        this.l0 = c107834Lb;
        this.l1 = c107834Lb2;
        this.l2 = c5h3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS90S0300000_1(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2, InterfaceC55235Lm3 interfaceC55235Lm3, Class<? extends C2K0> cls) {
        super(0);
        this.$t = cls;
        this.l0 = lifecycleOwner;
        this.l1 = lifecycleOwner2;
        this.l2 = interfaceC55235Lm3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS90S0300000_1(TakoInputView takoInputView, C4EF c4ef, TakoSpeechViewModel takoSpeechViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = takoInputView;
        this.l1 = takoSpeechViewModel;
        this.l2 = c4ef;
    }
}
