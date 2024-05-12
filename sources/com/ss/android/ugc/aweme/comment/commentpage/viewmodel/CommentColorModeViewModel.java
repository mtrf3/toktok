package com.ss.android.ugc.aweme.comment.commentpage.viewmodel;

import X.C16880lQ;
import X.C25600zU;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentColorModeViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJJI = 0;
    public Context LJLIL;
    public LayoutInflater LJLILLLLZI;
    public int LJLJI;

    public final Context gv0(Context context) {
        o.LJIIIZ(context, "context");
        Context context2 = this.LJLIL;
        if (context2 == null) {
            if (this.LJLJI == 2) {
                context = new C25600zU(context, R.style.uw);
            }
            this.LJLIL = context;
            return context;
        }
        return context2;
    }

    public final LayoutInflater hv0(Context context) {
        o.LJIIIZ(context, "context");
        LayoutInflater layoutInflater = this.LJLILLLLZI;
        if (layoutInflater == null) {
            LayoutInflater LLZIL = C16880lQ.LLZIL(gv0(context));
            this.LJLILLLLZI = LLZIL;
            return LLZIL;
        }
        return layoutInflater;
    }
}
