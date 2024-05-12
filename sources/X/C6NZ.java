package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6NZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NZ {
    public final Context LIZ;
    public final OSZ<Integer, Integer> LIZIZ;
    public final InterfaceC88475Ynv<Bitmap, Integer, Integer, Integer, Integer, Bitmap> LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final InterfaceC88472Yns<StickerModel, C76800UCe> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6NZ)) {
            return false;
        }
        C6NZ c6nz = (C6NZ) obj;
        return o.LJ(this.LIZ, c6nz.LIZ) && o.LJ(this.LIZIZ, c6nz.LIZIZ) && o.LJ(this.LIZJ, c6nz.LIZJ) && this.LIZLLL == c6nz.LIZLLL && this.LJ == c6nz.LJ && o.LJ(this.LJFF, c6nz.LJFF);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        InterfaceC88475Ynv<Bitmap, Integer, Integer, Integer, Integer, Bitmap> interfaceC88475Ynv = this.LIZJ;
        int hashCode2 = (((((hashCode + (interfaceC88475Ynv == null ? 0 : interfaceC88475Ynv.hashCode())) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        InterfaceC88472Yns<StickerModel, C76800UCe> interfaceC88472Yns = this.LJFF;
        return hashCode2 + (interfaceC88472Yns != null ? interfaceC88472Yns.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerCompileParams(context=");
        LIZ.append(this.LIZ);
        LIZ.append(", videoCanvasSize=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", resizeBitmap=");
        LIZ.append(this.LIZJ);
        LIZ.append(", compileWholePageOrStickerOnly=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", minResWithTextSticker=");
        LIZ.append(this.LJ);
        LIZ.append(", updateStickerSize=");
        return C249109q6.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6NZ(Context context, OSZ<Integer, Integer> videoCanvasSize, InterfaceC88475Ynv<? super Bitmap, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Bitmap> interfaceC88475Ynv, int i, int i2, InterfaceC88472Yns<? super StickerModel, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(videoCanvasSize, "videoCanvasSize");
        this.LIZ = context;
        this.LIZIZ = videoCanvasSize;
        this.LIZJ = interfaceC88475Ynv;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = interfaceC88472Yns;
    }
}
