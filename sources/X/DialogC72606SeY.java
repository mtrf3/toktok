package X;

import Y.ACListenerS32S0100000_12;
import android.os.Bundle;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.view.hub.ProfileNaviHubFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SeY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogC72606SeY extends OOS {
    public final InterfaceC72607SeZ LJLJLLL;
    public boolean LJLL;

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.LJLL) {
            C72604SeW.LIZ("tap");
        }
        super.dismiss();
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.c79);
        C16880lQ.LJJJJI((TuxTextView) findViewById(R.id.i8d), new ACListenerS32S0100000_12(this, 99));
        C16880lQ.LJJJJI((TuxTextView) findViewById(R.id.i8e), new ACListenerS32S0100000_12(this, 100));
        C16880lQ.LJJJJI((TuxTextView) findViewById(R.id.i8f), new ACListenerS32S0100000_12(this, 101));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC72606SeY(ActivityC45651qj activityC45651qj, ProfileNaviHubFragment listener) {
        super(activityC45651qj, R.style.a9w);
        o.LJIIIZ(listener, "listener");
        this.LJLJLLL = listener;
        this.LJLL = true;
    }
}
