package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorBeautyAbGroupSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.google.gson.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42671lv implements InterfaceC31971Nh {
    public static volatile C42671lv LJIILL;
    public C08780Wc LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public String LJ;
    public final java.util.Map<LiveEffect, java.util.Map<String, Float>> LJI = new HashMap();
    public final java.util.Map<String, java.util.Map<String, Float>> LJIIL = new HashMap();
    public final List<C0WD> LJIIIIZZ = new ArrayList();
    public final java.util.Map<String, List<String>> LJIIJJI = InterfaceC30442Bx8.LJJJIL.LIZJ();
    public final java.util.Map<String, java.util.Map<String, Float>> LJIILIIL = InterfaceC30442Bx8.LJJJJ.LIZJ();
    public final java.util.Map<String, List<String>> LJIIJ = new HashMap();
    public final java.util.Map<String, java.util.Map<String, LiveEffect>> LJFF = new HashMap();
    public final List<LiveEffect> LJII = new ArrayList();
    public final List<C0WC> LJIIIZ = new ArrayList();
    public final java.util.Map<String, Integer> LJIILJJIL = new HashMap();

    @Override // X.C0WF
    public final String LJI() {
        return null;
    }

    @Override // X.C0WF
    public final void LJIILIIL() {
        LiveEffect liveEffect;
        String str;
        LiveEffect liveEffect2;
        LJJIJLIJ(true);
        for (java.util.Map map : new HashMap(this.LJI).values()) {
            if (map != null && map.size() != 0) {
                for (String str2 : map.keySet()) {
                    if (map.get(str2) != null) {
                        float floatValue = ((Float) map.get(str2)).floatValue();
                        Iterator it = ((ArrayList) this.LJII).iterator();
                        while (it.hasNext()) {
                            LiveEffect liveEffect3 = (LiveEffect) it.next();
                            if (!C32151Nz.LJJIIJZLJL(liveEffect3.updateKeys) && liveEffect3.updateKeys.contains(str2) && this.LIZIZ != null && !C32151Nz.LJJIIJZLJL(liveEffect3.updateKeys) && liveEffect3.updateKeys.contains(str2)) {
                                this.LIZIZ.LIZJ.composerUpdateNode(liveEffect3.unzipPath, str2, floatValue);
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("updateTagValue path:");
                                YE1.LIZLLL(LIZ, liveEffect3.unzipPath, " tag:", str2, " value:");
                                LIZ.append(floatValue);
                                C0NB.LIZIZ("LiveComposerManager", X1D.LIZIZ(LIZ));
                                Iterator it2 = ((HashMap) this.LJI).keySet().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        liveEffect = (LiveEffect) it2.next();
                                        if (liveEffect.unzipPath.equals(liveEffect3.unzipPath) && liveEffect.updateKeys.contains(str2)) {
                                            java.util.Map map2 = (java.util.Map) ((HashMap) this.LJI).get(liveEffect);
                                            if (map2 != null) {
                                                map2.put(str2, Float.valueOf(floatValue));
                                            }
                                        }
                                    } else {
                                        liveEffect = null;
                                        ((HashMap) this.LJI).put(liveEffect3, new HashMap());
                                        java.util.Map map3 = (java.util.Map) ((HashMap) this.LJI).get(liveEffect3);
                                        if (map3 != null) {
                                            map3.put(str2, Float.valueOf(floatValue));
                                        }
                                    }
                                }
                                Iterator it3 = ((HashMap) this.LJFF).keySet().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        str = (String) it3.next();
                                        java.util.Map map4 = (java.util.Map) ((HashMap) this.LJFF).get(str);
                                        if (liveEffect != null) {
                                            liveEffect2 = liveEffect;
                                        } else {
                                            liveEffect2 = liveEffect3;
                                        }
                                        if (map4.containsValue(liveEffect2)) {
                                            break;
                                        }
                                    } else {
                                        str = "";
                                        break;
                                    }
                                }
                                LJJIJ(str, liveEffect3, str2, floatValue);
                                if (!((ArrayList) this.LJIIIZ).isEmpty()) {
                                    Iterator it4 = ((ArrayList) this.LJIIIZ).iterator();
                                    while (it4.hasNext()) {
                                        C0WC c0wc = (C0WC) it4.next();
                                        if (c0wc != null) {
                                            c0wc.LIZ();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.C0WF
    public final void LJJ(String str) {
    }

    @Override // X.C0WF
    public final void setRenderCacheString(String str, String str2) {
    }

    @Override // X.C0WF
    public final void release() {
        C0WB c0wb;
        if (!this.LJIIJJI.isEmpty()) {
            ((HashMap) this.LJIIJ).putAll(this.LJIIJJI);
        }
        this.LIZJ = true;
        InterfaceC30442Bx8.LJJJIL.LIZ(this.LJIIJ);
        InterfaceC30442Bx8.LJJJJ.LIZ(this.LJIIL);
        C08780Wc c08780Wc = this.LIZIZ;
        if (c08780Wc != null && (c0wb = c08780Wc.LIZJ) != null) {
            try {
                c0wb.LJIIJJI(new String[0]);
                this.LIZIZ.LIZJ.hide();
            } catch (Throwable th) {
                C0NB.LJI("LiveComposerManager", th);
            }
        }
        this.LJIIJJI.clear();
        this.LJIIJJI.putAll(this.LJIIJ);
        this.LJIILIIL.clear();
        this.LJIILIIL.putAll(this.LJIIL);
        ((HashMap) this.LJFF).clear();
        ((ArrayList) this.LJIIIIZZ).clear();
        ((ArrayList) this.LJIIIZ).clear();
        ((HashMap) this.LJIIJ).clear();
        ((ArrayList) this.LJII).clear();
        ((HashMap) this.LJI).clear();
        ((HashMap) this.LJIIL).clear();
        this.LIZIZ = null;
    }

    @Override // X.C0WF
    public final String LJII() {
        return this.LJ;
    }

    @Override // X.C0WF
    public final String LJIILLIIL() {
        return this.LIZLLL;
    }

    @Override // X.C0WF
    public final java.util.Map<String, java.util.Map<String, LiveEffect>> Z5() {
        return this.LJFF;
    }

    @Override // X.InterfaceC31971Nh, X.C0WF
    public final List<LiveEffect> LIZ(String str) {
        if (((HashMap) this.LJFF).containsKey(str)) {
            return new ArrayList(((java.util.Map) ((HashMap) this.LJFF).get(str)).values());
        }
        return new ArrayList();
    }

    @Override // X.C0WF
    public final void LIZJ(String str) {
        this.LJ = str;
    }

    @Override // X.InterfaceC31971Nh, X.C0WF
    public final void LIZLLL(String str) {
        if (((HashMap) this.LJFF).containsKey(str) && ((java.util.Map) ((HashMap) this.LJFF).get(str)).size() > 0) {
            Iterator it = ((java.util.Map) ((HashMap) this.LJFF).get(str)).values().iterator();
            while (it.hasNext()) {
                LJJIJL((LiveEffect) it.next(), str);
            }
            ((HashMap) this.LJFF).remove(str);
            LJJIJLIJ(false);
            Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
            while (it2.hasNext()) {
                ((C0WD) it2.next()).Z00(null, str, false);
            }
        }
    }

    @Override // X.C0WF
    public final void LJIIIZ(C0WD c0wd) {
        if (c0wd != null && !((ArrayList) this.LJIIIIZZ).contains(c0wd)) {
            ((ArrayList) this.LJIIIIZZ).add(c0wd);
        }
    }

    @Override // X.InterfaceC31971Nh
    public final void LJIIJ(EffectChannelResponse effectChannelResponse) {
        java.util.Map<String, List<String>> map;
        if (this.LIZIZ == null) {
            return;
        }
        String panel = effectChannelResponse.getPanel();
        if (!this.LIZIZ.LIZIZ.contains(panel) || (map = this.LJIIJJI) == null || map.isEmpty() || !this.LJIIJJI.containsKey(panel)) {
            return;
        }
        List<String> list = this.LJIIJJI.get(panel);
        for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
            if (effect != null) {
                if (effect.getEffectType() == 1 && !C79004UzY.LJJIFFI(effect.getChildEffects())) {
                    for (int i = 0; i < effect.getChildEffects().size(); i++) {
                        Effect effect2 = (Effect) ListProtector.get(effect.getChildEffects(), i);
                        if (list != null && effect2 != null && list.contains(effect2.getUnzipPath())) {
                            ((HashMap) this.LJIILJJIL).put(effect.getEffectId(), Integer.valueOf(i));
                        }
                        LJJIJIIJIL(effect2, panel, list);
                    }
                } else {
                    LJJIJIIJIL(effect, panel, list);
                }
            }
        }
        this.LJIIJJI.remove(panel);
    }

    @Override // X.C0WF
    public final void LJIILJJIL(C0WD c0wd) {
        if (c0wd == null) {
            return;
        }
        ((ArrayList) this.LJIIIIZZ).remove(c0wd);
    }

    @Override // X.C0WF
    public final void LJIIZILJ(C0WC c0wc) {
        if (c0wc == null) {
            return;
        }
        ((ArrayList) this.LJIIIZ).remove(c0wc);
    }

    @Override // X.C0WF
    public final void LJIJJ(C0WC c0wc) {
        if (c0wc != null && !((ArrayList) this.LJIIIZ).contains(c0wc)) {
            ((ArrayList) this.LJIIIZ).add(c0wc);
        }
    }

    @Override // X.C0WF
    public final void LJIJJLI(String str) {
        this.LIZLLL = str;
    }

    @Override // X.C0WF
    public final void LJJIIZ(C08780Wc c08780Wc) {
        this.LIZIZ = c08780Wc;
        this.LIZJ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(boolean r14) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42671lv.LJJIJLIJ(boolean):void");
    }

    public static final boolean LJJIJIL(List<Integer> list, List<Integer> list2) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (list2.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC31971Nh, X.C0WF
    public final void LIZIZ(LiveEffect liveEffect, String str) {
        if (liveEffect == null || this.LIZIZ == null) {
            return;
        }
        if (!((HashMap) this.LJFF).containsKey(str)) {
            ((HashMap) this.LJFF).put(str, new HashMap());
        }
        java.util.Map map = (java.util.Map) ((HashMap) this.LJFF).get(str);
        if (map.containsKey(liveEffect.unzipPath)) {
            ((LiveEffect) map.get(liveEffect.unzipPath)).updateKeys.addAll(liveEffect.updateKeys);
            return;
        }
        map.put(liveEffect.unzipPath, liveEffect);
        if (this.LIZIZ.LIZIZ.contains(str)) {
            LJJIJIIJI(liveEffect, str);
        }
        LJJIJLIJ(false);
        Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it.hasNext()) {
            ((C0WD) it.next()).Z00(liveEffect, str, true);
        }
    }

    @Override // X.InterfaceC31971Nh
    public final void LJJIIZI(float f, String str) {
        LiveEffect liveEffect;
        String str2;
        LiveEffect liveEffect2;
        if (this.LIZIZ == null) {
            return;
        }
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (it.hasNext()) {
            LiveEffect liveEffect3 = (LiveEffect) it.next();
            if (!C32151Nz.LJJIIJZLJL(liveEffect3.updateKeys) && liveEffect3.updateKeys.contains(str)) {
                if (((HashMap) this.LJI).containsKey(liveEffect3) && ((java.util.Map) ((HashMap) this.LJI).get(liveEffect3)).containsKey(str) && ((Float) ((java.util.Map) ((HashMap) this.LJI).get(liveEffect3)).get(str)).equals(Float.valueOf(f))) {
                    return;
                }
                this.LIZIZ.LIZJ.composerUpdateNode(liveEffect3.unzipPath, str, f);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateTagValue path:");
                YE1.LIZLLL(LIZ, liveEffect3.unzipPath, " tag:", str, " value:");
                LIZ.append(f);
                C0NB.LIZIZ("LiveComposerManager", X1D.LIZIZ(LIZ));
                Iterator it2 = ((HashMap) this.LJI).keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        liveEffect = (LiveEffect) it2.next();
                        if (liveEffect.unzipPath.equals(liveEffect3.unzipPath) && liveEffect.updateKeys.contains(str)) {
                            java.util.Map map = (java.util.Map) ((HashMap) this.LJI).get(liveEffect);
                            if (map != null) {
                                map.put(str, Float.valueOf(f));
                            }
                        }
                    } else {
                        liveEffect = null;
                        ((HashMap) this.LJI).put(liveEffect3, new HashMap());
                        java.util.Map map2 = (java.util.Map) ((HashMap) this.LJI).get(liveEffect3);
                        if (map2 != null) {
                            map2.put(str, Float.valueOf(f));
                        }
                    }
                }
                Iterator it3 = ((HashMap) this.LJFF).keySet().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        str2 = (String) it3.next();
                        java.util.Map map3 = (java.util.Map) ((HashMap) this.LJFF).get(str2);
                        if (liveEffect != null) {
                            liveEffect2 = liveEffect;
                        } else {
                            liveEffect2 = liveEffect3;
                        }
                        if (map3.containsValue(liveEffect2)) {
                            break;
                        }
                    } else {
                        str2 = "";
                        break;
                    }
                }
                LJJIJ(str2, liveEffect3, str, f);
                if (!((ArrayList) this.LJIIIZ).isEmpty()) {
                    Iterator it4 = ((ArrayList) this.LJIIIZ).iterator();
                    while (it4.hasNext()) {
                        C0WC c0wc = (C0WC) it4.next();
                        if (c0wc != null) {
                            c0wc.LIZ();
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void LJJIJIIJI(LiveEffect liveEffect, String str) {
        if (this.LIZIZ == null || liveEffect == null) {
            return;
        }
        if (!((HashMap) this.LJIIJ).containsKey(str)) {
            ((HashMap) this.LJIIJ).put(str, new ArrayList());
        }
        if (((List) ((HashMap) this.LJIIJ).get(str)).contains(liveEffect.unzipPath) || C38354F3m.LJ(liveEffect.unzipPath) || !this.LIZIZ.LIZIZ.contains(str)) {
            return;
        }
        ((List) ((HashMap) this.LJIIJ).get(str)).add(liveEffect.unzipPath);
    }

    public final void LJJIJL(LiveEffect liveEffect, String str) {
        if (((HashMap) this.LJIIJ).containsKey(str) && liveEffect != null && !C38354F3m.LJ(liveEffect.unzipPath)) {
            ((List) ((HashMap) this.LJIIJ).get(str)).remove(liveEffect.unzipPath);
        }
    }

    @Override // X.C0WF
    public final void LJJIIJ(String str, LiveEffect liveEffect, LiveEffect liveEffect2) {
        if (this.LIZIZ == null) {
            return;
        }
        if (liveEffect != null && ((HashMap) this.LJFF).containsKey(str) && ((java.util.Map) ((HashMap) this.LJFF).get(str)).size() > 0) {
            ((java.util.Map) ((HashMap) this.LJFF).get(str)).remove(liveEffect.unzipPath);
            if (this.LIZIZ.LIZIZ.contains(str)) {
                LJJIJL(liveEffect, str);
            }
            Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
            while (it.hasNext()) {
                ((C0WD) it.next()).Z00(liveEffect, str, false);
            }
        }
        if (liveEffect2 != null) {
            if (!((HashMap) this.LJFF).containsKey(str)) {
                ((HashMap) this.LJFF).put(str, new HashMap());
            }
            java.util.Map map = (java.util.Map) ((HashMap) this.LJFF).get(str);
            if (map.containsKey(liveEffect2.unzipPath)) {
                ((LiveEffect) map.get(liveEffect2.unzipPath)).updateKeys.addAll(liveEffect2.updateKeys);
                return;
            }
            map.put(liveEffect2.unzipPath, liveEffect2);
            if (this.LIZIZ.LIZIZ.contains(str)) {
                LJJIJIIJI(liveEffect2, str);
            }
            Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
            while (it2.hasNext()) {
                ((C0WD) it2.next()).Z00(liveEffect2, str, true);
            }
        } else if (liveEffect == null) {
            return;
        }
        LJJIJLIJ(false);
    }

    public final void LJJIJIIJIL(Effect effect, String str, List<String> list) {
        Float f;
        if (effect == null || !list.contains(effect.getUnzipPath())) {
            return;
        }
        try {
            new o();
            m LJIIZILJ = o.LIZ(effect.getExtra()).LJIIZILJ();
            if (LJIIZILJ.LJJIJLIJ("ab_group")) {
                if (LiveAnchorBeautyAbGroupSetting.INSTANCE.getValue() != LJIIZILJ.LJJIJ("ab_group").LJIILJJIL()) {
                    return;
                }
            }
        } catch (Exception e) {
            C0NB.LJI("LiveComposerManager", e);
        }
        if (this.LJIILIIL.containsKey(effect.getUnzipPath())) {
            LiveEffect LIZIZ = C0LT.LIZIZ(effect);
            java.util.Map<String, Float> map = this.LJIILIIL.get(effect.getUnzipPath());
            LIZIZ.updateKeys.addAll(map.keySet());
            LIZIZ(LIZIZ, str);
            for (String str2 : map.keySet()) {
                if (((HashMap) this.LJIIL).containsKey(effect.getUnzipPath())) {
                    if (!((java.util.Map) ((HashMap) this.LJIIL).get(effect.getUnzipPath())).containsKey(str2)) {
                    }
                }
                String str3 = str2;
                if (effect.getExtra().contains(str3)) {
                    LIZIZ.updateKeys.add(str3);
                    Object obj = map.get(str2);
                    if (obj instanceof Double) {
                        f = Float.valueOf(((Double) obj).floatValue());
                    } else {
                        f = (Float) obj;
                    }
                    LJJIIZI(f.floatValue(), str3);
                }
            }
            return;
        }
        LIZIZ(C0LT.LIZIZ(effect), str);
    }

    public final void LJJIJ(String str, LiveEffect liveEffect, String str2, float f) {
        if (!((HashMap) this.LJIIJ).containsKey(str) || !((List) ((HashMap) this.LJIIJ).get(str)).contains(liveEffect.unzipPath)) {
            return;
        }
        if (!((HashMap) this.LJIIL).containsKey(liveEffect.unzipPath)) {
            ((HashMap) this.LJIIL).put(liveEffect.unzipPath, new HashMap());
        }
        ((java.util.Map) ((HashMap) this.LJIIL).get(liveEffect.unzipPath)).put(str2, Float.valueOf(f));
    }
}
