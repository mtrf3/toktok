package com.ss.android.ugc.aweme.account.guestmode;

import X.C116484hg;
import X.C58096Mr6;
import X.OUD;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IGuestModeService;
import defpackage.t1;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class GuestModeServiceImpl implements IGuestModeService {
    public final Keva LIZ;
    public boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LJII() {
        this.LIZIZ = true;
    }

    public static IGuestModeService LJIIJJI() {
        Object LIZ = C58096Mr6.LIZ(IGuestModeService.class, false);
        if (LIZ != null) {
            return (IGuestModeService) LIZ;
        }
        if (C58096Mr6.LJLI == null) {
            synchronized (IGuestModeService.class) {
                if (C58096Mr6.LJLI == null) {
                    C58096Mr6.LJLI = new GuestModeServiceImpl();
                }
            }
        }
        return C58096Mr6.LJLI;
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final boolean LIZJ() {
        return this.LIZ.getBoolean("age_gate_consent_start", false);
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LIZLLL() {
        this.LIZ.storeBoolean("age_gate_consent_start", true);
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final boolean LJIIJ() {
        if (!this.LIZ.getBoolean("age_gate_consent_complete", false) || t1.LJI()) {
            return false;
        }
        return true;
    }

    public GuestModeServiceImpl() {
        Keva repo = Keva.getRepo("guest_mode");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LIZ = repo;
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final String LJFF() {
        if (!LJIIJ()) {
            return null;
        }
        String birthday = this.LIZ.getString("age_gate_consent_birthday", "");
        o.LJIIIIZZ(birthday, "birthday");
        if (birthday.length() == 0 || LJIIL()) {
            return null;
        }
        return birthday;
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LJIIIIZZ() {
        if (!LJIIJ()) {
            return;
        }
        a.LJIIL().LIZLLL(false);
        a.LJIIZILJ().LJIIIIZZ(new OUD(), 0);
    }

    public final boolean LJIIL() {
        if (System.currentTimeMillis() - this.LIZ.getLong("age_gate_consent_birthday_entry_time", 0L) > 432000000) {
            this.LIZ.erase("age_gate_consent_birthday");
            this.LIZ.erase("age_gate_consent_birthday_entry_time");
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final boolean LJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LJIIIZ() {
        LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LIZ(String str) {
        if (str.length() == 0) {
            return;
        }
        this.LIZ.storeString("age_gate_consent_birthday", str);
        this.LIZ.storeLong("age_gate_consent_birthday_entry_time", System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LIZIZ(String str) {
        this.LIZ.storeBoolean("age_gate_consent_complete", false);
        this.LIZ.storeBoolean("age_gate_consent_start", false);
        this.LIZ.erase("age_gate_consent_birthday");
        this.LIZ.erase("age_gate_consent_birthday_entry_time");
        this.LIZIZ = false;
        C116484hg.LIZ("enter_from", str, "exit_guest_mode");
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void LJI(Integer num) {
        String str;
        this.LIZ.storeBoolean("age_gate_consent_complete", true);
        if (num != null) {
            str = num.toString();
        } else {
            str = null;
        }
        C116484hg.LIZ("register_age_gate_action", str, "enter_guest_mode");
    }
}
