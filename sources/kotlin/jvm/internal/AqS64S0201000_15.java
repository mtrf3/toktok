package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractDialogInterfaceC26236ARk;
import X.C35936E8m;
import X.C6DL;
import X.C6DO;
import X.C72808Sho;
import X.C76800UCe;
import X.C85531XhX;
import X.FMX;
import X.InterfaceC2064888m;
import X.InterfaceC208718Hb;
import X.InterfaceC57784Mm4;
import X.InterfaceC88472Yns;
import X.R5D;
import Y.ACListenerS39S0200000_4;
import android.view.View;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.profile.widgets.signature.BaseProfileSignatureAssem;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderSignatureTranslationComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes16.dex */
public class AqS64S0201000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS64S0201000_15 aqS64S0201000_15, Object obj) {
        InterfaceC208718Hb it = (InterfaceC208718Hb) obj;
        o.LJIIIZ(it, "it");
        AssemListViewModel assemListViewModel = (AssemListViewModel) aqS64S0201000_15.l0;
        C72808Sho<ITEM> c72808Sho = assemListViewModel.state;
        if (c72808Sho != 0) {
            c72808Sho.LIZLLL(aqS64S0201000_15.i2, (Collection) aqS64S0201000_15.l1);
            assemListViewModel.modifyListState((AssemListViewModel) it, (C72808Sho) c72808Sho);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS64S0201000_15 aqS64S0201000_15, Object obj) {
        InterfaceC208718Hb it = (InterfaceC208718Hb) obj;
        o.LJIIIZ(it, "it");
        AssemListViewModel assemListViewModel = (AssemListViewModel) aqS64S0201000_15.l0;
        C72808Sho<ITEM> c72808Sho = assemListViewModel.state;
        if (c72808Sho != 0) {
            c72808Sho.LIZIZ(aqS64S0201000_15.i2, (InterfaceC57784Mm4) aqS64S0201000_15.l1);
            assemListViewModel.modifyListState((AssemListViewModel) it, (C72808Sho) c72808Sho);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS64S0201000_15 aqS64S0201000_15, Object obj) {
        InterfaceC208718Hb it = (InterfaceC208718Hb) obj;
        o.LJIIIZ(it, "it");
        AssemListViewModel assemListViewModel = (AssemListViewModel) aqS64S0201000_15.l0;
        C72808Sho<ITEM> c72808Sho = assemListViewModel.state;
        if (c72808Sho != 0) {
            c72808Sho.LJIILL(aqS64S0201000_15.i2, (InterfaceC57784Mm4) aqS64S0201000_15.l1);
            assemListViewModel.modifyListState((AssemListViewModel) it, (C72808Sho) c72808Sho);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS64S0201000_15 aqS64S0201000_15, Object obj) {
        InterfaceC2064888m it = (InterfaceC2064888m) obj;
        o.LJIIIZ(it, "it");
        ((AssemSingleListViewModel) aqS64S0201000_15.l0).modifyListState(it, new AqS102S0101000_15(aqS64S0201000_15.i2, (int) aqS64S0201000_15.l1, (Collection<Object>) 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS64S0201000_15 aqS64S0201000_15, Object obj) {
        InterfaceC2064888m it = (InterfaceC2064888m) obj;
        o.LJIIIZ(it, "it");
        ((AssemSingleListViewModel) aqS64S0201000_15.l0).modifyListState(it, new AqS102S0101000_15(aqS64S0201000_15.i2, (int) aqS64S0201000_15.l1, (Object) 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS64S0201000_15 aqS64S0201000_15, Object obj) {
        InterfaceC2064888m it = (InterfaceC2064888m) obj;
        o.LJIIIZ(it, "it");
        ((AssemSingleListViewModel) aqS64S0201000_15.l0).modifyListState(it, new AqS102S0101000_15(aqS64S0201000_15.i2, (int) aqS64S0201000_15.l1, (Object) 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS64S0201000_15 aqS64S0201000_15, Object obj) {
        C6DL actions = (C6DL) obj;
        o.LJIIIZ(actions, "$this$actions");
        C6DO c6do = new C6DO();
        int i = aqS64S0201000_15.i2;
        BaseProfileSignatureAssem baseProfileSignatureAssem = (BaseProfileSignatureAssem) aqS64S0201000_15.l0;
        View view = (View) aqS64S0201000_15.l1;
        c6do.LIZ = R.raw.icon_languages;
        c6do.LIZIZ = R.attr.dj;
        c6do.LIZJ = i;
        c6do.LJ = R.attr.dj;
        c6do.LJFF = new ACListenerS39S0200000_4(baseProfileSignatureAssem, view, 31);
        ((ArrayList) actions.LIZIZ).add(c6do);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS64S0201000_15 aqS64S0201000_15, Object obj) {
        C6DL actions = (C6DL) obj;
        o.LJIIIZ(actions, "$this$actions");
        C6DO c6do = new C6DO();
        int i = aqS64S0201000_15.i2;
        ProfileHeaderSignatureTranslationComponent profileHeaderSignatureTranslationComponent = (ProfileHeaderSignatureTranslationComponent) aqS64S0201000_15.l0;
        View view = (View) aqS64S0201000_15.l1;
        c6do.LIZ = R.raw.icon_languages;
        c6do.LIZIZ = R.attr.dj;
        c6do.LIZJ = i;
        c6do.LJ = R.attr.dj;
        c6do.LJFF = new ACListenerS39S0200000_4(profileHeaderSignatureTranslationComponent, view, 76);
        ((ArrayList) actions.LIZIZ).add(c6do);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS64S0201000_15 aqS64S0201000_15, Object obj) {
        AbstractDialogInterfaceC26236ARk it = (AbstractDialogInterfaceC26236ARk) obj;
        o.LJIIIZ(it, "it");
        BaseLoginMethod method = (BaseLoginMethod) aqS64S0201000_15.l0;
        C85531XhX c85531XhX = (C85531XhX) aqS64S0201000_15.l1;
        String str = c85531XhX.LJLJI;
        String str2 = c85531XhX.LJLJJI;
        boolean LJ = o.LJ(it.LJLJL, 0);
        o.LJIIIZ(method, "method");
        C35936E8m c35936E8m = new C35936E8m();
        if (str == null) {
            str = "";
        }
        c35936E8m.LIZLLL("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c35936E8m.LIZLLL("enter_method", str2);
        c35936E8m.LIZLLL("account_type", R5D.LIZ(method));
        c35936E8m.LIZLLL("platform", R5D.LIZIZ(method));
        c35936E8m.LIZ(LJ ? 1 : 0, "is_success");
        FMX.LJIIL("oneclick_remove_account_respond", c35936E8m.LIZ);
        if (!o.LJ(it.LJLJL, 0)) {
            ((C85531XhX) aqS64S0201000_15.l1).notifyItemChanged(aqS64S0201000_15.i2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S0201000_15(int i, BaseProfileSignatureAssem baseProfileSignatureAssem, View view, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = baseProfileSignatureAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S0201000_15(int i, ProfileHeaderSignatureTranslationComponent profileHeaderSignatureTranslationComponent, View view, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = profileHeaderSignatureTranslationComponent;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS64S0201000_15(AssemListViewModel assemListViewModel, AssemListViewModel<S, ITEM, Cursor> assemListViewModel2, int i, ITEM item) {
        super(1);
        this.$t = item;
        this.l0 = assemListViewModel;
        this.i2 = assemListViewModel2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS64S0201000_15(AssemListViewModel assemListViewModel, AssemListViewModel<S, ITEM, Cursor> assemListViewModel2, int i, Collection<? extends ITEM> collection) {
        super(1);
        this.$t = collection;
        this.l0 = assemListViewModel;
        this.i2 = assemListViewModel2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS64S0201000_15(AssemSingleListViewModel assemSingleListViewModel, AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel2, int i, ITEM item) {
        super(1);
        this.$t = item;
        this.l0 = assemSingleListViewModel;
        this.i2 = assemSingleListViewModel2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS64S0201000_15(AssemSingleListViewModel assemSingleListViewModel, AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel2, int i, Collection<? extends ITEM> collection) {
        super(1);
        this.$t = collection;
        this.l0 = assemSingleListViewModel;
        this.i2 = assemSingleListViewModel2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S0201000_15(BaseLoginMethod baseLoginMethod, C85531XhX c85531XhX, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = baseLoginMethod;
        this.l1 = c85531XhX;
        this.i2 = i;
    }
}
