package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.LBc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C53840LBc extends RelativeLayout {
    public TextView LJLIL;

    public void setInfoText(CharSequence charSequence) {
        this.LJLIL.setText(charSequence);
    }

    public C53840LBc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Integer num;
        C53106Kso.LIZ.getClass();
        if (C53106Kso.LIZIZ()) {
            ConcurrentHashMap<String, Integer> concurrentHashMap = C38958FQs.LIZ;
            if (concurrentHashMap.containsKey("homepage_hot") && ((num = concurrentHashMap.get("homepage_hot")) == null || num.intValue() != 0)) {
                C38619FDr.LIZJ(getContext(), R.layout.afm, this);
                this.LJLIL = (TextView) findViewById(R.id.mqj);
            }
        }
        RelativeLayout.inflate(getContext(), R.layout.afm, this);
        this.LJLIL = (TextView) findViewById(R.id.mqj);
    }
}
