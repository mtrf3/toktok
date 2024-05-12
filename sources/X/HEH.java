package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HEH extends AbstractC65781Prl implements InterfaceC88472Yns<MediaModel, CharSequence> {
    public static final HEH LJLIL = new HEH();

    public HEH() {
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
