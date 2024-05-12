package Y;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.AnonymousClass798;
import X.C191937g5;
import X.C26045AKb;
import X.C2U8;
import X.C38891fp;
import X.C64920Pds;
import X.C71Y;
import X.EF7;
import X.InterfaceC64592gB;
import X.InterfaceC73573Su9;
import X.X1D;
import android.util.LruCache;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AfS21S1300000_3 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS21S1300000_3 afS21S1300000_3, Object obj) {
        TextView textView;
        RecyclerView recyclerView;
        AbstractC029409q adapter;
        CollectionDetail Ml = ((CollectionContentFragment) afS21S1300000_3.l1).Ml();
        if (Ml != null) {
            Ml.name = afS21S1300000_3.s0;
        }
        C2U8.LIZ(new C191937g5((CollectionManageRequest) afS21S1300000_3.l2, null));
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) afS21S1300000_3.l3);
        c26045AKb.LJIIIIZZ(R.string.gba);
        c26045AKb.LJIIJ();
        View view = ((CollectionContentFragment) afS21S1300000_3.l1).getView();
        if (view != null && (recyclerView = (RecyclerView) view.findViewById(R.id.bh0)) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemChanged(0);
        }
        View view2 = ((CollectionContentFragment) afS21S1300000_3.l1).getView();
        if (view2 == null || (textView = (TextView) view2.findViewById(R.id.gvs)) == null) {
            return;
        }
        textView.setText(afS21S1300000_3.s0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0149, code lost:
    
        if (r11 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015c, code lost:
    
        if (r5 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS21S1300000_3 r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS21S1300000_3.accept$1(Y.AfS21S1300000_3, java.lang.Object):void");
    }

    public static final void accept$2(AfS21S1300000_3 afS21S1300000_3, Object obj) {
        Throwable it = (Throwable) obj;
        ((LruCache) ((LikeListVM) afS21S1300000_3.l1).LJLJI.getValue()).put(afS21S1300000_3.s0, Boolean.FALSE);
        InterfaceC73573Su9 interfaceC73573Su9 = (InterfaceC73573Su9) afS21S1300000_3.l2;
        if (interfaceC73573Su9 != null) {
            o.LJIIIIZZ(it, "it");
            C38891fp.LJJIIZI(interfaceC73573Su9, it);
        }
        LikeListVM likeListVM = (LikeListVM) afS21S1300000_3.l1;
        o.LJIIIIZZ(it, "it");
        likeListVM.LJLLILLLL.LJI(C64920Pds.LIZ(EF7.LIZIZ(), it));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request error, req:");
        LIZ.append((AnonymousClass798) afS21S1300000_3.l3);
        C71Y.LIZJ("LikeListVM", X1D.LIZIZ(LIZ), it);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS21S1300000_3(X.AnonymousClass798 r2, com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM r3, X.C73433Srt r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r3
            r0.s0 = r5
            r0.l2 = r4
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r2
            r0.s0 = r5
            r0.l3 = r4
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS21S1300000_3.<init>(X.798, com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM, X.Srt, java.lang.String, int):void");
    }

    public AfS21S1300000_3(CollectionContentFragment collectionContentFragment, String str, CollectionManageRequest collectionManageRequest, ActivityC45651qj activityC45651qj, int i) {
        this.$t = i;
        this.l1 = collectionContentFragment;
        this.s0 = str;
        this.l2 = collectionManageRequest;
        this.l3 = activityC45651qj;
    }
}
