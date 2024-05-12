package X;

import android.content.Context;

/* renamed from: X.CdP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31767CdP {
    public final Context LIZ;
    public CharSequence LIZIZ;
    public boolean LIZJ;

    public final DialogC31813Ce9 LIZ() {
        DialogC31813Ce9 dialogC31813Ce9 = new DialogC31813Ce9(this.LIZ);
        dialogC31813Ce9.LJLILLLLZI = this.LIZIZ;
        dialogC31813Ce9.setOnCancelListener(null);
        dialogC31813Ce9.setOnDismissListener(null);
        dialogC31813Ce9.setOnShowListener(null);
        dialogC31813Ce9.setCancelable(this.LIZJ);
        dialogC31813Ce9.setCanceledOnTouchOutside(false);
        return dialogC31813Ce9;
    }

    public C31767CdP(Context context) {
        this.LIZ = context;
    }
}
