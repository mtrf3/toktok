package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NGl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59075NGl extends FrameLayout {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLIL;
    public final C72108SRs LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59075NGl(Context context, String str, boolean z) {
        super(context, null, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LJLJI = linkedHashMap;
        View view = null;
        View findViewById = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c1a, this, true).findViewById(R.id.hvx);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.policy_progress_bar)");
        C72108SRs c72108SRs = (C72108SRs) findViewById;
        this.LJLILLLLZI = c72108SRs;
        if (!z) {
            c72108SRs.setVisibility(8);
        }
        String uri = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", str).appendQueryParameter("hide_loading", "1").build().toString();
        o.LJIIIIZZ(uri, "parse(\"aweme://webview\")…, \"1\").build().toString()");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(uri);
        sparkContext.LJII(InterfaceC60819Ntv.class, new C59808Ndc(this));
        this.LJLIL = KMP.LIZJ(c40342FsQ, context2, sparkContext);
        View view2 = (View) linkedHashMap.get(Integer.valueOf(R.id.hw0));
        if (view2 == null) {
            view2 = findViewById(R.id.hw0);
            if (view2 != null) {
                linkedHashMap.put(Integer.valueOf(R.id.hw0), view2);
            }
            ((ViewGroup) view).addView(this.LJLIL, new ViewGroup.LayoutParams(-1, -1));
        }
        view = view2;
        ((ViewGroup) view).addView(this.LJLIL, new ViewGroup.LayoutParams(-1, -1));
    }
}
