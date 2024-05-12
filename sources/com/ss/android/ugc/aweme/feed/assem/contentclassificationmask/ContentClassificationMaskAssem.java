package com.ss.android.ugc.aweme.feed.assem.contentclassificationmask;

import X.C213688a4;
import X.C214348b8;
import X.C240999d1;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8J0;
import X.C8J1;
import X.C8J2;
import X.C8J3;
import X.C8J7;
import X.C8J8;
import X.C8J9;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ContentClassificationMaskAssem extends FeedBaseAssem<ContentClassificationMaskAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final InterfaceC115514g7 LLFZ;
    public final Map<Integer, View> LLI = new LinkedHashMap();
    public final C5H3 LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C8J8.INSTANCE);
    public final C5H3 LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C8J9.INSTANCE);

    static {
        TBT tbt = new TBT(ContentClassificationMaskAssem.class, "contentClassificationMaskVM", "getContentClassificationMaskVM()Lcom/ss/android/ugc/aweme/feed/assem/contentclassificationmask/ContentClassificationMaskVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJIIJ(this, p4(), new TBT() { // from class: X.8J6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C209218Iz) obj).LJLIL;
            }
        }, new TBT() { // from class: X.8JA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C209218Iz) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C8J0.LJLIL, 8);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aad;
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public ContentClassificationMaskAssem() {
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ContentClassificationMaskVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c240999d1, new AqS153S0100000_3(LIZ, 306), null, C8J7.INSTANCE, null, null);
    }

    public final ContentClassificationMaskVM p4() {
        return (ContentClassificationMaskVM) this.LLFZ.LIZ(this, LLIFFJFJJ[0]);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        ContentClassificationMaskVM p4 = p4();
        p4.getClass();
        p4.setState(new AqS169S0100000_3(p4, 932));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        Y3().setVisibility(8);
        C8YN.LJII(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.8J4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, null, C8J2.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.8JB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLZ;
            }
        }, null, C8J3.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.8J5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C8J1.LJLIL, 4);
    }
}
