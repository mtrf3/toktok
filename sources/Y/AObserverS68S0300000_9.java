package Y;

import X.C116144h8;
import X.C56769MPt;
import X.C72808Sho;
import X.EnumC94693nd;
import X.InterfaceC57784Mm4;
import X.InterfaceC73573Su9;
import X.MPV;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AObserverS68S0300000_9 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0117, code lost:
    
        if (r3.isEmpty() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0119, code lost:
    
        X.C79603Am.LIZ(r6, r4, r3.size(), androidx.lifecycle.ViewModelKt.getViewModelScope((com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM) r7.l0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0128, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0146, code lost:
    
        r2 = r3.iterator();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014f, code lost:
    
        if (r2.hasNext() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015e, code lost:
    
        if (((X.C116144h8) r2.next()).LJLIL.getFollowStatus() != 2) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0160, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0162, code lost:
    
        if (r4 < 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01f8, code lost:
    
        X.C47261Igj.LJJJJIZL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01fb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
    
        if (r2 != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.concurrent.CopyOnWriteArrayList<X.4h8>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$0(Y.AObserverS68S0300000_9 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS68S0300000_9.onChanged$0(Y.AObserverS68S0300000_9, java.lang.Object):void");
    }

    public static final void onChanged$1(AObserverS68S0300000_9 aObserverS68S0300000_9, Object obj) {
        EnumC94693nd enumC94693nd = (EnumC94693nd) obj;
        if (enumC94693nd != EnumC94693nd.LOADING) {
            MPV mpv = (MPV) aObserverS68S0300000_9.l0;
            InterfaceC73573Su9<C56769MPt<List<MusNotice>>> it = (InterfaceC73573Su9) aObserverS68S0300000_9.l1;
            o.LJIIIIZZ(it, "it");
            mpv.LIZLLL(enumC94693nd, it);
            ((LiveData) aObserverS68S0300000_9.l2).removeObserver(aObserverS68S0300000_9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS68S0300000_9(Object obj, InboxTopHorizontalListVM inboxTopHorizontalListVM, C116144h8 c116144h8, C72808Sho<InterfaceC57784Mm4> c72808Sho) {
        this.$t = c72808Sho;
        this.l0 = obj;
        this.l1 = inboxTopHorizontalListVM;
        this.l2 = c116144h8;
    }
}
