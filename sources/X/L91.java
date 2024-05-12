package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L91 extends FrameLayout {
    public ImageView LJLIL;
    public TextView LJLILLLLZI;
    public Button LJLJI;

    public final ImageView getBannerIv() {
        return this.LJLIL;
    }

    public final Button getButton() {
        return this.LJLJI;
    }

    public final TextView getMessageTv() {
        return this.LJLILLLLZI;
    }

    public L91(Context context) {
        super(context, null, 0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cn9, this, true);
        View findViewById = findViewById(R.id.agh);
        o.LJFF(findViewById, "findViewById<ImageView>(R.id.banner_iv)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.message_tv);
        o.LJFF(findViewById2, "findViewById<TextView>(R.id.message_tv)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.b1h);
        o.LJFF(findViewById3, "findViewById<Button>(R.id.button)");
        this.LJLJI = (Button) findViewById3;
    }

    public final void setBannerIv(ImageView imageView) {
        o.LJIIJ(imageView, "<set-?>");
        this.LJLIL = imageView;
    }

    public final void setButton(Button button) {
        o.LJIIJ(button, "<set-?>");
        this.LJLJI = button;
    }

    public final void setMessageTv(TextView textView) {
        o.LJIIJ(textView, "<set-?>");
        this.LJLILLLLZI = textView;
    }

    public final void setRetryClickListener(View.OnClickListener listener) {
        o.LJIIJ(listener, "listener");
        C16880lQ.LJIILIIL(this.LJLJI, listener);
    }
}
