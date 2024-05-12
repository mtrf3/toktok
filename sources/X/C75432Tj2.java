package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tj2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75432Tj2 extends AbstractC31414CUo<LinkListUser, C75434Tj4> {
    @Override // X.AbstractC31414CUo
    public final C75434Tj4 LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new C75434Tj4(parent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L29;
     */
    @Override // X.AbstractC31414CUo
    /* renamed from: LJI, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C75434Tj4 r8, com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r9) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75432Tj2.LIZ(X.Tj4, com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser):void");
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(C75434Tj4 c75434Tj4, LinkListUser linkListUser, List payloads) {
        boolean z;
        C75433Tj3 c75433Tj3;
        C75434Tj4 holder = c75434Tj4;
        LinkListUser item = linkListUser;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            LIZ(holder, item);
            return;
        }
        View view = holder.itemView;
        C31413CUn c31413CUn = this.LIZ;
        if ((c31413CUn instanceof C75433Tj3) && (c75433Tj3 = (C75433Tj3) c31413CUn) != null && holder.getLayoutPosition() == c75433Tj3.LJLJLLL) {
            z = true;
        } else {
            z = false;
        }
        view.setSelected(z);
    }
}
