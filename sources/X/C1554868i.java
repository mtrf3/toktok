package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.zhiliaoapp.musically.R;

/* renamed from: X.68i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1554868i extends FrameLayout implements C68T {
    public final C1555468o LJLIL;
    public final View LJLILLLLZI;
    public final ImageView LJLJI;
    public ObjectAnimator LJLJJI;
    public TextFontStyleData LJLJJL;
    public C68T LJLJJLL;
    public final Drawable LJLJL;
    public final Drawable LJLJLJ;

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    public final void LIZIZ() {
        TextFontStyleData textFontStyleData = this.LJLJJL;
        if (textFontStyleData == null) {
            return;
        }
        int i = textFontStyleData.LIZIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LJLJI.setVisibility(0);
                this.LJLJI.setImageDrawable(C04270Et.LIZIZ(getContext(), R.drawable.b9j));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJI, "rotation", 0.0f, 360.0f);
                this.LJLJJI = ofFloat;
                ofFloat.setDuration(800L);
                this.LJLJJI.setRepeatMode(1);
                this.LJLJJI.setRepeatCount(-1);
                this.LJLJJI.start();
                return;
            }
            this.LJLJI.setVisibility(0);
            ObjectAnimator objectAnimator = this.LJLJJI;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.LJLJJI = null;
            this.LJLJI.setRotation(0.0f);
            this.LJLJI.setImageDrawable(C04270Et.LIZIZ(getContext(), R.drawable.b5f));
            return;
        }
        this.LJLJI.setVisibility(4);
    }

    public final void LIZLLL() {
        if (this.LJLJJL == null) {
            return;
        }
        Typeface LJIIL = C68M.LJIIJ().LJIIL(this.LJLJJL.fileName);
        if (LJIIL != null) {
            this.LJLIL.setTypeface(LJIIL);
        }
        if (this.LJLJJL.LIZIZ()) {
            this.LJLIL.setMaskBlurColor(-6400);
        }
    }

    @Override // X.C68T
    public final void onError() {
        TextFontStyleData textFontStyleData = this.LJLJJL;
        if (textFontStyleData != null) {
            textFontStyleData.LIZIZ = 2;
            LIZIZ();
        }
        C68T c68t = this.LJLJJLL;
        if (c68t != null) {
            c68t.onError();
        }
        C6PB.LJ().LIZ(getContext(), getContext().getResources().getString(R.string.gl5));
    }

    public TextFontStyleData getFontData() {
        return this.LJLJJL;
    }

    public C1554868i(Context context) {
        super(context, null);
        float f;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.aua, C16880lQ.LLZIL(context), this);
        this.LJLIL = (C1555468o) LLLZIIL.findViewById(R.id.lap);
        this.LJLJI = (ImageView) LLLZIIL.findViewById(R.id.kf0);
        this.LJLILLLLZI = LLLZIIL.findViewById(R.id.mrp);
        Context context2 = getContext();
        if (C82852WfQ.LIZ().LJIIJ.invoke().booleanValue()) {
            f = 6.0f;
        } else {
            f = 4.0f;
        }
        int LIZIZ = (int) C74275TDb.LIZIZ(context2, f);
        this.LJLJL = C78127UlP.LIZJ(-1, 16777215, (int) C74275TDb.LIZIZ(getContext(), 2.0f), LIZIZ);
        this.LJLJLJ = C78127UlP.LIZJ(889192447, 16777215, 1, LIZIZ);
    }

    private void setFontData(TextFontStyleData textFontStyleData) {
        if (textFontStyleData == null) {
            return;
        }
        this.LJLJJL = textFontStyleData;
        if (!TextUtils.isEmpty(textFontStyleData.title)) {
            this.LJLIL.setText(this.LJLJJL.title);
        }
    }

    public final void LIZJ(TextFontStyleData textFontStyleData) {
        if (textFontStyleData == null) {
            return;
        }
        setFontData(textFontStyleData);
        LIZLLL();
        LIZIZ();
    }

    public void setBackground(int i) {
        Drawable drawable;
        if (i != 1) {
            drawable = this.LJLJLJ;
        } else {
            drawable = this.LJLJL;
        }
        this.LJLILLLLZI.setBackground(drawable);
    }

    public void setDownloadCallback(C68T c68t) {
        this.LJLJJLL = c68t;
    }

    @Override // X.C68T
    public final void LIZ(TextFontStyleData textFontStyleData, boolean z) {
        LIZIZ();
        if (!this.LJLJJL.LIZJ()) {
            C6PB.LJ().LIZ(getContext(), getContext().getResources().getString(R.string.gl5));
            return;
        }
        C68T c68t = this.LJLJJLL;
        if (c68t != null) {
            TextFontStyleData textFontStyleData2 = this.LJLJJL;
            c68t.LIZ(textFontStyleData2, textFontStyleData2.LIZJ());
        }
        LIZLLL();
    }
}
