package X;

import Y.ARunnableS26S0300000_15;
import Y.ARunnableS6S1201000_15;
import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.XtQ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86268XtQ extends AbstractC86252XtA {
    public final /* synthetic */ Activity LJLJJLL;
    public final /* synthetic */ InterfaceC37146Ehy LJLJL;

    @Override // X.InterfaceC86221Xsf
    public final void LIZIZ(JSONObject jSONObject) {
        this.LJLJJLL.runOnUiThread(new ARunnableS26S0300000_15(this, this.LJLJL, jSONObject, 1));
    }

    @Override // X.InterfaceC86221Xsf
    public final void LIZJ(JSONArray datas) {
        o.LJIIIZ(datas, "datas");
        this.LJLJJLL.runOnUiThread(new ARunnableS26S0300000_15(this, this.LJLJL, datas, 0));
    }

    @Override // X.InterfaceC86221Xsf
    public final void LIZ(int i, String msg) {
        o.LJIIIZ(msg, "msg");
        this.LJLJJLL.runOnUiThread(new ARunnableS6S1201000_15(this, this.LJLJL, i, msg, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86268XtQ(Activity activity, InterfaceC37146Ehy interfaceC37146Ehy, WeakReference<Context> weakReference) {
        super(weakReference);
        this.LJLJJLL = activity;
        this.LJLJL = interfaceC37146Ehy;
    }
}
