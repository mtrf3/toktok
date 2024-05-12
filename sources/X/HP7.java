package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class HP7 extends Dialog implements View.OnClickListener {
    public TextView LJLIL;
    public TextView LJLILLLLZI;
    public TextView LJLJI;
    public TextView LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public View.OnClickListener LJLJLLL;
    public View.OnClickListener LJLL;

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window == null) {
            dismiss();
            return;
        }
        window.setBackgroundDrawableResource(R.color.yi);
        window.getDecorView().setBackgroundResource(R.color.yi);
        WindowManager windowManager = window.getWindowManager();
        window.clearFlags(2);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        WindowManager.LayoutParams attributes = window.getAttributes();
        defaultDisplay.getSize(new Point());
        attributes.width = (int) (r0.x * 0.7d);
        window.setAttributes(attributes);
        this.LJLIL = (TextView) findViewById(R.id.mb7);
        this.LJLJI = (TextView) findViewById(R.id.m1c);
        this.LJLILLLLZI = (TextView) findViewById(R.id.m2u);
        this.LJLJJI = (TextView) findViewById(R.id.mo6);
        if (!TextUtils.isEmpty(this.LJLJJL)) {
            this.LJLIL.setText(this.LJLJJL);
        }
        if (!TextUtils.isEmpty(this.LJLJL)) {
            this.LJLJI.setText(this.LJLJL);
        }
        if (!TextUtils.isEmpty(this.LJLJJLL)) {
            this.LJLILLLLZI.setText(this.LJLJJLL);
        }
        if (!TextUtils.isEmpty(this.LJLJLJ)) {
            this.LJLJJI.setText(this.LJLJLJ);
        }
        C16880lQ.LJIJI(this.LJLILLLLZI, this);
        C16880lQ.LJIJI(this.LJLJI, this);
    }

    public HP7(Context context) {
        super(context, R.style.add);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        int id = view.getId();
        if (id == R.id.m2u) {
            View.OnClickListener onClickListener2 = this.LJLL;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
                return;
            }
            return;
        }
        if (id != R.id.m1c || (onClickListener = this.LJLJLLL) == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.biq);
    }
}
