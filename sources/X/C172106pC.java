package X;

import Y.IDCListenerS156S0100000_2;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;

/* renamed from: X.6pC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172106pC {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final DialogInterface.OnClickListener LJFF;
    public final DialogInterface.OnClickListener LJI;

    public final void LIZ() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.LIZ);
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            builder.setTitle(this.LIZIZ);
        }
        if (!TextUtils.isEmpty(this.LIZJ)) {
            builder.setMessage(this.LIZJ);
        }
        builder.setPositiveButton(this.LIZLLL, new IDCListenerS156S0100000_2(this, 0));
        if (!TextUtils.isEmpty(this.LJ)) {
            builder.setNegativeButton(this.LJ, new IDCListenerS156S0100000_2(this, 1));
        }
        try {
            C16880lQ.LIZ(builder.create());
        } catch (Exception unused) {
        }
    }

    public C172106pC(C170066lu c170066lu) {
        this.LIZ = c170066lu.LJI;
        this.LIZIZ = c170066lu.LIZ;
        this.LIZJ = c170066lu.LIZIZ;
        this.LJ = c170066lu.LIZLLL;
        this.LIZLLL = c170066lu.LIZJ;
        this.LJFF = c170066lu.LJ;
        this.LJI = c170066lu.LJFF;
    }
}
