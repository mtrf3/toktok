package X;

import android.content.Context;
import com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS117S0300000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UOv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77129UOv extends AbstractC61103NyV {
    public final /* synthetic */ URJ LIZIZ;
    public final /* synthetic */ RelationAuthDialogControl LIZJ;
    public final /* synthetic */ XJL<Boolean> LIZLLL;

    @Override // X.AbstractC61103NyV
    public final void LIZIZ(C61101NyT c61101NyT, C164906da... permissionsStatus) {
        o.LJIIIZ(permissionsStatus, "permissionsStatus");
        int i = C76872UEy.LIZ[permissionsStatus[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                RelationAuthDialogControl relationAuthDialogControl = this.LIZJ;
                Context context = relationAuthDialogControl.LJLIL;
                XJL<Boolean> xjl = this.LIZLLL;
                C26227ARb LIZIZ = C77413UZt.LIZIZ(context);
                LIZIZ.LIZ(R.string.p4t);
                UC0.LIZJ(LIZIZ, C77132UOy.LJLIL);
                LIZIZ.LJII = false;
                LIZIZ.LIZJ(new AqS117S0300000_13(relationAuthDialogControl, (RelationAuthDialogControl) context, (Context) xjl, (XJL<? super Boolean>) 22));
                LIZIZ.LIZLLL(new AqS179S0100000_13(relationAuthDialogControl, 668));
                LIZIZ.LJI().LIZLLL();
                if (c61101NyT == null) {
                    return;
                }
                c61101NyT.LIZ();
                return;
            }
            URJ urj = this.LIZIZ;
            if (URH.LIZ.contains(urj)) {
                ((C72743Sgl) this.LIZJ.LJLJLJ.getValue()).LIZ();
                if (c61101NyT == null) {
                    return;
                }
                c61101NyT.LIZIZ();
                return;
            }
            if (URH.LIZIZ.contains(urj)) {
                RelationAuthDialogControl relationAuthDialogControl2 = this.LIZJ;
                XKX.LIZLLL(relationAuthDialogControl2.LJLILLLLZI, null, null, new C76941UHp(relationAuthDialogControl2, c61101NyT, null), 3);
                return;
            } else {
                if (c61101NyT == null) {
                    return;
                }
                c61101NyT.LIZIZ();
                return;
            }
        }
        if (c61101NyT == null) {
            return;
        }
        c61101NyT.LIZ();
    }

    public C77129UOv(URJ urj, RelationAuthDialogControl relationAuthDialogControl, XKS xks) {
        this.LIZIZ = urj;
        this.LIZJ = relationAuthDialogControl;
        this.LIZLLL = xks;
    }
}
