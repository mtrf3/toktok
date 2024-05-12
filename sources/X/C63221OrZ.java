package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.OrZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63221OrZ implements InterfaceC99713vj {
    public final String LIZIZ;
    public final C63222Ora LIZJ;

    @Override // X.InterfaceC99713vj
    public final void LIZLLL() {
        C63222Ora c63222Ora = this.LIZJ;
        c63222Ora.getClass();
        C63322OtC.LJFF("MessageModel unregisterAll");
        c63222Ora.LJLILLLLZI.clear();
        if (c63222Ora.LJLJJL) {
            C63322OtC.LJFF("MessageModel unregister multiple observers path");
            synchronized (c63222Ora.LJLJJLL) {
                ((HashSet) c63222Ora.LJLJL).clear();
            }
        } else {
            c63222Ora.LJLJJI = null;
        }
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        LIZLLL.getClass();
        LIZLLL.LJIILLIIL(c63222Ora.LJLIL, c63222Ora);
        ((CopyOnWriteArraySet) C63309Osz.LIZLLL().LJI).remove(c63222Ora);
        if (c63222Ora.LJLLI) {
            C63309Osz LIZLLL2 = C63309Osz.LIZLLL();
            String str = c63222Ora.LJLIL;
            C63237Orp c63237Orp = c63222Ora.LJLLILLLL;
            List list = (List) ((ConcurrentHashMap) LIZLLL2.LJ).get(str);
            if (list != null) {
                list.remove(c63237Orp);
            }
            ((ConcurrentHashMap) LIZLLL2.LJ).put(str, list);
            c63222Ora.LJLLILLLL = null;
        }
        ((CopyOnWriteArraySet) C115944go.LIZJ().LIZ).remove(c63222Ora);
    }

    @Override // X.InterfaceC99713vj
    public final List<C109544Rq> LJ() {
        return this.LIZJ.LIZJ();
    }

    @Override // X.InterfaceC99713vj
    public final void LJFF() {
        this.LIZJ.LJIIJJI();
    }

    @Override // X.InterfaceC99713vj
    public final int LJII() {
        return this.LIZJ.LJLJI;
    }

    @Override // X.InterfaceC99713vj
    public final void resume() {
        C63222Ora c63222Ora = this.LIZJ;
        c63222Ora.getClass();
        C63322OtC.LJFF("MessageModel resume");
        if (c63222Ora.LJLJLJ) {
            C115284fk LJIILIIL = C115284fk.LJIILIIL();
            ((CopyOnWriteArraySet) LJIILIIL.LIZJ).add(c63222Ora.LJLIL);
        }
    }

    @Override // X.InterfaceC99713vj
    public final void stop() {
        C63222Ora c63222Ora = this.LIZJ;
        c63222Ora.getClass();
        C63322OtC.LJFF("MessageModel stop");
        if (c63222Ora.LJLJLJ) {
            C115284fk LJIILIIL = C115284fk.LJIILIIL();
            ((CopyOnWriteArraySet) LJIILIIL.LIZJ).remove(c63222Ora.LJLIL);
        }
        C63228Org c63228Org = c63222Ora.LJZI;
        c63228Org.LJ.removeMessages(c63228Org.LIZIZ);
    }

    @Override // X.InterfaceC99713vj
    public final void refresh() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModelImpl ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" refresh");
        C63322OtC.LIZIZ("MessageModel", X1D.LIZIZ(LIZ));
        this.LIZJ.LJII();
    }

    @Override // X.InterfaceC99713vj
    public final String getConversationId() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC99713vj
    public final void LIZ(InterfaceC99673vf interfaceC99673vf) {
        boolean isEmpty;
        C63222Ora c63222Ora = this.LIZJ;
        c63222Ora.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel register, autoGetConversationInfo:");
        LIZ.append(true);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (c63222Ora.LJLJJL) {
            C63322OtC.LJFF("MessageModel register multiple observers path");
            synchronized (c63222Ora.LJLJJLL) {
                isEmpty = ((HashSet) c63222Ora.LJLJL).isEmpty();
                ((HashSet) c63222Ora.LJLJL).add(interfaceC99673vf);
            }
            if (isEmpty) {
                C63309Osz LIZLLL = C63309Osz.LIZLLL();
                LIZLLL.getClass();
                LIZLLL.LJIILJJIL(c63222Ora.LJLIL, c63222Ora);
                ((CopyOnWriteArraySet) C115944go.LIZJ().LIZ).add(c63222Ora);
            }
            if (c63222Ora.LJLLI) {
                C63309Osz.LIZLLL().LJIILIIL(c63222Ora.LJLIL, c63222Ora.LJLLILLLL);
            }
            C115284fk LJIILIIL = C115284fk.LJIILIIL();
            String str = c63222Ora.LJLIL;
            LJIILIIL.getClass();
            C115284fk.LJJIII(str);
            return;
        }
        c63222Ora.LJLJJI = interfaceC99673vf;
        C63309Osz LIZLLL2 = C63309Osz.LIZLLL();
        LIZLLL2.getClass();
        LIZLLL2.LJIILJJIL(c63222Ora.LJLIL, c63222Ora);
        C115284fk LJIILIIL2 = C115284fk.LJIILIIL();
        String str2 = c63222Ora.LJLIL;
        LJIILIIL2.getClass();
        C115284fk.LJJIII(str2);
        if (c63222Ora.LJLLI) {
            C63309Osz.LIZLLL().LJIILIIL(c63222Ora.LJLIL, c63222Ora.LJLLILLLL);
        }
        ((CopyOnWriteArraySet) C115944go.LIZJ().LIZ).add(c63222Ora);
    }

    @Override // X.InterfaceC99713vj
    public final void LIZIZ(int i) {
        this.LIZJ.LJLJI = i;
    }

    @Override // X.InterfaceC99713vj
    public final void LJI(InterfaceC99673vf observer) {
        o.LJIIIZ(observer, "observer");
        C63222Ora c63222Ora = this.LIZJ;
        if (c63222Ora.LJLJJL) {
            C63322OtC.LJFF("MessageModel unregister one observer in multiple observers path");
            synchronized (c63222Ora.LJLJJLL) {
                ((HashSet) c63222Ora.LJLJL).remove(observer);
            }
        }
    }

    public C63221OrZ(String conversationId, boolean z) {
        o.LJIIIZ(conversationId, "conversationId");
        this.LIZIZ = conversationId;
        C63322OtC.LJI("MessageModel", "MessageModelImpl init", null);
        C114434eN.LJLIL.LJI(true);
        this.LIZJ = new C63222Ora(conversationId, z);
    }

    @Override // X.InterfaceC99713vj
    public final void LIZJ(C109544Rq msg, boolean z, C102033zT c102033zT) {
        o.LJIIIZ(msg, "msg");
        C63222Ora c63222Ora = this.LIZJ;
        c63222Ora.getClass();
        if (!msg.isSelf() || msg.isDeleted() || !C63162Oqc.LIZJ(msg) || TextUtils.isEmpty(msg.getConversationId()) || !msg.getConversationId().equals(c63222Ora.LJLIL) || !msg.isSuccessOrNormal() || !c63222Ora.LJLLI) {
            C63322OtC.LJFF("read_receipt, getMessageReadStatusAsync failed");
            c102033zT.LIZIZ(C63623Oy3.LIZ(C63622Oy2.LIZJ(-1015)));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("read_receipt, getMessageReadStatusAsync, msgSvrId:");
        LIZ.append(msg.getMsgId());
        LIZ.append(", needRequestNet:");
        LIZ.append(z);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - c63222Ora.LJLLL < C63308Osy.LJI().LIZLLL().LJJIII) {
                c63222Ora.LIZLLL(c102033zT, msg);
                return;
            }
            c63222Ora.LJLLL = currentTimeMillis;
            C115284fk LJIILIIL = C115284fk.LJIILIIL();
            String conversationId = msg.getConversationId();
            C63227Orf c63227Orf = new C63227Orf(c102033zT, msg, c63222Ora);
            LJIILIIL.getClass();
            C63356Otk.LJIIIZ().getClass();
            C63235Orn c63235Orn = new C63235Orn(c63227Orf);
            C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(conversationId);
            if (LJIIIZ == null || LJIIIZ.isLocal()) {
                c63235Orn.LIZIZ(C63622Oy2.LIZJ(-1017));
                return;
            }
            C63484Ovo c63484Ovo = new C63484Ovo();
            c63484Ovo.LIZLLL = Long.valueOf(LJIIIZ.getConversationShortId());
            c63484Ovo.LJ = Integer.valueOf(LJIIIZ.getConversationType());
            c63484Ovo.LJFF = LJIIIZ.getConversationId();
            GetConversationParticipantsReadIndexV3RequestBody build = c63484Ovo.build();
            C89453Z8v c89453Z8v = new C89453Z8v();
            c89453Z8v.LJJJJZ = build;
            c63235Orn.LJIIJJI(LJIIIZ.getInboxType(), c89453Z8v.build(), null, LJIIIZ);
            return;
        }
        c63222Ora.LIZLLL(c102033zT, msg);
    }
}
