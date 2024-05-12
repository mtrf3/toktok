package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* renamed from: X.4ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122624ra extends AbstractC65781Prl implements InterfaceC88472Yns<NLETrackSlot, CharSequence> {
    public static final C122624ra LJLIL = new C122624ra();

    public C122624ra() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(NLETrackSlot nLETrackSlot) {
        String str;
        NLEResourceAV LJ;
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
        if (LJJ != null && (LJ = LJJ.LJ()) != null) {
            str = LJ.LIZJ();
        } else {
            str = null;
        }
        return String.valueOf(str);
    }
}
