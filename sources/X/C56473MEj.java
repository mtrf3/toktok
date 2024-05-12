package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.profile.model.LiveReplayCover;
import com.ss.android.ugc.aweme.profile.model.PostGuideTasks;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.story.model.StoryArchDetail;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS2S0020000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.MEj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56473MEj extends JZQ {
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJLL;
    public final MH9 LJLJL;
    public final JWG LJLJLJ;
    public C26336AVg LJLJLLL;
    public final boolean LJLL;
    public final int LJLLI;
    public final ActivityC45651qj LJLLL;
    public final AwemeListFragmentImpl LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public PostGuideTasks LJZ;
    public MixListResponse LLD;
    public InterfaceC49416JaO LLIIIILZ;
    public final MFP LLIIIJ;
    public final String LLIILII;
    public final boolean LJLJJL = true;
    public boolean LJLLILLLL = true;
    public boolean LJLLJ = true;
    public final ArrayList<LiveReplayCover> LJZI = new ArrayList<>();
    public String LJZL = "";
    public boolean LL = false;
    public StoryArchDetail LLF = null;
    public List<Aweme> LLFF = null;
    public boolean LLFFF = false;
    public boolean LLFII = false;
    public boolean LLFZ = false;
    public boolean LLI = false;
    public boolean LLIFFJFJJ = false;
    public boolean LLII = false;
    public boolean LLIIII = false;
    public int LLIIIL = 0;
    public boolean LLIIIZ = true;
    public boolean LLIIJI = false;
    public boolean LLIIJLIL = false;
    public final java.util.Set<A02> LLIIL = new HashSet();
    public int LLIILZL = 0;

    @Override // X.C8HS
    public final void clearData() {
        this.LJZ = null;
        super.clearData();
    }

    public final boolean LL() {
        if (this.LJLL && this.LJLLI == 14) {
            return true;
        }
        return false;
    }

    public final boolean LLD() {
        if (this.LJLL && C55723Ltv.LIZIZ.LJIIJ() && this.LJLLI == 14) {
            return true;
        }
        return false;
    }

    public final int LLF() {
        return this.LJZI.size() + (this.LJLJI ? 1 : 0) + (this.LLII ? 1 : 0) + (this.LLFFF ? 1 : 0) + (this.LLFII ? 1 : 0) + (this.LLI ? 1 : 0);
    }

    public final boolean LLFII() {
        if (this.LLFZ && LL()) {
            return true;
        }
        return false;
    }

    public final boolean LLFZ() {
        if (this.LLFII && LLD()) {
            return true;
        }
        return false;
    }

    public final boolean LLIIIILZ() {
        boolean z;
        boolean z2;
        if (this.LLIIJLIL) {
            return false;
        }
        ActivityC45651qj context = this.LJLLL;
        int size = this.LJZI.size() + (this.LJLJI ? 1 : 0) + super.getBasicItemCount();
        boolean z3 = this.LJLJJI;
        o.LJIIIZ(context, "context");
        if (C2NU.LIZ.LIZIZ() && size <= 0 && !AV1.LJIIJJI() && z3 && (C255199zv.LIZLLL() == 1 || C255199zv.LJIIJJI())) {
            z = true;
            z2 = this.LJLL;
            if (z2 && this.LJLLI == 0) {
                C255199zv.LIZLLL = z;
            }
            if (z || !z2 || this.LJLLI != 0) {
                return false;
            }
            return true;
        }
        z = false;
        z2 = this.LJLL;
        if (z2) {
            C255199zv.LIZLLL = z;
        }
        return z ? false : false;
    }

    public final boolean LLIIIJ() {
        if (this.LLIIJLIL || C235599Ml.LIZ()) {
            return false;
        }
        if (this.LJLL && this.LJLLI == 0) {
            if (LLIIII()) {
                return false;
            }
            C255199zv.LIZJ = C255199zv.LJIILJJIL(LLF() + super.getBasicItemCount(), this.LJLLL);
        }
        if (!C255199zv.LJIILJJIL(LLF() + super.getBasicItemCount(), this.LJLLL) || !this.LJLL || this.LJLLI != 0) {
            return false;
        }
        return true;
    }

    public final void LLIIJI() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (!this.LJLL ? !(this.LJLLI != 0 || super.getBasicItemCount() <= 0 || !this.LL) : !(this.LJLLI != 0 || super.getBasicItemCount() <= 0 || !this.LL || !MixFeedService.LJJIJIIJIL().LIZIZ() || (this.LLD == null && (this.LLI || !this.LLIIIZ || this.LLIIJI)))) {
            z = true;
        } else {
            z = false;
        }
        this.LLFFF = z;
        if (this.LJLL) {
            this.LLII = LLIIIILZ();
            this.LLIIII = LLIIIJ();
        }
        if (this.LLFII && LLD()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLFII = z2;
        if (this.LLFZ && LL()) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLFZ = z3;
        if (this.LLIFFJFJJ && C55723Ltv.LIZIZ.LJIILL().LIZ() && !this.LLIIJLIL) {
            z4 = true;
        }
        this.LLI = z4;
    }

    public final String toString() {
        String str;
        int i = this.LJLLI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 17) {
                                str = "TYPE_TOOL_MASTER";
                            } else {
                                str = "TYPE_GHOST_MUSIC_TAB";
                            }
                        } else {
                            str = "TYPE_COLLECT_AWEME";
                        }
                    } else {
                        str = "TYPE_ORIGIN_MUSIC";
                    }
                } else {
                    str = "TYPE_STORY_AWEME";
                }
            } else {
                str = "TYPE_FAVORITE_AWEME";
            }
        } else {
            str = "TYPE_PUBLISH_AWEME";
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("profileListType: ", str, ", itemCount: ");
        LIZIZ.append(getItemCount());
        LIZIZ.append(", baseCount: ");
        LIZIZ.append(getBasicItemCount());
        LIZIZ.append(", mShowDraftBox: ");
        LIZIZ.append(this.LJLJI);
        LIZIZ.append(", mShowFooter: ");
        LIZIZ.append(this.mShowFooter);
        LIZIZ.append(", isMyProfile: ");
        LIZIZ.append(this.LJLL);
        return X1D.LIZIZ(LIZIZ);
    }

    public final int LLFFF() {
        return super.getBasicItemCount();
    }

    public final boolean LLIIII() {
        if (!C235599Ml.LIZ() || !this.LLII) {
            return false;
        }
        C255199zv.LIZJ = false;
        return true;
    }

    @Override // X.AbstractC51777KTt, X.C8HS, X.C4II
    public final int getBasicItemCount() {
        int i;
        int LLF = LLF() + super.getBasicItemCount();
        if (this.LJZ == null) {
            i = 0;
        } else {
            i = 1;
        }
        return i + (this.LLIIII ? 1 : 0) + (this.LLFZ ? 1 : 0) + LLF;
    }

    @Override // X.C8HS
    public final List<Aweme> getData() {
        return this.mmItems;
    }

    @Override // X.MK7
    public final boolean isNestedFlingStopCompat() {
        return true;
    }

    @Override // X.JZQ
    public final boolean LJZI(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 7) {
            return true;
        }
        return false;
    }

    public final Aweme LLFF(int i) {
        int LLF = i - LLF();
        List<T> list = this.mmItems;
        if (list == 0 || LLF < 0 || LLF >= list.size()) {
            return null;
        }
        return (Aweme) ListProtector.get(list, LLF);
    }

    public final void LLIFFJFJJ(StoryArchDetail storyArchDetail) {
        this.LLF = storyArchDetail;
        boolean z = false;
        if (storyArchDetail != null && storyArchDetail.getItems() != null && !storyArchDetail.getItems().isEmpty() && LLD()) {
            z = true;
        }
        this.LLFII = z;
    }

    public final void LLII(boolean z) {
        java.util.Set<A02> set = this.LLIIL;
        if (set == null || ((HashSet) set).isEmpty()) {
            return;
        }
        Iterator it = ((HashSet) this.LLIIL).iterator();
        while (it.hasNext()) {
            A02 a02 = (A02) it.next();
            if (a02 != null) {
                a02.LJJIIJZLJL(z);
            }
        }
    }

    public final void LLIIJLIL(List<Aweme> list) {
        if (this.LJLL && this.LJLLI == 0 && list != null) {
            int size = list.size();
            int awemeCount = ((RBX) HG3.LJIILL()).getCurUser().getAwemeCount();
            if (size > awemeCount) {
                C188727au LIZJ = C78920UyC.LIZJ(1, "error_type");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(size);
                LIZ.append("-");
                LIZ.append(awemeCount);
                LIZJ.LJIIIZ("num_des", X1D.LIZIZ(LIZ));
                FMX.LJIIL("publish_num_check", LIZJ.LIZ);
            }
            if (size == 0 && awemeCount == 1) {
                C188727au LIZJ2 = C78920UyC.LIZJ(2, "error_type");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(size);
                LIZ2.append("-");
                LIZ2.append(awemeCount);
                LIZJ2.LJIIIZ("num_des", X1D.LIZIZ(LIZ2));
                FMX.LJIIL("publish_num_check", LIZJ2.LIZ);
            }
            if (!this.LJLLJ && size != awemeCount) {
                C188727au LIZJ3 = C78920UyC.LIZJ(3, "error_type");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(size);
                LIZ3.append("-");
                LIZ3.append(awemeCount);
                LIZJ3.LJIIIZ("num_des", X1D.LIZIZ(LIZ3));
                FMX.LJIIL("publish_num_check", LIZJ3.LIZ);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    @Override // X.AbstractC51777KTt, X.C4II
    public final int getBasicItemViewType(int i) {
        int i2;
        ?? r3;
        if (this.LLFII) {
            if (i == 0) {
                return 11;
            }
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.LLFFF) {
            if (i == i2) {
                return 10;
            }
            i2++;
        }
        if (this.LLI) {
            if (i == i2) {
                return 13;
            }
            i2++;
        }
        if (this.LJLLI == 15) {
            return 7;
        }
        if (this.LJLJI && i2 == i) {
            return 1;
        }
        if (this.LJZI.size() > 0 && i >= (r3 = this.LJLJI) && i < this.LJZI.size() + (r3 == true ? 1 : 0)) {
            return 6;
        }
        Aweme LLFF = LLFF(i);
        if (Z89.LIZIZ.LIZIZ(LLFF)) {
            return 17;
        }
        C53578L1a.LIZ.getClass();
        if (C53578L1a.LIZ() && C54838Lfe.LJJ(LLFF)) {
            return 12;
        }
        if (LLFF != null) {
            if (LLFF.getAwemeType() == 2) {
                return 2;
            }
            if (LLFF.isForwardAweme()) {
                return 7;
            }
        }
        if (this.LJZ != null && i == getBasicItemCount() - 1) {
            return 5;
        }
        if ((i == 0 || (this.LLI && i == 1)) && this.LJLL && this.LLII) {
            return 9;
        }
        if (!C235599Ml.LIZ()) {
            if (this.LJLL && ((this.mmItems == null || i == getBasicItemCount() - 1) && this.LLIIII)) {
                return 8;
            }
        } else if (this.LJLL && ((this.mmItems == null || i == getBasicItemCount() - 1) && this.LLIIII)) {
            return 14;
        }
        if (this.LLFZ && !this.LJLLJ && i == getBasicItemCount() - 1) {
            return 15;
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC028509h abstractC028509h;
        super.onAttachedToRecyclerView(recyclerView);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (abstractC028509h = ((GridLayoutManager) layoutManager).LLIILII) != null) {
            abstractC028509h.LIZJ = true;
            abstractC028509h.LIZLLL = true;
        }
    }

    @Override // X.JZQ, X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        JWG jwg;
        super.onViewAttachedToWindow(viewHolder);
        if (this.LJLJJLL && LJZI(viewHolder) && (jwg = this.LJLJLJ) != null) {
            jwg.vk(viewHolder);
        }
        if (this.LJLJJLL && (viewHolder instanceof MFW)) {
            viewHolder.getClass();
            MFW.L("show");
        }
        if (viewHolder instanceof C86464Xwa) {
            C86464Xwa c86464Xwa = (C86464Xwa) viewHolder;
            c86464Xwa.LJLJL.isUserProfileFragmentVisible2().observe(c86464Xwa.LJLIL, c86464Xwa);
        }
    }

    @Override // X.JZQ, X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C86464Xwa) {
            C86464Xwa c86464Xwa = (C86464Xwa) viewHolder;
            c86464Xwa.LJLJL.isUserProfileFragmentVisible2().removeObserver(c86464Xwa);
        }
    }

    @Override // X.C8HS
    public final void setData(List<Aweme> list) {
        MFP mfp;
        AwemeListFragmentImpl awemeListFragmentImpl;
        this.LJLJJI = true;
        super.setData(list);
        LLIIJLIL(list);
        if (this.LJLLI == 0 && (awemeListFragmentImpl = this.LJLLLL) != null) {
            boolean LLIIIJ = LLIIIJ();
            boolean LLIIII = LLIIII();
            ProfileViewModel profileViewModel = awemeListFragmentImpl.LLJJLIIIJLLLLLLLZ;
            if (profileViewModel != null) {
                profileViewModel.setState(new AqS2S0020000_4(LLIIIJ, LLIIII, 1));
            }
        }
        if (getBasicItemCount() == 0 && (mfp = this.LLIIIJ) != null) {
            AwemeListFragmentImpl awemeListFragmentImpl2 = (AwemeListFragmentImpl) mfp;
            if (awemeListFragmentImpl2.LLJJJJLIIL) {
                awemeListFragmentImpl2.LLJJJJLIIL = false;
                if (!awemeListFragmentImpl2.LJLLILLLL || awemeListFragmentImpl2.LJLL != 0) {
                    return;
                }
                C255209zw.LJ();
            }
        }
    }

    @Override // X.C8HS
    public final void setDataAfterLoadMore(List<Aweme> list) {
        super.setDataAfterLoadMore(list);
        LLIIJLIL(list);
    }

    @Override // X.C4II
    public final void setShowFooter(boolean z) {
        boolean z2;
        if (this.LJZ == null && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        super.setShowFooter(z2);
    }

    public final void LLIIIZ(boolean z, MixListResponse mixListResponse) {
        List<MixStruct> mixList;
        if (this.LL != z) {
            this.LL = z;
            this.LLD = mixListResponse;
            notifyDataSetChanged();
            return;
        }
        List<MixStruct> list = null;
        if (mixListResponse == null) {
            mixList = null;
        } else {
            mixList = mixListResponse.getMixList();
        }
        MixListResponse mixListResponse2 = this.LLD;
        if (mixListResponse2 != null) {
            list = mixListResponse2.getMixList();
        }
        if (mixList != null && list != null && mixList.size() == list.size()) {
            for (int i = 0; i < mixList.size(); i++) {
                if (((MixStruct) ListProtector.get(mixList, i)).mixId.equals(((MixStruct) ListProtector.get(list, i)).mixId) && ((MixStruct) ListProtector.get(mixList, i)).getMixName().equals(((MixStruct) ListProtector.get(list, i)).getMixName())) {
                }
            }
            return;
        }
        this.LLD = mixListResponse;
        notifyDataSetChanged();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L13;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0805 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01b2  */
    @Override // X.AbstractC51777KTt, X.C4II
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r21, int r22) {
        /*
            Method dump skipped, instructions count: 2096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56473MEj.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC51777KTt, X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        String str;
        View LIZ;
        switch (i) {
            case 1:
                C62822Ol8 c62822Ol8 = C52639KlH.LIZ;
                int intValue = ((Number) c62822Ol8.getValue()).intValue();
                int i2 = R.layout.c8m;
                if (intValue == 1) {
                    LayoutInflater LLZIL = C16880lQ.LLZIL(viewGroup.getContext());
                    if (((Number) c62822Ol8.getValue()).intValue() != 1) {
                        i2 = R.layout.c8n;
                    }
                    return new MFT(C16880lQ.LLLLIILL(LLZIL, i2, viewGroup, false));
                }
                LayoutInflater LLZIL2 = C16880lQ.LLZIL(viewGroup.getContext());
                if (((Number) c62822Ol8.getValue()).intValue() != 1) {
                    i2 = R.layout.c8n;
                }
                return new MFU(C16880lQ.LLLLIILL(LLZIL2, i2, viewGroup, false));
            case 2:
                return new C226168uC(C28289B8j.LIZ(viewGroup, R.layout.c5i, viewGroup, false), this.LLIILII, this.LJLJL);
            case 3:
                return new C86464Xwa(this.LJLLL, C28289B8j.LIZ(viewGroup, R.layout.c5q, viewGroup, false));
            case 4:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            default:
                if (C55703Ltb.LIZIZ) {
                    LIZ = C16970lZ.LIZJ(R.layout.c59, this.LJLLL, viewGroup, false);
                } else {
                    LIZ = C28289B8j.LIZ(viewGroup, R.layout.c59, viewGroup, false);
                }
                this.LLIIIL++;
                return new MFV(LIZ, this.LLIILII, this.LJLJL);
            case 5:
                return new C56496MFg(C28289B8j.LIZ(viewGroup, R.layout.c5r, viewGroup, false));
            case 6:
                throw new IllegalArgumentException("not supported in i18n");
            case 7:
                throw new IllegalArgumentException("not supported in i18n");
            case 8:
                LLII(false);
                return new C56479MEp(this.LJLLL, C28289B8j.LIZ(viewGroup, R.layout.c5e, viewGroup, false));
            case 9:
                if (C235599Ml.LIZ() || ((Number) C235599Ml.LIZIZ.getValue()).intValue() == 1) {
                    return new A00(C28289B8j.LIZ(viewGroup, R.layout.c5h, viewGroup, false), this.LJLLL, this.LJLLLL, this);
                }
                return new C56480MEq(this.LJLLL, C28289B8j.LIZ(viewGroup, R.layout.c5g, viewGroup, false));
            case 10:
                if (this.LJLL) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                return MixFeedService.LJJIJIIJIL().LJJII(viewGroup, this.LJLL, false, str, null);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return new MFW(this.LJLLL, C55723Ltv.LIZIZ.LJIIIIZZ().LIZJ("profile_item_story_arch_entry", viewGroup.getContext(), R.layout.c5v, null, viewGroup, false));
            case 12:
                return new C56155M2d(C55723Ltv.LIZIZ.LJIIIIZZ().LIZJ("profile_item_story_collection", viewGroup.getContext(), R.layout.c5w, null, viewGroup, false), this.LLIILII, this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return new C55974Lxy(viewGroup, this.LJLLLL, this);
            case 14:
                LLII(true);
                return new MFD(C28289B8j.LIZ(viewGroup, R.layout.c42, viewGroup, false));
            case 15:
                return new C9AA(this.LJLLL, C28289B8j.LIZ(viewGroup, R.layout.c5m, viewGroup, false));
            case 17:
                LayoutInflater LLZIL3 = C16880lQ.LLZIL(viewGroup.getContext());
                C198507qg c198507qg = C198507qg.LIZIZ;
                AbstractC196727no LIZIZ = c198507qg.LIZIZ(C16880lQ.LLLLIILL(LLZIL3, c198507qg.LIZJ(), viewGroup, false), this.LLIILII, this.LJLJL);
                LIZIZ.L();
                return LIZIZ;
        }
    }

    @Override // X.MK7
    public final void showPullUpLoadMore(RecyclerView recyclerView, boolean z) {
        super.showPullUpLoadMore(recyclerView, z);
    }

    public static void LLIIIL(Aweme aweme, int i, boolean z) {
        if (i == 4 && z && !MF0.LIZIZ.isDataSetChangedOnStart() && aweme != null) {
            MF0.LIZIZ.onVideoItemActionShow(aweme);
        }
    }

    public C56473MEj(ActivityC45651qj activityC45651qj, AwemeListFragmentImpl awemeListFragmentImpl, String str, boolean z, int i, MH9 mh9, JWG jwg, String str2, String str3, MFP mfp) {
        this.LJLLL = activityC45651qj;
        this.LJLLLL = awemeListFragmentImpl;
        this.LLIILII = str;
        this.LJLJL = mh9;
        this.LJLL = z;
        this.LJLLI = i;
        this.LJLJLJ = jwg;
        this.LJLLLLLL = str2;
        this.LJLZ = str3;
        this.LLIIIJ = mfp;
        registerAdapterDataObserver(new C56474MEk(this, activityC45651qj));
    }
}
