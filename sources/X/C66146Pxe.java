package X;

import android.provider.MediaStore;
import kotlin.jvm.internal.o;

/* renamed from: X.Pxe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66146Pxe implements InterfaceC66178PyA {
    public static final java.util.Map<String, C66153Pxl> LIZIZ;
    public static final C66146Pxe LIZJ = new C66146Pxe();
    public static final int[] LIZ = {240020, 240021, 240022, 240023, 240024, 240025, 240026, 240027, 240028, 240029, 240030, 240031, 240032, 240033, 240034, 240035, 240036, 240037, 240038, 240039, 240040, 240041};

    @Override // X.InterfaceC66178PyA
    public final String LIZIZ() {
        return "ContentProvider";
    }

    @Override // X.InterfaceC66178PyA
    public final String getResourceId() {
        return "cp";
    }

    static {
        android.net.Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        o.LJIIIIZZ(uri, "MediaStore.Images.Media.EXTERNAL_CONTENT_URI");
        android.net.Uri uri2 = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        o.LJIIIIZZ(uri2, "MediaStore.Images.Media.INTERNAL_CONTENT_URI");
        LIZIZ = C113554cx.LJJL(new OSZ("media", new C66153Pxl("Album", 240020, 240021)), new OSZ("call_log", new C66153Pxl("Calls", 240022, 240023)), new OSZ("sms", new C66153Pxl("Messages", 240024, 240025)), new OSZ("mms", new C66153Pxl("Messages", 240026, 240027)), new OSZ("browser", new C66153Pxl("Browser", 240028, 240029)), new OSZ("mms-sms", new C66153Pxl("Messages", 240030, 240031)), new OSZ("com.android.calendar", new C66153Pxl("Calendar", 240032, 240033)), new OSZ("com.android.contacts", new C66153Pxl("Contacts", 240034, 240035)), new OSZ("com.android.chrome.browser", new C66153Pxl("Chrome", 240036, 240037)), new OSZ(uri.getAuthority(), new C66153Pxl("ExternalImages", 240038, 240039)), new OSZ(uri2.getAuthority(), new C66153Pxl("InternalImages", 240040, 240041)));
    }

    @Override // X.InterfaceC66178PyA
    public final int[] LIZJ() {
        return LIZ;
    }
}
