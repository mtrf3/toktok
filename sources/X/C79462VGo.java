package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.lynx.tasm.LynxTemplateRender;
import org.json.JSONObject;

/* renamed from: X.VGo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79462VGo extends VNU {
    public final /* synthetic */ LynxTemplateRender LLILIL;

    @Override // X.VNU
    public final void LJIIIIZZ(Exception exc) {
        this.LLILIL.LJIIL(-3, 105, null, exc, null);
    }

    @Override // X.VNU, X.VO0
    public final void handleException(Exception exc) {
        this.LLILIL.LJIIL(-3, 601, null, exc, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79462VGo(LynxTemplateRender lynxTemplateRender, Context context, DisplayMetrics displayMetrics) {
        super(context, displayMetrics);
        this.LLILIL = lynxTemplateRender;
    }

    @Override // X.VNU
    public final void LJII(Exception exc, int i, JSONObject jSONObject) {
        this.LLILIL.LJIIL(-3, i, null, exc, jSONObject);
    }
}
