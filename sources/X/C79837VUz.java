package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.lynx.tasm.behavior.ui.list.UIList;

/* renamed from: X.VUz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79837VUz extends AbstractC028509h {
    public final /* synthetic */ GridLayoutManager LJ;
    public final /* synthetic */ UIList LJFF;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        if (!this.LJFF.LJLJI.LLF(i) || this.LJFF.LJLJJI <= 1) {
            return 1;
        }
        return this.LJ.LLIIIL;
    }

    public C79837VUz(UIList uIList, GridLayoutManager gridLayoutManager) {
        this.LJFF = uIList;
        this.LJ = gridLayoutManager;
    }
}
