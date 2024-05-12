package X;

import android.animation.ObjectAnimator;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.67Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67Q extends C67P {
    @Override // X.C67P
    public final void LJFF() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    @Override // X.C67P
    public final void LJI() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    @Override // X.C67P
    public final C67V LIZIZ() {
        return new C67U();
    }

    @Override // X.C67P
    public final TextStickerData LJ() {
        if (this.LJZL == null) {
            TextStickerData textStickerData = new TextStickerData("", this.LJLJL, this.LJLJLJ, this.LJLJJI.LIZLLL, this.LJLJLLL, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -32, -1, 1048575, null);
            this.LJZL = textStickerData;
            List<TextStickerTextWrap> mTextWrapList = this.LJLJJLL;
            o.LJIIIIZZ(mTextWrapList, "mTextWrapList");
            textStickerData.setTextWrapList(mTextWrapList);
        }
        this.LJZL.setTextStr(getText());
        this.LJZL.setX(this.LJLIL);
        this.LJZL.setY(this.LJLILLLLZI);
        this.LJZL.setRotation(this.LJLJJI.LIZIZ);
        this.LJZL.setScale(this.LJLJJI.LIZ);
        TextStickerData textStickerData2 = this.LJZL;
        List<TextStickerTextWrap> mTextWrapList2 = this.LJLJJLL;
        o.LJIIIIZZ(mTextWrapList2, "mTextWrapList");
        textStickerData2.setTextWrapList(mTextWrapList2);
        this.LJZL.setBgMode(this.LJLJL);
        this.LJZL.setColor(this.LJLJLJ);
        this.LJZL.setAlign(this.LJLJJI.LIZLLL);
        this.LJZL.setFontType(this.LJLJLLL);
        this.LJZL.setLayoutWidth(getMeasuredWidth());
        this.LJZL.setLayoutHeight(getMeasuredHeight());
        TextStickerData mData = this.LJZL;
        o.LJIIIIZZ(mData, "mData");
        return mData;
    }

    @Override // X.C67P
    public final float LIZJ() {
        if (C90193gN.LIZIZ(getContext())) {
            return KL2.LIZJ(getContext(), 8.0f) + (getMeasuredWidth() / 2.0f);
        }
        return (getMeasuredWidth() / 2.0f) - KL2.LIZJ(getContext(), 8.0f);
    }

    public final void setSafeAreaHeight(int i) {
        C67U c67u;
        C67V c67v = this.LJLZ;
        if (!(c67v instanceof C67U) || (c67u = (C67U) c67v) == null || i < 0) {
            return;
        }
        c67u.LJJJJJ = i;
    }

    public final void setStickerTextColor(int i) {
        int curMode = getCurMode();
        int curAlignTxt = getCurAlignTxt();
        String curFontType = getCurFontType();
        o.LJIIIIZZ(curFontType, "curFontType");
        LJJI(curMode, i, curAlignTxt, curFontType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4 != 4) goto L13;
     */
    @Override // X.C67P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(int r4, int r5, int r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.String r0 = "fontType"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r3.LJZL
            if (r0 == 0) goto L1b
            r0.setBgMode(r4)
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r3.LJZL
            r0.setColor(r5)
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r3.LJZL
            r0.setFontType(r7)
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r3.LJZL
            r0.setAlign(r6)
        L1b:
            r3.LJLJL = r4
            r3.setDrawStrokeState(r4)
            r3.LJLJLJ = r5
            r3.LJLJLLL = r7
            X.68M r1 = X.C68M.LJIIJ()
            java.lang.String r0 = r3.LJLJLLL
            r1.LIZJ = r0
            r2 = 1
            if (r4 == r2) goto L6d
            r0 = 2
            r1 = -1
            if (r4 == r0) goto L50
            r0 = 3
            if (r4 == r0) goto L41
            r0 = 4
            if (r4 == r0) goto L6d
        L39:
            X.67y r0 = r3.LJLJJI
            r0.LIZLLL = r6
            r3.invalidate()
            return
        L41:
            r3.setTextColor(r1)
            int r0 = X.C1551767d.LJIILIIL(r5)
            r3.LIZ(r0)
            X.67y r0 = r3.LJLJJI
            r0.LJFF = r2
            goto L39
        L50:
            if (r5 != r1) goto L69
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setTextColor(r0)
        L57:
            boolean r0 = r3.LJLLILLLL
            if (r0 == 0) goto L61
            r0 = 1461065763(0x57161823, float:1.6503041E14)
            r3.setTextColor(r0)
        L61:
            r3.LIZ(r5)
            X.67y r0 = r3.LJLJJI
            r0.LJFF = r2
            goto L39
        L69:
            r3.setTextColor(r1)
            goto L57
        L6d:
            r3.setTextColor(r5)
            X.67y r1 = r3.LJLJJI
            r0 = 0
            r1.LJFF = r0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67Q.LJJI(int, int, int, java.lang.String):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67Q(ActivityC45651qj context, SafeHandler safeHandler, TextStickerData textStickerData, boolean z, AnonymousClass651 anonymousClass651, C82622Wbi c82622Wbi) {
        super(context, safeHandler, textStickerData, z, anonymousClass651, Boolean.FALSE, c82622Wbi);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        setEnableEdit(false);
    }
}
