package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.4wB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC125474wB {
    void LJIIIIZZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, boolean z, boolean z2);

    void LJIIIZ(NLETrackSlot nLETrackSlot, long j, long j2, EnumC124724uy enumC124724uy);

    NLETrackSlot LJIIJ(EditMedia editMedia, C124884vE c124884vE);

    void LJIILL(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z, EnumC124724uy enumC124724uy);

    void LJIILLIIL(NLETrackSlot nLETrackSlot, long j, long j2, int i, EnumC124724uy enumC124724uy);

    void LJIJ(List<EditMedia> list, C124884vE c124884vE);

    boolean LJIJI(List list, Boolean bool, AqS152S0100000_2 aqS152S0100000_2);

    void LJJIFFI(NLETrackSlot nLETrackSlot, int i, int i2, EnumC124724uy enumC124724uy);
}
