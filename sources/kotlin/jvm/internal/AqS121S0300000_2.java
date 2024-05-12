package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C121924qS;
import X.C1290654s;
import X.C1303859u;
import X.C5A5;
import X.C68322mC;
import X.C76800UCe;
import X.HPJ;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public class AqS121S0300000_2 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS121S0300000_2 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            java.lang.Number r6 = (java.lang.Number) r6
            float r3 = r6.floatValue()
            java.lang.Object r2 = r5.l0
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r2 instanceof X.AbstractC130625As
            if (r0 == 0) goto L16
            X.5As r2 = (X.AbstractC130625As) r2
            boolean r0 = r2.LIZ()
            if (r0 != 0) goto L74
        L16:
            java.lang.Object r0 = r5.l1
            X.5A5 r0 = (X.C5A5) r0
            android.view.View r1 = r0.getView()
            boolean r0 = r1 instanceof X.AbstractC130625As
            r4 = 0
            if (r0 == 0) goto L2b
            X.5As r1 = (X.AbstractC130625As) r1
            if (r1 == 0) goto L2b
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r4 = r1.getNleTrackSlot$editor_trackpanel_release()
        L2b:
            java.lang.Object r0 = r5.l2
            X.59u r0 = (X.C1303859u) r0
            X.Ynt r1 = r0.getOnShouldInterceptSlotClickEvent()
            if (r1 == 0) goto L5e
            java.lang.Object r3 = r5.l1
            X.5A5 r3 = (X.C5A5) r3
            java.lang.Object r2 = r5.l2
            X.59u r2 = (X.C1303859u) r2
            if (r7 == 0) goto L5a
            android.view.View r0 = r3.getView()
            java.lang.Object r0 = r1.invoke(r4, r0, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5a
            X.59t r1 = r2.getClipHelper()
            java.util.Map r0 = r2.getSegmentParams()
            r1.LJIIJ(r3, r0)
        L5a:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L71
        L5e:
            java.lang.Object r0 = r5.l2
            X.59u r0 = (X.C1303859u) r0
            java.lang.Object r2 = r5.l1
            X.5A5 r2 = (X.C5A5) r2
            X.59t r1 = r0.getClipHelper()
            java.util.Map r0 = r0.getSegmentParams()
            r1.LJIIJ(r2, r0)
        L71:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L74:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = r2.LJLJJLL
            if (r1 != 0) goto L79
            goto L16
        L79:
            X.5Aw r0 = r2.LJLIL
            java.lang.Long r0 = r0.LIZ(r1, r3)
            if (r0 == 0) goto L16
            long r0 = r0.longValue()
            r2.LJ(r0)
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS121S0300000_2.invoke$0(kotlin.jvm.internal.AqS121S0300000_2, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        r0.invoke();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS121S0300000_2 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int[] r8 = (int[]) r8
            java.lang.Object r5 = r6.l0
            java.lang.String[] r5 = (java.lang.String[]) r5
            int r4 = r5.length
            r3 = 0
        La:
            if (r3 >= r4) goto L3a
            r2 = r5[r3]
            if (r7 == 0) goto L17
            boolean r1 = X.ORY.LJJIJIIJIL(r2, r7)
            r0 = 1
            if (r1 == r0) goto L1a
        L17:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1a:
            int r0 = X.ORY.LJJJJIZL(r2, r7)
            if (r8 == 0) goto L26
            java.lang.Integer r0 = X.ORY.LJJJJ(r0, r8)
            if (r0 != 0) goto L30
        L26:
            java.lang.Object r0 = r6.l1
            X.Pro r0 = (X.InterfaceC65784Pro) r0
            if (r0 == 0) goto L17
            r0.invoke()
            goto L17
        L30:
            int r0 = r0.intValue()
            if (r0 == 0) goto L37
            goto L26
        L37:
            int r3 = r3 + 1
            goto La
        L3a:
            java.lang.Object r0 = r6.l2
            X.Pro r0 = (X.InterfaceC65784Pro) r0
            r0.invoke()
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS121S0300000_2.invoke$1(kotlin.jvm.internal.AqS121S0300000_2, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.bytedance.ies.nle.editor_jni.NLENode, java.lang.Object] */
    public static final Object invoke$2(AqS121S0300000_2 aqS121S0300000_2, Object newTrack, Object obj) {
        ?? newSlot = (NLENode) obj;
        o.LJIIIZ(newTrack, "newTrack");
        o.LJIIIZ(newSlot, "newSlot");
        ((C68322mC) aqS121S0300000_2.l1).element = newTrack;
        ((C68322mC) aqS121S0300000_2.l2).element = newSlot;
        ((C121924qS) aqS121S0300000_2.l0).LIZJ.LIZIZ = newSlot.getUUID();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.bytedance.ies.nle.editor_jni.NLENode, java.lang.Object] */
    public static final Object invoke$3(AqS121S0300000_2 aqS121S0300000_2, Object newTrack, Object obj) {
        ?? newSlot = (NLENode) obj;
        o.LJIIIZ(newTrack, "newTrack");
        o.LJIIIZ(newSlot, "newSlot");
        ((C68322mC) aqS121S0300000_2.l1).element = newTrack;
        ((C68322mC) aqS121S0300000_2.l2).element = newSlot;
        ((C121924qS) aqS121S0300000_2.l0).LIZJ.LIZIZ = newSlot.getUUID();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS121S0300000_2 aqS121S0300000_2, Object obj, Object obj2) {
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS121S0300000_2.l0;
        String string = activityC45651qj.getString(R.string.trs);
        o.LJIIIIZZ(string, "activity.getString(R.str…eover_android_popup_desc)");
        HPJ.LIZJ(activityC45651qj, null, string, (InterfaceC65784Pro) aqS121S0300000_2.l1, (InterfaceC65784Pro) aqS121S0300000_2.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS121S0300000_2 aqS121S0300000_2, Object obj, Object obj2) {
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS121S0300000_2.l0;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS121S0300000_2.l1;
        InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) aqS121S0300000_2.l2;
        String string = activityC45651qj.getString(R.string.rtg);
        String string2 = activityC45651qj.getString(R.string.rtf);
        o.LJIIIIZZ(string2, "activity.getString(R.str…ialog_description_photos)");
        HPJ.LIZJ(activityC45651qj, string, string2, interfaceC65784Pro, interfaceC65784Pro2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS121S0300000_2(ActivityC45651qj activityC45651qj, C1290654s c1290654s, AqS62S0400000_2 aqS62S0400000_2, int i) {
        super(2);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = c1290654s;
        this.l2 = aqS62S0400000_2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS121S0300000_2(ActivityC45651qj activityC45651qj, ActivityC45651qj activityC45651qj2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(2);
        this.$t = interfaceC65784Pro2;
        this.l0 = activityC45651qj;
        this.l1 = activityC45651qj2;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS121S0300000_2(C121924qS c121924qS, C68322mC c68322mC, C68322mC c68322mC2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c121924qS;
        this.l1 = c68322mC;
        this.l2 = c68322mC2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS121S0300000_2(View view, C5A5 c5a5, C1303859u c1303859u, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = c5a5;
        this.l2 = c1303859u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS121S0300000_2(String[] strArr, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i) {
        super(2);
        this.$t = i;
        this.l0 = strArr;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC65784Pro2;
    }
}
