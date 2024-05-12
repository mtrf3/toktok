package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C41454GOs;
import X.C41456GOu;
import X.C76800UCe;
import X.C78915Uy7;
import X.G5P;
import X.G5Q;
import X.GWJ;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class AqS0S0331000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;
    public boolean z5;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S0331000_7 aqS0S0331000_7, Object obj) {
        int i;
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJIIIIZZ(R.string.s4g, new C41456GOu(aqS0S0331000_7.z3, (Context) aqS0S0331000_7.l0, aqS0S0331000_7.z4, (CommerceToolsTcmModel) aqS0S0331000_7.l1, aqS0S0331000_7.z5, aqS0S0331000_7.i6));
        Context context = (Context) aqS0S0331000_7.l0;
        if (aqS0S0331000_7.z3) {
            i = R.string.s4h;
        } else {
            i = R.string.s4f;
        }
        String string = context.getString(i);
        o.LJIIIIZZ(string, "context.getString(if (us…_bc_passively_popup_CTA1)");
        actionGroup.LJIIIZ(string, new AqS29S0210000_7(aqS0S0331000_7.z3, (CommerceToolsTcmModel) aqS0S0331000_7.l1, (BrandedContentSwitchStatus) aqS0S0331000_7.l2, 3));
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0331000_7 aqS0S0331000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.s4u, new C41454GOs((Context) aqS0S0331000_7.l0, aqS0S0331000_7.z3, (CommerceToolsTcmModel) aqS0S0331000_7.l1, aqS0S0331000_7.z4, aqS0S0331000_7.i6));
        actionGroup.LJIIIIZZ(R.string.s4n, new AqS29S0210000_7(aqS0S0331000_7.z5, (CommerceToolsTcmModel) aqS0S0331000_7.l1, (BrandedContentSwitchStatus) aqS0S0331000_7.l2, 4));
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS0S0331000_7 aqS0S0331000_7, Object obj) {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem;
        Integer valueOf;
        View view = (View) obj;
        if (((G5Q) aqS0S0331000_7.l0).LIZIZ) {
            int i = 2;
            if (aqS0S0331000_7.i6 == 1) {
                if (view != null && (privacySettingsRestrictionItem = (PrivacySettingsRestrictionItem) aqS0S0331000_7.l2) != null && (valueOf = Integer.valueOf(privacySettingsRestrictionItem.getResType())) != null) {
                    if (valueOf.intValue() == 1) {
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(R.string.quk);
                        C78915Uy7.LJJIJ(view, 2036, creativeToastBuilder);
                    } else if (valueOf.intValue() == 2) {
                        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                        creativeToastBuilder2.messageRes(R.string.g9h);
                        C78915Uy7.LJJIJ(view, 2036, creativeToastBuilder2);
                    }
                }
            } else {
                G5P g5p = (G5P) aqS0S0331000_7.l1;
                if (g5p.LJIIIIZZ && g5p.LJIIIZ != 0) {
                    if (view != null) {
                        CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                        creativeToastBuilder3.messageRes(((G5P) aqS0S0331000_7.l1).LJIIIZ);
                        C78915Uy7.LJJIJ(view, 2036, creativeToastBuilder3);
                    }
                } else if (aqS0S0331000_7.z3 && g5p.LJ != 0) {
                    if (view != null) {
                        CreativeToastBuilder creativeToastBuilder4 = new CreativeToastBuilder();
                        creativeToastBuilder4.messageRes(((G5P) aqS0S0331000_7.l1).LJ);
                        C78915Uy7.LJJIJ(view, 2036, creativeToastBuilder4);
                    }
                } else if (g5p.LJIIJJI && g5p.LJFF != 0) {
                    if (view != null) {
                        CreativeToastBuilder creativeToastBuilder5 = new CreativeToastBuilder();
                        creativeToastBuilder5.messageRes(((G5P) aqS0S0331000_7.l1).LJFF);
                        C78915Uy7.LJJIJ(view, 2036, creativeToastBuilder5);
                    }
                } else if (g5p.LJII && g5p.LJI != 0) {
                    if (view != null) {
                        CreativeToastBuilder creativeToastBuilder6 = new CreativeToastBuilder();
                        creativeToastBuilder6.messageRes(((G5P) aqS0S0331000_7.l1).LJI);
                        C78915Uy7.LJJIJ(view, 2036, creativeToastBuilder6);
                    }
                } else if (GWJ.LIZIZ(g5p.LIZLLL)) {
                    boolean z = aqS0S0331000_7.z4;
                    boolean z2 = aqS0S0331000_7.z5;
                    if (z) {
                        i = 1;
                    } else if (!z2) {
                        i = 0;
                    }
                    String LIZ = GWJ.LIZ(i);
                    if (view != null) {
                        CreativeToastBuilder creativeToastBuilder7 = new CreativeToastBuilder();
                        creativeToastBuilder7.message(LIZ);
                        C78915Uy7.LJJIJ(view, 2036, creativeToastBuilder7);
                    }
                }
            }
        } else {
            View.OnClickListener onClickListener = ((G5P) aqS0S0331000_7.l1).LJIIJ;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS0S0331000_7(int r3, android.content.Context r4, com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel r5, com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus r6, boolean r7, boolean r8, boolean r9, int r10) {
        /*
            r2 = this;
            r2.$t = r10
            switch(r10) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.z3 = r7
            r1.l1 = r5
            r1.z4 = r8
            r1.i6 = r3
            r1.z5 = r9
            r1.l2 = r6
            r0 = 1
        L15:
            r1.<init>(r0)
            return
        L19:
            r1 = r2
            r1.l0 = r4
            r1.z3 = r7
            r1.z4 = r8
            r1.l1 = r5
            r1.z5 = r9
            r1.i6 = r3
            r1.l2 = r6
            r0 = 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS0S0331000_7.<init>(int, android.content.Context, com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel, com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus, boolean, boolean, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0331000_7(G5Q g5q, int i, G5P g5p, boolean z, boolean z2, boolean z3, PrivacySettingsRestrictionItem privacySettingsRestrictionItem, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = g5q;
        this.i6 = i;
        this.l1 = g5p;
        this.z3 = z;
        this.z4 = z2;
        this.z5 = z3;
        this.l2 = privacySettingsRestrictionItem;
    }
}
