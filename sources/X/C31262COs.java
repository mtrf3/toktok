package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.COs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31262COs extends CR6 {
    public final Drawable LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final Runnable LJLJJI;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public C31262COs(Drawable drawable, String str, String str2, Runnable runnable) {
        this.LJLIL = drawable;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = runnable;
        this.type = EnumC31509CYf.STREAM_GOAL_ACHIEVE_MESSAGE;
    }
}
