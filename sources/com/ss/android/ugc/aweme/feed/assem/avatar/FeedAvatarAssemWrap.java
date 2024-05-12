package com.ss.android.ugc.aweme.feed.assem.avatar;

import X.AnonymousClass872;
import X.AnonymousClass873;
import X.AnonymousClass875;
import X.AnonymousClass877;
import X.C202457x3;
import X.C214348b8;
import X.C221108m2;
import X.C241249dQ;
import X.C243099gP;
import X.C243109gQ;
import X.C54838Lfe;
import X.C59251NNf;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C79004UzY;
import X.C8T7;
import X.C8VR;
import X.C8YN;
import X.C9Z2;
import X.DSW;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class FeedAvatarAssemWrap extends BaseCellSlotComponent<FeedAvatarAssemWrap> implements ComponentPriorityProtocol {
    public static final C9Z2 LLII;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public final C62822Ol8 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public AnonymousClass872 LLI;
    public final C62822Ol8 LLIFFJFJJ;

    static {
        TBT tbt = new TBT(FeedAvatarAssemWrap.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt};
        LLII = new C9Z2();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "right_container_avatar";
    }

    public FeedAvatarAssemWrap() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 286));
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RightAreaContainerVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 287), null, AnonymousClass875.INSTANCE, null, null);
        this.LLIFFJFJJ = C221108m2.LIZIZ(AnonymousClass877.LJLIL);
    }

    public final boolean q4() {
        return ((Boolean) this.LLIFFJFJJ.getValue()).booleanValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int W3() {
        if (C79004UzY.LJJIJIIJI(getContext())) {
            return R.layout.ac_;
        }
        return R.layout.acg;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void N3(View view) {
        o.LJIIIZ(view, "view");
        if (q4()) {
            C8VR.LIZ(this, new AqS169S0100000_3(this, 847));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        AnonymousClass872 anonymousClass872;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!q4()) {
            C8VR.LIZ(this, new AqS169S0100000_3(this, 847));
        }
        Context context = getContext();
        if (context != null && !C79004UzY.LJJIJIIJI(context)) {
            anonymousClass872 = new AnonymousClass872();
        } else {
            anonymousClass872 = new AnonymousClass872() { // from class: X.871
                public final C62822Ol8 LJIILJJIL = C221108m2.LIZIZ(AnonymousClass874.LJLIL);
                public final int LJIILL = C7MY.LIZIZ(30);

                public final int LIZLLL() {
                    return ((Number) this.LJIILJJIL.getValue()).intValue();
                }

                {
                    this.LIZ = false;
                }

                @Override // X.AnonymousClass872
                public final void LIZJ(C202067wQ itemSize) {
                    ViewGroup.LayoutParams layoutParams;
                    o.LJIIIZ(itemSize, "itemSize");
                    if (C217628gQ.LIZIZ.LJFF()) {
                        return;
                    }
                    View view2 = this.LIZJ;
                    if (view2 != null) {
                        view2.getLayoutParams().width = -2;
                        C26338AVi.LJI(view2, C65429Pm5.LIZIZ(itemSize.LJLJI), null, C65429Pm5.LIZIZ(itemSize.LJLJJI), null, false, 26);
                    }
                    View view3 = this.LJFF;
                    if (view3 != null) {
                        g0.LJJIJIIJI(C278817o.LIZ(itemSize.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLIL))), view3);
                        C26338AVi.LJI(view3, null, 0, null, null, false, 29);
                    }
                    LIZ(new AqS169S0100000_3(itemSize, 692));
                    View view4 = this.LIZLLL;
                    if (view4 != null) {
                        int i = this.LJIILL;
                        g0.LJJIJIIJI(i, i, view4);
                        C26338AVi.LJI(view4, null, Integer.valueOf(((C278817o.LIZ(itemSize.LJLIL) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLILLLLZI)))) / 2) + (C278817o.LIZ(itemSize.LJLILLLLZI) - (LIZLLL() / 2))), null, null, false, 29);
                        View findViewById = view4.findViewById(R.id.dke);
                        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null && layoutParams.height > 0) {
                            C26338AVi.LJIIIZ(view4, null, null, null, Integer.valueOf(this.LJIILL - findViewById.getLayoutParams().height), 23);
                        } else {
                            C26338AVi.LJIIIZ(view4, null, null, null, Integer.valueOf((this.LJIILL - LIZLLL()) - ((C278817o.LIZ(itemSize.LJLIL) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(itemSize.LJLILLLLZI)))) / 2)), 23);
                        }
                    }
                    View view5 = this.LJ;
                    if (view5 != null) {
                        g0.LJJIJIIJI(LIZLLL(), LIZLLL(), view5);
                    }
                }
            };
        }
        this.LLI = anonymousClass872;
        anonymousClass872.LIZIZ = getContainerView();
        anonymousClass872.LIZJ = view;
        anonymousClass872.LJFF = view.findViewById(R.id.abt);
        View findViewById = view.findViewById(R.id.my0);
        anonymousClass872.LJI = findViewById;
        DSW.LJLIL.LJLIL(findViewById);
        anonymousClass872.LJII = Y3().findViewById(R.id.my7);
        anonymousClass872.LJIIIIZZ = view.findViewById(R.id.i_k);
        anonymousClass872.LJIIIZ = Y3().findViewById(R.id.myc);
        anonymousClass872.LJIIJ = view.findViewById(R.id.abw);
        anonymousClass872.LIZLLL = view.findViewById(R.id.dk7);
        anonymousClass872.LJ = view.findViewById(R.id.djm);
        anonymousClass872.LJIIJJI = Y3().findViewById(R.id.dfe);
        anonymousClass872.LJIIL = getContainerView().findViewById(R.id.myb);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.LIZ(this, LLIIII[0]), new TBT() { // from class: X.7z4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C203457yf) obj).LJLILLLLZI;
            }
        }, null, AnonymousClass873.LJLIL, 6);
    }

    @Override // X.C8XO
    /* renamed from: r4, reason: merged with bridge method [inline-methods] */
    public void F0(VideoItemParams item) {
        User author;
        Integer valueOf;
        o.LJIIIZ(item, "item");
        if (C202457x3.LIZ) {
            String aid = item.getAweme().getAid();
            o.LJIIIIZZ(aid, "item.aweme.aid");
            C243099gP LIZJ = C243109gQ.LIZJ(aid, "avatar");
            if (LIZJ != null) {
                LIZJ.LIZ("FeedAvatarAssemWrap.onBind");
            }
        }
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            if (!q4()) {
                C8VR.LIZJ(this, C65352Pkq.LIZ(FeedAvatarDefaultAssem.class));
            }
            Aweme aweme = item.getAweme();
            if (aweme != null) {
                boolean LJ = o.LJ(item.mEventType, "homepage_popular");
                boolean LJ2 = o.LJ(item.mEventType, "homepage_nearby");
                LLII.getClass();
                if (!C59251NNf.LIZIZ(3, aweme) && C9Z2.LIZ(aweme) && !LJ && !LJ2) {
                    C8VR.LIZJ(this, C65352Pkq.LIZ(FeedAvatarLiveAssem.class));
                }
                if (!C54838Lfe.LJIIZILJ(aweme) && (author = item.getAweme().getAuthor()) != null && (valueOf = Integer.valueOf(author.getStoryStatus())) != null && valueOf.intValue() == 1 && ((o.LJ(item.mEventType, "homepage_hot") || o.LJ(item.mEventType, "homepage_follow") || o.LJ(item.mEventType, "homepage_nearby") || o.LJ(item.mEventType, "homepage_friends")) && (!C9Z2.LIZ(aweme) || o.LJ(item.mEventType, "homepage_nearby")))) {
                    C8VR.LIZJ(this, C65352Pkq.LIZ(FeedAvatarSocialPublishAssem.class));
                }
            }
        }
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
    }
}
