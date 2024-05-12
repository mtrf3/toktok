package X;

import Y.IDrS50S0100000_12;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.S1q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class DialogC71430S1q extends Dialog {
    public final RecyclerView LJLIL;
    public final FrameLayout LJLILLLLZI;
    public AbstractC71431S1r<?> LJLJI;
    public C28851Bh LJLJJI;
    public int LJLJJL;
    public final List<InterfaceC70778RqA> LJLJJLL;

    public static void LIZLLL(DialogC71430S1q dialogC71430S1q) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/ecommerce/galleryviewer/core/PhotoViewerDialog", "show", dialogC71430S1q, new Object[0], "void", new C65300Pk0(false, "()V", "2255021043382705437")).LIZ) {
            return;
        }
        dialogC71430S1q.show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        AbstractC71431S1r<?> abstractC71431S1r;
        if (isShowing() && (abstractC71431S1r = this.LJLJI) != null) {
            abstractC71431S1r.onDestroy();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public DialogC71430S1q(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.LJLILLLLZI = frameLayout;
        this.LJLJJL = -1;
        this.LJLJJLL = new ArrayList();
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.LJLIL = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        new C40161hs().LIZIZ(recyclerView);
        frameLayout.addView(recyclerView, 0);
        recyclerView.LJIIJJI(new IDrS50S0100000_12(this, 22));
        getContext();
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
        linearLayoutManager2.LLJJIII(0);
        recyclerView.setLayoutManager(linearLayoutManager2);
        this.LJLJJI = new C28851Bh(recyclerView.getLayoutManager());
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.LJLILLLLZI);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.clearFlags(2);
        window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        window.getDecorView().setSystemUiVisibility(1280);
        if (Build.VERSION.SDK_INT > 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        FrameLayout frameLayout = this.LJLILLLLZI;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        frameLayout.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.d4, context));
        this.LJLILLLLZI.getBackground().setAlpha(255);
    }
}
