package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import kotlin.jvm.internal.o;

/* renamed from: X.4qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122204qu extends AbstractC65781Prl implements InterfaceC88472Yns<NLETrack, Boolean> {
    public static final C122204qu LJLIL = new C122204qu();

    public C122204qu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(NLETrack nLETrack) {
        boolean z;
        NLETrack receiver = nLETrack;
        o.LJIIIZ(receiver, "$receiver");
        if (receiver.LJIIZILJ() == EnumC123864ta.AUDIO && o.LJ(C77357UXp.LJIILIIL(receiver), EnumC122254qz.ORIGIN.name())) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
