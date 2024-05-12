package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TuI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76130TuI implements InterfaceC75973Trl {
    public final /* synthetic */ U64 LIZ;

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJI(String str) {
        return null;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJIIJ(InterfaceC75804Tp2 seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJIJI(long j) {
        return null;
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJIL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return null;
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJJ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return null;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJIFFI() {
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJJIII(long j) {
        return null;
    }

    @Override // X.InterfaceC75973Trl
    public final String LJJIIJ() {
        return "";
    }

    @Override // X.InterfaceC75973Trl
    public final Long LJJIJIIJI() {
        return null;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJIJL(U87 listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJIL(U87 listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJJ(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC75973Trl
    public final long LJJJJJL(long j) {
        return 0L;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJJLI(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC75973Trl
    public final void reset() {
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> K9() {
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null) {
            List<LinkUser> K9 = u66.LLZZ().K9();
            if (K9 == null) {
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                if (c61878OQg != null) {
                    return c61878OQg;
                }
            } else {
                return K9;
            }
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIIZI() {
        InterfaceC75973Trl LLZZ;
        List<LinkUser> LJJIIZI;
        U66 u66 = this.LIZ.LJLLI;
        if (u66 == null || (LLZZ = u66.LLZZ()) == null || (LJJIIZI = LLZZ.LJJIIZI()) == null) {
            return C61878OQg.INSTANCE;
        }
        return LJJIIZI;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJIJ() {
        InterfaceC75973Trl LLZZ;
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLZZ = u66.LLZZ()) != null) {
            LLZZ.LJJIJ();
        }
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJJ() {
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null) {
            List<LinkUser> LJJJ = u66.LLZZ().LJJJ();
            if (LJJJ == null) {
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                if (c61878OQg != null) {
                    return c61878OQg;
                }
            } else {
                return LJJJ;
            }
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJFF() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIJIIJIL() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIJIL() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIJLIJ() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJIZ() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC75973Trl
    public final List<LinkUser> LJJJJZ() {
        return C61878OQg.INSTANCE;
    }

    public C76130TuI(U64 u64) {
        this.LIZ = u64;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJIL(List<LinkUser> list) {
        InterfaceC75973Trl LLZZ;
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLZZ = u66.LLZZ()) != null) {
            LLZZ.LJJJIL(list);
        }
    }

    @Override // X.InterfaceC75973Trl
    public final LinkUser LJJJJL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return null;
    }

    @Override // X.InterfaceC75973Trl
    public final void LJJJJLL(int i, List linkedList) {
        InterfaceC75973Trl LLZZ;
        o.LJIIIZ(linkedList, "linkedList");
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null && (LLZZ = u66.LLZZ()) != null) {
            LLZZ.LJJJJLL(i, linkedList);
        }
    }
}
