package com.ss.android.ugc.aweme.feed.assem.usercard;

import X.AAD;
import X.AbstractC57828Mmm;
import X.C110614Vt;
import X.C16880lQ;
import X.C210548Oc;
import X.C210558Od;
import X.C211278Qx;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C221018lt;
import X.C240999d1;
import X.C241249dQ;
import X.C25771A9n;
import X.C57778Mly;
import X.C57830Mmo;
import X.C57831Mmp;
import X.C57903Mnz;
import X.C5H3;
import X.C61328O5c;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78674UuE;
import X.C78675UuF;
import X.C78676UuG;
import X.C78680UuK;
import X.C78681UuL;
import X.C78682UuM;
import X.C8YN;
import X.C98J;
import X.C98M;
import X.InterfaceC115514g7;
import X.InterfaceC57910Mo6;
import X.InterfaceC74236TBo;
import X.TBT;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.experiment.RecMoreExperiment;
import com.ss.android.ugc.feed.platform.container.info.FeedInfoAreaVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS0S3000000_9;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;
import q03.IDaS490S0100000_13;

/* loaded from: classes14.dex */
public final class VideoUserCardAssem extends FeedBaseAssem<VideoUserCardAssem> implements InterfaceC57910Mo6 {
    public static final C57903Mnz LLIFFJFJJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public static final LinearInterpolator LLIIII;
    public boolean LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final C5H3 LLFZ;
    public final InterfaceC115514g7 LLI;

    static {
        TBT tbt = new TBT(VideoUserCardAssem.class, "userCardVM", "getUserCardVM()Lcom/ss/android/ugc/aweme/feed/assem/usercard/VideoUserCardVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLII = new InterfaceC74236TBo[]{tbt, new TBT(VideoUserCardAssem.class, "infoAreaVM", "getInfoAreaVM()Lcom/ss/android/ugc/feed/platform/container/info/FeedInfoAreaVM;", 0)};
        LLIFFJFJJ = new C57903Mnz();
        LLIIII = new LinearInterpolator();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, p4(), new TBT() { // from class: X.UuH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C78668Uu8) obj).LJLJJL);
            }
        }, null, C78682UuM.LJLIL, 6);
        C8YN.LJII(this, p4(), new TBT() { // from class: X.UuI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C78668Uu8) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), C78680UuK.LJLIL, 4);
        C8YN.LJII(this, p4(), new TBT() { // from class: X.UuJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C78668Uu8) obj).LJLJI;
            }
        }, null, C78681UuL.LJLIL, 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.af0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.UuN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C78674UuE.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.UuO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C78675UuF.LJLIL, 6);
    }

    public VideoUserCardAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoUserCardVM.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c240999d1, new AqS153S0100000_3(LIZ, 384), null, C78676UuG.INSTANCE, null, null);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C211278Qx.INSTANCE);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedInfoAreaVM.class);
        this.LLI = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS153S0100000_3(LIZ2, 385), null, C210558Od.INSTANCE, null, null);
    }

    public final VideoUserCardVM p4() {
        return (VideoUserCardVM) this.LLFII.LIZ(this, LLII[0]);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        String str2;
        User author;
        String uid;
        User author2;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        LLIFFJFJJ.getClass();
        boolean LIZ = C57903Mnz.LIZ(item);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onBind, item:");
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(", isActive: ");
        LIZ2.append(LIZ);
        X1D.LIZIZ(LIZ2);
        VideoUserCardVM p4 = p4();
        o.LJIIIIZZ(item.mEventType, "item.eventType");
        p4.getClass();
        p4.LJLJLLL = LIZ;
        if (!LIZ) {
            Y3().setVisibility(8);
            return;
        }
        C25771A9n c25771A9n = (C25771A9n) Y3().findViewById(R.id.mxv);
        o.LJIIIIZZ(c25771A9n, "contentView.userCardLayout");
        Aweme aweme2 = item.getAweme();
        if (aweme2 != null && (author2 = aweme2.getAuthor()) != null) {
            str2 = author2.getSecUid();
        } else {
            str2 = null;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        Aweme aweme3 = item.getAweme();
        if (aweme3 != null && (author = aweme3.getAuthor()) != null && (uid = author.getUid()) != null) {
            str3 = uid;
        }
        String str4 = item.mEventType;
        if (str4 != null) {
            View findViewById = c25771A9n.findViewById(R.id.iuo);
            if (findViewById != null) {
                findViewById.setBackground(null);
            }
            if (!this.LLFFF) {
                this.LLFFF = true;
                C98J.LIZ(c25771A9n, null, C212428Vi.LIZLLL(this), new AqS0S3000000_9(str4, str3, str2, 1), 1);
                c25771A9n.W7(this);
            } else {
                c25771A9n.reset();
                C98M.LIZ(c25771A9n, null, str2, str3, 1);
                c25771A9n.LJLIL.LJJLIIIJJIZ(new AqS29S1000000_4(str3, 33));
            }
        }
        Y3().setVisibility(8);
    }

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        VideoUserCardVM p4 = p4();
        p4.getClass();
        if (abstractC57828Mmm instanceof C57830Mmo) {
            int i = p4.LJLLILLLL + 1;
            p4.LJLLILLLL = i;
            if (i == p4.LJLLI) {
                XKX.LIZLLL(p4.getAssemVMScope(), null, null, new AAD(p4, null), 3);
            }
            Keva keva = RecMoreExperiment.LIZJ;
            keva.storeInt(RecMoreExperiment.LJFF(), 0);
            keva.storeInt(RecMoreExperiment.LJ(), -1);
            C221018lt.LJFF("RecMore", "reset video rec user!");
            return;
        }
        if (!(abstractC57828Mmm instanceof C57831Mmp)) {
            return;
        }
        p4.LJLLILLLL--;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d5);
        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        view.setBackground(c110614Vt.LIZ(context));
        View findViewById = Y3().findViewById(R.id.bf_);
        o.LJIIIIZZ(findViewById, "contentView.closeIconView");
        C16880lQ.LJIIJ(new IDaS490S0100000_13(this, 1), findViewById);
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
        VideoUserCardVM p4 = p4();
        p4.getClass();
        p4.withState(new AqS144S0200000_13(state, p4, 42));
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    public final void q4(boolean z, boolean z2) {
        float f;
        int i;
        long j;
        View Y3 = Y3();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        Y3.setAlpha(f);
        View Y32 = Y3();
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        Y32.setVisibility(i);
        View containerView = getContainerView();
        if (!z) {
            i2 = 8;
        }
        containerView.setVisibility(i2);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLI.LIZ(this, LLII[1]);
        boolean z3 = !z;
        if (z2) {
            j = 150;
        } else {
            j = -1;
        }
        assemViewModel.getClass();
        assemViewModel.setStateImmediate(new C210548Oc(z3, j));
    }
}
