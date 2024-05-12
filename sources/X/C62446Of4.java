package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Of4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62446Of4 extends ASB {
    public final /* synthetic */ C62435Oet LJLJJI;

    @Override // X.ASG
    public final void LIZ(View v) {
        String str;
        o.LJIIIZ(v, "v");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C2U8.LIZ(new Y1A(str, this.LJLJI, EnumC86777Y3x.LONG_PRESS, System.identityHashCode(C45804HyK.LJIJJ(this.LJLJJI.LJLJJL)), null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62446Of4(C62435Oet c62435Oet, AS3 as3) {
        super(c62435Oet, as3);
        this.LJLJJI = c62435Oet;
    }
}
