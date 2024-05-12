package Y;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C184817Nd;
import X.C2062187l;
import X.C2U8;
import X.C84193Sd;
import X.C8JD;
import X.InterfaceC65784Pro;
import X.JJ4;
import com.ss.android.ugc.aweme.feed.assem.contentclassificationmask.ContentClassificationMaskAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendSearchCell;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class IDgS347S0100000_3 implements JJ4 {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$0(IDgS347S0100000_3 iDgS347S0100000_3) {
    }

    public static final /* synthetic */ void LIZIZ$1(IDgS347S0100000_3 iDgS347S0100000_3) {
    }

    public static final /* synthetic */ void LIZIZ$2(IDgS347S0100000_3 iDgS347S0100000_3) {
    }

    public static final /* synthetic */ void LIZIZ$3(IDgS347S0100000_3 iDgS347S0100000_3) {
    }

    public static final /* synthetic */ void LIZIZ$4(IDgS347S0100000_3 iDgS347S0100000_3) {
    }

    public static final /* synthetic */ void LIZIZ$5(IDgS347S0100000_3 iDgS347S0100000_3) {
    }

    public static final /* synthetic */ void LIZIZ$6(IDgS347S0100000_3 iDgS347S0100000_3) {
    }

    public static final /* synthetic */ void LIZIZ$7(IDgS347S0100000_3 iDgS347S0100000_3) {
    }

    public static final /* synthetic */ void LIZIZ$8(IDgS347S0100000_3 iDgS347S0100000_3) {
    }

    @Override // X.JJ4
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            case 2:
                LIZ$2(this);
                return;
            case 3:
                LIZ$3(this);
                return;
            case 4:
                LIZ$4(this);
                return;
            case 5:
                LIZ$5(this);
                return;
            case 6:
                LIZ$6(this);
                return;
            case 7:
                LIZ$7(this);
                return;
            case 8:
                LIZ$8(this);
                return;
            default:
                return;
        }
    }

    @Override // X.JJ4
    public final /* synthetic */ void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                return;
            case 1:
                LIZIZ$1(this);
                return;
            case 2:
                LIZIZ$2(this);
                return;
            case 3:
                LIZIZ$3(this);
                return;
            case 4:
                LIZIZ$4(this);
                return;
            case 5:
                LIZIZ$5(this);
                return;
            case 6:
                LIZIZ$6(this);
                return;
            case 7:
                LIZIZ$7(this);
                return;
            case 8:
                LIZIZ$8(this);
                return;
            default:
                return;
        }
    }

    public static final void LIZ$0(IDgS347S0100000_3 iDgS347S0100000_3) {
        ((VideoFavoriteVM) iDgS347S0100000_3.l0).nv0();
    }

    public static final void LIZ$1(IDgS347S0100000_3 iDgS347S0100000_3) {
        ((FavoriteAbility) iDgS347S0100000_3.l0).Tk0();
    }

    public static final void LIZ$2(IDgS347S0100000_3 iDgS347S0100000_3) {
        C84193Sd.LIZ((ActivityC45651qj) iDgS347S0100000_3.l0).E50("page_feed", false);
        TabChangeManager.jv0(C116694i1.LIZ((ActivityC45651qj) iDgS347S0100000_3.l0), "HOME", false, 30);
    }

    public static final void LIZ$3(IDgS347S0100000_3 iDgS347S0100000_3) {
        ((InterfaceC65784Pro) iDgS347S0100000_3.l0).invoke();
    }

    public static final void LIZ$4(IDgS347S0100000_3 iDgS347S0100000_3) {
        ((C2062187l) iDgS347S0100000_3.l0).LJFF();
    }

    public static final void LIZ$5(IDgS347S0100000_3 iDgS347S0100000_3) {
        TopicRawInfo topicRawInfo;
        TopicRecommendListVM topicRecommendListVM;
        C184817Nd item = ((BookRecommendSearchCell) iDgS347S0100000_3.l0).getItem();
        if (item != null && (topicRawInfo = item.LJLIL) != null && (topicRecommendListVM = ((BookRecommendSearchCell) iDgS347S0100000_3.l0).LJLILLLLZI) != null) {
            topicRecommendListVM.iv0(topicRawInfo);
        }
    }

    public static final void LIZ$6(IDgS347S0100000_3 iDgS347S0100000_3) {
        C84193Sd.LIZ((ActivityC45651qj) iDgS347S0100000_3.l0).E50("page_feed", false);
        TabChangeManager.jv0(C116694i1.LIZ((ActivityC45651qj) iDgS347S0100000_3.l0), "HOME", false, 30);
    }

    public static final void LIZ$7(IDgS347S0100000_3 iDgS347S0100000_3) {
        ((VideoFavoriteVM) iDgS347S0100000_3.l0).nv0();
    }

    public static final void LIZ$8(IDgS347S0100000_3 iDgS347S0100000_3) {
        ((ContentClassificationMaskAssem) iDgS347S0100000_3.l0)._$_findCachedViewById(R.id.g_0).setVisibility(8);
        if (((ContentClassificationMaskAssem) iDgS347S0100000_3.l0).p4().kv0()) {
            C2U8.LIZ(new C8JD(false));
        } else {
            C2U8.LIZ(new IEvent() { // from class: X.8JC
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }
            });
        }
    }

    public IDgS347S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
