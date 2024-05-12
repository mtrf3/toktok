package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import kotlin.jvm.internal.IDqS426S0100000_1;

/* renamed from: X.4N9, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4N9<ITEM> extends RecyclerView.ViewHolder {
    public IDqS426S0100000_1 LJLIL;
    public final View LJLILLLLZI;
    public final SmartAvatarImageView LJLJI;
    public final TuxIconView LJLJJI;
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final TextView LJLJL;
    public final C71897SJp LJLJLJ;
    public boolean LJLJLLL;
    public C107724Kq LJLL;

    public abstract void L(ITEM item, ITEM item2, int i, C107724Kq c107724Kq);

    public void M() {
        float f;
        View view = this.itemView;
        if (this.LJLJLLL) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        if (r5 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4N9(android.view.View r7) {
        /*
            r6 = this;
            r6.<init>(r7)
            android.view.View r1 = r6.itemView
            r0 = 2131364872(0x7f0a0c08, float:1.8349593E38)
            android.view.View r5 = r1.findViewById(r0)
            r6.LJLILLLLZI = r5
            android.view.View r1 = r6.itemView
            r0 = 2131362898(0x7f0a0452, float:1.834559E38)
            android.view.View r4 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView r4 = (com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView) r4
            r6.LJLJI = r4
            android.view.View r1 = r6.itemView
            r0 = 2131380338(0x7f0a4872, float:1.8380962E38)
            android.view.View r0 = r1.findViewById(r0)
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            r6.LJLJJI = r0
            android.view.View r1 = r6.itemView
            r0 = 2131371854(0x7f0a274e, float:1.8363755E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.LJLJJL = r0
            android.view.View r1 = r6.itemView
            r0 = 2131365489(0x7f0a0e71, float:1.8350845E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.LJLJJLL = r0
            android.view.View r1 = r6.itemView
            r0 = 2131368698(0x7f0a1afa, float:1.8357353E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.LJLJL = r0
            android.view.View r1 = r6.itemView
            r0 = 2131364164(0x7f0a0944, float:1.8348157E38)
            android.view.View r3 = r1.findViewById(r0)
            X.SJp r3 = (X.C71897SJp) r3
            r6.LJLJLJ = r3
            android.view.View r2 = r6.itemView
            java.lang.String r1 = "itemView.context"
            r0 = 2130968606(0x7f04001e, float:1.754587E38)
            java.lang.Integer r0 = X.C19N.LIZIZ(r2, r1, r0)
            if (r0 == 0) goto L95
            int r0 = r0.intValue()
            if (r5 == 0) goto L7c
            r5.setBackgroundColor(r0)
        L72:
            Y.ACListenerS21S0100000_1 r1 = new Y.ACListenerS21S0100000_1
            r0 = 251(0xfb, float:3.52E-43)
            r1.<init>(r6, r0)
            X.C16880lQ.LJIIJ(r1, r5)
        L7c:
            if (r4 == 0) goto L88
            Y.ACListenerS21S0100000_1 r1 = new Y.ACListenerS21S0100000_1
            r0 = 252(0xfc, float:3.53E-43)
            r1.<init>(r6, r0)
            X.C16880lQ.LJJJJL(r4, r1)
        L88:
            if (r3 == 0) goto L94
            Y.ACListenerS21S0100000_1 r1 = new Y.ACListenerS21S0100000_1
            r0 = 253(0xfd, float:3.55E-43)
            r1.<init>(r6, r0)
            X.C16880lQ.LJJJI(r3, r1)
        L94:
            return
        L95:
            if (r5 == 0) goto L7c
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4N9.<init>(android.view.View):void");
    }
}
