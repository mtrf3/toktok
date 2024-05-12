package X;

import Y.ACListenerS22S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C156796Dj extends C1545664u {
    @Override // X.C1545664u
    public final void LIZ() {
        boolean z;
        C78934UyQ.LJLIL.getWikiService().getClass();
        List LJFF = AnchorListManager.LJFF();
        ArrayList arrayList = (ArrayList) LJFF;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((AnchorPublishStruct) ListProtector.get(LJFF, i)).type == EnumC42934Gt8.WIKIPEDIA.getTYPE()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!C1DG.LJIIIIZZ() && z && !C41658GWo.LIZLLL().LJ.booleanValue() && !C156806Dk.LIZ) {
            this.LLIIII.setVisibility(0);
        } else {
            this.LLIIII.setVisibility(8);
        }
        C16880lQ.LJIIZILJ(this.LLIIII, new ACListenerS22S0100000_2(this, 50));
    }

    public C156796Dj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
