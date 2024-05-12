package com.ss.android.ugc.feed.platform.container.info;

import X.C210608Oi;
import X.C210628Ok;
import X.C211128Qi;
import X.C214348b8;
import X.C221108m2;
import X.C241249dQ;
import X.C2K0;
import X.C51029K0z;
import X.C55096Ljo;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8ON;
import X.C8SG;
import X.C91K;
import X.EnumC210578Of;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.AvoidUpvoteViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.service.HideVideoTagAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedInfoTagAreaContainer extends BaseContainer implements FeedInfoTagAreaContainerAbility, HideVideoTagAbility, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final EnumC210578Of LLIFFJFJJ;

    static {
        TBT tbt = new TBT(FeedInfoTagAreaContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(FeedInfoTagAreaContainer.class, "avoidUpvoteVM", "getAvoidUpvoteVM()Lcom/ss/android/ugc/aweme/feed/adapter/AvoidUpvoteViewModel;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1456181304 || hashCode == 1903035257) {
            return this;
        }
        return null;
    }

    public FeedInfoTagAreaContainer() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ConstraintSizeVM.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1317), null, C210628Ok.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(AvoidUpvoteViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS153S0100000_3(LIZ2, 1318), null, C210608Oi.INSTANCE, null, null);
        this.LLFZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1320));
        this.LLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1319));
        this.LLIFFJFJJ = EnumC210578Of.FEED_INFO_TAG_AREA_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final void e4() {
        super.e4();
        Object LIZ = this.LLFFF.LIZ(this, LLII[0]);
        View containerView = getContainerView();
        LIZ.getClass();
        ConstraintSizeVM.nv0(R.id.n90, C8ON.LIZ(), containerView);
    }

    @Override // com.ss.android.ugc.feed.platform.service.HideVideoTagAbility
    public final void hide() {
        dj(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLIFFJFJJ;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.container.info.FeedInfoTagAreaContainerAbility
    public final void dj(Aweme aweme) {
        boolean z;
        boolean z2 = true;
        int i = 0;
        if (aweme != null && aweme.getReplaceRecTagByRepost() && 1 != 0) {
            getContainerView().setVisibility(8);
            return;
        }
        boolean LJIL = C8SG.LIZIZ.LJIL(aweme);
        boolean LIZJ = C211128Qi.LIZIZ.LIZJ(aweme);
        boolean LIZIZ = C91K.LIZIZ.LIZIZ(aweme);
        if (LJIL || LIZJ || LIZIZ) {
            getContainerView().setVisibility(0);
            return;
        }
        View view = (View) this.LLI.getValue();
        if (view != null && view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        ViewGroup viewGroup = (ViewGroup) this.LLFZ.getValue();
        if ((viewGroup instanceof ViewGroup) && viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    if (viewGroup.getChildAt(i2).getVisibility() == 0) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    z2 = z;
                    break;
                }
            }
            z = z2;
        }
        View containerView = getContainerView();
        if (!z) {
            i = 8;
        }
        containerView.setVisibility(i);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        dj(item.getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.container.info.FeedInfoTagAreaContainerAbility
    public final void ov(Boolean bool) {
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            AssemViewModel assemViewModel = (AssemViewModel) this.LLFII.LIZ(this, LLII[1]);
            assemViewModel.getClass();
            assemViewModel.setStateImmediate(new AqS8S0010000_3(booleanValue, 50));
        }
    }
}
