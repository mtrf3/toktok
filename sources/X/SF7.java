package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS194S0100000_12;

/* loaded from: classes13.dex */
public final class SF7 extends ArrayAdapter<CpfElem> {
    public final int LJLIL;
    public final List<CpfElem> LJLILLLLZI;
    public AqS194S0100000_12 LJLJI;
    public String LJLJJI;

    public SF7(Context context, List list) {
        super(context, R.layout.a0w, list);
        this.LJLIL = R.layout.a0w;
        this.LJLILLLLZI = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L17;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            android.content.Context r0 = r9.getContext()
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r0)
            int r0 = r9.LJLIL
            r7 = 0
            android.view.View r2 = X.C16880lQ.LLLLIILL(r1, r0, r12, r7)
            r0 = 2131378704(0x7f0a4210, float:1.8377648E38)
            android.view.View r6 = r2.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r6 = (com.bytedance.tux.input.TuxTextView) r6
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem> r0 = r9.LJLILLLLZI
            java.lang.Object r4 = X.ORZ.LJLLLLLL(r10, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem r4 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem) r4
            if (r4 == 0) goto L89
            java.lang.String r5 = r4.maskCode
            java.lang.String r0 = r9.LJLJJI
            if (r0 == 0) goto L85
            if (r5 == 0) goto L85
            boolean r1 = ujb.s.LJJJLZIJ(r5, r0, r7)
            r0 = 1
            if (r1 != r0) goto L85
            java.lang.String r3 = r9.LJLJJI
            java.lang.String r1 = "Required value was null."
            if (r3 == 0) goto L99
            r0 = 6
            int r8 = ujb.s.LJJLIIIJL(r5, r3, r7, r7, r0)
            java.lang.String r0 = r9.LJLJJI
            if (r0 == 0) goto L90
            int r7 = r0.length()
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r5)
            android.content.Context r1 = r9.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 2130968757(0x7f0400b5, float:1.7546177E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r1)
            if (r0 == 0) goto L78
            int r0 = r0.intValue()
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r7 = r7 + r8
            r0 = 33
            r3.setSpan(r1, r8, r7, r0)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r6.setText(r3, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L7b
        L78:
            r6.setText(r5)
        L7b:
            com.ss.android.ugc.aweme.utils.Au2S3S0201000_12 r1 = new com.ss.android.ugc.aweme.utils.Au2S3S0201000_12
            r0 = 5
            r1.<init>(r9, r4, r10, r0)
            X.C16880lQ.LJIIJ(r1, r2)
        L84:
            return r2
        L85:
            r6.setText(r5)
            goto L7b
        L89:
            r1 = 4
            java.lang.String r0 = "cpfInfo is null"
            X.C36746EbW.LIZ(r1, r0)
            goto L84
        L90:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L99:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SF7.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
