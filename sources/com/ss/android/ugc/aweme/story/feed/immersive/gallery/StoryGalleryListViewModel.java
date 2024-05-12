package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C189487c8;
import X.C189717cV;
import X.C189737cX;
import X.C201647vk;
import X.C221108m2;
import X.C32I;
import X.C43921HLp;
import X.C43I;
import X.C48841JEv;
import X.C54819LfL;
import X.C54838Lfe;
import X.C62822Ol8;
import X.EnumC221928nM;
import X.HG3;
import X.InterfaceC70422pa;
import X.ORZ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGalleryListViewModel extends AssemViewModel<C189487c8> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1001));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C201647vk.LJLIL);
    public StoryFeedViewModel LJLJI;
    public UserStory LJLJJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C189487c8 defaultState() {
        return new C189487c8(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C48841JEv.LIZJ((InterfaceC70422pa) this.LJLIL.getValue(), null);
    }

    public static List hv0(List list) {
        EnumC221928nM enumC221928nM;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            if (C54838Lfe.LJIILL(aweme)) {
                C43921HLp c43921HLp = C43921HLp.LIZ;
                String scheduleId = aweme.getScheduleId();
                o.LJIIIIZZ(scheduleId, "aweme.scheduleId");
                c43921HLp.getClass();
                Iterator it2 = ((ArrayList) C43921HLp.LJIIIIZZ).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C189737cX c189737cX = (C189737cX) it2.next();
                        if (o.LJ(scheduleId, c189737cX.LJLIL.getCreationId())) {
                            enumC221928nM = c189737cX.LJLILLLLZI.LIZIZ;
                            break;
                        }
                    } else {
                        enumC221928nM = EnumC221928nM.DEFAULT;
                        break;
                    }
                }
            } else {
                enumC221928nM = null;
            }
            arrayList.add(new C189717cV(aweme, enumC221928nM));
        }
        return arrayList;
    }

    public final void gv0(C189487c8 c189487c8) {
        StoryFeedViewModel storyFeedViewModel = this.LJLJI;
        if (storyFeedViewModel != null) {
            String uid = HG3.LJIILL().getCurUserId();
            o.LJIIIIZZ(uid, "uid");
            storyFeedViewModel.Hv0(c189487c8.LJLILLLLZI, uid);
            C54819LfL c54819LfL = storyFeedViewModel.LJLLL;
            String curUserId = HG3.LJIILL().getCurUserId();
            UserStory userStory = this.LJLJJI;
            Integer valueOf = Integer.valueOf(c189487c8.LJLILLLLZI);
            Aweme aweme = c189487c8.LJLJI;
            c54819LfL.getClass();
            C54819LfL.LIZIZ(curUserId, userStory, valueOf, aweme, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r2 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C189487c8 jv0(com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel r3, X.C189487c8 r4) {
        /*
            com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel r2 = r3.LJLJI
            if (r2 == 0) goto L19
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "uid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.List r2 = r2.qv0(r1)
            if (r2 != 0) goto L1b
        L19:
            X.OQg r2 = X.C61878OQg.INSTANCE
        L1b:
            int r1 = r4.LJLILLLLZI
            X.43I<java.lang.Integer> r0 = r4.LJLJJI
            X.7c8 r0 = r3.iv0(r4, r2, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel.jv0(com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel, X.7c8):X.7c8");
    }

    public final C189487c8 iv0(C189487c8 c189487c8, List<? extends Aweme> list, int i, C43I<Integer> c43i) {
        C43I<Boolean> c43i2;
        List hv0 = hv0(list);
        ArrayList arrayList = (ArrayList) hv0;
        int max = Math.max(0, Math.min(i, arrayList.size() - 1));
        Aweme aweme = (Aweme) ORZ.LJLLLLLL(max, list);
        if (arrayList.isEmpty()) {
            c43i2 = new C43I<>(Boolean.FALSE);
        } else {
            c43i2 = c189487c8.LJLJJL;
        }
        c189487c8.getClass();
        C189487c8 c189487c82 = new C189487c8(hv0, max, aweme, c43i, c43i2);
        gv0(c189487c82);
        return c189487c82;
    }
}
