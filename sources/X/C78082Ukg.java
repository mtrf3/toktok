package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.Ukg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78082Ukg implements UCZ {
    public final /* synthetic */ ImageView LIZ;
    public final /* synthetic */ AbstractC78073UkX LIZIZ;

    @Override // X.UCZ
    public final void LIZ(Bitmap bitmap) {
        Bitmap createBitmap;
        if (bitmap == null) {
            return;
        }
        if (o.LJ(this.LIZ, this.LIZIZ.getMGiftIconIv())) {
            try {
                createBitmap = Bitmap.createBitmap(bitmap);
            } catch (OutOfMemoryError unused) {
                return;
            }
        } else {
            createBitmap = C44999HlL.LIZ(bitmap);
        }
        if (createBitmap == null || createBitmap.isRecycled()) {
            return;
        }
        ImageView imageView = this.LIZ;
        if (imageView != null) {
            imageView.setImageBitmap(createBitmap);
        }
        if (this.LIZIZ.getMTrayType() == EnumC78095Ukt.LOCAL) {
            if (this.LIZ == this.LIZIZ.getMAvatarViewNew()) {
                C78102Ul0 LJ = C78110Ul8.LIZ.LIZ.LJ(this.LIZIZ.getMIndex(), null);
                if (LJ != null) {
                    LJ.LIZ = C30725C4b.LIZ() - LJ.LIZJ;
                    LJ.LJ = 1;
                }
                C78072UkW mGiftMsg = this.LIZIZ.getMGiftMsg();
                if (mGiftMsg != null) {
                    mGiftMsg.LJJIJIIJI = System.currentTimeMillis();
                }
                C78072UkW mGiftMsg2 = this.LIZIZ.getMGiftMsg();
                if (mGiftMsg2 != null) {
                    mGiftMsg2.LJJIJIIJIL = 0;
                }
            } else if (this.LIZ == this.LIZIZ.getMGiftIconIv()) {
                C78110Ul8.LIZ.LIZLLL(this.LIZIZ.getMIndex(), false);
                C78072UkW mGiftMsg3 = this.LIZIZ.getMGiftMsg();
                if (mGiftMsg3 != null) {
                    mGiftMsg3.LJJIJIL = System.currentTimeMillis();
                }
                C78072UkW mGiftMsg4 = this.LIZIZ.getMGiftMsg();
                if (mGiftMsg4 != null) {
                    mGiftMsg4.LJJIJL = 0;
                }
            }
        }
        this.LIZIZ.invalidate();
    }

    public C78082Ukg(ImageView imageView, AbstractC78073UkX abstractC78073UkX) {
        this.LIZ = imageView;
        this.LIZIZ = abstractC78073UkX;
    }
}
