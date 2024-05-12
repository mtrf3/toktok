package X;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1hF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceC39771hF extends C18Z implements DialogInterface {
    public final AlertController LJLJI;

    /* JADX WARN: Code restructure failed: missing block: B:178:0x03c7, code lost:
    
        if (r14 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (androidx.appcompat.app.AlertController.LIZ(r14) == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f4  */
    @Override // X.C18Z, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceC39771hF.onCreate(android.os.Bundle):void");
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.LJLJI;
        alertController.LJ = charSequence;
        TextView textView = alertController.LJJII;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public DialogInterfaceC39771hF(Context context, int i) {
        super(context, LJIJJ(i, context));
        this.LJLJI = new AlertController(getContext(), this, getWindow());
    }

    public static int LJIJJ(int i, Context context) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.vg, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C45631qh c45631qh = this.LJLJI.LJIL;
        if (c45631qh != null && c45631qh.LIZLLL(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C45631qh c45631qh = this.LJLJI.LJIL;
        if (c45631qh != null && c45631qh.LIZLLL(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
