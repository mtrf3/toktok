package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173596rb extends AbstractC65781Prl implements InterfaceC88472Yns<MediaModel, CharSequence> {
    public static final C173596rb LJLIL = new C173596rb();

    public C173596rb() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(MediaModel mediaModel) {
        MediaModel mediaModel2 = mediaModel;
        o.LJIIIZ(mediaModel2, "mediaModel");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(mediaModel2.width);
        LIZ.append('*');
        LIZ.append(mediaModel2.height);
        return X1D.LIZIZ(LIZ);
    }
}
