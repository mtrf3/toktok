package X;

import android.content.Context;
import androidx.lifecycle.Observer;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.A6c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25682A6c<T> implements Observer {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ TuxTextView LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public C25682A6c(long j, TuxTextView tuxTextView, Context context, String str, String str2) {
        this.LJLIL = j;
        this.LJLILLLLZI = tuxTextView;
        this.LJLJI = context;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str;
        C254739zB c254739zB = (C254739zB) ((java.util.Map) obj).get(Long.valueOf(this.LJLIL));
        if (c254739zB != null) {
            String str2 = c254739zB.LIZLLL;
            if (str2 == null || str2.length() == 0) {
                str = c254739zB.LIZJ;
            } else {
                str = c254739zB.LIZLLL;
            }
        } else {
            str = null;
        }
        this.LJLILLLLZI.setText(this.LJLJI.getString(R.string.qsp, this.LJLJJI, this.LJLJJL, str));
    }
}
