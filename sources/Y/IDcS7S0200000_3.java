package Y;

import X.AbstractC028509h;
import X.C192347gk;
import X.C192697hJ;
import X.InterfaceC57784Mm4;
import X.SIU;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiDetailVideoListAssem;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.story.archive.StoryArchListAssem;
import com.ss.android.ugc.aweme.topic.book.detail.videos.BookVideoListAssem;
import com.ss.android.ugc.aweme.topic.movie.detail.videos.MovieVideoListAssem;
import com.ss.android.ugc.aweme.upvote.detail.repostlist.RepostListAssem;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryContentAssem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class IDcS7S0200000_3 extends AbstractC028509h {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            case 2:
                return LJFF$2(this, i);
            case 3:
                return LJFF$3(this, i);
            case 4:
                return LJFF$4(this, i);
            case 5:
                return LJFF$5(this, i);
            case 6:
                return LJFF$6(this, i);
            case 7:
                return LJFF$7(this, i);
            case 8:
                return LJFF$8(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(IDcS7S0200000_3 iDcS7S0200000_3, int i) {
        GridLayoutManager gridLayoutManager;
        if (((C192347gk) iDcS7S0200000_3.l0).getItemViewType(i) != 0 || (gridLayoutManager = ((CollectionContentAssem) iDcS7S0200000_3.l1).LJLJJI) == null) {
            return 1;
        }
        return gridLayoutManager.LLIIIL;
    }

    public static final int LJFF$1(IDcS7S0200000_3 iDcS7S0200000_3, int i) {
        if (((C192697hJ) iDcS7S0200000_3.l0).getItemViewType(i) == 0) {
            return ((CollectionListMainUIAssem) iDcS7S0200000_3.l1).x3();
        }
        return 1;
    }

    public static final int LJFF$2(IDcS7S0200000_3 iDcS7S0200000_3, int i) {
        List<InterfaceC57784Mm4> LJII = ((AddMultiVideoFragment.CandidateGridLayoutManager) iDcS7S0200000_3.l0).LLIIZ.getState().LJII();
        int headerCount = ((AddMultiVideoFragment.CandidateGridLayoutManager) iDcS7S0200000_3.l0).LLIIZ.getHeaderCount();
        if (i < headerCount) {
            return ((AddMultiVideoFragment.CandidateGridLayoutManager) iDcS7S0200000_3.l0).LLIIIL;
        }
        if (i >= ((ArrayList) LJII).size() + headerCount) {
            return ((AddMultiVideoFragment.CandidateGridLayoutManager) iDcS7S0200000_3.l0).LLIIIL;
        }
        int i2 = i - headerCount;
        if (ListProtector.get(LJII, i2) instanceof SIU) {
            return ((AddMultiVideoFragment.CandidateGridLayoutManager) iDcS7S0200000_3.l0).LLIIIL;
        }
        AbstractC028509h abstractC028509h = (AbstractC028509h) iDcS7S0200000_3.l1;
        if (abstractC028509h != null) {
            return abstractC028509h.LJFF(i2);
        }
        return 1;
    }

    public static final int LJFF$3(IDcS7S0200000_3 iDcS7S0200000_3, int i) {
        List<InterfaceC57784Mm4> LJII = ((BookVideoListAssem) iDcS7S0200000_3.l0).M3().getState().LJII();
        int headerCount = ((BookVideoListAssem) iDcS7S0200000_3.l0).M3().getHeaderCount();
        if (i < headerCount || i >= ((ArrayList) LJII).size() + headerCount) {
            return ((WrapGridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
        }
        return 1;
    }

    public static final int LJFF$4(IDcS7S0200000_3 iDcS7S0200000_3, int i) {
        List<InterfaceC57784Mm4> LJII = ((MovieVideoListAssem) iDcS7S0200000_3.l0).M3().getState().LJII();
        int headerCount = ((MovieVideoListAssem) iDcS7S0200000_3.l0).M3().getHeaderCount();
        if (i < headerCount || i >= ((ArrayList) LJII).size() + headerCount) {
            return ((WrapGridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
        }
        return 1;
    }

    public static final int LJFF$5(IDcS7S0200000_3 iDcS7S0200000_3, int i) {
        if (NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            List<InterfaceC57784Mm4> LJII = ((PoiDetailVideoListAssem) iDcS7S0200000_3.l0).N3().getState().LJII();
            int headerCount = ((PoiDetailVideoListAssem) iDcS7S0200000_3.l0).N3().getHeaderCount();
            if (i < headerCount) {
                return ((GridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
            }
            if (i < ((ArrayList) LJII).size() + headerCount) {
                return 1;
            }
            return ((GridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
        }
        if (i != 0) {
            return 1;
        }
        return ((GridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
    }

    public static final int LJFF$6(IDcS7S0200000_3 iDcS7S0200000_3, int i) {
        List<InterfaceC57784Mm4> LJII = ((WatchHistoryContentAssem) iDcS7S0200000_3.l0).v3().getState().LJII();
        int headerCount = ((WatchHistoryContentAssem) iDcS7S0200000_3.l0).v3().getHeaderCount();
        if (i < headerCount) {
            return ((WrapGridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
        }
        if (i >= ((ArrayList) LJII).size() + headerCount) {
            return ((WrapGridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
        }
        if (ListProtector.get(LJII, i - headerCount) instanceof SIU) {
            return ((WrapGridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
        }
        return 1;
    }

    public static final int LJFF$7(IDcS7S0200000_3 iDcS7S0200000_3, int i) {
        int headerCount = ((StoryArchListAssem) iDcS7S0200000_3.l0).v3().getHeaderCount();
        List<InterfaceC57784Mm4> LJII = ((StoryArchListAssem) iDcS7S0200000_3.l0).v3().getState().LJII();
        if (i < headerCount) {
            return ((GridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
        }
        if (i >= ((ArrayList) LJII).size() + headerCount) {
            return ((GridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
        }
        return 1;
    }

    public static final int LJFF$8(IDcS7S0200000_3 iDcS7S0200000_3, int i) {
        int headerCount = ((RepostListAssem) iDcS7S0200000_3.l0).v3().getHeaderCount();
        List<InterfaceC57784Mm4> LJII = ((RepostListAssem) iDcS7S0200000_3.l0).v3().getState().LJII();
        if (i < headerCount) {
            return ((GridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
        }
        if (i >= ((ArrayList) LJII).size() + headerCount) {
            return ((GridLayoutManager) iDcS7S0200000_3.l1).LLIIIL;
        }
        return 1;
    }

    public IDcS7S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
