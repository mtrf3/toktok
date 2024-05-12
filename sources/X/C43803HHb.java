package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import kotlin.jvm.internal.o;

/* renamed from: X.HHb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43803HHb extends AbstractC65781Prl implements InterfaceC88472Yns<NLETrack, Boolean> {
    public static final C43803HHb LJLIL = new C43803HHb();

    public C43803HHb() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(NLETrack nLETrack) {
        boolean z;
        NLETrack track = nLETrack;
        o.LJIIIZ(track, "track");
        if (o.LJ(track.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN.name()) || o.LJ(track.getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
