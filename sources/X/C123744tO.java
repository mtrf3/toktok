package X;

import Y.AgS120S0100000_2;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4tO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123744tO extends AbstractC65781Prl implements InterfaceC88472Yns<C122034qd, C76800UCe> {
    public final /* synthetic */ AgS120S0100000_2 LJLIL;
    public final /* synthetic */ double LJLILLLLZI;
    public final /* synthetic */ double LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C123744tO(AgS120S0100000_2 agS120S0100000_2, double d, double d2) {
        super(1);
        this.LJLIL = agS120S0100000_2;
        this.LJLILLLLZI = d;
        this.LJLJI = d2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C122034qd c122034qd) {
        Object obj;
        String uuid;
        C122034qd editorPro = c122034qd;
        o.LJIIIZ(editorPro, "editorPro");
        Iterator LIZ = C0FS.LIZ(editorPro.LJIIJ, "editorPro.editor.model", "editorPro.editor.model.tracks");
        while (true) {
            if (LIZ.hasNext()) {
                obj = LIZ.next();
                NLETrack it = (NLETrack) obj;
                String name = EnumC122254qz.BGM.name();
                o.LJIIIIZZ(it, "it");
                if (o.LJ(name, C77357UXp.LJIILIIL(it))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLENode nLENode = (NLENode) obj;
        if (nLENode != null && (uuid = nLENode.getUUID()) != null) {
            C123764tQ c123764tQ = ((C5MG) this.LJLIL.l0).LJIIL;
            o.LJI(c123764tQ);
            C5MG.LIZIZ(uuid, c123764tQ.LJLJLJ, this.LJLILLLLZI, this.LJLJI, editorPro);
        }
        return C76800UCe.LIZ;
    }
}
