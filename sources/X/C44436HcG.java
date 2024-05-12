package X;

import Y.ARunnableS18S0300000_7;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HcG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44436HcG implements I14 {
    public final InterfaceC65784Pro<C44297Ha1> LIZ;
    public final C29S LIZIZ;
    public final I0N LIZJ;
    public final ShortVideoContext LIZLLL;
    public final HXT LJ;
    public final C82622Wbi LJFF;
    public final SafeHandler LJI;
    public final WLB LJII;
    public final C29901Fi<Effect> LJIIIIZZ;

    @Override // X.I14
    public final void LIZIZ() {
        List<String> list = this.LIZ.invoke().LIZLLL;
        List list2 = null;
        try {
            String[] strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("studio_activity_props", String[].class, null);
            if (strArr != null) {
                list2 = ORY.LJJZZIII(strArr);
            }
        } catch (Throwable unused) {
        }
        if (list2 != null && !list2.isEmpty()) {
            C82398WVm.LIZIZ(this.LIZJ, list2, LJII(), new C44441HcL(this));
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) ListProtector.get(list, 0));
        int size = list.size();
        for (int i = 1; i < size; i++) {
            sb.append(",");
            sb.append((String) ListProtector.get(list, i));
        }
        java.util.Map<String, String> LJII = LJII();
        EffectListResponse LIZ = C44027HPr.LIZ((String) ListProtector.get(list, 0));
        if (LIZ != null) {
            if (LJIIIZ(LIZ, sb)) {
                return;
            }
            I0N downloadEffect = this.LIZJ;
            Effect effect = (Effect) ORZ.LJLLJ(LIZ.getData());
            AqS96S0300000_7 aqS96S0300000_7 = new AqS96S0300000_7(this, LIZ, sb, 22);
            o.LJIIIZ(downloadEffect, "$this$downloadEffect");
            o.LJIIIZ(effect, "effect");
            downloadEffect.LLLLL().LJJJJI(effect, aqS96S0300000_7);
            return;
        }
        C82398WVm.LIZIZ(this.LIZJ, list, LJII, new C44439HcJ(this, sb, LJII));
    }

    @Override // X.I14
    public final String LJ() {
        List<String> list = this.LIZ.invoke().LIZLLL;
        if (list == null || list.isEmpty()) {
            return "";
        }
        Iterator<String> it = list.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final java.util.Map<String, String> LJII() {
        HashMap hashMap = new HashMap();
        hashMap.put(WM7.SCENE_SERVICE, LJIIJ());
        String str = this.LIZ.invoke().LIZIZ;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("grade_key", str);
        }
        return hashMap;
    }

    public final String LJIIJ() {
        String str = this.LIZ.invoke().LIZ;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.I14
    public final LiveEvent<Effect> LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.I14
    public final void LIZ(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        ArrayList<String> LIZIZ = ID0.LIZIZ(str);
        java.util.Map<String, String> LJII = LJII();
        I0N i0n = this.LIZJ;
        HXT hxt = this.LJ;
        C44438HcI c44438HcI = new C44438HcI(this, LJII);
        hxt.getClass();
        C82398WVm.LIZIZ(i0n, LIZIZ, LJII, new C44443HcN(hxt, c44438HcI));
    }

    @Override // X.I14
    public final boolean LIZJ(String str) {
        ArrayList<String> arrayList;
        if (str == null || str.length() == 0) {
            arrayList = null;
        } else {
            arrayList = ID0.LIZIZ(str);
        }
        ArrayList arrayList2 = new ArrayList();
        List<String> list = this.LIZ.invoke().LIZLLL;
        if (list != null) {
            arrayList2.addAll(list);
        }
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // X.I14
    public final boolean LIZLLL(Effect effect) {
        if (!TextUtils.equals(LJIIJ(), "qrcode") && V3N.LJIILJJIL(effect) && !ETV.LIZ(effect)) {
            return false;
        }
        return true;
    }

    public final void LJIIL(Effect effect) {
        if (V3N.LJIILJJIL(effect)) {
            EQ6 LIZIZ = EQ6.LIZIZ();
            LIZIZ.getClass();
            if (V3N.LJIILJJIL(effect)) {
                String effectId = effect.getEffectId();
                if (LIZIZ.LIZ() != null && !LIZIZ.LIZ().contains(effectId)) {
                    LIZIZ.LIZ().add(effectId);
                    EQ6.LIZLLL.edit().putString("sticker_id_info", GsonProtectorUtils.toJson(LIZIZ.LIZIZ, LIZIZ.LIZ())).apply();
                }
            }
            this.LJIIIIZZ.LJII(effect);
        }
    }

    @Override // X.I14
    public final void LJI(String str, AqS173S0100000_7 aqS173S0100000_7) {
        boolean z;
        ArrayList<String> arrayList;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList = ID0.LIZIZ(str);
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList();
        List<String> list = this.LIZ.invoke().LIZLLL;
        if (list != null) {
            arrayList2.addAll(list);
        }
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            aqS173S0100000_7.invoke(null);
            return;
        }
        ListProtector.get(arrayList2, 0);
        int size = arrayList2.size();
        for (int i = 1; i < size; i++) {
            ListProtector.get(arrayList2, i);
        }
        C82398WVm.LIZIZ(this.LIZJ, arrayList2, LJII(), new C44437HcH(this, aqS173S0100000_7));
    }

    public final void LJIIIIZZ(EffectListResponse effectListResponse, StringBuilder sb) {
        String str;
        boolean z;
        String unzipPath;
        InterfaceC45999I3n LIZ;
        this.LIZJ.Lv().LIZIZ(effectListResponse.getUrlPrefix());
        Effect effect = this.LIZ.invoke().LIZJ;
        List<Effect> LLJILJILJ = ORZ.LLJILJILJ(effectListResponse.getData());
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        if (!arrayList.isEmpty() && !TextUtils.equals(LJIIJ(), "qrcode") && V3N.LJIILJJIL((Effect) ORZ.LJLLJ(LLJILJILJ)) && !ETV.LIZ((Effect) ORZ.LJLLJ(LLJILJILJ))) {
            ListProtector.remove(LLJILJILJ, 0);
        }
        if (arrayList.isEmpty()) {
            effectListResponse.setData(LLJILJILJ);
            return;
        }
        if (this.LIZLLL.mToLive) {
            return;
        }
        if (C32151Nz.LJJIIZI(effectListResponse.getCollection())) {
            C82398WVm.LJFF(this.LIZJ, effectListResponse.getCollection());
        }
        Iterator it = arrayList.iterator();
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            String parentId = ((EffectTemplate) it.next()).getParentId();
            if (!TextUtils.isEmpty(parentId) && !hashSet.add(parentId)) {
                it.remove();
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "stickers.toString()");
        Bundle LIZ2 = C44231HXn.LIZ(this.LIZIZ, this.LJFF);
        Bundle bundle = null;
        if (LIZ2 != null) {
            str = LIZ2.getString("event_shoot_event_track");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("prop_id", sb2);
            c145995oB.LJI("creation_id", this.LIZLLL.LJI());
            c145995oB.LJI("shoot_way", "direct_shoot");
            FMX.LJIIL("auto_prop_show", c145995oB.LIZ);
        } else {
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LJI("prop_id", sb2);
            FMX.LJIIL("reuse_prop_release", c145995oB2.LIZ);
        }
        Effect effect2 = (Effect) ORZ.LJLLJ(LLJILJILJ);
        if (LJIIJ().equals("draft")) {
            effect = effect2;
        }
        boolean z2 = true;
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().isDuetAutoApplyEffectEnabled() && this.LIZLLL.LJJJI()) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (z && C1B8.LIZJ()) {
            this.LIZJ.LLLLL().LJJJJLL().LIZJ().LIZJ("", LLJILJILJ);
            if (arrayList.isEmpty()) {
                return;
            }
            effect = (Effect) ORZ.LJLLJ(LLJILJILJ);
            this.LIZLLL.fromPropId = effect.getEffectId();
            FaceStickerBean.sCurPropSource = "duet";
            this.LIZLLL.duetEnterRecordPageWithProps = true;
            if (ID0.LJII(effect) && (LIZ = this.LJII.J40().LIZ()) != null) {
                LIZ.ZP(true);
            }
        }
        Boolean bool = this.LIZLLL.showCancelAfterPinProp;
        o.LJIIIIZZ(bool, "shortVideoContext.showCancelAfterPinProp");
        if (bool.booleanValue()) {
            this.LIZJ.Sl(true, true);
            FaceStickerBean.sCurPropSource = "qa_prop";
        }
        I0N i0n = this.LIZJ;
        if (effect == null) {
            z2 = false;
        }
        OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig = this.LIZLLL.greenScreenKitConfig;
        if (oPSDK$GreenScreenKitConfig != null) {
            bundle = oPSDK$GreenScreenKitConfig.toBundle();
        }
        C82398WVm.LJ(i0n, LLJILJILJ, true, z2, null, true, bundle, 0, 14840);
        effectListResponse.setData(LLJILJILJ);
        if (effect != null && (unzipPath = effect.getUnzipPath()) != null) {
            str2 = unzipPath;
        }
        effect2.setUnzipPath(str2);
        LJIIL(effect2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r0 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse r9, java.lang.StringBuilder r10) {
        /*
            r8 = this;
            java.util.List r0 = r9.getData()
            r7 = 0
            r6 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
        Le:
            return r6
        Lf:
            java.lang.String r1 = r8.LJIIJ()
            java.lang.String r0 = "draft"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r8.LIZLLL
            java.util.List r1 = r9.getData()
            boolean r0 = X.C77413UZt.LJIILL(r1)
            java.lang.String r4 = ""
            if (r0 == 0) goto L41
            r0 = r4
        L2a:
            r4 = r0
        L2b:
            r5.stickersFromDraftVideos = r4
        L2d:
            java.util.List r0 = r9.getData()
            java.lang.Object r0 = X.ORZ.LJLLJ(r0)
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            boolean r0 = X.ID0.LJIIZILJ(r0)
            if (r0 == 0) goto L78
            r8.LJIIIIZZ(r9, r10)
            return r6
        L41:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        L4a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate r0 = (com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate) r0
            java.lang.String r1 = r0.getEffectId()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L4a
            int r0 = r3.length()
            if (r0 != 0) goto L6e
            r0 = r4
        L67:
            r3.append(r0)
            r3.append(r1)
            goto L4a
        L6e:
            java.lang.String r0 = ","
            goto L67
        L71:
            java.lang.String r0 = r3.toString()
            if (r0 != 0) goto L2a
            goto L2b
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44436HcG.LJIIIZ(com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse, java.lang.StringBuilder):boolean");
    }

    public final void LJIIJJI(EffectListResponse effectListResponse, StringBuilder sb) {
        if (!this.LIZ.invoke().LJ) {
            this.LJI.postDelayed(new ARunnableS18S0300000_7(this, effectListResponse, sb, 8), 2000L);
        } else {
            LJIIIIZZ(effectListResponse, sb);
        }
    }

    public C44436HcG(InterfaceC65784Pro stateSupplier, C29S c29s, C46193IAz stickerApiComponent, ShortVideoContext shortVideoContext, HXT challengeStickerListener, C82622Wbi diContainer) {
        o.LJIIIZ(stateSupplier, "stateSupplier");
        o.LJIIIZ(stickerApiComponent, "stickerApiComponent");
        o.LJIIIZ(challengeStickerListener, "challengeStickerListener");
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = stateSupplier;
        this.LIZIZ = c29s;
        this.LIZJ = stickerApiComponent;
        this.LIZLLL = shortVideoContext;
        this.LJ = challengeStickerListener;
        this.LJFF = diContainer;
        this.LJI = new SafeHandler((LifecycleOwner) diContainer.LJ(LifecycleOwner.class, null));
        this.LJII = (WLB) diContainer.LJ(WLB.class, null);
        this.LJIIIIZZ = new C29901Fi<>();
    }
}
