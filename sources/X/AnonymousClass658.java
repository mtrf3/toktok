package X;

import android.content.Context;
import android.graphics.Point;
import com.bytedance.bddatefmt.BDDateFormat;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.658, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass658 {
    public final Context LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public String LJ;

    public final List<TextStickerData> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        Context context = this.LIZ;
        String string = context.getString(R.string.p5);
        o.LJIIIIZZ(string, "context.getString(R.stri…D_xNotifs_thisDay_header)");
        float f = 2;
        arrayList.add(LIZ(context, string, this.LIZIZ / f, this.LIZJ / f, 36, this.LJ));
        Context context2 = this.LIZ;
        arrayList.add(LIZ(context2, this.LIZLLL, this.LIZIZ / f, KL2.LIZJ(context2, 40.0f) + (this.LIZJ / f), 20, "Proxima-Nova-Semibold.otf"));
        return arrayList;
    }

    public final void LIZJ(final InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        C68M.LJIIJ().LIZIZ("Damion-Regular.ttf", new C68O() { // from class: X.659
            @Override // X.C68O
            public final void onFail() {
            }

            @Override // X.C68O
            public final void onSuccess() {
            }

            @Override // X.C68O
            public final void LIZ(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                interfaceC88472Yns.invoke(Boolean.valueOf(booleanValue));
                if (!booleanValue) {
                    this.LJ = "Proxima-Nova-Semibold.otf";
                }
            }
        });
    }

    public AnonymousClass658(long j, Context context, InterfaceC143655kP previewApi) {
        int LJIIJJI;
        int LJIIIZ;
        VESize LLILZ;
        VESize LLILZ2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(previewApi, "previewApi");
        this.LIZ = context;
        C5MG WS = previewApi.WS();
        if (WS != null && (LLILZ2 = ((C133765Mu) WS.LJJ()).LLILZ()) != null) {
            LJIIJJI = LLILZ2.width;
        } else {
            LJIIJJI = KL2.LJIIJJI(context);
        }
        this.LIZIZ = LJIIJJI;
        C5MG WS2 = previewApi.WS();
        if (WS2 != null && (LLILZ = ((C133765Mu) WS2.LJJ()).LLILZ()) != null) {
            LJIIIZ = LLILZ.height;
        } else {
            LJIIIZ = KL2.LJIIIZ(context);
        }
        this.LIZJ = LJIIIZ;
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        this.LIZLLL = new BDDateFormat("M/D/YYYY").LIZIZ(j * 1000, locale);
        this.LJ = "Damion-Regular.ttf";
    }

    public final TextStickerData LIZ(Context context, String str, float f, float f2, int i, String str2) {
        C68M.LJIIJ().LIZJ = str2;
        TextStickerData textStickerData = new TextStickerData(str, 1, -1, 2, str2, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -32, -1, 1048575, null);
        textStickerData.setScale(i / textStickerData.getFontSize());
        textStickerData.setX(f);
        textStickerData.setY(f2);
        textStickerData.setEditCenterPoint(new Point(this.LIZIZ / 2, this.LIZJ / 2));
        textStickerData.setTextWrapList(C47261Igj.LJJIJ(C68W.LIZJ(C68W.LJIILJJIL(textStickerData, context))));
        return textStickerData;
    }
}
