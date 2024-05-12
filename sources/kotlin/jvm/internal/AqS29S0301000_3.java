package kotlin.jvm.internal;

import X.A2F;
import X.A2G;
import X.A2H;
import X.A2V;
import X.ARI;
import X.AbstractC65781Prl;
import X.C178286zA;
import X.C228108xK;
import X.C29822Bn8;
import X.C32I;
import X.C3C5;
import X.C43I;
import X.C61878OQg;
import X.C76800UCe;
import X.C77321UWf;
import X.C8W0;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.M7C;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class AqS29S0301000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final Object invoke$0(AqS29S0301000_3 aqS29S0301000_3, Object obj) {
        ?? r6;
        M7C setState = (M7C) obj;
        o.LJIIIZ(setState, "$this$setState");
        List<Aweme> list = setState.LJLIL;
        if (list != null) {
            r6 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                r6.add(it.next().getAid());
            }
        } else {
            r6 = C61878OQg.INSTANCE;
        }
        List list2 = (List) aqS29S0301000_3.l0;
        List list3 = (List) aqS29S0301000_3.l1;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            if (!r6.contains(((Aweme) obj2).getAid())) {
                arrayList.add(obj2);
            }
        }
        list2.addAll(arrayList);
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) aqS29S0301000_3.l2;
        List<Aweme> list4 = setState.LJLIL;
        List list5 = (List) aqS29S0301000_3.l0;
        mixVideosViewModel.getClass();
        return M7C.LIZ(setState, MixVideosViewModel.gv0(list4, list5), null, null, aqS29S0301000_3.i3, false, 0, null, null, null, 1014);
    }

    public static final Object invoke$1(AqS29S0301000_3 aqS29S0301000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(C29822Bn8.LIZ((Context) aqS29S0301000_3.l0, R.string.did, "context.resources.getStr…mmentSheet_popUp_button1)"), new AqS54S0201000_3((Fragment) aqS29S0301000_3.l1, (Fragment) aqS29S0301000_3.i3, (int) aqS29S0301000_3.l2, (InterfaceC65784Pro<C76800UCe>) 7));
        actionGroup.LJIIIZ(C29822Bn8.LIZ((Context) aqS29S0301000_3.l0, R.string.die, "context.resources.getStr…mmentSheet_popUp_button2)"), C178286zA.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS29S0301000_3 aqS29S0301000_3, Object it) {
        o.LJIIIZ(it, "it");
        C77321UWf.LJFF((C8W0) aqS29S0301000_3.l0, aqS29S0301000_3.i3, (InterfaceC88473Ynt) aqS29S0301000_3.l1);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS29S0301000_3.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final Object invoke$3(AqS29S0301000_3 aqS29S0301000_3, Object obj) {
        ?? r6;
        M7C setState = (M7C) obj;
        o.LJIIIZ(setState, "$this$setState");
        List<Aweme> list = setState.LJLIL;
        if (list != null) {
            r6 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                r6.add(it.next().getAid());
            }
        } else {
            r6 = C61878OQg.INSTANCE;
        }
        List list2 = (List) aqS29S0301000_3.l0;
        List list3 = (List) aqS29S0301000_3.l1;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            if (!r6.contains(((Aweme) obj2).getAid())) {
                arrayList.add(obj2);
            }
        }
        list2.addAll(arrayList);
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) aqS29S0301000_3.l2;
        List list4 = (List) aqS29S0301000_3.l0;
        List<Aweme> list5 = setState.LJLIL;
        mixVideosViewModel.getClass();
        return M7C.LIZ(setState, MixVideosViewModel.gv0(list4, list5), null, null, aqS29S0301000_3.i3, false, 0, null, null, new C43I(Boolean.TRUE), 502);
    }

    public static final Object invoke$4(AqS29S0301000_3 aqS29S0301000_3, Object it) {
        o.LJIIIZ(it, "it");
        List<? extends Aweme> list = ((MixVideosResponse) aqS29S0301000_3.l0).mixVideos;
        ArrayList arrayList = new ArrayList();
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) aqS29S0301000_3.l1;
        MixVideosResponse mixVideosResponse = (MixVideosResponse) aqS29S0301000_3.l0;
        mixVideosViewModel.LJLLI = mixVideosResponse.minCursor;
        mixVideosViewModel.LJLJLLL = mixVideosResponse.hasMore;
        if (list != null) {
            mixVideosViewModel.setState(new AqS29S0301000_3((List) arrayList, (List<Aweme>) list, (List<? extends Aweme>) mixVideosViewModel, (MixVideosViewModel) aqS29S0301000_3.i3, 3));
        }
        if (((MixVideosViewModel) aqS29S0301000_3.l1).LJLJLLL) {
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) aqS29S0301000_3.l2;
            A2F a2f = A2G.LIZ;
            Long valueOf = Long.valueOf(((MixVideosResponse) aqS29S0301000_3.l0).minCursor);
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C228108xK((Aweme) it2.next()));
            }
            A2V LJ = A2F.LJ(a2f, valueOf, null, arrayList2, 2);
            C3C5.m7constructorimpl(LJ);
            interfaceC67352kd.resumeWith(LJ);
        } else {
            InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) aqS29S0301000_3.l2;
            A2F a2f2 = A2G.LIZ;
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new C228108xK((Aweme) it3.next()));
            }
            a2f2.getClass();
            A2H LIZ = A2F.LIZ(arrayList3);
            C3C5.m7constructorimpl(LIZ);
            interfaceC67352kd2.resumeWith(LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS29S0301000_3 aqS29S0301000_3, Object it) {
        o.LJIIIZ(it, "it");
        MixVideosResponse mixVideosResponse = (MixVideosResponse) aqS29S0301000_3.l0;
        List<? extends Aweme> list = mixVideosResponse.mixVideos;
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) aqS29S0301000_3.l1;
        mixVideosViewModel.LJLLILLLL = mixVideosResponse.maxCursor;
        mixVideosViewModel.LJLL = mixVideosResponse.hasMore;
        if (list != null) {
            mixVideosViewModel.setState(new AqS54S0201000_3(mixVideosViewModel, (MixVideosViewModel) list, (List<? extends Aweme>) aqS29S0301000_3.i3, 10));
        }
        MixVideosResponse mixVideosResponse2 = (MixVideosResponse) aqS29S0301000_3.l0;
        List<? extends Aweme> list2 = mixVideosResponse2.mixVideos;
        if (((MixVideosViewModel) aqS29S0301000_3.l1).LJLL) {
            if (list2 != null) {
                InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) aqS29S0301000_3.l2;
                A2F a2f = A2G.LIZ;
                Long valueOf = Long.valueOf(mixVideosResponse2.maxCursor);
                ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                Iterator<? extends Aweme> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C228108xK(it2.next()));
                }
                A2V LJ = A2F.LJ(a2f, null, valueOf, arrayList, 1);
                C3C5.m7constructorimpl(LJ);
                interfaceC67352kd.resumeWith(LJ);
            }
        } else if (list2 != null) {
            InterfaceC67352kd interfaceC67352kd2 = (InterfaceC67352kd) aqS29S0301000_3.l2;
            A2F a2f2 = A2G.LIZ;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<? extends Aweme> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new C228108xK(it3.next()));
            }
            a2f2.getClass();
            A2H LIZ = A2F.LIZ(arrayList2);
            C3C5.m7constructorimpl(LIZ);
            interfaceC67352kd2.resumeWith(LIZ);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final Object invoke$6(AqS29S0301000_3 aqS29S0301000_3, Object obj) {
        ?? r6;
        M7C setState = (M7C) obj;
        o.LJIIIZ(setState, "$this$setState");
        List<Aweme> list = setState.LJLIL;
        if (list != null) {
            r6 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                r6.add(it.next().getAid());
            }
        } else {
            r6 = C61878OQg.INSTANCE;
        }
        List list2 = (List) aqS29S0301000_3.l0;
        List list3 = (List) aqS29S0301000_3.l1;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            if (!r6.contains(((Aweme) obj2).getAid())) {
                arrayList.add(obj2);
            }
        }
        list2.addAll(arrayList);
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) aqS29S0301000_3.l2;
        List list4 = (List) aqS29S0301000_3.l0;
        List<Aweme> list5 = setState.LJLIL;
        mixVideosViewModel.getClass();
        return M7C.LIZ(setState, MixVideosViewModel.gv0(list4, list5), null, null, aqS29S0301000_3.i3, false, 0, null, null, null, 1014);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0301000_3(Context context, Fragment fragment, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = context;
        this.l1 = fragment;
        this.i3 = i;
        this.l2 = null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS29S0301000_3(int r3, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse r4, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel r5, X.InterfaceC67352kd r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 4: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.i3 = r3
            r1.l2 = r6
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r6
            r1.i3 = r3
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS29S0301000_3.<init>(int, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel, X.2kd, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS29S0301000_3(C8W0 c8w0, C8W0 c8w02, int i, InterfaceC88473Ynt<? super Integer, ? super Integer, ? super Intent, C76800UCe> interfaceC88473Ynt, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = c8w0;
        this.i3 = c8w02;
        this.l1 = i;
        this.l2 = interfaceC88473Ynt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS29S0301000_3(List list, List<Aweme> list2, List<? extends Aweme> list3, MixVideosViewModel mixVideosViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
        this.i3 = mixVideosViewModel;
    }
}
