package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import kotlin.jvm.internal.o;

/* renamed from: X.4qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122234qx extends AbstractC65781Prl implements InterfaceC88472Yns<NLETrack, Boolean> {
    public static final C122234qx LJLIL = new C122234qx();

    public C122234qx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(NLETrack nLETrack) {
        boolean z;
        NLETrack track = nLETrack;
        o.LJIIIZ(track, "track");
        if (C124574uj.LJJJJIZL(track) || o.LJ(track.getExtra("AudioTrackType"), EnumC122254qz.DUB.name()) || o.LJ(track.getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
