package X;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;

/* renamed from: X.VrZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC81057VrZ {
    JPEG("image/jpeg", LIZJ("jpg", "jpeg")),
    PNG("image/png", LIZJ("png")),
    GIF("image/gif", LIZJ("gif")),
    BMP("image/x-ms-bmp", LIZJ("bmp")),
    WEBP("image/webp", LIZJ("webp")),
    MPEG("video/mpeg", LIZJ("mpeg", "mpg")),
    MP4("video/mp4", LIZJ("mp4", "m4v")),
    QUICKTIME("video/quicktime", LIZJ("mov")),
    THREEGPP("video/3gpp", LIZJ("3gp", "3gpp")),
    THREEGPP2("video/3gpp2", LIZJ("3g2", "3gpp2")),
    MKV("video/x-matroska", LIZJ("mkv")),
    WEBM("video/webm", LIZJ("webm")),
    TS("video/mp2ts", LIZJ("ts")),
    AVI("video/avi", LIZJ("avi"));

    public final String LJLIL;
    public final java.util.Set<String> LJLILLLLZI;

    public static java.util.Set<EnumC81057VrZ> ofAll() {
        return EnumSet.allOf(EnumC81057VrZ.class);
    }

    public static java.util.Set<EnumC81057VrZ> ofImage() {
        return EnumSet.of(JPEG, PNG, GIF, BMP, WEBP);
    }

    public static java.util.Set<EnumC81057VrZ> ofVideo() {
        return EnumSet.of(MPEG, MP4, QUICKTIME, THREEGPP, THREEGPP2, MKV, WEBM, TS, AVI);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    public static C0M4 LIZJ(String... strArr) {
        List asList = Arrays.asList(strArr);
        C0M4 c0m4 = new C0M4();
        if (asList != null) {
            c0m4.addAll(asList);
        }
        return c0m4;
    }

    public static boolean isImage(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("image");
    }

    public static boolean isVideo(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video");
    }

    public static EnumC81057VrZ valueOf(String str) {
        return (EnumC81057VrZ) V0N.LJJJ(EnumC81057VrZ.class, str);
    }

    public static java.util.Set<EnumC81057VrZ> of(EnumC81057VrZ enumC81057VrZ, EnumC81057VrZ... enumC81057VrZArr) {
        return EnumSet.of(enumC81057VrZ, enumC81057VrZArr);
    }

    public boolean checkType(Context context, ContentResolver contentResolver, android.net.Uri uri) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (uri == null) {
            return false;
        }
        String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
        String str = null;
        boolean z = false;
        for (String str2 : this.LJLILLLLZI) {
            if (str2.equals(extensionFromMimeType)) {
                return true;
            }
            if (!z) {
                str = C00S.LIZIZ(context, uri);
                if (!TextUtils.isEmpty(str)) {
                    str = str.toLowerCase(Locale.US);
                }
                z = true;
            }
            if (str != null && str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    EnumC81057VrZ(String str, C0M4 c0m4) {
        this.LJLIL = str;
        this.LJLILLLLZI = c0m4;
    }
}
