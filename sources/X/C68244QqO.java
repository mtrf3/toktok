package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: X.QqO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68244QqO extends AbstractC68187QpT implements InterfaceC68064QnU {
    public final C1HQ LIZLLL;
    public final C1HQ LJ;
    public final C1HQ LJFF;
    public final C1HQ LJI;
    public final C1HQ LJII;
    public final C1HQ LJIIIIZZ;
    public final C68275Qqt LJIIIZ;
    public final C61689OIz LJIIJ;
    public final C1HQ LJIIJJI;
    public final C1HQ LJIIL;
    public final C1HQ LJIILIIL;

    @Override // X.AbstractC68187QpT
    public final void LJIIIIZZ() {
    }

    public C68244QqO(C68241QqL c68241QqL) {
        super(c68241QqL);
        this.LIZLLL = new C1HQ();
        this.LJ = new C1HQ();
        this.LJFF = new C1HQ();
        this.LJI = new C1HQ();
        this.LJII = new C1HQ();
        this.LJIIJJI = new C1HQ();
        this.LJIIL = new C1HQ();
        this.LJIILIIL = new C1HQ();
        this.LJIIIIZZ = new C1HQ();
        this.LJIIIZ = new C68275Qqt(this);
        this.LJIIJ = new C61689OIz(this);
    }

    public static final C1HQ LJIILIIL(C68256Qqa c68256Qqa) {
        C1HQ c1hq = new C1HQ();
        for (C68283Qr1 c68283Qr1 : c68256Qqa.zzi) {
            c1hq.put(c68283Qr1.zzf, c68283Qr1.zzg);
        }
        return c1hq;
    }

    public final void LJIIJJI(String str) {
        Cursor cursor;
        String str2;
        LJI();
        LJFF();
        QH7.LJI(str);
        if (this.LJII.getOrDefault(str, null) == 0) {
            C68242QqM c68242QqM = this.LIZIZ.LIZJ;
            C68241QqL.LJJIJIIJI(c68242QqM);
            QH7.LJI(str);
            c68242QqM.LJFF();
            c68242QqM.LJI();
            try {
                cursor = c68242QqM.LJJI().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                        if (cursor.moveToFirst()) {
                            byte[] blob = cursor.getBlob(0);
                            String string = cursor.getString(1);
                            if (c68242QqM.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJLJLJ)) {
                                str2 = cursor.getString(2);
                            } else {
                                str2 = null;
                            }
                            if (cursor.moveToNext()) {
                                c68242QqM.LIZ.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str), "Got multiple records for app config, expected one. appId");
                            }
                            if (blob != null) {
                                C64912Pdk c64912Pdk = new C64912Pdk(string, blob, str2);
                                cursor.close();
                                C68299QrH c68299QrH = (C68299QrH) LJIIIZ(str, (byte[]) c64912Pdk.LIZIZ).LJIIJJI();
                                LJIIJ(str, c68299QrH);
                                this.LIZLLL.put(str, LJIILIIL((C68256Qqa) c68299QrH.LJIIIIZZ()));
                                this.LJII.put(str, c68299QrH.LJIIIIZZ());
                                LJIIL(str, (C68256Qqa) c68299QrH.LJIIIIZZ());
                                this.LJIIJJI.put(str, ((C68256Qqa) c68299QrH.LJLILLLLZI).zzp);
                                this.LJIIL.put(str, c64912Pdk.LIZ);
                                this.LJIILIIL.put(str, c64912Pdk.LIZJ);
                                return;
                            }
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        c68242QqM.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str), e, "Error querying remote config. appId");
                        if (cursor != null) {
                            cursor.close();
                        }
                        this.LIZLLL.put(str, null);
                        this.LJFF.put(str, null);
                        this.LJ.put(str, null);
                        this.LJI.put(str, null);
                        this.LJII.put(str, null);
                        this.LJIIJJI.put(str, null);
                        this.LJIIL.put(str, null);
                        this.LJIILIIL.put(str, null);
                        this.LJIIIIZZ.put(str, null);
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th2) {
                throw th2;
            }
            cursor.close();
            this.LIZLLL.put(str, null);
            this.LJFF.put(str, null);
            this.LJ.put(str, null);
            this.LJI.put(str, null);
            this.LJII.put(str, null);
            this.LJIIJJI.put(str, null);
            this.LJIIL.put(str, null);
            this.LJIILIIL.put(str, null);
            this.LJIIIIZZ.put(str, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C68256Qqa LJIILL(String str) {
        LJI();
        LJFF();
        QH7.LJI(str);
        LJIIJJI(str);
        return (C68256Qqa) this.LJII.getOrDefault(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LJIILLIIL(String str) {
        LJFF();
        LJIIJJI(str);
        return (String) this.LJIIJJI.getOrDefault(str, null);
    }

    public final java.util.Set LJIIZILJ(String str) {
        LJFF();
        LJIIJJI(str);
        return (java.util.Set) this.LJ.getOrDefault(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIJ(String str) {
        C68256Qqa c68256Qqa;
        if (TextUtils.isEmpty(str) || (c68256Qqa = (C68256Qqa) this.LJII.getOrDefault(str, null)) == null || c68256Qqa.zzn.size() == 0) {
            return false;
        }
        return true;
    }

    public final boolean LJIL(String str) {
        LJFF();
        LJIIJJI(str);
        if (this.LJ.getOrDefault(str, null) != 0 && ((java.util.Set) this.LJ.getOrDefault(str, null)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean LJJ(String str) {
        LJFF();
        LJIIJJI(str);
        if (this.LJ.getOrDefault(str, null) != 0 && (((java.util.Set) this.LJ.getOrDefault(str, null)).contains("device_model") || ((java.util.Set) this.LJ.getOrDefault(str, null)).contains("device_info"))) {
            return true;
        }
        return false;
    }

    public final boolean LJJI(String str) {
        LJFF();
        LJIIJJI(str);
        if (this.LJ.getOrDefault(str, null) != 0 && ((java.util.Set) this.LJ.getOrDefault(str, null)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    public final boolean LJJIFFI(String str) {
        LJFF();
        LJIIJJI(str);
        if (this.LJ.getOrDefault(str, null) != 0 && ((java.util.Set) this.LJ.getOrDefault(str, null)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    public final boolean LJJII(String str) {
        LJFF();
        LJIIJJI(str);
        if (this.LJ.getOrDefault(str, null) != 0 && (((java.util.Set) this.LJ.getOrDefault(str, null)).contains("os_version") || ((java.util.Set) this.LJ.getOrDefault(str, null)).contains("device_info"))) {
            return true;
        }
        return false;
    }

    public final boolean LJJIII(String str) {
        LJFF();
        LJIIJJI(str);
        if (this.LJ.getOrDefault(str, null) != 0 && ((java.util.Set) this.LJ.getOrDefault(str, null)).contains("user_id")) {
            return true;
        }
        return false;
    }

    public final C68256Qqa LJIIIZ(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return C68256Qqa.LJIL();
        }
        try {
            C68299QrH LJIJJ = C68256Qqa.LJIJJ();
            C68243QqN.LJJI(LJIJJ, bArr);
            C68256Qqa c68256Qqa = (C68256Qqa) LJIJJ.LJIIIIZZ();
            C67281Qar c67281Qar = this.LIZ.LIZJ().LJIILIIL;
            String str2 = null;
            if (c68256Qqa.LJJIFFI()) {
                l = Long.valueOf(c68256Qqa.zzf);
            } else {
                l = null;
            }
            if (c68256Qqa.LJJI()) {
                str2 = c68256Qqa.zzg;
            }
            c67281Qar.LIZJ(l, str2, "Parsed config. version, gmp_app_id");
            return c68256Qqa;
        } catch (C87144YIa e) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZJ(C67280Qaq.LJIIIZ(str), e, "Unable to merge remote config. appId");
            return C68256Qqa.LJIL();
        } catch (RuntimeException e2) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZJ(C67280Qaq.LJIIIZ(str), e2, "Unable to merge remote config. appId");
            return C68256Qqa.LJIL();
        }
    }

    public final void LJIIJ(String str, C68299QrH c68299QrH) {
        HashSet hashSet = new HashSet();
        C1HQ c1hq = new C1HQ();
        C1HQ c1hq2 = new C1HQ();
        C1HQ c1hq3 = new C1HQ();
        C68580Qvo.LIZIZ();
        if (this.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJL)) {
            Iterator it = Collections.unmodifiableList(((C68256Qqa) c68299QrH.LJLILLLLZI).zzo).iterator();
            while (it.hasNext()) {
                hashSet.add(((C68333Qrp) it.next()).zzf);
            }
        }
        for (int i = 0; i < ((C68256Qqa) c68299QrH.LJLILLLLZI).LJIJ(); i++) {
            C68294QrC c68294QrC = (C68294QrC) ((C68256Qqa) c68299QrH.LJLILLLLZI).LJIJI(i).LJIIJJI();
            if (c68294QrC.LJIIJJI().isEmpty()) {
                this.LIZ.LIZJ().LJIIIIZZ.LIZ("EventConfig contained null event name");
            } else {
                String LJIIJJI = c68294QrC.LJIIJJI();
                String LJJIIZI = C78540Us4.LJJIIZI(c68294QrC.LJIIJJI(), C68107QoB.LIZ, C68107QoB.LIZJ);
                if (!TextUtils.isEmpty(LJJIIZI)) {
                    if (c68294QrC.LJLJI) {
                        c68294QrC.LJIIJ();
                        c68294QrC.LJLJI = false;
                    }
                    C68272Qqq.LJIJI((C68272Qqq) c68294QrC.LJLILLLLZI, LJJIIZI);
                    if (c68299QrH.LJLJI) {
                        c68299QrH.LJIIJ();
                        c68299QrH.LJLJI = false;
                    }
                    C68256Qqa.LJJ((C68256Qqa) c68299QrH.LJLILLLLZI, i, (C68272Qqq) c68294QrC.LJIIIIZZ());
                }
                if (((C68272Qqq) c68294QrC.LJLILLLLZI).LJIJJ() && ((C68272Qqq) c68294QrC.LJLILLLLZI).zzg) {
                    c1hq.put(LJIIJJI, Boolean.TRUE);
                }
                if (((C68272Qqq) c68294QrC.LJLILLLLZI).LJIJJLI() && ((C68272Qqq) c68294QrC.LJLILLLLZI).zzh) {
                    c1hq2.put(c68294QrC.LJIIJJI(), Boolean.TRUE);
                }
                if (((C68272Qqq) c68294QrC.LJLILLLLZI).LJIL()) {
                    YIN yin = c68294QrC.LJLILLLLZI;
                    if (((C68272Qqq) yin).zzi < 2 || ((C68272Qqq) yin).zzi > 65535) {
                        this.LIZ.LIZJ().LJIIIIZZ.LIZJ(c68294QrC.LJIIJJI(), Integer.valueOf(((C68272Qqq) c68294QrC.LJLILLLLZI).zzi), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c1hq3.put(c68294QrC.LJIIJJI(), Integer.valueOf(((C68272Qqq) c68294QrC.LJLILLLLZI).zzi));
                    }
                }
            }
        }
        this.LJ.put(str, hashSet);
        this.LJFF.put(str, c1hq);
        this.LJI.put(str, c1hq2);
        this.LJIIIIZZ.put(str, c1hq3);
    }

    public final void LJIIL(final String str, C68256Qqa c68256Qqa) {
        if (c68256Qqa.zzn.size() != 0) {
            this.LIZ.LIZJ().LJIILIIL.LIZIZ(Integer.valueOf(c68256Qqa.zzn.size()), "EES programs found");
            C68334Qrq c68334Qrq = (C68334Qrq) ListProtector.get(c68256Qqa.zzn, 0);
            try {
                C68340Qrw c68340Qrw = new C68340Qrw();
                ((HashMap) c68340Qrw.LIZ.LIZLLL.LIZ).put("internal.remoteConfig", new Callable() { // from class: X.Qra
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C68372QsS(new C77633UdR(C68244QqO.this, str));
                    }
                });
                ((HashMap) c68340Qrw.LIZ.LIZLLL.LIZ).put("internal.appMetadata", new Callable() { // from class: X.QrX
                    /* JADX WARN: Type inference failed for: r0v0, types: [X.Qqf] */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final C68244QqO c68244QqO = C68244QqO.this;
                        final String str2 = str;
                        return new C68360QsG(new Callable() { // from class: X.Qqf
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C68244QqO c68244QqO2 = C68244QqO.this;
                                String str3 = str2;
                                C68242QqM c68242QqM = c68244QqO2.LIZIZ.LIZJ;
                                C68241QqL.LJJIJIIJI(c68242QqM);
                                C68252QqW LJJIFFI = c68242QqM.LJJIFFI(str3);
                                HashMap LIZ = C45243HpH.LIZ("platform", "android", "package_name", str3);
                                c68244QqO2.LIZ.LJI.LJIIJ();
                                LIZ.put("gmp_version", 64000L);
                                if (LJJIFFI != null) {
                                    String LJJI = LJJIFFI.LJJI();
                                    if (LJJI != null) {
                                        LIZ.put("app_version", LJJI);
                                    }
                                    LIZ.put("app_version_int", Long.valueOf(LJJIFFI.LJIJI()));
                                    LJJIFFI.LIZ.LIZIZ().LJFF();
                                    LIZ.put("dynamite_version", Long.valueOf(LJJIFFI.LJIJI));
                                }
                                return LIZ;
                            }
                        });
                    }
                });
                ((HashMap) c68340Qrw.LIZ.LIZLLL.LIZ).put("internal.logger", new Callable() { // from class: X.QrY
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C68370QsQ(C68244QqO.this.LJIIJ);
                    }
                });
                c68340Qrw.LIZ(c68334Qrq);
                this.LJIIIZ.LIZJ(str, c68340Qrw);
                this.LIZ.LIZJ().LJIILIIL.LIZJ(str, Integer.valueOf(c68334Qrq.LJIJ().zze.size()), "EES program loaded for appId, activities");
                Iterator it = c68334Qrq.LJIJ().zze.iterator();
                while (it.hasNext()) {
                    this.LIZ.LIZJ().LJIILIIL.LIZIZ(((C68335Qrr) it.next()).zzf, "EES program activity");
                }
                return;
            } catch (C68319Qrb unused) {
                this.LIZ.LIZJ().LJFF.LIZIZ(str, "Failed to load EES program. appId");
                return;
            }
        }
        this.LJIIIZ.LIZLLL(str);
    }

    public final int LJIILJJIL(String str, String str2) {
        Integer num;
        LJFF();
        LJIIJJI(str);
        java.util.Map map = (java.util.Map) this.LJIIIIZZ.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean LJIJI(String str, String str2) {
        Boolean bool;
        LJFF();
        LJIIJJI(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        java.util.Map map = (java.util.Map) this.LJI.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LJIJJ(String str, String str2) {
        Boolean bool;
        LJFF();
        LJIIJJI(str);
        if ("1".equals(LJJIIZ(str, "measurement.upload.blacklist_internal")) && C68083Qnn.LJJJJ(str2)) {
            return true;
        }
        if ("1".equals(LJJIIZ(str, "measurement.upload.blacklist_public")) && C68083Qnn.LJJJJI(str2)) {
            return true;
        }
        java.util.Map map = (java.util.Map) this.LJFF.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.InterfaceC68064QnU
    public final String LJJIIZ(String str, String str2) {
        LJFF();
        LJIIJJI(str);
        java.util.Map map = (java.util.Map) this.LIZLLL.getOrDefault(str, null);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02c0, code lost:
    
        r16 = r9.zzh.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d4, code lost:
    
        if (r16.hasNext() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d6, code lost:
    
        r5 = (X.C68258Qqc) r16.next();
        r3.LJI();
        r3.LJFF();
        X.QH7.LJI(r26);
        X.QH7.LJIIIIZZ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ee, code lost:
    
        if (r5.zzg.isEmpty() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0319, code lost:
    
        r4 = r5.LJIIIIZZ();
        r10 = new android.content.ContentValues();
        r10.put("app_id", r26);
        r10.put("audience_id", java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0330, code lost:
    
        if (r5.LJJ() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0332, code lost:
    
        r0 = java.lang.Integer.valueOf(r5.zzf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0338, code lost:
    
        r10.put("filter_id", r0);
        r10.put("event_name", r5.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0346, code lost:
    
        if (r5.LJJI() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0348, code lost:
    
        r0 = java.lang.Boolean.valueOf(r5.zzm);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x034e, code lost:
    
        r10.put("session_scoped", r0);
        r10.put("data", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0367, code lost:
    
        if (r3.LJJI().insertWithOnConflict("event_filters", null, r10, 5) != (-1)) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0369, code lost:
    
        r3.LIZ.LIZJ().LJFF.LIZIZ(X.C67280Qaq.LJIIIZ(r26), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x037c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x037d, code lost:
    
        r3.LIZ.LIZJ().LJFF.LIZJ(X.C67280Qaq.LJIIIZ(r26), r9, "Error storing event filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03da, code lost:
    
        r3.LJI();
        r3.LJFF();
        X.QH7.LJI(r26);
        r11 = r3.LJJI();
        r11.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r26, java.lang.String.valueOf(r0)});
        r11.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r26, java.lang.String.valueOf(r0)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0355, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0357, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02f0, code lost:
    
        r11 = r3.LIZ.LIZJ().LJIIIIZZ;
        r9 = X.C67280Qaq.LJIIIZ(r26);
        r4 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0306, code lost:
    
        if (r5.LJJ() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0308, code lost:
    
        r0 = java.lang.Integer.valueOf(r5.zzf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x030e, code lost:
    
        r11.LIZLLL(r9, r4, java.lang.String.valueOf(r0), "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0317, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x038f, code lost:
    
        r16 = r9.zzg.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0399, code lost:
    
        if (r16.hasNext() == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x039b, code lost:
    
        r5 = (X.C68266Qqk) r16.next();
        r3.LJI();
        r3.LJFF();
        X.QH7.LJI(r26);
        X.QH7.LJIIIIZZ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b3, code lost:
    
        if (r5.zzg.isEmpty() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x040c, code lost:
    
        r4 = r5.LJIIIIZZ();
        r9 = new android.content.ContentValues();
        r9.put("app_id", r26);
        r9.put("audience_id", java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0423, code lost:
    
        if (r5.LJIL() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0425, code lost:
    
        r0 = java.lang.Integer.valueOf(r5.zzf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x042b, code lost:
    
        r9.put("filter_id", r0);
        r9.put("property_name", r5.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0439, code lost:
    
        if (r5.LJJ() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x043b, code lost:
    
        r0 = java.lang.Boolean.valueOf(r5.zzk);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0441, code lost:
    
        r9.put("session_scoped", r0);
        r9.put("data", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x045a, code lost:
    
        if (r3.LJJI().insertWithOnConflict("property_filters", null, r9, 5) != (-1)) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x045c, code lost:
    
        r3.LIZ.LIZJ().LJFF.LIZIZ(X.C67280Qaq.LJIIIZ(r26), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x046f, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0470, code lost:
    
        r3.LIZ.LIZJ().LJFF.LIZJ(X.C67280Qaq.LJIIIZ(r26), r9, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0448, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x044a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03b5, code lost:
    
        r11 = r3.LIZ.LIZJ().LJIIIIZZ;
        r9 = X.C67280Qaq.LJIIIZ(r26);
        r4 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03cb, code lost:
    
        if (r5.LJIL() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03cd, code lost:
    
        r0 = java.lang.Integer.valueOf(r5.zzf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03d3, code lost:
    
        r11.LIZLLL(r9, r4, java.lang.String.valueOf(r0), "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x040a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0291, code lost:
    
        r4 = r9.zzg.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x029b, code lost:
    
        if (r4.hasNext() == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02a7, code lost:
    
        if (((X.C68266Qqk) r4.next()).LJIL() != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02a9, code lost:
    
        r3.LIZ.LIZJ().LJIIIIZZ.LIZJ(X.C67280Qaq.LJIIIZ(r26), java.lang.Integer.valueOf(r0), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(java.lang.String r26, java.lang.String r27, java.lang.String r28, byte[] r29) {
        /*
            Method dump skipped, instructions count: 1557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68244QqO.LJIJJLI(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }
}
