package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManagerImpl;
import java.io.PrintWriter;

/* renamed from: X.1BB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1BB<E> extends AnonymousClass095 {
    public final Activity LJLIL;
    public final Context LJLILLLLZI;
    public final Handler LJLJI;
    public final FragmentManager LJLJJI;

    public abstract void LIZJ(Fragment fragment);

    public abstract void LIZLLL(PrintWriter printWriter, String[] strArr);

    public abstract ActivityC45651qj LJFF();

    public abstract LayoutInflater LJI();

    public abstract void LJII(Fragment fragment, String[] strArr, int i);

    public abstract boolean LJIIIIZZ();

    public abstract boolean LJIIIZ(String str);

    public abstract void LJIIJ(Fragment fragment, Intent intent, int i, Bundle bundle);

    public abstract void LJIIJJI(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);

    public abstract void LJIIL();

    public C1BB(ActivityC45651qj activityC45651qj) {
        Handler handler = new Handler();
        this.LJLJJI = new FragmentManagerImpl();
        this.LJLIL = activityC45651qj;
        TMC.LJIIIZ(activityC45651qj, "context == null");
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = handler;
    }
}
