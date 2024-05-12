package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6IK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IK extends FrameLayout implements C6IJ {
    public final C6IN LJLIL;
    public final View LJLILLLLZI;
    public final ImageView LJLJI;
    public ObjectAnimator LJLJJI;
    public TextFontStyleData LJLJJL;
    public C6IJ LJLJJLL;
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
                this.LJLJI.setImageDrawable(C04270Et.LIZIZ(getContext(), R.drawable.bq8));
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
            this.LJLJI.setImageDrawable(C04270Et.LIZIZ(getContext(), R.drawable.bq7));
            return;
        }
        this.LJLJI.setVisibility(4);
    }

    public final void LIZLLL() {
        if (this.LJLJJL == null) {
            return;
        }
        C6IH LJ = C6IH.LJ();
        String str = this.LJLJJL.fileName;
        LJ.getClass();
        if (!TextUtils.isEmpty(str) && ((ConcurrentHashMap) LJ.LIZIZ).size() != 0) {
            Typeface typeface = (Typeface) ((ConcurrentHashMap) LJ.LIZIZ).get(str);
            if (typeface == null) {
                if (LJ.LIZ.get(str) != null && (typeface = C6IH.LJFF(LJ.LIZ.get(str).LIZ)) != null) {
                    ((ConcurrentHashMap) LJ.LIZIZ).put(str, typeface);
                }
            }
            if (typeface != null) {
                this.LJLIL.setTypeface(typeface);
            }
        }
        if (this.LJLJJL.enableMaskBlurLightColor == 1) {
            this.LJLIL.setMaskBlurColor(-6400);
        }
    }

    @Override // X.C6IJ
    public final void onError() {
        TextFontStyleData textFontStyleData = this.LJLJJL;
        if (textFontStyleData != null) {
            textFontStyleData.LIZIZ = 2;
            LIZIZ();
        }
        C6IJ c6ij = this.LJLJJLL;
        if (c6ij != null) {
            c6ij.onError();
        }
        C5S1 c5s1 = new C5S1(getContext());
        c5s1.LIZLLL(getContext().getResources().getString(R.string.gl5));
        c5s1.LJ();
        C30869C9p.LIZIZ(getContext(), getContext().getResources().getString(R.string.gl5));
    }

    public TextFontStyleData getFontData() {
        return this.LJLJJL;
    }

    public C6IK(Context context) {
        super(context, null);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.br8, C16880lQ.LLZIL(context), this);
        this.LJLIL = (C6IN) LLLZIIL.findViewById(R.id.lap);
        this.LJLJI = (ImageView) LLLZIIL.findViewById(R.id.kf0);
        this.LJLILLLLZI = LLLZIIL.findViewById(R.id.mrp);
        int LIZIZ = (int) C74275TDb.LIZIZ(getContext(), 4.0f);
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

    public void setDownloadCallback(C6IJ c6ij) {
        this.LJLJJLL = c6ij;
    }

    @Override // X.C6IJ
    public final void LIZ(TextFontStyleData textFontStyleData, boolean z) {
        LIZIZ();
        TextFontStyleData textFontStyleData2 = this.LJLJJL;
        int i = textFontStyleData2.LIZIZ;
        boolean z2 = false;
        if (i == 1) {
            C6IJ c6ij = this.LJLJJLL;
            if (c6ij != null) {
                if (i == 1) {
                    z2 = true;
                }
                c6ij.LIZ(textFontStyleData2, z2);
            }
            LIZLLL();
            return;
        }
        C30869C9p.LIZIZ(getContext(), getContext().getResources().getString(R.string.gl5));
    }
}
