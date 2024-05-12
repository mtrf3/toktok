package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.QgC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class LayoutInflaterFactoryC67612QgC implements LayoutInflater.Factory {
    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        if (str.lastIndexOf(46) > 0 && str.substring(str.lastIndexOf(46) + 1).equals("TuxTextView")) {
            if (context.equals(C67613QgD.LIZ)) {
                TuxTextView tuxTextView = C67613QgD.LIZIZ.get(attributeSet);
                if (tuxTextView == null) {
                    tuxTextView = new TuxTextView(context, attributeSet, R.attr.ku);
                }
                tuxTextView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC67611QgB(attributeSet, tuxTextView));
                return tuxTextView;
            }
            return new TuxTextView(context, attributeSet, R.attr.ku);
        }
        return null;
    }
}
