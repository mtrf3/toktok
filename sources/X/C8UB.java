package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.UserInfoUpdateEvent;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.8UB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8UB implements C33Q {
    public final C50420Jqa LJLIL;
    public final C174046sK LJLILLLLZI;
    public final C183887Jo LJLJI;
    public final C7JS LJLJJI;
    public final AnonymousClass799 LJLJJL;
    public final C31633CbF LJLJJLL;
    public final C46276IEe LJLJL;
    public final C55008LiO LJLJLJ;
    public final C2MC LJLJLLL;
    public final C56222Io LJLL;
    public final C46361IHl LJLLI;
    public final FollowStatusEvent LJLLILLLL;
    public final C1IZ LJLLJ;
    public final C56252Ir LJLLL;
    public final C43I<Aweme> LJLLLL;
    public final C70502pi LJLLLLLL;
    public final C178646zk LJLZ;
    public final C193097hx LJZ;
    public final C56332Iz LJZI;
    public final C57292Mr LJZL;
    public final C175046tw LL;
    public final C7YQ LLD;
    public final C43I<Boolean> LLF;
    public final C8UI LLFF;
    public final C8UR LLFFF;
    public final SU3 LLFII;
    public final C227678wd LLFZ;
    public final UserInfoUpdateEvent LLI;

    public C8UB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8UB)) {
            return false;
        }
        C8UB c8ub = (C8UB) obj;
        return o.LJ(this.LJLIL, c8ub.LJLIL) && o.LJ(this.LJLILLLLZI, c8ub.LJLILLLLZI) && o.LJ(this.LJLJI, c8ub.LJLJI) && o.LJ(this.LJLJJI, c8ub.LJLJJI) && o.LJ(this.LJLJJL, c8ub.LJLJJL) && o.LJ(this.LJLJJLL, c8ub.LJLJJLL) && o.LJ(this.LJLJL, c8ub.LJLJL) && o.LJ(this.LJLJLJ, c8ub.LJLJLJ) && o.LJ(this.LJLJLLL, c8ub.LJLJLLL) && o.LJ(this.LJLL, c8ub.LJLL) && o.LJ(this.LJLLI, c8ub.LJLLI) && o.LJ(this.LJLLILLLL, c8ub.LJLLILLLL) && o.LJ(this.LJLLJ, c8ub.LJLLJ) && o.LJ(this.LJLLL, c8ub.LJLLL) && o.LJ(this.LJLLLL, c8ub.LJLLLL) && o.LJ(this.LJLLLLLL, c8ub.LJLLLLLL) && o.LJ(this.LJLZ, c8ub.LJLZ) && o.LJ(this.LJZ, c8ub.LJZ) && o.LJ(this.LJZI, c8ub.LJZI) && o.LJ(this.LJZL, c8ub.LJZL) && o.LJ(this.LL, c8ub.LL) && o.LJ(this.LLD, c8ub.LLD) && o.LJ(this.LLF, c8ub.LLF) && o.LJ(this.LLFF, c8ub.LLFF) && o.LJ(this.LLFFF, c8ub.LLFFF) && o.LJ(this.LLFII, c8ub.LLFII) && o.LJ(this.LLFZ, c8ub.LLFZ) && o.LJ(this.LLI, c8ub.LLI);
    }

    public final int hashCode() {
        C50420Jqa c50420Jqa = this.LJLIL;
        int hashCode = (c50420Jqa == null ? 0 : c50420Jqa.hashCode()) * 31;
        C174046sK c174046sK = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c174046sK == null ? 0 : c174046sK.hashCode())) * 31;
        C183887Jo c183887Jo = this.LJLJI;
        int hashCode3 = (hashCode2 + (c183887Jo == null ? 0 : c183887Jo.hashCode())) * 31;
        C7JS c7js = this.LJLJJI;
        int hashCode4 = (hashCode3 + (c7js == null ? 0 : c7js.hashCode())) * 31;
        AnonymousClass799 anonymousClass799 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (anonymousClass799 == null ? 0 : anonymousClass799.hashCode())) * 31;
        C31633CbF c31633CbF = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (c31633CbF == null ? 0 : c31633CbF.hashCode())) * 31;
        C46276IEe c46276IEe = this.LJLJL;
        int hashCode7 = (hashCode6 + (c46276IEe == null ? 0 : c46276IEe.hashCode())) * 31;
        C55008LiO c55008LiO = this.LJLJLJ;
        int hashCode8 = (hashCode7 + (c55008LiO == null ? 0 : c55008LiO.hashCode())) * 31;
        C2MC c2mc = this.LJLJLLL;
        int hashCode9 = (hashCode8 + (c2mc == null ? 0 : c2mc.hashCode())) * 31;
        C56222Io c56222Io = this.LJLL;
        int hashCode10 = (hashCode9 + (c56222Io == null ? 0 : c56222Io.hashCode())) * 31;
        C46361IHl c46361IHl = this.LJLLI;
        int hashCode11 = (hashCode10 + (c46361IHl == null ? 0 : c46361IHl.hashCode())) * 31;
        FollowStatusEvent followStatusEvent = this.LJLLILLLL;
        int hashCode12 = (hashCode11 + (followStatusEvent == null ? 0 : followStatusEvent.hashCode())) * 31;
        C1IZ c1iz = this.LJLLJ;
        int hashCode13 = (hashCode12 + (c1iz == null ? 0 : c1iz.hashCode())) * 31;
        C56252Ir c56252Ir = this.LJLLL;
        int hashCode14 = (hashCode13 + (c56252Ir == null ? 0 : c56252Ir.hashCode())) * 31;
        C43I<Aweme> c43i = this.LJLLLL;
        int hashCode15 = (hashCode14 + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C70502pi c70502pi = this.LJLLLLLL;
        int hashCode16 = (hashCode15 + (c70502pi == null ? 0 : c70502pi.hashCode())) * 31;
        C178646zk c178646zk = this.LJLZ;
        int hashCode17 = (hashCode16 + (c178646zk == null ? 0 : c178646zk.hashCode())) * 31;
        C193097hx c193097hx = this.LJZ;
        int hashCode18 = (hashCode17 + (c193097hx == null ? 0 : c193097hx.hashCode())) * 31;
        C56332Iz c56332Iz = this.LJZI;
        int hashCode19 = (hashCode18 + (c56332Iz == null ? 0 : c56332Iz.hashCode())) * 31;
        C57292Mr c57292Mr = this.LJZL;
        int hashCode20 = (hashCode19 + (c57292Mr == null ? 0 : c57292Mr.hashCode())) * 31;
        C175046tw c175046tw = this.LL;
        int hashCode21 = (hashCode20 + (c175046tw == null ? 0 : c175046tw.hashCode())) * 31;
        C7YQ c7yq = this.LLD;
        int hashCode22 = (hashCode21 + (c7yq == null ? 0 : c7yq.hashCode())) * 31;
        C43I<Boolean> c43i2 = this.LLF;
        int hashCode23 = (hashCode22 + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C8UI c8ui = this.LLFF;
        int hashCode24 = (hashCode23 + (c8ui == null ? 0 : c8ui.hashCode())) * 31;
        C8UR c8ur = this.LLFFF;
        int hashCode25 = (hashCode24 + (c8ur == null ? 0 : c8ur.hashCode())) * 31;
        SU3 su3 = this.LLFII;
        int hashCode26 = (hashCode25 + (su3 == null ? 0 : su3.hashCode())) * 31;
        C227678wd c227678wd = this.LLFZ;
        int hashCode27 = (hashCode26 + (c227678wd == null ? 0 : c227678wd.hashCode())) * 31;
        UserInfoUpdateEvent userInfoUpdateEvent = this.LLI;
        return hashCode27 + (userInfoUpdateEvent != null ? userInfoUpdateEvent.hashCode() : 0);
    }

    public final String toString() {
        return "VideoEventDispatchState(videoEvent=" + this.LJLIL + ", commentEvent=" + this.LJLILLLLZI + ", diggEvent=" + this.LJLJI + ", diggStartEvent=" + this.LJLJJI + ", syncDiggStateEvent=" + this.LJLJJL + ", profileFollowEvent=" + this.LJLJJLL + ", playerEvent=" + this.LJLJL + ", onAwesomeSplashEvent=" + this.LJLJLJ + ", shareEndEvent=" + this.LJLJLLL + ", shareAwemeEvent=" + this.LJLL + ", playProgressEvent=" + this.LJLLI + ", followStatus=" + this.LJLLILLLL + ", roomStatusEvent=" + this.LJLLJ + ", topViewLiveEndEvent=" + this.LJLLL + ", interactionTagInfoEvent=" + this.LJLLLL + ", collectAwemeEvent=" + this.LJLLLLLL + ", quickCommentEvent=" + this.LJLZ + ", fakeFavoriteEvent=" + this.LJZ + ", longPressEvent=" + this.LJZI + ", musicDspSongCollectEvent=" + this.LJZL + ", blockUserEvent=" + this.LL + ", unBlockUserEvent=" + this.LLD + ", adCardShowEvent=" + this.LLF + ", music2DspAuthEvent=" + this.LLFF + ", music2DspLinkChangeEvent=" + this.LLFFF + ", music2DspPreCheckedEvent=" + this.LLFII + ", anchorUpdateEvent=" + this.LLFZ + ", userInfoUpdateEvent=" + this.LLI + ')';
    }

    public /* synthetic */ C8UB(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8UB(C50420Jqa c50420Jqa, C174046sK c174046sK, C183887Jo c183887Jo, C7JS c7js, AnonymousClass799 anonymousClass799, C31633CbF c31633CbF, C46276IEe c46276IEe, C55008LiO c55008LiO, C2MC c2mc, C56222Io c56222Io, C46361IHl c46361IHl, FollowStatusEvent followStatusEvent, C1IZ c1iz, C56252Ir c56252Ir, C43I<? extends Aweme> c43i, C70502pi c70502pi, C178646zk c178646zk, C193097hx c193097hx, C56332Iz c56332Iz, C57292Mr c57292Mr, C175046tw c175046tw, C7YQ c7yq, C43I<Boolean> c43i2, C8UI c8ui, C8UR c8ur, SU3 su3, C227678wd c227678wd, UserInfoUpdateEvent userInfoUpdateEvent) {
        this.LJLIL = c50420Jqa;
        this.LJLILLLLZI = c174046sK;
        this.LJLJI = c183887Jo;
        this.LJLJJI = c7js;
        this.LJLJJL = anonymousClass799;
        this.LJLJJLL = c31633CbF;
        this.LJLJL = c46276IEe;
        this.LJLJLJ = c55008LiO;
        this.LJLJLLL = c2mc;
        this.LJLL = c56222Io;
        this.LJLLI = c46361IHl;
        this.LJLLILLLL = followStatusEvent;
        this.LJLLJ = c1iz;
        this.LJLLL = c56252Ir;
        this.LJLLLL = c43i;
        this.LJLLLLLL = c70502pi;
        this.LJLZ = c178646zk;
        this.LJZ = c193097hx;
        this.LJZI = c56332Iz;
        this.LJZL = c57292Mr;
        this.LL = c175046tw;
        this.LLD = c7yq;
        this.LLF = c43i2;
        this.LLFF = c8ui;
        this.LLFFF = c8ur;
        this.LLFII = su3;
        this.LLFZ = c227678wd;
        this.LLI = userInfoUpdateEvent;
    }

    public static C8UB LIZ(C8UB c8ub, C50420Jqa c50420Jqa, C174046sK c174046sK, C183887Jo c183887Jo, C7JS c7js, AnonymousClass799 anonymousClass799, C31633CbF c31633CbF, C46276IEe c46276IEe, C55008LiO c55008LiO, C2MC c2mc, C56222Io c56222Io, C46361IHl c46361IHl, FollowStatusEvent followStatusEvent, C1IZ c1iz, C56252Ir c56252Ir, C43I c43i, C70502pi c70502pi, C178646zk c178646zk, C193097hx c193097hx, C56332Iz c56332Iz, C57292Mr c57292Mr, C175046tw c175046tw, C7YQ c7yq, C43I c43i2, C8UI c8ui, C8UR c8ur, SU3 su3, C227678wd c227678wd, UserInfoUpdateEvent userInfoUpdateEvent, int i) {
        UserInfoUpdateEvent userInfoUpdateEvent2 = userInfoUpdateEvent;
        SU3 su32 = su3;
        C8UR c8ur2 = c8ur;
        C8UI c8ui2 = c8ui;
        C43I c43i3 = c43i2;
        C7YQ c7yq2 = c7yq;
        C193097hx c193097hx2 = c193097hx;
        C178646zk c178646zk2 = c178646zk;
        C57292Mr c57292Mr2 = c57292Mr;
        C31633CbF c31633CbF2 = c31633CbF;
        C56252Ir c56252Ir2 = c56252Ir;
        AnonymousClass799 anonymousClass7992 = anonymousClass799;
        C7JS c7js2 = c7js;
        C183887Jo c183887Jo2 = c183887Jo;
        C50420Jqa c50420Jqa2 = c50420Jqa;
        C56332Iz c56332Iz2 = c56332Iz;
        C174046sK c174046sK2 = c174046sK;
        C46276IEe c46276IEe2 = c46276IEe;
        C55008LiO c55008LiO2 = c55008LiO;
        C2MC c2mc2 = c2mc;
        C43I c43i4 = c43i;
        C175046tw c175046tw2 = c175046tw;
        C56222Io c56222Io2 = c56222Io;
        C46361IHl c46361IHl2 = c46361IHl;
        FollowStatusEvent followStatusEvent2 = followStatusEvent;
        C1IZ c1iz2 = c1iz;
        C227678wd c227678wd2 = c227678wd;
        C70502pi c70502pi2 = c70502pi;
        if ((i & 1) != 0) {
            c50420Jqa2 = c8ub.LJLIL;
        }
        if ((i & 2) != 0) {
            c174046sK2 = c8ub.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c183887Jo2 = c8ub.LJLJI;
        }
        if ((i & 8) != 0) {
            c7js2 = c8ub.LJLJJI;
        }
        if ((i & 16) != 0) {
            anonymousClass7992 = c8ub.LJLJJL;
        }
        if ((i & 32) != 0) {
            c31633CbF2 = c8ub.LJLJJLL;
        }
        if ((i & 64) != 0) {
            c46276IEe2 = c8ub.LJLJL;
        }
        if ((i & 128) != 0) {
            c55008LiO2 = c8ub.LJLJLJ;
        }
        if ((i & 256) != 0) {
            c2mc2 = c8ub.LJLJLLL;
        }
        if ((i & 512) != 0) {
            c56222Io2 = c8ub.LJLL;
        }
        if ((i & 1024) != 0) {
            c46361IHl2 = c8ub.LJLLI;
        }
        if ((i & 2048) != 0) {
            followStatusEvent2 = c8ub.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            c1iz2 = c8ub.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            c56252Ir2 = c8ub.LJLLL;
        }
        if ((i & 16384) != 0) {
            c43i4 = c8ub.LJLLLL;
        }
        if ((32768 & i) != 0) {
            c70502pi2 = c8ub.LJLLLLLL;
        }
        if ((65536 & i) != 0) {
            c178646zk2 = c8ub.LJLZ;
        }
        if ((131072 & i) != 0) {
            c193097hx2 = c8ub.LJZ;
        }
        if ((262144 & i) != 0) {
            c56332Iz2 = c8ub.LJZI;
        }
        if ((524288 & i) != 0) {
            c57292Mr2 = c8ub.LJZL;
        }
        if ((1048576 & i) != 0) {
            c175046tw2 = c8ub.LL;
        }
        if ((2097152 & i) != 0) {
            c7yq2 = c8ub.LLD;
        }
        if ((4194304 & i) != 0) {
            c43i3 = c8ub.LLF;
        }
        if ((8388608 & i) != 0) {
            c8ui2 = c8ub.LLFF;
        }
        if ((16777216 & i) != 0) {
            c8ur2 = c8ub.LLFFF;
        }
        if ((33554432 & i) != 0) {
            su32 = c8ub.LLFII;
        }
        if ((67108864 & i) != 0) {
            c227678wd2 = c8ub.LLFZ;
        }
        if ((i & 134217728) != 0) {
            userInfoUpdateEvent2 = c8ub.LLI;
        }
        c8ub.getClass();
        C227678wd c227678wd3 = c227678wd2;
        UserInfoUpdateEvent userInfoUpdateEvent3 = userInfoUpdateEvent2;
        return new C8UB(c50420Jqa2, c174046sK2, c183887Jo2, c7js2, anonymousClass7992, c31633CbF2, c46276IEe2, c55008LiO2, c2mc2, c56222Io2, c46361IHl2, followStatusEvent2, c1iz2, c56252Ir2, c43i4, c70502pi2, c178646zk2, c193097hx2, c56332Iz2, c57292Mr2, c175046tw2, c7yq2, c43i3, c8ui2, c8ur2, su32, c227678wd3, userInfoUpdateEvent3);
    }
}
