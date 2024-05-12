package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108654Of extends C108634Od {
    public final Dialog LIZJ;
    public final ViewGroup LIZLLL;
    public final FrameLayout LJ;
    public final RecyclerView LJFF;
    public final LinearLayout LJI;
    public final TextView LJII;
    public final C4RB LJIIIIZZ;
    public final List<C4NN> LJIIIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C108654Of(Activity activity, Dialog dialog, SharePackage sharePackage, FrameLayout frameLayout, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView, C4RB c4rb, List batchGroups, ATF atf) {
        super(activity, sharePackage);
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(batchGroups, "batchGroups");
        this.LIZJ = dialog;
        this.LIZLLL = null;
        this.LJ = frameLayout;
        this.LJFF = recyclerView;
        this.LJI = linearLayout;
        this.LJII = textView;
        this.LJIIIIZZ = c4rb;
        this.LJIIIZ = batchGroups;
    }
}
