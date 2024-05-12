package X;

import com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData;
import kotlin.jvm.internal.o;

/* renamed from: X.5Hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C132495Hx extends TBS implements InterfaceC88471Ynr<EditorProSaveData, Boolean, C76800UCe> {
    public C132495Hx(C5LF c5lf) {
        super(2, c5lf, C5LF.class, "setSaveResult", "setSaveResult(Lcom/ss/android/ugc/gamora/editorpro/model/EditorProSaveData;Z)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EditorProSaveData editorProSaveData, Boolean bool) {
        EditorProSaveData p0 = editorProSaveData;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(p0, "p0");
        ((C5LF) this.receiver).LLJJIII(p0, booleanValue);
        return C76800UCe.LIZ;
    }
}
