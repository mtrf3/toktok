package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.xml.sax.XMLReader;

/* loaded from: classes5.dex */
public final class ATX extends OOS {
    public final Context LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ATX(Context ctx) {
        super(ctx, R.style.a6r);
        o.LJIIIZ(ctx, "ctx");
        this.LJLJLLL = ctx;
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cqs);
        C16880lQ.LJJJ((TuxIconView) findViewById(R.id.hlq), new ACListenerS24S0100000_4(this, 292));
        View permission_root = findViewById(R.id.hm3);
        o.LJIIIIZZ(permission_root, "permission_root");
        permission_root.addOnLayoutChangeListener(new ATW(this));
        int LJIIIZ = KL2.LJIIIZ(this.LJLJLLL);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LJJJJLI = LJIIIZ - C63081OpJ.LJJJJLI(context);
        Window window = getWindow();
        if (window != null) {
            if (LJJJJLI == 0) {
                LJJJJLI = -1;
            }
            window.setLayout(-1, LJJJJLI);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.color.cz);
            View findViewById = window.findViewById(R.id.c8m);
            if (findViewById != null) {
                findViewById.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        String string = this.LJLJLLL.getString(R.string.f09);
        o.LJIIIIZZ(string, "ctx.getString(R.string.duet_detail_page_popup)");
        ((TextView) findViewById(R.id.hlu)).setText(Html.fromHtml(ujb.o.LJJJJZ(string, "\n", "<paragraph>", false), null, new Html.TagHandler() { // from class: X.8G1
            @Override // android.text.Html.TagHandler
            public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
                if (z && str != null && str.equals("paragraph") && editable != null) {
                    editable.append("\n\n");
                    editable.setSpan(new AbsoluteSizeSpan(7, true), editable.length() - 1, editable.length(), 33);
                }
            }
        }));
    }
}
