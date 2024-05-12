package X;

import Y.ACListenerS31S0100000_11;
import Y.IDDListenerS150S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.R5x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class DialogC68993R5x extends AbstractDialogC68995R5z {
    public static final /* synthetic */ int LJLLL = 0;
    public final TPLoginMethod LJLLILLLL;
    public boolean LJLLJ;

    @Override // X.AbstractDialogC68995R5z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        ((CopyOnWriteArrayList) C69101RAb.LIZJ).remove(this);
    }

    @Override // X.AbstractDialogC68995R5z
    public final void create(Context context) {
        if (this.LJLLILLLL == null) {
            return;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.mc, getLayoutInflater(), null);
        this.LJLLI = LLLZIIL;
        if (LLLZIIL != null) {
            C78765Uvh.LJIIIZ((C62846OlW) LLLZIIL.findViewById(R.id.abh), this.LJLLILLLL.getUserInfo().getAvatarUrl(), -1, -1);
            ((TextView) LLLZIIL.findViewById(R.id.g_5)).setText(context.getString(R.string.do6, this.LJLLILLLL.getUserInfo().getUserName()));
            C16880lQ.LJIIJ(new ACListenerS31S0100000_11(this, 22), LLLZIIL.findViewById(R.id.g_5));
            C16880lQ.LJIIJ(new ACListenerS31S0100000_11(this, 23), LLLZIIL.findViewById(R.id.kxt));
            C16880lQ.LJIIJ(new ACListenerS31S0100000_11(this, 24), LLLZIIL.findViewById(R.id.k2f));
        }
        setContentView(this.LJLLI);
        ((CopyOnWriteArrayList) C69101RAb.LIZJ).add(this);
        setOnDismissListener(new IDDListenerS150S0100000_11(this, 1));
    }

    public DialogC68993R5x(Activity activity, Bundle bundle, TPLoginMethod tPLoginMethod) {
        super(activity, bundle);
        this.LJLLILLLL = tPLoginMethod;
        create(activity);
        this.LJLLJ = true;
    }
}
