package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.C03150Al;
import X.C03200Aq;
import X.C113554cx;
import X.C221018lt;
import X.C3C1;
import X.C47261Igj;
import X.C53710L6c;
import X.C54526Lac;
import X.C55248LmG;
import X.C55252LmK;
import X.C56759MPj;
import X.C56811MRj;
import X.C57430MgM;
import X.C57581Min;
import X.C57819Mmd;
import X.C57826Mmk;
import X.C57859MnH;
import X.C57867MnP;
import X.C76800UCe;
import X.EnumC53719L6l;
import X.EnumC54527Lad;
import X.EnumC57366MfK;
import X.InterfaceC65784Pro;
import X.InterfaceC80653En;
import X.InterfaceC88472Yns;
import X.L6Y;
import X.MCI;
import X.MCK;
import X.MSU;
import X.MT7;
import X.MUB;
import X.ORZ;
import X.OSZ;
import X.X1D;
import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class AqS69S0400000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS69S0400000_9 aqS69S0400000_9) {
        ((CreatorNoticeResultVM) aqS69S0400000_9.l0).pv0(new C3C1(new MUB()), (AbstractC72932td) aqS69S0400000_9.l1, (MT7) aqS69S0400000_9.l2, (NoticeTabModel) aqS69S0400000_9.l3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS69S0400000_9 aqS69S0400000_9) {
        String type;
        boolean z;
        C57867MnP c57867MnP;
        C57859MnH config;
        if (((C57819Mmd) aqS69S0400000_9.l0).LJ) {
            type = EnumC57366MfK.POP_UP.getType();
        } else {
            type = EnumC57366MfK.CARD.getType();
        }
        C57819Mmd c57819Mmd = (C57819Mmd) aqS69S0400000_9.l0;
        String str = c57819Mmd.LIZ;
        String str2 = c57819Mmd.LIZIZ;
        String str3 = c57819Mmd.LIZJ;
        String str4 = c57819Mmd.LIZLLL;
        int imprOrder = ((RecUser) aqS69S0400000_9.l1).getImprOrder();
        C57826Mmk c57826Mmk = (C57826Mmk) ((AbsRecUserCell) aqS69S0400000_9.l2).getItem();
        if (c57826Mmk != null) {
            z = c57826Mmk.LJLJJI;
        } else {
            z = false;
        }
        C57819Mmd c57819Mmd2 = (C57819Mmd) aqS69S0400000_9.l0;
        int i = c57819Mmd2.LJII;
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("source_page", c57819Mmd2.LJIIIZ));
        C57819Mmd c57819Mmd3 = (C57819Mmd) aqS69S0400000_9.l0;
        String str5 = c57819Mmd3.LJIIIZ;
        String str6 = c57819Mmd3.LJFF;
        RecUser recUser = (RecUser) aqS69S0400000_9.l1;
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) aqS69S0400000_9.l3;
        if (iUserCardListAbility != null && (config = iUserCardListAbility.getConfig()) != null) {
            c57867MnP = config.getListConfig();
        } else {
            c57867MnP = null;
        }
        boolean LIZLLL = C57581Min.LIZLLL(recUser, c57867MnP);
        C57819Mmd c57819Mmd4 = (C57819Mmd) aqS69S0400000_9.l0;
        return new C57430MgM(str, (RecUser) aqS69S0400000_9.l1, str2, null, str3, str4, Integer.valueOf(imprOrder), null, null, null, type, null, null, str6, null, null, null, 0, 0, null, i, z, null, null, null, c57819Mmd4.LJIIJ, c57819Mmd4.LJIIJJI, null, null, null, null, null, null, 0, null, Boolean.valueOf(LIZLLL), LJJLIIIIJ, str5, -408953976, 63);
    }

    public static final Object invoke$2(AqS69S0400000_9 aqS69S0400000_9) {
        C03150Al LIZ = C03200Aq.LIZ(new C56811MRj((List) aqS69S0400000_9.l0, (List) aqS69S0400000_9.l1), true);
        ((MSU) aqS69S0400000_9.l2).getData().clear();
        ((MSU) aqS69S0400000_9.l2).getData().addAll((List) aqS69S0400000_9.l1);
        LIZ.LIZJ((MSU) aqS69S0400000_9.l2);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS69S0400000_9.l3;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS69S0400000_9 aqS69S0400000_9) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start bind source: ");
        LIZ.append((C55252LmK) aqS69S0400000_9.l0);
        LIZ.append(", key: ");
        LIZ.append((C55248LmG) aqS69S0400000_9.l1);
        LIZ.append(", data: ");
        LIZ.append((InterfaceC80653En) aqS69S0400000_9.l2);
        LIZ.append(", clz: ");
        LIZ.append((Class) aqS69S0400000_9.l3);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$4(AqS69S0400000_9 aqS69S0400000_9) {
        EnumC54527Lad enumC54527Lad = (EnumC54527Lad) aqS69S0400000_9.l0;
        C54526Lac.LIZ(enumC54527Lad, (List) ((LinkedHashMap) C54526Lac.LIZIZ).get(enumC54527Lad), (InterfaceC88472Yns) aqS69S0400000_9.l1, (InterfaceC88472Yns) aqS69S0400000_9.l2, (InterfaceC88472Yns) aqS69S0400000_9.l3);
        C54526Lac.LIZLLL = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS69S0400000_9 aqS69S0400000_9) {
        List LLJILJILJ = ORZ.LLJILJILJ((List) aqS69S0400000_9.l0);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS69S0400000_9.l1;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LLJILJILJ).iterator();
        while (it.hasNext()) {
            Object invoke = interfaceC88472Yns.invoke(it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((User) next).getUid())) {
                arrayList2.add(next);
            }
        }
        L6Y l6y = (L6Y) aqS69S0400000_9.l2;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            User user = (User) it3.next();
            C53710L6c LIZ = l6y.LJLJJI.LIZ(user);
            C47261Igj.LJJJJLI(LIZ, Boolean.FALSE, Long.valueOf(System.currentTimeMillis()));
            String uid = user.getUid();
            if (uid != null) {
                l6y.N(uid, LIZ, Boolean.TRUE);
            }
        }
        ((L6Y) aqS69S0400000_9.l2).LJLJJI.LJIIIIZZ(arrayList2, (EnumC53719L6l) aqS69S0400000_9.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS69S0400000_9 aqS69S0400000_9) {
        C03150Al LIZ = C03200Aq.LIZ(new C56811MRj((List) aqS69S0400000_9.l0, (List) aqS69S0400000_9.l1), true);
        if (!((C56759MPj) aqS69S0400000_9.l2).LJLJJL) {
            ((C56759MPj) aqS69S0400000_9.l2).getData().clear();
            ((C56759MPj) aqS69S0400000_9.l2).getData().addAll((List) aqS69S0400000_9.l1);
            LIZ.LIZJ((C56759MPj) aqS69S0400000_9.l2);
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS69S0400000_9.l3;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } else {
            C221018lt.LIZIZ("NotificationAdapter", "submitListByDiffer but data changed again");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS69S0400000_9 aqS69S0400000_9) {
        MCK mck = (MCK) aqS69S0400000_9.l0;
        MCK other = MCI.LIZ;
        mck.getClass();
        o.LJIIIZ(other, "other");
        if (o.LJ(mck.LJFF, other.LJFF)) {
            ((AppWidgetManager) aqS69S0400000_9.l1).updateAppWidget((int[]) aqS69S0400000_9.l2, (RemoteViews) aqS69S0400000_9.l3);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS69S0400000_9(AbstractC72932td abstractC72932td, MT7 mt7, NoticeTabModel noticeTabModel, CreatorNoticeResultVM creatorNoticeResultVM, int i) {
        super(0);
        this.$t = i;
        this.l0 = creatorNoticeResultVM;
        this.l1 = abstractC72932td;
        this.l2 = mt7;
        this.l3 = noticeTabModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS69S0400000_9(EnumC54527Lad enumC54527Lad, EnumC54527Lad enumC54527Lad2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns3) {
        super(0);
        this.$t = interfaceC88472Yns3;
        this.l0 = enumC54527Lad;
        this.l1 = enumC54527Lad2;
        this.l2 = interfaceC88472Yns;
        this.l3 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS69S0400000_9(C55252LmK c55252LmK, C55252LmK c55252LmK2, C55248LmG c55248LmG, T t, Class<T> cls) {
        super(0);
        this.$t = cls;
        this.l0 = c55252LmK;
        this.l1 = c55252LmK2;
        this.l2 = c55248LmG;
        this.l3 = t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS69S0400000_9(MCK mck, AppWidgetManager appWidgetManager, int[] iArr, RemoteViews remoteViews, int i) {
        super(0);
        this.$t = i;
        this.l0 = mck;
        this.l1 = appWidgetManager;
        this.l2 = iArr;
        this.l3 = remoteViews;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS69S0400000_9(C57819Mmd c57819Mmd, C57819Mmd c57819Mmd2, RecUser recUser, AbsRecUserCell<ITEM> absRecUserCell, IUserCardListAbility iUserCardListAbility) {
        super(0);
        this.$t = iUserCardListAbility;
        this.l0 = c57819Mmd;
        this.l1 = c57819Mmd2;
        this.l2 = recUser;
        this.l3 = absRecUserCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS69S0400000_9(List list, List<Object> list2, InterfaceC88472Yns<Object, ? extends User> interfaceC88472Yns, L6Y l6y, EnumC53719L6l enumC53719L6l) {
        super(0);
        this.$t = enumC53719L6l;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = interfaceC88472Yns;
        this.l3 = l6y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS69S0400000_9(List list, List list2, C56759MPj c56759MPj, AqS159S0100000_9 aqS159S0100000_9, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c56759MPj;
        this.l3 = aqS159S0100000_9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS69S0400000_9(List list, List<? extends MusNotice> list2, List<? extends MusNotice> list3, MSU msu, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
        this.l3 = msu;
    }
}
