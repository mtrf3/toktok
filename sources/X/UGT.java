package X;

import Y.ACallableS116S0100000_13;
import Y.AgS123S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCameraSetting;
import com.bytedance.common.utility.BitmapUtils;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.io.FileDescriptor;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UGT extends FrameLayout {
    public static final float LJLJJLL;
    public UGW LJLIL;
    public C81091Vs7 LJLILLLLZI;
    public UGV LJLJI;
    public Bitmap LJLJJI;
    public Rect LJLJJL;

    static {
        float f;
        if (LiveCoverCameraSetting.INSTANCE.enable()) {
            f = 0.0f;
        } else {
            f = 16.0f;
        }
        LJLJJLL = f;
    }

    public final void LIZ(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        C81091Vs7 c81091Vs7 = this.LJLILLLLZI;
        if (c81091Vs7 != null) {
            if (c81091Vs7.getPinchMode() == 0) {
                C10K.LIZJ(new ACallableS116S0100000_13(this, 0)).LJ(new AgS123S0100000_6(interfaceC88472Yns, 0), C10K.LJIIIIZZ, null);
                return;
            }
            return;
        }
        o.LJIJI("mCoverImage");
        throw null;
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
        Bitmap rotateBitmap = BitmapUtils.rotateBitmap(bitmapFromSD, readPictureDegree);
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

    public final void setOriginUri(android.net.Uri uri) {
        boolean z;
        FileDescriptor fileDescriptor;
        if (uri == null) {
            return;
        }
        try {
            Bitmap decodeBitmap = BitmapUtils.decodeBitmap(getContext().getContentResolver(), uri, 1080, 1080);
            if (decodeBitmap == null) {
                C30868C9o.LIZJ(R.string.sp2);
                return;
            }
            String LIZJ = C31950CgM.LIZJ(getContext(), uri);
            int i = 0;
            if (LIZJ == null || ujb.o.LJJJJJL(LIZJ)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = BitmapUtils.readPictureDegree(LIZJ);
            } else if (Build.VERSION.SDK_INT >= 24) {
                try {
                    ParcelFileDescriptor openFileDescriptor = getContext().getContentResolver().openFileDescriptor(uri, "r");
                    if (openFileDescriptor != null && (fileDescriptor = openFileDescriptor.getFileDescriptor()) != null) {
                        int attributeInt = new ExifInterface(fileDescriptor).getAttributeInt("Orientation", 1);
                        if (attributeInt != 3) {
                            if (attributeInt != 6) {
                                if (attributeInt == 8) {
                                    i = 270;
                                }
                            } else {
                                i = 90;
                            }
                        } else {
                            i = 180;
                        }
                    }
                } catch (IOException unused) {
                }
            } else {
                i = BitmapUtils.readPictureDegree(uri.getPath());
            }
            Bitmap rotateBitmap = BitmapUtils.rotateBitmap(decodeBitmap, i);
            o.LJIIIIZZ(rotateBitmap, "rotateBitmap(bitmap, degree)");
            this.LJLJJI = rotateBitmap;
            C81091Vs7 c81091Vs7 = this.LJLILLLLZI;
            if (c81091Vs7 != null) {
                c81091Vs7.setImageBitmap(rotateBitmap);
            } else {
                o.LJIJI("mCoverImage");
                throw null;
            }
        } catch (Exception unused2) {
            C30868C9o.LIZJ(R.string.sp2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "mContext");
        View inflate = View.inflate(getContext(), R.layout.cvh, this);
        View findViewById = inflate.findViewById(R.id.bzr);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.crop_container)");
        this.LJLIL = (UGW) findViewById;
        View findViewById2 = inflate.findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.iv_cover)");
        this.LJLILLLLZI = (C81091Vs7) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.f1a);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.iv_cover_window)");
        this.LJLJI = (UGV) findViewById3;
        UGW ugw = this.LJLIL;
        if (ugw != null) {
            ugw.setBackgroundColor(C15380j0.LIZIZ(R.color.a4d));
            ugw.setIntercepter(new UGU(this));
        } else {
            o.LJIJI("mCropContainer");
            throw null;
        }
    }
}
