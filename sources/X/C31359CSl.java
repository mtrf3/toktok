package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CSl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31359CSl extends AbstractC31361CSn<CSV> {
    public final long LJIILIIL;
    public final C31362CSo LJIILJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC31361CSn
    public final boolean LIZ(CSV csv) {
        CSV pinData = csv;
        o.LJIIIZ(pinData, "pinData");
        CQO<? extends CR6> cqo = pinData.LIZIZ;
        boolean LJI = LJI(pinData.LIZ.LJFF, cqo);
        if (super.LIZ(pinData) && LJI) {
            if (!(cqo instanceof CTT)) {
                return true;
            }
            CTT ctt = (CTT) cqo;
            ctt.LJJIJLIJ(true);
            ctt.LJIIJJI();
            return true;
        }
        return false;
    }

    @Override // X.AbstractC31361CSn
    public final MGetTranslationRequest.Text LIZJ(CSV csv) {
        CSV model = csv;
        o.LJIIIZ(model, "model");
        CRD LIZ = model.LIZ.LIZ();
        if (LIZ instanceof CQJ) {
            this.LJIILJJIL.getClass();
            return C31362CSo.LLLLZ((CQJ) LIZ);
        }
        if (LIZ instanceof InterfaceC31365CSr) {
            return ((InterfaceC31365CSr) LIZ).LJJIJIL();
        }
        return null;
    }

    @Override // X.AbstractC31361CSn
    public final List LIZIZ(List list, java.util.Map map) {
        o.LJIIIZ(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CRD LIZ = ((CSV) it.next()).LIZ.LIZ();
            if (LIZ instanceof CSC) {
                if (LIZ instanceof CTT) {
                    ((CTT) LIZ).LJJIJLIJ(false);
                }
                if (LIZ instanceof CQJ) {
                    this.LJIILJJIL.getClass();
                    C31362CSo.LLLLZIL(map, (CQJ) LIZ);
                } else if (LIZ instanceof InterfaceC31365CSr) {
                    ((InterfaceC31365CSr) LIZ).LJJIIZ(map);
                }
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJI(boolean z, CQO<? extends CR6> t) {
        o.LJIIIZ(t, "t");
        if (t instanceof CQJ) {
            if (z) {
                return false;
            }
            CQJ cqj = (CQJ) t;
            if (cqj.LJJIJ || cqj.LJJIIZI) {
                return false;
            }
            if (!this.LJIIIIZZ) {
                MESSAGE message = cqj.LJIJJLI;
                o.LJII(message, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.ChatMessage");
                String str = ((ChatMessage) message).contentLanguage;
                o.LJIIIIZZ(str, "t.message as ChatMessage).contentLanguage");
                if (str.length() <= 0) {
                    return false;
                }
                MESSAGE message2 = cqj.LJIJJLI;
                o.LJII(message2, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.ChatMessage");
                if (o.LJ(((ChatMessage) message2).contentLanguage, "un")) {
                    return false;
                }
                MESSAGE message3 = cqj.LJIJJLI;
                o.LJII(message3, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.ChatMessage");
                if (o.LJ(((ChatMessage) message3).contentLanguage, this.LJIIL) || ((ChatMessage) cqj.LJIJJLI).userInfo.getId() == this.LJIILIIL) {
                    return false;
                }
            }
            return true;
        }
        if (!(t instanceof CTT)) {
            return false;
        }
        return ((CTT) t).LJJJJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31359CSl(LifecycleOwner lifecycleOwner, long j, long j2, String str, boolean z) {
        super(lifecycleOwner, j, j2, str, true, z, null);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJIILIIL = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        this.LJIILJJIL = new C31362CSo();
    }
}
