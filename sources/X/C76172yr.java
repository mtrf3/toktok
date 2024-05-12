package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.2yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76172yr implements InterfaceC99483vM, InterfaceC76242yy {
    public final String LIZ;
    public final ConcurrentHashMap<Integer, FakeMessageContent> LIZIZ;
    public final ConcurrentHashMap<Integer, FakeMessage> LIZJ;
    public volatile boolean LIZLLL;
    public InterfaceC99673vf LJ;

    public final void LJFF() {
        synchronized (this) {
            if (this.LIZLLL) {
                C34B.LJI("FakeMessageModel", "createMessageLocked: isQuerying");
            } else {
                this.LIZLLL = true;
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C76152yp(this, null), 3);
            }
        }
    }

    @Override // X.InterfaceC99483vM
    public final void LIZIZ() {
        ((CopyOnWriteArraySet) C76212yv.LIZIZ.getValue()).remove(this);
        this.LJ = null;
    }

    @Override // X.InterfaceC76242yy
    public final void LIZJ() {
        C34B.LJI("FakeMessageModel", "onFakeMessageFactoryRegister");
        LJFF();
    }

    @Override // X.InterfaceC76242yy
    public final void LIZLLL() {
        C34B.LJI("FakeMessageModel", "onFakeMessageUpdate");
        LJFF();
    }

    @Override // X.InterfaceC99483vM
    public final void refresh() {
        C34B.LJI("FakeMessageModel", "start refresh");
        LJFF();
    }

    @Override // X.InterfaceC99483vM
    public final List<C109544Rq> LJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getFakeMessages, size=");
        LIZ.append(this.LIZJ.values().size());
        C34B.LJI("FakeMessageModel", X1D.LIZIZ(LIZ));
        InterfaceC76162yq LIZ2 = C76212yv.LIZ(this.LIZ);
        if (LIZ2 == null) {
            return C61878OQg.INSTANCE;
        }
        Collection<FakeMessage> values = this.LIZJ.values();
        o.LJIIIIZZ(values, "insertedFakeMessages.values");
        ArrayList arrayList = new ArrayList();
        for (FakeMessage fakeMessage : values) {
            if (LIZ2.ru()) {
                arrayList.add(fakeMessage);
            }
        }
        return arrayList;
    }

    public C76172yr(String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        this.LIZ = conversationId;
        this.LIZIZ = new ConcurrentHashMap<>();
        this.LIZJ = new ConcurrentHashMap<>();
    }

    @Override // X.InterfaceC99483vM
    public final void LIZ(InterfaceC99673vf interfaceC99673vf) {
        ((CopyOnWriteArraySet) C76212yv.LIZIZ.getValue()).add(this);
        this.LJ = interfaceC99673vf;
    }
}
