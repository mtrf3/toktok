package X;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224048qm extends RelativeLayout {
    public boolean LJLIL;
    public C223658q9 LJLILLLLZI;

    public final C223658q9 getCommentInteractSticker() {
        return this.LJLILLLLZI;
    }

    public final boolean getNeedConsumeEvent() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.LJLIL) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C223658q9 c223658q9 = this.LJLILLLLZI;
        if (c223658q9 != null) {
            C2U8.LIZ(new C223728qG(c223658q9.hashCode()));
            InterfaceC82683Wch interfaceC82683Wch = c223658q9.LJLJL;
            if ((interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) || c223658q9.LJLJLJ) {
                C2U8.LIZ(new C223728qG());
                InterfaceC82683Wch interfaceC82683Wch2 = c223658q9.LJLJL;
                if (interfaceC82683Wch2 != null) {
                    interfaceC82683Wch2.dismiss();
                }
            }
        }
    }

    public final void setCommentInteractSticker(C223658q9 c223658q9) {
        this.LJLILLLLZI = c223658q9;
    }

    public final void setNeedConsumeEvent(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C224048qm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LJLIL = true;
    }
}
