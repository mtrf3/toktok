package kotlin.jvm.internal;

import X.AbstractC42152GgW;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C26227ARb;
import X.C29S;
import X.C32I;
import X.C46193IAz;
import X.C61878OQg;
import X.C76732zl;
import X.C76800UCe;
import X.C78605Ut7;
import X.C78915Uy7;
import X.G7X;
import X.G8J;
import X.HVO;
import X.HVR;
import X.IB3;
import X.IBI;
import X.IBJ;
import X.InterfaceC65784Pro;
import X.InterfaceC83727WtX;
import X.InterfaceC88471Ynr;
import X.UC0;
import Y.AObserverS37S0400000_7;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerMessageModule;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class AqS77S0400000_7 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS77S0400000_7 aqS77S0400000_7, Object obj, Object obj2) {
        HVR.LIZ.LJIIIIZZ((ActivityC45651qj) aqS77S0400000_7.l0, (InterfaceC65784Pro) aqS77S0400000_7.l1, (InterfaceC65784Pro) aqS77S0400000_7.l2, (InterfaceC65784Pro) aqS77S0400000_7.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS77S0400000_7 aqS77S0400000_7, Object obj, Object obj2) {
        ((InterfaceC65784Pro) aqS77S0400000_7.l0).invoke();
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS77S0400000_7.l1;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS77S0400000_7.l2;
        InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) aqS77S0400000_7.l3;
        String[] strArr = {"android.permission.CAMERA"};
        String[] LJIILL = C78605Ut7.LJIILL(strArr);
        Map LIZIZ = HVR.LIZIZ(activityC45651qj);
        HVO.LIZLLL(strArr, activityC45651qj, "");
        C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
        c26227ARb.LJFF(activityC45651qj.getString(R.string.rtq));
        c26227ARb.LIZIZ(HVR.LIZ(activityC45651qj, LIZIZ, LJIILL));
        UC0.LIZJ(c26227ARb, new AqS111S0300000_7(activityC45651qj, interfaceC65784Pro, strArr, 9));
        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(activityC45651qj, c26227ARb);
        autoDismissPermissionDialog.LJLJJI = new AqS173S0100000_7(interfaceC65784Pro2, (InterfaceC65784Pro<C76800UCe>) 156);
        if (autoDismissPermissionDialog.LIZ()) {
            HVR.LIZIZ = true;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS77S0400000_7 aqS77S0400000_7, Object obj, Object obj2) {
        HVR.LIZ.LJIIIIZZ((ActivityC45651qj) aqS77S0400000_7.l0, (InterfaceC65784Pro) aqS77S0400000_7.l1, (InterfaceC65784Pro) aqS77S0400000_7.l2, (InterfaceC65784Pro) aqS77S0400000_7.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS77S0400000_7 aqS77S0400000_7, Object obj, Object obj2) {
        List<IB3> list;
        List<IB3> list2;
        List<IB3> list3;
        List<IB3> list4;
        IBJ state = (IBJ) obj;
        List<? extends VEFrame> frameList = (List) obj2;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(frameList, "frameList");
        int i = IBI.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ((UploadPicStickerMessageModule) aqS77S0400000_7.l0).gv0().setValue(Boolean.FALSE);
                    if (!((List) aqS77S0400000_7.l2).isEmpty()) {
                        InterfaceC83727WtX LLF = ((C46193IAz) aqS77S0400000_7.l3).LLF();
                        List list5 = (List) aqS77S0400000_7.l2;
                        ArrayList arrayList = new ArrayList(C32I.LJJL(list5, 10));
                        Iterator it = list5.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((IB3) it.next()).LJLIL);
                        }
                        LLF.oa(arrayList, C61878OQg.INSTANCE);
                        UploadPicStickerARPresenter uploadPicStickerARPresenter = ((C46193IAz) aqS77S0400000_7.l3).LLJJJ;
                        if (uploadPicStickerARPresenter != null && (list4 = uploadPicStickerARPresenter.LJLZ) != null) {
                            ((ArrayList) list4).clear();
                        }
                    }
                } else {
                    C29S c29s = ((C46193IAz) aqS77S0400000_7.l3).LJLIL;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    String string = ((C46193IAz) aqS77S0400000_7.l3).LJLIL.getString(R.string.qh);
                    o.LJIIIIZZ(string, "activity.getString(R.string.Pic_video_false)");
                    creativeToastBuilder.message(string);
                    C78915Uy7.LJJIIZI(c29s, 3002, creativeToastBuilder);
                    ((UploadPicStickerMessageModule) aqS77S0400000_7.l0).gv0().setValue(Boolean.FALSE);
                    if (!((List) aqS77S0400000_7.l2).isEmpty()) {
                        InterfaceC83727WtX LLF2 = ((C46193IAz) aqS77S0400000_7.l3).LLF();
                        List list6 = (List) aqS77S0400000_7.l2;
                        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list6, 10));
                        Iterator it2 = list6.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((IB3) it2.next()).LJLIL);
                        }
                        LLF2.oa(arrayList2, C61878OQg.INSTANCE);
                        UploadPicStickerARPresenter uploadPicStickerARPresenter2 = ((C46193IAz) aqS77S0400000_7.l3).LLJJJ;
                        if (uploadPicStickerARPresenter2 != null && (list3 = uploadPicStickerARPresenter2.LJLZ) != null) {
                            ((ArrayList) list3).clear();
                        }
                    }
                }
            } else {
                ((UploadPicStickerMessageModule) aqS77S0400000_7.l0).gv0().setValue(Boolean.FALSE);
                if (((List) aqS77S0400000_7.l1).size() == frameList.size()) {
                    if (!((List) aqS77S0400000_7.l2).isEmpty()) {
                        InterfaceC83727WtX LLF3 = ((C46193IAz) aqS77S0400000_7.l3).LLF();
                        List list7 = (List) aqS77S0400000_7.l2;
                        ArrayList arrayList3 = new ArrayList(C32I.LJJL(list7, 10));
                        Iterator it3 = list7.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((IB3) it3.next()).LJLIL);
                        }
                        LLF3.oa(arrayList3, C61878OQg.INSTANCE);
                        UploadPicStickerARPresenter uploadPicStickerARPresenter3 = ((C46193IAz) aqS77S0400000_7.l3).LLJJJ;
                        if (uploadPicStickerARPresenter3 != null && (list2 = uploadPicStickerARPresenter3.LJLZ) != null) {
                            ((ArrayList) list2).clear();
                        }
                    }
                    if (!((List) aqS77S0400000_7.l1).isEmpty()) {
                        InterfaceC83727WtX LLF4 = ((C46193IAz) aqS77S0400000_7.l3).LLF();
                        List list8 = (List) aqS77S0400000_7.l1;
                        ArrayList arrayList4 = new ArrayList(C32I.LJJL(list8, 10));
                        Iterator it4 = list8.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(((IB3) it4.next()).LJLIL);
                        }
                        LLF4.oa(arrayList4, frameList);
                        UploadPicStickerARPresenter uploadPicStickerARPresenter4 = ((C46193IAz) aqS77S0400000_7.l3).LLJJJ;
                        if (uploadPicStickerARPresenter4 != null && (list = uploadPicStickerARPresenter4.LJLZ) != null) {
                            List list9 = (List) aqS77S0400000_7.l1;
                            ArrayList arrayList5 = (ArrayList) list;
                            arrayList5.clear();
                            arrayList5.addAll(list9);
                        }
                        C46193IAz c46193IAz = (C46193IAz) aqS77S0400000_7.l3;
                        List list10 = (List) aqS77S0400000_7.l1;
                        ArrayList arrayList6 = new ArrayList(C32I.LJJL(list10, 10));
                        Iterator it5 = list10.iterator();
                        while (it5.hasNext()) {
                            arrayList6.add(((IB3) it5.next()).LJLIL);
                        }
                        c46193IAz.LLJJJJ = arrayList6;
                        ((C46193IAz) aqS77S0400000_7.l3).u(new IB3("", 1, 0L, 56));
                    }
                    ((C46193IAz) aqS77S0400000_7.l3).LLJI = ((List) aqS77S0400000_7.l1).size();
                }
            }
        } else {
            ((UploadPicStickerMessageModule) aqS77S0400000_7.l0).gv0().setValue(Boolean.TRUE);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS77S0400000_7 aqS77S0400000_7, Object loadingView, Object obj) {
        TuxSheet sheet = (TuxSheet) obj;
        o.LJIIIZ(loadingView, "loadingView");
        o.LJIIIZ(sheet, "sheet");
        ((G7X) aqS77S0400000_7.l0).LIZJ((AbstractC42152GgW) aqS77S0400000_7.l1);
        G8J g8j = (G8J) aqS77S0400000_7.l2;
        g8j.LJ.observe(g8j.LJIIIIZZ, new AObserverS37S0400000_7((C76732zl) aqS77S0400000_7.l3, sheet, (G7X) aqS77S0400000_7.l0, (AbstractC42152GgW) aqS77S0400000_7.l1, 0));
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS77S0400000_7(X.ActivityC45651qj r3, X.ActivityC45651qj r4, X.InterfaceC65784Pro<X.C76800UCe> r5, X.InterfaceC65784Pro<X.C76800UCe> r6, X.InterfaceC65784Pro<X.C76800UCe> r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L13;
                case 1: goto L5;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r1.l3 = r6
            r0 = 2
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r6
            r0 = 2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS77S0400000_7.<init>(X.1qj, X.Pro, X.Pro, X.Pro, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS77S0400000_7(G7X g7x, G7X g7x2, AbstractC42152GgW<?> abstractC42152GgW, G8J g8j, C76732zl c76732zl) {
        super(2);
        this.$t = c76732zl;
        this.l0 = g7x;
        this.l1 = g7x2;
        this.l2 = abstractC42152GgW;
        this.l3 = g8j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS77S0400000_7(UploadPicStickerMessageModule uploadPicStickerMessageModule, UploadPicStickerMessageModule uploadPicStickerMessageModule2, List<IB3> list, List<IB3> list2, C46193IAz c46193IAz) {
        super(2);
        this.$t = c46193IAz;
        this.l0 = uploadPicStickerMessageModule;
        this.l1 = uploadPicStickerMessageModule2;
        this.l2 = list;
        this.l3 = list2;
    }
}
