package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.service.CaptionServiceImpl;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.8qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224168qy extends FrameLayout {
    public final TextView LJLIL;
    public final ICLACaptionService LJLILLLLZI;
    public final TextPaint LJLJI;
    public final FrameLayout LJLJJI;
    public TextStickerInfo LJLJJL;
    public C245649kW LJLJJLL;
    public boolean LJLJL;

    public final String getCurText() {
        CharSequence charSequence;
        TextView textView = this.LJLIL;
        if (textView != null) {
            charSequence = textView.getText();
        } else {
            charSequence = null;
        }
        return String.valueOf(charSequence);
    }

    public final int getTranslateTextSize() {
        if (this.LJLIL != null) {
            return C17N.LJJJJI(r0.getTextSize());
        }
        return 24;
    }

    public final FrameLayout getBgContainer() {
        return this.LJLJJI;
    }

    public final C245649kW getInteractStickerParams() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C224168qy(Context context) {
        super(context);
        FrameLayout frameLayout;
        a1.LJFF(context, "context");
        this.LJLILLLLZI = CaptionServiceImpl.LJIILIIL();
        this.LJLJI = new TextPaint();
        View LIZ = C16950lX.LIZ(getContext(), R.layout.dtk, this, false, -1);
        if (LIZ instanceof FrameLayout) {
            frameLayout = (FrameLayout) LIZ;
        } else {
            frameLayout = null;
        }
        this.LJLJJI = frameLayout;
        this.LJLIL = frameLayout != null ? (TextView) frameLayout.findViewById(R.id.l5p) : null;
        addView(frameLayout);
    }

    public final void setInteractStickerParams(C245649kW c245649kW) {
        this.LJLJJLL = c245649kW;
    }
}
