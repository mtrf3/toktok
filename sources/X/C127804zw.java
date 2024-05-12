package X;

import android.content.Intent;
import com.ss.ugc.android.editor.components.base.api.IAlbumService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127804zw {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(AnonymousClass501.LJLIL);

    public static List LIZ(ActivityC45651qj activity, Intent intent, Integer num) {
        o.LJIIIZ(activity, "activity");
        IAlbumService iAlbumService = (IAlbumService) LIZ.getValue();
        if (iAlbumService != null) {
            return iAlbumService.parseIntentData(activity, intent, num);
        }
        return null;
    }

    public static void LIZIZ(ActivityC45651qj activity, long j, boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        IAlbumService iAlbumService = (IAlbumService) LIZ.getValue();
        if (iAlbumService != null) {
            iAlbumService.startSelectMedia(activity, 3008, new AnonymousClass508(388743680L, 1, Long.valueOf(j), EnumC127814zx.REPLACE, z, 16), interfaceC65784Pro);
        }
    }
}
