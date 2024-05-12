package X;

import android.app.Dialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* renamed from: X.Byz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30557Byz {
    public static boolean LJ;
    public static final C5H3<C30557Byz> LJFF = C221108m2.LIZ(EnumC221088m0.NONE, C30560Bz2.LJLIL);
    public long LIZIZ;
    public final PriorityQueue<C30558Bz0> LIZ = new PriorityQueue<>();
    public final Stack<EnumC30559Bz1> LIZJ = new Stack<>();
    public final Stack<String> LIZLLL = new Stack<>();

    public final void LIZLLL() {
        C0NB.LIZIZ("DialogPriorityManager", "onDialogHideAndShowNextPendingDialog");
        if (this.LIZJ.size() > 0) {
            this.LIZJ.pop();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pop stack,showingDialogPriorityStack:");
            LIZ.append(this.LIZJ);
            C0NB.LIZIZ("DialogPriorityManager", X1D.LIZIZ(LIZ));
        }
        if (this.LIZLLL.size() > 0) {
            this.LIZLLL.pop();
        }
        C30558Bz0 peek = this.LIZ.peek();
        if (peek != null && LIZJ(peek.LJLILLLLZI)) {
            C0NB.LIZIZ("DialogPriorityManager", "showNextPendingDialog : show next dialog");
            C16880lQ.LIZ(peek.LJLIL);
            InterfaceC30406BwY interfaceC30406BwY = peek.LJLJJI;
            if (interfaceC30406BwY != null) {
                interfaceC30406BwY.onDialogShow();
            }
            this.LIZ.poll();
            this.LIZJ.add(peek.LJLILLLLZI);
            this.LIZLLL.add(peek.LJLJJL);
            return;
        }
        C0NB.LIZIZ("DialogPriorityManager", "showNextPendingDialog : next dialog is null");
    }

    public C30557Byz() {
        C0NB.LIZIZ("DialogPriorityManager", "DialogPriorityManager init");
        LJ = true;
    }

    public final boolean LIZJ(EnumC30559Bz1 enumC30559Bz1) {
        EnumC30559Bz1 enumC30559Bz12;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkCanShowDialog, dialogPriority:");
        LIZ.append(enumC30559Bz1);
        LIZ.append(",showingDialogPriorityStack:");
        LIZ.append(this.LIZJ);
        C0NB.LIZIZ("DialogPriorityManager", X1D.LIZIZ(LIZ));
        if (this.LIZJ.size() > 0) {
            EnumC30559Bz1 peek = this.LIZJ.peek();
            o.LJIIIIZZ(peek, "{\n            showingDia…ityStack.peek()\n        }");
            enumC30559Bz12 = peek;
        } else {
            enumC30559Bz12 = EnumC30559Bz1.EMPTY;
        }
        if (enumC30559Bz1.getPriorityInt() > enumC30559Bz12.getPriorityInt()) {
            return true;
        }
        return false;
    }

    public final void LIZ(Dialog dialog, EnumC30559Bz1 dialogPriority, InterfaceC30406BwY interfaceC30406BwY, DataChannel dataChannel, String str) {
        boolean z;
        o.LJIIIZ(dialogPriority, "dialogPriority");
        if (dataChannel == null) {
            C0NB.LIZIZ("DialogPriorityManager", " dataChannel == null");
            C16880lQ.LIZ(dialog);
            interfaceC30406BwY.onDialogShow();
            return;
        }
        if (LIZJ(dialogPriority)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("show dialog, dialogPriority:");
            LIZ.append(dialogPriority.getPriorityInt());
            LIZ.append(",showingDialogPriorityStack:");
            LIZ.append(this.LIZJ);
            C0NB.LIZIZ("DialogPriorityManager", X1D.LIZIZ(LIZ));
            C16880lQ.LIZ(dialog);
            interfaceC30406BwY.onDialogShow();
            this.LIZJ.add(dialogPriority);
            this.LIZLLL.add(str);
            return;
        }
        Iterator<C30558Bz0> it = this.LIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                C30558Bz0 next = it.next();
                if (str != null && o.LJ(str, next.LJLJJL)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("existSameDialogTagInPendingList:", str, ",pendingDialogPriorityList:");
            LIZIZ.append(this.LIZ);
            C0NB.LIZIZ("DialogPriorityManager", X1D.LIZIZ(LIZIZ));
            return;
        }
        Iterator<String> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (str != null && o.LJ(str, next2)) {
                StringBuilder LIZIZ2 = C25620zW.LIZIZ("existSameDialogTagInShowingDialogTagStack:", str, ",pendingDialogPriorityList:");
                LIZIZ2.append(this.LIZ);
                C0NB.LIZIZ("DialogPriorityManager", X1D.LIZIZ(LIZIZ2));
                return;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("add pending list, dialogPriority:");
        LIZ2.append(dialogPriority.getPriorityInt());
        LIZ2.append(",showingDialogPriorityStack:");
        LIZ2.append(this.LIZJ);
        C0NB.LIZIZ("DialogPriorityManager", X1D.LIZIZ(LIZ2));
        PriorityQueue<C30558Bz0> priorityQueue = this.LIZ;
        long j = this.LIZIZ;
        this.LIZIZ = 1 + j;
        priorityQueue.add(new C30558Bz0(dialog, dialogPriority, j, interfaceC30406BwY, str));
    }
}
