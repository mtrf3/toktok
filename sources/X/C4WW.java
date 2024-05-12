package X;

import Y.IDHandlerS14S0100000_1;
import android.os.Handler;
import android.os.Message;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4WW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WW implements C4WV {
    public final HandlerC108084Ma LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public volatile int LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // X.InterfaceC120024nO
    public final void BH(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void CN(C63120Opw c63120Opw) {
    }

    @Override // X.InterfaceC120024nO
    public final void DH(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final int JG() {
        return 0;
    }

    @Override // X.InterfaceC120024nO
    public final void MO(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void Mi(String str, List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void Tu(C63120Opw c63120Opw) {
    }

    @Override // X.C4WP
    public final void dU(java.util.Map<String, C63120Opw> map) {
    }

    @Override // X.InterfaceC120024nO
    public final void f3(C63120Opw c63120Opw) {
    }

    @Override // X.InterfaceC120024nO
    public final void hW(int i, String str) {
    }

    @Override // X.InterfaceC120024nO
    public final void tq0(int i, String str, List list) {
    }

    @Override // X.InterfaceC120024nO
    public final void y9(int i, C63120Opw c63120Opw) {
    }

    public final java.util.Map<String, Integer> LIZLLL() {
        return (java.util.Map) this.LJLJJI.getValue();
    }

    public C4WW(HandlerC108084Ma msgQueue) {
        o.LJIIIZ(msgQueue, "msgQueue");
        this.LJLIL = msgQueue;
        C4WC.LIZIZ.LJFF(this);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1018));
        this.LJLJJI = C221108m2.LIZIZ(C4WZ.LJLIL);
    }

    public final void LIZIZ(String str) {
        Integer remove;
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZIZ = C25620zW.LIZIZ("dequeue before[", str, "]: ");
        LIZIZ.append(LIZLLL().size());
        c114834f1.i("MsgSender_CQ", X1D.LIZIZ(LIZIZ));
        synchronized (LIZLLL()) {
            if (LIZLLL().containsKey(str) && (remove = LIZLLL().remove(str)) != null) {
                int intValue = remove.intValue();
                C4ZL.LIZJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("cancelTimeOut[");
                LIZ.append(str);
                LIZ.append("]: ");
                LIZ.append(intValue);
                C114834f1.LJIIJ("MsgSender_CQ", X1D.LIZIZ(LIZ));
                ((IDHandlerS14S0100000_1) this.LJLILLLLZI.getValue()).removeMessages(intValue);
            }
        }
        C4ZL.LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("dequeue after[");
        LIZ2.append(str);
        LIZ2.append("]: ");
        LIZ2.append(LIZLLL().size());
        c114834f1.i("MsgSender_CQ", X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // X.InterfaceC120024nO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void we0(X.C63120Opw r5) {
        /*
            r4 = this;
            X.C4ZL.LIZJ()
            X.4f1 r2 = X.C114834f1.LIZ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onCreateConversation["
            r1.append(r0)
            r3 = 0
            if (r5 == 0) goto L5d
            java.lang.String r0 = r5.getConversationId()
        L15:
            r1.append(r0)
            java.lang.String r0 = "]: "
            r1.append(r0)
            if (r5 == 0) goto L5b
            boolean r0 = r5.isTemp()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L27:
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "MsgSender_CQ"
            r2.i(r0, r1)
            r2 = 0
            if (r5 == 0) goto L4e
            boolean r1 = r5.isTemp()
            r0 = 1
            if (r1 != r0) goto L50
        L3d:
            X.4Ma r1 = r4.LJLIL
            if (r5 == 0) goto L4c
            java.lang.String r0 = r5.getConversationId()
        L45:
            kotlin.jvm.internal.o.LJI(r0)
            r1.LIZIZ(r0, r2, r3)
            return
        L4c:
            r0 = r3
            goto L45
        L4e:
            r0 = r3
            goto L54
        L50:
            java.lang.String r0 = r5.getConversationId()
        L54:
            kotlin.jvm.internal.o.LJI(r0)
            r4.LIZIZ(r0)
            goto L3d
        L5b:
            r0 = r3
            goto L27
        L5d:
            r0 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4WW.we0(X.Opw):void");
    }

    public final void LIZ(int i, String str) {
        C4ZL.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bookTimeOut[");
        LIZ.append(str);
        LIZ.append("]: ");
        LIZ.append(i);
        C114834f1.LJIIJ("MsgSender_CQ", X1D.LIZIZ(LIZ));
        Message message = new Message();
        message.what = i;
        message.obj = str;
        ((Handler) this.LJLILLLLZI.getValue()).sendMessageDelayed(message, 10000L);
    }

    public final void LIZJ(final String str, boolean z) {
        boolean z2;
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZIZ = C25620zW.LIZIZ("enqueue before[", str, "]: ");
        LIZIZ.append(LIZLLL().size());
        c114834f1.i("MsgSender_CQ", X1D.LIZIZ(LIZIZ));
        synchronized (LIZLLL()) {
            if (!LIZLLL().containsKey(str)) {
                z2 = true;
                this.LJLJI++;
                int i = this.LJLJI;
                LIZLLL().put(str, Integer.valueOf(i));
                LIZ(i, str);
            } else {
                z2 = false;
            }
        }
        C4ZL.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enqueue after[");
        LIZ.append(str);
        LIZ.append("]: ");
        LIZ.append(LIZLLL().size());
        LIZ.append(", ");
        LIZ.append(z2);
        c114834f1.i("MsgSender_CQ", X1D.LIZIZ(LIZ));
        if (z2) {
            if (z) {
                try {
                    long parseLong = CastLongProtector.parseLong(str);
                    C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
                    int i2 = AbstractC63505Ow9.LIZIZ;
                    InterfaceC86963bA<C63120Opw> interfaceC86963bA = new InterfaceC86963bA<C63120Opw>() { // from class: X.4WY
                        @Override // X.InterfaceC86963bA
                        public final void LIZIZ(C63623Oy3 c63623Oy3) {
                            C4ZL.LIZJ();
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("pull conversation[");
                            LIZ2.append(str);
                            LIZ2.append("]: ");
                            LIZ2.append(c63623Oy3);
                            C114834f1.LJIIJJI("MsgSender_CQ", X1D.LIZIZ(LIZ2));
                            this.LIZIZ(str);
                            this.LJLIL.LIZIZ(str, true, c63623Oy3);
                        }

                        @Override // X.InterfaceC86963bA
                        public final void onSuccess(C63120Opw c63120Opw) {
                            C4ZL.LIZJ();
                            C114834f1 c114834f12 = C114834f1.LIZ;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("pull conversation onSuccess[");
                            LIZ2.append(str);
                            LIZ2.append(']');
                            c114834f12.i("MsgSender_CQ", X1D.LIZIZ(LIZ2));
                            this.LIZIZ(str);
                            this.LJLIL.LIZIZ(str, false, null);
                        }
                    };
                    LJIIIZ.getClass();
                    C63356Otk.LJ(1, str, parseLong, i2, interfaceC86963bA);
                    return;
                } catch (NumberFormatException unused) {
                    C4ZL.LIZJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("invalid conversationId: ");
                    LIZ2.append(str);
                    C114834f1.LJIIJJI("MsgSender_CQ", X1D.LIZIZ(LIZ2));
                    return;
                }
            }
            C4ZL.LIZJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("create[");
            LIZ3.append(str);
            LIZ3.append(']');
            C114834f1.LJIIJ("MsgSender_CQ", X1D.LIZIZ(LIZ3));
            String uid = String.valueOf(C120014nN.LIZLLL(str));
            InterfaceC86963bA<C63120Opw> interfaceC86963bA2 = new InterfaceC86963bA<C63120Opw>() { // from class: X.4WX
                @Override // X.InterfaceC86963bA
                public final void LIZIZ(C63623Oy3 c63623Oy3) {
                    C4ZL.LIZJ();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("create onFailure[");
                    LIZ4.append(str);
                    LIZ4.append("]: ");
                    LIZ4.append(c63623Oy3);
                    C114834f1.LJIIJJI("MsgSender_CQ", X1D.LIZIZ(LIZ4));
                    this.LIZIZ(str);
                    this.LJLIL.LIZIZ(str, true, c63623Oy3);
                }

                @Override // X.InterfaceC86963bA
                public final void onSuccess(C63120Opw c63120Opw) {
                    C4ZL.LIZJ();
                    C114834f1 c114834f12 = C114834f1.LIZ;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("create onSuccess[");
                    LIZ4.append(str);
                    LIZ4.append(']');
                    c114834f12.i("MsgSender_CQ", X1D.LIZIZ(LIZ4));
                    C115284fk LJIILIIL = C115284fk.LJIILIIL();
                    String str2 = str;
                    LJIILIIL.getClass();
                    C115284fk.LJJIII(str2);
                }
            };
            o.LJIIIZ(uid, "uid");
            long LJJI = C1GE.LJJI(uid, interfaceC86963bA2);
            if (LJJI > 0) {
                C115284fk.LJIILIIL().LIZIZ(0, LJJI);
                C115284fk.LJFF(LJJI, interfaceC86963bA2);
            }
        }
    }
}
