package X;

import Y.AObserverS63S0101000_13;
import Y.AObserverS81S0100000_13;
import android.view.ViewGroup;
import androidx.lifecycle.MediatorLiveData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.UkV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78071UkV {
    public C78070UkU LIZ;
    public ViewGroup LIZJ;
    public DataChannel LIZLLL;
    public final ArrayList<C78069UkT> LIZIZ = new ArrayList<>(2);
    public final C78075UkZ LJ = new C78075UkZ(new AqS163S0100000_13(this, 553));

    public final void LIZ() {
        C78072UkW LIZIZ;
        C78071UkV c78071UkV;
        C78072UkW LIZIZ2;
        C0NB.LJIIIZ("GiftTray", "awakeTrayController");
        Iterator<C78069UkT> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            C78069UkT next = it.next();
            EnumC78090Uko enumC78090Uko = next.LIZLLL;
            EnumC78090Uko enumC78090Uko2 = EnumC78090Uko.IDLE;
            if (enumC78090Uko == enumC78090Uko2 || enumC78090Uko == EnumC78090Uko.WAITING) {
                C0NB.LJIIIZ("GiftTray", "tryConsumeMessage");
                EnumC78090Uko enumC78090Uko3 = next.LIZLLL;
                if (enumC78090Uko3 == enumC78090Uko2) {
                    C78071UkV c78071UkV2 = next.LJI;
                    if (c78071UkV2 != null && (LIZIZ = c78071UkV2.LIZIZ(new C78106Ul4(null))) != null) {
                        next.LJII(LIZIZ);
                    }
                } else if (enumC78090Uko3 == EnumC78090Uko.WAITING && (c78071UkV = next.LJI) != null && (LIZIZ2 = c78071UkV.LIZIZ(new C78106Ul4(next.LJII))) != null) {
                    next.LJIIIIZZ(LIZIZ2);
                }
            }
        }
    }

    public final int LIZJ() {
        C78072UkW c78072UkW;
        Iterator<C78069UkT> it = this.LIZIZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            C78069UkT next = it.next();
            if (next.LIZLLL != EnumC78090Uko.IDLE && (c78072UkW = next.LJII) != null && c78072UkW.LJJJJJL) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0107, code lost:
    
        r4 = r6.send_gift_req_start_ms;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0109, code lost:
    
        r0 = r0 - r4;
        r4 = r7.LJJIFFI;
        r15 = r4 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x010e, code lost:
    
        if (r6 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0110, code lost:
    
        r2 = r6.send_gift_req_start_ms;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0112, code lost:
    
        r4 = r4 - r2;
        r6 = new org.json.JSONObject();
        r3 = new org.json.JSONObject();
        r2 = new org.json.JSONObject();
        X.C32455CoV.LJI(r9, r6, r3);
        r13 = ((java.util.LinkedHashMap) X.C32455CoV.LIZLLL(r13, r12, r11, r0)).entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x013c, code lost:
    
        if (r13.hasNext() == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x013e, code lost:
    
        r11 = (java.util.Map.Entry) r13.next();
        r3.put((java.lang.String) r11.getKey(), r11.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0158, code lost:
    
        r3.put("send_receive_im_dur", r0);
        r3.put("before_queue_dur", r17);
        r3.put("in_queue_dur", r15);
        r3.put("send_dequeue_dur", r4);
        r3.put("device_score", java.lang.Float.valueOf(com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        r1 = r7.LJJIJLIJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0182, code lost:
    
        if ((r1 instanceof java.util.Collection) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0188, code lost:
    
        if (r1.isEmpty() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x018a, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x018b, code lost:
    
        r4 = true;
        r3.put("msg_total", r5);
        r1 = r7.LJJIJLIJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0195, code lost:
    
        if ((r1 instanceof java.util.Collection) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x019b, code lost:
    
        if (r1.isEmpty() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x019d, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x019e, code lost:
    
        r3.put("interrupted_msg_total", r5);
        r5 = X.C28787BRn.LIZ("gift_msg_dequeue");
        r5.LJIIZILJ();
        r5.LJJ(r6);
        r5.LJJ(r3);
        r5.LJJ(r2);
        X.C32463Cod.LIZ(r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c2, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting.INSTANCE.isBuriedField(r5.LJIILL()) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c4, code lost:
    
        r5.LJJIIJZLJL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d1, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_msg_dequeue", com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d3, code lost:
    
        X.C0K2.LJI("ttlive_gift_msg_dequeue", r6, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d8, code lost:
    
        r5.LJJIJ();
        r5.LJJIIZI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01df, code lost:
    
        r1 = r1.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e8, code lost:
    
        if (r1.hasNext() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01f2, code lost:
    
        if (r1.next().LJLJI == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01f4, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f6, code lost:
    
        if (r5 < 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0242, code lost:
    
        X.C47261Igj.LJJJJIZL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0246, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01f9, code lost:
    
        r1 = r1.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0202, code lost:
    
        if (r1.hasNext() == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x020e, code lost:
    
        if ((!r1.next().LJLJI) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0210, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0212, code lost:
    
        if (r5 < 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0247, code lost:
    
        X.C47261Igj.LJJJJIZL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x024b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0152, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0155, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        if (r7 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
    
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b2, code lost:
    
        r7.LJJIFFI = X.C30725C4b.LIZ();
        r7.LJJII = java.lang.System.currentTimeMillis();
        r13 = r8.LIZ.size();
        r12 = r8.LIZIZ.size();
        r11 = r8.LIZ.size();
        r0 = X.C32433Co9.LIZIZ.LIZIZ;
        r9 = r7.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d8, code lost:
    
        if (r9 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00da, code lost:
    
        r7.LJJIZ.O("dequeue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0215, code lost:
    
        r0 = r7.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0217, code lost:
    
        if (r0 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0219, code lost:
    
        r0 = r0.mGift;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x021b, code lost:
    
        if (r0 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x021d, code lost:
    
        r1 = r0.primaryEffectId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0222, code lost:
    
        if (r7.LJFF != 2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022c, code lost:
    
        if (r1 <= 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0236, code lost:
    
        if (X.C32341Cmf.LJ(java.lang.Long.valueOf(r1)) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0238, code lost:
    
        r7.LJJLIIIJ = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0240, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x023a, code lost:
    
        X.C3C5.m7constructorimpl(X.C76800UCe.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0225, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x024d, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e3, code lost:
    
        r2 = X.C32455CoV.LJIILLIIL();
        r1 = X.C32455CoV.LJIIZILJ(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00ef, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting.shouldBlock(r9) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f6, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting.enable() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f8, code lost:
    
        if (r2 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00fa, code lost:
    
        if (r1 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00fd, code lost:
    
        r2 = r7.LJJI;
        r0 = r7.LJIL;
        r17 = r2 - r0;
        r6 = r9.giftMonitorInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0105, code lost:
    
        if (r6 == null) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C78072UkW LIZIZ(X.C78106Ul4 r22) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78071UkV.LIZIZ(X.Ul4):X.UkW");
    }

    public final void LIZLLL(int i, ViewGroup viewGroup, boolean z, boolean z2) {
        if (!this.LIZIZ.isEmpty()) {
            Iterator<C78069UkT> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LJIILIIL();
            }
        }
        this.LIZIZ.clear();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.LIZJ = viewGroup;
        C78069UkT c78069UkT = new C78069UkT();
        c78069UkT.LJIIJJI = z ? 1 : 0;
        c78069UkT.LJI = this;
        c78069UkT.LJIILL(this.LIZLLL);
        this.LIZIZ.add(c78069UkT);
        ViewGroup viewGroup2 = this.LIZJ;
        if (viewGroup2 != null) {
            c78069UkT.LJIJ(viewGroup2);
        }
        C78069UkT c78069UkT2 = new C78069UkT();
        c78069UkT2.LJIIJJI = !z ? 1 : 0;
        c78069UkT2.LJI = this;
        c78069UkT2.LJIILL(this.LIZLLL);
        this.LIZIZ.add(c78069UkT2);
        ViewGroup viewGroup3 = this.LIZJ;
        if (viewGroup3 != null) {
            c78069UkT2.LJIJ(viewGroup3);
        }
        if (z2) {
            MediatorLiveData mediatorLiveData = new MediatorLiveData();
            Iterator<C78069UkT> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                mediatorLiveData.addSource(it2.next().LJ, new AObserverS81S0100000_13(mediatorLiveData, 72));
            }
            mediatorLiveData.observeForever(new AObserverS63S0101000_13(this, i, 1));
        }
    }
}
