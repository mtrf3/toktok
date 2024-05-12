package androidx.core.graphics.drawable;

import X.C07B;
import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode LJIIJ = PorterDuff.Mode.SRC_IN;
    public int LIZ;
    public Object LIZIZ;
    public byte[] LIZJ;
    public Parcelable LIZLLL;
    public int LJ;
    public int LJFF;
    public ColorStateList LJI;
    public PorterDuff.Mode LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    public final int LIZLLL() {
        int i = this.LIZ;
        if (i == -1) {
            if (Build.VERSION.SDK_INT >= 23) {
                return C07B.LIZ(this.LIZIZ);
            }
        } else if (i == 2) {
            return this.LJ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("called getResId() on ");
        LIZ.append(this);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final String LJ() {
        int i = this.LIZ;
        if (i == -1) {
            if (Build.VERSION.SDK_INT >= 23) {
                return C07B.LIZIZ(this.LIZIZ);
            }
        } else if (i == 2) {
            String str = this.LJIIIZ;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.LIZIZ).split(":", -1)[0];
            }
            return this.LJIIIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("called getResPackage() on ");
        LIZ.append(this);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final Uri LJI() {
        int i = this.LIZ;
        if (i == -1) {
            if (Build.VERSION.SDK_INT >= 23) {
                return C07B.LIZLLL(this.LIZIZ);
            }
        } else if (i == 4 || i == 6) {
            return UriProtector.parse((String) this.LIZIZ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("called getUri() on ");
        LIZ.append(this);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final String toString() {
        String str;
        if (this.LIZ == -1) {
            return String.valueOf(this.LIZIZ);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.LIZ) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.LIZ) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.LIZIZ).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.LIZIZ).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.LJIIIZ);
                sb.append(" id=");
                sb.append(C16880lQ.LLLZ("0x%08x", new Object[]{Integer.valueOf(LIZLLL())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.LJ);
                if (this.LJFF != 0) {
                    sb.append(" off=");
                    sb.append(this.LJFF);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.LIZIZ);
                break;
        }
        if (this.LJI != null) {
            sb.append(" tint=");
            sb.append(this.LJI);
        }
        if (this.LJII != LJIIJ) {
            sb.append(" mode=");
            sb.append(this.LJII);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat() {
        this.LIZ = -1;
        this.LJII = LJIIJ;
    }

    public IconCompat(int i) {
        this.LJII = LJIIJ;
        this.LIZ = i;
    }

    public final void LIZ(Context context) {
        Object obj;
        int identifier;
        if (this.LIZ == 2 && (obj = this.LIZIZ) != null) {
            String str = (String) obj;
            if (!str.contains(":")) {
                return;
            }
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if (!"0_resource_name_obfuscated".equals(str4) && this.LJ != (identifier = LJFF(context, LJ()).getIdentifier(str4, str3, str5))) {
                this.LJ = identifier;
            }
        }
    }

    public final InputStream LJII(Context context) {
        Uri LJI = LJI();
        String scheme = LJI.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.LIZIZ));
            } catch (FileNotFoundException | Exception unused) {
                return null;
            }
        }
        return context.getContentResolver().openInputStream(LJI);
    }

    public final Icon LJIIIIZZ(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C07B.LJFF(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public static Bitmap LIZIZ(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static Resources LJFF(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(packageManager, str, FileUtils.BUFFER_SIZE);
            if (LLLLLLLLL != null) {
                return packageManager.getResourcesForApplication(LLLLLLLLL);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static IconCompat LIZJ(Resources resources, String str, int i) {
        str.getClass();
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.LJ = i;
            if (resources != null) {
                try {
                    iconCompat.LIZIZ = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.LIZIZ = str;
            }
            iconCompat.LJIIIZ = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }
}
