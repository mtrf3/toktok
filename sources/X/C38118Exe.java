package X;

import android.webkit.WebView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: X.Exe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38118Exe implements InterfaceC38050EwY {
    public final AbstractC38114Exa LIZ;
    public final C38049EwX LIZIZ;
    public final C38120Exg LIZJ;
    public final java.util.Map<String, AbstractC38134Exu> LIZLLL = new LinkedHashMap();
    public final java.util.Set<String> LJ;

    public C38118Exe(WebView webView, C38113ExZ c38113ExZ) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.LJ = copyOnWriteArraySet;
        AbstractC38114Exa abstractC38114Exa = c38113ExZ.LIZ;
        this.LIZ = abstractC38114Exa;
        C38049EwX c38049EwX = new C38049EwX(webView);
        c38049EwX.LJII = true;
        this.LIZIZ = c38049EwX;
        if (abstractC38114Exa instanceof C38115Exb) {
            this.LIZJ = new C38120Exg((C38115Exb) abstractC38114Exa, copyOnWriteArraySet);
        } else {
            this.LIZJ = null;
        }
    }

    public final void LIZIZ(String str, InterfaceC38012Evw interfaceC38012Evw) {
        C38120Exg c38120Exg = this.LIZJ;
        if (c38120Exg != null) {
            this.LIZIZ.LJI(str, c38120Exg);
        }
        C38119Exf c38119Exf = new C38119Exf(interfaceC38012Evw);
        C38112ExY c38112ExY = this.LIZ.LJII;
        c38112ExY.getClass();
        c38119Exf.name = str;
        ((HashMap) c38112ExY.LIZJ).put(str, c38119Exf);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JsBridge raw method registered: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        this.LIZLLL.put(str, c38119Exf);
    }

    @Override // X.InterfaceC38050EwY
    public final void LIZ(List<String> list, C38048EwW c38048EwW, JSONObject jSONObject) {
        this.LIZIZ.LIZ(list, c38048EwW, jSONObject);
    }
}
