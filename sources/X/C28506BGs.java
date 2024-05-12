package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.BGs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28506BGs extends LinearLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C28506BGs(Context context) {
        super(context, null, 0);
        int i;
        if (C28503BGp.LIZ()) {
            i = R.layout.dgh;
        } else {
            i = R.layout.dgg;
        }
        C29306Beo.LJIIIIZZ(i, this, true);
    }

    public final void setRightIcon(boolean z) {
        if (z) {
            ((ImageView) LIZ(R.id.j2g)).setVisibility(0);
        } else {
            ((ImageView) LIZ(R.id.j2g)).setVisibility(8);
        }
    }

    public final void setSubTitle(CharSequence charSequence) {
        Boolean bool;
        boolean z;
        if (charSequence != null) {
            if (charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            ((TextView) LIZ(R.id.agj)).setText(charSequence);
        } else {
            LIZ(R.id.agj).setVisibility(8);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        Boolean bool;
        boolean z;
        if (charSequence != null) {
            if (charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            ((TextView) LIZ(R.id.agk)).setText(charSequence);
        } else {
            LIZ(R.id.agk).setVisibility(8);
        }
    }
}
