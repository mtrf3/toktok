package Y;

import X.C229198z5;
import X.C54789Ler;
import X.C54830LfW;
import X.C56306M7y;
import X.HG3;
import X.InterfaceC56305M7x;
import X.InterfaceC64592gB;
import X.RBX;
import X.TBT;
import X.TBV;
import X.TBW;
import X.X1D;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS64S1200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AfS23S1100000_9 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS23S1100000_9 afS23S1100000_9, Object obj) {
        ((StoryFeedViewModel) afS23S1100000_9.l1).sv0(afS23S1100000_9.s0);
        ((StoryFeedViewModel) afS23S1100000_9.l1).jv0(null, "LOAD_USER_STORY_FAIL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS23S1100000_9 afS23S1100000_9, Object obj) {
        UserStory userStory;
        C54789Ler c54789Ler = (C54789Ler) obj;
        List<TBW<SUBSCRIBE_DATA, ?>> list = c54789Ler.LIZ;
        Aweme m114clone = ((Aweme) c54789Ler.LIZJ).m114clone();
        o.LJIIIIZZ(m114clone, "aweme.clone()");
        Aweme aweme = (Aweme) ((LinkedHashMap) ((StoryFeedViewModel) afS23S1100000_9.l1).LJLLILLLL).get(afS23S1100000_9.s0);
        if (aweme != null && (userStory = m114clone.getUserStory()) != null && !o.LJ(aweme.getUserStory(), userStory)) {
            aweme.setUserStory(userStory);
            TBW[] tbwArr = {new TBT() { // from class: X.LfX
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((UserStory) obj2).getStories();
                }
            }, new TBV() { // from class: X.LfP
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj2) {
                    return Long.valueOf(((UserStory) obj2).getCurrentPosition());
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj2, Object obj3) {
                    ((UserStory) obj2).setCurrentPosition(((Number) obj3).longValue());
                }
            }, new TBV() { // from class: X.LfQ
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj2) {
                    return Long.valueOf(((UserStory) obj2).getTotalCount());
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj2, Object obj3) {
                    ((UserStory) obj2).setTotalCount(((Number) obj3).longValue());
                }
            }, new TBV() { // from class: X.LfR
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj2) {
                    return Long.valueOf(((UserStory) obj2).getOriginTotalCount());
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj2, Object obj3) {
                    ((UserStory) obj2).setOriginTotalCount(((Number) obj3).longValue());
                }
            }, new TBV() { // from class: X.LfU
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((UserStory) obj2).getHasMoreAfter());
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj2, Object obj3) {
                    ((UserStory) obj2).setHasMoreAfter(((Boolean) obj3).booleanValue());
                }
            }, new TBV() { // from class: X.LfV
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((UserStory) obj2).getHasMoreBefore());
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj2, Object obj3) {
                    ((UserStory) obj2).setHasMoreBefore(((Boolean) obj3).booleanValue());
                }
            }, new TBV() { // from class: X.LfS
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj2) {
                    return Long.valueOf(((UserStory) obj2).getMinCursor());
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj2, Object obj3) {
                    ((UserStory) obj2).setMinCursor(((Number) obj3).longValue());
                }
            }, new TBV() { // from class: X.LfT
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj2) {
                    return Long.valueOf(((UserStory) obj2).getMaxCursor());
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj2, Object obj3) {
                    ((UserStory) obj2).setMaxCursor(((Number) obj3).longValue());
                }
            }};
            AqS64S1200000_9 aqS64S1200000_9 = new AqS64S1200000_9((StoryFeedViewModel) afS23S1100000_9.l1, afS23S1100000_9.s0, userStory, 1);
            o.LJIIIZ(list, "<this>");
            Iterator it = list.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i = 0;
                while (!o.LJ(next, tbwArr[i])) {
                    i++;
                    if (i < 8) {
                    }
                }
                aqS64S1200000_9.invoke();
                break loop0;
            }
            C54830LfW that = new TBV() { // from class: X.LfW
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj2) {
                    return ((UserStory) obj2).getCurrentInfo();
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj2, Object obj3) {
                    ((UserStory) obj2).setCurrentInfo((UserStoryCurrentInfo) obj3);
                }
            };
            AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9((StoryFeedViewModel) afS23S1100000_9.l1, userStory, 54);
            o.LJIIIZ(that, "that");
            if (list.contains(that)) {
                aqS156S0200000_9.invoke();
            }
        }
    }

    public static final void accept$2(AfS23S1100000_9 afS23S1100000_9, Object obj) {
        List<MixStruct> mixList;
        int i;
        List<MixStruct> mixList2;
        MixListResponse mixListResponse = (MixListResponse) obj;
        if (mixListResponse != null) {
            String str = afS23S1100000_9.s0;
            InterfaceC56305M7x interfaceC56305M7x = (InterfaceC56305M7x) afS23S1100000_9.l1;
            C229198z5.LIZ = mixListResponse;
            HG3.LJIIL();
            int i2 = 0;
            if (o.LJ(HG3.LJLJL.LJFF().getCurUserId(), str)) {
                MixListResponse mixListResponse2 = C229198z5.LIZ;
                if (mixListResponse2 != null && (mixList2 = mixListResponse2.getMixList()) != null) {
                    i = mixList2.size();
                } else {
                    i = 0;
                }
                Keva repo = Keva.getRepo("keva_mixlist_repo_name");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("keva_mixlist_num_key");
                LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
                repo.storeInt(X1D.LIZIZ(LIZ), i);
            }
            MixListResponse mixListResponse3 = C229198z5.LIZ;
            if (mixListResponse3 != null && (mixList = mixListResponse3.getMixList()) != null) {
                i2 = mixList.size();
            }
            interfaceC56305M7x.LIZ(i2, true);
        }
    }

    public static final void accept$3(AfS23S1100000_9 afS23S1100000_9, Object obj) {
        int i;
        List<MixStruct> mixList;
        MixListResponse mixListResponse = (MixListResponse) obj;
        if (mixListResponse != null) {
            String str = afS23S1100000_9.s0;
            C56306M7y c56306M7y = (C56306M7y) afS23S1100000_9.l1;
            C229198z5.LIZ = mixListResponse;
            HG3.LJIIL();
            if (o.LJ(HG3.LJLJL.LJFF().getCurUserId(), str)) {
                MixListResponse mixListResponse2 = C229198z5.LIZ;
                if (mixListResponse2 != null && (mixList = mixListResponse2.getMixList()) != null) {
                    i = mixList.size();
                } else {
                    i = 0;
                }
                Keva repo = Keva.getRepo("keva_mixlist_repo_name");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("keva_mixlist_num_key");
                LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
                repo.storeInt(X1D.LIZIZ(LIZ), i);
            }
            if (mixListResponse.status_code == 0) {
                c56306M7y.LIZ(true, C229198z5.LIZ);
            } else {
                c56306M7y.LIZ(false, C229198z5.LIZ);
            }
        }
    }

    public AfS23S1100000_9(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
