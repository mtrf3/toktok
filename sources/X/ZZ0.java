package X;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import com.google.android.gms.cast.MediaTrack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes29.dex */
public final class ZZ0 extends ArrayAdapter<MediaTrack> implements View.OnClickListener {
    public final Context LJLIL;
    public int LJLILLLLZI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C90133ZYz c90133ZYz = (C90133ZYz) view.getTag();
        QH7.LJIIIIZZ(c90133ZYz);
        Object tag = c90133ZYz.LIZIZ.getTag();
        QH7.LJIIIIZZ(tag);
        this.LJLILLLLZI = ((Integer) tag).intValue();
        notifyDataSetChanged();
    }

    public ZZ0(int i, ActivityC45651qj activityC45651qj, List list) {
        super(activityC45651qj, R.layout.f, list == null ? new ArrayList() : list);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) == false) goto L16;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            r4 = 0
            if (r9 != 0) goto La0
            android.content.Context r1 = r7.LJLIL
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r1 = X.C16880lQ.LLILL(r1, r0)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            X.QH7.LJIIIIZZ(r1)
            r0 = 1812594693(0x6c0a0005, float:6.673274E26)
            android.view.View r9 = X.C16880lQ.LLLLIILL(r1, r0, r10, r4)
            X.ZYz r0 = new X.ZYz
            r1 = 2131377584(0x7f0a3db0, float:1.8375376E38)
            android.view.View r2 = r9.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = 2131374205(0x7f0a307d, float:1.8368523E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r0.<init>(r2, r1)
            r9.setTag(r0)
        L31:
            android.widget.RadioButton r2 = r0.LIZIZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2.setTag(r1)
            android.widget.RadioButton r2 = r0.LIZIZ
            int r1 = r7.LJLILLLLZI
            r5 = 1
            if (r1 != r8) goto L9e
            r1 = 1
        L42:
            r2.setChecked(r1)
            X.C16880lQ.LJIIJ(r7, r9)
            java.lang.Object r6 = r7.getItem(r8)
            com.google.android.gms.cast.MediaTrack r6 = (com.google.android.gms.cast.MediaTrack) r6
            X.QH7.LJIIIIZZ(r6)
            java.lang.String r2 = r6.zzf
            java.lang.String r1 = r6.zzg
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L97
            r3 = 0
        L5c:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L70
            int r2 = r6.zzh
            r1 = 2
            if (r2 != r1) goto L76
            android.content.Context r2 = r7.LJLIL
            r1 = 1812725799(0x6c0c0027, float:6.770013E26)
            java.lang.String r2 = r2.getString(r1)
        L70:
            android.widget.TextView r0 = r0.LIZ
            r0.setText(r2)
            return r9
        L76:
            if (r3 == 0) goto L83
            java.lang.String r2 = r3.getDisplayLanguage()
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L83
            goto L70
        L83:
            android.content.Context r3 = r7.LJLIL
            java.lang.Object[] r2 = new java.lang.Object[r5]
            int r1 = r8 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r4] = r1
            r1 = 1812725800(0x6c0c0028, float:6.770014E26)
            java.lang.String r2 = r3.getString(r1, r2)
            goto L70
        L97:
            java.lang.String r1 = r6.zzg
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r1)
            goto L5c
        L9e:
            r1 = 0
            goto L42
        La0:
            java.lang.Object r0 = r9.getTag()
            X.ZYz r0 = (X.C90133ZYz) r0
            X.QH7.LJIIIIZZ(r0)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ZZ0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
