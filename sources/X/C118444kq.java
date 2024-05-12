package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.4kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118444kq extends FrameLayout {
    public PlayerController LJLIL;

    private final int getResourceLayout() {
        return R.layout.b6r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118444kq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLZIIL(getResourceLayout(), C16880lQ.LLZIL(context), this);
    }
}
