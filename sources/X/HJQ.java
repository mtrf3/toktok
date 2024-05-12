package X;

import Y.ACListenerS27S0100000_7;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class HJQ extends Dialog {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public ImageView LJLJJI;
    public TextView LJLJJL;
    public RelativeLayout LJLJJLL;
    public RelativeLayout LJLJL;
    public final HJR LJLJLJ;

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        char c;
        super.onCreate(bundle);
        setContentView(R.layout.uy);
        String str = this.LJLIL;
        int hashCode = str.hashCode();
        if (hashCode != -2076320574) {
            if (hashCode != -1846572353) {
                if (hashCode == -1397149946 && str.equals("share saved")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("share fail")) {
                    c = 2;
                }
                c = 65535;
            }
        } else {
            if (str.equals("share success")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                this.LJLJJI = (ImageView) findViewById(R.id.jur);
                this.LJLJJL = (TextView) findViewById(R.id.jut);
                this.LJLJJI.setImageResource(R.drawable.a9g);
                this.LJLJJL.setText(R.string.s7d);
            } else {
                this.LJLJJI = (ImageView) findViewById(R.id.jur);
                this.LJLJJL = (TextView) findViewById(R.id.jut);
                this.LJLJJI.setImageResource(R.drawable.a9h);
                this.LJLJJL.setText(R.string.s7e);
            }
        } else {
            this.LJLJJI = (ImageView) findViewById(R.id.jur);
            this.LJLJJL = (TextView) findViewById(R.id.jut);
            this.LJLJJI.setImageResource(R.drawable.a9h);
            this.LJLJJL.setText(R.string.s7f);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("launch_from", this.LJLJI);
            c188727au.LJIIIZ("channel", this.LJLJI);
            c188727au.LJIIIZ("product", "share_sdk");
            FMX.LJIIL("return_origin_pop_up", c188727au.LIZ);
        }
        ((TextView) findViewById(R.id.jup)).setText(getContext().getResources().getString(R.string.s7c, this.LJLILLLLZI));
        this.LJLJJLL = (RelativeLayout) findViewById(R.id.juo);
        this.LJLJL = (RelativeLayout) findViewById(R.id.jus);
        C16880lQ.LJIJ(this.LJLJJLL, new ACListenerS27S0100000_7(this, 154));
        C16880lQ.LJIJ(this.LJLJL, new ACListenerS27S0100000_7(this, 155));
    }

    public HJQ(Activity activity, String str, String str2, String str3, HJR hjr) {
        super(activity, R.style.a5k);
        this.LJLILLLLZI = str;
        this.LJLIL = str2;
        this.LJLJLJ = hjr;
        this.LJLJI = str3;
    }
}
