package com.ss.android.ugc.aweme.explore.vm;

import X.A2G;
import X.A2I;
import X.ActivityC45651qj;
import X.C2050482y;
import X.C207098Av;
import X.C214188as;
import X.C33Q;
import X.C42625Go9;
import X.C50420Jqa;
import X.C54047LJb;
import X.C55045Liz;
import X.C55096Ljo;
import X.C78404Ups;
import X.C8AS;
import X.C8AY;
import X.C8DG;
import X.C8HZ;
import X.InterfaceC225058sP;
import X.InterfaceC36571c5;
import X.InterfaceC55235Lm3;
import X.InterfaceC67352kd;
import X.ORZ;
import X.QD3;
import X.SZP;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExploreFeedListViewModel extends AssemListViewModel<C8AS, C2050482y, C8AY> {
    public static final /* synthetic */ int LJLJJL = 0;
    public A2G<C8AY> LJLIL;
    public Aweme LJLILLLLZI;
    public boolean LJLJI;
    public final C214188as LJLJJI = C78404Ups.LIZJ(this, C207098Av.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C8AS(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C42625Go9.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C42625Go9.LIZIZ(this);
    }

    public final void hv0(String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        withState(new AqS57S1100000_3(enterMethod, this, 7));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C2050482y> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 116));
    }

    @QD3
    public final void onDeleteAwemeEvent(C55045Liz event) {
        o.LJIIIZ(event, "event");
        withState(new AqS134S0200000_3(this, event, 48));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C8AY>> interfaceC67352kd) {
        return gv0(true, interfaceC67352kd);
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        String str;
        String str2;
        Aweme aweme;
        InterfaceC36571c5 interfaceC36571c5;
        InterfaceC225058sP interfaceC225058sP;
        InterfaceC55235Lm3 ul;
        IMFPubAbility iMFPubAbility;
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        if (i != 2) {
            if (i != 13) {
                if (i != 15) {
                    return;
                }
                Object obj = event.LJLILLLLZI;
                if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || !aweme.isPhotoMode()) {
                    return;
                }
                C54047LJb c54047LJb = C54047LJb.LIZIZ;
                PublishModel publishModel = event.LJZ;
                o.LJIIIIZZ(publishModel, "event.publishModel");
                if (!c54047LJb.LJFF(publishModel)) {
                    return;
                }
                this.LJLILLLLZI = aweme;
                if (!AVExternalServiceImpl.LIZ().publishService().isPublishing() && C8DG.LIZ()) {
                    ActivityC45651qj activityC45651qj = C8DG.LJLILLLLZI;
                    if (activityC45651qj != null) {
                        interfaceC36571c5 = Hox.LJLLI.LIZ(activityC45651qj).Ja("HOME");
                    } else {
                        interfaceC36571c5 = null;
                    }
                    if ((interfaceC36571c5 instanceof InterfaceC225058sP) && (interfaceC225058sP = (InterfaceC225058sP) interfaceC36571c5) != null && (ul = interfaceC225058sP.ul()) != null && (iMFPubAbility = (IMFPubAbility) C55096Ljo.LIZ(ul, IMFPubAbility.class, null)) != null) {
                        iMFPubAbility.vv(1);
                    }
                }
                AwemeService.LIZ().R1(aweme);
                hv0("publish_landing");
                return;
            }
            Object obj2 = event.LJLILLLLZI;
            if (!(obj2 instanceof String) || (str2 = (String) obj2) == null || str2.length() == 0) {
                return;
            }
            withState(new AqS57S1100000_3(str2, this, 6));
            return;
        }
        Object obj3 = event.LJLILLLLZI;
        if (!(obj3 instanceof String) || (str = (String) obj3) == null || str.length() == 0) {
            return;
        }
        withState(new AqS57S1100000_3(str, this, 39));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: Exception -> 0x0163, TryCatch #1 {Exception -> 0x0163, blocks: (B:11:0x0059, B:12:0x005c, B:14:0x0062, B:17:0x0073, B:19:0x0077, B:21:0x00b6, B:22:0x007d, B:24:0x008e, B:26:0x0094, B:28:0x00a5, B:31:0x00c3, B:37:0x00cf, B:39:0x00d5, B:40:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x0107, B:47:0x010a, B:49:0x0153, B:50:0x015d, B:52:0x0151, B:53:0x010b, B:55:0x0111, B:56:0x011f, B:58:0x0125, B:60:0x012d, B:62:0x0143, B:63:0x0146, B:65:0x0149, B:66:0x0147), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073 A[Catch: Exception -> 0x0163, TryCatch #1 {Exception -> 0x0163, blocks: (B:11:0x0059, B:12:0x005c, B:14:0x0062, B:17:0x0073, B:19:0x0077, B:21:0x00b6, B:22:0x007d, B:24:0x008e, B:26:0x0094, B:28:0x00a5, B:31:0x00c3, B:37:0x00cf, B:39:0x00d5, B:40:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x0107, B:47:0x010a, B:49:0x0153, B:50:0x015d, B:52:0x0151, B:53:0x010b, B:55:0x0111, B:56:0x011f, B:58:0x0125, B:60:0x012d, B:62:0x0143, B:63:0x0146, B:65:0x0149, B:66:0x0147), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[Catch: Exception -> 0x0163, TryCatch #1 {Exception -> 0x0163, blocks: (B:11:0x0059, B:12:0x005c, B:14:0x0062, B:17:0x0073, B:19:0x0077, B:21:0x00b6, B:22:0x007d, B:24:0x008e, B:26:0x0094, B:28:0x00a5, B:31:0x00c3, B:37:0x00cf, B:39:0x00d5, B:40:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x0107, B:47:0x010a, B:49:0x0153, B:50:0x015d, B:52:0x0151, B:53:0x010b, B:55:0x0111, B:56:0x011f, B:58:0x0125, B:60:0x012d, B:62:0x0143, B:63:0x0146, B:65:0x0149, B:66:0x0147), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b A[Catch: Exception -> 0x0163, TryCatch #1 {Exception -> 0x0163, blocks: (B:11:0x0059, B:12:0x005c, B:14:0x0062, B:17:0x0073, B:19:0x0077, B:21:0x00b6, B:22:0x007d, B:24:0x008e, B:26:0x0094, B:28:0x00a5, B:31:0x00c3, B:37:0x00cf, B:39:0x00d5, B:40:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x0107, B:47:0x010a, B:49:0x0153, B:50:0x015d, B:52:0x0151, B:53:0x010b, B:55:0x0111, B:56:0x011f, B:58:0x0125, B:60:0x012d, B:62:0x0143, B:63:0x0146, B:65:0x0149, B:66:0x0147), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(boolean r15, X.InterfaceC67352kd<? super X.A2G<X.C8AY>> r16) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel.gv0(boolean, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C8AY c8ay, InterfaceC67352kd<? super A2G<C8AY>> interfaceC67352kd) {
        return gv0(false, interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<C2050482y> onLoadPageAddData(SZP type, List<C2050482y> originItem, List<C2050482y> newData) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(originItem, "originItem");
        o.LJIIIZ(newData, "newData");
        List<C2050482y> onLoadPageAddData = super.onLoadPageAddData(type, originItem, newData);
        if (type == SZP.Refresh && newData.isEmpty() && (this.LJLIL instanceof A2I)) {
            return ORZ.LLJILJILJ(originItem);
        }
        return onLoadPageAddData;
    }
}
