package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.a1;
import java.util.LinkedList;

/* renamed from: X.Bq3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30003Bq3 extends FrameLayout {
    public static final int LJLJJI = C15380j0.LIZ(42.0f);
    public DataChannel LJLIL;
    public final C1UB<C30002Bq2> LJLILLLLZI;
    public final LinkedList<C30002Bq2> LJLJI;

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30003Bq3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new C1UB<>(10);
        this.LJLJI = new LinkedList<>();
    }
}
