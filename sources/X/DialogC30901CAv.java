package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CAv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogC30901CAv extends AbstractDialogC29234Bde {
    public final android.net.Uri LJLJI;
    public final int LJLJJI;
    public final InterfaceC88471Ynr<? super android.net.Uri, ? super Integer, C76800UCe> LJLJJL;

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.czq;
    }

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C134675Qh) findViewById(R.id.hao)).LJJLJLI(C15380j0.LIZ(8.0f), 0, C15380j0.LIZ(8.0f), 0);
        ((C2A7) findViewById(R.id.han)).setText(C15380j0.LJIILJJIL(R.string.lr3));
        ((TextView) findViewById(R.id.har)).setText(C15380j0.LJIILJJIL(R.string.lr4));
        int i = this.LJLJJI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C16880lQ.LJJIII((C2A7) findViewById(R.id.han), new ACListenerS25S0100000_5(this, 265));
                }
            } else {
                C16880lQ.LJJIII((C2A7) findViewById(R.id.han), new ACListenerS25S0100000_5(this, 264));
            }
        } else {
            C16880lQ.LJJIII((C2A7) findViewById(R.id.han), new ACListenerS25S0100000_5(this, 263));
        }
        C16880lQ.LJJIIZI((C41081jM) findViewById(R.id.hap), new ACListenerS25S0100000_5(this, 266));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC30901CAv(Context context, android.net.Uri uri, int i, C29112Bbg c29112Bbg) {
        super(context);
        o.LJIIIZ(uri, "uri");
        this.LJLJI = uri;
        this.LJLJJI = i;
        this.LJLJJL = c29112Bbg;
    }
}
