package Y;

import X.AbstractC028509h;
import X.AbstractC029409q;
import X.AbstractC57781Mm1;
import X.C3XO;
import X.C56492MFc;
import X.C57117MbJ;
import X.C57826Mmk;
import X.C57834Mms;
import X.C57928MoO;
import X.C58093Mr3;
import X.C58094Mr4;
import X.InterfaceC57760Mlg;
import X.SYL;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecFriendsFragment;
import com.ss.android.ugc.aweme.relation.recommend.NewVersionRecFriendsListAssem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDcS38S0100000_9 extends AbstractC028509h {
    public final int $t;
    public Object l0;

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
            default:
                return super.LJFF(i);
        }
    }

    public IDcS38S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(IDcS38S0100000_9 iDcS38S0100000_9, int i) {
        if (((MusicDetailAwemeListFragment) iDcS38S0100000_9.l0).LLD.getItemViewType(i) == 110003) {
            return 2;
        }
        C56492MFc c56492MFc = ((MusicDetailAwemeListFragment) iDcS38S0100000_9.l0).LLD;
        if (c56492MFc.mShowFooter && i == c56492MFc.getBasicItemCount()) {
            return 3;
        }
        return 1;
    }

    public static final int LJFF$1(IDcS38S0100000_9 iDcS38S0100000_9, int i) {
        if (i >= 0) {
            SYL syl = ((RecFriendsFragment) iDcS38S0100000_9.l0).LJLJJLL;
            if (syl != null) {
                if (i < syl.getListItems().size()) {
                    SYL syl2 = ((RecFriendsFragment) iDcS38S0100000_9.l0).LJLJJLL;
                    if (syl2 != null) {
                        if (!(ListProtector.get(syl2.getListItems(), i) instanceof C57826Mmk)) {
                            return 2;
                        }
                        return 1;
                    }
                    o.LJIJI("powerList");
                    throw null;
                }
            } else {
                o.LJIJI("powerList");
                throw null;
            }
        }
        return 2;
    }

    public static final int LJFF$2(IDcS38S0100000_9 iDcS38S0100000_9, int i) {
        if (i < 0 || i >= ((NewVersionRecFriendsListAssem) iDcS38S0100000_9.l0).x3().getListItems().size() || !(ListProtector.get(((NewVersionRecFriendsListAssem) iDcS38S0100000_9.l0).x3().getListItems(), i) instanceof C57826Mmk)) {
            return 2;
        }
        return 1;
    }

    public static final int LJFF$3(IDcS38S0100000_9 iDcS38S0100000_9, int i) {
        AbstractC029409q<?> abstractC029409q;
        int i2;
        AbstractC57781Mm1 abstractC57781Mm1;
        AbstractC029409q<?> abstractC029409q2;
        int i3;
        C58093Mr3 c58093Mr3 = ((FollowingRelationFragment) iDcS38S0100000_9.l0).LJZ;
        if (c58093Mr3 == null || c58093Mr3.LIZ().getItemCount() == 0) {
            return 2;
        }
        FollowingRelationFragment followingRelationFragment = (FollowingRelationFragment) iDcS38S0100000_9.l0;
        if (followingRelationFragment.LJZ == null) {
            return 2;
        }
        List<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>> LJLZ = followingRelationFragment.LJLLLL.LJLZ();
        o.LJIIIIZZ(LJLZ, "listAdapter.adapters");
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (AbstractC029409q<? extends RecyclerView.ViewHolder> abstractC029409q3 : LJLZ) {
            C58094Mr4 c58094Mr4 = followingRelationFragment.LJLZ;
            if (c58094Mr4 != null) {
                abstractC029409q = c58094Mr4.LJ;
                if (abstractC029409q == null) {
                    o.LJIJI("sectionAdapter");
                    throw null;
                }
            } else {
                abstractC029409q = null;
            }
            if (o.LJ(abstractC029409q3, abstractC029409q)) {
                C58094Mr4 c58094Mr42 = followingRelationFragment.LJLZ;
                if (c58094Mr42 != null) {
                    AbstractC029409q<?> abstractC029409q4 = c58094Mr42.LJ;
                    if (abstractC029409q4 != null) {
                        i2 = abstractC029409q4.getItemCount();
                    } else {
                        o.LJIJI("sectionAdapter");
                        throw null;
                    }
                } else {
                    i2 = 0;
                }
            } else {
                FollowListAdapter followListAdapter = followingRelationFragment.LJLLLLLL;
                if (followListAdapter != null) {
                    if (o.LJ(abstractC029409q3, followListAdapter)) {
                        FollowListAdapter followListAdapter2 = followingRelationFragment.LJLLLLLL;
                        if (followListAdapter2 != null) {
                            i2 = followListAdapter2.getItemCount();
                        } else {
                            o.LJIJI("mFollowingListAdapter");
                            throw null;
                        }
                    } else {
                        C58093Mr3 c58093Mr32 = followingRelationFragment.LJZ;
                        if (c58093Mr32 != null) {
                            abstractC57781Mm1 = c58093Mr32.LIZ();
                        } else {
                            abstractC57781Mm1 = null;
                        }
                        if (o.LJ(abstractC029409q3, abstractC57781Mm1)) {
                            C58093Mr3 c58093Mr33 = followingRelationFragment.LJZ;
                            if (c58093Mr33 != null) {
                                i3 = c58093Mr33.LIZ().getItemCount();
                            } else {
                                i3 = 0;
                            }
                            i5 = i3 + i4;
                        } else {
                            InterfaceC57760Mlg interfaceC57760Mlg = (InterfaceC57760Mlg) followingRelationFragment.LLD.getValue();
                            if (interfaceC57760Mlg != null) {
                                abstractC029409q2 = interfaceC57760Mlg.Wk0();
                            } else {
                                abstractC029409q2 = null;
                            }
                            if (o.LJ(abstractC029409q3, abstractC029409q2)) {
                                z = true;
                            } else {
                                AbstractC029409q<?> abstractC029409q5 = ((C3XO) followingRelationFragment.LJZI.getValue()).LIZ;
                                if (abstractC029409q5 != null) {
                                    if (o.LJ(abstractC029409q3, abstractC029409q5)) {
                                        i2 = abstractC029409q3.getItemCount();
                                    }
                                } else {
                                    o.LJIJI("sectionAdapter");
                                    throw null;
                                }
                            }
                        }
                    }
                } else {
                    o.LJIJI("mFollowingListAdapter");
                    throw null;
                }
            }
            i4 += i2;
        }
        if (z) {
            i4++;
            i5++;
        }
        if (i4 > i || i > i5) {
            return 2;
        }
        C58093Mr3 c58093Mr34 = followingRelationFragment.LJZ;
        if (c58093Mr34 != null) {
            AbstractC57781Mm1 LIZ = c58093Mr34.LIZ();
            int i6 = i - i4;
            if (LIZ.LJLZ(i6) || LIZ.LJLLLLLL(i6)) {
                return 2;
            }
        }
        return 1;
    }

    public static final int LJFF$4(IDcS38S0100000_9 iDcS38S0100000_9, int i) {
        if (i < 0 || i >= ((C57117MbJ) iDcS38S0100000_9.l0).getListItems().size()) {
            return 2;
        }
        Object obj = ListProtector.get(((C57117MbJ) iDcS38S0100000_9.l0).getListItems(), i);
        if (!(obj instanceof C57826Mmk) && !(obj instanceof C57834Mms)) {
            return 2;
        }
        return 1;
    }

    public static final int LJFF$5(IDcS38S0100000_9 iDcS38S0100000_9, int i) {
        if (i < 0 || i >= ((C57928MoO) iDcS38S0100000_9.l0).getPowerList().getListItems().size() || !(ListProtector.get(((C57928MoO) iDcS38S0100000_9.l0).getPowerList().getListItems(), i) instanceof C57826Mmk)) {
            return 2;
        }
        return 1;
    }
}
