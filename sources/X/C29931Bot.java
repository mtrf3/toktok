package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS44S1100000_5;
import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Bot, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29931Bot implements InterfaceC60142Nj0 {
    public final android.net.Uri LIZ;
    public final WeakReference<SparkContext> LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;

    @Override // X.InterfaceC60142Nj0
    public final View LIZ() {
        SparkSchemaParam sparkSchemaParam;
        AbsSparkPopupSchemaParam absSparkPopupSchemaParam;
        int i;
        Object obj;
        LayoutInflater layoutInflater;
        boolean z;
        Activity topActivity;
        SparkContext sparkContext = this.LIZIZ.get();
        if (sparkContext != null) {
            sparkSchemaParam = sparkContext.LJIIZILJ(-1);
        } else {
            sparkSchemaParam = null;
        }
        if (sparkSchemaParam instanceof SparkPopupSchemaParam) {
            absSparkPopupSchemaParam = (AbsSparkPopupSchemaParam) sparkSchemaParam;
        } else {
            absSparkPopupSchemaParam = null;
        }
        boolean z2 = false;
        if (absSparkPopupSchemaParam != null) {
            i = absSparkPopupSchemaParam.getRadius();
            absSparkPopupSchemaParam.setRadius(0);
        } else {
            i = 0;
        }
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null && (topActivity = iHostAction.getTopActivity()) != null) {
            obj = C16880lQ.LLILIL(topActivity, "layout_inflater");
        } else {
            obj = null;
        }
        if (!(obj instanceof LayoutInflater) || (layoutInflater = (LayoutInflater) obj) == null) {
            return null;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.d6h, layoutInflater, null);
        LLLZIIL.setLayoutParams(new ViewGroup.LayoutParams(-1, C15380j0.LJFF(R.dimen.ahe)));
        String queryParameter = UriProtector.getQueryParameter(this.LIZ, "title");
        if (!TextUtils.isEmpty(queryParameter)) {
            ((TextView) LLLZIIL.findViewById(R.id.l_c)).setText(queryParameter);
        }
        if (o.LJ(UriProtector.getQueryParameter(this.LIZ, "show_title_close"), "1") || o.LJ(UriProtector.getQueryParameter(this.LIZ, "show_title_close"), "true")) {
            View findViewById = LLLZIIL.findViewById(R.id.l_6);
            findViewById.setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 398), findViewById);
        }
        if (o.LJ(UriProtector.getQueryParameter(this.LIZ, "show_title_share"), "1") || o.LJ(UriProtector.getQueryParameter(this.LIZ, "show_title_share"), "true")) {
            z = true;
        } else {
            z = false;
        }
        String queryParameter2 = UriProtector.getQueryParameter(this.LIZ, "url");
        if (z && !TextUtils.isEmpty(queryParameter2)) {
            View findViewById2 = LLLZIIL.findViewById(R.id.l_b);
            findViewById2.setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS44S1100000_5(this, queryParameter2, 6), findViewById2);
        }
        C15580jK.LIZ(i, 1, LLLZIIL);
        if (o.LJ(UriProtector.getQueryParameter(this.LIZ, "title_bar_share_add_report_action"), "1") || o.LJ(UriProtector.getQueryParameter(this.LIZ, "title_bar_share_add_report_action"), "true")) {
            z2 = true;
        }
        this.LIZJ = z2;
        this.LIZLLL = UriProtector.getQueryParameter(this.LIZ, "report_schema");
        return LLLZIIL;
    }

    public C29931Bot(android.net.Uri uri, SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        this.LIZ = uri;
        this.LIZIZ = new WeakReference<>(sparkContext);
    }
}
