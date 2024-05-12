package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import X.AbstractC73638SvC;
import X.AbstractC73946T0k;
import X.AbstractC92763kW;
import X.C109544Rq;
import X.C132805Jc;
import X.C31H;
import X.C39Y;
import X.C48841JEv;
import X.C4MW;
import X.C73969T1h;
import X.C78613UtF;
import X.C792239a;
import X.C88903eI;
import X.C92673kN;
import X.C92723kS;
import X.C92733kT;
import X.C92743kU;
import X.C92873kh;
import X.C99033ud;
import X.InterfaceC65784Pro;
import X.InterfaceC73459SsJ;
import X.InterfaceC92693kP;
import X.InterfaceC92803ka;
import X.T16;
import X.XIA;
import X.XKW;
import X.XKX;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public final class ChatViewModel extends ViewModel {
    public static final /* synthetic */ int LJLLL = 0;
    public final C39Y LJLIL;
    public final AbstractC73946T0k LJLILLLLZI;
    public final AbstractC73946T0k LJLJI;
    public final XKW LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public InterfaceC92693kP LJLJL;
    public final MutableLiveData<AbstractC92763kW<Object>> LJLJLJ;
    public final MutableLiveData<AbstractC92763kW<C109544Rq>> LJLJLLL;
    public final MutableLiveData<AbstractC92763kW<SuggestedReply>> LJLL;
    public long LJLLI;
    public final MutableLiveData<C792239a> LJLLILLLL;
    public final MutableLiveData LJLLJ;

    public ChatViewModel() {
        C92673kN c92673kN = new C92673kN(new C31H());
        AbstractC73946T0k LIZ = T16.LIZ();
        o.LJIIIIZZ(LIZ, "io()");
        AbstractC73946T0k LIZIZ = C73969T1h.LIZIZ();
        XIA ioDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = c92673kN;
        this.LJLILLLLZI = LIZ;
        this.LJLJI = LIZIZ;
        this.LJLJJI = ioDispatcher;
        this.LJLJJL = 100;
        this.LJLJJLL = 1;
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLJLLL = new MutableLiveData<>();
        this.LJLL = new MutableLiveData<>();
        this.LJLLI = -1L;
        MutableLiveData<C792239a> mutableLiveData = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData;
        this.LJLLJ = mutableLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long hv0() {
        C92723kS c92723kS;
        C109544Rq c109544Rq;
        AbstractC92763kW<C109544Rq> value = this.LJLJLLL.getValue();
        if (!(value instanceof C92723kS) || (c92723kS = (C92723kS) value) == null || (c109544Rq = (C109544Rq) c92723kS.LIZ) == null) {
            return null;
        }
        return Long.valueOf(c109544Rq.getMsgId());
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        InterfaceC92693kP interfaceC92693kP;
        super.onCleared();
        InterfaceC92693kP interfaceC92693kP2 = this.LJLJL;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = this.LJLJL) != null) {
            interfaceC92693kP.dispose();
        }
    }

    public final void iv0(C109544Rq c109544Rq) {
        this.LJLJLLL.setValue(new C92723kS(c109544Rq));
    }

    public final void gv0(final long j, final String str, final InterfaceC65784Pro interfaceC65784Pro) {
        InterfaceC92693kP interfaceC92693kP;
        final long currentTimeMillis = System.currentTimeMillis();
        this.LJLLI = currentTimeMillis;
        InterfaceC92693kP interfaceC92693kP2 = this.LJLJL;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = this.LJLJL) != null) {
            interfaceC92693kP.dispose();
        }
        this.LJLJL = AbstractC73638SvC.LJIILLIIL(new Callable() { // from class: X.39Z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ChatViewModel.this.LJLIL.LIZIZ(j, str);
            }
        }).LJJIIJ(this.LJLILLLLZI).LJIJJ(this.LJLJI).LJJ(new InterfaceC73459SsJ() { // from class: X.3kL
            @Override // X.InterfaceC73459SsJ
            public final void accept(Object obj, Object obj2) {
                if (obj != null) {
                    ChatViewModel chatViewModel = this;
                    if (chatViewModel.LJLLI != currentTimeMillis) {
                        return;
                    } else {
                        chatViewModel.LJLJLLL.setValue(new C92723kS(obj));
                    }
                }
                if (obj2 != null) {
                    ChatViewModel chatViewModel2 = this;
                    long j2 = currentTimeMillis;
                    String str2 = str;
                    long j3 = j;
                    if (chatViewModel2.LJLLI != j2) {
                        return;
                    }
                    C85323Wm LIZJ = C05040Hs.LIZJ(str2, "conversationId", "onEventV3");
                    C1HQ LIZIZ = C48339Iy7.LIZIZ("conversation_id", str2);
                    LIZIZ.put("index", String.valueOf(j3));
                    LIZJ.LIZIZ("reply_message_not_found", LIZIZ);
                    chatViewModel2.LJLJLLL.setValue(new C92753kV(obj2));
                }
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
                if (interfaceC65784Pro2 == null) {
                    return;
                }
                interfaceC65784Pro2.invoke();
            }
        });
    }

    public final void kv0(CharSequence charSequence, Aweme aweme, String str, String str2, String str3) {
        int i;
        boolean z;
        this.LJLJJL = 100;
        if (charSequence == null || charSequence.length() == 0 || s.LJZI(charSequence.toString()).toString().length() == 0) {
            this.LJLJJLL = 1;
            this.LJLJLJ.setValue(new C92733kT(1));
            return;
        }
        if (charSequence.length() > 6000) {
            this.LJLJJLL = 2;
            this.LJLJLJ.setValue(new C92733kT(2));
            return;
        }
        this.LJLJLJ.setValue(new C92743kU(charSequence));
        long currentTimeMillis = System.currentTimeMillis();
        TextContent.Companion companion = TextContent.Companion;
        String charSequence2 = charSequence.toString();
        int length = charSequence2.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (o.LJIIJJI(charSequence2.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        TextContent obtainShareReplyContent = companion.obtainShareReplyContent(C132805Jc.LIZJ(length, 1, charSequence2, i2), str, str2, aweme);
        obtainShareReplyContent.setSendStartTime(currentTimeMillis);
        C4MW c4mw = (C4MW) C88903eI.LIZ();
        c4mw.LIZ.LIZIZ = str3;
        c4mw.LIZLLL(obtainShareReplyContent);
        c4mw.LJII(new InterfaceC92803ka() { // from class: X.3kM
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
                ChatViewModel.this.LJLJLJ.setValue(new C92723kS(c109544Rq));
            }

            @Override // X.InterfaceC92803ka
            public final void LJ(C63120Opw c63120Opw, C109544Rq c109544Rq, C63623Oy3 c63623Oy3) {
                ChatViewModel chatViewModel = ChatViewModel.this;
                chatViewModel.LJLJJLL = 3;
                chatViewModel.LJLJLJ.setValue(new C92733kT(c63623Oy3));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void jv0(ChatViewModel chatViewModel, CharSequence charSequence, String str, C99033ud c99033ud, String str2, List list, Map map, int i) {
        boolean z;
        C109544Rq c109544Rq;
        C92723kS c92723kS;
        String str3 = str2;
        C99033ud c99033ud2 = c99033ud;
        List list2 = list;
        Map map2 = map;
        if ((i & 4) != 0) {
            c99033ud2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            list2 = null;
        }
        if ((i & 32) != 0) {
            map2 = null;
        }
        chatViewModel.LJLJJL = 100;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            chatViewModel.LJLJJLL = 3;
            chatViewModel.LJLJLJ.setValue(new C92733kT(3));
            return;
        }
        if (charSequence == null || charSequence.length() == 0 || s.LJZI(charSequence.toString()).toString().length() == 0) {
            chatViewModel.LJLJJLL = 1;
            chatViewModel.LJLJLJ.setValue(new C92733kT(1));
            return;
        }
        if (charSequence.length() > 6000) {
            chatViewModel.LJLJJLL = 2;
            chatViewModel.LJLJLJ.setValue(new C92733kT(2));
            return;
        }
        chatViewModel.LJLJLJ.setValue(new C92743kU(charSequence));
        AbstractC92763kW<C109544Rq> value = chatViewModel.LJLJLLL.getValue();
        if ((value instanceof C92723kS) && (c92723kS = (C92723kS) value) != null) {
            c109544Rq = (C109544Rq) c92723kS.LIZ;
        } else {
            c109544Rq = null;
        }
        XKX.LIZLLL(C48841JEv.LIZ(chatViewModel.LJLJJI), null, null, new C92873kh(chatViewModel, charSequence, str, str3, list2, c99033ud2, c109544Rq, map2, null), 3);
    }
}
