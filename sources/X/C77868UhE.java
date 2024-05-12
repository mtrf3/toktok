package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.UhE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77868UhE implements InterfaceC38012Evw {
    public final C38049EwX LJLIL;
    public final WeakReference<Context> LJLILLLLZI;

    public C77868UhE(WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        this.LJLILLLLZI = weakReference;
        this.LJLIL = c38049EwX;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        String str;
        WeakReference<Context> weakReference = this.LJLILLLLZI;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        Context context = this.LJLILLLLZI.get();
        while (context != null) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                context = LJIJJ;
            } else if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            c38048EwW.LJIIJ = false;
            String optString = c38048EwW.LIZLLL.optString("content");
            String optString2 = c38048EwW.LIZLLL.optString("title");
            String optString3 = c38048EwW.LIZLLL.optString("confirm_text");
            String optString4 = c38048EwW.LIZLLL.optString("cancel_text");
            boolean optBoolean = c38048EwW.LIZLLL.optBoolean("swap");
            C62905OmT c62905OmT = new C62905OmT(context);
            c62905OmT.LIZIZ = optString2;
            c62905OmT.LIZJ = optString;
            if (optBoolean) {
                str = optString4;
            } else {
                str = optString3;
            }
            c62905OmT.LJIIL(new DialogInterfaceOnClickListenerC77867UhD(this, c38048EwW, optBoolean), str, false);
            if (!optBoolean) {
                optString3 = optString4;
            }
            c62905OmT.LJIIIZ(new DialogInterfaceOnClickListenerC77866UhC(this, c38048EwW, optBoolean), optString3, false);
            c62905OmT.LJII = false;
            C279017q.LIZLLL(c62905OmT);
            return;
        }
    }
}
