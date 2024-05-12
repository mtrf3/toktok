package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Grl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42849Grl extends ClickableSpan {
    public final Context LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public String LJLJJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        if (C6ZS.LIZ(widget)) {
            return;
        }
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        JSONObject jSONObject = new JSONObject();
        try {
            new C42851Grn(str, str2).invoke(jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        GXR.LIZIZ("tiltify_about_click", jSONObject);
        Bundle bundle = new Bundle();
        bundle.putString("url", this.LJLJJI);
        bundle.putString("title", this.LJLIL.getString(R.string.eww));
        bundle.putString("enter_from", "tiltify_page");
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "aweme://donation/web/page");
        buildRoute.withParam(bundle);
        buildRoute.open();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, this.LJLIL));
    }

    public C42849Grl(Context context, String str, String str2) {
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
