package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NvQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class DialogC60912NvQ extends C18Z {
    public static final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C37753Erl.LJLIL);
    public SparkContext LJLJI;
    public SparkPopupSchemaParam LJLJJI;

    @Override // android.app.Dialog
    public final void show() {
        Window window = getWindow();
        if (window != null) {
            window.setFlags(8, 8);
        }
        if (!new C03880Dg(2).LIZJ(300000, "androidx/appcompat/app/AppCompatDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "3802669591700588619")).LIZ) {
            super.show();
        }
        C37682Eqc.LIZIZ(this.LJLJI, "SparkPopupLoadingProcess", "SparkPopupDialog show");
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(8);
        }
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LJLJJI;
        if (sparkPopupSchemaParam != null && sparkPopupSchemaParam.getForceDialogNonCancelable()) {
            setCancelable(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0082, code lost:
    
        if (r8 == null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC60912NvQ.LJIJJ():void");
    }

    public DialogC60912NvQ(Context context) {
        super(context, R.style.li);
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(View view) {
        o.LJIIJ(view, "view");
        try {
            C3C5.m7constructorimpl(Boolean.valueOf(LJIJI(1)));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        super.setContentView(view);
        LJIJJ();
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(int i) {
        try {
            C3C5.m7constructorimpl(Boolean.valueOf(LJIJI(1)));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        super.setContentView(i);
        LJIJJ();
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o.LJIIJ(view, "view");
        try {
            C3C5.m7constructorimpl(Boolean.valueOf(LJIJI(1)));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        super.setContentView(view, layoutParams);
        LJIJJ();
    }
}
