package Y;

import X.ARV;
import X.C45631qh;
import X.C70067Reh;
import X.C70068Rei;
import X.C70282RiA;
import X.C76800UCe;
import X.EnumC58928NAu;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import X.InterfaceC73573Su9;
import X.ORZ;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidgetV2;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecListLayoutV2;
import com.ss.android.ugc.aweme.im.sdk.dmfilter.FilterKeywordsSettingFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDfS132S0100000_12 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64672gJ
    public final Object emit(Object obj, InterfaceC67352kd interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC67352kd);
            case 1:
                return emit$1(this, obj, interfaceC67352kd);
            case 2:
                return emit$2(this, obj, interfaceC67352kd);
            case 3:
                return emit$3(this, obj, interfaceC67352kd);
            case 4:
                return emit$4(this, obj, interfaceC67352kd);
            case 5:
                return emit$5(this, obj, interfaceC67352kd);
            case 6:
                return emit$6(this, obj, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS132S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(IDfS132S0100000_12 iDfS132S0100000_12, Object obj, InterfaceC67352kd interfaceC67352kd) {
        ((InterfaceC73573Su9) iDfS132S0100000_12.l0).onNext(obj);
        return C76800UCe.LIZ;
    }

    public static final Object emit$1(IDfS132S0100000_12 iDfS132S0100000_12, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C70067Reh c70067Reh = (C70067Reh) obj;
        int i = c70067Reh.LJLILLLLZI;
        if (i >= 0) {
            C70282RiA c70282RiA = ((SkuWidget) iDfS132S0100000_12.l0).LJLJJI;
            if (c70282RiA != null) {
                if (i < c70282RiA.getChildCount()) {
                    C70282RiA c70282RiA2 = ((SkuWidget) iDfS132S0100000_12.l0).LJLJJI;
                    if (c70282RiA2 != null) {
                        int[] iArr = new int[2];
                        c70282RiA2.getChildAt(c70067Reh.LJLILLLLZI).getLocationOnScreen(iArr);
                        Object emit = ((SkuWidget) iDfS132S0100000_12.l0).getMViewModel().LJZL.emit(new C70068Rei(c70067Reh.LJLIL, c70067Reh.LJLILLLLZI, iArr[1]), interfaceC67352kd);
                        if (emit == EnumC58928NAu.COROUTINE_SUSPENDED) {
                            return emit;
                        }
                    } else {
                        o.LJIJI("specListLayout");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("specListLayout");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$2(IDfS132S0100000_12 iDfS132S0100000_12, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C70067Reh c70067Reh = (C70067Reh) obj;
        int i = c70067Reh.LJLILLLLZI;
        if (i >= 0) {
            SpecListLayoutV2 specListLayoutV2 = ((SkuWidgetV2) iDfS132S0100000_12.l0).LJLJJI;
            if (specListLayoutV2 != null) {
                if (i < specListLayoutV2.getChildCount()) {
                    SpecListLayoutV2 specListLayoutV22 = ((SkuWidgetV2) iDfS132S0100000_12.l0).LJLJJI;
                    if (specListLayoutV22 != null) {
                        View view = (View) ORZ.LJLLLLLL(c70067Reh.LJLILLLLZI, specListLayoutV22.getSpecLayoutList());
                        if (view != null) {
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            Object emit = ((SkuWidgetV2) iDfS132S0100000_12.l0).getMViewModel().LJZL.emit(new C70068Rei(c70067Reh.LJLIL, c70067Reh.LJLILLLLZI, iArr[1]), interfaceC67352kd);
                            if (emit == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                return emit;
                            }
                        }
                    } else {
                        o.LJIJI("specListLayoutV2");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("specListLayoutV2");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.IDfS132S0100000_12 r9, java.lang.Object r10, X.InterfaceC67352kd r11) {
        /*
            boolean r0 = r11 instanceof X.SQO
            if (r0 == 0) goto L9d
            r6 = r11
            X.SQO r6 = (X.SQO) r6
            int r2 = r6.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9d
            int r2 = r2 - r1
            r6.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r8 = 0
            java.lang.String r7 = "saveButton"
            r2 = 0
            java.lang.String r4 = "tags"
            r3 = 1
            if (r0 == 0) goto L4d
            if (r0 != r3) goto Lac
            X.317 r10 = r6.LJLJJL
            Y.IDfS132S0100000_12 r9 = r6.LJLJJI
            X.C141335gf.LIZJ(r1)
        L2a:
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet r0 = (com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet) r0
            X.NHW r0 = r0.LJLJJI
            if (r0 == 0) goto La8
            r0.setLoadingState(r2)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet r0 = (com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet) r0
            X.SY4 r1 = r0.LJLJJL
            if (r1 == 0) goto La4
            X.316 r10 = (X.AnonymousClass316) r10
            java.util.List<java.lang.String> r0 = r10.LIZ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r1.setEnabled(r0)
        L4a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4d:
            X.C141335gf.LIZJ(r1)
            X.317 r10 = (X.AnonymousClass317) r10
            boolean r0 = r10 instanceof X.AnonymousClass318
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet r0 = (com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet) r0
            X.NHW r1 = r0.LJLJJI
            if (r1 == 0) goto Lbc
            X.OQg r0 = X.C61878OQg.INSTANCE
            r1.setTags(r0)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet r0 = (com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet) r0
            X.NHW r0 = r0.LJLJJI
            if (r0 == 0) goto Lb8
            r0.setLoadingState(r3)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet r0 = (com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet) r0
            X.SY4 r0 = r0.LJLJJL
            if (r0 == 0) goto Lb4
            r0.setEnabled(r2)
            goto L4a
        L7a:
            boolean r0 = r10 instanceof X.AnonymousClass316
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet r0 = (com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet) r0
            X.NHW r1 = r0.LJLJJI
            if (r1 == 0) goto Lc0
            r0 = r10
            X.316 r0 = (X.AnonymousClass316) r0
            java.util.List<java.lang.String> r0 = r0.LIZ
            r1.setTags(r0)
            r6.LJLJJI = r9
            r6.LJLJJL = r10
            r6.LJLILLLLZI = r3
            r0 = 100
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r6)
            if (r0 != r5) goto L2a
            return r5
        L9d:
            X.SQO r6 = new X.SQO
            r6.<init>(r9, r11)
            goto L12
        La4:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        La8:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r8
        Lac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb4:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        Lb8:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r8
        Lbc:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r8
        Lc0:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS132S0100000_12.emit$3(Y.IDfS132S0100000_12, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$4(Y.IDfS132S0100000_12 r7, java.lang.Object r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.SQP
            if (r0 == 0) goto L76
            r6 = r9
            X.SQP r6 = (X.SQP) r6
            int r2 = r6.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r6.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r4 = 0
            r3 = 1
            java.lang.String r2 = "tags"
            if (r0 == 0) goto L34
            if (r0 != r3) goto L80
            Y.IDfS132S0100000_12 r7 = r6.LJLJJI
            X.C141335gf.LIZJ(r1)
        L25:
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.im.sdk.dmfilter.FilterKeywordsSettingFragment r0 = (com.ss.android.ugc.aweme.im.sdk.dmfilter.FilterKeywordsSettingFragment) r0
            X.NHW r1 = r0.LJLILLLLZI
            if (r1 == 0) goto L7c
            r0 = 0
            r1.setLoadingState(r0)
        L31:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L34:
            X.C141335gf.LIZJ(r1)
            X.317 r8 = (X.AnonymousClass317) r8
            boolean r0 = r8 instanceof X.AnonymousClass318
            if (r0 == 0) goto L56
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.im.sdk.dmfilter.FilterKeywordsSettingFragment r0 = (com.ss.android.ugc.aweme.im.sdk.dmfilter.FilterKeywordsSettingFragment) r0
            X.NHW r1 = r0.LJLILLLLZI
            if (r1 == 0) goto L8c
            X.OQg r0 = X.C61878OQg.INSTANCE
            r1.setTags(r0)
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.im.sdk.dmfilter.FilterKeywordsSettingFragment r0 = (com.ss.android.ugc.aweme.im.sdk.dmfilter.FilterKeywordsSettingFragment) r0
            X.NHW r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L88
            r0.setLoadingState(r3)
            goto L31
        L56:
            boolean r0 = r8 instanceof X.AnonymousClass316
            if (r0 == 0) goto L31
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.im.sdk.dmfilter.FilterKeywordsSettingFragment r0 = (com.ss.android.ugc.aweme.im.sdk.dmfilter.FilterKeywordsSettingFragment) r0
            X.NHW r1 = r0.LJLILLLLZI
            if (r1 == 0) goto L90
            X.316 r8 = (X.AnonymousClass316) r8
            java.util.List<java.lang.String> r0 = r8.LIZ
            r1.setTags(r0)
            r6.LJLJJI = r7
            r6.LJLILLLLZI = r3
            r0 = 100
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r6)
            if (r0 != r5) goto L25
            return r5
        L76:
            X.SQP r6 = new X.SQP
            r6.<init>(r7, r9)
            goto L12
        L7c:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r4
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L88:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r4
        L8c:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r4
        L90:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS132S0100000_12.emit$4(Y.IDfS132S0100000_12, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$5(IDfS132S0100000_12 iDfS132S0100000_12, Object obj, InterfaceC67352kd interfaceC67352kd) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ARV arv = ((FilterKeywordsSettingFragment) iDfS132S0100000_12.l0).LJLJI;
        if (arv != null) {
            arv.setChecked(booleanValue);
            return C76800UCe.LIZ;
        }
        o.LJIJI("switch");
        throw null;
    }

    public static final Object emit$6(IDfS132S0100000_12 iDfS132S0100000_12, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C70068Rei c70068Rei = (C70068Rei) obj;
        C45631qh c45631qh = (C45631qh) ((SkuPanelFragment) iDfS132S0100000_12.l0).LJLJJLL._$_findCachedViewById(R.id.k3r);
        if (c45631qh != null) {
            int[] iArr = new int[2];
            c45631qh.getLocationOnScreen(iArr);
            c45631qh.LJIILLIIL(0, c70068Rei.LJLJI - iArr[1], false);
        }
        return C76800UCe.LIZ;
    }
}
