package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.o;

/* renamed from: X.4kd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118314kd extends AbstractC65781Prl implements InterfaceC88472Yns<MediaModel, CharSequence> {
    public static final C118314kd LJLIL = new C118314kd();

    public C118314kd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(MediaModel mediaModel) {
        MediaModel it = mediaModel;
        o.LJIIIZ(it, "it");
        String str = it.fileLocalUriPath;
        o.LJIIIIZZ(str, "it.fileLocalUriPath");
        return str;
    }
}
