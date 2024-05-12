package X;

import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Mip, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC57583Mip implements Runnable {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ TuxTextView LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC57583Mip(View view, TuxTextView tuxTextView, String str, String str2, String str3) {
        this.LJLIL = view;
        this.LJLILLLLZI = tuxTextView;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }

    public final void LIZ() {
        Layout layout = this.LJLILLLLZI.getLayout();
        if (layout == null || layout.getEllipsisCount(layout.getLineCount() - 1) <= 0) {
            return;
        }
        try {
            TuxTextView tuxTextView = this.LJLILLLLZI;
            int width = tuxTextView.getWidth();
            if (tuxTextView.getMaxLines() != 1) {
                width = (tuxTextView.getMaxLines() * width) - (width / 2);
            }
            this.LJLILLLLZI.setTag(R.id.l5s, Integer.valueOf(width));
            String str = this.LJLJI;
            String str2 = this.LJLJJI;
            TextPaint paint = this.LJLILLLLZI.getPaint();
            o.LJIIIIZZ(paint, "paint");
            C57582Mio.LIZJ(str, str2, paint, width, new C57585Mir(this.LJLJJL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, width));
        } catch (Throwable th) {
            this.LJLILLLLZI.setText(this.LJLJJL);
            C221018lt.LIZJ("ExtReason", "ellipsize fail when pre draw!", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
