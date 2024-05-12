package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.emoji.utils.EmojiApi;
import defpackage.i0;

/* renamed from: X.2we, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74802we {
    public static final EmojiApi LIZ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append(EF7.LJI.LIZ);
        LIZ = (EmojiApi) RetrofitFactory.LIZLLL().create(i0.LJFF(X1D.LIZIZ(LIZ2), "/aweme/v1/")).create(EmojiApi.class);
    }
}
