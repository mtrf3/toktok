package com.ss.android.ugc.aweme.service;

import X.AGL;
import X.AGM;
import X.AGN;
import X.AGP;
import X.AnonymousClass845;
import X.C19N;
import X.C2U8;
import X.C32I;
import X.C58096Mr6;
import X.C65352Pkq;
import X.C65429Pm5;
import X.C65776Prg;
import X.C72972SkS;
import X.C76800UCe;
import X.ORY;
import X.ORZ;
import X.X1D;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.assem.CaptionMainActivityAssem;
import defpackage.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class CaptionKevaServiceImpl implements ICaptionKevaService {
    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final C65776Prg LJIILIIL() {
        return C65352Pkq.LIZ(CaptionMainActivityAssem.class);
    }

    public static ICaptionKevaService LJJJJI() {
        Object LIZ = C58096Mr6.LIZ(ICaptionKevaService.class, false);
        if (LIZ != null) {
            return (ICaptionKevaService) LIZ;
        }
        if (C58096Mr6.P4 == null) {
            synchronized (ICaptionKevaService.class) {
                if (C58096Mr6.P4 == null) {
                    C58096Mr6.P4 = new CaptionKevaServiceImpl();
                }
            }
        }
        return C58096Mr6.P4;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LIZ() {
        return AGL.LIZ.getBoolean("user_has_interacted_with_guided_caption_tooltips", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r2.getBoolean("hide_caption", true) == false) goto L6;
     */
    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r3 = this;
            com.bytedance.keva.Keva r2 = X.AGL.LIZ
            boolean r0 = X.AGL.LIZIZ()
            if (r0 == 0) goto L18
            java.lang.String r0 = "hide_caption"
            r1 = 1
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L18
        L11:
            java.lang.String r0 = "key_is_caption_on_for_native_lang"
            boolean r0 = r2.getBoolean(r0, r1)
            return r0
        L18:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl.LIZIZ():boolean");
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LIZJ() {
        return AGL.LIZ.getBoolean("key_is_description_translation_toggle_on", ((Boolean) AGP.LIZ.getValue()).booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJ() {
        if (AGL.LIZ.getBoolean("hide_caption", true) || !AGL.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final int LJFF() {
        return AGL.LIZ.getInt("key_hide_autogenerated_caption_has_been_clicked", 0);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJI() {
        return AGL.LIZ.getBoolean("hide_caption", true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJIIIIZZ() {
        return AGL.LIZ.getBoolean("key_autogenerated_caption_has_been_clicked", false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final int LJIIL() {
        return AGL.LIZ.getInt("user_guided_caption_tooltip_shown_count", 0);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final long LJIILLIIL() {
        return AGL.LIZ.getLong("user_last_shown_guided_caption_tooltip_time", 0L);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final String LJIIZILJ() {
        String string = AGL.LIZ.getString("show_original_caption_video_id", "");
        o.LJIIIIZZ(string, "keva.getString(KEY_SHOW_…NAL_CAPTION_VIDEO_ID, \"\")");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIJJLI() {
        AGL.LIZ.storeBoolean("key_autogenerated_caption_has_been_clicked", true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIFFI() {
        return AGL.LIZ.getBoolean("key_is_caption_on_for_foreign_lang", ((Boolean) AGN.LIZ.getValue()).booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJIIJZLJL() {
        C19N.LIZJ(AGL.LIZ, "key_hide_autogenerated_caption_has_been_clicked", 0, 1, "key_hide_autogenerated_caption_has_been_clicked");
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIIZI() {
        return AGL.LIZ.getBoolean("key_is_master_translation_toggle_on", ((Boolean) AGN.LIZ.getValue()).booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIJIIJI() {
        return AGL.LIZ.getBoolean("key_has_shown_do_not_translate_toggle_prompt", false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJIJL() {
        AGL.LIZ.storeStringArray("key_autogenerated_caption_toggle_pending_list", new String[0]);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJIJLIJ() {
        AGL.LIZIZ.storeBoolean("edit_caption_hint_clicked", true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final Map<String, String> LJJIL() {
        String[] array = AGL.LIZ.getStringArray(AGL.LIZLLL, new String[0]);
        HashMap hashMap = new HashMap();
        o.LJIIIIZZ(array, "array");
        ArrayList arrayList = new ArrayList(array.length);
        for (String it : array) {
            o.LJIIIIZZ(it, "it");
            Object LJLLLL = ORZ.LJLLLL(s.LJLJJL(it, new String[]{","}, 0, 6));
            Object LJLLLLLL = ORZ.LJLLLLLL(1, s.LJLJJL(it, new String[]{","}, 0, 6));
            if (LJLLLL != null && LJLLLLLL != null) {
                hashMap.put(LJLLLL, LJLLLLLL);
            }
            arrayList.add(C76800UCe.LIZ);
        }
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJJIL() {
        return AGL.LIZ.getBoolean("key_is_sticker_translation_toggle_on", false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJI() {
        return AGL.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJII(int i) {
        AGL.LIZ.storeInt("user_guided_caption_tooltip_shown_count", i);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIIIZ(boolean z) {
        AGL.LIZ.storeBoolean("key_has_shown_do_not_translate_toggle_prompt", z);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIIJ(String str) {
        String LIZ = AGL.LIZ(str);
        C19N.LIZJ(AGL.LIZIZ, LIZ, 0, 1, LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIIJJI(boolean z) {
        AGL.LIZ.storeBoolean("key_is_caption_on_for_native_lang", z);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIILJJIL(boolean z) {
        AGL.LIZ.storeBoolean("key_is_master_translation_toggle_on", z);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIILL(boolean z) {
        AGL.LIZ.storeBoolean("user_has_interacted_with_guided_caption_tooltips", z);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final int LJIJ(int i) {
        return AGL.LIZ.getInt("search_video_card_caption_switch", i);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJIJI(String str) {
        if (AGL.LIZIZ.getInt(AGL.LIZJ(str), 0) > 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIJJ(long j) {
        AGL.LIZ.storeLong("user_last_shown_guided_caption_tooltip_time", j);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJIL(boolean z) {
        AGL.LIZ.storeBoolean("key_autogenerated_caption_on_bool", z);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJ(long j) {
        AGL.LIZJ.add(Long.valueOf(j));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJII(String str) {
        AGL.LIZ.storeString("show_original_caption_video_id", str);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJIII(boolean z) {
        AGL.LIZ.storeBoolean("hide_caption", z);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIIJ(String str) {
        if (AnonymousClass845.LIZ) {
            Keva keva = AGL.LIZIZ;
            if (keva.getBoolean("edit_caption_hint_clicked", false) || keva.getInt(AGL.LIZ(str), 0) > 2) {
                return false;
            }
        } else {
            Keva keva2 = AGL.LIZIZ;
            if (keva2.getInt(AGL.LIZ(str), 0) > 2 || m0.LIZLLL("exhaust_edit_caption_hint_", str, keva2, false)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJIIZ(int i) {
        AGL.LIZ.storeInt("search_video_card_caption_switch", i);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJIJ(boolean z) {
        AGL.LIZ.storeBoolean("key_is_sticker_translation_toggle_on", z);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final boolean LJJIJIIJIL(String str) {
        if (str == null) {
            return false;
        }
        String[] stringArray = AGL.LIZ.getStringArray("key_autogenerated_caption_toggle_pending_list", new String[0]);
        o.LJIIIIZZ(stringArray, "stringArray");
        return ORY.LJJIJIIJIL(str, stringArray);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJIJIL(String str) {
        Keva keva = AGL.LIZIZ;
        keva.storeInt(AGL.LIZJ(str), keva.getInt(AGL.LIZJ(str), 0) + 1);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJIZ(String str) {
        C65429Pm5.LJ("exhaust_edit_caption_hint_", str, AGL.LIZIZ, true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJ(boolean z) {
        AGL.LIZ.storeBoolean("key_is_caption_on_for_foreign_lang", z);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJI(boolean z) {
        AGL.LIZ.storeBoolean("key_is_description_translation_toggle_on", z);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LJJJJ(Map<String, String> map) {
        Keva keva = AGL.LIZ;
        String str = AGL.LIZLLL;
        HashMap hashMap = (HashMap) map;
        Set<String> keySet = hashMap.keySet();
        ArrayList arrayList = new ArrayList(C32I.LJJL(keySet, 10));
        for (String str2 : keySet) {
            StringBuilder LJFF = C72972SkS.LJFF(str2, ',');
            LJFF.append((String) hashMap.get(str2));
            arrayList.add(X1D.LIZIZ(LJFF));
        }
        keva.storeStringArray(str, (String[]) arrayList.toArray(new String[0]));
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionKevaService
    public final void LIZLLL(String str, boolean z) {
        C2U8.LIZ(new AGM(str));
        Keva keva = AGL.LIZ;
        String[] stringArray = keva.getStringArray("key_autogenerated_caption_toggle_pending_list", new String[0]);
        o.LJIIIIZZ(stringArray, "keva.getStringArray(KEY_…NDING_LIST, emptyArray())");
        List LJLIIIL = ORY.LJLIIIL(stringArray);
        if (z) {
            ((ArrayList) LJLIIIL).remove(str);
        } else {
            ((ArrayList) LJLIIIL).add(str);
        }
        keva.storeStringArray("key_autogenerated_caption_toggle_pending_list", (String[]) ((ArrayList) LJLIIIL).toArray(new String[0]));
    }
}