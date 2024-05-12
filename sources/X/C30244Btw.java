package X;

import Y.AObserverS69S0200000_5;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.dataChannel.ShowAudienceInteractionFeatureToolbarChannel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Btw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30244Btw implements InterfaceC30266BuI {
    public final C30252Bu4 LIZ;
    public final java.util.Set<EnumC30241Btt> LIZIZ = new LinkedHashSet();
    public final java.util.Set<EnumC30241Btt> LIZJ = new LinkedHashSet();
    public final java.util.Set<EnumC30241Btt> LIZLLL = new LinkedHashSet();
    public final List<EnumC30241Btt> LJ = C47261Igj.LJJIJIIJI(EnumC30241Btt.MULTIGUEST, EnumC30241Btt.QUESTION, EnumC30241Btt.CUSTOM_POLL);

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ() {
        if (this.LIZIZ.size() > 5 && this.LIZLLL.size() > 1) {
            for (Object obj : ORZ.LLIL(this.LIZLLL)) {
                if (this.LIZIZ.size() >= 5) {
                    this.LIZIZ.remove(obj);
                    this.LIZJ.add(obj);
                }
            }
            if (this.LIZJ.isEmpty()) {
                this.LIZIZ.remove(EnumC30241Btt.AUDIENCE_INTERACTION_FEATURES);
            } else {
                this.LIZIZ.add(EnumC30241Btt.AUDIENCE_INTERACTION_FEATURES);
            }
        }
        if (this.LIZIZ.size() < 5 || this.LIZJ.size() == 1) {
            java.util.Set<EnumC30241Btt> set = this.LIZLLL;
            o.LJIIIZ(set, "<this>");
            for (Object obj2 : ORZ.LLILII(C32064CiC.LJLIL, set)) {
                if (this.LIZIZ.size() < 5) {
                    this.LIZJ.remove(obj2);
                    this.LIZIZ.add(obj2);
                }
            }
            if (this.LIZJ.isEmpty()) {
                this.LIZIZ.remove(EnumC30241Btt.AUDIENCE_INTERACTION_FEATURES);
            } else if (this.LIZJ.size() == 1) {
                this.LIZIZ.addAll(this.LIZJ);
                this.LIZIZ.remove(EnumC30241Btt.AUDIENCE_INTERACTION_FEATURES);
                this.LIZJ.clear();
            } else {
                this.LIZIZ.add(EnumC30241Btt.AUDIENCE_INTERACTION_FEATURES);
            }
        }
        if (this.LIZJ.isEmpty()) {
            TBViewModel viewModel = EnumC30241Btt.AUDIENCE_INTERACTION_FEATURES.getViewModel(this.LIZ.LIZJ);
            if (viewModel != null) {
                viewModel.hv0(false, false);
            }
            this.LIZ.LIZJ.rv0(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.FALSE);
        } else {
            Iterator<EnumC30241Btt> it = this.LIZJ.iterator();
            while (it.hasNext()) {
                TBViewModel viewModel2 = it.next().getViewModel(this.LIZ.LIZJ);
                if (viewModel2 != null) {
                    viewModel2.hv0(false, false);
                }
            }
            TBViewModel viewModel3 = EnumC30241Btt.AUDIENCE_INTERACTION_FEATURES.getViewModel(this.LIZ.LIZJ);
            if (viewModel3 != null) {
                viewModel3.hv0(true, false);
            }
            this.LIZ.LIZJ.rv0(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.TRUE);
        }
        Iterator<EnumC30241Btt> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            TBViewModel viewModel4 = it2.next().getViewModel(this.LIZ.LIZJ);
            if (viewModel4 != null) {
                viewModel4.hv0(true, false);
            }
        }
    }

    public C30244Btw(C30252Bu4 c30252Bu4) {
        this.LIZ = c30252Bu4;
    }

    @Override // X.InterfaceC30266BuI
    public final boolean LIZ(EnumC30241Btt enumC30241Btt) {
        return this.LIZJ.contains(enumC30241Btt);
    }

    @Override // X.InterfaceC30266BuI
    public final void LIZIZ(EnumC30241Btt button, TBViewModel tBViewModel) {
        o.LJIIIZ(button, "button");
        tBViewModel.LJLJL.observe(this.LIZ.LIZIZ, new AObserverS69S0200000_5((Object) this, (User) button, (InterfaceC88472Yns<? super User, C76800UCe>) 39));
    }
}
