package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FVC {
    public final ViewGroup LIZ;
    public final Context LIZIZ;
    public final LayoutInflater LIZJ;
    public final String LIZLLL;
    public final Fragment LJ;

    public FVC(ViewGroup parent, Context context, LayoutInflater inflater, String str, Fragment fragment) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = parent;
        this.LIZIZ = context;
        this.LIZJ = inflater;
        this.LIZLLL = str;
        this.LJ = fragment;
    }
}
