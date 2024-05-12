package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Hkb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44953Hkb {
    public static final /* synthetic */ int LIZ = 0;

    public static AbstractC44957Hkf LIZ(Context context, InterfaceC87766YcU interfaceC87766YcU, Aweme aweme, String enterFrom, String enterMethod, Bundle mobDownloadBundle, boolean z, String str, int i, String shareChannel, String downloadActionType, int i2, boolean z2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(mobDownloadBundle, "mobDownloadBundle");
        o.LJIIIZ(shareChannel, "shareChannel");
        o.LJIIIZ(downloadActionType, "downloadActionType");
        if (C1DF.LJJIII(aweme)) {
            return new C44952Hka(context, interfaceC87766YcU, aweme, enterFrom, enterMethod, mobDownloadBundle, str, i, shareChannel, downloadActionType, i2, z2);
        }
        return new C44956Hke(context, interfaceC87766YcU, aweme, enterFrom, enterMethod, mobDownloadBundle, z, str, i, shareChannel, downloadActionType, i2, z2);
    }
}
