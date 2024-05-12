package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageState;
import fjb.a;
import java.util.LinkedHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.typingindicator.timer.TypingStatusSenderTimer$sendTypingEvent$1", f = "TypingStatusSenderTimer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93013kv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93013kv(String str, InterfaceC67352kd<? super C93013kv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93013kv(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long j;
        InterfaceC93033kx interfaceC93033kx;
        MessageState LLLLLZL;
        C141335gf.LIZJ(obj);
        AbstractC90763hI LIZ = C81273Gx.LIZ(this.LJLIL);
        String str = this.LJLIL;
        C63120Opw LIZLLL = LIZ.LIZLLL();
        if (LIZLLL != null && LIZLLL.isGroupChat()) {
            z = true;
        } else {
            z = false;
        }
        Long l = new Long(C81273Gx.LIZLLL(this.LJLIL));
        if (((Boolean) C93023kw.LIZIZ.getValue()).booleanValue()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Long l2 = (Long) ((LinkedHashMap) C93023kw.LJ).get(str);
            if (l2 != null) {
                j = l2.longValue();
            } else {
                j = 0;
            }
            if (elapsedRealtime - j >= ((Number) C93023kw.LIZ.getValue()).longValue()) {
                if (l.longValue() != C54840Lfg.LJJ().LJJLIL() && !z && (interfaceC93033kx = C93023kw.LIZLLL.get(str)) != null && (LLLLLZL = interfaceC93033kx.LLLLLZL()) != null && LLLLLZL.getMsgStatus() != 3) {
                    LIZ.LJIILL();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("real report conversation id: ");
                    C48690J9a.LJIIL(LIZ2, this.LJLIL, LIZ2, "TypingStatusSenderTimer");
                    C93023kw.LJ.put(this.LJLIL, new Long(SystemClock.elapsedRealtime()));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
