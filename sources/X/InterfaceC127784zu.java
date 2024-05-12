package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.vesdk.VEEditor;
import java.util.List;

/* renamed from: X.4zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC127784zu {
    void A3(long j, AnonymousClass519 anonymousClass519);

    void B3();

    long H9();

    void I9();

    void J9();

    MutableLiveData K9();

    MutableLiveData L9();

    void LIZ(int i, int i2, int i3, int i4);

    void M9(long j);

    void N9(C5J0 c5j0);

    void O9(long j, EnumC133595Md enumC133595Md, AnonymousClass519 anonymousClass519);

    void P9(NLETrackSlot nLETrackSlot);

    void Q9(long j, long j2, boolean z);

    void R9();

    void S9(NLETrackSlot nLETrackSlot, int i);

    void T9(C5J0 c5j0);

    void U9(InterfaceC132775Iz interfaceC132775Iz);

    void V9();

    void W9(Integer num);

    void X9(NLEModel nLEModel, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    String Y9();

    void Z9(InterfaceC132665Io interfaceC132665Io);

    void aa(long j, long j2, boolean z, boolean z2);

    VEEditor ba(String str, String str2, C125964wy c125964wy);

    void ca(long j, float f, float f2);

    void da(Boolean bool, InterfaceC65784Pro interfaceC65784Pro);

    void ea(C51A c51a);

    void fa(long j, AnonymousClass519 anonymousClass519);

    boolean isPlaying();

    boolean isPrepared();

    void p0(boolean z);

    void pause();

    void play();

    List<String> q0();

    long s5();

    void seek(long j);

    void setActive(boolean z);

    int[] t5();
}
