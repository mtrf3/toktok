package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U7N implements InterfaceC116954iR<Long> {
    public final /* synthetic */ U7F LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLIL.LJJIIJ(this.LJLILLLLZI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTimerTimeout cancelType:");
        LIZ.append(this.LJLJI);
        U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ));
        U7F u7f = this.LJLIL;
        CopyOnWriteArrayList<U6Y> copyOnWriteArrayList = u7f.LJIIZILJ;
        int i = this.LJLJI;
        long j = this.LJLJJL;
        long j2 = this.LJLILLLLZI;
        Iterator<U6Y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            U6Y next = it.next();
            if (i == U4E.Invite.val) {
                LinkUser.Builder builder = new LinkUser.Builder();
                builder.setRoomId(Long.valueOf(j));
                builder.setUserId(Long.valueOf(j2));
                u7f.LJJIIJZLJL().LJJLIIIJL(builder.build());
                u7f.LJJII(j, j2, null);
                next.LLIIII(j2);
            } else if (i == U4E.Apply.val) {
                u7f.LJJIFFI(j, j2, null);
                next.LJJJLZIJ(j2);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LJJIIJ(this.LJLILLLLZI);
        CopyOnWriteArrayList<U6Y> copyOnWriteArrayList = this.LJLIL.LJIIZILJ;
        int i = this.LJLJI;
        long j = this.LJLILLLLZI;
        Iterator<U6Y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            U6Y next = it.next();
            if (i == U4E.Invite.val) {
                next.LJJJLIIL(j);
            } else if (i == U4E.Apply.val) {
                next.LJJJJI(j);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Long l) {
        long longValue = l.longValue();
        CopyOnWriteArrayList<U6Y> copyOnWriteArrayList = this.LJLIL.LJIIZILJ;
        int i = this.LJLJI;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJJI;
        Iterator<U6Y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            U6Y next = it.next();
            if (i == U4E.Invite.val) {
                next.LLIIIILZ(j, j2 - longValue);
            } else if (i == U4E.Apply.val) {
                next.LJLJL(j, j2 - longValue);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        this.LJLIL.LJIILIIL.put(Long.valueOf(this.LJLILLLLZI), d);
    }

    public U7N(U7F u7f, long j, int i, long j2, long j3) {
        this.LJLIL = u7f;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = j2;
        this.LJLJJL = j3;
    }
}
