package X;

import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;

/* renamed from: X.HIl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43839HIl<T> implements InterfaceC86003Zc {
    public static final C43839HIl<T> LJLIL = new C43839HIl<>();

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<AbstractC65743Pr9<MultiEditVideoStatusRecordData>> interfaceC73573Su9) {
        interfaceC73573Su9.onNext(AbstractC65743Pr9.absent());
        interfaceC73573Su9.onComplete();
    }
}
