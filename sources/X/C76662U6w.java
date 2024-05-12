package X;

import Y.IDaS8S1100000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.U6w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76662U6w {
    public final U7T LIZ;
    public final ConcurrentHashMap<String, InterfaceC92693kP> LIZIZ;
    public final ConcurrentHashSet<String> LIZJ;
    public long LIZLLL;
    public final U4Q LJ;

    public C76662U6w(U7T linker) {
        o.LJIIIZ(linker, "linker");
        this.LIZ = linker;
        this.LIZIZ = new ConcurrentHashMap<>();
        this.LIZJ = new ConcurrentHashSet<>();
        this.LIZLLL = 20L;
        U4Q u4q = new U4Q(this);
        this.LJ = u4q;
        linker.LJIIJJI.LJJIJL(u4q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r5.LIZJ.remove(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.List<com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser> r6) {
        /*
            r5 = this;
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<java.lang.String> r0 = r5.LIZJ
            java.util.Iterator r4 = r0.iterator()
            java.lang.String r0 = "arrivedLinkMicIdSet.iterator()"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r3 = r4.next()
            java.util.Iterator r2 = r6.iterator()
        L19:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            java.lang.String r0 = r0.getLinkMicId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto L19
            if (r1 != 0) goto Lb
        L32:
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<java.lang.String> r0 = r5.LIZJ
            r0.remove(r3)
            goto Lb
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76662U6w.LIZ(java.util.List):void");
    }

    public final void LIZIZ(List<LinkUser> list, boolean z) {
        Long userId;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            LinkUser linkUser = (LinkUser) it.next();
            String linkMicId = linkUser.getLinkMicId();
            if (linkMicId != null && (userId = linkUser.getUserId()) != null) {
                long longValue = userId.longValue();
                Long roomId = linkUser.getRoomId();
                if (roomId != null) {
                    long longValue2 = roomId.longValue();
                    Long channelId = linkUser.getChannelId();
                    if (channelId != null) {
                        long longValue3 = channelId.longValue();
                        if (!this.LIZJ.contains(linkMicId) && !this.LIZIZ.containsKey(linkMicId)) {
                            UC7.LJ("start counter linkmicId = ", linkMicId, "NoFirstFrameTimeoutManager");
                            this.LIZIZ.put(linkMicId, new C73440Ss0(AbstractC73672Svk.LJJLIIIJLJLI(this.LIZLLL, TimeUnit.SECONDS).LJJL(C73969T1h.LIZIZ()).LJJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJIJJLI(new C76664U6y(linkMicId, z, this, longValue2, longValue, longValue3)).LJIILLIIL(new IDaS8S1100000_13(this, linkMicId, 8))).LJIIIIZZ().LJIIJJI());
                        }
                    }
                }
            }
        }
    }
}
