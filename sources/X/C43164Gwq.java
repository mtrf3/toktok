package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.StringTokenizer;

/* renamed from: X.Gwq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43164Gwq extends LinearLayout {
    public final ImageView LJLIL;
    public final TextView LJLILLLLZI;
    public final View LJLJI;

    public int getLayoutResource() {
        return R.layout.ui;
    }

    public ImageView getShareImageView() {
        return this.LJLIL;
    }

    public TextView getShareTextView() {
        return this.LJLILLLLZI;
    }

    public C43164Gwq(Context context) {
        super(context, null, 0);
        C16880lQ.LLLZIIL(getLayoutResource(), C16880lQ.LLZIL(context), this);
        this.LJLIL = (ImageView) findViewById(R.id.jsi);
        this.LJLILLLLZI = (TextView) findViewById(R.id.jsj);
        View findViewById = findViewById(R.id.ar_);
        this.LJLJI = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setOrientation(1);
        setGravity(1);
    }

    public void setIcon(int i) {
        ImageView imageView = this.LJLIL;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setIconAlpha(float f) {
        ImageView imageView = this.LJLIL;
        if (imageView != null) {
            imageView.setAlpha(f);
        }
    }

    public void setText(String str) {
        int i;
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            if (str.contains(" ")) {
                i = 2;
            } else {
                i = 1;
            }
            textView.setMaxLines(i);
            TextView textView2 = this.LJLILLLLZI;
            StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
            StringBuilder sb = new StringBuilder();
            sb.append(stringTokenizer.nextToken());
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.length() >= 8) {
                    sb.append(" \n");
                    sb.append(nextToken);
                } else {
                    sb.append(" ");
                    sb.append(nextToken);
                }
            }
            textView2.setText(sb.toString());
        }
    }

    public void setTextAlpha(float f) {
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            textView.setAlpha(f);
        }
    }

    public void setTextColor(int i) {
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(i));
        }
    }

    public void setTextSize(float f) {
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setIcon(Drawable drawable) {
        ImageView imageView = this.LJLIL;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setText(int i) {
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            textView.setText(i);
        }
    }
}
