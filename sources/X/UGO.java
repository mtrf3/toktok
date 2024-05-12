package X;

import Y.ARunnableS49S0100000_13;
import Y.IDCListenerS259S0100000_13;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.BitmapUtils;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UGO extends FrameLayout {
    public UGW LJLIL;
    public C81091Vs7 LJLILLLLZI;
    public UGR LJLJI;
    public Bitmap LJLJJI;
    public Bitmap LJLJJL;
    public Rect LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;

    public final void setOriginBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            this.LJLJJL = bitmap;
            LIZ(0, bitmap);
        }
    }

    public final void setOriginData(String str) {
        byte[] decode = Base64.decode(str, 0);
        Bitmap bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        this.LJLJJL = bitmap;
        o.LJIIIIZZ(bitmap, "bitmap");
        LIZ(0, bitmap);
    }

    public final void setOriginPath(String str) {
        if (str == null) {
            return;
        }
        int readPictureDegree = BitmapUtils.readPictureDegree(str);
        Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(str, 1080, 1080);
        if (bitmapFromSD == null) {
            return;
        }
        LIZ(readPictureDegree, bitmapFromSD);
    }

    public final void setOriginUri(android.net.Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            Bitmap decodeBitmap = BitmapUtils.decodeBitmap(getContext().getContentResolver(), uri, 1080, 1080);
            if (decodeBitmap == null) {
                C30868C9o.LIZJ(R.string.sp2);
            } else {
                new AsyncTaskC66575QAx(this, uri, decodeBitmap).execute1(uri);
            }
        } catch (Exception unused) {
            C30868C9o.LIZJ(R.string.sp2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "mContext");
        View inflate = View.inflate(getContext(), R.layout.d33, this);
        View findViewById = inflate.findViewById(R.id.bzr);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.crop_container)");
        this.LJLIL = (UGW) findViewById;
        View findViewById2 = inflate.findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.iv_cover)");
        this.LJLILLLLZI = (C81091Vs7) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.f1a);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.iv_cover_window)");
        this.LJLJI = (UGR) findViewById3;
        UGW ugw = this.LJLIL;
        if (ugw != null) {
            ugw.setBackgroundColor(C15380j0.LIZIZ(R.color.a4d));
            ugw.setIntercepter(new UGP(this));
            UGR ugr = this.LJLJI;
            if (ugr != null) {
                ugr.LJLJJL = 0;
                ugr.LJLJJLL = 1.0f;
                ugr.LJLJJI = (int) B9K.LIZ(ugr.getContext(), 16.0f);
                ugr.addOnLayoutChangeListener(new IDCListenerS259S0100000_13(this, 5));
                ugr.postDelayed(new ARunnableS49S0100000_13(this, 212), 1000L);
                this.LJLJL = 256;
                this.LJLJLJ = 256;
                return;
            }
            o.LJIJI("mCoverWindow");
            throw null;
        }
        o.LJIJI("mCropContainer");
        throw null;
    }

    public final void LIZ(int i, Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        Bitmap rotateBitmap = BitmapUtils.rotateBitmap(bitmap, i);
        o.LJIIIIZZ(rotateBitmap, "rotateBitmap(bitmap, degree)");
        this.LJLJJI = rotateBitmap;
        C81091Vs7 c81091Vs7 = this.LJLILLLLZI;
        if (c81091Vs7 != null) {
            c81091Vs7.setImageBitmap(rotateBitmap);
        } else {
            o.LJIJI("mCoverImage");
            throw null;
        }
    }
}
