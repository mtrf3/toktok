package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.FriendPostBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116124h6 extends AbstractC116364hU<C116114h5> {
    public final List<FriendPostBean> LIZJ;
    public final List<FriendPostBean> LIZLLL;

    @Override // X.AbstractC116364hU
    public final Object LIZJ() {
        List<FriendPostBean> list = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            FriendPostBean friendPostBean = (FriendPostBean) next;
            if (this.LIZ.LJFF(friendPostBean.getPriority(), String.valueOf(friendPostBean.getUid()))) {
                this.LIZ.LIZ().put(String.valueOf(friendPostBean.getUid()), new Integer(friendPostBean.getPriority()));
                arrayList.add(next);
            } else if (!friendPostBean.getAllRead()) {
                ((ArrayList) this.LIZLLL).add(friendPostBean);
            }
        }
        return this;
    }

    @Override // X.AbstractC116364hU
    public final Object LIZLLL() {
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            FriendPostBean friendPostBean = (FriendPostBean) it.next();
            List<T> list = this.LIZIZ;
            String valueOf = String.valueOf(friendPostBean.getUid());
            boolean allRead = friendPostBean.getAllRead();
            ArrayList arrayList = new ArrayList();
            List<Aweme> aweme = friendPostBean.getAweme();
            if (aweme != null) {
                arrayList.addAll(aweme);
            }
            list.add(new C116114h5(new C61262ao(friendPostBean.getPriority(), valueOf, arrayList, allRead)));
        }
        return this;
    }

    @Override // X.AbstractC116364hU
    public final C76800UCe LIZ() {
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116124h6(InterfaceC116134h7 ft) {
        super(ft);
        o.LJIIIZ(ft, "ft");
        boolean z = ft.LIZJ() instanceof SkylightMediaListViewModel;
        this.LIZJ = new ArrayList();
        this.LIZLLL = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r4 != null) goto L12;
     */
    @Override // X.AbstractC116364hU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.AbstractC116364hU<X.C116114h5>> r8) {
        /*
            r7 = this;
            java.util.List<com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.FriendPostBean> r0 = r7.LIZJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<T extends X.Mm4> r0 = r7.LIZIZ
            r0.clear()
            java.util.List<com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.FriendPostBean> r0 = r7.LIZLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            X.4h7 r0 = r7.LIZ
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod r0 = r0.LJII()
            com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightFriendPostResponse r4 = r0.getFriendsPost()
            r6 = 0
            if (r4 == 0) goto L82
            java.util.List r5 = r4.getUnReadBlock()
            if (r5 == 0) goto L46
            java.util.Iterator r3 = r5.iterator()
        L2a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.FriendPostBean r2 = (com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.FriendPostBean) r2
            r0 = 0
            r2.setAllRead(r0)
            X.4h7 r1 = r7.LIZ
            r0 = 104(0x68, float:1.46E-43)
            int r0 = r1.LJI(r0)
            r2.setPriority(r0)
            goto L2a
        L46:
            r5 = r6
            if (r4 == 0) goto L70
        L49:
            java.util.List r4 = r4.getAllReadUserBlock()
            if (r4 == 0) goto L70
            java.util.Iterator r3 = r4.iterator()
        L53:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.FriendPostBean r2 = (com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.FriendPostBean) r2
            r0 = 1
            r2.setAllRead(r0)
            X.4h7 r1 = r7.LIZ
            r0 = 105(0x69, float:1.47E-43)
            int r0 = r1.LJI(r0)
            r2.setPriority(r0)
            goto L53
        L6f:
            r6 = r4
        L70:
            if (r5 == 0) goto L79
            java.util.List<com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.FriendPostBean> r0 = r7.LIZJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r5)
        L79:
            if (r6 == 0) goto L82
            java.util.List<com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.FriendPostBean> r0 = r7.LIZJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r6)
        L82:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116124h6.LIZIZ(X.2kd):java.lang.Object");
    }
}
