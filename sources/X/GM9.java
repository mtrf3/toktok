package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GM9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DraftFragment LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ C41425GNp LJLJI;

    public GM9(DraftFragment draftFragment, View view, C41425GNp c41425GNp) {
        this.LJLIL = draftFragment;
        this.LJLILLLLZI = view;
        this.LJLJI = c41425GNp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        DraftFragment draftFragment = this.LJLIL;
        Context context = this.LJLILLLLZI.getContext();
        o.LJIIIIZZ(context, "v.context");
        C41425GNp c41425GNp = this.LJLJI;
        draftFragment.getClass();
        C26227ARb LIZ = C3AW.LIZ(context);
        LIZ.LJFF(null);
        LIZ.LIZIZ(context.getResources().getQuantityString(R.plurals.dj, 1));
        UC0.LIZJ(LIZ, new AqS111S0300000_7(context, draftFragment, c41425GNp, 35));
        LIZ.LJI().LIZLLL();
        dialog.dismiss();
    }
}
