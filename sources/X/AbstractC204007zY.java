package X;

import android.text.style.ClickableSpan;

/* renamed from: X.7zY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC204007zY extends ClickableSpan {
    public boolean LJLIL;
    public final /* synthetic */ C201577vd LJLILLLLZI;

    public AbstractC204007zY(C201577vd c201577vd) {
        this.LJLILLLLZI = c201577vd;
    }

    public void LIZ(boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI.invalidate();
    }
}
