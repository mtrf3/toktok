package com.bytedance.android.livesdk.qa;

import X.AbstractC19190p9;
import X.BTJ;
import X.BVN;
import X.C19170p7;
import X.C19180p8;
import X.C28881BVd;
import X.C73893SzJ;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class QuestionViewModel extends PagingViewModel<QuestionEx> {
    public final C73893SzJ<Object> LJLZ = new C73893SzJ<>();
    public LiveData<AbstractC19190p9<QuestionEx>> LJZ;
    public C28881BVd LJZI;
    public BVN LJZL;
    public final C19180p8 LL;

    @Override // com.bytedance.android.live.core.paging.viewmodel.PagingViewModel
    public final void retry() {
        this.LJLZ.onNext(BTJ.LIZJ);
    }

    public QuestionViewModel() {
        C19170p7 c19170p7 = new C19170p7();
        c19170p7.LIZIZ = 2;
        c19170p7.LIZ = 50;
        this.LL = c19170p7.LIZ();
    }

    public final void iv0(Room room, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LJZI = new C28881BVd(this.LJLJL, this.LJLJJL, this.LJLJJLL, this.LJLJJI, this.LJLZ, z3, z4);
        this.LJZL = new BVN(this);
        C28881BVd c28881BVd = this.LJZI;
        c28881BVd.getClass();
        o.LJIIIZ(room, "room");
        c28881BVd.LJIIJ = room;
        C28881BVd c28881BVd2 = this.LJZI;
        c28881BVd2.LJIIJJI = z;
        c28881BVd2.LJIIL = z2;
    }
}
