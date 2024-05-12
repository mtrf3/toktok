package kotlin.jvm.internal;

import X.AbstractC41872Gc0;
import X.AbstractC42983Gtv;
import X.AbstractC43456H3s;
import X.AbstractC65781Prl;
import X.C113764dI;
import X.C36937Eeb;
import X.C41767GaJ;
import X.C41875Gc3;
import X.C42360Gjs;
import X.C42985Gtx;
import X.C65352Pkq;
import X.C76800UCe;
import X.C78889Uxh;
import X.C87607YZv;
import X.C87611YZz;
import X.C87612Ya0;
import X.C87614Ya2;
import X.C87616Ya4;
import X.C87618Ya6;
import X.C87623YaB;
import X.C8V3;
import X.ERR;
import X.EnumC113744dG;
import X.InterfaceC36938Eec;
import X.InterfaceC65350Pko;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputBaseAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.ChatRoomInputEmojiButtonAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.ChatRoomInputEmojiButtonRedDotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.ChatRoomInputMentionButtonAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.IMInputSendButtonAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.ChatRoomCameraAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.suggestedemoji.SuggestedEmojiAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes17.dex */
public class AqS147S0200000_16 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
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
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        C36937Eeb c36937Eeb = ((C87614Ya2) aqS147S0200000_16.l0).LIZ;
        InterfaceC36938Eec observer = (InterfaceC36938Eec) aqS147S0200000_16.l1;
        c36937Eeb.getClass();
        o.LJIIIZ(observer, "observer");
        ((ArrayList) c36937Eeb.LIZ).add(observer);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        ((C87614Ya2) aqS147S0200000_16.l0).LJI.LJIIL(new C42985Gtx(aqS147S0200000_16.l1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        AbstractC43456H3s abstractC43456H3s = ((C87612Ya0) aqS147S0200000_16.l0).LIZJ;
        if (abstractC43456H3s != null) {
            abstractC43456H3s.LIZIZ(aqS147S0200000_16.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        C87607YZv c87607YZv = ((C87616Ya4) aqS147S0200000_16.l0).LJLIL.LJI;
        Object obj = ((C87616Ya4) aqS147S0200000_16.l0).LJLIL.LJII;
        Throwable th = (Throwable) aqS147S0200000_16.l1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("actionName:");
        LIZ.append(((C87616Ya4) aqS147S0200000_16.l0).LJLJI);
        c87607YZv.LJIIJJI(new C42360Gjs(obj, th, 777004, X1D.LIZIZ(LIZ)), new C41875Gc3(0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS147S0200000_16 aqS147S0200000_16, Object obj) {
        C8V3 uiContentAssem = (C8V3) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LJII = ((ChatRoomInputBaseAssem) aqS147S0200000_16.l0).getContainerView().findViewById(R.id.b9v);
        InterfaceC65350Pko interfaceC65350Pko = ((C78889Uxh) aqS147S0200000_16.l1).LIZIZ;
        if (interfaceC65350Pko == null) {
            interfaceC65350Pko = C65352Pkq.LIZ(ChatRoomCameraAssem.class);
        }
        uiContentAssem.LIZ = interfaceC65350Pko;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS147S0200000_16 aqS147S0200000_16, Object obj) {
        C8V3 uiContentAssem = (C8V3) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LJII = ((ChatRoomInputBaseAssem) aqS147S0200000_16.l0).getContainerView().findViewById(R.id.cu2);
        InterfaceC65350Pko interfaceC65350Pko = ((C78889Uxh) aqS147S0200000_16.l1).LIZIZ;
        if (interfaceC65350Pko == null) {
            interfaceC65350Pko = C65352Pkq.LIZ(ChatRoomInputEmojiButtonAssem.class);
        }
        uiContentAssem.LIZ = interfaceC65350Pko;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS147S0200000_16 aqS147S0200000_16, Object obj) {
        C8V3 uiContentAssem = (C8V3) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LJII = ((ChatRoomInputBaseAssem) aqS147S0200000_16.l0).getContainerView().findViewById(R.id.cu3);
        InterfaceC65350Pko interfaceC65350Pko = ((C78889Uxh) aqS147S0200000_16.l1).LIZIZ;
        if (interfaceC65350Pko == null) {
            interfaceC65350Pko = C65352Pkq.LIZ(ChatRoomInputEmojiButtonRedDotAssem.class);
        }
        uiContentAssem.LIZ = interfaceC65350Pko;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS147S0200000_16 aqS147S0200000_16, Object obj) {
        C8V3 uiContentAssem = (C8V3) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LJII = ((ChatRoomInputBaseAssem) aqS147S0200000_16.l0).getContainerView().findViewById(R.id.iwc);
        InterfaceC65350Pko interfaceC65350Pko = ((C78889Uxh) aqS147S0200000_16.l1).LIZIZ;
        if (interfaceC65350Pko == null) {
            interfaceC65350Pko = C65352Pkq.LIZ(MessageReplyAssem.class);
        }
        uiContentAssem.LIZ = interfaceC65350Pko;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS147S0200000_16 aqS147S0200000_16, Object obj) {
        C8V3 uiContentAssem = (C8V3) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LJII = ((ChatRoomInputBaseAssem) aqS147S0200000_16.l0).getContainerView().findViewById(R.id.gha);
        InterfaceC65350Pko interfaceC65350Pko = ((C78889Uxh) aqS147S0200000_16.l1).LIZIZ;
        if (interfaceC65350Pko == null) {
            interfaceC65350Pko = C65352Pkq.LIZ(ChatRoomInputMentionButtonAssem.class);
        }
        uiContentAssem.LIZ = interfaceC65350Pko;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS147S0200000_16 aqS147S0200000_16, Object obj) {
        C8V3 uiContentAssem = (C8V3) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LJII = ((ChatRoomInputBaseAssem) aqS147S0200000_16.l0).getContainerView().findViewById(R.id.jo1);
        InterfaceC65350Pko interfaceC65350Pko = ((C78889Uxh) aqS147S0200000_16.l1).LIZIZ;
        if (interfaceC65350Pko == null) {
            interfaceC65350Pko = C65352Pkq.LIZ(IMInputSendButtonAssem.class);
        }
        uiContentAssem.LIZ = interfaceC65350Pko;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS147S0200000_16 aqS147S0200000_16, Object obj) {
        C8V3 uiContentAssem = (C8V3) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LJII = ((ChatRoomInputBaseAssem) aqS147S0200000_16.l0).getContainerView();
        InterfaceC65350Pko interfaceC65350Pko = ((C78889Uxh) aqS147S0200000_16.l1).LIZIZ;
        if (interfaceC65350Pko == null) {
            interfaceC65350Pko = C65352Pkq.LIZ(SuggestedEmojiAssem.class);
        }
        uiContentAssem.LIZ = interfaceC65350Pko;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$19(AqS147S0200000_16 aqS147S0200000_16, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        ChatRoomInputBaseAssem chatRoomInputBaseAssem = (ChatRoomInputBaseAssem) aqS147S0200000_16.l0;
        assemble.wv0(chatRoomInputBaseAssem, new AqS169S0100000_3(chatRoomInputBaseAssem, 833));
        ChatRoomInputBaseAssem chatRoomInputBaseAssem2 = (ChatRoomInputBaseAssem) aqS147S0200000_16.l0;
        assemble.wv0(chatRoomInputBaseAssem2, new AqS169S0100000_3(chatRoomInputBaseAssem2, 834));
        for (C78889Uxh c78889Uxh : (Set) aqS147S0200000_16.l1) {
            switch (C113764dI.LIZ[((EnumC113744dG) c78889Uxh.LIZ).ordinal()]) {
                case 1:
                    ChatRoomInputBaseAssem chatRoomInputBaseAssem3 = (ChatRoomInputBaseAssem) aqS147S0200000_16.l0;
                    assemble.wv0(chatRoomInputBaseAssem3, new AqS147S0200000_16(chatRoomInputBaseAssem3, (ChatRoomInputBaseAssem) c78889Uxh, (C78889Uxh<EnumC113744dG>) 12));
                    break;
                case 2:
                    ChatRoomInputBaseAssem chatRoomInputBaseAssem4 = (ChatRoomInputBaseAssem) aqS147S0200000_16.l0;
                    assemble.wv0(chatRoomInputBaseAssem4, new AqS147S0200000_16(chatRoomInputBaseAssem4, (ChatRoomInputBaseAssem) c78889Uxh, (C78889Uxh<EnumC113744dG>) 13));
                    break;
                case 3:
                    ChatRoomInputBaseAssem chatRoomInputBaseAssem5 = (ChatRoomInputBaseAssem) aqS147S0200000_16.l0;
                    assemble.wv0(chatRoomInputBaseAssem5, new AqS147S0200000_16(chatRoomInputBaseAssem5, (ChatRoomInputBaseAssem) c78889Uxh, (C78889Uxh<EnumC113744dG>) 14));
                    break;
                case 4:
                    ChatRoomInputBaseAssem chatRoomInputBaseAssem6 = (ChatRoomInputBaseAssem) aqS147S0200000_16.l0;
                    assemble.wv0(chatRoomInputBaseAssem6, new AqS147S0200000_16(chatRoomInputBaseAssem6, (ChatRoomInputBaseAssem) c78889Uxh, (C78889Uxh<EnumC113744dG>) 15));
                    break;
                case 5:
                    ChatRoomInputBaseAssem chatRoomInputBaseAssem7 = (ChatRoomInputBaseAssem) aqS147S0200000_16.l0;
                    assemble.wv0(chatRoomInputBaseAssem7, new AqS147S0200000_16(chatRoomInputBaseAssem7, (ChatRoomInputBaseAssem) c78889Uxh, (C78889Uxh<EnumC113744dG>) 16));
                    break;
                case 6:
                    ChatRoomInputBaseAssem chatRoomInputBaseAssem8 = (ChatRoomInputBaseAssem) aqS147S0200000_16.l0;
                    assemble.wv0(chatRoomInputBaseAssem8, new AqS147S0200000_16(chatRoomInputBaseAssem8, (ChatRoomInputBaseAssem) c78889Uxh, (C78889Uxh<EnumC113744dG>) 17));
                    break;
                case 7:
                    ChatRoomInputBaseAssem chatRoomInputBaseAssem9 = (ChatRoomInputBaseAssem) aqS147S0200000_16.l0;
                    assemble.wv0(chatRoomInputBaseAssem9, new AqS147S0200000_16(chatRoomInputBaseAssem9, (ChatRoomInputBaseAssem) c78889Uxh, (C78889Uxh<EnumC113744dG>) 18));
                    break;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        ((C87614Ya2) aqS147S0200000_16.l0).LIZ.onEvent((AbstractC41872Gc0) aqS147S0200000_16.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        ((C87614Ya2) aqS147S0200000_16.l0).LJI.LJII(aqS147S0200000_16.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        ((C87614Ya2) aqS147S0200000_16.l0).LJI.LJI(aqS147S0200000_16.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        C87612Ya0 c87612Ya0 = ((C87611YZz) aqS147S0200000_16.l0).LIZ;
        AbstractC43456H3s abstractC43456H3s = c87612Ya0.LIZJ;
        o.LJI(abstractC43456H3s);
        c87612Ya0.LIZLLL = abstractC43456H3s.LIZ((AbstractC42983Gtv) aqS147S0200000_16.l1, new C87623YaB(((C87611YZz) aqS147S0200000_16.l0).LIZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        C87612Ya0 c87612Ya0 = ((C87611YZz) aqS147S0200000_16.l0).LIZ;
        AbstractC43456H3s abstractC43456H3s = c87612Ya0.LIZJ;
        o.LJI(abstractC43456H3s);
        c87612Ya0.LJ = abstractC43456H3s.LIZJ(aqS147S0200000_16.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        AbstractC43456H3s abstractC43456H3s = ((C87611YZz) aqS147S0200000_16.l0).LIZ.LIZJ;
        o.LJI(abstractC43456H3s);
        abstractC43456H3s.LIZLLL(aqS147S0200000_16.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        C87612Ya0 c87612Ya0 = ((C87611YZz) aqS147S0200000_16.l0).LIZ;
        c87612Ya0.LIZJ = c87612Ya0.LJIIIIZZ.invoke();
        AbstractC43456H3s abstractC43456H3s = ((C87611YZz) aqS147S0200000_16.l0).LIZ.LIZJ;
        o.LJI(abstractC43456H3s);
        abstractC43456H3s.LJ((ERR) aqS147S0200000_16.l1, new C87618Ya6(((C87611YZz) aqS147S0200000_16.l0).LIZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS147S0200000_16 aqS147S0200000_16, Object it) {
        o.LJIIIZ(it, "it");
        ((C87623YaB) aqS147S0200000_16.l0).LIZ.LJI.LIZ(aqS147S0200000_16.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS147S0200000_16(C87611YZz c87611YZz, ERR err, int i) {
        super(1);
        this.$t = i;
        this.l0 = c87611YZz;
        this.l1 = err;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS147S0200000_16(C87611YZz c87611YZz, AbstractC42983Gtv abstractC42983Gtv, int i) {
        super(1);
        this.$t = i;
        this.l0 = c87611YZz;
        this.l1 = abstractC42983Gtv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS147S0200000_16(C87611YZz c87611YZz, Object obj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c87611YZz;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS147S0200000_16(C87612Ya0 c87612Ya0, Object obj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c87612Ya0;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS147S0200000_16(C87614Ya2 c87614Ya2, InterfaceC36938Eec interfaceC36938Eec, int i) {
        super(1);
        this.$t = i;
        this.l0 = c87614Ya2;
        this.l1 = interfaceC36938Eec;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS147S0200000_16(C87614Ya2 c87614Ya2, AbstractC41872Gc0 abstractC41872Gc0, int i) {
        super(1);
        this.$t = i;
        this.l0 = c87614Ya2;
        this.l1 = abstractC41872Gc0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS147S0200000_16(C87614Ya2 c87614Ya2, Object obj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c87614Ya2;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS147S0200000_16(C87616Ya4 c87616Ya4, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.l0 = c87616Ya4;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS147S0200000_16(C87623YaB c87623YaB, C41767GaJ c41767GaJ, int i) {
        super(1);
        this.$t = i;
        this.l0 = c87623YaB;
        this.l1 = c41767GaJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS147S0200000_16(ChatRoomInputBaseAssem chatRoomInputBaseAssem, ChatRoomInputBaseAssem chatRoomInputBaseAssem2, C78889Uxh<EnumC113744dG> c78889Uxh) {
        super(1);
        this.$t = c78889Uxh;
        this.l0 = chatRoomInputBaseAssem;
        this.l1 = chatRoomInputBaseAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS147S0200000_16(ChatRoomInputBaseAssem chatRoomInputBaseAssem, ChatRoomInputBaseAssem chatRoomInputBaseAssem2, Set<C78889Uxh<EnumC113744dG>> set) {
        super(1);
        this.$t = set;
        this.l0 = chatRoomInputBaseAssem;
        this.l1 = chatRoomInputBaseAssem2;
    }
}
