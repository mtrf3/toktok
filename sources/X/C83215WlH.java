package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WlH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83215WlH implements InterfaceC80707Vlv {
    public final /* synthetic */ C83207Wl9 LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ ArrayList LIZJ;

    @Override // X.InterfaceC80707Vlv
    public final void LIZ(C164456cr c164456cr) {
    }

    @Override // X.InterfaceC80707Vlv
    public final void LIZIZ(C164456cr c164456cr) {
    }

    @Override // X.InterfaceC80707Vlv
    public final void LIZJ(C164456cr tab, boolean z) {
        ComposerBeauty composerBeauty;
        Object obj;
        o.LJIIIZ(tab, "tab");
        Iterator it = this.LIZIZ.iterator();
        while (true) {
            composerBeauty = null;
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(ListProtector.get(this.LIZJ, tab.LIZJ), ((BeautyCategory) obj).getCategoryResponse().getId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BeautyCategory beautyCategory = (BeautyCategory) obj;
        if (beautyCategory != null) {
            this.LIZ.getSource().d8(beautyCategory);
            C83222WlO.LJLZ(this.LIZ.LLFFF, beautyCategory.getBeautyList());
            Iterator<ComposerBeauty> it2 = this.LIZ.LLFFF.LJLILLLLZI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ComposerBeauty next = it2.next();
                if (next.getSelected()) {
                    composerBeauty = next;
                    break;
                }
            }
            C83207Wl9.LIZJ(this.LIZ, composerBeauty, false, false, 30);
        }
    }

    public C83215WlH(C83207Wl9 c83207Wl9, List list, ArrayList arrayList) {
        this.LIZ = c83207Wl9;
        this.LIZIZ = list;
        this.LIZJ = arrayList;
    }
}
