package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.CSy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31372CSy extends RelativeLayout {
    public C47121t6 LJLIL;
    public LiveIconView LJLILLLLZI;
    public LiveIconView LJLJI;

    public void setImageIcon(int i) {
        LiveIconView liveIconView = this.LJLILLLLZI;
        if (liveIconView != null) {
            liveIconView.setIconAttr(i);
        }
    }

    public void setImgWarnIconWithStyle(long j) {
        this.LJLILLLLZI.setVisibility(8);
        this.LJLJI.setVisibility(0);
    }

    public void setInfoText(CharSequence charSequence) {
        this.LJLIL.setText(charSequence);
    }

    public C31372CSy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RelativeLayout.inflate(getContext(), R.layout.dn8, this);
        this.LJLIL = (C47121t6) findViewById(R.id.mqj);
        this.LJLILLLLZI = (LiveIconView) findViewById(R.id.ek7);
        this.LJLJI = (LiveIconView) findViewById(R.id.eiv);
    }
}
