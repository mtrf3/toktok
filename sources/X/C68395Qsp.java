package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.LinkedHashMap;

/* renamed from: X.Qsp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68395Qsp implements InterfaceC68405Qsz {
    public Object LJLIL;
    public final Object LJLILLLLZI;

    public final long LIZIZ() {
        AwemeDraft awemeDraft = (AwemeDraft) this.LJLIL;
        if (awemeDraft == null) {
            return 0L;
        }
        ((C5H3) this.LJLILLLLZI).getValue().getClass();
        return new C43097Gvl(awemeDraft).LIZ() + 0 + 0 + 0 + 0;
    }

    public C68395Qsp(int i) {
        if (i != 3) {
            this.LJLILLLLZI = new LinkedHashMap();
            this.LJLIL = new LinkedHashMap();
        } else {
            this.LJLILLLLZI = new C68332mD(new C68424QtI());
        }
    }

    @Override // X.InterfaceC68405Qsz
    public final C68377QsX LIZ(InterfaceC68379QsZ interfaceC68379QsZ) {
        C68377QsX LIZ = ((C68377QsX) this.LJLIL).LIZ();
        LIZ.LJ((String) this.LJLILLLLZI, interfaceC68379QsZ);
        return LIZ;
    }

    public /* synthetic */ C68395Qsp(Object obj, Object obj2) {
        this.LJLIL = obj;
        this.LJLILLLLZI = obj2;
    }
}
