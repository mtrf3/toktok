package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Waw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82574Waw implements InterfaceC70769Rq1 {
    public final /* synthetic */ C82573Wav LJLIL;

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
    }

    public C82574Waw(C82573Wav c82573Wav) {
        this.LJLIL = c82573Wav;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        String str;
        this.LJLIL.LLIIIZ = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Load Custom Sticker Error, file path: ");
        if (uri != null) {
            str = uri.getPath();
        } else {
            str = null;
        }
        LIZ.append(str);
        C170666ms.LIZIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        this.LJLIL.LLIIIZ = true;
        if (animatable != null || !C1B8.LIZJ()) {
            C82573Wav c82573Wav = this.LJLIL;
            c82573Wav.LLFZ = true;
            TextView textView = c82573Wav.LJLLILLLL;
            if (textView != null) {
                textView.setVisibility(4);
                ARV arv = c82573Wav.LJLLI;
                if (arv != null) {
                    arv.setVisibility(4);
                } else {
                    o.LJIJI("cutoutIV");
                    throw null;
                }
            } else {
                o.LJIJI("cutoutTv");
                throw null;
            }
        } else {
            C82573Wav c82573Wav2 = this.LJLIL;
            c82573Wav2.LLFZ = false;
            TextView textView2 = c82573Wav2.LJLLILLLL;
            if (textView2 != null) {
                textView2.setVisibility(0);
                ARV arv2 = c82573Wav2.LJLLI;
                if (arv2 != null) {
                    arv2.setVisibility(0);
                } else {
                    o.LJIJI("cutoutIV");
                    throw null;
                }
            } else {
                o.LJIJI("cutoutTv");
                throw null;
            }
        }
        C82573Wav c82573Wav3 = this.LJLIL;
        if (!c82573Wav3.LLI && c2047581v != null) {
            SmartImageView smartImageView = c82573Wav3.LJLJLJ;
            if (smartImageView != null) {
                int width = smartImageView.getWidth();
                SmartImageView smartImageView2 = c82573Wav3.LJLJLJ;
                if (smartImageView2 != null) {
                    int height = smartImageView2.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = c82573Wav3.LJZ / c82573Wav3.LJZI;
                    if (f3 > f / f2) {
                        c82573Wav3.LLD = width;
                        c82573Wav3.LL = (int) (width / f3);
                    } else {
                        c82573Wav3.LL = height;
                        c82573Wav3.LLD = (int) (height * f3);
                    }
                    int i = c82573Wav3.LLD;
                    c82573Wav3.LLIFFJFJJ = (c82573Wav3.LJZL * 1.0f) / i;
                    int i2 = (width - i) / 2;
                    c82573Wav3.LLIIIILZ = i2;
                    int i3 = c82573Wav3.LL;
                    int i4 = (height - i3) / 2;
                    c82573Wav3.LLIIIJ = i4;
                    c82573Wav3.LLII = i2;
                    c82573Wav3.LLIIII = i4;
                    float f4 = 2;
                    float f5 = (f - (i * 0.75f)) / f4;
                    float f6 = (f2 - (i3 * 0.75f)) / f4;
                    ArrayList<Coordinate> arrayList = new ArrayList<>();
                    arrayList.add(new Coordinate((c82573Wav3.LLD * 0.75f) + f5, f6));
                    arrayList.add(new Coordinate((c82573Wav3.LLD * 0.75f) + f5, (c82573Wav3.LL * 0.75f) + f6));
                    arrayList.add(new Coordinate(f5, (c82573Wav3.LL * 0.75f) + f6));
                    arrayList.add(new Coordinate(f5, f6));
                    c82573Wav3.LLILII.add(arrayList);
                    c82573Wav3.LLI = true;
                    return;
                }
                o.LJIJI("originalView");
                throw null;
            }
            o.LJIJI("originalView");
            throw null;
        }
    }
}
