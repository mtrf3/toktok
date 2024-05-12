package X;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.facebook.GraphRequest;
import java.io.Closeable;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import m43.u;

/* renamed from: X.Q3t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66389Q3t {
    public final OutputStream LIZ;
    public final C66395Q3z LIZIZ;
    public boolean LIZJ = true;
    public final boolean LIZLLL;

    public final void LJI() {
        if (!this.LIZLLL) {
            LJ("--%s", GraphRequest.LJII);
            return;
        }
        OutputStream outputStream = this.LIZ;
        byte[] bytes = "&".getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
        outputStream.write(bytes);
    }

    public final void LIZ(String str, Object... args) {
        o.LJIIIZ(args, "args");
        if (!this.LIZLLL) {
            if (this.LIZJ) {
                OutputStream outputStream = this.LIZ;
                Charset charset = PVC.LIZ;
                byte[] bytes = "--".getBytes(charset);
                o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                OutputStream outputStream2 = this.LIZ;
                String str2 = GraphRequest.LJII;
                if (str2 != null) {
                    byte[] bytes2 = str2.getBytes(charset);
                    o.LJIIIIZZ(bytes2, "(this as java.lang.String).getBytes(charset)");
                    outputStream2.write(bytes2);
                    OutputStream outputStream3 = this.LIZ;
                    byte[] bytes3 = "\r\n".getBytes(charset);
                    o.LJIIIIZZ(bytes3, "(this as java.lang.String).getBytes(charset)");
                    outputStream3.write(bytes3);
                    this.LIZJ = false;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            OutputStream outputStream4 = this.LIZ;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            byte[] bytes4 = Q8U.LIZIZ(copyOf, copyOf.length, str, "java.lang.String.format(format, *args)").getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes4, "(this as java.lang.String).getBytes(charset)");
            outputStream4.write(bytes4);
            return;
        }
        OutputStream outputStream5 = this.LIZ;
        Locale locale = Locale.US;
        Object[] copyOf2 = Arrays.copyOf(args, args.length);
        String LLLZI = C16880lQ.LLLZI(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
        o.LJIIIIZZ(LLLZI, "java.lang.String.format(locale, format, *args)");
        String encode = URLEncoder.encode(LLLZI, "UTF-8");
        o.LJIIIIZZ(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
        byte[] bytes5 = encode.getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes5, "(this as java.lang.String).getBytes(charset)");
        outputStream5.write(bytes5);
    }

    public final void LJ(String str, Object... objArr) {
        LIZ(str, Arrays.copyOf(objArr, objArr.length));
        if (!this.LIZLLL) {
            LIZ("\r\n", new Object[0]);
        }
    }

    public final void LJII(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        LIZIZ(key, null, null);
        LJ("%s", value);
        LJI();
        C66395Q3z c66395Q3z = this.LIZIZ;
        if (c66395Q3z == null) {
            return;
        }
        c66395Q3z.LIZ(value, o.LJIILLIIL(key, "    "));
    }

    public C66389Q3t(OutputStream outputStream, C66395Q3z c66395Q3z, boolean z) {
        this.LIZ = outputStream;
        this.LIZIZ = c66395Q3z;
        this.LIZLLL = z;
    }

    public final void LIZIZ(String str, String str2, String str3) {
        if (!this.LIZLLL) {
            LIZ("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                LIZ("; filename=\"%s\"", str2);
            }
            LJ("", new Object[0]);
            if (str3 != null) {
                LJ("%s: %s", "Content-Type", str3);
            }
            LJ("", new Object[0]);
            return;
        }
        OutputStream outputStream = this.LIZ;
        byte[] bytes = Q8U.LIZIZ(new Object[]{str}, 1, "%s=", "java.lang.String.format(format, *args)").getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
        outputStream.write(bytes);
    }

    public final void LIZJ(android.net.Uri contentUri, String key, String str) {
        int LJIIIZ;
        long j;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(contentUri, "contentUri");
        if (str == null) {
            str = "content/unknown";
        }
        LIZIZ(key, key, str);
        if (this.LIZ instanceof Q41) {
            Cursor cursor = null;
            try {
                cursor = C66373Q3d.LIZLLL(u.LIZJ().getContentResolver(), contentUri);
                if (cursor == null) {
                    j = 0;
                } else {
                    int columnIndex = cursor.getColumnIndex("_size");
                    cursor.moveToFirst();
                    j = cursor.getLong(columnIndex);
                    cursor.close();
                }
                ((Q41) this.LIZ).LIZIZ(j);
                LJIIIZ = 0;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            LJIIIZ = C66373Q3d.LJIIIZ(u.LIZJ().getContentResolver().openInputStream(contentUri), this.LIZ);
        }
        LJ("", new Object[0]);
        LJI();
        C66395Q3z c66395Q3z = this.LIZIZ;
        if (c66395Q3z == null) {
            return;
        }
        String LJIILLIIL = o.LJIILLIIL(key, "    ");
        String LLLZI = C16880lQ.LLLZI(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(LJIIIZ)}, 1));
        o.LJIIIIZZ(LLLZI, "java.lang.String.format(locale, format, *args)");
        c66395Q3z.LIZ(LLLZI, LJIILLIIL);
    }

    public final void LIZLLL(String key, ParcelFileDescriptor descriptor, String str) {
        int LJIIIZ;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(descriptor, "descriptor");
        if (str == null) {
            str = "content/unknown";
        }
        LIZIZ(key, key, str);
        OutputStream outputStream = this.LIZ;
        if (outputStream instanceof Q41) {
            ((Q41) outputStream).LIZIZ(descriptor.getStatSize());
            LJIIIZ = 0;
        } else {
            LJIIIZ = C66373Q3d.LJIIIZ(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), this.LIZ);
        }
        LJ("", new Object[0]);
        LJI();
        C66395Q3z c66395Q3z = this.LIZIZ;
        if (c66395Q3z == null) {
            return;
        }
        String LJIILLIIL = o.LJIILLIIL(key, "    ");
        String LLLZI = C16880lQ.LLLZI(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(LJIIIZ)}, 1));
        o.LJIIIIZZ(LLLZI, "java.lang.String.format(locale, format, *args)");
        c66395Q3z.LIZ(LLLZI, LJIILLIIL);
    }

    public final void LJFF(String key, Object obj, GraphRequest graphRequest) {
        o.LJIIIZ(key, "key");
        Closeable closeable = this.LIZ;
        if (closeable instanceof Q4D) {
            ((Q4D) closeable).LIZ(graphRequest);
        }
        if (C66388Q3s.LJFF(obj)) {
            LJII(key, C66388Q3s.LJII(obj));
            return;
        }
        if (obj instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) obj;
            o.LJIIIZ(bitmap, "bitmap");
            LIZIZ(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.LIZ);
            LJ("", new Object[0]);
            LJI();
            C66395Q3z c66395Q3z = this.LIZIZ;
            if (c66395Q3z == null) {
                return;
            }
            c66395Q3z.LIZ("<Image>", o.LJIILLIIL(key, "    "));
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bytes = (byte[]) obj;
            o.LJIIIZ(bytes, "bytes");
            LIZIZ(key, key, "content/unknown");
            this.LIZ.write(bytes);
            LJ("", new Object[0]);
            LJI();
            C66395Q3z c66395Q3z2 = this.LIZIZ;
            if (c66395Q3z2 == null) {
                return;
            }
            String LJIILLIIL = o.LJIILLIIL(key, "    ");
            String LLLZI = C16880lQ.LLLZI(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
            o.LJIIIIZZ(LLLZI, "java.lang.String.format(locale, format, *args)");
            c66395Q3z2.LIZ(LLLZI, LJIILLIIL);
            return;
        }
        if (obj instanceof android.net.Uri) {
            LIZJ((android.net.Uri) obj, key, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            LIZLLL(key, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (obj instanceof GraphRequest.ParcelableResourceWithMimeType) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = (GraphRequest.ParcelableResourceWithMimeType) obj;
            RESOURCE resource = parcelableResourceWithMimeType.resource;
            String str = parcelableResourceWithMimeType.mimeType;
            if (resource instanceof ParcelFileDescriptor) {
                LIZLLL(key, (ParcelFileDescriptor) resource, str);
                return;
            } else {
                if (resource instanceof android.net.Uri) {
                    LIZJ((android.net.Uri) resource, key, str);
                    return;
                }
                throw new IllegalArgumentException("value is not a supported type.");
            }
        }
        throw new IllegalArgumentException("value is not a supported type.");
    }
}
