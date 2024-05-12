package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import kotlin.jvm.internal.o;

/* renamed from: X.5Kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133155Kl extends AbstractC65781Prl implements InterfaceC88472Yns<NLETrack, Boolean> {
    public static final C133155Kl LJLIL = new C133155Kl();

    public C133155Kl() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(NLETrack nLETrack) {
        NLETrack track = nLETrack;
        o.LJIIIZ(track, "track");
        return Boolean.valueOf(o.LJ(track.getExtra("biz_extra_type"), "dub"));
    }
}
