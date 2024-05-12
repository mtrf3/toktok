package X;

import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import java.util.LinkedHashMap;

/* renamed from: X.PdS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C64894PdS implements InterfaceC65784Pro {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        boolean isLocked;
        C64899PdX c64899PdX;
        switch (this.LJLIL) {
            case 0:
                isLocked = ((AbsAudienceInteractionFragment) this.LJLILLLLZI).isLocked();
                return Boolean.valueOf(isLocked);
            case 1:
            default:
                return ((ChooseCoverActivity) this.LJLILLLLZI).getEditor();
            case 2:
                this.LJLILLLLZI.getClass();
                if (C3UC.LIZ() != null && C3UC.LIZ().size() > 4) {
                    C64892PdQ.LIZIZ = 2500L;
                    if (C35810E3q.LJIIIIZZ()) {
                        c64899PdX = new C64899PdX();
                    } else {
                        c64899PdX = null;
                    }
                    InterfaceC64897PdV interfaceC64897PdV = (InterfaceC64897PdV) ((LinkedHashMap) C64895PdT.LIZ).get("enter_shoot");
                    if (interfaceC64897PdV != null) {
                        C64895PdT.LIZIZ = interfaceC64897PdV;
                    }
                    C64895PdT.LIZJ = c64899PdX;
                    E3F.LIZ(null, true, 5000, new InterfaceC65784Pro() { // from class: X.PdR
                        @Override // X.InterfaceC65784Pro
                        public final Object invoke() {
                            C64895PdT.LIZIZ = null;
                            C64895PdT.LIZJ = null;
                            return null;
                        }
                    });
                }
                return null;
            case 3:
                ((C6FS) this.LJLILLLLZI).A50();
                return null;
        }
    }

    public /* synthetic */ C64894PdS(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
