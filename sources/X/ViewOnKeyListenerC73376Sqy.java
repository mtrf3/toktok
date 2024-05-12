package X;

import android.view.KeyEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Sqy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnKeyListenerC73376Sqy implements View.OnKeyListener {
    public final /* synthetic */ DialogC73377Sqz LJLIL;

    public ViewOnKeyListenerC73376Sqy(DialogC73377Sqz dialogC73377Sqz) {
        this.LJLIL = dialogC73377Sqz;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 66) {
            DialogC73377Sqz dialogC73377Sqz = this.LJLIL;
            AYA.LIZ(dialogC73377Sqz.LJLJLLL, dialogC73377Sqz.findViewById(R.id.jdh));
            return true;
        }
        return false;
    }
}
